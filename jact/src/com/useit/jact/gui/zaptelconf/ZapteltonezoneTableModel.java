package com.useit.jact.gui.zaptelconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zaptelconf.Zapteltonezone;
import com.useit.jact.model.zaptelconf.ZapteltonezoneImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZapteltonezoneImpl;
//import com.useit.jact.model.dataModel.Zapteltonezone;

/**
 * <p>
 * ZapteltonezoneTableModel
 * </p>
 * Created : Fri Jan 06 13:20:19 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteltonezoneTableModel.java,v 1.7
 *          2006/01/09 10:17:34 urs Exp $
 */
public class ZapteltonezoneTableModel extends AbstractSimpleTableModel {

    // private Zapteltonezone mZapteltonezone;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "zonename", };

    /**
     * standart konstruktor
     */
    public ZapteltonezoneTableModel(String[] columnNames) {
        super();
        // mZapteltonezone = new ZapteltonezoneImpl();
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
        Zapteltonezone aZapteltonezone = (Zapteltonezone) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZapteltonezone.getZonename();

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
     * gibt einen Zapteltonezone zurück
     * 
     * @param row
     * @return Zapteltonezone
     */
    public Zapteltonezone getZapteltonezone(int row) {
        return (Zapteltonezone) list.get(row);
    } // end of getZapteltonezone

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZapteltonezone(row);
    }

    /**
     * fügt einen Zapteltonezone hinzu
     * 
     * @param Zapteltonezone
     *            aZapteltonezone
     */
    public void addZapteltonezone(Zapteltonezone aZapteltonezone) {
        list.add(aZapteltonezone);
        fireTableDataChanged();
    } // end of addZapteltonezone

    /**
     * gibt einen neuen Zapteltonezone zurück
     * 
     * @return Zapteltonezone
     */
    public Zapteltonezone newZapteltonezone() {
        return new ZapteltonezoneImpl();
    } // end of newZapteltonezone

    /**
     * enfernt einen Zapteltonezone
     * 
     * @param aZapteltonezone
     *            Zapteltonezone
     */
    public void removeZapteltonezone(Zapteltonezone aZapteltonezone) {
        int index = list.indexOf(aZapteltonezone);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZapteltonezone

    /**
     * läd die Zapteltonezone nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZapteltonezone(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zapteltonezone newZapteltonezone = new
     * ZapteltonezoneImpl(); newZapteltonezone.loadComplete(set);
     * list.add(newZapteltonezone); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZapteltonezone
     */
}
