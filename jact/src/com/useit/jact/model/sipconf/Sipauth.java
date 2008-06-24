package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Sipauth<br>
 * Global credentials for outbound calls, i.e. when a proxy challenges your  Asterisk server for authentication. These credentials override  any credentials in peer/register definition if realm is matched.   This way, Asterisk can authenticate for outbound calls to other  realms. We match realm on the proxy challenge and pick an set of   credentials from this list
 * </p>
 * Created : Fri May 26 14:32:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Sipauth.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class Sipauth extends AbstractSimpleDataClass implements ISipauth{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Sipauth
	**/
	public Sipauth(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Sipauth
	**/
	public Sipauth( String auser, String asecret, String amd5secret, String arealm){
		super();
	
		this.user = auser;	
		this.secret = asecret;	
		this.md5secret = amd5secret;	
		this.realm = arealm;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Sipauth object){
		this.user = object.user;	
		this.secret = object.secret;	
		this.md5secret = object.md5secret;	
		this.realm = object.realm;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String user;
	public static final String VALUEID_USER="user" ;

    /**   **/
	protected String secret;
	public static final String VALUEID_SECRET="secret" ;

    /**   **/
	protected String md5secret;
	public static final String VALUEID_MD5SECRET="md5secret" ;

    /**   **/
	protected String realm;
	public static final String VALUEID_REALM="realm" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_USER.equals(valueid)){
			return true;
		}
		if(VALUEID_SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_MD5SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_REALM.equals(valueid)){
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
		if(VALUEID_SECRET.equals(valueid)){
			setSecret((String)data);
			return;
		}
		if(VALUEID_MD5SECRET.equals(valueid)){
			setMd5secret((String)data);
			return;
		}
		if(VALUEID_REALM.equals(valueid)){
			setRealm((String)data);
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
		if(VALUEID_SECRET.equals(valueid)){
			return getSecret();
			
		}
		if(VALUEID_MD5SECRET.equals(valueid)){
			return getMd5secret();
			
		}
		if(VALUEID_REALM.equals(valueid)){
			return getRealm();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getuser 
	* 
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
	* getsecret 
	* 
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
	* getmd5secret 
	* 
	**/
	public String getMd5secret(){		return  md5secret;
	}
	/**
	*setmd5secret 
	*/
	public void setMd5secret(String amd5secret){
		if(amd5secret==null){
		    changed = (this.md5secret!=null);
		    this.md5secret = null;	    
		}else{
			changed = amd5secret.equals(this.md5secret);
			this.md5secret=amd5secret;
		}
	}


	/**
	* getrealm 
	* 
	**/
	public String getRealm(){		return  realm;
	}
	/**
	*setrealm 
	*/
	public void setRealm(String arealm){
		if(arealm==null){
		    changed = (this.realm!=null);
		    this.realm = null;	    
		}else{
			changed = arealm.equals(this.realm);
			this.realm=arealm;
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
		.append("secret=")
		.append(secret)
		.append(",")
		.append("md5secret=")
		.append(md5secret)
		.append(",")
		.append("realm=")
		.append(realm)
    			.append("]");

		return sb.toString();		
	}}