

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IStripMSD<br>
 * Strips the leading 'count' digits from the channel's associated extension. For example, the number 5551212 when stripped with a count of 3 would be changed to 1212. This app always returns 0, and the PBX will continue processing at the next priority for the *new* extension.  So, for example, if priority 3 of 5551212 is StripMSD 3, the next step executed will be priority 4 of 1212. If you switch into an extension which has no first step, the PBX will treat it as though the user dialed an invalid extension.
 * </p>
 * Created : Wed Jul 05 18:55:46 CEST 2006
 * 
 * @behavior.elementname StripMSD
 * @author urs
 * @version $Revision: 1.1 $, $Id: IStripMSD.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IStripMSD {
public static final String MODELNAME = "StripMSD";	
 
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