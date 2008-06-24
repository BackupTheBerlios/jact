package com.useit.jact.gui.alarmreciverconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;
import com.useit.jact.model.alarmreciverconf.AlarmreceiverconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.AlarmreceiverconfImpl;
//import com.useit.jact.model.dataModel.Alarmreceiverconf;

/**
 * <p>
 * AlarmreceiverconfTableModel
 * </p>
 * Created : Fri Jan 06 13:22:08 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AlarmreceiverconfTableModel.java,v 1.4
 *          2006/01/09 10:17:42 urs Exp $
 */
public class AlarmreceiverconfTableModel extends AbstractSimpleTableModel {

    // private Alarmreceiverconf mAlarmreceiverconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "timestampformat", "eventcmd", "eventspooldir", "logindividualevents",
            "fdtimeout", "sdtimeout", "loudness", "dbfamily", };

    /**
     * standart konstruktor
     */
    public AlarmreceiverconfTableModel(String[] columnNames) {
        super();
        // mAlarmreceiverconf = new AlarmreceiverconfImpl();
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
        Alarmreceiverconf aAlarmreceiverconf = (Alarmreceiverconf) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAlarmreceiverconf.getTimestampformat();
        case 1:
            return aAlarmreceiverconf.getEventcmd();
        case 2:
            return aAlarmreceiverconf.getEventspooldir();
        case 3:
            return aAlarmreceiverconf.getLogindividualevents();
        case 4:
            return aAlarmreceiverconf.getFdtimeout();
        case 5:
            return aAlarmreceiverconf.getSdtimeout();
        case 6:
            return aAlarmreceiverconf.getLoudness();
        case 7:
            return aAlarmreceiverconf.getDbfamily();

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
            return Integer.class;
        case 5:
            return Integer.class;
        case 6:
            return Integer.class;
        case 7:
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
     * gibt einen Alarmreceiverconf zurück
     * 
     * @param row
     * @return Alarmreceiverconf
     */
    public Alarmreceiverconf getAlarmreceiverconf(int row) {
        return (Alarmreceiverconf) list.get(row);
    } // end of getAlarmreceiverconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAlarmreceiverconf(row);
    }

    /**
     * fügt einen Alarmreceiverconf hinzu
     * 
     * @param Alarmreceiverconf
     *            aAlarmreceiverconf
     */
    public void addAlarmreceiverconf(Alarmreceiverconf aAlarmreceiverconf) {
        list.add(aAlarmreceiverconf);
        fireTableDataChanged();
    } // end of addAlarmreceiverconf

    /**
     * gibt einen neuen Alarmreceiverconf zurück
     * 
     * @return Alarmreceiverconf
     */
    public Alarmreceiverconf newAlarmreceiverconf() {
        return new AlarmreceiverconfImpl();
    } // end of newAlarmreceiverconf

    /**
     * enfernt einen Alarmreceiverconf
     * 
     * @param aAlarmreceiverconf
     *            Alarmreceiverconf
     */
    public void removeAlarmreceiverconf(Alarmreceiverconf aAlarmreceiverconf) {
        int index = list.indexOf(aAlarmreceiverconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAlarmreceiverconf

    /**
     * läd die Alarmreceiverconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAlarmreceiverconf(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Alarmreceiverconf newAlarmreceiverconf = new
     * AlarmreceiverconfImpl(); newAlarmreceiverconf.loadComplete(set);
     * list.add(newAlarmreceiverconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadAlarmreceiverconf
     */
}
