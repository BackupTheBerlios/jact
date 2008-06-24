package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MD5_checksum_application<br>
 * <para>
 * </p>
 * Created : Sun Jul 09 18:49:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MD5_checksum_application.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MD5_checksum_application extends PbxApplication implements IMD5_checksum_application{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MD5_checksum_application
	**/
	public MD5_checksum_application(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MD5_checksum_application object){

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
		sb.append("MD5_checksum_application, ")		
		.append("");

		return sb.toString();		
	}
}