

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IIncludeconfigs<br>
 * 
 * </p>
 * Created : Wed May 31 09:04:13 CEST 2006
 * 
 * @behavior.elementname Includeconfigs
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIncludeconfigs.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IIncludeconfigs {
public static final String MODELNAME = "Includeconfigs";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONFIGNAME="configname" ;
	
	//---------  getter und setter
	
	/**
	* getconfigname 
	* 
	* @behavior.fieldname configname 
	**/
	public String getConfigname();
	
	/**
	*setconfigname 
	* 
	* @behavior.fieldname configname 
	*/
	public void setConfigname(String aconfigname);


}