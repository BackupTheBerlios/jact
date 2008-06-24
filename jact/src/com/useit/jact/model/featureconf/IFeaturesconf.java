

package com.useit.jact.model.featureconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * IFeaturesconf<br>
 * By default extension 700 is used to park a call. While in a conversation, press # to initiate a transfer, then dial 700. Asterisk will now announce the parking extension, most probably 701 or 702. Now hang up - the caller will be left on hold at the announced extention. Walk up to a different phone, dial 701 and voil? - the conversation can be continued. If a caller has been parked for a longer time than the specified time limit then Asterisk will again ring the originally dialed extension.
 * </p>
 * Created : Fri May 26 14:30:31 CEST 2006
 * 
 * @behavior.elementname Featuresconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IFeaturesconf.java,v 1.1 2008/06/24 20:45:12 urszeidler Exp $
 */
 public  interface  IFeaturesconf {
public static final String MODELNAME = "Featuresconf";	
 
// ------   1-1 aggregates
/**
 * @return Featuremap the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Featuremap 
 */
public IFeaturemap getFeaturemap();

/**
 * setzt den Featuremap und die Featuremapid	
 * @param Featuremap
 */
public void setFeaturemap(IFeaturemap aFeaturemap);
// 	public static final String VALUEID_PARKEXT="parkext" ;
// 	public static final String VALUEID_PARKPOS="parkpos" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_PARKINGTIME="parkingtime" ;
// 	public static final String VALUEID_TRANSFERDIGITTIMEOUT="transferdigittimeout" ;
// 	public static final String VALUEID_COURTESYTONE="courtesytone" ;
// 	public static final String VALUEID_XFERSOUND="xfersound" ;
// 	public static final String VALUEID_XFERFAILSOUND="xferfailsound" ;
// 	public static final String VALUEID_ADSIPARK="adsipark" ;
// 	public static final String VALUEID_PICKUPEXTEN="pickupexten" ;
// 	public static final String VALUEID_FEATUREDIGITTIMEOUT="featuredigittimeout" ;
	
	//---------  getter und setter

	/**
	* getparkext 
	* What ext. to dial to park
	* @behavior.fieldname parkext 
	**/
	public String getParkext();
	
	/**
	*setparkext 
	* What ext. to dial to park
	* @behavior.fieldname parkext 
	*/
	public void setParkext(String aparkext);


	/**
	* getparkpos 
	* What extensions to park calls on
	* @behavior.fieldname parkpos 
	**/
	public String getParkpos();
	
	/**
	*setparkpos 
	* What extensions to park calls on
	* @behavior.fieldname parkpos 
	*/
	public void setParkpos(String aparkpos);


	/**
	* getcontext 
	* Which context parked calls are in
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* Which context parked calls are in
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* getparkingtime 
	* Number of seconds a call can be parked for (default is 45 seconds)
	* @behavior.fieldname parkingtime 
	**/
	public Integer getParkingtime();
	
	/**
	*setparkingtime 
	* Number of seconds a call can be parked for (default is 45 seconds)
	* @behavior.fieldname parkingtime 
	*/
	public void setParkingtime(Integer aparkingtime);


	/**
	* gettransferdigittimeout 
	* Number of seconds to wait between digits when transfering a call
	* @behavior.fieldname transferdigittimeout 
	**/
	public Integer getTransferdigittimeout();
	
	/**
	*settransferdigittimeout 
	* Number of seconds to wait between digits when transfering a call
	* @behavior.fieldname transferdigittimeout 
	*/
	public void setTransferdigittimeout(Integer atransferdigittimeout);


	/**
	* getcourtesytone 
	* Sound file to play to the parked caller
	* @behavior.fieldname courtesytone 
	**/
	public String getCourtesytone();
	
	/**
	*setcourtesytone 
	* Sound file to play to the parked caller
	* @behavior.fieldname courtesytone 
	*/
	public void setCourtesytone(String acourtesytone);


	/**
	* getxfersound 
	* to indicate an attended transfer is complete
	* @behavior.fieldname xfersound 
	**/
	public String getXfersound();
	
	/**
	*setxfersound 
	* to indicate an attended transfer is complete
	* @behavior.fieldname xfersound 
	*/
	public void setXfersound(String axfersound);


	/**
	* getxferfailsound 
	* to indicate a failed transfer
	* @behavior.fieldname xferfailsound 
	**/
	public String getXferfailsound();
	
	/**
	*setxferfailsound 
	* to indicate a failed transfer
	* @behavior.fieldname xferfailsound 
	*/
	public void setXferfailsound(String axferfailsound);


	/**
	* getadsipark 
	* if you want ADSI parking announcements
	* @behavior.fieldname adsipark 
	**/
	public Boolean getAdsipark();
	
	/**
	*setadsipark 
	* if you want ADSI parking announcements
	* @behavior.fieldname adsipark 
	*/
	public void setAdsipark(Boolean aadsipark);


	/**
	* getpickupexten 
	* Configure the pickup extension.  Default is *8
	* @behavior.fieldname pickupexten 
	**/
	public String getPickupexten();
	
	/**
	*setpickupexten 
	* Configure the pickup extension.  Default is *8
	* @behavior.fieldname pickupexten 
	*/
	public void setPickupexten(String apickupexten);


	/**
	* getfeaturedigittimeout 
	* Max time (ms) between digits for feature activation.  Default is 500
	* @behavior.fieldname featuredigittimeout 
	**/
	public Integer getFeaturedigittimeout();
	
	/**
	*setfeaturedigittimeout 
	* Max time (ms) between digits for feature activation.  Default is 500
	* @behavior.fieldname featuredigittimeout 
	*/
	public void setFeaturedigittimeout(Integer afeaturedigittimeout);


}