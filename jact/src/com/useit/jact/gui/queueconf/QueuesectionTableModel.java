package com.useit.jact.gui.queueconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.queueconf.Queuesection;
import com.useit.jact.model.queueconf.QueuesectionImpl;
import com.useit.jact.model.types.PbxContext;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.QueuesectionImpl;
//import com.useit.jact.model.dataModel.Queuesection;

/**
 * <p>
 * QueuesectionTableModel
 * </p>
 * Created : Sat Jan 14 16:06:09 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuesectionTableModel.java,v 1.7 2006/01/14
 *          15:44:46 urs Exp $
 */
public class QueuesectionTableModel extends AbstractSimpleTableModel {

    // private Queuesection mQueuesection;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "sectionname", "musiconhold", "announce", "strategy", "servicelevel",
            "context", "timeout", "retry", "weight", "wrapuptime", "maxlen",
            "announcefrequency", "announceholdtime", "announceroundseconds",
            "monitorformat", "monitorjoin", "joinempty", "leavewhenempty",
            "eventwhencalled", "eventmemberstatusoff", "reportholdtime",
            "memberdelay", "timeoutrestart", };

    /**
     * standart konstruktor
     */
    public QueuesectionTableModel(String[] columnNames) {
        super();
        // mQueuesection = new QueuesectionImpl();
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
        return 23;
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
        Queuesection aQueuesection = (Queuesection) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aQueuesection.getSectionname();
        case 1:
            return aQueuesection.getMusiconhold();
        case 2:
            return aQueuesection.getAnnounce();
        case 3:
            return aQueuesection.getStrategy();
        case 4:
            return aQueuesection.getServicelevel();
        case 5:
            return aQueuesection.getContext();
        case 6:
            return aQueuesection.getTimeout();
        case 7:
            return aQueuesection.getRetry();
        case 8:
            return aQueuesection.getWeight();
        case 9:
            return aQueuesection.getWrapuptime();
        case 10:
            return aQueuesection.getMaxlen();
        case 11:
            return aQueuesection.getAnnouncefrequency();
        case 12:
            return aQueuesection.getAnnounceholdtime();
        case 13:
            return aQueuesection.getAnnounceroundseconds();
        case 14:
            return aQueuesection.getMonitorformat();
        case 15:
            return aQueuesection.getMonitorjoin();
        case 16:
            return aQueuesection.getJoinempty();
        case 17:
            return aQueuesection.getLeavewhenempty();
        case 18:
            return aQueuesection.getEventwhencalled();
        case 19:
            return aQueuesection.getEventmemberstatusoff();
        case 20:
            return aQueuesection.getReportholdtime();
        case 21:
            return aQueuesection.getMemberdelay();
        case 22:
            return aQueuesection.getTimeoutrestart();

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
            return PbxContext.class;
        case 6:
            return Integer.class;
        case 7:
            return Integer.class;
        case 8:
            return String.class;
        case 9:
            return Integer.class;
        case 10:
            return Integer.class;
        case 11:
            return Integer.class;
        case 12:
            return Boolean.class;
        case 13:
            return String.class;
        case 14:
            return String.class;
        case 15:
            return Boolean.class;
        case 16:
            return String.class;
        case 17:
            return String.class;
        case 18:
            return Boolean.class;
        case 19:
            return Boolean.class;
        case 20:
            return Boolean.class;
        case 21:
            return Integer.class;
        case 22:
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
     * gibt einen Queuesection zurück
     * 
     * @param row
     * @return Queuesection
     */
    public Queuesection getQueuesection(int row) {
        return (Queuesection) list.get(row);
    } // end of getQueuesection

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getQueuesection(row);
    }

    /**
     * fügt einen Queuesection hinzu
     * 
     * @param Queuesection
     *            aQueuesection
     */
    public void addQueuesection(Queuesection aQueuesection) {
        list.add(aQueuesection);
        fireTableDataChanged();
    } // end of addQueuesection

    /**
     * gibt einen neuen Queuesection zurück
     * 
     * @return Queuesection
     */
    public Queuesection newQueuesection() {
        return new QueuesectionImpl();
    } // end of newQueuesection

    /**
     * enfernt einen Queuesection
     * 
     * @param aQueuesection
     *            Queuesection
     */
    public void removeQueuesection(Queuesection aQueuesection) {
        int index = list.indexOf(aQueuesection);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeQueuesection

    /**
     * läd die Queuesection nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadQueuesection(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Queuesection newQueuesection = new
     * QueuesectionImpl(); newQueuesection.loadComplete(set);
     * list.add(newQueuesection); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadQueuesection
     */
}
