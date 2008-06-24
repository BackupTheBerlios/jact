/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
package com.useit.jact.gui.managerconf;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.managerconf.Deny;
import com.useit.jact.model.managerconf.DenyImpl;

/**
 * <p>
 * DenyTableModel
 * </p>
 * Created : Wed Aug 17 01:27:25 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DenyTableModel.java,v 1.5 2005/09/20 14:02:04
 *          urs Exp $
 */
public class DenyTableModel extends AbstractSimpleTableModel {

    private Deny mDeny;

    // private Connection con;
    private List listofDeny = new Vector();

    private String[] columnNames = { // null;
    "Value", };

    /**
     * standart konstruktor
     */
    public DenyTableModel(String[] columnNames) {
        super();
        mDeny = new DenyImpl();
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
        return listofDeny.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        Deny aDeny = (Deny) listofDeny.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aDeny.getValue();

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
        listofDeny.clear();
        listofDeny.addAll(aMap.values());
        fireTableDataChanged();

    }

    /**
     * gibt einen Deny zurück
     * 
     * @param row
     * @return Deny
     */
    public Deny getDeny(int row) {
        return (Deny) listofDeny.get(row);
    } // end of getDeny

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getDeny(row);
    }

    /**
     * fügt einen Deny hinzu
     * 
     * @param Deny
     *            aDeny
     */
    public void addDeny(Deny aDeny) {
        listofDeny.add(aDeny);
        fireTableDataChanged();
    } // end of addDeny

    /**
     * gibt einen neuen Deny zurück
     * 
     * @return Deny
     */
    public Deny newDeny() {
        return new DenyImpl();
    } // end of newDeny

    /**
     * enfernt einen Deny
     * 
     * @param aDeny
     *            Deny
     */
    public void removeDeny(Deny aDeny) {
        int index = listofDeny.indexOf(aDeny);
        listofDeny.remove(index);
        fireTableDataChanged();
    } // end of removeDeny

    /**
     * läd die Deny nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadDeny(String sql) throws SQLException, Exception{
     * this.listofDeny.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Deny newDeny = new DenyImpl();
     * newDeny.loadComplete(set); listofDeny.add(newDeny); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadDeny
     */
}
