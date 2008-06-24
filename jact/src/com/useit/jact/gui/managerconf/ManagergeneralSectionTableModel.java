package com.useit.jact.gui.managerconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.ManagergeneralSectionImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ManagergeneralSectionImpl;
//import com.useit.jact.model.dataModel.ManagergeneralSection;

/**
 * <p>
 * ManagergeneralSectionTableModel
 * </p>
 * Created : Fri Jan 06 13:21:45 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagergeneralSectionTableModel.java,v 1.4
 *          2006/01/09 10:17:33 urs Exp $
 */
public class ManagergeneralSectionTableModel extends AbstractSimpleTableModel {

    // private ManagergeneralSection mManagergeneralSection;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "generalid", "enabled", "portno", "bindaddr", "port", "fileid", };

    /**
     * standart konstruktor
     */
    public ManagergeneralSectionTableModel(String[] columnNames) {
        super();
        // mManagergeneralSection = new ManagergeneralSectionImpl();
        // this.con = con;
        if (columnNames != null)
            this.columnNames = columnNames;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getColumnCount()
     */
    public int getColumnCount() {
        return 6;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return list.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        ManagergeneralSection aManagergeneralSection = (ManagergeneralSection) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aManagergeneralSection.getGeneralid();
        case 1:
            return aManagergeneralSection.getEnabled();
        case 2:
            return aManagergeneralSection.getPortno();
        case 3:
            return aManagergeneralSection.getBindaddr();
        case 4:
            return aManagergeneralSection.getPort();
        case 5:
            return aManagergeneralSection.getFileid();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return Boolean.class;
        case 2:
            return Integer.class;
        case 3:
            return String.class;
        case 4:
            return Integer.class;
        case 5:
            return String.class;
        default:
            return null;
        } // end of switch

    }

    /**
     * Returns the column name. This is used to initialize the given column's
     * header name
     */
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    /**
     * setz die Map von außen
     */
    public void setNewList(Map aMap) {
        list.clear();
        list.addAll(aMap.values());
        fireTableDataChanged();

    }

    /**
     * gibt einen ManagergeneralSection zurück
     * 
     * @param row
     * @return ManagergeneralSection
     */
    public ManagergeneralSection getManagergeneralSection(int row) {
        return (ManagergeneralSection) list.get(row);
    } // end of getManagergeneralSection

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getManagergeneralSection(row);
    }

    /**
     * fügt einen ManagergeneralSection hinzu
     * 
     * @param ManagergeneralSection
     *            aManagergeneralSection
     */
    public void addManagergeneralSection(
            ManagergeneralSection aManagergeneralSection) {
        list.add(aManagergeneralSection);
        fireTableDataChanged();
    } // end of addManagergeneralSection

    /**
     * gibt einen neuen ManagergeneralSection zurück
     * 
     * @return ManagergeneralSection
     */
    public ManagergeneralSection newManagergeneralSection() {
        return new ManagergeneralSectionImpl();
    } // end of newManagergeneralSection

    /**
     * enfernt einen ManagergeneralSection
     * 
     * @param aManagergeneralSection
     *            ManagergeneralSection
     */
    public void removeManagergeneralSection(
            ManagergeneralSection aManagergeneralSection) {
        int index = list.indexOf(aManagergeneralSection);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeManagergeneralSection

    /**
     * läd die ManagergeneralSection nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadManagergeneralSection(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { ManagergeneralSection newManagergeneralSection = new
     * ManagergeneralSectionImpl(); newManagergeneralSection.loadComplete(set);
     * list.add(newManagergeneralSection); }
     * 
     * //end of while fireTableDataChanged(); } // end of
     * loadManagergeneralSection
     */
}
