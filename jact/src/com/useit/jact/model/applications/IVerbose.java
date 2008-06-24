

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IVerbose<br>
 * level must be an integer value. If not specified, defaults to 0. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:07 CEST 2006
 * 
 * @behavior.elementname Verbose
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVerbose.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IVerbose {
public static final String MODELNAME = "Verbose";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_LEVEL="level" ;
// 	public static final String VALUEID_MESSAGE="message" ;
	//test
	//---------  getter und setter
	/**
	* getlevel 
	* 
	* @behavior.fieldname level 
	**/
	public String getLevel();
	
	/**
	*setlevel 
	* 
	* @behavior.fieldname level 
	*/
	public void setLevel(String alevel);
	/**
	* getmessage 
	* 
	* @behavior.fieldname message 
	**/
	public String getMessage();
	
	/**
	*setmessage 
	* 
	* @behavior.fieldname message 
	*/
	public void setMessage(String amessage);

}