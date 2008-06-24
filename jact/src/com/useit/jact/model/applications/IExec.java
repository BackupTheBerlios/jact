

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IExec<br>
 * Allows an arbitrary application to be invoked even when not hardcoded into the dialplan. Returns whatever value the app returns or -2 when the app cannot be found.
 * </p>
 * Created : Wed Jul 05 18:55:07 CEST 2006
 * 
 * @behavior.elementname Exec
 * @author urs
 * @version $Revision: 1.1 $, $Id: IExec.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IExec {
public static final String MODELNAME = "Exec";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_APPNAME="appname" ;
// 	public static final String VALUEID_ARGUMENTS="arguments" ;
	//test
	//---------  getter und setter
	/**
	* getappname 
	* 
	* @behavior.fieldname appname 
	**/
	public String getAppname();
	
	/**
	*setappname 
	* 
	* @behavior.fieldname appname 
	*/
	public void setAppname(String aappname);
	/**
	* getarguments 
	* 
	* @behavior.fieldname arguments 
	**/
	public String getArguments();
	
	/**
	*setarguments 
	* 
	* @behavior.fieldname arguments 
	*/
	public void setArguments(String aarguments);

}