

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IWait<br>
 * Waits for a specified number of seconds, then returns 0. seconds can be passed with fractions of a second. (eg: 1.5 = 1.5 seconds)
 * </p>
 * Created : Wed Jul 05 18:55:05 CEST 2006
 * 
 * @behavior.elementname Wait
 * @author urs
 * @version $Revision: 1.1 $, $Id: IWait.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IWait {
public static final String MODELNAME = "Wait";	
 
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