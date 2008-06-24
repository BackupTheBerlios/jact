package com.useit.jact.gui.zaptelconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZaptelconfImpl;
//import com.useit.jact.model.dataModel.Zaptelconf;

/**
 * <p>
 * ZaptelconfTableModel
 * </p>
 * Created : Fri Jan 06 13:20:30 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelconfTableModel.java,v 1.7 2006/01/09
 *          10:17:34 urs Exp $
 */
public class ZaptelconfTableModel extends AbstractSimpleTableModel {

    // private Zaptelconf mZaptelconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "defaultzone", };

    /**
     * standart konstruktor
     */
    public ZaptelconfTableModel(String[] columnNames) {
        super();
        // mZaptelconf = new ZaptelconfImpl();
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
        Zaptelconf aZaptelconf = (Zaptelconf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZaptelconf.getDefaultzone();

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
     * gibt einen Zaptelconf zurück
     * 
     * @param row
     * @return Zaptelconf
     */
    public Zaptelconf getZaptelconf(int row) {
        return (Zaptelconf) list.get(row);
    } // end of getZaptelconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZaptelconf(row);
    }

    /**
     * fügt einen Zaptelconf hinzu
     * 
     * @param Zaptelconf
     *            aZaptelconf
     */
    public void addZaptelconf(Zaptelconf aZaptelconf) {
        list.add(aZaptelconf);
        fireTableDataChanged();
    } // end of addZaptelconf

    /**
     * gibt einen neuen Zaptelconf zurück
     * 
     * @return Zaptelconf
     */
    public Zaptelconf newZaptelconf() {
        return new ZaptelconfImpl();
    } // end of newZaptelconf

    /**
     * enfernt einen Zaptelconf
     * 
     * @param aZaptelconf
     *            Zaptelconf
     */
    public void removeZaptelconf(Zaptelconf aZaptelconf) {
        int index = list.indexOf(aZaptelconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZaptelconf

    /**
     * läd die Zaptelconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZaptelconf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zaptelconf newZaptelconf = new ZaptelconfImpl();
     * newZaptelconf.loadComplete(set); list.add(newZaptelconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZaptelconf
     */
}
