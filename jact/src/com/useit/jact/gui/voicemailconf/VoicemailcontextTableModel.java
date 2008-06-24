package com.useit.jact.gui.voicemailconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.VoicemailcontextImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.VoicemailcontextImpl;
//import com.useit.jact.model.dataModel.Voicemailcontext;

/**
 * <p>
 * VoicemailcontextTableModel
 * </p>
 * Created : Fri Jan 13 20:29:37 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextTableModel.java,v 1.8
 *          2006/01/14 15:00:13 urs Exp $
 */
public class VoicemailcontextTableModel extends AbstractSimpleTableModel {

    // private Voicemailcontext mVoicemailcontext;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "contextname", };

    /**
     * standart konstruktor
     */
    public VoicemailcontextTableModel(String[] columnNames) {
        super();
        // mVoicemailcontext = new VoicemailcontextImpl();
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
        Voicemailcontext aVoicemailcontext = (Voicemailcontext) list
                .get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aVoicemailcontext.getContextname();

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
     * gibt einen Voicemailcontext zurück
     * 
     * @param row
     * @return Voicemailcontext
     */
    public Voicemailcontext getVoicemailcontext(int row) {
        return (Voicemailcontext) list.get(row);
    } // end of getVoicemailcontext

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getVoicemailcontext(row);
    }

    /**
     * fügt einen Voicemailcontext hinzu
     * 
     * @param Voicemailcontext
     *            aVoicemailcontext
     */
    public void addVoicemailcontext(Voicemailcontext aVoicemailcontext) {
        list.add(aVoicemailcontext);
        fireTableDataChanged();
    } // end of addVoicemailcontext

    /**
     * gibt einen neuen Voicemailcontext zurück
     * 
     * @return Voicemailcontext
     */
    public Voicemailcontext newVoicemailcontext() {
        return new VoicemailcontextImpl();
    } // end of newVoicemailcontext

    /**
     * enfernt einen Voicemailcontext
     * 
     * @param aVoicemailcontext
     *            Voicemailcontext
     */
    public void removeVoicemailcontext(Voicemailcontext aVoicemailcontext) {
        int index = list.indexOf(aVoicemailcontext);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeVoicemailcontext

    /**
     * läd die Voicemailcontext nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadVoicemailcontext(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Voicemailcontext newVoicemailcontext = new
     * VoicemailcontextImpl(); newVoicemailcontext.loadComplete(set);
     * list.add(newVoicemailcontext); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadVoicemailcontext
     */
}
