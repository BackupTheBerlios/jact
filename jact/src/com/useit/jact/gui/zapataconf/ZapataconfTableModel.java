package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.ZapataconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZapataconfImpl;
//import com.useit.jact.model.dataModel.Zapataconf;

/**
 * <p>
 * ZapataconfTableModel
 * </p>
 * Created : Fri Jan 06 13:23:21 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapataconfTableModel.java,v 1.7 2006/01/09
 *          10:17:36 urs Exp $
 */
public class ZapataconfTableModel extends AbstractSimpleTableModel {

    // private Zapataconf mZapataconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    };

    /**
     * standart konstruktor
     */
    public ZapataconfTableModel(String[] columnNames) {
        super();
        // mZapataconf = new ZapataconfImpl();
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
        return 0;
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
        Zapataconf aZapataconf = (Zapataconf) list.get(rowIndex);
        switch (columnIndex) {

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
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
     * gibt einen Zapataconf zurück
     * 
     * @param row
     * @return Zapataconf
     */
    public Zapataconf getZapataconf(int row) {
        return (Zapataconf) list.get(row);
    } // end of getZapataconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZapataconf(row);
    }

    /**
     * fügt einen Zapataconf hinzu
     * 
     * @param Zapataconf
     *            aZapataconf
     */
    public void addZapataconf(Zapataconf aZapataconf) {
        list.add(aZapataconf);
        fireTableDataChanged();
    } // end of addZapataconf

    /**
     * gibt einen neuen Zapataconf zurück
     * 
     * @return Zapataconf
     */
    public Zapataconf newZapataconf() {
        return new ZapataconfImpl();
    } // end of newZapataconf

    /**
     * enfernt einen Zapataconf
     * 
     * @param aZapataconf
     *            Zapataconf
     */
    public void removeZapataconf(Zapataconf aZapataconf) {
        int index = list.indexOf(aZapataconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZapataconf

    /**
     * läd die Zapataconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZapataconf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zapataconf newZapataconf = new ZapataconfImpl();
     * newZapataconf.loadComplete(set); list.add(newZapataconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZapataconf
     */
}
