package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * RetryDial<br>
 * Attempt to place a call. If no channel can be reached, play the file defined by 'announce' waiting 'sleep' seconds to retry the call. If the specified number of attempts matches  'loops' the call will continue in the dialplan. If 'loops' is set to 0, the call will retry endlessly.  While waiting, a 1 digit extension may be dialed. If that extension exists in either the context defined in ${EXITCONTEXT} or the current one, The call will transfer to that extension immmediately.  All arguments after 'loops' are passed directly to the Dial() application.
 * </p>
 * Created : Sun Jul 09 18:51:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RetryDial.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class RetryDial extends PbxApplication implements IRetryDial{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für RetryDial
	**/
	public RetryDial(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RetryDial
	**/
	public RetryDial( String aannounce, String asleep, String aloops, String atechnology, String aresource, String atechnology2, String aresource2, String atimeout, String aoptions, String auRL){
		super();
	
		this.announce = aannounce;	
		this.sleep = asleep;	
		this.loops = aloops;	
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
	public void assignTo(RetryDial object){
		this.announce = object.announce;	
		this.sleep = object.sleep;	
		this.loops = object.loops;	
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
	protected String announce;
	public static final String VALUEID_ANNOUNCE="announce" ;

    /**   **/
	protected String sleep;
	public static final String VALUEID_SLEEP="sleep" ;

    /**   **/
	protected String loops;
	public static final String VALUEID_LOOPS="loops" ;

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
		if(VALUEID_ANNOUNCE.equals(valueid)){
			return true;
		}
		if(VALUEID_SLEEP.equals(valueid)){
			return true;
		}
		if(VALUEID_LOOPS.equals(valueid)){
			return true;
		}
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
		if(VALUEID_ANNOUNCE.equals(valueid)){
			setAnnounce((String)data);
			return;
		}
		if(VALUEID_SLEEP.equals(valueid)){
			setSleep((String)data);
			return;
		}
		if(VALUEID_LOOPS.equals(valueid)){
			setLoops((String)data);
			return;
		}
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
		if(VALUEID_ANNOUNCE.equals(valueid)){
			return getAnnounce();
			
		}
		if(VALUEID_SLEEP.equals(valueid)){
			return getSleep();
			
		}
		if(VALUEID_LOOPS.equals(valueid)){
			return getLoops();
			
		}
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
	* getsleep 
	* 
	**/
	public String getSleep(){		return  sleep;
	}
	/**
	*setsleep 
	*/
	public void setSleep(String asleep){
		if(asleep==null){
		    changed = (this.sleep!=null);
		    this.sleep = null;	    
		}else{
			changed = asleep.equals(this.sleep);
			this.sleep=asleep;
		}
	}


	/**
	* getloops 
	* 
	**/
	public String getLoops(){		return  loops;
	}
	/**
	*setloops 
	*/
	public void setLoops(String aloops){
		if(aloops==null){
		    changed = (this.loops!=null);
		    this.loops = null;	    
		}else{
			changed = aloops.equals(this.loops);
			this.loops=aloops;
		}
	}


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
		sb.append("RetryDial, ")		
		//.append("announce=")
		.append(announce)
		.append(",")
		//.append("sleep=")
		.append(sleep)
		.append(",")
		//.append("loops=")
		.append(loops)
		.append(",")
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