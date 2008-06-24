package com.useit.jact.gui.iaxconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.IaxjitterImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IaxjitterImpl;
//import com.useit.jact.model.dataModel.Iaxjitter;

/**
 * <p>
 * IaxjitterTableModel
 * </p>
 * Created : Fri Jan 06 13:18:52 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxjitterTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class IaxjitterTableModel extends AbstractSimpleTableModel {

    // private Iaxjitter mIaxjitter;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "jitterbuffer", "forcejitterbuffer", "dropcount", "maxjitterbuffer",
            "resyncthreshold", "maxjitterinterps", "maxexcessbuffer",
            "minexcessbuffer", "jittershrinkrate", };

    /**
     * standart konstruktor
     */
    public IaxjitterTableModel(String[] columnNames) {
        super();
        // mIaxjitter = new IaxjitterImpl();
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
        return 9;
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
        Iaxjitter aIaxjitter = (Iaxjitter) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aIaxjitter.getJitterbuffer();
        case 1:
            return aIaxjitter.getForcejitterbuffer();
        case 2:
            return aIaxjitter.getDropcount();
        case 3:
            return aIaxjitter.getMaxjitterbuffer();
        case 4:
            return aIaxjitter.getResyncthreshold();
        case 5:
            return aIaxjitter.getMaxjitterinterps();
        case 6:
            return aIaxjitter.getMaxexcessbuffer();
        case 7:
            return aIaxjitter.getMinexcessbuffer();
        case 8:
            return aIaxjitter.getJittershrinkrate();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Boolean.class;
        case 1:
            return Boolean.class;
        case 2:
            return Integer.class;
        case 3:
            return Integer.class;
        case 4:
            return Integer.class;
        case 5:
            return Integer.class;
        case 6:
            return Integer.class;
        case 7:
            return Integer.class;
        case 8:
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
     * gibt einen Iaxjitter zurück
     * 
     * @param row
     * @return Iaxjitter
     */
    public Iaxjitter getIaxjitter(int row) {
        return (Iaxjitter) list.get(row);
    } // end of getIaxjitter

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getIaxjitter(row);
    }

    /**
     * fügt einen Iaxjitter hinzu
     * 
     * @param Iaxjitter
     *            aIaxjitter
     */
    public void addIaxjitter(Iaxjitter aIaxjitter) {
        list.add(aIaxjitter);
        fireTableDataChanged();
    } // end of addIaxjitter

    /**
     * gibt einen neuen Iaxjitter zurück
     * 
     * @return Iaxjitter
     */
    public Iaxjitter newIaxjitter() {
        return new IaxjitterImpl();
    } // end of newIaxjitter

    /**
     * enfernt einen Iaxjitter
     * 
     * @param aIaxjitter
     *            Iaxjitter
     */
    public void removeIaxjitter(Iaxjitter aIaxjitter) {
        int index = list.indexOf(aIaxjitter);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeIaxjitter

    /**
     * läd die Iaxjitter nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadIaxjitter(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Iaxjitter newIaxjitter = new IaxjitterImpl();
     * newIaxjitter.loadComplete(set); list.add(newIaxjitter); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadIaxjitter
     */
}
