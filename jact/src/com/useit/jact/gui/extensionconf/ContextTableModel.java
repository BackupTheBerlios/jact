package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.ContextImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.ContextImpl;
//import com.useit.jact.model.dataModel.Context;

/**
 * <p>
 * ContextTableModel
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ContextTableModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class ContextTableModel extends AbstractSimpleTableModel {
	
//	private Context mContext;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"contextname",
			"ignorepat",
};	

	/**
	 * standart konstruktor
	 */
	public ContextTableModel(String[] columnNames ) {
		super();
		//mContext = new ContextImpl();
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
		Context aContext = (Context) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aContext.getContextname();
			case  1:return aContext.getIgnorepat();

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
	 * gibt einen Context zurück
	 * @param row
	 * @return Context
	 */
	public Context getContext(int row) {
		return (Context) list.get(row);
	} // end of getContext
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getContext(row);
	} 
	
	/**
	 * fügt einen Context hinzu
	 * @param Context aContext
	 */
	public void addContext(Context aContext) {
		list.add(aContext);
		fireTableDataChanged();
	} // end of addContext
	
	/**
	 * gibt einen neuen Context zurück
	 * @return Context
	 */
	public Context newContext() {
		return new ContextImpl();
	} // end of newContext
	
	/**
	 * enfernt einen Context
	 * @param aContext Context
	 */
	public void removeContext(Context aContext) {
		int index = list.indexOf(aContext);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeContext
	
	/**
	 * läd die Context nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadContext(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Context newContext = new ContextImpl();
			newContext.loadComplete(set);
			list.add(newContext);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadContext
*/
}
