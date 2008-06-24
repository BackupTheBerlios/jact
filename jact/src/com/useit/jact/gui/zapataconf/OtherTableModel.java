package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Other;
import com.useit.jact.model.zapataconf.OtherImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.OtherImpl;
//import com.useit.jact.model.dataModel.Other;

/**
 * <p>
 * OtherTableModel
 * </p>
 * Created : Fri Jan 06 13:22:33 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: OtherTableModel.java,v 1.7 2006/01/09
 *          10:17:36 urs Exp $
 */
public class OtherTableModel extends AbstractSimpleTableModel {

    // private Other mOther;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "mailbox", "group", "language", };

    /**
     * standart konstruktor
     */
    public OtherTableModel(String[] columnNames) {
        super();
        // mOther = new OtherImpl();
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
        Other aOther = (Other) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aOther.getMailbox();
        case 1:
            return aOther.getGroup();
        case 2:
            return aOther.getLanguage();

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
     * gibt einen Other zurück
     * 
     * @param row
     * @return Other
     */
    public Other getOther(int row) {
        return (Other) list.get(row);
    } // end of getOther

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getOther(row);
    }

    /**
     * fügt einen Other hinzu
     * 
     * @param Other
     *            aOther
     */
    public void addOther(Other aOther) {
        list.add(aOther);
        fireTableDataChanged();
    } // end of addOther

    /**
     * gibt einen neuen Other zurück
     * 
     * @return Other
     */
    public Other newOther() {
        return new OtherImpl();
    } // end of newOther

    /**
     * enfernt einen Other
     * 
     * @param aOther
     *            Other
     */
    public void removeOther(Other aOther) {
        int index = list.indexOf(aOther);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeOther

    /**
     * läd die Other nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadOther(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Other newOther = new OtherImpl();
     * newOther.loadComplete(set); list.add(newOther); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadOther
     */
}
