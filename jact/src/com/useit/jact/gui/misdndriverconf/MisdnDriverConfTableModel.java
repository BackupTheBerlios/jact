package com.useit.jact.gui.misdndriverconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdnDriverConfImpl;
//import com.useit.jact.model.dataModel.MisdnDriverConf;

/**
 * <p>
 * MisdnDriverConfTableModel
 * </p>
 * Created : Fri Jan 06 13:19:35 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnDriverConfTableModel.java,v 1.6
 *          2006/01/09 10:17:36 urs Exp $
 */
public class MisdnDriverConfTableModel extends AbstractSimpleTableModel {

    // private MisdnDriverConf mMisdnDriverConf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "poll", "pcm", "debug", };

    /**
     * standart konstruktor
     */
    public MisdnDriverConfTableModel(String[] columnNames) {
        super();
        // mMisdnDriverConf = new MisdnDriverConfImpl();
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
        MisdnDriverConf aMisdnDriverConf = (MisdnDriverConf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdnDriverConf.getPoll();
        case 1:
            return aMisdnDriverConf.getPcm();
        case 2:
            return aMisdnDriverConf.getDebug();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Integer.class;
        case 1:
            return Boolean.class;
        case 2:
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
     * gibt einen MisdnDriverConf zurück
     * 
     * @param row
     * @return MisdnDriverConf
     */
    public MisdnDriverConf getMisdnDriverConf(int row) {
        return (MisdnDriverConf) list.get(row);
    } // end of getMisdnDriverConf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdnDriverConf(row);
    }

    /**
     * fügt einen MisdnDriverConf hinzu
     * 
     * @param MisdnDriverConf
     *            aMisdnDriverConf
     */
    public void addMisdnDriverConf(MisdnDriverConf aMisdnDriverConf) {
        list.add(aMisdnDriverConf);
        fireTableDataChanged();
    } // end of addMisdnDriverConf

    /**
     * gibt einen neuen MisdnDriverConf zurück
     * 
     * @return MisdnDriverConf
     */
    public MisdnDriverConf newMisdnDriverConf() {
        return new MisdnDriverConfImpl();
    } // end of newMisdnDriverConf

    /**
     * enfernt einen MisdnDriverConf
     * 
     * @param aMisdnDriverConf
     *            MisdnDriverConf
     */
    public void removeMisdnDriverConf(MisdnDriverConf aMisdnDriverConf) {
        int index = list.indexOf(aMisdnDriverConf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdnDriverConf

    /**
     * läd die MisdnDriverConf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdnDriverConf(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MisdnDriverConf newMisdnDriverConf = new
     * MisdnDriverConfImpl(); newMisdnDriverConf.loadComplete(set);
     * list.add(newMisdnDriverConf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdnDriverConf
     */
}
