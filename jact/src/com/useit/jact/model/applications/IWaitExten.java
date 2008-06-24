

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IWaitExten<br>
 * Waits for the user to enter a new extension for the  specified number of seconds, then returns 0. Seconds can be passed with fractions of a seconds (eg: 1.5 = 1.5 seconds) or if unspecified the default extension timeout will be used.
 * </p>
 * Created : Wed Jul 05 18:54:22 CEST 2006
 * 
 * @behavior.elementname WaitExten
 * @author urs
 * @version $Revision: 1.1 $, $Id: IWaitExten.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IWaitExten {
public static final String MODELNAME = "WaitExten";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_SECONDS="seconds" ;
	//test
	//---------  getter und setter
	/**
	* getseconds 
	* 
	* @behavior.fieldname seconds 
	**/
	public String getSeconds();
	
	/**
	*setseconds 
	* 
	* @behavior.fieldname seconds 
	*/
	public void setSeconds(String aseconds);

}