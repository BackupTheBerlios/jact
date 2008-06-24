package com.useit.jact.gui.managerconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.managerconf.Managerpermit;
import com.useit.jact.model.managerconf.ManagerpermitImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ManagerpermitImpl;
//import com.useit.jact.model.dataModel.Managerpermit;

/**
 * <p>
 * ManagerpermitTableModel
 * </p>
 * Created : Fri Jan 06 13:21:39 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerpermitTableModel.java,v 1.4 2006/01/09
 *          10:17:33 urs Exp $
 */
public class ManagerpermitTableModel extends AbstractSimpleTableModel {

    // private Managerpermit mManagerpermit;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "value", };

    /**
     * standart konstruktor
     */
    public ManagerpermitTableModel(String[] columnNames) {
        super();
        // mManagerpermit = new ManagerpermitImpl();
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
        return 1;
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
        Managerpermit aManagerpermit = (Managerpermit) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aManagerpermit.getValue();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
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
     * gibt einen Managerpermit zurück
     * 
     * @param row
     * @return Managerpermit
     */
    public Managerpermit getManagerpermit(int row) {
        return (Managerpermit) list.get(row);
    } // end of getManagerpermit

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getManagerpermit(row);
    }

    /**
     * fügt einen Managerpermit hinzu
     * 
     * @param Managerpermit
     *            aManagerpermit
     */
    public void addManagerpermit(Managerpermit aManagerpermit) {
        list.add(aManagerpermit);
        fireTableDataChanged();
    } // end of addManagerpermit

    /**
     * gibt einen neuen Managerpermit zurück
     * 
     * @return Managerpermit
     */
    public Managerpermit newManagerpermit() {
        return new ManagerpermitImpl();
    } // end of newManagerpermit

    /**
     * enfernt einen Managerpermit
     * 
     * @param aManagerpermit
     *            Managerpermit
     */
    public void removeManagerpermit(Managerpermit aManagerpermit) {
        int index = list.indexOf(aManagerpermit);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeManagerpermit

    /**
     * läd die Managerpermit nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadManagerpermit(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Managerpermit newManagerpermit = new
     * ManagerpermitImpl(); newManagerpermit.loadComplete(set);
     * list.add(newManagerpermit); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadManagerpermit
     */
}
