package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * LookupBlacklist<br>
 * Looks up the Caller*ID number on the active channel in the Asterisk database (family 'blacklist'). If the number is found, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, it returns 0. Does nothing if no Caller*ID was received on the channel. Example: database put blacklist <name/number> 1
 * </p>
 * Created : Sun Jul 09 18:49:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: LookupBlacklist.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class LookupBlacklist extends PbxApplication implements ILookupBlacklist{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für LookupBlacklist
	**/
	public LookupBlacklist(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(LookupBlacklist object){

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
		sb.append("LookupBlacklist, ")		
		.append("");

		return sb.toString();		
	}
}