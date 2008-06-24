package com.useit.jact.gui.featureconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.FeaturemapImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.FeaturemapImpl;
//import com.useit.jact.model.dataModel.Featuremap;

/**
 * <p>
 * FeaturemapTableModel
 * </p>
 * Created : Fri Jan 06 13:20:00 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturemapTableModel.java,v 1.6 2006/01/09
 *          10:17:46 urs Exp $
 */
public class FeaturemapTableModel extends AbstractSimpleTableModel {

    // private Featuremap mFeaturemap;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "blindxfer", "disconnect", "automon", "atxfer", };

    /**
     * standart konstruktor
     */
    public FeaturemapTableModel(String[] columnNames) {
        super();
        // mFeaturemap = new FeaturemapImpl();
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
        return 4;
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
        Featuremap aFeaturemap = (Featuremap) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aFeaturemap.getBlindxfer();
        case 1:
            return aFeaturemap.getDisconnect();
        case 2:
            return aFeaturemap.getAutomon();
        case 3:
            return aFeaturemap.getAtxfer();

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
     * gibt einen Featuremap zurück
     * 
     * @param row
     * @return Featuremap
     */
    public Featuremap getFeaturemap(int row) {
        return (Featuremap) list.get(row);
    } // end of getFeaturemap

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getFeaturemap(row);
    }

    /**
     * fügt einen Featuremap hinzu
     * 
     * @param Featuremap
     *            aFeaturemap
     */
    public void addFeaturemap(Featuremap aFeaturemap) {
        list.add(aFeaturemap);
        fireTableDataChanged();
    } // end of addFeaturemap

    /**
     * gibt einen neuen Featuremap zurück
     * 
     * @return Featuremap
     */
    public Featuremap newFeaturemap() {
        return new FeaturemapImpl();
    } // end of newFeaturemap

    /**
     * enfernt einen Featuremap
     * 
     * @param aFeaturemap
     *            Featuremap
     */
    public void removeFeaturemap(Featuremap aFeaturemap) {
        int index = list.indexOf(aFeaturemap);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeFeaturemap

    /**
     * läd die Featuremap nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadFeaturemap(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Featuremap newFeaturemap = new FeaturemapImpl();
     * newFeaturemap.loadComplete(set); list.add(newFeaturemap); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadFeaturemap
     */
}
