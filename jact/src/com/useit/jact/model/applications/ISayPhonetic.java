

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISayPhonetic<br>
 * Spells the passed string with phonetic alphabet
 * </p>
 * Created : Wed Jul 05 18:56:08 CEST 2006
 * 
 * @behavior.elementname SayPhonetic
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISayPhonetic.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISayPhonetic {
public static final String MODELNAME = "SayPhonetic";	
 
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