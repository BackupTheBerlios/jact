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
import com.useit.jact.model.managerconf.GeneralSection;
import com.useit.jact.model.managerconf.GeneralSectionImpl;

/**
 * <p>
 * GeneralSectionTableModel
 * </p>
 * Created : Wed Aug 17 01:27:25 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GeneralSectionTableModel.java,v 1.5
 *          2005/09/20 14:02:04 urs Exp $
 */
public class GeneralSectionTableModel extends AbstractSimpleTableModel {

    private GeneralSection mGeneralSection;

    // private Connection con;
    private List listofGeneralSection = new Vector();

    private String[] columnNames = { // null;
    "Generalid", "Enabled", "Portno", "Bindaddr", "Port", };

    /**
     * standart konstruktor
     */
    public GeneralSectionTableModel(String[] columnNames) {
        super();
        mGeneralSection = new GeneralSectionImpl();
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
        return 5;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getRowCount()
     */
    public int getRowCount() {
        return listofGeneralSection.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        GeneralSection aGeneralSection = (GeneralSection) listofGeneralSection
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aGeneralSection.getGeneralid();
        case 1:
            return aGeneralSection.getEnabled();
        case 2:
            return aGeneralSection.getPortno();
        case 3:
            return aGeneralSection.getBindaddr();
        case 4:
            return aGeneralSection.getPort();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return Boolean.class;
        case 2:
            return Integer.class;
        case 3:
            return String.class;
        case 4:
            return Integer.class;
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
        listofGeneralSection.clear();
        listofGeneralSection.addAll(aMap.values());
        fireTableDataChanged();

    }

    /**
     * gibt einen GeneralSection zurück
     * 
     * @param row
     * @return GeneralSection
     */
    public GeneralSection getGeneralSection(int row) {
        return (GeneralSection) listofGeneralSection.get(row);
    } // end of getGeneralSection

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getGeneralSection(row);
    }

    /**
     * fügt einen GeneralSection hinzu
     * 
     * @param GeneralSection
     *            aGeneralSection
     */
    public void addGeneralSection(GeneralSection aGeneralSection) {
        listofGeneralSection.add(aGeneralSection);
        fireTableDataChanged();
    } // end of addGeneralSection

    /**
     * gibt einen neuen GeneralSection zurück
     * 
     * @return GeneralSection
     */
    public GeneralSection newGeneralSection() {
        return new GeneralSectionImpl();
    } // end of newGeneralSection

    /**
     * enfernt einen GeneralSection
     * 
     * @param aGeneralSection
     *            GeneralSection
     */
    public void removeGeneralSection(GeneralSection aGeneralSection) {
        int index = listofGeneralSection.indexOf(aGeneralSection);
        listofGeneralSection.remove(index);
        fireTableDataChanged();
    } // end of removeGeneralSection

    /**
     * läd die GeneralSection nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadGeneralSection(String sql) throws SQLException,
     * Exception{ this.listofGeneralSection.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { GeneralSection newGeneralSection = new
     * GeneralSectionImpl(); newGeneralSection.loadComplete(set);
     * listofGeneralSection.add(newGeneralSection); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadGeneralSection
     */
}
