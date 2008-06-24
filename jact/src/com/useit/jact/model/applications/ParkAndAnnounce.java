package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ParkAndAnnounce<br>
 * Park a call into the parkinglot and announce the call over the console. announce template: colon separated list of files to announce, the word PARKED  will be replaced by a say_digits of the ext the call is parked in timeout: time in seconds before the call returns into the return context. dial: The app_dial style resource to call to make the announcement. Console/dsp calls the console. return_context: the goto style label to jump the call back into after timeout. default=prio+1
 * </p>
 * Created : Sun Jul 09 18:49:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkAndAnnounce.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ParkAndAnnounce extends PbxApplication implements IParkAndAnnounce{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ParkAndAnnounce
	**/
	public ParkAndAnnounce(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ParkAndAnnounce
	**/
	public ParkAndAnnounce( String aannounce, String atemplate, String atimeout, String adial, String areturn_context){
		super();
	
		this.announce = aannounce;	
		this.template = atemplate;	
		this.timeout = atimeout;	
		this.dial = adial;	
		this.return_context = areturn_context;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ParkAndAnnounce object){
		this.announce = object.announce;	
		this.template = object.template;	
		this.timeout = object.timeout;	
		this.dial = object.dial;	
		this.return_context = object.return_context;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String announce;
	public static final String VALUEID_ANNOUNCE="announce" ;

    /**   **/
	protected String template;
	public static final String VALUEID_TEMPLATE="template" ;

    /**   **/
	protected String timeout;
	public static final String VALUEID_TIMEOUT="timeout" ;

    /**   **/
	protected String dial;
	public static final String VALUEID_DIAL="dial" ;

    /**   **/
	protected String return_context;
	public static final String VALUEID_RETURN_CONTEXT="return_context" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ANNOUNCE.equals(valueid)){
			return true;
		}
		if(VALUEID_TEMPLATE.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_DIAL.equals(valueid)){
			return true;
		}
		if(VALUEID_RETURN_CONTEXT.equals(valueid)){
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
		if(VALUEID_ANNOUNCE.equals(valueid)){
			setAnnounce((String)data);
			return;
		}
		if(VALUEID_TEMPLATE.equals(valueid)){
			setTemplate((String)data);
			return;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			setTimeout((String)data);
			return;
		}
		if(VALUEID_DIAL.equals(valueid)){
			setDial((String)data);
			return;
		}
		if(VALUEID_RETURN_CONTEXT.equals(valueid)){
			setReturn_context((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ANNOUNCE.equals(valueid)){
			return getAnnounce();
			
		}
		if(VALUEID_TEMPLATE.equals(valueid)){
			return getTemplate();
			
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return getTimeout();
			
		}
		if(VALUEID_DIAL.equals(valueid)){
			return getDial();
			
		}
		if(VALUEID_RETURN_CONTEXT.equals(valueid)){
			return getReturn_context();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getannounce 
	* 
	**/
	public String getAnnounce(){		return  announce;
	}
	/**
	*setannounce 
	*/
	public void setAnnounce(String aannounce){
		if(aannounce==null){
		    changed = (this.announce!=null);
		    this.announce = null;	    
		}else{
			changed = aannounce.equals(this.announce);
			this.announce=aannounce;
		}
	}


	/**
	* gettemplate 
	* 
	**/
	public String getTemplate(){		return  template;
	}
	/**
	*settemplate 
	*/
	public void setTemplate(String atemplate){
		if(atemplate==null){
		    changed = (this.template!=null);
		    this.template = null;	    
		}else{
			changed = atemplate.equals(this.template);
			this.template=atemplate;
		}
	}


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
	* getdial 
	* 
	**/
	public String getDial(){		return  dial;
	}
	/**
	*setdial 
	*/
	public void setDial(String adial){
		if(adial==null){
		    changed = (this.dial!=null);
		    this.dial = null;	    
		}else{
			changed = adial.equals(this.dial);
			this.dial=adial;
		}
	}


	/**
	* getreturn_context 
	* 
	**/
	public String getReturn_context(){		return  return_context;
	}
	/**
	*setreturn_context 
	*/
	public void setReturn_context(String areturn_context){
		if(areturn_context==null){
		    changed = (this.return_context!=null);
		    this.return_context = null;	    
		}else{
			changed = areturn_context.equals(this.return_context);
			this.return_context=areturn_context;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ParkAndAnnounce, ")		
		//.append("announce=")
		.append(announce)
		.append(",")
		//.append("template=")
		.append(template)
		.append(",")
		//.append("timeout=")
		.append(timeout)
		.append(",")
		//.append("dial=")
		.append(dial)
		.append(",")
		//.append("return_context=")
		.append(return_context)
    			.append("");

		return sb.toString();		
	}
}