

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISIPGetHeader<br>
 * Sets a channel variable to the content of a SIP header Skips to priority+101 if header does not exist Otherwise returns 0
 * </p>
 * Created : Wed Jul 05 18:54:05 CEST 2006
 * 
 * @behavior.elementname SIPGetHeader
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISIPGetHeader.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISIPGetHeader {
public static final String MODELNAME = "SIPGetHeader";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VAR="var" ;
// 	public static final String VALUEID_HEADERNAME="headername" ;
	//test
	//---------  getter und setter
	/**
	* getvar 
	* 
	* @behavior.fieldname var 
	**/
	public String getVar();
	
	/**
	*setvar 
	* 
	* @behavior.fieldname var 
	*/
	public void setVar(String avar);
	/**
	* getheadername 
	* 
	* @behavior.fieldname headername 
	**/
	public String getHeadername();
	
	/**
	*setheadername 
	* 
	* @behavior.fieldname headername 
	*/
	public void setHeadername(String aheadername);

}