package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;
import com.useit.jact.model.zapataconf.Analog_Trunk_FeaturesImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Analog_Trunk_FeaturesImpl;
//import com.useit.jact.model.dataModel.Analog_Trunk_Features;

/**
 * <p>
 * Analog_Trunk_FeaturesTableModel
 * </p>
 * Created : Fri Jan 06 13:22:48 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Trunk_FeaturesTableModel.java,v 1.7
 *          2006/01/09 10:17:36 urs Exp $
 */
public class Analog_Trunk_FeaturesTableModel extends AbstractSimpleTableModel {

    // private Analog_Trunk_Features mAnalog_Trunk_Features;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "usedistinctiveringdetection", "dring1", "dring2", "dring3",
            "dring1context", "dring2context", "dring3context", "busydetect",
            "busycount", "callprogress", "pulse", };

    /**
     * standart konstruktor
     */
    public Analog_Trunk_FeaturesTableModel(String[] columnNames) {
        super();
        // mAnalog_Trunk_Features = new Analog_Trunk_FeaturesImpl();
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
        Analog_Trunk_Features aAnalog_Trunk_Features = (Analog_Trunk_Features) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAnalog_Trunk_Features.getUsedistinctiveringdetection();
        case 1:
            return aAnalog_Trunk_Features.getDring1();
        case 2:
            return aAnalog_Trunk_Features.getDring2();
        case 3:
            return aAnalog_Trunk_Features.getDring3();
        case 4:
            return aAnalog_Trunk_Features.getDring1context();
        case 5:
            return aAnalog_Trunk_Features.getDring2context();
        case 6:
            return aAnalog_Trunk_Features.getDring3context();
        case 7:
            return aAnalog_Trunk_Features.getBusydetect();
        case 8:
            return aAnalog_Trunk_Features.getBusycount();
        case 9:
            return aAnalog_Trunk_Features.getCallprogress();
        case 10:
            return aAnalog_Trunk_Features.getPulse();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Boolean.class;
        case 1:
            return String.class;
        case 2:
            return String.class;
        case 3:
            return String.class;
        case 4:
            return String.class;
        case 5:
            return String.class;
        case 6:
            return String.class;
        case 7:
            return Boolean.class;
        case 8:
            return Integer.class;
        case 9:
            return Boolean.class;
        case 10:
            return Boolean.class;
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
     * gibt einen Analog_Trunk_Features zurück
     * 
     * @param row
     * @return Analog_Trunk_Features
     */
    public Analog_Trunk_Features getAnalog_Trunk_Features(int row) {
        return (Analog_Trunk_Features) list.get(row);
    } // end of getAnalog_Trunk_Features

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAnalog_Trunk_Features(row);
    }

    /**
     * fügt einen Analog_Trunk_Features hinzu
     * 
     * @param Analog_Trunk_Features
     *            aAnalog_Trunk_Features
     */
    public void addAnalog_Trunk_Features(
            Analog_Trunk_Features aAnalog_Trunk_Features) {
        list.add(aAnalog_Trunk_Features);
        fireTableDataChanged();
    } // end of addAnalog_Trunk_Features

    /**
     * gibt einen neuen Analog_Trunk_Features zurück
     * 
     * @return Analog_Trunk_Features
     */
    public Analog_Trunk_Features newAnalog_Trunk_Features() {
        return new Analog_Trunk_FeaturesImpl();
    } // end of newAnalog_Trunk_Features

    /**
     * enfernt einen Analog_Trunk_Features
     * 
     * @param aAnalog_Trunk_Features
     *            Analog_Trunk_Features
     */
    public void removeAnalog_Trunk_Features(
            Analog_Trunk_Features aAnalog_Trunk_Features) {
        int index = list.indexOf(aAnalog_Trunk_Features);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAnalog_Trunk_Features

    /**
     * läd die Analog_Trunk_Features nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAnalog_Trunk_Features(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Analog_Trunk_Features newAnalog_Trunk_Features = new
     * Analog_Trunk_FeaturesImpl(); newAnalog_Trunk_Features.loadComplete(set);
     * list.add(newAnalog_Trunk_Features); }
     * 
     * //end of while fireTableDataChanged(); } // end of
     * loadAnalog_Trunk_Features
     */
}
