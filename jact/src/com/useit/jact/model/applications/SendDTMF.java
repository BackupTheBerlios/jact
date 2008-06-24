package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SendDTMF<br>
 * Sends DTMF digits on a channel.   Accepted digits: 0-9, *#abcd  Returns 0 on success or -1 on a hangup.
 * </p>
 * Created : Sun Jul 09 18:51:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendDTMF.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SendDTMF extends PbxApplication implements ISendDTMF{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SendDTMF
	**/
	public SendDTMF(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendDTMF
	**/
	public SendDTMF( String adigits, String atimeout_ms){
		super();
	
		this.digits = adigits;	
		this.timeout_ms = atimeout_ms;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SendDTMF object){
		this.digits = object.digits;	
		this.timeout_ms = object.timeout_ms;	

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
	protected String timeout_ms;
	public static final String VALUEID_TIMEOUT_MS="timeout_ms" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DIGITS.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUT_MS.equals(valueid)){
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
		if(VALUEID_TIMEOUT_MS.equals(valueid)){
			setTimeout_ms((String)data);
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
		if(VALUEID_TIMEOUT_MS.equals(valueid)){
			return getTimeout_ms();
			
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
	* gettimeout_ms 
	* 
	**/
	public String getTimeout_ms(){		return  timeout_ms;
	}
	/**
	*settimeout_ms 
	*/
	public void setTimeout_ms(String atimeout_ms){
		if(atimeout_ms==null){
		    changed = (this.timeout_ms!=null);
		    this.timeout_ms = null;	    
		}else{
			changed = atimeout_ms.equals(this.timeout_ms);
			this.timeout_ms=atimeout_ms;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SendDTMF, ")		
		//.append("digits=")
		.append(digits)
		.append(",")
		//.append("timeout_ms=")
		.append(timeout_ms)
    			.append("");

		return sb.toString();		
	}
}