package com.useit.jact.gui.iaxconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.IaxpermitImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IaxpermitImpl;
//import com.useit.jact.model.dataModel.Iaxpermit;

/**
 * <p>
 * IaxpermitTableModel
 * </p>
 * Created : Fri Jan 06 13:19:01 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpermitTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class IaxpermitTableModel extends AbstractSimpleTableModel {

    // private Iaxpermit mIaxpermit;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "value", };

    /**
     * standart konstruktor
     */
    public IaxpermitTableModel(String[] columnNames) {
        super();
        // mIaxpermit = new IaxpermitImpl();
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
        Iaxpermit aIaxpermit = (Iaxpermit) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIaxpermit.getValue();

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
     * gibt einen Iaxpermit zurück
     * 
     * @param row
     * @return Iaxpermit
     */
    public Iaxpermit getIaxpermit(int row) {
        return (Iaxpermit) list.get(row);
    } // end of getIaxpermit

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIaxpermit(row);
    }

    /**
     * fügt einen Iaxpermit hinzu
     * 
     * @param Iaxpermit
     *            aIaxpermit
     */
    public void addIaxpermit(Iaxpermit aIaxpermit) {
        list.add(aIaxpermit);
        fireTableDataChanged();
    } // end of addIaxpermit

    /**
     * gibt einen neuen Iaxpermit zurück
     * 
     * @return Iaxpermit
     */
    public Iaxpermit newIaxpermit() {
        return new IaxpermitImpl();
    } // end of newIaxpermit

    /**
     * enfernt einen Iaxpermit
     * 
     * @param aIaxpermit
     *            Iaxpermit
     */
    public void removeIaxpermit(Iaxpermit aIaxpermit) {
        int index = list.indexOf(aIaxpermit);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIaxpermit

    /**
     * läd die Iaxpermit nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIaxpermit(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Iaxpermit newIaxpermit = new IaxpermitImpl();
     * newIaxpermit.loadComplete(set); list.add(newIaxpermit); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIaxpermit
     */
}
