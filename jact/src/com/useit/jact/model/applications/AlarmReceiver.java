package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * AlarmReceiver<br>
 * Alarm receiver application for Asterisk. Only 1 signalling format is supported at this time: Ademco Contact ID. This application should be called whenever there is an alarm panel calling in to dump its events. The application will handshake with the alarm panel, and receive events, validate them, handshake them, and store them until the panel hangs up. Once the panel hangs up, the application will run the command line specified by the eventcmd setting in alarmreceiver.conf and pipe the events to the standard input of the application. Alarmreceiver.conf also contains settings for DTMF timing, and for the loudness of the acknowledgement tones.
 * </p>
 * Created : Sun Jul 09 18:51:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AlarmReceiver.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class AlarmReceiver extends PbxApplication implements IAlarmReceiver{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für AlarmReceiver
	**/
	public AlarmReceiver(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(AlarmReceiver object){

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
		sb.append("AlarmReceiver, ")		
		.append("");

		return sb.toString();		
	}
}