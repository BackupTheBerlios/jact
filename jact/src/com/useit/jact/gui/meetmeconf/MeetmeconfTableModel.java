package com.useit.jact.gui.meetmeconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MeetmeconfImpl;
//import com.useit.jact.model.dataModel.Meetmeconf;

/**
 * <p>
 * MeetmeconfTableModel
 * </p>
 * Created : Fri Jan 06 13:22:02 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeconfTableModel.java,v 1.6 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MeetmeconfTableModel extends AbstractSimpleTableModel {

    // private Meetmeconf mMeetmeconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "fileid", };

    /**
     * standart konstruktor
     */
    public MeetmeconfTableModel(String[] columnNames) {
        super();
        // mMeetmeconf = new MeetmeconfImpl();
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
        Meetmeconf aMeetmeconf = (Meetmeconf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMeetmeconf.getFileid();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
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
     * gibt einen Meetmeconf zurück
     * 
     * @param row
     * @return Meetmeconf
     */
    public Meetmeconf getMeetmeconf(int row) {
        return (Meetmeconf) list.get(row);
    } // end of getMeetmeconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMeetmeconf(row);
    }

    /**
     * fügt einen Meetmeconf hinzu
     * 
     * @param Meetmeconf
     *            aMeetmeconf
     */
    public void addMeetmeconf(Meetmeconf aMeetmeconf) {
        list.add(aMeetmeconf);
        fireTableDataChanged();
    } // end of addMeetmeconf

    /**
     * gibt einen neuen Meetmeconf zurück
     * 
     * @return Meetmeconf
     */
    public Meetmeconf newMeetmeconf() {
        return new MeetmeconfImpl();
    } // end of newMeetmeconf

    /**
     * enfernt einen Meetmeconf
     * 
     * @param aMeetmeconf
     *            Meetmeconf
     */
    public void removeMeetmeconf(Meetmeconf aMeetmeconf) {
        int index = list.indexOf(aMeetmeconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMeetmeconf

    /**
     * läd die Meetmeconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMeetmeconf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Meetmeconf newMeetmeconf = new MeetmeconfImpl();
     * newMeetmeconf.loadComplete(set); list.add(newMeetmeconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMeetmeconf
     */
}
