

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISIPDtmfMode<br>
 * Changes the dtmfmode for a SIP call
 * </p>
 * Created : Wed Jul 05 18:56:03 CEST 2006
 * 
 * @behavior.elementname SIPDtmfMode
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISIPDtmfMode.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISIPDtmfMode {
public static final String MODELNAME = "SIPDtmfMode";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_INBAND="inband" ;
// 	public static final String VALUEID_INFO="info" ;
// 	public static final String VALUEID_RFC2833="rfc2833" ;
	//test
	//---------  getter und setter
	/**
	* getinband 
	* 
	* @behavior.fieldname inband 
	**/
	public String getInband();
	
	/**
	*setinband 
	* 
	* @behavior.fieldname inband 
	*/
	public void setInband(String ainband);
	/**
	* getinfo 
	* 
	* @behavior.fieldname info 
	**/
	public String getInfo();
	
	/**
	*setinfo 
	* 
	* @behavior.fieldname info 
	*/
	public void setInfo(String ainfo);
	/**
	* getrfc2833 
	* 
	* @behavior.fieldname rfc2833 
	**/
	public String getRfc2833();
	
	/**
	*setrfc2833 
	* 
	* @behavior.fieldname rfc2833 
	*/
	public void setRfc2833(String arfc2833);

}