

package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZapteldynamicspan<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Zapteldynamicspan
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapteldynamicspan.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZapteldynamicspan {
public static final String MODELNAME = "Zapteldynamicspan";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DRIVER="driver" ;
// 	public static final String VALUEID_ADDRESS="address" ;
// 	public static final String VALUEID_NUMCHANS="numchans" ;
// 	public static final String VALUEID_TIMING="timing" ;
	
	//---------  getter und setter

	/**
	* getdriver 
	* Where <driver> is the name of the driver (e.g. eth)
	* @behavior.fieldname driver 
	**/
	public String getDriver();
	
	/**
	*setdriver 
	* Where <driver> is the name of the driver (e.g. eth)
	* @behavior.fieldname driver 
	*/
	public void setDriver(String adriver);


	/**
	* getaddress 
	* <address> is the  driver specific address (like a MAC for eth)
	* @behavior.fieldname address 
	**/
	public String getAddress();
	
	/**
	*setaddress 
	* <address> is the  driver specific address (like a MAC for eth)
	* @behavior.fieldname address 
	*/
	public void setAddress(String aaddress);


	/**
	* getnumchans 
	* <numchans> is the number of channels
	* @behavior.fieldname numchans 
	**/
	public Integer getNumchans();
	
	/**
	*setnumchans 
	* <numchans> is the number of channels
	* @behavior.fieldname numchans 
	*/
	public void setNumchans(Integer anumchans);


	/**
	* gettiming 
	* <timing> is a timing priority, like for a normal span
	* @behavior.fieldname timing 
	**/
	public Integer getTiming();
	
	/**
	*settiming 
	* <timing> is a timing priority, like for a normal span
	* @behavior.fieldname timing 
	*/
	public void setTiming(Integer atiming);


}