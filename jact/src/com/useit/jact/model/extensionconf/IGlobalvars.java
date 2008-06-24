

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IGlobalvars<br>
 * The "Globals" category contains global variables that can be referenced in the dialplan with ${VARIABLE} or ${ENV(VARIABLE)} for Environmental variable ${${VARIABLE}} or ${text${VARIABLE}} or any hybrid
 * </p>
 * Created : Wed May 31 09:04:13 CEST 2006
 * 
 * @behavior.elementname Globalvars
 * @author urs
 * @version $Revision: 1.1 $, $Id: IGlobalvars.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IGlobalvars {
public static final String MODELNAME = "Globalvars";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_NAME="name" ;
// 	public static final String VALUEID_VALUE="value" ;
	
	//---------  getter und setter
	
	/**
	* getname 
	* name
	* @behavior.fieldname name 
	**/
	public String getName();
	
	/**
	*setname 
	* name
	* @behavior.fieldname name 
	*/
	public void setName(String aname);


	/**
	* getvalue 
	* value
	* @behavior.fieldname value 
	**/
	public String getValue();
	
	/**
	*setvalue 
	* value
	* @behavior.fieldname value 
	*/
	public void setValue(String avalue);


}