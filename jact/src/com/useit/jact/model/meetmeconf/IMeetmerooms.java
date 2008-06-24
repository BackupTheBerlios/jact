

package com.useit.jact.model.meetmeconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMeetmerooms<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:36 CEST 2006
 * 
 * @behavior.elementname Meetmerooms
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMeetmerooms.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  interface  IMeetmerooms {
public static final String MODELNAME = "Meetmerooms";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONFNO="confno" ;
// 	public static final String VALUEID_PINCODE="pincode" ;
// 	public static final String VALUEID_ADMINPIN="adminpin" ;
	
	//---------  getter und setter

	/**
	* getconfno 
	* 
	* @behavior.fieldname confno 
	**/
	public String getConfno();
	
	/**
	*setconfno 
	* 
	* @behavior.fieldname confno 
	*/
	public void setConfno(String aconfno);


	/**
	* getpincode 
	* 
	* @behavior.fieldname pincode 
	**/
	public String getPincode();
	
	/**
	*setpincode 
	* 
	* @behavior.fieldname pincode 
	*/
	public void setPincode(String apincode);


	/**
	* getadminpin 
	* 
	* @behavior.fieldname adminpin 
	**/
	public String getAdminpin();
	
	/**
	*setadminpin 
	* 
	* @behavior.fieldname adminpin 
	*/
	public void setAdminpin(String aadminpin);


}