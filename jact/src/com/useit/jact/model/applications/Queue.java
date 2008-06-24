package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Queue<br>
 * Queues an incoming call in a particular call queue as defined in queues.conf.  This application returns -1 if the originating channel hangs up, or if the call is bridged and either of the parties in the bridge terminate the call. Returns 0 if the queue is full, nonexistant, or has no members. The option string may contain zero or more of the following characters:  't' -- allow the called user transfer the calling user  'T' -- to allow the calling user to transfer the call.  'd' -- data-quality (modem) call (minimum delay).  'h' -- allow callee to hang up by hitting *.  'H' -- allow caller to hang up by hitting *.  'n' -- no retries on the timeout; will exit this application and    go to the next step.  'r' -- ring instead of playing MOH  In addition to transferring the call, a call may be parked and then picked up by another user.  The optional URL will be sent to the called party if the channel supports it.  The timeout will cause the queue to fail out after a specified number of seconds, checked between each queues.conf 'timeout' and 'retry' cycle.
 * </p>
 * Created : Sun Jul 09 18:51:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Queue.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Queue extends PbxApplication implements IQueue{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Queue
	**/
	public Queue(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Queue
	**/
	public Queue( String aqueuename, String aoptions, String auRL, String aannounceoverride, String atimeout){
		super();
	
		this.queuename = aqueuename;	
		this.options = aoptions;	
		this.uRL = auRL;	
		this.announceoverride = aannounceoverride;	
		this.timeout = atimeout;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Queue object){
		this.queuename = object.queuename;	
		this.options = object.options;	
		this.uRL = object.uRL;	
		this.announceoverride = object.announceoverride;	
		this.timeout = object.timeout;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String queuename;
	public static final String VALUEID_QUEUENAME="queuename" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

    /**   **/
	protected String uRL;
	public static final String VALUEID_URL="url" ;

    /**   **/
	protected String announceoverride;
	public static final String VALUEID_ANNOUNCEOVERRIDE="announceoverride" ;

    /**   **/
	protected String timeout;
	public static final String VALUEID_TIMEOUT="timeout" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_QUEUENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return true;
		}
		if(VALUEID_URL.equals(valueid)){
			return true;
		}
		if(VALUEID_ANNOUNCEOVERRIDE.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
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
		if(VALUEID_QUEUENAME.equals(valueid)){
			setQueuename((String)data);
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
		if(VALUEID_ANNOUNCEOVERRIDE.equals(valueid)){
			setAnnounceoverride((String)data);
			return;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			setTimeout((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_QUEUENAME.equals(valueid)){
			return getQueuename();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
		if(VALUEID_URL.equals(valueid)){
			return getURL();
			
		}
		if(VALUEID_ANNOUNCEOVERRIDE.equals(valueid)){
			return getAnnounceoverride();
			
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return getTimeout();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getqueuename 
	* 
	**/
	public String getQueuename(){		return  queuename;
	}
	/**
	*setqueuename 
	*/
	public void setQueuename(String aqueuename){
		if(aqueuename==null){
		    changed = (this.queuename!=null);
		    this.queuename = null;	    
		}else{
			changed = aqueuename.equals(this.queuename);
			this.queuename=aqueuename;
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
	* getannounceoverride 
	* 
	**/
	public String getAnnounceoverride(){		return  announceoverride;
	}
	/**
	*setannounceoverride 
	*/
	public void setAnnounceoverride(String aannounceoverride){
		if(aannounceoverride==null){
		    changed = (this.announceoverride!=null);
		    this.announceoverride = null;	    
		}else{
			changed = aannounceoverride.equals(this.announceoverride);
			this.announceoverride=aannounceoverride;
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Queue, ")		
		//.append("queuename=")
		.append(queuename)
		.append(",")
		//.append("options=")
		.append(options)
		.append(",")
		//.append("uRL=")
		.append(uRL)
		.append(",")
		//.append("announceoverride=")
		.append(announceoverride)
		.append(",")
		//.append("timeout=")
		.append(timeout)
    			.append("");

		return sb.toString();		
	}
}