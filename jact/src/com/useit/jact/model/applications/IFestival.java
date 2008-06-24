

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IFestival<br>
 * Connect to Festival, send the argument, get back the waveform,play it to the user, allowing any given interrupt keys to immediately terminate and return the value, or 'any' to allow any number back (useful in dialplan)
 * </p>
 * Created : Wed Jul 05 18:55:24 CEST 2006
 * 
 * @behavior.elementname Festival
 * @author urs
 * @version $Revision: 1.1 $, $Id: IFestival.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IFestival {
public static final String MODELNAME = "Festival";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TEXT="text" ;
// 	public static final String VALUEID_INTKEYS="intkeys" ;
	//test
	//---------  getter und setter
	/**
	* gettext 
	* 
	* @behavior.fieldname text 
	**/
	public String getText();
	
	/**
	*settext 
	* 
	* @behavior.fieldname text 
	*/
	public void setText(String atext);
	/**
	* getintkeys 
	* 
	* @behavior.fieldname intkeys 
	**/
	public String getIntkeys();
	
	/**
	*setintkeys 
	* 
	* @behavior.fieldname intkeys 
	*/
	public void setIntkeys(String aintkeys);

}