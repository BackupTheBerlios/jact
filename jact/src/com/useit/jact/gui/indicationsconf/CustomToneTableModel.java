package com.useit.jact.gui.indicationsconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.CustomToneImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.CustomToneImpl;
//import com.useit.jact.model.dataModel.CustomTone;

/**
 * <p>
 * CustomToneTableModel
 * </p>
 * Created : Fri Jan 06 13:21:52 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: CustomToneTableModel.java,v 1.6 2006/01/09
 *          10:17:42 urs Exp $
 */
public class CustomToneTableModel extends AbstractSimpleTableModel {

    // private CustomTone mCustomTone;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "tonecode", "name", };

    /**
     * standart konstruktor
     */
    public CustomToneTableModel(String[] columnNames) {
        super();
        // mCustomTone = new CustomToneImpl();
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
        CustomTone aCustomTone = (CustomTone) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aCustomTone.getTonecode();
        case 1:
            return aCustomTone.getName();

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
     * gibt einen CustomTone zurück
     * 
     * @param row
     * @return CustomTone
     */
    public CustomTone getCustomTone(int row) {
        return (CustomTone) list.get(row);
    } // end of getCustomTone

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getCustomTone(row);
    }

    /**
     * fügt einen CustomTone hinzu
     * 
     * @param CustomTone
     *            aCustomTone
     */
    public void addCustomTone(CustomTone aCustomTone) {
        list.add(aCustomTone);
        fireTableDataChanged();
    } // end of addCustomTone

    /**
     * gibt einen neuen CustomTone zurück
     * 
     * @return CustomTone
     */
    public CustomTone newCustomTone() {
        return new CustomToneImpl();
    } // end of newCustomTone

    /**
     * enfernt einen CustomTone
     * 
     * @param aCustomTone
     *            CustomTone
     */
    public void removeCustomTone(CustomTone aCustomTone) {
        int index = list.indexOf(aCustomTone);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeCustomTone

    /**
     * läd die CustomTone nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadCustomTone(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { CustomTone newCustomTone = new CustomToneImpl();
     * newCustomTone.loadComplete(set); list.add(newCustomTone); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadCustomTone
     */
}
