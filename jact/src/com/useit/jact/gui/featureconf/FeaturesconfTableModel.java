package com.useit.jact.gui.featureconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.featureconf.Featuresconf;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.types.PbxContext;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.FeaturesconfImpl;
//import com.useit.jact.model.dataModel.Featuresconf;

/**
 * <p>
 * FeaturesconfTableModel
 * </p>
 * Created : Fri Jan 06 13:20:03 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturesconfTableModel.java,v 1.7 2006/01/09
 *          10:17:46 urs Exp $
 */
public class FeaturesconfTableModel extends AbstractSimpleTableModel {

    // private Featuresconf mFeaturesconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "parkext", "parkpos", "context", "parkingtime", "transferdigittimeout",
            "courtesytone", "xfersound", "xferfailsound", "adsipark",
            "pickupexten", "featuredigittimeout", };

    /**
     * standart konstruktor
     */
    public FeaturesconfTableModel(String[] columnNames) {
        super();
        // mFeaturesconf = new FeaturesconfImpl();
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
        Featuresconf aFeaturesconf = (Featuresconf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aFeaturesconf.getParkext();
        case 1:
            return aFeaturesconf.getParkpos();
        case 2:
            return aFeaturesconf.getContext();
        case 3:
            return aFeaturesconf.getParkingtime();
        case 4:
            return aFeaturesconf.getTransferdigittimeout();
        case 5:
            return aFeaturesconf.getCourtesytone();
        case 6:
            return aFeaturesconf.getXfersound();
        case 7:
            return aFeaturesconf.getXferfailsound();
        case 8:
            return aFeaturesconf.getAdsipark();
        case 9:
            return aFeaturesconf.getPickupexten();
        case 10:
            return aFeaturesconf.getFeaturedigittimeout();
        // case 11:return
        // DataClassRendere.displayString(aFeaturesconf.getFeaturemap());

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
            return PbxContext.class;
        case 3:
            return Integer.class;
        case 4:
            return Integer.class;
        case 5:
            return String.class;
        case 6:
            return String.class;
        case 7:
            return String.class;
        case 8:
            return Boolean.class;
        case 9:
            return String.class;
        case 10:
            return Integer.class;
        // case 11:return String.class;
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
     * gibt einen Featuresconf zurück
     * 
     * @param row
     * @return Featuresconf
     */
    public Featuresconf getFeaturesconf(int row) {
        return (Featuresconf) list.get(row);
    } // end of getFeaturesconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getFeaturesconf(row);
    }

    /**
     * fügt einen Featuresconf hinzu
     * 
     * @param Featuresconf
     *            aFeaturesconf
     */
    public void addFeaturesconf(Featuresconf aFeaturesconf) {
        list.add(aFeaturesconf);
        fireTableDataChanged();
    } // end of addFeaturesconf

    /**
     * gibt einen neuen Featuresconf zurück
     * 
     * @return Featuresconf
     */
    public Featuresconf newFeaturesconf() {
        return new FeaturesconfImpl();
    } // end of newFeaturesconf

    /**
     * enfernt einen Featuresconf
     * 
     * @param aFeaturesconf
     *            Featuresconf
     */
    public void removeFeaturesconf(Featuresconf aFeaturesconf) {
        int index = list.indexOf(aFeaturesconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeFeaturesconf

    /**
     * läd die Featuresconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadFeaturesconf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Featuresconf newFeaturesconf = new
     * FeaturesconfImpl(); newFeaturesconf.loadComplete(set);
     * list.add(newFeaturesconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadFeaturesconf
     */
}
