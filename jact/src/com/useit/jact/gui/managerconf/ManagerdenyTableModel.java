package com.useit.jact.gui.managerconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagerdenyImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ManagerdenyImpl;
//import com.useit.jact.model.dataModel.Managerdeny;

/**
 * <p>
 * ManagerdenyTableModel
 * </p>
 * Created : Fri Jan 06 13:21:34 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerdenyTableModel.java,v 1.4 2006/01/09
 *          10:17:33 urs Exp $
 */
public class ManagerdenyTableModel extends AbstractSimpleTableModel {

    // private Managerdeny mManagerdeny;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "value", };

    /**
     * standart konstruktor
     */
    public ManagerdenyTableModel(String[] columnNames) {
        super();
        // mManagerdeny = new ManagerdenyImpl();
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
        Managerdeny aManagerdeny = (Managerdeny) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aManagerdeny.getValue();

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
     * gibt einen Managerdeny zurück
     * 
     * @param row
     * @return Managerdeny
     */
    public Managerdeny getManagerdeny(int row) {
        return (Managerdeny) list.get(row);
    } // end of getManagerdeny

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getManagerdeny(row);
    }

    /**
     * fügt einen Managerdeny hinzu
     * 
     * @param Managerdeny
     *            aManagerdeny
     */
    public void addManagerdeny(Managerdeny aManagerdeny) {
        list.add(aManagerdeny);
        fireTableDataChanged();
    } // end of addManagerdeny

    /**
     * gibt einen neuen Managerdeny zurück
     * 
     * @return Managerdeny
     */
    public Managerdeny newManagerdeny() {
        return new ManagerdenyImpl();
    } // end of newManagerdeny

    /**
     * enfernt einen Managerdeny
     * 
     * @param aManagerdeny
     *            Managerdeny
     */
    public void removeManagerdeny(Managerdeny aManagerdeny) {
        int index = list.indexOf(aManagerdeny);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeManagerdeny

    /**
     * läd die Managerdeny nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadManagerdeny(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Managerdeny newManagerdeny = new ManagerdenyImpl();
     * newManagerdeny.loadComplete(set); list.add(newManagerdeny); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadManagerdeny
     */
}
