package com.useit.jact.gui.zaptelconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.ZaptelchannelsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZaptelchannelsImpl;
//import com.useit.jact.model.dataModel.Zaptelchannels;

/**
 * <p>
 * ZaptelchannelsTableModel
 * </p>
 * Created : Fri Jan 06 13:20:14 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelsTableModel.java,v 1.7
 *          2006/01/09 10:17:34 urs Exp $
 */
public class ZaptelchannelsTableModel extends AbstractSimpleTableModel {

    // private Zaptelchannels mZaptelchannels;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "device", "channellist", };

    /**
     * standart konstruktor
     */
    public ZaptelchannelsTableModel(String[] columnNames) {
        super();
        // mZaptelchannels = new ZaptelchannelsImpl();
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
        return 2;
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
        Zaptelchannels aZaptelchannels = (Zaptelchannels) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZaptelchannels.getDevice();
        case 1:
            return aZaptelchannels.getChannellist();

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
     * gibt einen Zaptelchannels zurück
     * 
     * @param row
     * @return Zaptelchannels
     */
    public Zaptelchannels getZaptelchannels(int row) {
        return (Zaptelchannels) list.get(row);
    } // end of getZaptelchannels

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZaptelchannels(row);
    }

    /**
     * fügt einen Zaptelchannels hinzu
     * 
     * @param Zaptelchannels
     *            aZaptelchannels
     */
    public void addZaptelchannels(Zaptelchannels aZaptelchannels) {
        list.add(aZaptelchannels);
        fireTableDataChanged();
    } // end of addZaptelchannels

    /**
     * gibt einen neuen Zaptelchannels zurück
     * 
     * @return Zaptelchannels
     */
    public Zaptelchannels newZaptelchannels() {
        return new ZaptelchannelsImpl();
    } // end of newZaptelchannels

    /**
     * enfernt einen Zaptelchannels
     * 
     * @param aZaptelchannels
     *            Zaptelchannels
     */
    public void removeZaptelchannels(Zaptelchannels aZaptelchannels) {
        int index = list.indexOf(aZaptelchannels);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZaptelchannels

    /**
     * läd die Zaptelchannels nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZaptelchannels(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zaptelchannels newZaptelchannels = new
     * ZaptelchannelsImpl(); newZaptelchannels.loadComplete(set);
     * list.add(newZaptelchannels); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZaptelchannels
     */
}
