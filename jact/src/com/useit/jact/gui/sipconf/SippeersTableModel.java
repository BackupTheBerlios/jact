package com.useit.jact.gui.sipconf;

import java.util.Map;

import com.useit.app.framework.gui.models.AbstractSimpleTableModel;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.SippeersImpl;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

//import com.useit.jact.gui.guiHelper.DataClassRendere;
//import com.useit.jact.model.impl.SippeersImpl;
//import com.useit.jact.model.dataModel.Sippeers;

/**
 * <p>
 * SippeersTableModel
 * </p>
 * Created : Fri May 26 14:16:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SippeersTableModel.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
public class SippeersTableModel extends AbstractSimpleTableModel {
	
//	private Sippeers mSippeers;
	
	//private Connection con;
//	private List list = new Vector();
	private String[] columnNames = {  //null;
				"sectionname",
			"accountcode",
			"amaflags",
			"callgroup",
			"canreinvite",
			"context",
			"defaultip",
			"dtmfmode",
			"fromuser",
			"fromdomain",
			"host",
			"incominglimit",
			"outgoinglimit",
			"insecure",
			"language",
			"mailbox",
			"md5secret",
			"nat",
			"pickupgroup",
			"port",
			"qualify",
			"restrictcid",
			"rtptimeout",
			"rtpholdtimeout",
			"secret",
			"type",
			"username",
			"musiconhold",
			"callerid",
			"disallow",
			"allow",
};	

	/**
	 * standart konstruktor
	 */
	public SippeersTableModel(String[] columnNames ) {
		super();
		//mSippeers = new SippeersImpl();
		//this.con = con;
		if(columnNames!=null)
			this.columnNames = columnNames;
	}



	/* (Kein Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return 31;
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
		Sippeers aSippeers = (Sippeers) list.get(rowIndex);
		switch (columnIndex) {
			case  0:return aSippeers.getSectionname();
			case  1:return aSippeers.getAccountcode();
			case  2:return aSippeers.getAmaflags();
			case  3:return aSippeers.getCallgroup();
			case  4:return aSippeers.getCanreinvite();
			case  5:return aSippeers.getContext();
			case  6:return aSippeers.getDefaultip();
			case  7:return aSippeers.getDtmfmode();
			case  8:return aSippeers.getFromuser();
			case  9:return aSippeers.getFromdomain();
			case  10:return aSippeers.getHost();
			case  11:return aSippeers.getIncominglimit();
			case  12:return aSippeers.getOutgoinglimit();
			case  13:return aSippeers.getInsecure();
			case  14:return aSippeers.getLanguage();
			case  15:return aSippeers.getMailbox();
			case  16:return aSippeers.getMd5secret();
			case  17:return aSippeers.getNat();
			case  18:return aSippeers.getPickupgroup();
			case  19:return aSippeers.getPort();
			case  20:return aSippeers.getQualify();
			case  21:return aSippeers.getRestrictcid();
			case  22:return aSippeers.getRtptimeout();
			case  23:return aSippeers.getRtpholdtimeout();
			case  24:return aSippeers.getSecret();
			case  25:return aSippeers.getType();
			case  26:return aSippeers.getUsername();
			case  27:return aSippeers.getMusiconhold();
			case  28:return aSippeers.getCallerid();
			case  29:return aSippeers.getDisallow();
			case  30:return aSippeers.getAllow();

			default :return null;
		} //end of switch
		
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
			case  0:return String.class;
			case  1:return String.class;
			case  2:return Amaflags.class;
			case  3:return String.class;
			case  4:return String.class;
			case  5:return PbxContext.class;
			case  6:return String.class;
			case  7:return Dtmfmode.class;
			case  8:return String.class;
			case  9:return String.class;
			case  10:return String.class;
			case  11:return Integer.class;
			case  12:return Integer.class;
			case  13:return String.class;
			case  14:return String.class;
			case  15:return String.class;
			case  16:return String.class;
			case  17:return Boolean.class;
			case  18:return String.class;
			case  19:return Integer.class;
			case  20:return String.class;
			case  21:return Boolean.class;
			case  22:return Integer.class;
			case  23:return Integer.class;
			case  24:return String.class;
			case  25:return PeerType.class;
			case  26:return String.class;
			case  27:return String.class;
			case  28:return String.class;
			case  29:return CodecsSet.class;
			case  30:return CodecsSet.class;
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
	 * gibt einen Sippeers zurück
	 * @param row
	 * @return Sippeers
	 */
	public Sippeers getSippeers(int row) {
		return (Sippeers) list.get(row);
	} // end of getSippeers
	/**
	 * gibt einen object der stelle row zurück, ist implentiert
	 * @param row
	 * @return GeneralSection
	 */
	public Object getObject(int row) {
		return  getSippeers(row);
	} 
	
	/**
	 * fügt einen Sippeers hinzu
	 * @param Sippeers aSippeers
	 */
	public void addSippeers(Sippeers aSippeers) {
		list.add(aSippeers);
		fireTableDataChanged();
	} // end of addSippeers
	
	/**
	 * gibt einen neuen Sippeers zurück
	 * @return Sippeers
	 */
	public Sippeers newSippeers() {
		return new SippeersImpl();
	} // end of newSippeers
	
	/**
	 * enfernt einen Sippeers
	 * @param aSippeers Sippeers
	 */
	public void removeSippeers(Sippeers aSippeers) {
		int index = list.indexOf(aSippeers);
		list.remove(index);
		fireTableDataChanged();
	} // end of removeSippeers
	
	/**
	 * läd die Sippeers nach dem übergebenen Statement
	 * @param String sql
	 * @throws SQLException
	 
	public void loadSippeers(String sql) throws SQLException, Exception{
		this.list.clear();

		PreparedStatement pStatement = con.prepareStatement(sql);
		ResultSet set = pStatement.executeQuery();

		while (set.next()) {
			Sippeers newSippeers = new SippeersImpl();
			newSippeers.loadComplete(set);
			list.add(newSippeers);
		}

		//end of while
		fireTableDataChanged();
	} // end of loadSippeers
*/
}
