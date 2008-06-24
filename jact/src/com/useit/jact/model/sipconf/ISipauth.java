

package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISipauth<br>
 * Global credentials for outbound calls, i.e. when a proxy challenges your  Asterisk server for authentication. These credentials override  any credentials in peer/register definition if realm is matched.   This way, Asterisk can authenticate for outbound calls to other  realms. We match realm on the proxy challenge and pick an set of   credentials from this list
 * </p>
 * Created : Fri May 26 14:30:37 CEST 2006
 * 
 * @behavior.elementname Sipauth
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISipauth.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  ISipauth {
public static final String MODELNAME = "Sipauth";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_USER="user" ;
// 	public static final String VALUEID_SECRET="secret" ;
// 	public static final String VALUEID_MD5SECRET="md5secret" ;
// 	public static final String VALUEID_REALM="realm" ;
	
	//---------  getter und setter

	/**
	* getuser 
	* 
	* @behavior.fieldname user 
	**/
	public String getUser();
	
	/**
	*setuser 
	* 
	* @behavior.fieldname user 
	*/
	public void setUser(String auser);


	/**
	* getsecret 
	* 
	* @behavior.fieldname secret 
	**/
	public String getSecret();
	
	/**
	*setsecret 
	* 
	* @behavior.fieldname secret 
	*/
	public void setSecret(String asecret);


	/**
	* getmd5secret 
	* 
	* @behavior.fieldname md5secret 
	**/
	public String getMd5secret();
	
	/**
	*setmd5secret 
	* 
	* @behavior.fieldname md5secret 
	*/
	public void setMd5secret(String amd5secret);


	/**
	* getrealm 
	* 
	* @behavior.fieldname realm 
	**/
	public String getRealm();
	
	/**
	*setrealm 
	* 
	* @behavior.fieldname realm 
	*/
	public void setRealm(String arealm);


}