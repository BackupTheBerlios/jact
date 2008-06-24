package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Iaxregister<br>
 * Register with a SIP provider
 * </p>
 * Created : Fri May 26 14:31:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Iaxregister.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  class Iaxregister extends AbstractSimpleDataClass implements IIaxregister{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Iaxregister
	**/
	public Iaxregister(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Iaxregister
	**/
	public Iaxregister( String auser, String aauthuser, String asecret, String ahost, Integer aport, String aextension){
		super();
	
		this.user = auser;	
		this.authuser = aauthuser;	
		this.secret = asecret;	
		this.host = ahost;	
		this.port = aport;	
		this.extension = aextension;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Iaxregister object){
		this.user = object.user;	
		this.authuser = object.authuser;	
		this.secret = object.secret;	
		this.host = object.host;	
		this.port = object.port;	
		this.extension = object.extension;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  is the user id for this SIP server (ex 2345) **/
	protected String user;
	public static final String VALUEID_USER="user" ;

    /**  is the optional authorization user for the SIP server **/
	protected String authuser;
	public static final String VALUEID_AUTHUSER="authuser" ;

    /**  is the user's password **/
	protected String secret;
	public static final String VALUEID_SECRET="secret" ;

    /**  is the domain or host name for the SIP server. This SIP server needs a definition in a section of its own in SIP.conf (mysipprovider.com). **/
	protected String host;
	public static final String VALUEID_HOST="host" ;

    /**  send the register request to this port at host. Defaults to 5060 **/
	protected Integer port;
	public static final String VALUEID_PORT="port" ;

    /**  the Asterisk contact extension. 1234 is put into the contact header in the SIP Register message. The contact extension is used by remote SIP server when it needs to send a call to Asterisk. See the example below. The default context extension is "s". **/
	protected String extension;
	public static final String VALUEID_EXTENSION="extension" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_USER.equals(valueid)){
			return true;
		}
		if(VALUEID_AUTHUSER.equals(valueid)){
			return true;
		}
		if(VALUEID_SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_HOST.equals(valueid)){
			return true;
		}
		if(VALUEID_PORT.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
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
		if(VALUEID_USER.equals(valueid)){
			setUser((String)data);
			return;
		}
		if(VALUEID_AUTHUSER.equals(valueid)){
			setAuthuser((String)data);
			return;
		}
		if(VALUEID_SECRET.equals(valueid)){
			setSecret((String)data);
			return;
		}
		if(VALUEID_HOST.equals(valueid)){
			setHost((String)data);
			return;
		}
		if(VALUEID_PORT.equals(valueid)){
			if(data instanceof String){
		        setPort(new Integer((String)data));
		        return;
		    }
			setPort((Integer)data);
			return;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			setExtension((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_USER.equals(valueid)){
			return getUser();
			
		}
		if(VALUEID_AUTHUSER.equals(valueid)){
			return getAuthuser();
			
		}
		if(VALUEID_SECRET.equals(valueid)){
			return getSecret();
			
		}
		if(VALUEID_HOST.equals(valueid)){
			return getHost();
			
		}
		if(VALUEID_PORT.equals(valueid)){
			return getPort();
			
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return getExtension();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getuser 
	* is the user id for this SIP server (ex 2345)
	**/
	public String getUser(){		return  user;
	}
	/**
	*setuser 
	*/
	public void setUser(String auser){
		if(auser==null){
		    changed = (this.user!=null);
		    this.user = null;	    
		}else{
			changed = auser.equals(this.user);
			this.user=auser;
		}
	}


	/**
	* getauthuser 
	* is the optional authorization user for the SIP server
	**/
	public String getAuthuser(){		return  authuser;
	}
	/**
	*setauthuser 
	*/
	public void setAuthuser(String aauthuser){
		if(aauthuser==null){
		    changed = (this.authuser!=null);
		    this.authuser = null;	    
		}else{
			changed = aauthuser.equals(this.authuser);
			this.authuser=aauthuser;
		}
	}


	/**
	* getsecret 
	* is the user's password
	**/
	public String getSecret(){		return  secret;
	}
	/**
	*setsecret 
	*/
	public void setSecret(String asecret){
		if(asecret==null){
		    changed = (this.secret!=null);
		    this.secret = null;	    
		}else{
			changed = asecret.equals(this.secret);
			this.secret=asecret;
		}
	}


	/**
	* gethost 
	* is the domain or host name for the SIP server. This SIP server needs a definition in a section of its own in SIP.conf (mysipprovider.com).
	**/
	public String getHost(){		return  host;
	}
	/**
	*sethost 
	*/
	public void setHost(String ahost){
		if(ahost==null){
		    changed = (this.host!=null);
		    this.host = null;	    
		}else{
			changed = ahost.equals(this.host);
			this.host=ahost;
		}
	}


	/**
	* getport 
	* send the register request to this port at host. Defaults to 5060
	**/
	public Integer getPort(){		return  port;
	}
	/**
	*setport 
	*/
	public void setPort(Integer aport){
		if(aport==null){
		    changed = (this.port!=null);
		    this.port = null;	    
		}else{
			changed = aport.equals(this.port);
			this.port=aport;
		}
	}


	/**
	* getextension 
	* the Asterisk contact extension. 1234 is put into the contact header in the SIP Register message. The contact extension is used by remote SIP server when it needs to send a call to Asterisk. See the example below. The default context extension is "s".
	**/
	public String getExtension(){		return  extension;
	}
	/**
	*setextension 
	*/
	public void setExtension(String aextension){
		if(aextension==null){
		    changed = (this.extension!=null);
		    this.extension = null;	    
		}else{
			changed = aextension.equals(this.extension);
			this.extension=aextension;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("user=")
		.append(user)
		.append(",")
		.append("authuser=")
		.append(authuser)
		.append(",")
		.append("secret=")
		.append(secret)
		.append(",")
		.append("host=")
		.append(host)
		.append(",")
		.append("port=")
		.append(port)
		.append(",")
		.append("extension=")
		.append(extension)
    			.append("]");

		return sb.toString();		
	}}