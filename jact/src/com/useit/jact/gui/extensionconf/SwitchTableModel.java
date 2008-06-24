package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Switch;
import com.useit.jact.model.extensionconf.SwitchImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.SwitchImpl;
//import com.useit.jact.model.dataModel.Switch;

/**
 * <p>
 * SwitchTableModel
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SwitchTableModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class SwitchTableModel extends AbstractSimpleTableModel {
	
//	private Switch mSwitch;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"switchdialstr",
};	

	/**
	 * standart konstruktor
	 */
	public SwitchTableModel(String[] columnNames ) {
		super();
		//mSwitch = new SwitchImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 1;
	}

	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	public int getRowCount() {		
		return list.size();
	}

	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		Switch aSwitch = (Switch) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aSwitch.getSwitchdialstr();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return String.class;
			default :return null;
		} //end of switch

	}
	/**
	 * Returns the column name.
	 * This is used to initialize the given column's header name
	 */
	public String getColumnName(int columnIndex) {
		return columnNames[columnIndex];
	}
	/**
	* setz die Map von außen
	*/
	public void setNewList (Map aMap){
		list.clear();
		list.addAll(aMap.values());
		fireTableDataChanged();
		
	}


	/**
	 * gibt einen Switch zurück
	 * @param row
	 * @return Switch
	 */
	public Switch getSwitch(int row) {
		return (Switch) list.get(row);
	} // end of getSwitch
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getSwitch(row);
	} 
	
	/**
	 * fügt einen Switch hinzu
	 * @param Switch aSwitch
	 */
	public void addSwitch(Switch aSwitch) {
		list.add(aSwitch);
		fireTableDataChanged();
	} // end of addSwitch
	
	/**
	 * gibt einen neuen Switch zurück
	 * @return Switch
	 */
	public Switch newSwitch() {
		return new SwitchImpl();
	} // end of newSwitch
	
	/**
	 * enfernt einen Switch
	 * @param aSwitch Switch
	 */
	public void removeSwitch(Switch aSwitch) {
		int index = list.indexOf(aSwitch);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeSwitch
	
	/**
	 * läd die Switch nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadSwitch(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Switch newSwitch = new SwitchImpl();
			newSwitch.loadComplete(set);
			list.add(newSwitch);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadSwitch
*/
}
