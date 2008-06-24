package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Playtones<br>
 * PlayTone(arg): Plays a tone list. Execution will continue with the next step immediately, while the tones continue to play. Arg is either the tone name defined in the indications.conf configuration file, or a directly specified list of frequencies and durations. See indications.conf for a description of the specification of a tonelist.  Use the StopPlaytones application to stop the tones playing.
 * </p>
 * Created : Sun Jul 09 18:50:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Playtones.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Playtones extends PbxApplication implements IPlaytones{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Playtones
	**/
	public Playtones(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Playtones object){

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
		sb.append("Playtones, ")		
		.append("");

		return sb.toString();		
	}
}