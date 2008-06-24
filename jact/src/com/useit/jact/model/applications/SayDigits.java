package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SayDigits<br>
 * Says the passed digits. SayDigits is using the current language setting for the channel. (See app setLanguage)
 * </p>
 * Created : Sun Jul 09 18:50:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayDigits.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SayDigits extends PbxApplication implements ISayDigits{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SayDigits
	**/
	public SayDigits(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayDigits
	**/
	public SayDigits( String adigits){
		super();
	
		this.digits = adigits;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SayDigits object){
		this.digits = object.digits;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String digits;
	public static final String VALUEID_DIGITS="digits" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DIGITS.equals(valueid)){
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
		if(VALUEID_DIGITS.equals(valueid)){
			setDigits((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DIGITS.equals(valueid)){
			return getDigits();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdigits 
	* 
	**/
	public String getDigits(){		return  digits;
	}
	/**
	*setdigits 
	*/
	public void setDigits(String adigits){
		if(adigits==null){
		    changed = (this.digits!=null);
		    this.digits = null;	    
		}else{
			changed = adigits.equals(this.digits);
			this.digits=adigits;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SayDigits, ")		
		//.append("digits=")
		.append(digits)
    			.append("");

		return sb.toString();		
	}
}