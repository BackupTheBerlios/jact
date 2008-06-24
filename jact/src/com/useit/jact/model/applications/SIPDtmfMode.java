package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SIPDtmfMode<br>
 * Changes the dtmfmode for a SIP call
 * </p>
 * Created : Sun Jul 09 18:51:25 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPDtmfMode.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SIPDtmfMode extends PbxApplication implements ISIPDtmfMode{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SIPDtmfMode
	**/
	public SIPDtmfMode(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SIPDtmfMode
	**/
	public SIPDtmfMode( String ainband, String ainfo, String arfc2833){
		super();
	
		this.inband = ainband;	
		this.info = ainfo;	
		this.rfc2833 = arfc2833;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SIPDtmfMode object){
		this.inband = object.inband;	
		this.info = object.info;	
		this.rfc2833 = object.rfc2833;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String inband;
	public static final String VALUEID_INBAND="inband" ;

    /**   **/
	protected String info;
	public static final String VALUEID_INFO="info" ;

    /**   **/
	protected String rfc2833;
	public static final String VALUEID_RFC2833="rfc2833" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_INBAND.equals(valueid)){
			return true;
		}
		if(VALUEID_INFO.equals(valueid)){
			return true;
		}
		if(VALUEID_RFC2833.equals(valueid)){
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
		if(VALUEID_INBAND.equals(valueid)){
			setInband((String)data);
			return;
		}
		if(VALUEID_INFO.equals(valueid)){
			setInfo((String)data);
			return;
		}
		if(VALUEID_RFC2833.equals(valueid)){
			setRfc2833((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_INBAND.equals(valueid)){
			return getInband();
			
		}
		if(VALUEID_INFO.equals(valueid)){
			return getInfo();
			
		}
		if(VALUEID_RFC2833.equals(valueid)){
			return getRfc2833();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getinband 
	* 
	**/
	public String getInband(){		return  inband;
	}
	/**
	*setinband 
	*/
	public void setInband(String ainband){
		if(ainband==null){
		    changed = (this.inband!=null);
		    this.inband = null;	    
		}else{
			changed = ainband.equals(this.inband);
			this.inband=ainband;
		}
	}


	/**
	* getinfo 
	* 
	**/
	public String getInfo(){		return  info;
	}
	/**
	*setinfo 
	*/
	public void setInfo(String ainfo){
		if(ainfo==null){
		    changed = (this.info!=null);
		    this.info = null;	    
		}else{
			changed = ainfo.equals(this.info);
			this.info=ainfo;
		}
	}


	/**
	* getrfc2833 
	* 
	**/
	public String getRfc2833(){		return  rfc2833;
	}
	/**
	*setrfc2833 
	*/
	public void setRfc2833(String arfc2833){
		if(arfc2833==null){
		    changed = (this.rfc2833!=null);
		    this.rfc2833 = null;	    
		}else{
			changed = arfc2833.equals(this.rfc2833);
			this.rfc2833=arfc2833;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SIPDtmfMode, ")		
		//.append("inband=")
		.append(inband)
		.append(",")
		//.append("info=")
		.append(info)
		.append(",")
		//.append("rfc2833=")
		.append(rfc2833)
    			.append("");

		return sb.toString();		
	}
}