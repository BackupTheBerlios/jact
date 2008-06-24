package com.useit.jact.gui.zapataconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.types.Switchtype;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;
import com.useit.jact.model.zapataconf.ISDN_PRI_SwitchImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ISDN_PRI_SwitchImpl;
//import com.useit.jact.model.dataModel.ISDN_PRI_Switch;

/**
 * <p>
 * ISDN_PRI_SwitchTableModel
 * </p>
 * Created : Fri Jan 06 13:22:53 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISDN_PRI_SwitchTableModel.java,v 1.7
 *          2006/01/09 10:17:36 urs Exp $
 */
public class ISDN_PRI_SwitchTableModel extends AbstractSimpleTableModel {

    // private ISDN_PRI_Switch mISDN_PRI_Switch;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "switchtype", "overlapdial", "pridialplan", "priindication", };

    /**
     * standart konstruktor
     */
    public ISDN_PRI_SwitchTableModel(String[] columnNames) {
        super();
        // mISDN_PRI_Switch = new ISDN_PRI_SwitchImpl();
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
        ISDN_PRI_Switch aISDN_PRI_Switch = (ISDN_PRI_Switch) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aISDN_PRI_Switch.getSwitchtype();
        case 1:
            return aISDN_PRI_Switch.getOverlapdial();
        case 2:
            return aISDN_PRI_Switch.getPridialplan();
        case 3:
            return aISDN_PRI_Switch.getPriindication();
        // case 4:return
        // DataClassRendere.displayString(aISDN_PRI_Switch.getMultilink_PPP());

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Switchtype.class;
        case 1:
            return String.class;
        case 2:
            return String.class;
        case 3:
            return String.class;
        // case 4:return String.class;
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
     * gibt einen ISDN_PRI_Switch zurück
     * 
     * @param row
     * @return ISDN_PRI_Switch
     */
    public ISDN_PRI_Switch getISDN_PRI_Switch(int row) {
        return (ISDN_PRI_Switch) list.get(row);
    } // end of getISDN_PRI_Switch

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getISDN_PRI_Switch(row);
    }

    /**
     * fügt einen ISDN_PRI_Switch hinzu
     * 
     * @param ISDN_PRI_Switch
     *            aISDN_PRI_Switch
     */
    public void addISDN_PRI_Switch(ISDN_PRI_Switch aISDN_PRI_Switch) {
        list.add(aISDN_PRI_Switch);
        fireTableDataChanged();
    } // end of addISDN_PRI_Switch

    /**
     * gibt einen neuen ISDN_PRI_Switch zurück
     * 
     * @return ISDN_PRI_Switch
     */
    public ISDN_PRI_Switch newISDN_PRI_Switch() {
        return new ISDN_PRI_SwitchImpl();
    } // end of newISDN_PRI_Switch

    /**
     * enfernt einen ISDN_PRI_Switch
     * 
     * @param aISDN_PRI_Switch
     *            ISDN_PRI_Switch
     */
    public void removeISDN_PRI_Switch(ISDN_PRI_Switch aISDN_PRI_Switch) {
        int index = list.indexOf(aISDN_PRI_Switch);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeISDN_PRI_Switch

    /**
     * läd die ISDN_PRI_Switch nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadISDN_PRI_Switch(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { ISDN_PRI_Switch newISDN_PRI_Switch = new
     * ISDN_PRI_SwitchImpl(); newISDN_PRI_Switch.loadComplete(set);
     * list.add(newISDN_PRI_Switch); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadISDN_PRI_Switch
     */
}
