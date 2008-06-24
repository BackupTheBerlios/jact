

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetCallerID<br>
 * Set Caller*ID on a call to a new value. Sets ANI as well if a flag is used. Always returns 0
 * </p>
 * Created : Wed Jul 05 18:55:45 CEST 2006
 * 
 * @behavior.elementname SetCallerID
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetCallerID.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISetCallerID {
public static final String MODELNAME = "SetCallerID";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CLID="clid" ;
// 	public static final String VALUEID_A="a" ;
	//test
	//---------  getter und setter
	/**
	* getclid 
	* 
	* @behavior.fieldname clid 
	**/
	public String getClid();
	
	/**
	*setclid 
	* 
	* @behavior.fieldname clid 
	*/
	public void setClid(String aclid);
	/**
	* geta 
	* 
	* @behavior.fieldname a 
	**/
	public String getA();
	
	/**
	*seta 
	* 
	* @behavior.fieldname a 
	*/
	public void setA(String aa);

}