

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISayAlpha<br>
 * Spells the passed string
 * </p>
 * Created : Wed Jul 05 18:56:20 CEST 2006
 * 
 * @behavior.elementname SayAlpha
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISayAlpha.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISayAlpha {
public static final String MODELNAME = "SayAlpha";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_STRING="string" ;
	//test
	//---------  getter und setter
	/**
	* getstring 
	* 
	* @behavior.fieldname string 
	**/
	public String getString();
	
	/**
	*setstring 
	* 
	* @behavior.fieldname string 
	*/
	public void setString(String astring);

}