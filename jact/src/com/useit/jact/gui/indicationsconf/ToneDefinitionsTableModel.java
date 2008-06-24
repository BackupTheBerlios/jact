package com.useit.jact.gui.indicationsconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.indicationsconf.ToneDefinitions;
import com.useit.jact.model.indicationsconf.ToneDefinitionsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ToneDefinitionsImpl;
//import com.useit.jact.model.dataModel.ToneDefinitions;

/**
 * <p>
 * ToneDefinitionsTableModel
 * </p>
 * Created : Fri Jan 06 13:21:48 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ToneDefinitionsTableModel.java,v 1.6
 *          2006/01/09 10:17:42 urs Exp $
 */
public class ToneDefinitionsTableModel extends AbstractSimpleTableModel {

    // private ToneDefinitions mToneDefinitions;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "countrycode", "description", "alias", "ringcadence", "dial", "busy",
            "ring", "congestion", "callwaiting", "dialrecall", "record",
            "info", };

    /**
     * standart konstruktor
     */
    public ToneDefinitionsTableModel(String[] columnNames) {
        super();
        // mToneDefinitions = new ToneDefinitionsImpl();
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
        return 12;
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
        ToneDefinitions aToneDefinitions = (ToneDefinitions) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aToneDefinitions.getCountrycode();
        case 1:
            return aToneDefinitions.getDescription();
        case 2:
            return aToneDefinitions.getAlias();
        case 3:
            return aToneDefinitions.getRingcadence();
        case 4:
            return aToneDefinitions.getDial();
        case 5:
            return aToneDefinitions.getBusy();
        case 6:
            return aToneDefinitions.getRing();
        case 7:
            return aToneDefinitions.getCongestion();
        case 8:
            return aToneDefinitions.getCallwaiting();
        case 9:
            return aToneDefinitions.getDialrecall();
        case 10:
            return aToneDefinitions.getRecord();
        case 11:
            return aToneDefinitions.getInfo();

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
        case 3:
            return String.class;
        case 4:
            return String.class;
        case 5:
            return String.class;
        case 6:
            return String.class;
        case 7:
            return String.class;
        case 8:
            return String.class;
        case 9:
            return String.class;
        case 10:
            return String.class;
        case 11:
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
     * gibt einen ToneDefinitions zurück
     * 
     * @param row
     * @return ToneDefinitions
     */
    public ToneDefinitions getToneDefinitions(int row) {
        return (ToneDefinitions) list.get(row);
    } // end of getToneDefinitions

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getToneDefinitions(row);
    }

    /**
     * fügt einen ToneDefinitions hinzu
     * 
     * @param ToneDefinitions
     *            aToneDefinitions
     */
    public void addToneDefinitions(ToneDefinitions aToneDefinitions) {
        list.add(aToneDefinitions);
        fireTableDataChanged();
    } // end of addToneDefinitions

    /**
     * gibt einen neuen ToneDefinitions zurück
     * 
     * @return ToneDefinitions
     */
    public ToneDefinitions newToneDefinitions() {
        return new ToneDefinitionsImpl();
    } // end of newToneDefinitions

    /**
     * enfernt einen ToneDefinitions
     * 
     * @param aToneDefinitions
     *            ToneDefinitions
     */
    public void removeToneDefinitions(ToneDefinitions aToneDefinitions) {
        int index = list.indexOf(aToneDefinitions);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeToneDefinitions

    /**
     * läd die ToneDefinitions nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadToneDefinitions(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { ToneDefinitions newToneDefinitions = new
     * ToneDefinitionsImpl(); newToneDefinitions.loadComplete(set);
     * list.add(newToneDefinitions); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadToneDefinitions
     */
}
