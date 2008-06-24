

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetAMAFlags<br>
 * Set the channel AMA Flags for billing purposes. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:47 CEST 2006
 * 
 * @behavior.elementname SetAMAFlags
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetAMAFlags.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISetAMAFlags {
public static final String MODELNAME = "SetAMAFlags";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FLAG="flag" ;
	//test
	//---------  getter und setter
	/**
	* getflag 
	* 
	* @behavior.fieldname flag 
	**/
	public String getFlag();
	
	/**
	*setflag 
	* 
	* @behavior.fieldname flag 
	*/
	public void setFlag(String aflag);

}