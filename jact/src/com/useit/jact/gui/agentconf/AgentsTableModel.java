package com.useit.jact.gui.agentconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.AgentsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.AgentsImpl;
//import com.useit.jact.model.dataModel.Agents;

/**
 * <p>
 * AgentsTableModel
 * </p>
 * Created : Fri Jan 06 13:20:47 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsTableModel.java,v 1.6 2006/01/09
 *          10:17:35 urs Exp $
 */
public class AgentsTableModel extends AbstractSimpleTableModel {

    // private Agents mAgents;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "agentid", "agentpassword", "name", };

    /**
     * standart konstruktor
     */
    public AgentsTableModel(String[] columnNames) {
        super();
        // mAgents = new AgentsImpl();
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
        Agents aAgents = (Agents) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAgents.getAgentid();
        case 1:
            return aAgents.getAgentpassword();
        case 2:
            return aAgents.getName();

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
     * gibt einen Agents zurück
     * 
     * @param row
     * @return Agents
     */
    public Agents getAgents(int row) {
        return (Agents) list.get(row);
    } // end of getAgents

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAgents(row);
    }

    /**
     * fügt einen Agents hinzu
     * 
     * @param Agents
     *            aAgents
     */
    public void addAgents(Agents aAgents) {
        list.add(aAgents);
        fireTableDataChanged();
    } // end of addAgents

    /**
     * gibt einen neuen Agents zurück
     * 
     * @return Agents
     */
    public Agents newAgents() {
        return new AgentsImpl();
    } // end of newAgents

    /**
     * enfernt einen Agents
     * 
     * @param aAgents
     *            Agents
     */
    public void removeAgents(Agents aAgents) {
        int index = list.indexOf(aAgents);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAgents

    /**
     * läd die Agents nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAgents(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Agents newAgents = new AgentsImpl();
     * newAgents.loadComplete(set); list.add(newAgents); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadAgents
     */
}
