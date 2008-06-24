package com.useit.jact.gui.zaptelconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.ZapteldynamicspanImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ZapteldynamicspanImpl;
//import com.useit.jact.model.dataModel.Zapteldynamicspan;

/**
 * <p>
 * ZapteldynamicspanTableModel
 * </p>
 * Created : Fri Jan 06 13:20:27 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteldynamicspanTableModel.java,v 1.7
 *          2006/01/09 10:17:34 urs Exp $
 */
public class ZapteldynamicspanTableModel extends AbstractSimpleTableModel {

    // private Zapteldynamicspan mZapteldynamicspan;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "driver", "address", "numchans", "timing", };

    /**
     * standart konstruktor
     */
    public ZapteldynamicspanTableModel(String[] columnNames) {
        super();
        // mZapteldynamicspan = new ZapteldynamicspanImpl();
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
        Zapteldynamicspan aZapteldynamicspan = (Zapteldynamicspan) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aZapteldynamicspan.getDriver();
        case 1:
            return aZapteldynamicspan.getAddress();
        case 2:
            return aZapteldynamicspan.getNumchans();
        case 3:
            return aZapteldynamicspan.getTiming();

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
            return Integer.class;
        case 3:
            return Integer.class;
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
     * gibt einen Zapteldynamicspan zurück
     * 
     * @param row
     * @return Zapteldynamicspan
     */
    public Zapteldynamicspan getZapteldynamicspan(int row) {
        return (Zapteldynamicspan) list.get(row);
    } // end of getZapteldynamicspan

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getZapteldynamicspan(row);
    }

    /**
     * fügt einen Zapteldynamicspan hinzu
     * 
     * @param Zapteldynamicspan
     *            aZapteldynamicspan
     */
    public void addZapteldynamicspan(Zapteldynamicspan aZapteldynamicspan) {
        list.add(aZapteldynamicspan);
        fireTableDataChanged();
    } // end of addZapteldynamicspan

    /**
     * gibt einen neuen Zapteldynamicspan zurück
     * 
     * @return Zapteldynamicspan
     */
    public Zapteldynamicspan newZapteldynamicspan() {
        return new ZapteldynamicspanImpl();
    } // end of newZapteldynamicspan

    /**
     * enfernt einen Zapteldynamicspan
     * 
     * @param aZapteldynamicspan
     *            Zapteldynamicspan
     */
    public void removeZapteldynamicspan(Zapteldynamicspan aZapteldynamicspan) {
        int index = list.indexOf(aZapteldynamicspan);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeZapteldynamicspan

    /**
     * läd die Zapteldynamicspan nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadZapteldynamicspan(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Zapteldynamicspan newZapteldynamicspan = new
     * ZapteldynamicspanImpl(); newZapteldynamicspan.loadComplete(set);
     * list.add(newZapteldynamicspan); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadZapteldynamicspan
     */
}
