package com.useit.jact.gui.misdnconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnCryptkeyImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdnCryptkeyImpl;
//import com.useit.jact.model.dataModel.MisdnCryptkey;

/**
 * <p>
 * MisdnCryptkeyTableModel
 * </p>
 * Created : Fri Jan 06 13:20:37 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCryptkeyTableModel.java,v 1.9 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MisdnCryptkeyTableModel extends AbstractSimpleTableModel {

    // private MisdnCryptkey mMisdnCryptkey;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "keyname", "keyvalue", };

    /**
     * standart konstruktor
     */
    public MisdnCryptkeyTableModel(String[] columnNames) {
        super();
        // mMisdnCryptkey = new MisdnCryptkeyImpl();
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
        MisdnCryptkey aMisdnCryptkey = (MisdnCryptkey) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdnCryptkey.getKeyname();
        case 1:
            return aMisdnCryptkey.getKeyvalue();

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
     * gibt einen MisdnCryptkey zurück
     * 
     * @param row
     * @return MisdnCryptkey
     */
    public MisdnCryptkey getMisdnCryptkey(int row) {
        return (MisdnCryptkey) list.get(row);
    } // end of getMisdnCryptkey

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdnCryptkey(row);
    }

    /**
     * fügt einen MisdnCryptkey hinzu
     * 
     * @param MisdnCryptkey
     *            aMisdnCryptkey
     */
    public void addMisdnCryptkey(MisdnCryptkey aMisdnCryptkey) {
        list.add(aMisdnCryptkey);
        fireTableDataChanged();
    } // end of addMisdnCryptkey

    /**
     * gibt einen neuen MisdnCryptkey zurück
     * 
     * @return MisdnCryptkey
     */
    public MisdnCryptkey newMisdnCryptkey() {
        return new MisdnCryptkeyImpl();
    } // end of newMisdnCryptkey

    /**
     * enfernt einen MisdnCryptkey
     * 
     * @param aMisdnCryptkey
     *            MisdnCryptkey
     */
    public void removeMisdnCryptkey(MisdnCryptkey aMisdnCryptkey) {
        int index = list.indexOf(aMisdnCryptkey);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdnCryptkey

    /**
     * läd die MisdnCryptkey nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdnCryptkey(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MisdnCryptkey newMisdnCryptkey = new
     * MisdnCryptkeyImpl(); newMisdnCryptkey.loadComplete(set);
     * list.add(newMisdnCryptkey); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdnCryptkey
     */
}
