

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZapBarge<br>
 * Barges in on a specified zap channel or prompts if one is not specified. Returns -1 when caller user hangs up and is independent of the state of the channel being monitored.
 * </p>
 * Created : Wed Jul 05 18:55:10 CEST 2006
 * 
 * @behavior.elementname ZapBarge
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapBarge.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IZapBarge {
public static final String MODELNAME = "ZapBarge";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CHANNEL="channel" ;
	//test
	//---------  getter und setter
	/**
	* getchannel 
	* 
	* @behavior.fieldname channel 
	**/
	public String getChannel();
	
	/**
	*setchannel 
	* 
	* @behavior.fieldname channel 
	*/
	public void setChannel(String achannel);

}