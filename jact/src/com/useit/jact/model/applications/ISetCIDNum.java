

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetCIDNum<br>
 * Set Caller*ID Number on a call to a new value, while preserving the original Caller*ID name. This is useful for providing additional information to the called party. Sets ANI as well if a flag is used. Always returns 0
 * </p>
 * Created : Wed Jul 05 18:53:37 CEST 2006
 * 
 * @behavior.elementname SetCIDNum
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetCIDNum.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  ISetCIDNum {
public static final String MODELNAME = "SetCIDNum";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CNUM="cnum" ;
// 	public static final String VALUEID_A="a" ;
	//test
	//---------  getter und setter
	/**
	* getcnum 
	* 
	* @behavior.fieldname cnum 
	**/
	public String getCnum();
	
	/**
	*setcnum 
	* 
	* @behavior.fieldname cnum 
	*/
	public void setCnum(String acnum);
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