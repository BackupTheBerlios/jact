

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISIPAddHeader<br>
 * Adds a header to a SIP call placed with DIAL. Remember to user the X-header if you are adding non-standard SIP headers, like "X-Asterisk-Accuntcode:". Use this with care. Adding the wrong headers may jeopardize the SIP dialog. Always returns 0
 * </p>
 * Created : Wed Jul 05 18:55:56 CEST 2006
 * 
 * @behavior.elementname SIPAddHeader
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISIPAddHeader.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  ISIPAddHeader {
public static final String MODELNAME = "SIPAddHeader";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_HEADER="header" ;
// 	public static final String VALUEID_CONTENT="content" ;
	//test
	//---------  getter und setter
	/**
	* getheader 
	* 
	* @behavior.fieldname header 
	**/
	public String getHeader();
	
	/**
	*setheader 
	* 
	* @behavior.fieldname header 
	*/
	public void setHeader(String aheader);
	/**
	* getcontent 
	* 
	* @behavior.fieldname content 
	**/
	public String getContent();
	
	/**
	*setcontent 
	* 
	* @behavior.fieldname content 
	*/
	public void setContent(String acontent);

}