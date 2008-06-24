package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * PrivacyManager<br>
 * If no Caller*ID is sent, PrivacyManager answers the channel and asks the caller to enter their phone number. The caller is given 3 attempts. If after 3 attempts, they do not enter at least a 10 digit phone number, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, it returns 0. Does nothing if Caller*ID was received on the channel.  Configuration file privacy.conf contains two variables:  maxretries default 3 -maximum number of attempts the caller is allowed to input a callerid.  minlength default 10 -minimum allowable digits in the input callerid number.
 * </p>
 * Created : Sun Jul 09 18:51:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PrivacyManager.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class PrivacyManager extends PbxApplication implements IPrivacyManager{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für PrivacyManager
	**/
	public PrivacyManager(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(PrivacyManager object){

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
		sb.append("PrivacyManager, ")		
		.append("");

		return sb.toString();		
	}
}