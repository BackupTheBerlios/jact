package com.useit.jact.gui.agentconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.AgentsconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.AgentsconfImpl;
//import com.useit.jact.model.dataModel.Agentsconf;

/**
 * <p>
 * AgentsconfTableModel
 * </p>
 * Created : Fri Jan 06 13:20:51 CET 2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsconfTableModel.java,v 1.7 2006/03/17
 *          10:48:21 urs Exp $
 */
public class AgentsconfTableModel extends AbstractSimpleTableModel {

    // private Agentsconf mAgentsconf;

    // private Connection con;
    // private List list = new Vector();
    private String[] columnNames = { // null;
    "autologoff", "ackcall", "wrapuptime", "music_class", "custom_beep",
            "group", };

    /**
     * standart konstruktor
     */
    public AgentsconfTableModel(String[] columnNames) {
        super();
        // mAgentsconf = new AgentsconfImpl();
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
        Agentsconf aAgentsconf = (Agentsconf) list.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return aAgentsconf.getAutologoff();
        case 1:
            return aAgentsconf.getAckcall();
        case 2:
            return aAgentsconf.getWrapuptime();
        case 3:
            return aAgentsconf.getMusic_class();
        case 4:
            return aAgentsconf.getCustom_beep();
        case 5:
            return aAgentsconf.getGroup();
        // case 6:return
        // DataClassRendere.displayString(aAgentsconf.getAgentsrecording());

        default:
            return null;
        } // end of switch

    }

    public Class<?> getColumnClass(int columnIndex) {
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
            return String.class;
        case 5:
            return String.class;
        // case 6:return String.class;
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
     * gibt einen Agentsconf zurück
     * 
     * @param row
     * @return Agentsconf
     */
    public Agentsconf getAgentsconf(int row) {
        return (Agentsconf) list.get(row);
    } // end of getAgentsconf

    /**
     * gibt einen object der stelle row zurück, ist implentiert
     * 
     * @param row
     * @return GeneralSection
     */
    public Object getObject(int row) {
        return getAgentsconf(row);
    }

    /**
     * fügt einen Agentsconf hinzu
     * 
     * @param Agentsconf
     *            aAgentsconf
     */
    public void addAgentsconf(Agentsconf aAgentsconf) {
        list.add(aAgentsconf);
        fireTableDataChanged();
    } // end of addAgentsconf

    /**
     * gibt einen neuen Agentsconf zurück
     * 
     * @return Agentsconf
     */
    public Agentsconf newAgentsconf() {
        return new AgentsconfImpl();
    } // end of newAgentsconf

    /**
     * enfernt einen Agentsconf
     * 
     * @param aAgentsconf
     *            Agentsconf
     */
    public void removeAgentsconf(Agentsconf aAgentsconf) {
        int index = list.indexOf(aAgentsconf);
        list.remove(index);
        fireTableDataChanged();
    } // end of removeAgentsconf

    /**
     * läd die Agentsconf nach dem übergebenen Statement
     * 
     * @param String
     *            sql
     * @throws SQLException
     * 
     * public void loadAgentsconf(String sql) throws SQLException, Exception{
     * this.list.clear();
     * 
     * PreparedStatement pStatement = con.prepareStatement(sql); ResultSet set =
     * pStatement.executeQuery();
     * 
     * while (set.next()) { Agentsconf newAgentsconf = new AgentsconfImpl();
     * newAgentsconf.loadComplete(set); list.add(newAgentsconf); }
     * 
     * //end of while fireTableDataChanged(); } // end of loadAgentsconf
     */
}
