package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_OptionsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Audio_Quality_Tuning_OptionsImpl;
//import com.useit.jact.model.dataModel.Audio_Quality_Tuning_Options;

/**
 * <p>
 * Audio_Quality_Tuning_OptionsTableModel
 * </p>
 * Created : Fri Jan 06 13:23:03 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Audio_Quality_Tuning_OptionsTableModel.java,v
 *          1.7 2006/01/09 10:17:36 urs Exp $
 */
public class Audio_Quality_Tuning_OptionsTableModel extends
        AbstractSimpleTableModel {

    // private Audio_Quality_Tuning_Options mAudio_Quality_Tuning_Options;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "relaxdtmf", "echocancel", "echocancelwhenbridged", "echotraining",
            "rxgain", "txgain", };

    /**
     * standart konstruktor
     */
    public Audio_Quality_Tuning_OptionsTableModel(String[] columnNames) {
        super();
        // mAudio_Quality_Tuning_Options = new
        // Audio_Quality_Tuning_OptionsImpl();
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
        Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options = (Audio_Quality_Tuning_Options) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAudio_Quality_Tuning_Options.getRelaxdtmf();
        case 1:
            return aAudio_Quality_Tuning_Options.getEchocancel();
        case 2:
            return aAudio_Quality_Tuning_Options.getEchocancelwhenbridged();
        case 3:
            return aAudio_Quality_Tuning_Options.getEchotraining();
        case 4:
            return aAudio_Quality_Tuning_Options.getRxgain();
        case 5:
            return aAudio_Quality_Tuning_Options.getTxgain();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Boolean.class;
        case 1:
            return Boolean.class;
        case 2:
            return Boolean.class;
        case 3:
            return Boolean.class;
        case 4:
            return Float.class;
        case 5:
            return Float.class;
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
     * gibt einen Audio_Quality_Tuning_Options zurück
     * 
     * @param row
     * @return Audio_Quality_Tuning_Options
     */
    public Audio_Quality_Tuning_Options getAudio_Quality_Tuning_Options(int row) {
        return (Audio_Quality_Tuning_Options) list.get(row);
    } // end of getAudio_Quality_Tuning_Options

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAudio_Quality_Tuning_Options(row);
    }

    /**
     * fügt einen Audio_Quality_Tuning_Options hinzu
     * 
     * @param Audio_Quality_Tuning_Options
     *            aAudio_Quality_Tuning_Options
     */
    public void addAudio_Quality_Tuning_Options(
            Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options) {
        list.add(aAudio_Quality_Tuning_Options);
        fireTableDataChanged();
    } // end of addAudio_Quality_Tuning_Options

    /**
     * gibt einen neuen Audio_Quality_Tuning_Options zurück
     * 
     * @return Audio_Quality_Tuning_Options
     */
    public Audio_Quality_Tuning_Options newAudio_Quality_Tuning_Options() {
        return new Audio_Quality_Tuning_OptionsImpl();
    } // end of newAudio_Quality_Tuning_Options

    /**
     * enfernt einen Audio_Quality_Tuning_Options
     * 
     * @param aAudio_Quality_Tuning_Options
     *            Audio_Quality_Tuning_Options
     */
    public void removeAudio_Quality_Tuning_Options(
            Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options) {
        int index = list.indexOf(aAudio_Quality_Tuning_Options);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAudio_Quality_Tuning_Options

    /**
     * läd die Audio_Quality_Tuning_Options nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAudio_Quality_Tuning_Options(String sql) throws
     * SQLException, Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Audio_Quality_Tuning_Options
     * newAudio_Quality_Tuning_Options = new Audio_Quality_Tuning_OptionsImpl();
     * newAudio_Quality_Tuning_Options.loadComplete(set);
     * list.add(newAudio_Quality_Tuning_Options); }
     * 
     * //end of while fireTableDataChanged(); } // end of
     * loadAudio_Quality_Tuning_Options
     */
}
