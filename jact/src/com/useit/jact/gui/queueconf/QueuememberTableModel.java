package com.useit.jact.gui.queueconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.QueuememberImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.QueuememberImpl;
//import com.useit.jact.model.dataModel.Queuemember;

/**
 * <p>
 * QueuememberTableModel
 * </p>
 * Created : Sat Jan 14 16:06:11 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuememberTableModel.java,v 1.7 2006/01/14
 *          15:44:47 urs Exp $
 */
public class QueuememberTableModel extends AbstractSimpleTableModel {

    // private Queuemember mQueuemember;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "tech", "dialstring", };

    /**
     * standart konstruktor
     */
    public QueuememberTableModel(String[] columnNames) {
        super();
        // mQueuemember = new QueuememberImpl();
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
        Queuemember aQueuemember = (Queuemember) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aQueuemember.getTech();
        case 1:
            return aQueuemember.getDialstring();

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
     * gibt einen Queuemember zurück
     * 
     * @param row
     * @return Queuemember
     */
    public Queuemember getQueuemember(int row) {
        return (Queuemember) list.get(row);
    } // end of getQueuemember

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getQueuemember(row);
    }

    /**
     * fügt einen Queuemember hinzu
     * 
     * @param Queuemember
     *            aQueuemember
     */
    public void addQueuemember(Queuemember aQueuemember) {
        list.add(aQueuemember);
        fireTableDataChanged();
    } // end of addQueuemember

    /**
     * gibt einen neuen Queuemember zurück
     * 
     * @return Queuemember
     */
    public Queuemember newQueuemember() {
        return new QueuememberImpl();
    } // end of newQueuemember

    /**
     * enfernt einen Queuemember
     * 
     * @param aQueuemember
     *            Queuemember
     */
    public void removeQueuemember(Queuemember aQueuemember) {
        int index = list.indexOf(aQueuemember);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeQueuemember

    /**
     * läd die Queuemember nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadQueuemember(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Queuemember newQueuemember = new QueuememberImpl();
     * newQueuemember.loadComplete(set); list.add(newQueuemember); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadQueuemember
     */
}
