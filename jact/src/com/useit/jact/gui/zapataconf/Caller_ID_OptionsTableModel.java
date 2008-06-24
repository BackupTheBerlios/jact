package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Caller_ID_Options;
import com.useit.jact.model.zapataconf.Caller_ID_OptionsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Caller_ID_OptionsImpl;
//import com.useit.jact.model.dataModel.Caller_ID_Options;

/**
 * <p>
 * Caller_ID_OptionsTableModel
 * </p>
 * Created : Fri Jan 06 13:23:16 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Caller_ID_OptionsTableModel.java,v 1.7
 *          2006/01/09 10:17:36 urs Exp $
 */
public class Caller_ID_OptionsTableModel extends AbstractSimpleTableModel {

    // private Caller_ID_Options mCaller_ID_Options;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "callerid", "usecallerid", "hidecallerid", "restrictcid", "usecallingpres", };

    /**
     * standart konstruktor
     */
    public Caller_ID_OptionsTableModel(String[] columnNames) {
        super();
        // mCaller_ID_Options = new Caller_ID_OptionsImpl();
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
        return 5;
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
        Caller_ID_Options aCaller_ID_Options = (Caller_ID_Options) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aCaller_ID_Options.getCallerid();
        case 1:
            return aCaller_ID_Options.getUsecallerid();
        case 2:
            return aCaller_ID_Options.getHidecallerid();
        case 3:
            return aCaller_ID_Options.getRestrictcid();
        case 4:
            return aCaller_ID_Options.getUsecallingpres();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return Boolean.class;
        case 2:
            return Boolean.class;
        case 3:
            return Boolean.class;
        case 4:
            return Boolean.class;
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
     * gibt einen Caller_ID_Options zurück
     * 
     * @param row
     * @return Caller_ID_Options
     */
    public Caller_ID_Options getCaller_ID_Options(int row) {
        return (Caller_ID_Options) list.get(row);
    } // end of getCaller_ID_Options

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getCaller_ID_Options(row);
    }

    /**
     * fügt einen Caller_ID_Options hinzu
     * 
     * @param Caller_ID_Options
     *            aCaller_ID_Options
     */
    public void addCaller_ID_Options(Caller_ID_Options aCaller_ID_Options) {
        list.add(aCaller_ID_Options);
        fireTableDataChanged();
    } // end of addCaller_ID_Options

    /**
     * gibt einen neuen Caller_ID_Options zurück
     * 
     * @return Caller_ID_Options
     */
    public Caller_ID_Options newCaller_ID_Options() {
        return new Caller_ID_OptionsImpl();
    } // end of newCaller_ID_Options

    /**
     * enfernt einen Caller_ID_Options
     * 
     * @param aCaller_ID_Options
     *            Caller_ID_Options
     */
    public void removeCaller_ID_Options(Caller_ID_Options aCaller_ID_Options) {
        int index = list.indexOf(aCaller_ID_Options);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeCaller_ID_Options

    /**
     * läd die Caller_ID_Options nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadCaller_ID_Options(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Caller_ID_Options newCaller_ID_Options = new
     * Caller_ID_OptionsImpl(); newCaller_ID_Options.loadComplete(set);
     * list.add(newCaller_ID_Options); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadCaller_ID_Options
     */
}
