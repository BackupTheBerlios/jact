package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.ExtensionconfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ExtensionconfImpl;
//import com.useit.jact.model.dataModel.Extensionconf;

/**
 * <p>
 * ExtensionconfTableModel
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionconfTableModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class ExtensionconfTableModel extends AbstractSimpleTableModel {
	
//	private Extensionconf mExtensionconf;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"static_",
			"writeprotect",
			"autofallthrough",
			"clearglobalvars",
};	

	/**
	 * standart konstruktor
	 */
	public ExtensionconfTableModel(String[] columnNames ) {
		super();
		//mExtensionconf = new ExtensionconfImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 4;
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
		Extensionconf aExtensionconf = (Extensionconf) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aExtensionconf.getStatic_();
			case  1:return aExtensionconf.getWriteprotect();
			case  2:return aExtensionconf.getAutofallthrough();
			case  3:return aExtensionconf.getClearglobalvars();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return Boolean.class;
			case  1:return Boolean.class;
			case  2:return Boolean.class;
			case  3:return Boolean.class;
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
	 * gibt einen Extensionconf zurück
	 * @param row
	 * @return Extensionconf
	 */
	public Extensionconf getExtensionconf(int row) {
		return (Extensionconf) list.get(row);
	} // end of getExtensionconf
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getExtensionconf(row);
	} 
	
	/**
	 * fügt einen Extensionconf hinzu
	 * @param Extensionconf aExtensionconf
	 */
	public void addExtensionconf(Extensionconf aExtensionconf) {
		list.add(aExtensionconf);
		fireTableDataChanged();
	} // end of addExtensionconf
	
	/**
	 * gibt einen neuen Extensionconf zurück
	 * @return Extensionconf
	 */
	public Extensionconf newExtensionconf() {
		return new ExtensionconfImpl();
	} // end of newExtensionconf
	
	/**
	 * enfernt einen Extensionconf
	 * @param aExtensionconf Extensionconf
	 */
	public void removeExtensionconf(Extensionconf aExtensionconf) {
		int index = list.indexOf(aExtensionconf);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeExtensionconf
	
	/**
	 * läd die Extensionconf nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadExtensionconf(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Extensionconf newExtensionconf = new ExtensionconfImpl();
			newExtensionconf.loadComplete(set);
			list.add(newExtensionconf);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadExtensionconf
*/
}
