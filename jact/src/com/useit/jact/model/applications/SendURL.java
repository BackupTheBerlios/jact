package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SendURL<br>
 * Requests client go to URL. If the client does not support html transport, and there exists a step with priority n + 101, then execution will continue at that step. Otherwise, execution will continue at the next priority level. SendURL only returns 0 if the URL was sent correctly or if the channel does not support HTML transport, and -1 otherwise. If the option 'wait' is specified, execution will wait for an acknowledgement that the URL has been loaded before continuing and will return -1 if the peer is unable to load the URL
 * </p>
 * Created : Sun Jul 09 18:49:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendURL.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SendURL extends PbxApplication implements ISendURL{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SendURL
	**/
	public SendURL(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendURL
	**/
	public SendURL( String auRL, String aoption){
		super();
	
		this.uRL = auRL;	
		this.option = aoption;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SendURL object){
		this.uRL = object.uRL;	
		this.option = object.option;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String uRL;
	public static final String VALUEID_URL="url" ;

    /**   **/
	protected String option;
	public static final String VALUEID_OPTION="option" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_URL.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTION.equals(valueid)){
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
		if(VALUEID_URL.equals(valueid)){
			setURL((String)data);
			return;
		}
		if(VALUEID_OPTION.equals(valueid)){
			setOption((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_URL.equals(valueid)){
			return getURL();
			
		}
		if(VALUEID_OPTION.equals(valueid)){
			return getOption();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getuRL 
	* 
	**/
	public String getURL(){		return  uRL;
	}
	/**
	*setuRL 
	*/
	public void setURL(String auRL){
		if(auRL==null){
		    changed = (this.uRL!=null);
		    this.uRL = null;	    
		}else{
			changed = auRL.equals(this.uRL);
			this.uRL=auRL;
		}
	}


	/**
	* getoption 
	* 
	**/
	public String getOption(){		return  option;
	}
	/**
	*setoption 
	*/
	public void setOption(String aoption){
		if(aoption==null){
		    changed = (this.option!=null);
		    this.option = null;	    
		}else{
			changed = aoption.equals(this.option);
			this.option=aoption;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SendURL, ")		
		//.append("uRL=")
		.append(uRL)
		.append(",")
		//.append("option=")
		.append(option)
    			.append("");

		return sb.toString();		
	}
}