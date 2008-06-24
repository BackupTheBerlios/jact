

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDumpChan<br>
 * Displays information on channel and listing of all channel variables. If min_verbose_level is specified, output is only displayed when the verbose level is currently set to that number or greater. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:15 CEST 2006
 * 
 * @behavior.elementname DumpChan
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDumpChan.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IDumpChan {
public static final String MODELNAME = "DumpChan";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MIN_VERBOSE_LEVEL="min_verbose_level" ;
	//test
	//---------  getter und setter
	/**
	* getmin_verbose_level 
	* 
	* @behavior.fieldname min_verbose_level 
	**/
	public String getMin_verbose_level();
	
	/**
	*setmin_verbose_level 
	* 
	* @behavior.fieldname min_verbose_level 
	*/
	public void setMin_verbose_level(String amin_verbose_level);

}