

package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZonemessages<br>
 * the zonemessages section allows the adminstrator to define custom time zones, and to change the way time is announced in a particular time zone. Users may have different time zone settings, and also different formats for announcing the date and time of voicemail messages. When a time zone is defined here, you may use it in individual malboxes by specifying a tz= option on the individual mailbox entry (Mailbox entries are discussed in the next section on contexts). 
 * </p>
 * Created : Fri May 26 14:30:31 CEST 2006
 * 
 * @behavior.elementname Zonemessages
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZonemessages.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  interface  IZonemessages {
public static final String MODELNAME = "Zonemessages";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TIMEZONENAME="timezonename" ;
// 	public static final String VALUEID_COUNTRY="country" ;
// 	public static final String VALUEID_CITY="city" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	
	//---------  getter und setter

	/**
	* gettimezonename 
	* The Timezonename field is a name you pick for your custom time zone
	* @behavior.fieldname timezonename 
	**/
	public String getTimezonename();
	
	/**
	*settimezonename 
	* The Timezonename field is a name you pick for your custom time zone
	* @behavior.fieldname timezonename 
	*/
	public void setTimezonename(String atimezonename);


	/**
	* getcountry 
	* The Country field contains the name of the country where the time zone is located
	* @behavior.fieldname country 
	**/
	public String getCountry();
	
	/**
	*setcountry 
	* The Country field contains the name of the country where the time zone is located
	* @behavior.fieldname country 
	*/
	public void setCountry(String acountry);


	/**
	* getcity 
	* The City field contains the name of the city within the country,
	* @behavior.fieldname city 
	**/
	public String getCity();
	
	/**
	*setcity 
	* The City field contains the name of the city within the country,
	* @behavior.fieldname city 
	*/
	public void setCity(String acity);


	/**
	* getoptions 
	*  the Options field contains a set of options you choose to customize the time announcement format.
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	*  the Options field contains a set of options you choose to customize the time announcement format.
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);


}