package com.useit.jact.gui.misdndriverconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnCardsImpl;
import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdnCardsImpl;
//import com.useit.jact.model.dataModel.MisdnCards;

/**
 * <p>
 * MisdnCardsTableModel
 * </p>
 * Created : Fri Jan 06 13:19:31 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCardsTableModel.java,v 1.5 2006/01/09
 *          10:17:36 urs Exp $
 */
public class MisdnCardsTableModel extends AbstractSimpleTableModel {

    // private MisdnCards mMisdnCards;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "cardName", "cardType", "cardOptions", };

    /**
     * standart konstruktor
     */
    public MisdnCardsTableModel(String[] columnNames) {
        super();
        // mMisdnCards = new MisdnCardsImpl();
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
        MisdnCards aMisdnCards = (MisdnCards) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdnCards.getCardName();
        case 1:
            return aMisdnCards.getCardType();
        case 2:
            return aMisdnCards.getCardOptions();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return String.class;
        case 1:
            return MisdnCardTypes.class;
        case 2:
            return MCardOptionSet.class;
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
     * gibt einen MisdnCards zurück
     * 
     * @param row
     * @return MisdnCards
     */
    public MisdnCards getMisdnCards(int row) {
        return (MisdnCards) list.get(row);
    } // end of getMisdnCards

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdnCards(row);
    }

    /**
     * fügt einen MisdnCards hinzu
     * 
     * @param MisdnCards
     *            aMisdnCards
     */
    public void addMisdnCards(MisdnCards aMisdnCards) {
        list.add(aMisdnCards);
        fireTableDataChanged();
    } // end of addMisdnCards

    /**
     * gibt einen neuen MisdnCards zurück
     * 
     * @return MisdnCards
     */
    public MisdnCards newMisdnCards() {
        return new MisdnCardsImpl();
    } // end of newMisdnCards

    /**
     * enfernt einen MisdnCards
     * 
     * @param aMisdnCards
     *            MisdnCards
     */
    public void removeMisdnCards(MisdnCards aMisdnCards) {
        int index = list.indexOf(aMisdnCards);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdnCards

    /**
     * läd die MisdnCards nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdnCards(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MisdnCards newMisdnCards = new MisdnCardsImpl();
     * newMisdnCards.loadComplete(set); list.add(newMisdnCards); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdnCards
     */
}
