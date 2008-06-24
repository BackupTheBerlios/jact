package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * LookupCIDName<br>
 * Looks up the Caller*ID number on the active channel in the Asterisk database (family 'cidname') and sets the Caller*ID name. Does nothing if no Caller*ID was received on the channel. This is useful if you do not subscribe to Caller*ID name delivery, or if you want to change the names on some incoming calls. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: LookupCIDName.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class LookupCIDName extends PbxApplication implements ILookupCIDName{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für LookupCIDName
	**/
	public LookupCIDName(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(LookupCIDName object){

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
		sb.append("LookupCIDName, ")		
		.append("");

		return sb.toString();		
	}
}