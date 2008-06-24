package com.useit.jact.gui.sipconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.SipgeneralImpl;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.SipgeneralImpl;
//import com.useit.jact.model.dataModel.Sipgeneral;

/**
 * <p>
 * SipgeneralTableModel
 * </p>
 * Created : Fri May 26 14:16:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipgeneralTableModel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SipgeneralTableModel extends AbstractSimpleTableModel {
	
//	private Sipgeneral mSipgeneral;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"autocreatepeer",
			"bindaddr",
			"bindport",
			"canreinvite",
			"context",
			"defaultexpirey",
			"dtmfmode",
			"externip",
			"externhost",
			"externrefresh",
			"localnet",
			"fromdomain",
			"maxexpirey",
			"nat",
			"notifymimetype",
			"pedantic",
			"port",
			"promiscredir",
			"srvlookup",
			"tos",
			"videosupport",
			"useragent",
			"trustrpid",
			"realm",
			"rtptimeout",
			"relaxdtmf",
			"rtpholdtimeout",
			"progressinband",
			"usereqphone",
			"compactheaders",
			"sipdebug",
			"checkmwi",
			"recordhistory",
			"allow",
			"disallow",
};	

	/**
	 * standart konstruktor
	 */
	public SipgeneralTableModel(String[] columnNames ) {
		super();
		//mSipgeneral = new SipgeneralImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 35;
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
		Sipgeneral aSipgeneral = (Sipgeneral) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aSipgeneral.getAutocreatepeer();
			case  1:return aSipgeneral.getBindaddr();
			case  2:return aSipgeneral.getBindport();
			case  3:return aSipgeneral.getCanreinvite();
			case  4:return aSipgeneral.getContext();
			case  5:return aSipgeneral.getDefaultexpirey();
			case  6:return aSipgeneral.getDtmfmode();
			case  7:return aSipgeneral.getExternip();
			case  8:return aSipgeneral.getExternhost();
			case  9:return aSipgeneral.getExternrefresh();
			case  10:return aSipgeneral.getLocalnet();
			case  11:return aSipgeneral.getFromdomain();
			case  12:return aSipgeneral.getMaxexpirey();
			case  13:return aSipgeneral.getNat();
			case  14:return aSipgeneral.getNotifymimetype();
			case  15:return aSipgeneral.getPedantic();
			case  16:return aSipgeneral.getPort();
			case  17:return aSipgeneral.getPromiscredir();
			case  18:return aSipgeneral.getSrvlookup();
			case  19:return aSipgeneral.getTos();
			case  20:return aSipgeneral.getVideosupport();
			case  21:return aSipgeneral.getUseragent();
			case  22:return aSipgeneral.getTrustrpid();
			case  23:return aSipgeneral.getRealm();
			case  24:return aSipgeneral.getRtptimeout();
			case  25:return aSipgeneral.getRelaxdtmf();
			case  26:return aSipgeneral.getRtpholdtimeout();
			case  27:return aSipgeneral.getProgressinband();
			case  28:return aSipgeneral.getUsereqphone();
			case  29:return aSipgeneral.getCompactheaders();
			case  30:return aSipgeneral.getSipdebug();
			case  31:return aSipgeneral.getCheckmwi();
			case  32:return aSipgeneral.getRecordhistory();
			case  33:return aSipgeneral.getAllow();
			case  34:return aSipgeneral.getDisallow();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return Boolean.class;
			case  1:return String.class;
			case  2:return Integer.class;
			case  3:return String.class;
			case  4:return PbxContext.class;
			case  5:return Integer.class;
			case  6:return Dtmfmode.class;
			case  7:return String.class;
			case  8:return String.class;
			case  9:return String.class;
			case  10:return String.class;
			case  11:return String.class;
			case  12:return Integer.class;
			case  13:return Boolean.class;
			case  14:return String.class;
			case  15:return Boolean.class;
			case  16:return Integer.class;
			case  17:return Boolean.class;
			case  18:return Boolean.class;
			case  19:return String.class;
			case  20:return Boolean.class;
			case  21:return String.class;
			case  22:return Boolean.class;
			case  23:return String.class;
			case  24:return Integer.class;
			case  25:return Boolean.class;
			case  26:return Integer.class;
			case  27:return String.class;
			case  28:return Boolean.class;
			case  29:return Boolean.class;
			case  30:return Boolean.class;
			case  31:return Integer.class;
			case  32:return Boolean.class;
			case  33:return CodecsSet.class;
			case  34:return CodecsSet.class;
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
	 * gibt einen Sipgeneral zurück
	 * @param row
	 * @return Sipgeneral
	 */
	public Sipgeneral getSipgeneral(int row) {
		return (Sipgeneral) list.get(row);
	} // end of getSipgeneral
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getSipgeneral(row);
	} 
	
	/**
	 * fügt einen Sipgeneral hinzu
	 * @param Sipgeneral aSipgeneral
	 */
	public void addSipgeneral(Sipgeneral aSipgeneral) {
		list.add(aSipgeneral);
		fireTableDataChanged();
	} // end of addSipgeneral
	
	/**
	 * gibt einen neuen Sipgeneral zurück
	 * @return Sipgeneral
	 */
	public Sipgeneral newSipgeneral() {
		return new SipgeneralImpl();
	} // end of newSipgeneral
	
	/**
	 * enfernt einen Sipgeneral
	 * @param aSipgeneral Sipgeneral
	 */
	public void removeSipgeneral(Sipgeneral aSipgeneral) {
		int index = list.indexOf(aSipgeneral);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeSipgeneral
	
	/**
	 * läd die Sipgeneral nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadSipgeneral(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Sipgeneral newSipgeneral = new SipgeneralImpl();
			newSipgeneral.loadComplete(set);
			list.add(newSipgeneral);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadSipgeneral
*/
}
