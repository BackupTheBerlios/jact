

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRetryDial<br>
 * Attempt to place a call. If no channel can be reached, play the file defined by 'announce' waiting 'sleep' seconds to retry the call. If the specified number of attempts matches  'loops' the call will continue in the dialplan. If 'loops' is set to 0, the call will retry endlessly.  While waiting, a 1 digit extension may be dialed. If that extension exists in either the context defined in ${EXITCONTEXT} or the current one, The call will transfer to that extension immmediately.  All arguments after 'loops' are passed directly to the Dial() application.
 * </p>
 * Created : Wed Jul 05 18:56:18 CEST 2006
 * 
 * @behavior.elementname RetryDial
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRetryDial.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IRetryDial {
public static final String MODELNAME = "RetryDial";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ANNOUNCE="announce" ;
// 	public static final String VALUEID_SLEEP="sleep" ;
// 	public static final String VALUEID_LOOPS="loops" ;
// 	public static final String VALUEID_TECHNOLOGY="technology" ;
// 	public static final String VALUEID_RESOURCE="resource" ;
// 	public static final String VALUEID_TECHNOLOGY2="technology2" ;
// 	public static final String VALUEID_RESOURCE2="resource2" ;
// 	public static final String VALUEID_TIMEOUT="timeout" ;
// 	public static final String VALUEID_OPTIONS="options" ;
// 	public static final String VALUEID_URL="url" ;
	//test
	//---------  getter und setter
	/**
	* getannounce 
	* 
	* @behavior.fieldname announce 
	**/
	public String getAnnounce();
	
	/**
	*setannounce 
	* 
	* @behavior.fieldname announce 
	*/
	public void setAnnounce(String aannounce);
	/**
	* getsleep 
	* 
	* @behavior.fieldname sleep 
	**/
	public String getSleep();
	
	/**
	*setsleep 
	* 
	* @behavior.fieldname sleep 
	*/
	public void setSleep(String asleep);
	/**
	* getloops 
	* 
	* @behavior.fieldname loops 
	**/
	public String getLoops();
	
	/**
	*setloops 
	* 
	* @behavior.fieldname loops 
	*/
	public void setLoops(String aloops);
	/**
	* gettechnology 
	* 
	* @behavior.fieldname technology 
	**/
	public String getTechnology();
	
	/**
	*settechnology 
	* 
	* @behavior.fieldname technology 
	*/
	public void setTechnology(String atechnology);
	/**
	* getresource 
	* 
	* @behavior.fieldname resource 
	**/
	public String getResource();
	
	/**
	*setresource 
	* 
	* @behavior.fieldname resource 
	*/
	public void setResource(String aresource);
	/**
	* gettechnology2 
	* 
	* @behavior.fieldname technology2 
	**/
	public String getTechnology2();
	
	/**
	*settechnology2 
	* 
	* @behavior.fieldname technology2 
	*/
	public void setTechnology2(String atechnology2);
	/**
	* getresource2 
	* 
	* @behavior.fieldname resource2 
	**/
	public String getResource2();
	
	/**
	*setresource2 
	* 
	* @behavior.fieldname resource2 
	*/
	public void setResource2(String aresource2);
	/**
	* gettimeout 
	* 
	* @behavior.fieldname timeout 
	**/
	public String getTimeout();
	
	/**
	*settimeout 
	* 
	* @behavior.fieldname timeout 
	*/
	public void setTimeout(String atimeout);
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
	/**
	* getuRL 
	* 
	* @behavior.fieldname uRL 
	**/
	public String getURL();
	
	/**
	*setuRL 
	* 
	* @behavior.fieldname uRL 
	*/
	public void setURL(String auRL);

}