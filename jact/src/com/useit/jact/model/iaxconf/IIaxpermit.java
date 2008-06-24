

package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IIaxpermit<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:28 CEST 2006
 * 
 * @behavior.elementname Iaxpermit
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIaxpermit.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  interface  IIaxpermit {
public static final String MODELNAME = "Iaxpermit";	
 
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