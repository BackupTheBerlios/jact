package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Timing_Parameters;
import com.useit.jact.model.zapataconf.Timing_ParametersImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Timing_ParametersImpl;
//import com.useit.jact.model.dataModel.Timing_Parameters;

/**
 * <p>
 * Timing_ParametersTableModel
 * </p>
 * Created : Fri Jan 06 13:22:42 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Timing_ParametersTableModel.java,v 1.7
 *          2006/01/09 10:17:36 urs Exp $
 */
public class Timing_ParametersTableModel extends AbstractSimpleTableModel {

    // private Timing_Parameters mTiming_Parameters;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "prewink", "preflash", "wink", "rxwink", "rxflash", "flash", "start",
            "debounce", };

    /**
     * standart konstruktor
     */
    public Timing_ParametersTableModel(String[] columnNames) {
        super();
        // mTiming_Parameters = new Timing_ParametersImpl();
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
        return 8;
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
        Timing_Parameters aTiming_Parameters = (Timing_Parameters) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aTiming_Parameters.getPrewink();
        case 1:
            return aTiming_Parameters.getPreflash();
        case 2:
            return aTiming_Parameters.getWink();
        case 3:
            return aTiming_Parameters.getRxwink();
        case 4:
            return aTiming_Parameters.getRxflash();
        case 5:
            return aTiming_Parameters.getFlash();
        case 6:
            return aTiming_Parameters.getStart();
        case 7:
            return aTiming_Parameters.getDebounce();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Integer.class;
        case 1:
            return Integer.class;
        case 2:
            return Integer.class;
        case 3:
            return Integer.class;
        case 4:
            return Integer.class;
        case 5:
            return Integer.class;
        case 6:
            return Integer.class;
        case 7:
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
     * gibt einen Timing_Parameters zurück
     * 
     * @param row
     * @return Timing_Parameters
     */
    public Timing_Parameters getTiming_Parameters(int row) {
        return (Timing_Parameters) list.get(row);
    } // end of getTiming_Parameters

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getTiming_Parameters(row);
    }

    /**
     * fügt einen Timing_Parameters hinzu
     * 
     * @param Timing_Parameters
     *            aTiming_Parameters
     */
    public void addTiming_Parameters(Timing_Parameters aTiming_Parameters) {
        list.add(aTiming_Parameters);
        fireTableDataChanged();
    } // end of addTiming_Parameters

    /**
     * gibt einen neuen Timing_Parameters zurück
     * 
     * @return Timing_Parameters
     */
    public Timing_Parameters newTiming_Parameters() {
        return new Timing_ParametersImpl();
    } // end of newTiming_Parameters

    /**
     * enfernt einen Timing_Parameters
     * 
     * @param aTiming_Parameters
     *            Timing_Parameters
     */
    public void removeTiming_Parameters(Timing_Parameters aTiming_Parameters) {
        int index = list.indexOf(aTiming_Parameters);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeTiming_Parameters

    /**
     * läd die Timing_Parameters nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadTiming_Parameters(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Timing_Parameters newTiming_Parameters = new
     * Timing_ParametersImpl(); newTiming_Parameters.loadComplete(set);
     * list.add(newTiming_Parameters); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadTiming_Parameters
     */
}
