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
import com.useit.jact.model.sipconf.Sipdisallow;
import com.useit.jact.model.sipconf.SipdisallowImpl;
import com.useit.jact.model.types.Codecs;

// import com.useit.jact.gui.guiHelper.DataClassRendere;
// import com.useit.jact.model.impl.SipdisallowImpl;
// import com.useit.jact.model.dataModel.Sipdisallow;

/**
 * <p>
 * SipdisallowTableModel
 * </p>
 * Created : Thu Sep 08 19:35:46 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipdisallowTableModel.java,v 1.4 2005/09/20
 *          14:01:52 urs Exp $
 */
public class SipdisallowTableModel extends AbstractSimpleTableModel {

    private Sipdisallow mSipdisallow;

    // private Connection con;
    private List listofSipdisallow = new Vector();

    private String[] columnNames = { // null;
    "Value", };

    /**
     * standart konstruktor
     */
    public SipdisallowTableModel(String[] columnNames) {
        super();
        mSipdisallow = new SipdisallowImpl();
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
        return listofSipdisallow.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sipdisallow aSipdisallow = (Sipdisallow) listofSipdisallow
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aSipdisallow.getValue();

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
        listofSipdisallow.clear();
        listofSipdisallow.addAll(aMap.values());
        fireTableDataChanged();

    }

    /**
     * gibt einen Sipdisallow zurück
     * 
     * @param row
     * @return Sipdisallow
     */
    public Sipdisallow getSipdisallow(int row) {
        return (Sipdisallow) listofSipdisallow.get(row);
    } // end of getSipdisallow

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getSipdisallow(row);
    }

    /**
     * fügt einen Sipdisallow hinzu
     * 
     * @param Sipdisallow
     *            aSipdisallow
     */
    public void addSipdisallow(Sipdisallow aSipdisallow) {
        listofSipdisallow.add(aSipdisallow);
        fireTableDataChanged();
    } // end of addSipdisallow

    /**
     * gibt einen neuen Sipdisallow zurück
     * 
     * @return Sipdisallow
     */
    public Sipdisallow newSipdisallow() {
        return new SipdisallowImpl();
    } // end of newSipdisallow

    /**
     * enfernt einen Sipdisallow
     * 
     * @param aSipdisallow
     *            Sipdisallow
     */
    public void removeSipdisallow(Sipdisallow aSipdisallow) {
        int index = listofSipdisallow.indexOf(aSipdisallow);
        listofSipdisallow.remove(index);
        fireTableDataChanged();
    } // end of removeSipdisallow

    /**
     * läd die Sipdisallow nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadSipdisallow(String sql) throws SQLException, Exception{
     * this.listofSipdisallow.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Sipdisallow newSipdisallow = new SipdisallowImpl();
     * newSipdisallow.loadComplete(set); listofSipdisallow.add(newSipdisallow); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadSipdisallow
     */
}
