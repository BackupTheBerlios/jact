package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetCallerPres<br>
 * Set Caller*ID presentation on a call.  Always returns 0. Valid presentations are:   allowed_not_screened : Presentation Allowed, Not Screened  allowed_passed_screen : Presentation Allowed, Passed Screen  allowed_failed_screen : Presentation Allowed, Failed Screen  allowed : Presentation Allowed, Network Number  prohib_not_screened : Presentation Prohibited, Not Screened  prohib_passed_screen : Presentation Prohibited, Passed Screen  prohib_failed_screen : Presentation Prohibited, Failed Screen  prohib : Presentation Prohibited, Network Number  unavailable : Number Unavailable
 * </p>
 * Created : Sun Jul 09 18:49:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCallerPres.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SetCallerPres extends PbxApplication implements ISetCallerPres{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetCallerPres
	**/
	public SetCallerPres(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCallerPres
	**/
	public SetCallerPres( String apresentation){
		super();
	
		this.presentation = apresentation;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetCallerPres object){
		this.presentation = object.presentation;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String presentation;
	public static final String VALUEID_PRESENTATION="presentation" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PRESENTATION.equals(valueid)){
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
		if(VALUEID_PRESENTATION.equals(valueid)){
			setPresentation((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PRESENTATION.equals(valueid)){
			return getPresentation();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getpresentation 
	* 
	**/
	public String getPresentation(){		return  presentation;
	}
	/**
	*setpresentation 
	*/
	public void setPresentation(String apresentation){
		if(apresentation==null){
		    changed = (this.presentation!=null);
		    this.presentation = null;	    
		}else{
			changed = apresentation.equals(this.presentation);
			this.presentation=apresentation;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetCallerPres, ")		
		//.append("presentation=")
		.append(presentation)
    			.append("");

		return sb.toString();		
	}
}