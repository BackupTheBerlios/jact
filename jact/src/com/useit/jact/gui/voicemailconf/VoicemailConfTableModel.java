package com.useit.jact.gui.voicemailconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.VoicemailConfImpl;
//import com.useit.jact.model.dataModel.VoicemailConf;

/**
 * <p>
 * VoicemailConfTableModel
 * </p>
 * Created : Fri Jan 13 20:29:37 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailConfTableModel.java,v 1.9 2006/01/14
 *          15:00:13 urs Exp $
 */
public class VoicemailConfTableModel extends AbstractSimpleTableModel {

    // private VoicemailConf mVoicemailConf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    };

    /**
     * standart konstruktor
     */
    public VoicemailConfTableModel(String[] columnNames) {
        super();
        // mVoicemailConf = new VoicemailConfImpl();
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
        VoicemailConf aVoicemailConf = (VoicemailConf) list.get(rowIndex);
        switch (columnIndex) {
        // case ${i}:return
        // DataClassRendere.displayString(aVoicemailConf.getVoicemailgeneral());

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        // case ${i}:return String.class;
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
     * gibt einen VoicemailConf zurück
     * 
     * @param row
     * @return VoicemailConf
     */
    public VoicemailConf getVoicemailConf(int row) {
        return (VoicemailConf) list.get(row);
    } // end of getVoicemailConf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getVoicemailConf(row);
    }

    /**
     * fügt einen VoicemailConf hinzu
     * 
     * @param VoicemailConf
     *            aVoicemailConf
     */
    public void addVoicemailConf(VoicemailConf aVoicemailConf) {
        list.add(aVoicemailConf);
        fireTableDataChanged();
    } // end of addVoicemailConf

    /**
     * gibt einen neuen VoicemailConf zurück
     * 
     * @return VoicemailConf
     */
    public VoicemailConf newVoicemailConf() {
        return new VoicemailConfImpl();
    } // end of newVoicemailConf

    /**
     * enfernt einen VoicemailConf
     * 
     * @param aVoicemailConf
     *            VoicemailConf
     */
    public void removeVoicemailConf(VoicemailConf aVoicemailConf) {
        int index = list.indexOf(aVoicemailConf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeVoicemailConf

    /**
     * läd die VoicemailConf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadVoicemailConf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { VoicemailConf newVoicemailConf = new
     * VoicemailConfImpl(); newVoicemailConf.loadComplete(set);
     * list.add(newVoicemailConf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadVoicemailConf
     */
}
