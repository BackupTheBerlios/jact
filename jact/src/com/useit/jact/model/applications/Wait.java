package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Wait<br>
 * Waits for a specified number of seconds, then returns 0. seconds can be passed with fractions of a second. (eg: 1.5 = 1.5 seconds)
 * </p>
 * Created : Sun Jul 09 18:50:20 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Wait.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class Wait extends PbxApplication implements IWait{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Wait
	**/
	public Wait(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Wait
	**/
	public Wait( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Wait object){
		this.seconds = object.seconds;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String seconds;
	public static final String VALUEID_SECONDS="seconds" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SECONDS.equals(valueid)){
			return true;
		}
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
		if(VALUEID_SECONDS.equals(valueid)){
			setSeconds((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SECONDS.equals(valueid)){
			return getSeconds();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getseconds 
	* 
	**/
	public String getSeconds(){		return  seconds;
	}
	/**
	*setseconds 
	*/
	public void setSeconds(String aseconds){
		if(aseconds==null){
		    changed = (this.seconds!=null);
		    this.seconds = null;	    
		}else{
			changed = aseconds.equals(this.seconds);
			this.seconds=aseconds;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Wait, ")		
		//.append("seconds=")
		.append(seconds)
    			.append("");

		return sb.toString();		
	}
}