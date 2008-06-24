

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IResetCDR<br>
 * Causes the Call Data Record to be reset, optionally storing the current CDR before zeroing it out (if 'w' option is specifed) record will be stored. (if 'a' option is specifed) any stacked records will be stored. (if 'v' option is specifed) any variables will be saved. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:21 CEST 2006
 * 
 * @behavior.elementname ResetCDR
 * @author urs
 * @version $Revision: 1.1 $, $Id: IResetCDR.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IResetCDR {
public static final String MODELNAME = "ResetCDR";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);

}