

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetGlobalVar<br>
 * Sets global variable n to value. Global variable are available across channels.
 * </p>
 * Created : Wed Jul 05 18:54:21 CEST 2006
 * 
 * @behavior.elementname SetGlobalVar
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetGlobalVar.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISetGlobalVar {
public static final String MODELNAME = "SetGlobalVar";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_N="n" ;
// 	public static final String VALUEID_VALUE="value" ;
	//test
	//---------  getter und setter
	/**
	* getn 
	* 
	* @behavior.fieldname n 
	**/
	public String getN();
	
	/**
	*setn 
	* 
	* @behavior.fieldname n 
	*/
	public void setN(String an);
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