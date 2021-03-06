package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * WaitForRing<br>
 * Returns 0 after waiting at least timeout seconds. and only after the next ring has completed. Returns 0 on success or -1 on hangup
 * </p>
 * Created : Sun Jul 09 18:50:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitForRing.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class WaitForRing extends PbxApplication implements IWaitForRing{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r WaitForRing
	**/
	public WaitForRing(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r WaitForRing
	**/
	public WaitForRing( String atimeout){
		super();
	
		this.timeout = atimeout;	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(WaitForRing object){
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
	 * �berpr�ft ob es das value in dem Objekt gibt
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
	 * gibt einen Wert by Vauleid zur�ck
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
		sb.append("WaitForRing, ")		
		//.append("timeout=")
		.append(timeout)
    			.append("");

		return sb.toString();		
	}
}