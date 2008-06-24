package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.GlobalvarsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.GlobalvarsImpl;
//import com.useit.jact.model.dataModel.Globalvars;

/**
 * <p>
 * GlobalvarsTableModel
 * </p>
 * Created : Fri May 26 17:18:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GlobalvarsTableModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class GlobalvarsTableModel extends AbstractSimpleTableModel {
	
//	private Globalvars mGlobalvars;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"name",
			"value",
};	

	/**
	 * standart konstruktor
	 */
	public GlobalvarsTableModel(String[] columnNames ) {
		super();
		//mGlobalvars = new GlobalvarsImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 2;
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
		Globalvars aGlobalvars = (Globalvars) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aGlobalvars.getName();
			case  1:return aGlobalvars.getValue();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return String.class;
			case  1:return String.class;
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
	 * gibt einen Globalvars zurück
	 * @param row
	 * @return Globalvars
	 */
	public Globalvars getGlobalvars(int row) {
		return (Globalvars) list.get(row);
	} // end of getGlobalvars
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getGlobalvars(row);
	} 
	
	/**
	 * fügt einen Globalvars hinzu
	 * @param Globalvars aGlobalvars
	 */
	public void addGlobalvars(Globalvars aGlobalvars) {
		list.add(aGlobalvars);
		fireTableDataChanged();
	} // end of addGlobalvars
	
	/**
	 * gibt einen neuen Globalvars zurück
	 * @return Globalvars
	 */
	public Globalvars newGlobalvars() {
		return new GlobalvarsImpl();
	} // end of newGlobalvars
	
	/**
	 * enfernt einen Globalvars
	 * @param aGlobalvars Globalvars
	 */
	public void removeGlobalvars(Globalvars aGlobalvars) {
		int index = list.indexOf(aGlobalvars);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeGlobalvars
	
	/**
	 * läd die Globalvars nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadGlobalvars(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Globalvars newGlobalvars = new GlobalvarsImpl();
			newGlobalvars.loadComplete(set);
			list.add(newGlobalvars);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadGlobalvars
*/
}
