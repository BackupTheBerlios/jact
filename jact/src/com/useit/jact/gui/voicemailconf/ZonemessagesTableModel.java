package com.useit.jact.gui.voicemailconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.voicemailconf.Zonemessages;
import com.useit.jact.model.voicemailconf.ZonemessagesImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZonemessagesImpl;
//import com.useit.jact.model.dataModel.Zonemessages;

/**
 * <p>
 * ZonemessagesTableModel
 * </p>
 * Created : Fri Jan 13 20:29:37 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZonemessagesTableModel.java,v 1.8 2006/01/14
 *          15:00:12 urs Exp $
 */
public class ZonemessagesTableModel extends AbstractSimpleTableModel {

    // private Zonemessages mZonemessages;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "timezonename", "country", "city", "options", };

    /**
     * standart konstruktor
     */
    public ZonemessagesTableModel(String[] columnNames) {
        super();
        // mZonemessages = new ZonemessagesImpl();
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
        Zonemessages aZonemessages = (Zonemessages) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZonemessages.getTimezonename();
        case 1:
            return aZonemessages.getCountry();
        case 2:
            return aZonemessages.getCity();
        case 3:
            return aZonemessages.getOptions();

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
     * gibt einen Zonemessages zurück
     * 
     * @param row
     * @return Zonemessages
     */
    public Zonemessages getZonemessages(int row) {
        return (Zonemessages) list.get(row);
    } // end of getZonemessages

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZonemessages(row);
    }

    /**
     * fügt einen Zonemessages hinzu
     * 
     * @param Zonemessages
     *            aZonemessages
     */
    public void addZonemessages(Zonemessages aZonemessages) {
        list.add(aZonemessages);
        fireTableDataChanged();
    } // end of addZonemessages

    /**
     * gibt einen neuen Zonemessages zurück
     * 
     * @return Zonemessages
     */
    public Zonemessages newZonemessages() {
        return new ZonemessagesImpl();
    } // end of newZonemessages

    /**
     * enfernt einen Zonemessages
     * 
     * @param aZonemessages
     *            Zonemessages
     */
    public void removeZonemessages(Zonemessages aZonemessages) {
        int index = list.indexOf(aZonemessages);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZonemessages

    /**
     * läd die Zonemessages nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZonemessages(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zonemessages newZonemessages = new
     * ZonemessagesImpl(); newZonemessages.loadComplete(set);
     * list.add(newZonemessages); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZonemessages
     */
}
