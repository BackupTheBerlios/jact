package com.useit.jact.gui.misdnconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.types.PbxContext;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdnconfImpl;
//import com.useit.jact.model.dataModel.Misdnconf;

/**
 * <p>
 * MisdnconfTableModel
 * </p>
 * Created : Fri Jan 06 13:20:33 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnconfTableModel.java,v 1.9 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MisdnconfTableModel extends AbstractSimpleTableModel {

    // private Misdnconf mMisdnconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "debug", "tracefile", "trace_calls", "trace_dir", "bridging",
            "stop_tone_after_first_digit", "append_digits2exten", "l1_info_ok",
            "clear_l3", "dynamic_crypt", "crypt_prefix", "fileid", "context", };

    /**
     * standart konstruktor
     */
    public MisdnconfTableModel(String[] columnNames) {
        super();
        // mMisdnconf = new MisdnconfImpl();
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
        return 13;
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
        Misdnconf aMisdnconf = (Misdnconf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdnconf.getDebug();
        case 1:
            return aMisdnconf.getTracefile();
        case 2:
            return aMisdnconf.getTrace_calls();
        case 3:
            return aMisdnconf.getTrace_dir();
        case 4:
            return aMisdnconf.getBridging();
        case 5:
            return aMisdnconf.getStop_tone_after_first_digit();
        case 6:
            return aMisdnconf.getAppend_digits2exten();
        case 7:
            return aMisdnconf.getL1_info_ok();
        case 8:
            return aMisdnconf.getClear_l3();
        case 9:
            return aMisdnconf.getDynamic_crypt();
        case 10:
            return aMisdnconf.getCrypt_prefix();
        case 11:
            return aMisdnconf.getFileid();
        case 12:
            return aMisdnconf.getContext();
        // case 13:return
        // DataClassRendere.displayString(aMisdnconf.getMisdnSections());

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
            return Boolean.class;
        case 3:
            return String.class;
        case 4:
            return Boolean.class;
        case 5:
            return Boolean.class;
        case 6:
            return Boolean.class;
        case 7:
            return Boolean.class;
        case 8:
            return Boolean.class;
        case 9:
            return Boolean.class;
        case 10:
            return String.class;
        case 11:
            return String.class;
        case 12:
            return PbxContext.class;
        // case 13:return String.class;
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
     * gibt einen Misdnconf zurück
     * 
     * @param row
     * @return Misdnconf
     */
    public Misdnconf getMisdnconf(int row) {
        return (Misdnconf) list.get(row);
    } // end of getMisdnconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdnconf(row);
    }

    /**
     * fügt einen Misdnconf hinzu
     * 
     * @param Misdnconf
     *            aMisdnconf
     */
    public void addMisdnconf(Misdnconf aMisdnconf) {
        list.add(aMisdnconf);
        fireTableDataChanged();
    } // end of addMisdnconf

    /**
     * gibt einen neuen Misdnconf zurück
     * 
     * @return Misdnconf
     */
    public Misdnconf newMisdnconf() {
        return new MisdnconfImpl();
    } // end of newMisdnconf

    /**
     * enfernt einen Misdnconf
     * 
     * @param aMisdnconf
     *            Misdnconf
     */
    public void removeMisdnconf(Misdnconf aMisdnconf) {
        int index = list.indexOf(aMisdnconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdnconf

    /**
     * läd die Misdnconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdnconf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Misdnconf newMisdnconf = new MisdnconfImpl();
     * newMisdnconf.loadComplete(set); list.add(newMisdnconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdnconf
     */
}
