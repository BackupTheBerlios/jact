

package com.useit.jact.model.featureconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IFeaturemap<br>
 * additinal
 * </p>
 * Created : Fri May 26 14:30:31 CEST 2006
 * 
 * @behavior.elementname Featuremap
 * @author urs
 * @version $Revision: 1.1 $, $Id: IFeaturemap.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IFeaturemap {
public static final String MODELNAME = "Featuremap";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_BLINDXFER="blindxfer" ;
// 	public static final String VALUEID_DISCONNECT="disconnect" ;
// 	public static final String VALUEID_AUTOMON="automon" ;
// 	public static final String VALUEID_ATXFER="atxfer" ;
	
	//---------  getter und setter

	/**
	* getblindxfer 
	* Blind transfer
	* @behavior.fieldname blindxfer 
	**/
	public String getBlindxfer();
	
	/**
	*setblindxfer 
	* Blind transfer
	* @behavior.fieldname blindxfer 
	*/
	public void setBlindxfer(String ablindxfer);


	/**
	* getdisconnect 
	* Disconnect
	* @behavior.fieldname disconnect 
	**/
	public String getDisconnect();
	
	/**
	*setdisconnect 
	* Disconnect
	* @behavior.fieldname disconnect 
	*/
	public void setDisconnect(String adisconnect);


	/**
	* getautomon 
	* One Touch Record
	* @behavior.fieldname automon 
	**/
	public String getAutomon();
	
	/**
	*setautomon 
	* One Touch Record
	* @behavior.fieldname automon 
	*/
	public void setAutomon(String aautomon);


	/**
	* getatxfer 
	* Attended transfer
	* @behavior.fieldname atxfer 
	**/
	public String getAtxfer();
	
	/**
	*setatxfer 
	* Attended transfer
	* @behavior.fieldname atxfer 
	*/
	public void setAtxfer(String aatxfer);


}