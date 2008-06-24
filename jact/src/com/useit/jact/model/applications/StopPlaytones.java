package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * StopPlaytones<br>
 * Stop playing a tone list
 * </p>
 * Created : Sun Jul 09 18:49:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StopPlaytones.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class StopPlaytones extends PbxApplication implements IStopPlaytones{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r StopPlaytones
	**/
	public StopPlaytones(){
		super();
	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(StopPlaytones object){

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

	/**
	 * �berpr�ft ob es das value in dem Objekt gibt
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
	 * gibt einen Wert by Vauleid zur�ck
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
		sb.append("StopPlaytones, ")		
		.append("");

		return sb.toString();		
	}
}