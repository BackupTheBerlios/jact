package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SayNumber<br>
 * Says the passed number. SayNumber is using the current language setting for the channel. (See app SetLanguage).
 * </p>
 * Created : Sun Jul 09 18:50:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayNumber.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SayNumber extends PbxApplication implements ISayNumber{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SayNumber
	**/
	public SayNumber(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayNumber
	**/
	public SayNumber( String adigits, String agender){
		super();
	
		this.digits = adigits;	
		this.gender = agender;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SayNumber object){
		this.digits = object.digits;	
		this.gender = object.gender;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String digits;
	public static final String VALUEID_DIGITS="digits" ;

    /**   **/
	protected String gender;
	public static final String VALUEID_GENDER="gender" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DIGITS.equals(valueid)){
			return true;
		}
		if(VALUEID_GENDER.equals(valueid)){
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
		if(VALUEID_GENDER.equals(valueid)){
			setGender((String)data);
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
		if(VALUEID_GENDER.equals(valueid)){
			return getGender();
			
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
	* getgender 
	* 
	**/
	public String getGender(){		return  gender;
	}
	/**
	*setgender 
	*/
	public void setGender(String agender){
		if(agender==null){
		    changed = (this.gender!=null);
		    this.gender = null;	    
		}else{
			changed = agender.equals(this.gender);
			this.gender=agender;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SayNumber, ")		
		//.append("digits=")
		.append(digits)
		.append(",")
		//.append("gender=")
		.append(gender)
    			.append("");

		return sb.toString();		
	}
}