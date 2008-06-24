package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Call_Logging_Options;
import com.useit.jact.model.zapataconf.Call_Logging_OptionsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Call_Logging_OptionsImpl;
//import com.useit.jact.model.dataModel.Call_Logging_Options;

/**
 * <p>
 * Call_Logging_OptionsTableModel
 * </p>
 * Created : Fri Jan 06 13:23:12 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Call_Logging_OptionsTableModel.java,v 1.7
 *          2006/01/09 10:17:36 urs Exp $
 */
public class Call_Logging_OptionsTableModel extends AbstractSimpleTableModel {

    // private Call_Logging_Options mCall_Logging_Options;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "accountcode", "amaflags", };

    /**
     * standart konstruktor
     */
    public Call_Logging_OptionsTableModel(String[] columnNames) {
        super();
        // mCall_Logging_Options = new Call_Logging_OptionsImpl();
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
        Call_Logging_Options aCall_Logging_Options = (Call_Logging_Options) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aCall_Logging_Options.getAccountcode();
        case 1:
            return aCall_Logging_Options.getAmaflags();

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
     * gibt einen Call_Logging_Options zurück
     * 
     * @param row
     * @return Call_Logging_Options
     */
    public Call_Logging_Options getCall_Logging_Options(int row) {
        return (Call_Logging_Options) list.get(row);
    } // end of getCall_Logging_Options

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getCall_Logging_Options(row);
    }

    /**
     * fügt einen Call_Logging_Options hinzu
     * 
     * @param Call_Logging_Options
     *            aCall_Logging_Options
     */
    public void addCall_Logging_Options(
            Call_Logging_Options aCall_Logging_Options) {
        list.add(aCall_Logging_Options);
        fireTableDataChanged();
    } // end of addCall_Logging_Options

    /**
     * gibt einen neuen Call_Logging_Options zurück
     * 
     * @return Call_Logging_Options
     */
    public Call_Logging_Options newCall_Logging_Options() {
        return new Call_Logging_OptionsImpl();
    } // end of newCall_Logging_Options

    /**
     * enfernt einen Call_Logging_Options
     * 
     * @param aCall_Logging_Options
     *            Call_Logging_Options
     */
    public void removeCall_Logging_Options(
            Call_Logging_Options aCall_Logging_Options) {
        int index = list.indexOf(aCall_Logging_Options);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeCall_Logging_Options

    /**
     * läd die Call_Logging_Options nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadCall_Logging_Options(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Call_Logging_Options newCall_Logging_Options = new
     * Call_Logging_OptionsImpl(); newCall_Logging_Options.loadComplete(set);
     * list.add(newCall_Logging_Options); }
     * 
     * //end of while fireTableDataChanged(); } // end of
     * loadCall_Logging_Options
     */
}
