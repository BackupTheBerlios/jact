package com.useit.jact.gui.sipconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.SipConfImpl;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.SipConfImpl;
//import com.useit.jact.model.dataModel.SipConf;

/**
 * <p>
 * SipConfTableModel
 * </p>
 * Created : Fri May 26 14:16:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipConfTableModel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SipConfTableModel extends AbstractSimpleTableModel {
	
//	private SipConf mSipConf;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
	};	

	/**
	 * standart konstruktor
	 */
	public SipConfTableModel(String[] columnNames ) {
		super();
		//mSipConf = new SipConfImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 0;
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
		SipConf aSipConf = (SipConf) list.get(rowIndex);
		switch (columnIndex) {
			//case  ${i}:return DataClassRendere.displayString(aSipConf.getSipgeneral());

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			//case  ${i}:return String.class;
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
	 * gibt einen SipConf zurück
	 * @param row
	 * @return SipConf
	 */
	public SipConf getSipConf(int row) {
		return (SipConf) list.get(row);
	} // end of getSipConf
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getSipConf(row);
	} 
	
	/**
	 * fügt einen SipConf hinzu
	 * @param SipConf aSipConf
	 */
	public void addSipConf(SipConf aSipConf) {
		list.add(aSipConf);
		fireTableDataChanged();
	} // end of addSipConf
	
	/**
	 * gibt einen neuen SipConf zurück
	 * @return SipConf
	 */
	public SipConf newSipConf() {
		return new SipConfImpl();
	} // end of newSipConf
	
	/**
	 * enfernt einen SipConf
	 * @param aSipConf SipConf
	 */
	public void removeSipConf(SipConf aSipConf) {
		int index = list.indexOf(aSipConf);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeSipConf
	
	/**
	 * läd die SipConf nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadSipConf(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			SipConf newSipConf = new SipConfImpl();
			newSipConf.loadComplete(set);
			list.add(newSipConf);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadSipConf
*/
}
