

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAuthenticate<br>
 * Requires a user to enter agiven password in order to continue execution. If the password begins with the '/' character, it is interpreted as a file which contains a list of valid passwords (1 per line). an optional set of opions may be provided by concatenating any of the following letters:  a - Set account code to the password that is entered  d - Interpret path as database key, not literal file  j - Support jumping to n+101  r - Remove database key upon successful entry (valid with 'd' only)  When using a database key, the value associated with the key can be anything. Returns 0 if the user enters a valid password within three tries, or -1 on hangup. If the priority n+101 exists and invalid authentication was entered, and the 'j' flag was specified, processing will jump to n+101 and 0 will be returned.
 * </p>
 * Created : Wed Jul 05 18:55:59 CEST 2006
 * 
 * @behavior.elementname Authenticate
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAuthenticate.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IAuthenticate {
public static final String MODELNAME = "Authenticate";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PASSWORD="password" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getpassword 
	* 
	* @behavior.fieldname password 
	**/
	public String getPassword();
	
	/**
	*setpassword 
	* 
	* @behavior.fieldname password 
	*/
	public void setPassword(String apassword);
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);

}