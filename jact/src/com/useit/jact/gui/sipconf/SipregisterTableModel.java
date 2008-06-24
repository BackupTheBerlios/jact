package com.useit.jact.gui.sipconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.sipconf.Sipregister;
import com.useit.jact.model.sipconf.SipregisterImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.SipregisterImpl;
//import com.useit.jact.model.dataModel.Sipregister;

/**
 * <p>
 * SipregisterTableModel
 * </p>
 * Created : Fri May 26 14:16:21 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipregisterTableModel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SipregisterTableModel extends AbstractSimpleTableModel {
	
//	private Sipregister mSipregister;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"user",
			"authuser",
			"secret",
			"host",
			"port",
			"extension",
};	

	/**
	 * standart konstruktor
	 */
	public SipregisterTableModel(String[] columnNames ) {
		super();
		//mSipregister = new SipregisterImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 6;
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
		Sipregister aSipregister = (Sipregister) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aSipregister.getUser();
			case  1:return aSipregister.getAuthuser();
			case  2:return aSipregister.getSecret();
			case  3:return aSipregister.getHost();
			case  4:return aSipregister.getPort();
			case  5:return aSipregister.getExtension();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return String.class;
			case  1:return String.class;
			case  2:return String.class;
			case  3:return String.class;
			case  4:return Integer.class;
			case  5:return String.class;
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
	 * gibt einen Sipregister zurück
	 * @param row
	 * @return Sipregister
	 */
	public Sipregister getSipregister(int row) {
		return (Sipregister) list.get(row);
	} // end of getSipregister
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getSipregister(row);
	} 
	
	/**
	 * fügt einen Sipregister hinzu
	 * @param Sipregister aSipregister
	 */
	public void addSipregister(Sipregister aSipregister) {
		list.add(aSipregister);
		fireTableDataChanged();
	} // end of addSipregister
	
	/**
	 * gibt einen neuen Sipregister zurück
	 * @return Sipregister
	 */
	public Sipregister newSipregister() {
		return new SipregisterImpl();
	} // end of newSipregister
	
	/**
	 * enfernt einen Sipregister
	 * @param aSipregister Sipregister
	 */
	public void removeSipregister(Sipregister aSipregister) {
		int index = list.indexOf(aSipregister);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeSipregister
	
	/**
	 * läd die Sipregister nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadSipregister(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Sipregister newSipregister = new SipregisterImpl();
			newSipregister.loadComplete(set);
			list.add(newSipregister);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadSipregister
*/
}
