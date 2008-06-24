package com.useit.jact.gui.queueconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.QueuegeneralImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.QueuegeneralImpl;
//import com.useit.jact.model.dataModel.Queuegeneral;

/**
 * <p>
 * QueuegeneralTableModel
 * </p>
 * Created : Sat Jan 14 16:06:09 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuegeneralTableModel.java,v 1.7 2006/01/14
 *          15:44:46 urs Exp $
 */
public class QueuegeneralTableModel extends AbstractSimpleTableModel {

    // private Queuegeneral mQueuegeneral;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "persistentmembers", };

    /**
     * standart konstruktor
     */
    public QueuegeneralTableModel(String[] columnNames) {
        super();
        // mQueuegeneral = new QueuegeneralImpl();
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
        return 1;
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
        Queuegeneral aQueuegeneral = (Queuegeneral) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aQueuegeneral.getPersistentmembers();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
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
     * gibt einen Queuegeneral zurück
     * 
     * @param row
     * @return Queuegeneral
     */
    public Queuegeneral getQueuegeneral(int row) {
        return (Queuegeneral) list.get(row);
    } // end of getQueuegeneral

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getQueuegeneral(row);
    }

    /**
     * fügt einen Queuegeneral hinzu
     * 
     * @param Queuegeneral
     *            aQueuegeneral
     */
    public void addQueuegeneral(Queuegeneral aQueuegeneral) {
        list.add(aQueuegeneral);
        fireTableDataChanged();
    } // end of addQueuegeneral

    /**
     * gibt einen neuen Queuegeneral zurück
     * 
     * @return Queuegeneral
     */
    public Queuegeneral newQueuegeneral() {
        return new QueuegeneralImpl();
    } // end of newQueuegeneral

    /**
     * enfernt einen Queuegeneral
     * 
     * @param aQueuegeneral
     *            Queuegeneral
     */
    public void removeQueuegeneral(Queuegeneral aQueuegeneral) {
        int index = list.indexOf(aQueuegeneral);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeQueuegeneral

    /**
     * läd die Queuegeneral nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadQueuegeneral(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Queuegeneral newQueuegeneral = new
     * QueuegeneralImpl(); newQueuegeneral.loadComplete(set);
     * list.add(newQueuegeneral); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadQueuegeneral
     */
}
