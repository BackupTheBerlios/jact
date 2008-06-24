package com.useit.jact.gui.zaptelconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.ZaptelspanImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZaptelspanImpl;
//import com.useit.jact.model.dataModel.Zaptelspan;

/**
 * <p>
 * ZaptelspanTableModel
 * </p>
 * Created : Fri Jan 06 13:20:23 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelspanTableModel.java,v 1.7 2006/01/09
 *          10:17:34 urs Exp $
 */
public class ZaptelspanTableModel extends AbstractSimpleTableModel {

    // private Zaptelspan mZaptelspan;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "span_num", "timing", "lbo", "framing", "coding", "yellow", };

    /**
     * standart konstruktor
     */
    public ZaptelspanTableModel(String[] columnNames) {
        super();
        // mZaptelspan = new ZaptelspanImpl();
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
        return 6;
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
        Zaptelspan aZaptelspan = (Zaptelspan) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZaptelspan.getSpan_num();
        case 1:
            return aZaptelspan.getTiming();
        case 2:
            return aZaptelspan.getLbo();
        case 3:
            return aZaptelspan.getFraming();
        case 4:
            return aZaptelspan.getCoding();
        case 5:
            return aZaptelspan.getYellow();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Integer.class;
        case 1:
            return Integer.class;
        case 2:
            return Integer.class;
        case 3:
            return String.class;
        case 4:
            return String.class;
        case 5:
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
     * gibt einen Zaptelspan zurück
     * 
     * @param row
     * @return Zaptelspan
     */
    public Zaptelspan getZaptelspan(int row) {
        return (Zaptelspan) list.get(row);
    } // end of getZaptelspan

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZaptelspan(row);
    }

    /**
     * fügt einen Zaptelspan hinzu
     * 
     * @param Zaptelspan
     *            aZaptelspan
     */
    public void addZaptelspan(Zaptelspan aZaptelspan) {
        list.add(aZaptelspan);
        fireTableDataChanged();
    } // end of addZaptelspan

    /**
     * gibt einen neuen Zaptelspan zurück
     * 
     * @return Zaptelspan
     */
    public Zaptelspan newZaptelspan() {
        return new ZaptelspanImpl();
    } // end of newZaptelspan

    /**
     * enfernt einen Zaptelspan
     * 
     * @param aZaptelspan
     *            Zaptelspan
     */
    public void removeZaptelspan(Zaptelspan aZaptelspan) {
        int index = list.indexOf(aZaptelspan);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZaptelspan

    /**
     * läd die Zaptelspan nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZaptelspan(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zaptelspan newZaptelspan = new ZaptelspanImpl();
     * newZaptelspan.loadComplete(set); list.add(newZaptelspan); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZaptelspan
     */
}
