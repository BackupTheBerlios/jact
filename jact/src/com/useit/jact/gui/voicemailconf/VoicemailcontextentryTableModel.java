package com.useit.jact.gui.voicemailconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.VoicemailcontextentryImpl;
//import com.useit.jact.model.dataModel.Voicemailcontextentry;

/**
 * <p>
 * VoicemailcontextentryTableModel
 * </p>
 * Created : Fri Jan 13 20:29:38 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextentryTableModel.java,v 1.8
 *          2006/01/14 15:00:13 urs Exp $
 */
public class VoicemailcontextentryTableModel extends AbstractSimpleTableModel {

    // private Voicemailcontextentry mVoicemailcontextentry;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "mailbox", "voicemail_password", "user_name", "user_email_address",
            "pager_email_address", "user_options", };

    /**
     * standart konstruktor
     */
    public VoicemailcontextentryTableModel(String[] columnNames) {
        super();
        // mVoicemailcontextentry = new VoicemailcontextentryImpl();
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
        Voicemailcontextentry aVoicemailcontextentry = (Voicemailcontextentry) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aVoicemailcontextentry.getMailbox();
        case 1:
            return aVoicemailcontextentry.getVoicemail_password();
        case 2:
            return aVoicemailcontextentry.getUser_name();
        case 3:
            return aVoicemailcontextentry.getUser_email_address();
        case 4:
            return aVoicemailcontextentry.getPager_email_address();
        case 5:
            return aVoicemailcontextentry.getUser_options();

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
        case 4:
            return String.class;
        case 5:
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
     * gibt einen Voicemailcontextentry zurück
     * 
     * @param row
     * @return Voicemailcontextentry
     */
    public Voicemailcontextentry getVoicemailcontextentry(int row) {
        return (Voicemailcontextentry) list.get(row);
    } // end of getVoicemailcontextentry

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getVoicemailcontextentry(row);
    }

    /**
     * fügt einen Voicemailcontextentry hinzu
     * 
     * @param Voicemailcontextentry
     *            aVoicemailcontextentry
     */
    public void addVoicemailcontextentry(
            Voicemailcontextentry aVoicemailcontextentry) {
        list.add(aVoicemailcontextentry);
        fireTableDataChanged();
    } // end of addVoicemailcontextentry

    /**
     * gibt einen neuen Voicemailcontextentry zurück
     * 
     * @return Voicemailcontextentry
     */
    public Voicemailcontextentry newVoicemailcontextentry() {
        return new VoicemailcontextentryImpl();
    } // end of newVoicemailcontextentry

    /**
     * enfernt einen Voicemailcontextentry
     * 
     * @param aVoicemailcontextentry
     *            Voicemailcontextentry
     */
    public void removeVoicemailcontextentry(
            Voicemailcontextentry aVoicemailcontextentry) {
        int index = list.indexOf(aVoicemailcontextentry);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeVoicemailcontextentry

    /**
     * läd die Voicemailcontextentry nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadVoicemailcontextentry(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Voicemailcontextentry newVoicemailcontextentry = new
     * VoicemailcontextentryImpl(); newVoicemailcontextentry.loadComplete(set);
     * list.add(newVoicemailcontextentry); }
     * 
     * //end of while fireTableDataChanged(); } // end of
     * loadVoicemailcontextentry
     */
}
