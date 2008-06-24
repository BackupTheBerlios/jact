package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.ExtensionImpl;
import com.useit.jact.model.types.PbxApplication;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ExtensionImpl;
//import com.useit.jact.model.dataModel.Extension;

/**
 * <p>
 * ExtensionTableModel
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionTableModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class ExtensionTableModel extends AbstractSimpleTableModel {
	
//	private Extension mExtension;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"exten",
			"priority",
			"application",
};	

	/**
	 * standart konstruktor
	 */
	public ExtensionTableModel(String[] columnNames ) {
		super();
		//mExtension = new ExtensionImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 3;
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
		Extension aExtension = (Extension) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aExtension.getExten();
			case  1:return aExtension.getPriority();
			case  2:return aExtension.getApplication();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return String.class;
			case  1:return Integer.class;
			case  2:return PbxApplication.class;
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
	 * gibt einen Extension zurück
	 * @param row
	 * @return Extension
	 */
	public Extension getExtension(int row) {
		return (Extension) list.get(row);
	} // end of getExtension
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getExtension(row);
	} 
	
	/**
	 * fügt einen Extension hinzu
	 * @param Extension aExtension
	 */
	public void addExtension(Extension aExtension) {
		list.add(aExtension);
		fireTableDataChanged();
	} // end of addExtension
	
	/**
	 * gibt einen neuen Extension zurück
	 * @return Extension
	 */
	public Extension newExtension() {
		return new ExtensionImpl();
	} // end of newExtension
	
	/**
	 * enfernt einen Extension
	 * @param aExtension Extension
	 */
	public void removeExtension(Extension aExtension) {
		int index = list.indexOf(aExtension);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeExtension
	
	/**
	 * läd die Extension nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadExtension(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Extension newExtension = new ExtensionImpl();
			newExtension.loadComplete(set);
			list.add(newExtension);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadExtension
*/
}
