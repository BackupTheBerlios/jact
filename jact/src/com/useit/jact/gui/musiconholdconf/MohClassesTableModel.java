package com.useit.jact.gui.musiconholdconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.MohClassesImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MohClassesImpl;
//import com.useit.jact.model.dataModel.MohClasses;

/**
 * <p>
 * MohClassesTableModel
 * </p>
 * Created : Fri Jan 06 13:20:07 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MohClassesTableModel.java,v 1.6 2006/01/09
 *          10:17:42 urs Exp $
 */
public class MohClassesTableModel extends AbstractSimpleTableModel {

    // private MohClasses mMohClasses;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "name", "player", "mohdir", "mohpara", };

    /**
     * standart konstruktor
     */
    public MohClassesTableModel(String[] columnNames) {
        super();
        // mMohClasses = new MohClassesImpl();
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
        MohClasses aMohClasses = (MohClasses) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMohClasses.getName();
        case 1:
            return aMohClasses.getPlayer();
        case 2:
            return aMohClasses.getMohdir();
        case 3:
            return aMohClasses.getMohpara();

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
     * gibt einen MohClasses zurück
     * 
     * @param row
     * @return MohClasses
     */
    public MohClasses getMohClasses(int row) {
        return (MohClasses) list.get(row);
    } // end of getMohClasses

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMohClasses(row);
    }

    /**
     * fügt einen MohClasses hinzu
     * 
     * @param MohClasses
     *            aMohClasses
     */
    public void addMohClasses(MohClasses aMohClasses) {
        list.add(aMohClasses);
        fireTableDataChanged();
    } // end of addMohClasses

    /**
     * gibt einen neuen MohClasses zurück
     * 
     * @return MohClasses
     */
    public MohClasses newMohClasses() {
        return new MohClassesImpl();
    } // end of newMohClasses

    /**
     * enfernt einen MohClasses
     * 
     * @param aMohClasses
     *            MohClasses
     */
    public void removeMohClasses(MohClasses aMohClasses) {
        int index = list.indexOf(aMohClasses);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMohClasses

    /**
     * läd die MohClasses nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMohClasses(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MohClasses newMohClasses = new MohClassesImpl();
     * newMohClasses.loadComplete(set); list.add(newMohClasses); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMohClasses
     */
}
