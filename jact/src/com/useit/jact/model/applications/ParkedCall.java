package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ParkedCall<br>
 * Used to connect to a parked call. This application is always registered internally and does not need to be explicitly added into the dialplan, although you should include the 'parkedcalls' context.
 * </p>
 * Created : Sun Jul 09 18:49:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkedCall.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ParkedCall extends PbxApplication implements IParkedCall{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ParkedCall
	**/
	public ParkedCall(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ParkedCall
	**/
	public ParkedCall( String aexten){
		super();
	
		this.exten = aexten;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ParkedCall object){
		this.exten = object.exten;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String exten;
	public static final String VALUEID_EXTEN="exten" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
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
		if(VALUEID_EXTEN.equals(valueid)){
			setExten((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
			return getExten();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getexten 
	* 
	**/
	public String getExten(){		return  exten;
	}
	/**
	*setexten 
	*/
	public void setExten(String aexten){
		if(aexten==null){
		    changed = (this.exten!=null);
		    this.exten = null;	    
		}else{
			changed = aexten.equals(this.exten);
			this.exten=aexten;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ParkedCall, ")		
		//.append("exten=")
		.append(exten)
    			.append("");

		return sb.toString();		
	}
}