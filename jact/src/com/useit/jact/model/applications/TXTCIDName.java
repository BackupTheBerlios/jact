package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * TXTCIDName<br>
 * TXTLookup(CallerID): Looks up a Caller Name via DNS and sets the variable 'TXTCIDNAME'. TXTCIDName will either be blank or return the value found in the TXT record in DNS.
 * </p>
 * Created : Sun Jul 09 18:51:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TXTCIDName.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class TXTCIDName extends PbxApplication implements ITXTCIDName{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für TXTCIDName
	**/
	public TXTCIDName(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(TXTCIDName object){

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
	    
	    return null;
	}

	
	//---------  getter und setter

	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("TXTCIDName, ")		
		.append("");

		return sb.toString();		
	}
}