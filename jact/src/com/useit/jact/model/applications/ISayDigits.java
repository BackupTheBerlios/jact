

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISayDigits<br>
 * Says the passed digits. SayDigits is using the current language setting for the channel. (See app setLanguage)
 * </p>
 * Created : Wed Jul 05 18:55:37 CEST 2006
 * 
 * @behavior.elementname SayDigits
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISayDigits.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISayDigits {
public static final String MODELNAME = "SayDigits";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DIGITS="digits" ;
	//test
	//---------  getter und setter
	/**
	* getdigits 
	* 
	* @behavior.fieldname digits 
	**/
	public String getDigits();
	
	/**
	*setdigits 
	* 
	* @behavior.fieldname digits 
	*/
	public void setDigits(String adigits);

}