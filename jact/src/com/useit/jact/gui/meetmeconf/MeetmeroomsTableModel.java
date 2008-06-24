package com.useit.jact.gui.meetmeconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.meetmeconf.Meetmerooms;
import com.useit.jact.model.meetmeconf.MeetmeroomsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MeetmeroomsImpl;
//import com.useit.jact.model.dataModel.Meetmerooms;

/**
 * <p>
 * MeetmeroomsTableModel
 * </p>
 * Created : Fri Jan 06 13:22:05 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeroomsTableModel.java,v 1.6 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MeetmeroomsTableModel extends AbstractSimpleTableModel {

    // private Meetmerooms mMeetmerooms;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "confno", "pincode", "adminpin", };

    /**
     * standart konstruktor
     */
    public MeetmeroomsTableModel(String[] columnNames) {
        super();
        // mMeetmerooms = new MeetmeroomsImpl();
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
        Meetmerooms aMeetmerooms = (Meetmerooms) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMeetmerooms.getConfno();
        case 1:
            return aMeetmerooms.getPincode();
        case 2:
            return aMeetmerooms.getAdminpin();

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
     * gibt einen Meetmerooms zurück
     * 
     * @param row
     * @return Meetmerooms
     */
    public Meetmerooms getMeetmerooms(int row) {
        return (Meetmerooms) list.get(row);
    } // end of getMeetmerooms

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMeetmerooms(row);
    }

    /**
     * fügt einen Meetmerooms hinzu
     * 
     * @param Meetmerooms
     *            aMeetmerooms
     */
    public void addMeetmerooms(Meetmerooms aMeetmerooms) {
        list.add(aMeetmerooms);
        fireTableDataChanged();
    } // end of addMeetmerooms

    /**
     * gibt einen neuen Meetmerooms zurück
     * 
     * @return Meetmerooms
     */
    public Meetmerooms newMeetmerooms() {
        return new MeetmeroomsImpl();
    } // end of newMeetmerooms

    /**
     * enfernt einen Meetmerooms
     * 
     * @param aMeetmerooms
     *            Meetmerooms
     */
    public void removeMeetmerooms(Meetmerooms aMeetmerooms) {
        int index = list.indexOf(aMeetmerooms);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMeetmerooms

    /**
     * läd die Meetmerooms nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMeetmerooms(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Meetmerooms newMeetmerooms = new MeetmeroomsImpl();
     * newMeetmerooms.loadComplete(set); list.add(newMeetmerooms); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMeetmerooms
     */
}
