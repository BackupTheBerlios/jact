

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IStripLSD<br>
 * Strips the trailing 'count' digits from the channel's associated extension. For example, the number 5551212 when stripped with a count of 4 would be changed to 555. This app always returns 0, and the PBX will continue processing at the next priority for the *new* extension.  So, for example, if priority 3 of 5551212 is StripLSD 4, the next step executed will be priority 4 of 555. If you switch into an extension which has no first step, the PBX will treat it as though the user dialed an invalid extension.
 * </p>
 * Created : Wed Jul 05 18:55:53 CEST 2006
 * 
 * @behavior.elementname StripLSD
 * @author urs
 * @version $Revision: 1.1 $, $Id: IStripLSD.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IStripLSD {
public static final String MODELNAME = "StripLSD";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_COUNT="count" ;
	//test
	//---------  getter und setter
	/**
	* getcount 
	* 
	* @behavior.fieldname count 
	**/
	public String getCount();
	
	/**
	*setcount 
	* 
	* @behavior.fieldname count 
	*/
	public void setCount(String acount);

}