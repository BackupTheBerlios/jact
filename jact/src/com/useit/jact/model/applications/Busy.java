package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Busy<br>
 * Requests that the channel indicate busy condition and then waits for the user to hang up or the optional timeout to expire. Always returns -1.
 * </p>
 * Created : Sun Jul 09 18:49:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Busy.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Busy extends PbxApplication implements IBusy{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Busy
	**/
	public Busy(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Busy
	**/
	public Busy( String atimeout){
		super();
	
		this.timeout = atimeout;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Busy object){
		this.timeout = object.timeout;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String timeout;
	public static final String VALUEID_TIMEOUT="timeout" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TIMEOUT.equals(valueid)){
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
		if(VALUEID_TIMEOUT.equals(valueid)){
			setTimeout((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TIMEOUT.equals(valueid)){
			return getTimeout();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettimeout 
	* 
	**/
	public String getTimeout(){		return  timeout;
	}
	/**
	*settimeout 
	*/
	public void setTimeout(String atimeout){
		if(atimeout==null){
		    changed = (this.timeout!=null);
		    this.timeout = null;	    
		}else{
			changed = atimeout.equals(this.timeout);
			this.timeout=atimeout;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Busy, ")		
		//.append("timeout=")
		.append(timeout)
    			.append("");

		return sb.toString();		
	}
}