package com.useit.jact.gui.iaxconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.IaxdenyImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IaxdenyImpl;
//import com.useit.jact.model.dataModel.Iaxdeny;

/**
 * <p>
 * IaxdenyTableModel
 * </p>
 * Created : Fri Jan 06 13:18:57 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxdenyTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class IaxdenyTableModel extends AbstractSimpleTableModel {

    // private Iaxdeny mIaxdeny;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "value", };

    /**
     * standart konstruktor
     */
    public IaxdenyTableModel(String[] columnNames) {
        super();
        // mIaxdeny = new IaxdenyImpl();
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
        return list.size();
    }

    /*
     * (Kein Javadoc)
     * 
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    public Object getValueAt(int rowIndex, int columnIndex) {
        Iaxdeny aIaxdeny = (Iaxdeny) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIaxdeny.getValue();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
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
     * gibt einen Iaxdeny zurück
     * 
     * @param row
     * @return Iaxdeny
     */
    public Iaxdeny getIaxdeny(int row) {
        return (Iaxdeny) list.get(row);
    } // end of getIaxdeny

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIaxdeny(row);
    }

    /**
     * fügt einen Iaxdeny hinzu
     * 
     * @param Iaxdeny
     *            aIaxdeny
     */
    public void addIaxdeny(Iaxdeny aIaxdeny) {
        list.add(aIaxdeny);
        fireTableDataChanged();
    } // end of addIaxdeny

    /**
     * gibt einen neuen Iaxdeny zurück
     * 
     * @return Iaxdeny
     */
    public Iaxdeny newIaxdeny() {
        return new IaxdenyImpl();
    } // end of newIaxdeny

    /**
     * enfernt einen Iaxdeny
     * 
     * @param aIaxdeny
     *            Iaxdeny
     */
    public void removeIaxdeny(Iaxdeny aIaxdeny) {
        int index = list.indexOf(aIaxdeny);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIaxdeny

    /**
     * läd die Iaxdeny nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIaxdeny(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Iaxdeny newIaxdeny = new IaxdenyImpl();
     * newIaxdeny.loadComplete(set); list.add(newIaxdeny); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIaxdeny
     */
}
