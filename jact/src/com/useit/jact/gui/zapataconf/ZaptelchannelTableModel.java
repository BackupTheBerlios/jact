package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Signalling;
import com.useit.jact.model.zapataconf.Zaptelchannel;
import com.useit.jact.model.zapataconf.ZaptelchannelImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZaptelchannelImpl;
//import com.useit.jact.model.dataModel.Zaptelchannel;

/**
 * <p>
 * ZaptelchannelTableModel
 * </p>
 * Created : Fri Jan 06 13:23:08 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelTableModel.java,v 1.7 2006/01/09
 *          10:17:36 urs Exp $
 */
public class ZaptelchannelTableModel extends AbstractSimpleTableModel {

    // private Zaptelchannel mZaptelchannel;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "signalling", "context", "channel", };

    /**
     * standart konstruktor
     */
    public ZaptelchannelTableModel(String[] columnNames) {
        super();
        // mZaptelchannel = new ZaptelchannelImpl();
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
        return 3;
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
        Zaptelchannel aZaptelchannel = (Zaptelchannel) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZaptelchannel.getSignalling();
        case 1:
            return aZaptelchannel.getContext();
        case 2:
            return aZaptelchannel.getChannel();
        // case 3:return
        // DataClassRendere.displayString(aZaptelchannel.getAnalog_Handset_Features());
        // case 4:return
        // DataClassRendere.displayString(aZaptelchannel.getAnalog_Trunk_Features());
        // case 5:return
        // DataClassRendere.displayString(aZaptelchannel.getAudio_Quality_Tuning_Options());
        // case 6:return
        // DataClassRendere.displayString(aZaptelchannel.getCall_Logging_Options());
        // case 7:return
        // DataClassRendere.displayString(aZaptelchannel.getCaller_ID_Options());
        // case 8:return
        // DataClassRendere.displayString(aZaptelchannel.getISDN_PRI_Switch());
        // case 9:return
        // DataClassRendere.displayString(aZaptelchannel.getOther());
        // case 10:return
        // DataClassRendere.displayString(aZaptelchannel.getTiming_Parameters());

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Signalling.class;
        case 1:
            return PbxContext.class;
        case 2:
            return String.class;
        // case 3:return String.class;
        // case 4:return String.class;
        // case 5:return String.class;
        // case 6:return String.class;
        // case 7:return String.class;
        // case 8:return String.class;
        // case 9:return String.class;
        // case 10:return String.class;
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
     * gibt einen Zaptelchannel zurück
     * 
     * @param row
     * @return Zaptelchannel
     */
    public Zaptelchannel getZaptelchannel(int row) {
        return (Zaptelchannel) list.get(row);
    } // end of getZaptelchannel

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZaptelchannel(row);
    }

    /**
     * fügt einen Zaptelchannel hinzu
     * 
     * @param Zaptelchannel
     *            aZaptelchannel
     */
    public void addZaptelchannel(Zaptelchannel aZaptelchannel) {
        list.add(aZaptelchannel);
        fireTableDataChanged();
    } // end of addZaptelchannel

    /**
     * gibt einen neuen Zaptelchannel zurück
     * 
     * @return Zaptelchannel
     */
    public Zaptelchannel newZaptelchannel() {
        return new ZaptelchannelImpl();
    } // end of newZaptelchannel

    /**
     * enfernt einen Zaptelchannel
     * 
     * @param aZaptelchannel
     *            Zaptelchannel
     */
    public void removeZaptelchannel(Zaptelchannel aZaptelchannel) {
        int index = list.indexOf(aZaptelchannel);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZaptelchannel

    /**
     * läd die Zaptelchannel nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZaptelchannel(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zaptelchannel newZaptelchannel = new
     * ZaptelchannelImpl(); newZaptelchannel.loadComplete(set);
     * list.add(newZaptelchannel); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZaptelchannel
     */
}
