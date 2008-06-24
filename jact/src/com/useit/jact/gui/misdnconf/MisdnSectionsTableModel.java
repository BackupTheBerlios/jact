package com.useit.jact.gui.misdnconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.MisdnSectionsImpl;
import com.useit.jact.model.types.Dialplan;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Presentation;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.MisdnSectionsImpl;
//import com.useit.jact.model.dataModel.MisdnSections;

/**
 * <p>
 * MisdnSectionsTableModel
 * </p>
 * Created : Fri Jan 06 13:20:41 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnSectionsTableModel.java,v 1.9 2006/01/09
 *          10:17:34 urs Exp $
 */
public class MisdnSectionsTableModel extends AbstractSimpleTableModel {

    // private MisdnSections mMisdnSections;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "context", "language", "nationalprefix", "internationalprefix", "rxgain",
            "txgain", "te_choose_channel", "early_bconnect", "dialplan",
            "use_callingpres", "always_immediate", "immediate", "hold_allowed",
            "pickgroup", "callgroup", "presentation", "echocancel",
            "echocancelwhenbridged", "echotraining", "sectionname", };

    /**
     * standart konstruktor
     */
    public MisdnSectionsTableModel(String[] columnNames) {
        super();
        // mMisdnSections = new MisdnSectionsImpl();
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
        return 20;
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
        MisdnSections aMisdnSections = (MisdnSections) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aMisdnSections.getContext();
        case 1:
            return aMisdnSections.getLanguage();
        case 2:
            return aMisdnSections.getNationalprefix();
        case 3:
            return aMisdnSections.getInternationalprefix();
        case 4:
            return aMisdnSections.getRxgain();
        case 5:
            return aMisdnSections.getTxgain();
        case 6:
            return aMisdnSections.getTe_choose_channel();
        case 7:
            return aMisdnSections.getEarly_bconnect();
        case 8:
            return aMisdnSections.getDialplan();
        case 9:
            return aMisdnSections.getUse_callingpres();
        case 10:
            return aMisdnSections.getAlways_immediate();
        case 11:
            return aMisdnSections.getImmediate();
        case 12:
            return aMisdnSections.getHold_allowed();
        case 13:
            return aMisdnSections.getPickgroup();
        case 14:
            return aMisdnSections.getCallgroup();
        case 15:
            return aMisdnSections.getPresentation();
        case 16:
            return aMisdnSections.getEchocancel();
        case 17:
            return aMisdnSections.getEchocancelwhenbridged();
        case 18:
            return aMisdnSections.getEchotraining();
        case 19:
            return aMisdnSections.getSectionname();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return PbxContext.class;
        case 1:
            return String.class;
        case 2:
            return String.class;
        case 3:
            return String.class;
        case 4:
            return Integer.class;
        case 5:
            return Integer.class;
        case 6:
            return Boolean.class;
        case 7:
            return Boolean.class;
        case 8:
            return Dialplan.class;
        case 9:
            return Boolean.class;
        case 10:
            return Boolean.class;
        case 11:
            return Boolean.class;
        case 12:
            return Boolean.class;
        case 13:
            return String.class;
        case 14:
            return String.class;
        case 15:
            return Presentation.class;
        case 16:
            return Boolean.class;
        case 17:
            return Boolean.class;
        case 18:
            return String.class;
        case 19:
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
     * gibt einen MisdnSections zurück
     * 
     * @param row
     * @return MisdnSections
     */
    public MisdnSections getMisdnSections(int row) {
        return (MisdnSections) list.get(row);
    } // end of getMisdnSections

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getMisdnSections(row);
    }

    /**
     * fügt einen MisdnSections hinzu
     * 
     * @param MisdnSections
     *            aMisdnSections
     */
    public void addMisdnSections(MisdnSections aMisdnSections) {
        list.add(aMisdnSections);
        fireTableDataChanged();
    } // end of addMisdnSections

    /**
     * gibt einen neuen MisdnSections zurück
     * 
     * @return MisdnSections
     */
    public MisdnSections newMisdnSections() {
        return new MisdnSectionsImpl();
    } // end of newMisdnSections

    /**
     * enfernt einen MisdnSections
     * 
     * @param aMisdnSections
     *            MisdnSections
     */
    public void removeMisdnSections(MisdnSections aMisdnSections) {
        int index = list.indexOf(aMisdnSections);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeMisdnSections

    /**
     * läd die MisdnSections nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadMisdnSections(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { MisdnSections newMisdnSections = new
     * MisdnSectionsImpl(); newMisdnSections.loadComplete(set);
     * list.add(newMisdnSections); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadMisdnSections
     */
}
