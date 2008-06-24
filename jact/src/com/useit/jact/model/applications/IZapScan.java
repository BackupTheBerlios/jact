

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZapScan<br>
 * allows a call center manager to monitor Zap channels in a convenient way. Use '#' to select the next channel and use '*' to exit Limit scanning to a channel GROUP by setting the option group argument.
 * </p>
 * Created : Wed Jul 05 18:55:34 CEST 2006
 * 
 * @behavior.elementname ZapScan
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapScan.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IZapScan {
public static final String MODELNAME = "ZapScan";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_GROUP="group" ;
	//test
	//---------  getter und setter
	/**
	* getgroup 
	* 
	* @behavior.fieldname group 
	**/
	public String getGroup();
	
	/**
	*setgroup 
	* 
	* @behavior.fieldname group 
	*/
	public void setGroup(String agroup);

}