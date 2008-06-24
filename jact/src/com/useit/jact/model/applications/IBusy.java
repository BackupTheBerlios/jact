

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IBusy<br>
 * Requests that the channel indicate busy condition and then waits for the user to hang up or the optional timeout to expire. Always returns -1.
 * </p>
 * Created : Wed Jul 05 18:54:13 CEST 2006
 * 
 * @behavior.elementname Busy
 * @author urs
 * @version $Revision: 1.1 $, $Id: IBusy.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IBusy {
public static final String MODELNAME = "Busy";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TIMEOUT="timeout" ;
	//test
	//---------  getter und setter
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

}