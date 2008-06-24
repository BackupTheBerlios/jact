

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IParkedCall<br>
 * Used to connect to a parked call. This application is always registered internally and does not need to be explicitly added into the dialplan, although you should include the 'parkedcalls' context.
 * </p>
 * Created : Wed Jul 05 18:53:56 CEST 2006
 * 
 * @behavior.elementname ParkedCall
 * @author urs
 * @version $Revision: 1.1 $, $Id: IParkedCall.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IParkedCall {
public static final String MODELNAME = "ParkedCall";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXTEN="exten" ;
	//test
	//---------  getter und setter
	/**
	* getexten 
	* 
	* @behavior.fieldname exten 
	**/
	public String getExten();
	
	/**
	*setexten 
	* 
	* @behavior.fieldname exten 
	*/
	public void setExten(String aexten);

}