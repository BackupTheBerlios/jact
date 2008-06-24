

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDigitTimeout<br>
 * Set the maximum amount of time permitted between digits when the user is typing in an extension. When this timeout expires, after the user has started to type in an extension, the extension will be considered complete, and will be interpreted. Note that if an extension typed in is valid, it will not have to timeout to be tested, so typically at the expiry of this timeout, the extension will be considered invalid (and thus control would be passed to the 'i' extension, or if it doesn't exist the call would be terminated). Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:53:45 CEST 2006
 * 
 * @behavior.elementname DigitTimeout
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDigitTimeout.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IDigitTimeout {
public static final String MODELNAME = "DigitTimeout";	
 
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