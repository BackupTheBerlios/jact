

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IResponseTimeout<br>
 * Set the maximum amount of time permitted after falling through a series of priorities for a channel in which the user may begin typing an extension. If the user does not type an extension in this amount of time, control will pass to the 't' extension if it exists, and if not the call would be terminated. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:56:25 CEST 2006
 * 
 * @behavior.elementname ResponseTimeout
 * @author urs
 * @version $Revision: 1.1 $, $Id: IResponseTimeout.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IResponseTimeout {
public static final String MODELNAME = "ResponseTimeout";	
 
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