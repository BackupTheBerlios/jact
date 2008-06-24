package com.useit.jact.gui.iaxconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.IaxpeerImpl;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IaxpeerImpl;
//import com.useit.jact.model.dataModel.Iaxpeer;

/**
 * <p>
 * IaxpeerTableModel
 * </p>
 * Created : Fri Jan 06 13:19:05 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpeerTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class IaxpeerTableModel extends AbstractSimpleTableModel {

    // private Iaxpeer mIaxpeer;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "iaxpeername", "peertype", "callerid", "auth", "secret", "inkeys", "host",
            "defaultip", "context", "dbsecret", "setvar", "peercontext",
            "qualify", "trunk", "timezone", "regexten", "disallow", "allow",
            "mailbox", "accountcode", "outkey", "notransfer",
            "qualifysmoothing", "qualifyfreqok", "qualifyfreqnotok", };

    /**
     * standart konstruktor
     */
    public IaxpeerTableModel(String[] columnNames) {
        super();
        // mIaxpeer = new IaxpeerImpl();
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
        return 25;
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
        Iaxpeer aIaxpeer = (Iaxpeer) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIaxpeer.getIaxpeername();
        case 1:
            return aIaxpeer.getPeertype();
        case 2:
            return aIaxpeer.getCallerid();
        case 3:
            return aIaxpeer.getAuth();
        case 4:
            return aIaxpeer.getSecret();
        case 5:
            return aIaxpeer.getInkeys();
        case 6:
            return aIaxpeer.getHost();
        case 7:
            return aIaxpeer.getDefaultip();
        case 8:
            return aIaxpeer.getContext();
        case 9:
            return aIaxpeer.getDbsecret();
        case 10:
            return aIaxpeer.getSetvar();
        case 11:
            return aIaxpeer.getPeercontext();
        case 12:
            return aIaxpeer.getQualify();
        case 13:
            return aIaxpeer.getTrunk();
        case 14:
            return aIaxpeer.getTimezone();
        case 15:
            return aIaxpeer.getRegexten();
        case 16:
            return aIaxpeer.getDisallow();
        case 17:
            return aIaxpeer.getAllow();
        case 18:
            return aIaxpeer.getMailbox();
        case 19:
            return aIaxpeer.getAccountcode();
        case 20:
            return aIaxpeer.getOutkey();
        case 21:
            return aIaxpeer.getNotransfer();
        case 22:
            return aIaxpeer.getQualifysmoothing();
        case 23:
            return aIaxpeer.getQualifyfreqok();
        case 24:
            return aIaxpeer.getQualifyfreqnotok();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return PeerType.class;
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
            return PbxContext.class;
        case 9:
            return String.class;
        case 10:
            return String.class;
        case 11:
            return PbxContext.class;
        case 12:
            return Integer.class;
        case 13:
            return Boolean.class;
        case 14:
            return String.class;
        case 15:
            return String.class;
        case 16:
            return CodecsSet.class;
        case 17:
            return CodecsSet.class;
        case 18:
            return String.class;
        case 19:
            return String.class;
        case 20:
            return String.class;
        case 21:
            return Boolean.class;
        case 22:
            return Boolean.class;
        case 23:
            return Integer.class;
        case 24:
            return Integer.class;
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
     * gibt einen Iaxpeer zurück
     * 
     * @param row
     * @return Iaxpeer
     */
    public Iaxpeer getIaxpeer(int row) {
        return (Iaxpeer) list.get(row);
    } // end of getIaxpeer

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIaxpeer(row);
    }

    /**
     * fügt einen Iaxpeer hinzu
     * 
     * @param Iaxpeer
     *            aIaxpeer
     */
    public void addIaxpeer(Iaxpeer aIaxpeer) {
        list.add(aIaxpeer);
        fireTableDataChanged();
    } // end of addIaxpeer

    /**
     * gibt einen neuen Iaxpeer zurück
     * 
     * @return Iaxpeer
     */
    public Iaxpeer newIaxpeer() {
        return new IaxpeerImpl();
    } // end of newIaxpeer

    /**
     * enfernt einen Iaxpeer
     * 
     * @param aIaxpeer
     *            Iaxpeer
     */
    public void removeIaxpeer(Iaxpeer aIaxpeer) {
        int index = list.indexOf(aIaxpeer);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIaxpeer

    /**
     * läd die Iaxpeer nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIaxpeer(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Iaxpeer newIaxpeer = new IaxpeerImpl();
     * newIaxpeer.loadComplete(set); list.add(newIaxpeer); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIaxpeer
     */
}
