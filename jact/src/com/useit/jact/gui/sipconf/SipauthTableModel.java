package com.useit.jact.gui.sipconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.SipauthImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.SipauthImpl;
//import com.useit.jact.model.dataModel.Sipauth;

/**
 * <p>
 * SipauthTableModel
 * </p>
 * Created : Fri May 26 14:16:21 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipauthTableModel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SipauthTableModel extends AbstractSimpleTableModel {
	
//	private Sipauth mSipauth;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"user",
			"secret",
			"md5secret",
			"realm",
};	

	/**
	 * standart konstruktor
	 */
	public SipauthTableModel(String[] columnNames ) {
		super();
		//mSipauth = new SipauthImpl();
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
		Sipauth aSipauth = (Sipauth) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aSipauth.getUser();
			case  1:return aSipauth.getSecret();
			case  2:return aSipauth.getMd5secret();
			case  3:return aSipauth.getRealm();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return String.class;
			case  1:return String.class;
			case  2:return String.class;
			case  3:return String.class;
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
	 * gibt einen Sipauth zurück
	 * @param row
	 * @return Sipauth
	 */
	public Sipauth getSipauth(int row) {
		return (Sipauth) list.get(row);
	} // end of getSipauth
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getSipauth(row);
	} 
	
	/**
	 * fügt einen Sipauth hinzu
	 * @param Sipauth aSipauth
	 */
	public void addSipauth(Sipauth aSipauth) {
		list.add(aSipauth);
		fireTableDataChanged();
	} // end of addSipauth
	
	/**
	 * gibt einen neuen Sipauth zurück
	 * @return Sipauth
	 */
	public Sipauth newSipauth() {
		return new SipauthImpl();
	} // end of newSipauth
	
	/**
	 * enfernt einen Sipauth
	 * @param aSipauth Sipauth
	 */
	public void removeSipauth(Sipauth aSipauth) {
		int index = list.indexOf(aSipauth);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeSipauth
	
	/**
	 * läd die Sipauth nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadSipauth(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Sipauth newSipauth = new SipauthImpl();
			newSipauth.loadComplete(set);
			list.add(newSipauth);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadSipauth
*/
}
