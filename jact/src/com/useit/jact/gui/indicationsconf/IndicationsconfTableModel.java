package com.useit.jact.gui.indicationsconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IndicationsconfImpl;
//import com.useit.jact.model.dataModel.Indicationsconf;

/**
 * <p>
 * IndicationsconfTableModel
 * </p>
 * Created : Fri Jan 06 13:21:56 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IndicationsconfTableModel.java,v 1.6
 *          2006/01/09 10:17:42 urs Exp $
 */
public class IndicationsconfTableModel extends AbstractSimpleTableModel {

    // private Indicationsconf mIndicationsconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "country", };

    /**
     * standart konstruktor
     */
    public IndicationsconfTableModel(String[] columnNames) {
        super();
        // mIndicationsconf = new IndicationsconfImpl();
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
        Indicationsconf aIndicationsconf = (Indicationsconf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIndicationsconf.getCountry();

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
     * gibt einen Indicationsconf zurück
     * 
     * @param row
     * @return Indicationsconf
     */
    public Indicationsconf getIndicationsconf(int row) {
        return (Indicationsconf) list.get(row);
    } // end of getIndicationsconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIndicationsconf(row);
    }

    /**
     * fügt einen Indicationsconf hinzu
     * 
     * @param Indicationsconf
     *            aIndicationsconf
     */
    public void addIndicationsconf(Indicationsconf aIndicationsconf) {
        list.add(aIndicationsconf);
        fireTableDataChanged();
    } // end of addIndicationsconf

    /**
     * gibt einen neuen Indicationsconf zurück
     * 
     * @return Indicationsconf
     */
    public Indicationsconf newIndicationsconf() {
        return new IndicationsconfImpl();
    } // end of newIndicationsconf

    /**
     * enfernt einen Indicationsconf
     * 
     * @param aIndicationsconf
     *            Indicationsconf
     */
    public void removeIndicationsconf(Indicationsconf aIndicationsconf) {
        int index = list.indexOf(aIndicationsconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIndicationsconf

    /**
     * läd die Indicationsconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIndicationsconf(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Indicationsconf newIndicationsconf = new
     * IndicationsconfImpl(); newIndicationsconf.loadComplete(set);
     * list.add(newIndicationsconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIndicationsconf
     */
}
