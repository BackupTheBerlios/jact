package com.useit.jact.gui.iaxconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IaxgeneralImpl;
//import com.useit.jact.model.dataModel.Iaxgeneral;

/**
 * <p>
 * IaxgeneralTableModel
 * </p>
 * Created : Fri Jan 06 13:19:09 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxgeneralTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class IaxgeneralTableModel extends AbstractSimpleTableModel {

    // private Iaxgeneral mIaxgeneral;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "bindport", "bindaddr", "iaxcompat", "nochecksums", "delayreject",
            "amaflags", "accountcode", "language", "bandwidth",
            "trunktimestamps", "authdebug", "tos", "mailboxdetail",
            "regcontext", "autokill", "codecpriority", "rtcachefriends",
            "rtupdate", "rtautoclear", "rtignoreexpire", "trunkfreq",
            "disallow", "allow", "minregexpire", "maxregexpire", "notransfer", };

    /**
     * standart konstruktor
     */
    public IaxgeneralTableModel(String[] columnNames) {
        super();
        // mIaxgeneral = new IaxgeneralImpl();
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
        return 26;
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
        Iaxgeneral aIaxgeneral = (Iaxgeneral) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIaxgeneral.getBindport();
        case 1:
            return aIaxgeneral.getBindaddr();
        case 2:
            return aIaxgeneral.getIaxcompat();
        case 3:
            return aIaxgeneral.getNochecksums();
        case 4:
            return aIaxgeneral.getDelayreject();
        case 5:
            return aIaxgeneral.getAmaflags();
        case 6:
            return aIaxgeneral.getAccountcode();
        case 7:
            return aIaxgeneral.getLanguage();
        case 8:
            return aIaxgeneral.getBandwidth();
        case 9:
            return aIaxgeneral.getTrunktimestamps();
        case 10:
            return aIaxgeneral.getAuthdebug();
        case 11:
            return aIaxgeneral.getTos();
        case 12:
            return aIaxgeneral.getMailboxdetail();
        case 13:
            return aIaxgeneral.getRegcontext();
        case 14:
            return aIaxgeneral.getAutokill();
        case 15:
            return aIaxgeneral.getCodecpriority();
        case 16:
            return aIaxgeneral.getRtcachefriends();
        case 17:
            return aIaxgeneral.getRtupdate();
        case 18:
            return aIaxgeneral.getRtautoclear();
        case 19:
            return aIaxgeneral.getRtignoreexpire();
        case 20:
            return aIaxgeneral.getTrunkfreq();
        case 21:
            return aIaxgeneral.getDisallow();
        case 22:
            return aIaxgeneral.getAllow();
        case 23:
            return aIaxgeneral.getMinregexpire();
        case 24:
            return aIaxgeneral.getMaxregexpire();
        case 25:
            return aIaxgeneral.getNotransfer();
        // case 26:return
        // DataClassRendere.displayString(aIaxgeneral.getIaxjitter());

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Integer.class;
        case 1:
            return String.class;
        case 2:
            return String.class;
        case 3:
            return Boolean.class;
        case 4:
            return Boolean.class;
        case 5:
            return Amaflags.class;
        case 6:
            return String.class;
        case 7:
            return String.class;
        case 8:
            return String.class;
        case 9:
            return Integer.class;
        case 10:
            return String.class;
        case 11:
            return String.class;
        case 12:
            return Boolean.class;
        case 13:
            return String.class;
        case 14:
            return Boolean.class;
        case 15:
            return String.class;
        case 16:
            return Integer.class;
        case 17:
            return Boolean.class;
        case 18:
            return Boolean.class;
        case 19:
            return Boolean.class;
        case 20:
            return Integer.class;
        case 21:
            return CodecsSet.class;
        case 22:
            return CodecsSet.class;
        case 23:
            return Integer.class;
        case 24:
            return Integer.class;
        case 25:
            return Boolean.class;
        // case 26:return String.class;
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
     * gibt einen Iaxgeneral zurück
     * 
     * @param row
     * @return Iaxgeneral
     */
    public Iaxgeneral getIaxgeneral(int row) {
        return (Iaxgeneral) list.get(row);
    } // end of getIaxgeneral

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIaxgeneral(row);
    }

    /**
     * fügt einen Iaxgeneral hinzu
     * 
     * @param Iaxgeneral
     *            aIaxgeneral
     */
    public void addIaxgeneral(Iaxgeneral aIaxgeneral) {
        list.add(aIaxgeneral);
        fireTableDataChanged();
    } // end of addIaxgeneral

    /**
     * gibt einen neuen Iaxgeneral zurück
     * 
     * @return Iaxgeneral
     */
    public Iaxgeneral newIaxgeneral() {
        return new IaxgeneralImpl();
    } // end of newIaxgeneral

    /**
     * enfernt einen Iaxgeneral
     * 
     * @param aIaxgeneral
     *            Iaxgeneral
     */
    public void removeIaxgeneral(Iaxgeneral aIaxgeneral) {
        int index = list.indexOf(aIaxgeneral);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIaxgeneral

    /**
     * läd die Iaxgeneral nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIaxgeneral(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Iaxgeneral newIaxgeneral = new IaxgeneralImpl();
     * newIaxgeneral.loadComplete(set); list.add(newIaxgeneral); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIaxgeneral
     */
}
