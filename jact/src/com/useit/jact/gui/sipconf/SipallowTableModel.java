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
package com.useit.jact.gui.sipconf;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.sipconf.Sipallow;
import com.useit.jact.model.sipconf.SipallowImpl;
import com.useit.jact.model.types.Codecs;

// import com.useit.jact.gui.guiHelper.DataClassRendere;
// import com.useit.jact.model.impl.SipallowImpl;
// import com.useit.jact.model.dataModel.Sipallow;

/**
 * <p>
 * SipallowTableModel
 * </p>
 * Created : Thu Sep 08 19:35:46 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipallowTableModel.java,v 1.4 2005/09/20
 *          14:01:52 urs Exp $
 */
public class SipallowTableModel extends AbstractSimpleTableModel {

    private Sipallow mSipallow;

    // private Connection con;
    private List listofSipallow = new Vector();

    private String[] columnNames = { // null;
    "Value", };

    /**
     * standart konstruktor
     */
    public SipallowTableModel(String[] columnNames) {
        super();
        mSipallow = new SipallowImpl();
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
        return listofSipallow.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sipallow aSipallow = (Sipallow) listofSipallow.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aSipallow.getValue();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Codecs.class;
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
        listofSipallow.clear();
        listofSipallow.addAll(aMap.values());
        fireTableDataChanged();

    }

    /**
     * gibt einen Sipallow zurück
     * 
     * @param row
     * @return Sipallow
     */
    public Sipallow getSipallow(int row) {
        return (Sipallow) listofSipallow.get(row);
    } // end of getSipallow

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getSipallow(row);
    }

    /**
     * fügt einen Sipallow hinzu
     * 
     * @param Sipallow
     *            aSipallow
     */
    public void addSipallow(Sipallow aSipallow) {
        listofSipallow.add(aSipallow);
        fireTableDataChanged();
    } // end of addSipallow

    /**
     * gibt einen neuen Sipallow zurück
     * 
     * @return Sipallow
     */
    public Sipallow newSipallow() {
        return new SipallowImpl();
    } // end of newSipallow

    /**
     * enfernt einen Sipallow
     * 
     * @param aSipallow
     *            Sipallow
     */
    public void removeSipallow(Sipallow aSipallow) {
        int index = listofSipallow.indexOf(aSipallow);
        listofSipallow.remove(index);
        fireTableDataChanged();
    } // end of removeSipallow

    /**
     * läd die Sipallow nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadSipallow(String sql) throws SQLException, Exception{
     * this.listofSipallow.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Sipallow newSipallow = new SipallowImpl();
     * newSipallow.loadComplete(set); listofSipallow.add(newSipallow); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadSipallow
     */
}
