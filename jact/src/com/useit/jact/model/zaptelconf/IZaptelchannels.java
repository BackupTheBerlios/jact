

package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZaptelchannels<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Zaptelchannels
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZaptelchannels.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZaptelchannels {
public static final String MODELNAME = "Zaptelchannels";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DEVICE="device" ;
// 	public static final String VALUEID_CHANNELLIST="channellist" ;
	
	//---------  getter und setter

	/**
	* getdevice 
	* 
	* @behavior.fieldname device 
	**/
	public String getDevice();
	
	/**
	*setdevice 
	* 
	* @behavior.fieldname device 
	*/
	public void setDevice(String adevice);


	/**
	* getchannellist 
	* 
	* @behavior.fieldname channellist 
	**/
	public String getChannellist();
	
	/**
	*setchannellist 
	* 
	* @behavior.fieldname channellist 
	*/
	public void setChannellist(String achannellist);


}