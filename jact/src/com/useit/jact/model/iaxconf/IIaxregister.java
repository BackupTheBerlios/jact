

package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IIaxregister<br>
 * Register with a SIP provider
 * </p>
 * Created : Fri May 26 14:30:28 CEST 2006
 * 
 * @behavior.elementname Iaxregister
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIaxregister.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  interface  IIaxregister {
public static final String MODELNAME = "Iaxregister";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_USER="user" ;
// 	public static final String VALUEID_AUTHUSER="authuser" ;
// 	public static final String VALUEID_SECRET="secret" ;
// 	public static final String VALUEID_HOST="host" ;
// 	public static final String VALUEID_PORT="port" ;
// 	public static final String VALUEID_EXTENSION="extension" ;
	
	//---------  getter und setter

	/**
	* getuser 
	* is the user id for this SIP server (ex 2345)
	* @behavior.fieldname user 
	**/
	public String getUser();
	
	/**
	*setuser 
	* is the user id for this SIP server (ex 2345)
	* @behavior.fieldname user 
	*/
	public void setUser(String auser);


	/**
	* getauthuser 
	* is the optional authorization user for the SIP server
	* @behavior.fieldname authuser 
	**/
	public String getAuthuser();
	
	/**
	*setauthuser 
	* is the optional authorization user for the SIP server
	* @behavior.fieldname authuser 
	*/
	public void setAuthuser(String aauthuser);


	/**
	* getsecret 
	* is the user's password
	* @behavior.fieldname secret 
	**/
	public String getSecret();
	
	/**
	*setsecret 
	* is the user's password
	* @behavior.fieldname secret 
	*/
	public void setSecret(String asecret);


	/**
	* gethost 
	* is the domain or host name for the SIP server. This SIP server needs a definition in a section of its own in SIP.conf (mysipprovider.com).
	* @behavior.fieldname host 
	**/
	public String getHost();
	
	/**
	*sethost 
	* is the domain or host name for the SIP server. This SIP server needs a definition in a section of its own in SIP.conf (mysipprovider.com).
	* @behavior.fieldname host 
	*/
	public void setHost(String ahost);


	/**
	* getport 
	* send the register request to this port at host. Defaults to 5060
	* @behavior.fieldname port 
	**/
	public Integer getPort();
	
	/**
	*setport 
	* send the register request to this port at host. Defaults to 5060
	* @behavior.fieldname port 
	*/
	public void setPort(Integer aport);


	/**
	* getextension 
	* the Asterisk contact extension. 1234 is put into the contact header in the SIP Register message. The contact extension is used by remote SIP server when it needs to send a call to Asterisk. See the example below. The default context extension is "s".
	* @behavior.fieldname extension 
	**/
	public String getExtension();
	
	/**
	*setextension 
	* the Asterisk contact extension. 1234 is put into the contact header in the SIP Register message. The contact extension is used by remote SIP server when it needs to send a call to Asterisk. See the example below. The default context extension is "s".
	* @behavior.fieldname extension 
	*/
	public void setExtension(String aextension);


}