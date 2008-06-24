package com.useit.jact.gui.iaxconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.iaxconf.Iaxregister;
import com.useit.jact.model.iaxconf.IaxregisterImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IaxregisterImpl;
//import com.useit.jact.model.dataModel.Iaxregister;

/**
 * <p>
 * IaxregisterTableModel
 * </p>
 * Created : Fri Jan 06 13:18:54 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxregisterTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class IaxregisterTableModel extends AbstractSimpleTableModel {

    // private Iaxregister mIaxregister;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "user", "authuser", "secret", "host", "port", "extension", };

    /**
     * standart konstruktor
     */
    public IaxregisterTableModel(String[] columnNames) {
        super();
        // mIaxregister = new IaxregisterImpl();
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
        Iaxregister aIaxregister = (Iaxregister) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIaxregister.getUser();
        case 1:
            return aIaxregister.getAuthuser();
        case 2:
            return aIaxregister.getSecret();
        case 3:
            return aIaxregister.getHost();
        case 4:
            return aIaxregister.getPort();
        case 5:
            return aIaxregister.getExtension();

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
        case 4:
            return Integer.class;
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
     * gibt einen Iaxregister zurück
     * 
     * @param row
     * @return Iaxregister
     */
    public Iaxregister getIaxregister(int row) {
        return (Iaxregister) list.get(row);
    } // end of getIaxregister

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIaxregister(row);
    }

    /**
     * fügt einen Iaxregister hinzu
     * 
     * @param Iaxregister
     *            aIaxregister
     */
    public void addIaxregister(Iaxregister aIaxregister) {
        list.add(aIaxregister);
        fireTableDataChanged();
    } // end of addIaxregister

    /**
     * gibt einen neuen Iaxregister zurück
     * 
     * @return Iaxregister
     */
    public Iaxregister newIaxregister() {
        return new IaxregisterImpl();
    } // end of newIaxregister

    /**
     * enfernt einen Iaxregister
     * 
     * @param aIaxregister
     *            Iaxregister
     */
    public void removeIaxregister(Iaxregister aIaxregister) {
        int index = list.indexOf(aIaxregister);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIaxregister

    /**
     * läd die Iaxregister nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIaxregister(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Iaxregister newIaxregister = new IaxregisterImpl();
     * newIaxregister.loadComplete(set); list.add(newIaxregister); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIaxregister
     */
}
