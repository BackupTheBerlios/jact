package com.useit.jact.gui.musiconholdconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.Music_on_HoldConfImpl;
//import com.useit.jact.model.dataModel.Music_on_HoldConf;

/**
 * <p>
 * Music_on_HoldConfTableModel
 * </p>
 * Created : Fri Jan 06 13:20:10 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Music_on_HoldConfTableModel.java,v 1.7
 *          2006/01/09 10:17:42 urs Exp $
 */
public class Music_on_HoldConfTableModel extends AbstractSimpleTableModel {

    // private Music_on_HoldConf mMusic_on_HoldConf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    };

    /**
     * standart konstruktor
     */
    public Music_on_HoldConfTableModel(String[] columnNames) {
        super();
        // mMusic_on_HoldConf = new Music_on_HoldConfImpl();
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
        return 0;
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
        Music_on_HoldConf aMusic_on_HoldConf = (Music_on_HoldConf) list
                .get(rowIndex);
        switch (columnIndex) {

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
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
     * gibt einen Music_on_HoldConf zurück
     * 
     * @param row
     * @return Music_on_HoldConf
     */
    public Music_on_HoldConf getMusic_on_HoldConf(int row) {
        return (Music_on_HoldConf) list.get(row);
    } // end of getMusic_on_HoldConf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMusic_on_HoldConf(row);
    }

    /**
     * fügt einen Music_on_HoldConf hinzu
     * 
     * @param Music_on_HoldConf
     *            aMusic_on_HoldConf
     */
    public void addMusic_on_HoldConf(Music_on_HoldConf aMusic_on_HoldConf) {
        list.add(aMusic_on_HoldConf);
        fireTableDataChanged();
    } // end of addMusic_on_HoldConf

    /**
     * gibt einen neuen Music_on_HoldConf zurück
     * 
     * @return Music_on_HoldConf
     */
    public Music_on_HoldConf newMusic_on_HoldConf() {
        return new Music_on_HoldConfImpl();
    } // end of newMusic_on_HoldConf

    /**
     * enfernt einen Music_on_HoldConf
     * 
     * @param aMusic_on_HoldConf
     *            Music_on_HoldConf
     */
    public void removeMusic_on_HoldConf(Music_on_HoldConf aMusic_on_HoldConf) {
        int index = list.indexOf(aMusic_on_HoldConf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMusic_on_HoldConf

    /**
     * läd die Music_on_HoldConf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMusic_on_HoldConf(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Music_on_HoldConf newMusic_on_HoldConf = new
     * Music_on_HoldConfImpl(); newMusic_on_HoldConf.loadComplete(set);
     * list.add(newMusic_on_HoldConf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMusic_on_HoldConf
     */
}
