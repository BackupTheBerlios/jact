package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zapataconf.Multilink_PPP;
import com.useit.jact.model.zapataconf.Multilink_PPPImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Multilink_PPPImpl;
//import com.useit.jact.model.dataModel.Multilink_PPP;

/**
 * <p>
 * Multilink_PPPTableModel
 * </p>
 * Created : Fri Jan 06 13:22:58 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Multilink_PPPTableModel.java,v 1.7 2006/01/09
 *          10:17:36 urs Exp $
 */
public class Multilink_PPPTableModel extends AbstractSimpleTableModel {

    // private Multilink_PPP mMultilink_PPP;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "minunused", "minidle", "idledial", "idleext", };

    /**
     * standart konstruktor
     */
    public Multilink_PPPTableModel(String[] columnNames) {
        super();
        // mMultilink_PPP = new Multilink_PPPImpl();
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
        Multilink_PPP aMultilink_PPP = (Multilink_PPP) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMultilink_PPP.getMinunused();
        case 1:
            return aMultilink_PPP.getMinidle();
        case 2:
            return aMultilink_PPP.getIdledial();
        case 3:
            return aMultilink_PPP.getIdleext();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return Integer.class;
        case 2:
            return Integer.class;
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
     * gibt einen Multilink_PPP zurück
     * 
     * @param row
     * @return Multilink_PPP
     */
    public Multilink_PPP getMultilink_PPP(int row) {
        return (Multilink_PPP) list.get(row);
    } // end of getMultilink_PPP

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMultilink_PPP(row);
    }

    /**
     * fügt einen Multilink_PPP hinzu
     * 
     * @param Multilink_PPP
     *            aMultilink_PPP
     */
    public void addMultilink_PPP(Multilink_PPP aMultilink_PPP) {
        list.add(aMultilink_PPP);
        fireTableDataChanged();
    } // end of addMultilink_PPP

    /**
     * gibt einen neuen Multilink_PPP zurück
     * 
     * @return Multilink_PPP
     */
    public Multilink_PPP newMultilink_PPP() {
        return new Multilink_PPPImpl();
    } // end of newMultilink_PPP

    /**
     * enfernt einen Multilink_PPP
     * 
     * @param aMultilink_PPP
     *            Multilink_PPP
     */
    public void removeMultilink_PPP(Multilink_PPP aMultilink_PPP) {
        int index = list.indexOf(aMultilink_PPP);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMultilink_PPP

    /**
     * läd die Multilink_PPP nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMultilink_PPP(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Multilink_PPP newMultilink_PPP = new
     * Multilink_PPPImpl(); newMultilink_PPP.loadComplete(set);
     * list.add(newMultilink_PPP); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMultilink_PPP
     */
}
