

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IIAX2Provision<br>
 * Provisions the calling IAXy (assuming the calling entity is in fact an IAXy) with the given template or default if one is not specified. Returns -1 on error or 0 on success.
 * </p>
 * Created : Wed Jul 05 18:53:40 CEST 2006
 * 
 * @behavior.elementname IAX2Provision
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIAX2Provision.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IIAX2Provision {
public static final String MODELNAME = "IAX2Provision";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TEMPLATE="template" ;
	//test
	//---------  getter und setter
	/**
	* gettemplate 
	* 
	* @behavior.fieldname template 
	**/
	public String getTemplate();
	
	/**
	*settemplate 
	* 
	* @behavior.fieldname template 
	*/
	public void setTemplate(String atemplate);

}