package com.useit.jact.gui.misdnconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnPortsImpl;
import com.useit.jact.model.types.MisdnPortOptions;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdnPortsImpl;
//import com.useit.jact.model.dataModel.MisdnPorts;

/**
 * <p>
 * MisdnPortsTableModel
 * </p>
 * Created : Fri Jan 06 13:20:45 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPortsTableModel.java,v 1.8 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MisdnPortsTableModel extends AbstractSimpleTableModel {

    // private MisdnPorts mMisdnPorts;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "portN", "portOption", };

    /**
     * standart konstruktor
     */
    public MisdnPortsTableModel(String[] columnNames) {
        super();
        // mMisdnPorts = new MisdnPortsImpl();
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
        return 2;
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
        MisdnPorts aMisdnPorts = (MisdnPorts) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdnPorts.getPortN();
        case 1:
            return aMisdnPorts.getPortOption();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Integer.class;
        case 1:
            return MisdnPortOptions.class;
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
     * gibt einen MisdnPorts zurück
     * 
     * @param row
     * @return MisdnPorts
     */
    public MisdnPorts getMisdnPorts(int row) {
        return (MisdnPorts) list.get(row);
    } // end of getMisdnPorts

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdnPorts(row);
    }

    /**
     * fügt einen MisdnPorts hinzu
     * 
     * @param MisdnPorts
     *            aMisdnPorts
     */
    public void addMisdnPorts(MisdnPorts aMisdnPorts) {
        list.add(aMisdnPorts);
        fireTableDataChanged();
    } // end of addMisdnPorts

    /**
     * gibt einen neuen MisdnPorts zurück
     * 
     * @return MisdnPorts
     */
    public MisdnPorts newMisdnPorts() {
        return new MisdnPortsImpl();
    } // end of newMisdnPorts

    /**
     * enfernt einen MisdnPorts
     * 
     * @param aMisdnPorts
     *            MisdnPorts
     */
    public void removeMisdnPorts(MisdnPorts aMisdnPorts) {
        int index = list.indexOf(aMisdnPorts);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdnPorts

    /**
     * läd die MisdnPorts nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdnPorts(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MisdnPorts newMisdnPorts = new MisdnPortsImpl();
     * newMisdnPorts.loadComplete(set); list.add(newMisdnPorts); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdnPorts
     */
}
