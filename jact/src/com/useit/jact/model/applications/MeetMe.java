package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MeetMe<br>
 * Enters the user into a specified MeetMe conference. If the conference number is omitted, the user will be prompted to enter one.  MeetMe returns 0 if user pressed # to exit (see option 'p'), otherwise -1. Please note: A ZAPTEL INTERFACE MUST BE INSTALLED FOR CONFERENCING TO WORK!  The option string may contain zero or more of the following characters:  'm' -- set monitor only mode (Listen only, no talking)  't' -- set talk only mode. (Talk only, no listening)  'T' -- set talker detection (sent to manager interface and meetme list)  'i' -- announce user join/leave  'p' -- allow user to exit the conference by pressing '#'  'X' -- allow user to exit the conference by entering a valid single  digit extension ${MEETME_EXIT_CONTEXT} or the current context  if that variable is not defined.  'd' -- dynamically add conference  'D' -- dynamically add conference, prompting for a PIN  'e' -- select an empty conference  'E' -- select an empty pinless conference  'v' -- video mode  'r' -- Record conference (records as ${MEETME_RECORDINGFILE}  using format ${MEETME_RECORDINGFORMAT}). Default filename is  meetme-conf-rec-${CONFNO}-${UNIQUEID} and the default format is wav.  'q' -- quiet mode (don't play enter/leave sounds)  'M' -- enable music on hold when the conference has a single caller  'x' -- close the conference when last marked user exits  'w' -- wait until the marked user enters the conference  'b' -- run AGI script specified in ${MEETME_AGI_BACKGROUND}  Default: conf-background.agi  (Note: This does not work with non-Zap channels in the same conference)  's' -- Present menu (user or admin) when '*' is received ('send' to menu)  'a' -- set admin mode  'A' -- set marked mode  'P' -- always prompt for the pin even if it is specified
 * </p>
 * Created : Sun Jul 09 18:51:37 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMe.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class MeetMe extends PbxApplication implements IMeetMe{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MeetMe
	**/
	public MeetMe(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MeetMe
	**/
	public MeetMe( String aconfno, String aoptions, String apin){
		super();
	
		this.confno = aconfno;	
		this.options = aoptions;	
		this.pin = apin;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MeetMe object){
		this.confno = object.confno;	
		this.options = object.options;	
		this.pin = object.pin;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String confno;
	public static final String VALUEID_CONFNO="confno" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

    /**   **/
	protected String pin;
	public static final String VALUEID_PIN="pin" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return true;
		}
		if(VALUEID_PIN.equals(valueid)){
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
		if(VALUEID_CONFNO.equals(valueid)){
			setConfno((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
		if(VALUEID_PIN.equals(valueid)){
			setPin((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return getConfno();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
		if(VALUEID_PIN.equals(valueid)){
			return getPin();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getconfno 
	* 
	**/
	public String getConfno(){		return  confno;
	}
	/**
	*setconfno 
	*/
	public void setConfno(String aconfno){
		if(aconfno==null){
		    changed = (this.confno!=null);
		    this.confno = null;	    
		}else{
			changed = aconfno.equals(this.confno);
			this.confno=aconfno;
		}
	}


	/**
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/**
	* getpin 
	* 
	**/
	public String getPin(){		return  pin;
	}
	/**
	*setpin 
	*/
	public void setPin(String apin){
		if(apin==null){
		    changed = (this.pin!=null);
		    this.pin = null;	    
		}else{
			changed = apin.equals(this.pin);
			this.pin=apin;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MeetMe, ")		
		//.append("confno=")
		.append(confno)
		.append(",")
		//.append("options=")
		.append(options)
		.append(",")
		//.append("pin=")
		.append(pin)
    			.append("");

		return sb.toString();		
	}
}