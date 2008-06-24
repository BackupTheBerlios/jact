

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetRDNIS<br>
 * Set RDNIS Number on a call to a new value. Always returns 0
 * </p>
 * Created : Wed Jul 05 18:54:54 CEST 2006
 * 
 * @behavior.elementname SetRDNIS
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetRDNIS.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISetRDNIS {
public static final String MODELNAME = "SetRDNIS";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CNUM="cnum" ;
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

}