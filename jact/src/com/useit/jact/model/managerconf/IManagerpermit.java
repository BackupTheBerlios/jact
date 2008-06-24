

package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IManagerpermit<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:35 CEST 2006
 * 
 * @behavior.elementname Managerpermit
 * @author urs
 * @version $Revision: 1.1 $, $Id: IManagerpermit.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IManagerpermit {
public static final String MODELNAME = "Managerpermit";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VALUE="value" ;
	
	//---------  getter und setter

	/**
	* getvalue 
	* 
	* @behavior.fieldname value 
	**/
	public String getValue();
	
	/**
	*setvalue 
	* 
	* @behavior.fieldname value 
	*/
	public void setValue(String avalue);


}