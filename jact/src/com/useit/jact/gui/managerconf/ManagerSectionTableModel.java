package com.useit.jact.gui.managerconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.ManagerSectionImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ManagerSectionImpl;
//import com.useit.jact.model.dataModel.ManagerSection;

/**
 * <p>
 * ManagerSectionTableModel
 * </p>
 * Created : Fri Jan 06 13:21:31 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerSectionTableModel.java,v 1.9
 *          2006/01/09 10:17:33 urs Exp $
 */
public class ManagerSectionTableModel extends AbstractSimpleTableModel {

    // private ManagerSection mManagerSection;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "username", "secret", "read", "write", };

    /**
     * standart konstruktor
     */
    public ManagerSectionTableModel(String[] columnNames) {
        super();
        // mManagerSection = new ManagerSectionImpl();
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
        return 4;
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
        ManagerSection aManagerSection = (ManagerSection) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aManagerSection.getUsername();
        case 1:
            return aManagerSection.getSecret();
        case 2:
            return aManagerSection.getRead();
        case 3:
            return aManagerSection.getWrite();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return String.class;
        case 2:
            return String.class;
        case 3:
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
     * gibt einen ManagerSection zurück
     * 
     * @param row
     * @return ManagerSection
     */
    public ManagerSection getManagerSection(int row) {
        return (ManagerSection) list.get(row);
    } // end of getManagerSection

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getManagerSection(row);
    }

    /**
     * fügt einen ManagerSection hinzu
     * 
     * @param ManagerSection
     *            aManagerSection
     */
    public void addManagerSection(ManagerSection aManagerSection) {
        list.add(aManagerSection);
        fireTableDataChanged();
    } // end of addManagerSection

    /**
     * gibt einen neuen ManagerSection zurück
     * 
     * @return ManagerSection
     */
    public ManagerSection newManagerSection() {
        return new ManagerSectionImpl();
    } // end of newManagerSection

    /**
     * enfernt einen ManagerSection
     * 
     * @param aManagerSection
     *            ManagerSection
     */
    public void removeManagerSection(ManagerSection aManagerSection) {
        int index = list.indexOf(aManagerSection);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeManagerSection

    /**
     * läd die ManagerSection nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadManagerSection(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { ManagerSection newManagerSection = new
     * ManagerSectionImpl(); newManagerSection.loadComplete(set);
     * list.add(newManagerSection); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadManagerSection
     */
}
