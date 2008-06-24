

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISayNumber<br>
 * Says the passed number. SayNumber is using the current language setting for the channel. (See app SetLanguage).
 * </p>
 * Created : Wed Jul 05 18:54:47 CEST 2006
 * 
 * @behavior.elementname SayNumber
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISayNumber.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISayNumber {
public static final String MODELNAME = "SayNumber";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DIGITS="digits" ;
// 	public static final String VALUEID_GENDER="gender" ;
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
	/**
	* getgender 
	* 
	* @behavior.fieldname gender 
	**/
	public String getGender();
	
	/**
	*setgender 
	* 
	* @behavior.fieldname gender 
	*/
	public void setGender(String agender);

}