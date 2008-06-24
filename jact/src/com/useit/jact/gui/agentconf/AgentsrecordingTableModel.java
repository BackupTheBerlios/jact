package com.useit.jact.gui.agentconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.agentconf.Agentsrecording;
import com.useit.jact.model.agentconf.AgentsrecordingImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.AgentsrecordingImpl;
//import com.useit.jact.model.dataModel.Agentsrecording;

/**
 * <p>
 * AgentsrecordingTableModel
 * </p>
 * Created : Fri Jan 06 13:20:54 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsrecordingTableModel.java,v 1.6
 *          2006/01/09 10:17:35 urs Exp $
 */
public class AgentsrecordingTableModel extends AbstractSimpleTableModel {

    // private Agentsrecording mAgentsrecording;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "recordagentcalls", "recordformat", "createlink", "urlprefix",
            "savecallsin", };

    /**
     * standart konstruktor
     */
    public AgentsrecordingTableModel(String[] columnNames) {
        super();
        // mAgentsrecording = new AgentsrecordingImpl();
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
        return 5;
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
        Agentsrecording aAgentsrecording = (Agentsrecording) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAgentsrecording.getRecordagentcalls();
        case 1:
            return aAgentsrecording.getRecordformat();
        case 2:
            return aAgentsrecording.getCreatelink();
        case 3:
            return aAgentsrecording.getUrlprefix();
        case 4:
            return aAgentsrecording.getSavecallsin();

        default:
            return null;
        } // end of switch

    }

    public Class getColumnClass(int columnIndex) {
        switch (columnIndex) {
        case 0:
            return Boolean.class;
        case 1:
            return String.class;
        case 2:
            return String.class;
        case 3:
            return String.class;
        case 4:
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
     * gibt einen Agentsrecording zurück
     * 
     * @param row
     * @return Agentsrecording
     */
    public Agentsrecording getAgentsrecording(int row) {
        return (Agentsrecording) list.get(row);
    } // end of getAgentsrecording

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAgentsrecording(row);
    }

    /**
     * fügt einen Agentsrecording hinzu
     * 
     * @param Agentsrecording
     *            aAgentsrecording
     */
    public void addAgentsrecording(Agentsrecording aAgentsrecording) {
        list.add(aAgentsrecording);
        fireTableDataChanged();
    } // end of addAgentsrecording

    /**
     * gibt einen neuen Agentsrecording zurück
     * 
     * @return Agentsrecording
     */
    public Agentsrecording newAgentsrecording() {
        return new AgentsrecordingImpl();
    } // end of newAgentsrecording

    /**
     * enfernt einen Agentsrecording
     * 
     * @param aAgentsrecording
     *            Agentsrecording
     */
    public void removeAgentsrecording(Agentsrecording aAgentsrecording) {
        int index = list.indexOf(aAgentsrecording);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAgentsrecording

    /**
     * läd die Agentsrecording nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAgentsrecording(String sql) throws SQLException,
     * Exception{ this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Agentsrecording newAgentsrecording = new
     * AgentsrecordingImpl(); newAgentsrecording.loadComplete(set);
     * list.add(newAgentsrecording); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadAgentsrecording
     */
}
