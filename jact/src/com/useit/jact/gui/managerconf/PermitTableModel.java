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
import com.useit.jact.model.managerconf.Permit;
import com.useit.jact.model.managerconf.PermitImpl;

/**
 * <p>
 * PermitTableModel
 * </p>
 * Created : Wed Aug 17 01:27:25 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PermitTableModel.java,v 1.5 2005/09/20
 *          14:02:04 urs Exp $
 */
public class PermitTableModel extends AbstractSimpleTableModel {

    private Permit mPermit;

    // private Connection con;
    private List listofPermit = new Vector();

    private String[] columnNames = { // null;
    "Value", };

    /**
     * standart konstruktor
     */
    public PermitTableModel(String[] columnNames) {
        super();
        mPermit = new PermitImpl();
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
        return listofPermit.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        Permit aPermit = (Permit) listofPermit.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aPermit.getValue();

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
        listofPermit.clear();
        listofPermit.addAll(aMap.values());
        fireTableDataChanged();

    }

    /**
     * gibt einen Permit zurück
     * 
     * @param row
     * @return Permit
     */
    public Permit getPermit(int row) {
        return (Permit) listofPermit.get(row);
    } // end of getPermit

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getPermit(row);
    }

    /**
     * fügt einen Permit hinzu
     * 
     * @param Permit
     *            aPermit
     */
    public void addPermit(Permit aPermit) {
        listofPermit.add(aPermit);
        fireTableDataChanged();
    } // end of addPermit

    /**
     * gibt einen neuen Permit zurück
     * 
     * @return Permit
     */
    public Permit newPermit() {
        return new PermitImpl();
    } // end of newPermit

    /**
     * enfernt einen Permit
     * 
     * @param aPermit
     *            Permit
     */
    public void removePermit(Permit aPermit) {
        int index = listofPermit.indexOf(aPermit);
        listofPermit.remove(index);
        fireTableDataChanged();
    } // end of removePermit

    /**
     * läd die Permit nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadPermit(String sql) throws SQLException, Exception{
     * this.listofPermit.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Permit newPermit = new PermitImpl();
     * newPermit.loadComplete(set); listofPermit.add(newPermit); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadPermit
     */
}
