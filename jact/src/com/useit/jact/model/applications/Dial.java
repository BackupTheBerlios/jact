package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Dial<br>
 * Requests one or more channels and places specified outgoing calls on them. As soon as a channel answers, the Dial app will answer the originating channel (if it needs to be answered) and will bridge a call with the channel which first answered. All other calls placed by the Dial app will be hung up. If a timeout is not specified, the Dial application will wait indefinitely until either one of the called channels answers, the user hangs up, or all channels return busy or error. In general, the dialer will return 0 if it was unable to place the call, or the timeout expired. However, if all channels were busy, and there exists an extension with priority n+101 (where n is the priority of the dialer instance), then it will be the next executed extension (this allows you to setup different behavior on busy from no-answer).  This application returns -1 if the originating channel hangs up, or if the call is bridged and either of the parties in the bridge terminate the call. The option string may contain zero or more of the following characters:  'd' -- allow the calling user to dial a 1 digit extension while waiting for a call to  be answered exiting to that extension if it exists in the context defined by  ${EXITCONTEXT} or the current context.  't' -- allow the called user to transfer the calling user by hitting #.  'T' -- allow the calling user to transfer the call by hitting #.  'w' -- allow the called user to write the conversation to disk via app_monitor  'W' -- allow the calling user to write the conversation to disk via app_monitor  'f' -- Forces callerid to be set as the extension of the line   making/redirecting the outgoing call. For example, some PSTNs  don't allow callerids from other extensions then the ones  that are assigned to you.  'o' -- Original (inbound) Caller*ID should be placed on the outbound leg of the call  instead of using the destination extension (old style asterisk behavior)  'r' -- indicate ringing to the calling party, pass no audio until answered.  'm[(class)]' -- provide hold music to the calling party until answered (optionally  with the specified class.  'M(x[^arg]) -- Executes the macro (x with ^ delim arg list) upon connect of the call.  Also, the macro can set the MACRO_RESULT variable to do the following:  -- ABORT - Hangup both legs of the call.  -- CONGESTION - Behave as if line congestion was encountered.  -- BUSY - Behave as if a busy signal was encountered. (n+101)  -- CONTINUE - Hangup the called party and continue on in the dialplan.  -- GOTO:<context>^<exten>^<priority> - Transfer the call.  'h' -- allow callee to hang up by hitting *.  'H' -- allow caller to hang up by hitting *.  'C' -- reset call detail record for this call.  'P[(x)]' -- privacy mode, using 'x' as database if provided.  'g' -- goes on in context if the destination channel hangs up  'A(x)' -- play an announcement to the called party, using x as file  'S(x)' -- hangup the call after x seconds AFTER called party picked up  'D([digits])' -- Send DTMF digit string *after* called party has answered  but before the bridge. (w=500ms sec pause)  'L(x[:y][:z])' -- Limit the call to 'x' ms warning when 'y' ms are left  repeated every 'z' ms) Only 'x' is required, 'y' and 'z' are optional.  The following special variables are optional:  * LIMIT_PLAYAUDIO_CALLER yes|no (default yes)  Play sounds to the caller.  * LIMIT_PLAYAUDIO_CALLEE yes|no  Play sounds to the callee.  * LIMIT_TIMEOUT_FILE File to play when time is up.  * LIMIT_CONNECT_FILE File to play when call begins.  * LIMIT_WARNING_FILE File to play as warning if 'y' is defined.  'timeleft' is a special sound macro to auto-say the time   left and is the default.   In addition to transferring the call, a call may be parked and then picked up by another user.  The optional URL will be sent to the called party if the channel supports it.  If the OUTBOUND_GROUP variable is set, all peer channels created by this  application will be put into that group (as in SetGroup).  This application sets the following channel variables upon completion:  DIALEDTIME Time from dial to answer  ANSWEREDTIME Time for actual call  DIALSTATUS The status of the call as a text string, one of  CHANUNAVAIL | CONGESTION | NOANSWER | BUSY | ANSWER | CANCEL
 * </p>
 * Created : Sun Jul 09 18:49:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Dial.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Dial extends PbxApplication implements IDial{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Dial
	**/
	public Dial(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Dial
	**/
	public Dial( String atechnology, String aresource, String atechnology2, String aresource2, String atimeout, String aoptions, String auRL){
		super();
	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.technology2 = atechnology2;	
		this.resource2 = aresource2;	
		this.timeout = atimeout;	
		this.options = aoptions;	
		this.uRL = auRL;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Dial object){
		this.technology = object.technology;	
		this.resource = object.resource;	
		this.technology2 = object.technology2;	
		this.resource2 = object.resource2;	
		this.timeout = object.timeout;	
		this.options = object.options;	
		this.uRL = object.uRL;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String technology;
	public static final String VALUEID_TECHNOLOGY="technology" ;

    /**   **/
	protected String resource;
	public static final String VALUEID_RESOURCE="resource" ;

    /**   **/
	protected String technology2;
	public static final String VALUEID_TECHNOLOGY2="technology2" ;

    /**   **/
	protected String resource2;
	public static final String VALUEID_RESOURCE2="resource2" ;

    /**   **/
	protected String timeout;
	public static final String VALUEID_TIMEOUT="timeout" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

    /**   **/
	protected String uRL;
	public static final String VALUEID_URL="url" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			return true;
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			return true;
		}
		if(VALUEID_TECHNOLOGY2.equals(valueid)){
			return true;
		}
		if(VALUEID_RESOURCE2.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return true;
		}
		if(VALUEID_URL.equals(valueid)){
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
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			setTechnology((String)data);
			return;
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			setResource((String)data);
			return;
		}
		if(VALUEID_TECHNOLOGY2.equals(valueid)){
			setTechnology2((String)data);
			return;
		}
		if(VALUEID_RESOURCE2.equals(valueid)){
			setResource2((String)data);
			return;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			setTimeout((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
		if(VALUEID_URL.equals(valueid)){
			setURL((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			return getTechnology();
			
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			return getResource();
			
		}
		if(VALUEID_TECHNOLOGY2.equals(valueid)){
			return getTechnology2();
			
		}
		if(VALUEID_RESOURCE2.equals(valueid)){
			return getResource2();
			
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return getTimeout();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
		if(VALUEID_URL.equals(valueid)){
			return getURL();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettechnology 
	* 
	**/
	public String getTechnology(){		return  technology;
	}
	/**
	*settechnology 
	*/
	public void setTechnology(String atechnology){
		if(atechnology==null){
		    changed = (this.technology!=null);
		    this.technology = null;	    
		}else{
			changed = atechnology.equals(this.technology);
			this.technology=atechnology;
		}
	}


	/**
	* getresource 
	* 
	**/
	public String getResource(){		return  resource;
	}
	/**
	*setresource 
	*/
	public void setResource(String aresource){
		if(aresource==null){
		    changed = (this.resource!=null);
		    this.resource = null;	    
		}else{
			changed = aresource.equals(this.resource);
			this.resource=aresource;
		}
	}


	/**
	* gettechnology2 
	* 
	**/
	public String getTechnology2(){		return  technology2;
	}
	/**
	*settechnology2 
	*/
	public void setTechnology2(String atechnology2){
		if(atechnology2==null){
		    changed = (this.technology2!=null);
		    this.technology2 = null;	    
		}else{
			changed = atechnology2.equals(this.technology2);
			this.technology2=atechnology2;
		}
	}


	/**
	* getresource2 
	* 
	**/
	public String getResource2(){		return  resource2;
	}
	/**
	*setresource2 
	*/
	public void setResource2(String aresource2){
		if(aresource2==null){
		    changed = (this.resource2!=null);
		    this.resource2 = null;	    
		}else{
			changed = aresource2.equals(this.resource2);
			this.resource2=aresource2;
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Dial, ")		
		//.append("technology=")
		.append(technology)
		.append(",")
		//.append("resource=")
		.append(resource)
		.append(",")
		//.append("technology2=")
		.append(technology2)
		.append(",")
		//.append("resource2=")
		.append(resource2)
		.append(",")
		//.append("timeout=")
		.append(timeout)
		.append(",")
		//.append("options=")
		.append(options)
		.append(",")
		//.append("uRL=")
		.append(uRL)
    			.append("");

		return sb.toString();		
	}
}