

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetCIDName<br>
 * Set Caller*ID Name on a call to a new value, while preserving the original Caller*ID number. This is useful for providing additional information to the called party. Always returns 0
 * </p>
 * Created : Wed Jul 05 18:56:04 CEST 2006
 * 
 * @behavior.elementname SetCIDName
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetCIDName.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISetCIDName {
public static final String MODELNAME = "SetCIDName";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CNAME="cname" ;
// 	public static final String VALUEID_A="a" ;
	//test
	//---------  getter und setter
	/**
	* getcname 
	* 
	* @behavior.fieldname cname 
	**/
	public String getCname();
	
	/**
	*setcname 
	* 
	* @behavior.fieldname cname 
	*/
	public void setCname(String acname);
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