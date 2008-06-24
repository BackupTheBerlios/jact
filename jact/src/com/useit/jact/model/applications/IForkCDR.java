

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IForkCDR<br>
 * Causes the Call Data Record to fork an additional cdr record starting from the time of the fork call If the option 'v' is passed all cdr variables will be passed along also.
 * </p>
 * Created : Wed Jul 05 18:55:26 CEST 2006
 * 
 * @behavior.elementname ForkCDR
 * @author urs
 * @version $Revision: 1.1 $, $Id: IForkCDR.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IForkCDR {
public static final String MODELNAME = "ForkCDR";	
 
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