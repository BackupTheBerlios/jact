package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.IncludeconfigsImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IncludeconfigsImpl;
//import com.useit.jact.model.dataModel.Includeconfigs;

/**
 * <p>
 * IncludeconfigsTableModel
 * </p>
 * Created : Fri May 26 17:18:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludeconfigsTableModel.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
public class IncludeconfigsTableModel extends AbstractSimpleTableModel {
	
//	private Includeconfigs mIncludeconfigs;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"configname",
};	

	/**
	 * standart konstruktor
	 */
	public IncludeconfigsTableModel(String[] columnNames ) {
		super();
		//mIncludeconfigs = new IncludeconfigsImpl();
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
		Includeconfigs aIncludeconfigs = (Includeconfigs) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aIncludeconfigs.getConfigname();

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
	 * gibt einen Includeconfigs zurück
	 * @param row
	 * @return Includeconfigs
	 */
	public Includeconfigs getIncludeconfigs(int row) {
		return (Includeconfigs) list.get(row);
	} // end of getIncludeconfigs
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getIncludeconfigs(row);
	} 
	
	/**
	 * fügt einen Includeconfigs hinzu
	 * @param Includeconfigs aIncludeconfigs
	 */
	public void addIncludeconfigs(Includeconfigs aIncludeconfigs) {
		list.add(aIncludeconfigs);
		fireTableDataChanged();
	} // end of addIncludeconfigs
	
	/**
	 * gibt einen neuen Includeconfigs zurück
	 * @return Includeconfigs
	 */
	public Includeconfigs newIncludeconfigs() {
		return new IncludeconfigsImpl();
	} // end of newIncludeconfigs
	
	/**
	 * enfernt einen Includeconfigs
	 * @param aIncludeconfigs Includeconfigs
	 */
	public void removeIncludeconfigs(Includeconfigs aIncludeconfigs) {
		int index = list.indexOf(aIncludeconfigs);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeIncludeconfigs
	
	/**
	 * läd die Includeconfigs nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadIncludeconfigs(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Includeconfigs newIncludeconfigs = new IncludeconfigsImpl();
			newIncludeconfigs.loadComplete(set);
			list.add(newIncludeconfigs);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadIncludeconfigs
*/
}
