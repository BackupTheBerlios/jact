package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * DigitTimeout<br>
 * Set the maximum amount of time permitted between digits when the user is typing in an extension. When this timeout expires, after the user has started to type in an extension, the extension will be considered complete, and will be interpreted. Note that if an extension typed in is valid, it will not have to timeout to be tested, so typically at the expiry of this timeout, the extension will be considered invalid (and thus control would be passed to the 'i' extension, or if it doesn't exist the call would be terminated). Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:48:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DigitTimeout.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class DigitTimeout extends PbxApplication implements IDigitTimeout{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für DigitTimeout
	**/
	public DigitTimeout(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DigitTimeout
	**/
	public DigitTimeout( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(DigitTimeout object){
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
		sb.append("DigitTimeout, ")		
		//.append("seconds=")
		.append(seconds)
    			.append("");

		return sb.toString();		
	}
}