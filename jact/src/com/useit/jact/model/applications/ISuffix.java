

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISuffix<br>
 * Appends the digit string specified by digits to the channel's associated extension. For example, the number 555 when suffixed with '1212' will become 5551212. This app always returns 0, and the PBX will continue processing at the next priority for the *new* extension.  So, for example, if priority 3 of 555 is Suffix 1212, the next step executed will be priority 4 of 5551212. If you switch into an extension which has no first step, the PBX will treat it as though the user dialed an invalid extension.
 * </p>
 * Created : Wed Jul 05 18:55:11 CEST 2006
 * 
 * @behavior.elementname Suffix
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISuffix.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISuffix {
public static final String MODELNAME = "Suffix";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DIGITS="digits" ;
	//test
	//---------  getter und setter
	/**
	* getdigits 
	* 
	* @behavior.fieldname digits 
	**/
	public String getDigits();
	
	/**
	*setdigits 
	* 
	* @behavior.fieldname digits 
	*/
	public void setDigits(String adigits);

}