

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IPrefix<br>
 * Prepends the digit string specified by digits to the channel's associated extension. For example, the number 1212 when prefixed with '555' will become 5551212. This app always returns 0, and the PBX will continue processing at the next priority for the *new* extension.  So, for example, if priority 3 of 1212 is Prefix 555, the next step executed will be priority 4 of 5551212. If you switch into an extension which has no first step, the PBX will treat it as though the user dialed an invalid extension.
 * </p>
 * Created : Wed Jul 05 18:54:23 CEST 2006
 * 
 * @behavior.elementname Prefix
 * @author urs
 * @version $Revision: 1.1 $, $Id: IPrefix.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IPrefix {
public static final String MODELNAME = "Prefix";	
 
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