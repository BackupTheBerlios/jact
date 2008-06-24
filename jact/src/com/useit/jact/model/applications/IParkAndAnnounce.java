

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IParkAndAnnounce<br>
 * Park a call into the parkinglot and announce the call over the console. announce template: colon separated list of files to announce, the word PARKED  will be replaced by a say_digits of the ext the call is parked in timeout: time in seconds before the call returns into the return context. dial: The app_dial style resource to call to make the announcement. Console/dsp calls the console. return_context: the goto style label to jump the call back into after timeout. default=prio+1
 * </p>
 * Created : Wed Jul 05 18:54:43 CEST 2006
 * 
 * @behavior.elementname ParkAndAnnounce
 * @author urs
 * @version $Revision: 1.1 $, $Id: IParkAndAnnounce.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IParkAndAnnounce {
public static final String MODELNAME = "ParkAndAnnounce";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ANNOUNCE="announce" ;
// 	public static final String VALUEID_TEMPLATE="template" ;
// 	public static final String VALUEID_TIMEOUT="timeout" ;
// 	public static final String VALUEID_DIAL="dial" ;
// 	public static final String VALUEID_RETURN_CONTEXT="return_context" ;
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
	* gettemplate 
	* 
	* @behavior.fieldname template 
	**/
	public String getTemplate();
	
	/**
	*settemplate 
	* 
	* @behavior.fieldname template 
	*/
	public void setTemplate(String atemplate);
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
	* getdial 
	* 
	* @behavior.fieldname dial 
	**/
	public String getDial();
	
	/**
	*setdial 
	* 
	* @behavior.fieldname dial 
	*/
	public void setDial(String adial);
	/**
	* getreturn_context 
	* 
	* @behavior.fieldname return_context 
	**/
	public String getReturn_context();
	
	/**
	*setreturn_context 
	* 
	* @behavior.fieldname return_context 
	*/
	public void setReturn_context(String areturn_context);

}