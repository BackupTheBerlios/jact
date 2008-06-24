package com.useit.jact.gui.misdndriverconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;
import com.useit.jact.model.misdndriverconf.MisdncardPortsImpl;
import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnPortOptions;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdncardPortsImpl;
//import com.useit.jact.model.dataModel.MisdncardPorts;

/**
 * <p>
 * MisdncardPortsTableModel
 * </p>
 * Created : Fri Jan 06 13:19:27 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdncardPortsTableModel.java,v 1.5
 *          2006/01/09 10:17:36 urs Exp $
 */
public class MisdncardPortsTableModel extends AbstractSimpleTableModel {

    // private MisdncardPorts mMisdncardPorts;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "portN", "portOption", "mPortOption", };

    /**
     * standart konstruktor
     */
    public MisdncardPortsTableModel(String[] columnNames) {
        super();
        // mMisdncardPorts = new MisdncardPortsImpl();
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
        return 3;
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
        MisdncardPorts aMisdncardPorts = (MisdncardPorts) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdncardPorts.getPortN();
        case 1:
            return aMisdncardPorts.getPortOption();
        case 2:
            return aMisdncardPorts.getMPortOption();

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
        case 2:
            return MPortOptionSet.class;
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
     * gibt einen MisdncardPorts zurück
     * 
     * @param row
     * @return MisdncardPorts
     */
    public MisdncardPorts getMisdncardPorts(int row) {
        return (MisdncardPorts) list.get(row);
    } // end of getMisdncardPorts

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdncardPorts(row);
    }

    /**
     * fügt einen MisdncardPorts hinzu
     * 
     * @param MisdncardPorts
     *            aMisdncardPorts
     */
    public void addMisdncardPorts(MisdncardPorts aMisdncardPorts) {
        list.add(aMisdncardPorts);
        fireTableDataChanged();
    } // end of addMisdncardPorts

    /**
     * gibt einen neuen MisdncardPorts zurück
     * 
     * @return MisdncardPorts
     */
    public MisdncardPorts newMisdncardPorts() {
        return new MisdncardPortsImpl();
    } // end of newMisdncardPorts

    /**
     * enfernt einen MisdncardPorts
     * 
     * @param aMisdncardPorts
     *            MisdncardPorts
     */
    public void removeMisdncardPorts(MisdncardPorts aMisdncardPorts) {
        int index = list.indexOf(aMisdncardPorts);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdncardPorts

    /**
     * läd die MisdncardPorts nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdncardPorts(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MisdncardPorts newMisdncardPorts = new
     * MisdncardPortsImpl(); newMisdncardPorts.loadComplete(set);
     * list.add(newMisdncardPorts); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdncardPorts
     */
}
