package com.useit.jact.gui.voicemailconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.VoicemailgeneralImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.VoicemailgeneralImpl;
//import com.useit.jact.model.dataModel.Voicemailgeneral;

/**
 * <p>
 * VoicemailgeneralTableModel
 * </p>
 * Created : Fri Jan 13 20:29:36 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailgeneralTableModel.java,v 1.8
 *          2006/01/14 15:00:12 urs Exp $
 */
public class VoicemailgeneralTableModel extends AbstractSimpleTableModel {

    // private Voicemailgeneral mVoicemailgeneral;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "attach", "delete", "mailcmd", "maxsilence", "envelope", "externnotify",
            "silencethreshold", "serveremail", "maxmessage", "minmessage",
            "format", "maxgreet", "skipms", "maxlogins", "cidinternalcontexts",
            "review", "operator", "saycid", "dialout", "callback", "dbuser",
            "dbpass", "dbhost", "dbname", "dboption", "pbxskip", "fromstring",
            "emailsubject", "emailbody", "exitcontext", "nextaftercmd", };

    /**
     * standart konstruktor
     */
    public VoicemailgeneralTableModel(String[] columnNames) {
        super();
        // mVoicemailgeneral = new VoicemailgeneralImpl();
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
        return 31;
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
        Voicemailgeneral aVoicemailgeneral = (Voicemailgeneral) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aVoicemailgeneral.getAttach();
        case 1:
            return aVoicemailgeneral.getDelete();
        case 2:
            return aVoicemailgeneral.getMailcmd();
        case 3:
            return aVoicemailgeneral.getMaxsilence();
        case 4:
            return aVoicemailgeneral.getEnvelope();
        case 5:
            return aVoicemailgeneral.getExternnotify();
        case 6:
            return aVoicemailgeneral.getSilencethreshold();
        case 7:
            return aVoicemailgeneral.getServeremail();
        case 8:
            return aVoicemailgeneral.getMaxmessage();
        case 9:
            return aVoicemailgeneral.getMinmessage();
        case 10:
            return aVoicemailgeneral.getFormat();
        case 11:
            return aVoicemailgeneral.getMaxgreet();
        case 12:
            return aVoicemailgeneral.getSkipms();
        case 13:
            return aVoicemailgeneral.getMaxlogins();
        case 14:
            return aVoicemailgeneral.getCidinternalcontexts();
        case 15:
            return aVoicemailgeneral.getReview();
        case 16:
            return aVoicemailgeneral.getOperator();
        case 17:
            return aVoicemailgeneral.getSaycid();
        case 18:
            return aVoicemailgeneral.getDialout();
        case 19:
            return aVoicemailgeneral.getCallback();
        case 20:
            return aVoicemailgeneral.getDbuser();
        case 21:
            return aVoicemailgeneral.getDbpass();
        case 22:
            return aVoicemailgeneral.getDbhost();
        case 23:
            return aVoicemailgeneral.getDbname();
        case 24:
            return aVoicemailgeneral.getDboption();
        case 25:
            return aVoicemailgeneral.getPbxskip();
        case 26:
            return aVoicemailgeneral.getFromstring();
        case 27:
            return aVoicemailgeneral.getEmailsubject();
        case 28:
            return aVoicemailgeneral.getEmailbody();
        case 29:
            return aVoicemailgeneral.getExitcontext();
        case 30:
            return aVoicemailgeneral.getNextaftercmd();

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
            return String.class;
        case 3:
            return String.class;
        case 4:
            return String.class;
        case 5:
            return String.class;
        case 6:
            return String.class;
        case 7:
            return String.class;
        case 8:
            return String.class;
        case 9:
            return String.class;
        case 10:
            return String.class;
        case 11:
            return String.class;
        case 12:
            return String.class;
        case 13:
            return String.class;
        case 14:
            return String.class;
        case 15:
            return Boolean.class;
        case 16:
            return Boolean.class;
        case 17:
            return Boolean.class;
        case 18:
            return String.class;
        case 19:
            return String.class;
        case 20:
            return String.class;
        case 21:
            return String.class;
        case 22:
            return String.class;
        case 23:
            return String.class;
        case 24:
            return String.class;
        case 25:
            return String.class;
        case 26:
            return String.class;
        case 27:
            return String.class;
        case 28:
            return String.class;
        case 29:
            return String.class;
        case 30:
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
     * gibt einen Voicemailgeneral zurück
     * 
     * @param row
     * @return Voicemailgeneral
     */
    public Voicemailgeneral getVoicemailgeneral(int row) {
        return (Voicemailgeneral) list.get(row);
    } // end of getVoicemailgeneral

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getVoicemailgeneral(row);
    }

    /**
     * fügt einen Voicemailgeneral hinzu
     * 
     * @param Voicemailgeneral
     *            aVoicemailgeneral
     */
    public void addVoicemailgeneral(Voicemailgeneral aVoicemailgeneral) {
        list.add(aVoicemailgeneral);
        fireTableDataChanged();
    } // end of addVoicemailgeneral

    /**
     * gibt einen neuen Voicemailgeneral zurück
     * 
     * @return Voicemailgeneral
     */
    public Voicemailgeneral newVoicemailgeneral() {
        return new VoicemailgeneralImpl();
    } // end of newVoicemailgeneral

    /**
     * enfernt einen Voicemailgeneral
     * 
     * @param aVoicemailgeneral
     *            Voicemailgeneral
     */
    public void removeVoicemailgeneral(Voicemailgeneral aVoicemailgeneral) {
        int index = list.indexOf(aVoicemailgeneral);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeVoicemailgeneral

    /**
     * läd die Voicemailgeneral nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadVoicemailgeneral(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Voicemailgeneral newVoicemailgeneral = new
     * VoicemailgeneralImpl(); newVoicemailgeneral.loadComplete(set);
     * list.add(newVoicemailgeneral); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadVoicemailgeneral
     */
}
