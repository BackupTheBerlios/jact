

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IWaitForRing<br>
 * Returns 0 after waiting at least timeout seconds. and only after the next ring has completed. Returns 0 on success or -1 on hangup
 * </p>
 * Created : Wed Jul 05 18:54:59 CEST 2006
 * 
 * @behavior.elementname WaitForRing
 * @author urs
 * @version $Revision: 1.1 $, $Id: IWaitForRing.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IWaitForRing {
public static final String MODELNAME = "WaitForRing";	
 
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