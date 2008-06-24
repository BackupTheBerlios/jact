package com.useit.jact.gui.extensionconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.IncludecontextImpl;
import com.useit.jact.model.types.PbxContext;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.IncludecontextImpl;
//import com.useit.jact.model.dataModel.Includecontext;

/**
 * <p>
 * IncludecontextTableModel
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludecontextTableModel.java,v 1.1 2008/06/24 20:45:18 urszeidler Exp $
 */
public class IncludecontextTableModel extends AbstractSimpleTableModel {
	
//	private Includecontext mIncludecontext;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"contexname",
			"timeing",
};	

	/**
	 * standart konstruktor
	 */
	public IncludecontextTableModel(String[] columnNames ) {
		super();
		//mIncludecontext = new IncludecontextImpl();
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
		Includecontext aIncludecontext = (Includecontext) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aIncludecontext.getContexname();
			case  1:return aIncludecontext.getTimeing();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return PbxContext.class;
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
	 * gibt einen Includecontext zurück
	 * @param row
	 * @return Includecontext
	 */
	public Includecontext getIncludecontext(int row) {
		return (Includecontext) list.get(row);
	} // end of getIncludecontext
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getIncludecontext(row);
	} 
	
	/**
	 * fügt einen Includecontext hinzu
	 * @param Includecontext aIncludecontext
	 */
	public void addIncludecontext(Includecontext aIncludecontext) {
		list.add(aIncludecontext);
		fireTableDataChanged();
	} // end of addIncludecontext
	
	/**
	 * gibt einen neuen Includecontext zurück
	 * @return Includecontext
	 */
	public Includecontext newIncludecontext() {
		return new IncludecontextImpl();
	} // end of newIncludecontext
	
	/**
	 * enfernt einen Includecontext
	 * @param aIncludecontext Includecontext
	 */
	public void removeIncludecontext(Includecontext aIncludecontext) {
		int index = list.indexOf(aIncludecontext);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeIncludecontext
	
	/**
	 * läd die Includecontext nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadIncludecontext(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Includecontext newIncludecontext = new IncludecontextImpl();
			newIncludecontext.loadComplete(set);
			list.add(newIncludecontext);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadIncludecontext
*/
}
