

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAbsoluteTimeout<br>
 * Set the absolute maximum amount of time permitted for a call. A setting of 0 disables the timeout. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:55 CEST 2006
 * 
 * @behavior.elementname AbsoluteTimeout
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAbsoluteTimeout.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IAbsoluteTimeout {
public static final String MODELNAME = "AbsoluteTimeout";	
 
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