package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Analog_Handset_Features;
import com.useit.jact.model.zapataconf.Analog_Handset_FeaturesImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Analog_Handset_FeaturesImpl;
//import com.useit.jact.model.dataModel.Analog_Handset_Features;

/**
 * <p>
 * Analog_Handset_FeaturesTableModel
 * </p>
 * Created : Fri Jan 06 13:22:37 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Handset_FeaturesTableModel.java,v 1.7
 *          2006/01/09 10:17:36 urs Exp $
 */
public class Analog_Handset_FeaturesTableModel extends AbstractSimpleTableModel {

    // private Analog_Handset_Features mAnalog_Handset_Features;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "adsi", "immediate", "callwaiting", "callwaitingcallerid",
            "threewaycalling", "transfer", "cancallforward", "callreturn",
            "callgroup", "pickupgroup", "useincomingcalleridonzaptransfer", };

    /**
     * standart konstruktor
     */
    public Analog_Handset_FeaturesTableModel(String[] columnNames) {
        super();
        // mAnalog_Handset_Features = new Analog_Handset_FeaturesImpl();
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
        return 11;
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
        Analog_Handset_Features aAnalog_Handset_Features = (Analog_Handset_Features) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAnalog_Handset_Features.getAdsi();
        case 1:
            return aAnalog_Handset_Features.getImmediate();
        case 2:
            return aAnalog_Handset_Features.getCallwaiting();
        case 3:
            return aAnalog_Handset_Features.getCallwaitingcallerid();
        case 4:
            return aAnalog_Handset_Features.getThreewaycalling();
        case 5:
            return aAnalog_Handset_Features.getTransfer();
        case 6:
            return aAnalog_Handset_Features.getCancallforward();
        case 7:
            return aAnalog_Handset_Features.getCallreturn();
        case 8:
            return aAnalog_Handset_Features.getCallgroup();
        case 9:
            return aAnalog_Handset_Features.getPickupgroup();
        case 10:
            return aAnalog_Handset_Features
                    .getUseincomingcalleridonzaptransfer();

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
            return Boolean.class;
        case 3:
            return Boolean.class;
        case 4:
            return Boolean.class;
        case 5:
            return Boolean.class;
        case 6:
            return Boolean.class;
        case 7:
            return Boolean.class;
        case 8:
            return String.class;
        case 9:
            return String.class;
        case 10:
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
     * gibt einen Analog_Handset_Features zurück
     * 
     * @param row
     * @return Analog_Handset_Features
     */
    public Analog_Handset_Features getAnalog_Handset_Features(int row) {
        return (Analog_Handset_Features) list.get(row);
    } // end of getAnalog_Handset_Features

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAnalog_Handset_Features(row);
    }

    /**
     * fügt einen Analog_Handset_Features hinzu
     * 
     * @param Analog_Handset_Features
     *            aAnalog_Handset_Features
     */
    public void addAnalog_Handset_Features(
            Analog_Handset_Features aAnalog_Handset_Features) {
        list.add(aAnalog_Handset_Features);
        fireTableDataChanged();
    } // end of addAnalog_Handset_Features

    /**
     * gibt einen neuen Analog_Handset_Features zurück
     * 
     * @return Analog_Handset_Features
     */
    public Analog_Handset_Features newAnalog_Handset_Features() {
        return new Analog_Handset_FeaturesImpl();
    } // end of newAnalog_Handset_Features

    /**
     * enfernt einen Analog_Handset_Features
     * 
     * @param aAnalog_Handset_Features
     *            Analog_Handset_Features
     */
    public void removeAnalog_Handset_Features(
            Analog_Handset_Features aAnalog_Handset_Features) {
        int index = list.indexOf(aAnalog_Handset_Features);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAnalog_Handset_Features

    /**
     * läd die Analog_Handset_Features nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAnalog_Handset_Features(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Analog_Handset_Features newAnalog_Handset_Features =
     * new Analog_Handset_FeaturesImpl();
     * newAnalog_Handset_Features.loadComplete(set);
     * list.add(newAnalog_Handset_Features); }
     * 
     * //end of while fireTableDataChanged(); } // end of
     * loadAnalog_Handset_Features
     */
}
