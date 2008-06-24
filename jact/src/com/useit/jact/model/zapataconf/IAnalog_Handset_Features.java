

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAnalog_Handset_Features<br>
 * headset
 * </p>
 * Created : Fri May 26 14:30:38 CEST 2006
 * 
 * @behavior.elementname Analog_Handset_Features
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAnalog_Handset_Features.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IAnalog_Handset_Features {
public static final String MODELNAME = "Analog_Handset_Features";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ADSI="adsi" ;
// 	public static final String VALUEID_IMMEDIATE="immediate" ;
// 	public static final String VALUEID_CALLWAITING="callwaiting" ;
// 	public static final String VALUEID_CALLWAITINGCALLERID="callwaitingcallerid" ;
// 	public static final String VALUEID_THREEWAYCALLING="threewaycalling" ;
// 	public static final String VALUEID_TRANSFER="transfer" ;
// 	public static final String VALUEID_CANCALLFORWARD="cancallforward" ;
// 	public static final String VALUEID_CALLRETURN="callreturn" ;
// 	public static final String VALUEID_CALLGROUP="callgroup" ;
// 	public static final String VALUEID_PICKUPGROUP="pickupgroup" ;
// 	public static final String VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER="useincomingcalleridonzaptransfer" ;
	
	//---------  getter und setter

	/**
	* getadsi 
	* If your handset has ADSI (Analog Display Services Interface) capability, set set adsi=yes. The ADSI specification is system similar to Caller ID to pass encoded information to an analog handset. It allows the creation of interactive visual menus on a multiline display, offering access to services such as voicemail through a text interface.
	* @behavior.fieldname adsi 
	**/
	public String getAdsi();
	
	/**
	*setadsi 
	* If your handset has ADSI (Analog Display Services Interface) capability, set set adsi=yes. The ADSI specification is system similar to Caller ID to pass encoded information to an analog handset. It allows the creation of interactive visual menus on a multiline display, offering access to services such as voicemail through a text interface.
	* @behavior.fieldname adsi 
	*/
	public void setAdsi(String aadsi);


	/**
	* getimmediate 
	* Normally (i.e. with immediate set to 'no', the default), when you lift an FXS handset, the Zaptel driver provides you a dialtone and listens for digits that you dial, passing them on to Asterisk. Asterisk waits until the number you've dialed matches an extension, and then begins executing the first command on the matching extension. If you set immediate=yes, then Asterisk will instruct the Zaptel driver to not generate a dialtone when you lift a handset, instead passing control immediately to Asterisk. Asterisk will start executing the commands for this channel's "s" extension. This is sometimes referred to as "batphone mode". Default no.    immediate=yes
	* @behavior.fieldname immediate 
	**/
	public Boolean getImmediate();
	
	/**
	*setimmediate 
	* Normally (i.e. with immediate set to 'no', the default), when you lift an FXS handset, the Zaptel driver provides you a dialtone and listens for digits that you dial, passing them on to Asterisk. Asterisk waits until the number you've dialed matches an extension, and then begins executing the first command on the matching extension. If you set immediate=yes, then Asterisk will instruct the Zaptel driver to not generate a dialtone when you lift a handset, instead passing control immediately to Asterisk. Asterisk will start executing the commands for this channel's "s" extension. This is sometimes referred to as "batphone mode". Default no.    immediate=yes
	* @behavior.fieldname immediate 
	*/
	public void setImmediate(Boolean aimmediate);


	/**
	* getcallwaiting 
	* If enabled, Asterisk will generate "call waiting pips" when you are already in a conversation on your FXS handset when someone tries to call you. If the channel has call waiting by default, you can temporarily disable it by lifting the handset and dialing *70, whereupon you will get a dialrecall tone and may then dial the intended number. There is no corresponding way to temporarily enable call waiting for channels that have it off by default. Default no.    callwaiting=yes
	* @behavior.fieldname callwaiting 
	**/
	public Boolean getCallwaiting();
	
	/**
	*setcallwaiting 
	* If enabled, Asterisk will generate "call waiting pips" when you are already in a conversation on your FXS handset when someone tries to call you. If the channel has call waiting by default, you can temporarily disable it by lifting the handset and dialing *70, whereupon you will get a dialrecall tone and may then dial the intended number. There is no corresponding way to temporarily enable call waiting for channels that have it off by default. Default no.    callwaiting=yes
	* @behavior.fieldname callwaiting 
	*/
	public void setCallwaiting(Boolean acallwaiting);


	/**
	* getcallwaitingcallerid 
	* Sets whether Asterisk will send Caller ID data to the handset during call waiting indication. Requires also setting callwaiting=yes. Default no.    callwaitingcallerid=yes
	* @behavior.fieldname callwaitingcallerid 
	**/
	public Boolean getCallwaitingcallerid();
	
	/**
	*setcallwaitingcallerid 
	* Sets whether Asterisk will send Caller ID data to the handset during call waiting indication. Requires also setting callwaiting=yes. Default no.    callwaitingcallerid=yes
	* @behavior.fieldname callwaitingcallerid 
	*/
	public void setCallwaitingcallerid(Boolean acallwaitingcallerid);


	/**
	* getthreewaycalling 
	* If enabled, you can place a call on hold by pressing a hook flash, whereupon you get a dialrecall tone and can make another call. Default no.    threewaycalling=yes
	* @behavior.fieldname threewaycalling 
	**/
	public Boolean getThreewaycalling();
	
	/**
	*setthreewaycalling 
	* If enabled, you can place a call on hold by pressing a hook flash, whereupon you get a dialrecall tone and can make another call. Default no.    threewaycalling=yes
	* @behavior.fieldname threewaycalling 
	*/
	public void setThreewaycalling(Boolean athreewaycalling);


	/**
	* gettransfer 
	* This option has effect only when threewaycalling=yes. If threewaycalling=yes and transfer=yes, then once you've placed a call on hold with a hook flash, you can transfer that call to another extension by dialing the extension and hanging up. Default no.    transfer=yes
	* @behavior.fieldname transfer 
	**/
	public Boolean getTransfer();
	
	/**
	*settransfer 
	* This option has effect only when threewaycalling=yes. If threewaycalling=yes and transfer=yes, then once you've placed a call on hold with a hook flash, you can transfer that call to another extension by dialing the extension and hanging up. Default no.    transfer=yes
	* @behavior.fieldname transfer 
	*/
	public void setTransfer(Boolean atransfer);


	/**
	* getcancallforward 
	* If enabled, you may activate "call forwarding immediate" by dialing *72 (whereupon you get a dialrecall tone) followed by the extension number you wish to forward your calls to. If someone dials your extension, the call will be redirected to the forwarding number. You may disable the call forwarding by dialing *73. Default no.    cancallforward=yes
	* @behavior.fieldname cancallforward 
	**/
	public Boolean getCancallforward();
	
	/**
	*setcancallforward 
	* If enabled, you may activate "call forwarding immediate" by dialing *72 (whereupon you get a dialrecall tone) followed by the extension number you wish to forward your calls to. If someone dials your extension, the call will be redirected to the forwarding number. You may disable the call forwarding by dialing *73. Default no.    cancallforward=yes
	* @behavior.fieldname cancallforward 
	*/
	public void setCancallforward(Boolean acancallforward);


	/**
	* getcallreturn 
	* If enabled, you may dial *69 to have Asterisk read to you the caller ID of the last person to call. You will hear the dialrecall tone if there is no record of a last caller. Default no.    callreturn=yes
	* @behavior.fieldname callreturn 
	**/
	public Boolean getCallreturn();
	
	/**
	*setcallreturn 
	* If enabled, you may dial *69 to have Asterisk read to you the caller ID of the last person to call. You will hear the dialrecall tone if there is no record of a last caller. Default no.    callreturn=yes
	* @behavior.fieldname callreturn 
	*/
	public void setCallreturn(Boolean acallreturn);


	/**
	* getcallgroup 
	* A channel may belong to zero or more callgroups. Callgroups specify who may answer this phone when it is ringing. If this channel is ringing, then any other channel whose pickupgroups include one of this channel's callgroups may answer the call by dialing *8#. This feature is supported by Zap, SIP, Skinny and MGCP channels. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.   group=1   callgroup=1,2,3
	* @behavior.fieldname callgroup 
	**/
	public String getCallgroup();
	
	/**
	*setcallgroup 
	* A channel may belong to zero or more callgroups. Callgroups specify who may answer this phone when it is ringing. If this channel is ringing, then any other channel whose pickupgroups include one of this channel's callgroups may answer the call by dialing *8#. This feature is supported by Zap, SIP, Skinny and MGCP channels. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.   group=1   callgroup=1,2,3
	* @behavior.fieldname callgroup 
	*/
	public void setCallgroup(String acallgroup);


	/**
	* getpickupgroup 
	* A channel may belong to zero or more pickupgroups. Pickupgroups specify whose phones you may answer. If another channel is ringing, and this channel's pickupgroups include one of the ringing channel's callgroups, then this channel may answer the call by dialing *8#. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.
	* @behavior.fieldname pickupgroup 
	**/
	public String getPickupgroup();
	
	/**
	*setpickupgroup 
	* A channel may belong to zero or more pickupgroups. Pickupgroups specify whose phones you may answer. If another channel is ringing, and this channel's pickupgroups include one of the ringing channel's callgroups, then this channel may answer the call by dialing *8#. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.
	* @behavior.fieldname pickupgroup 
	*/
	public void setPickupgroup(String apickupgroup);


	/**
	* getuseincomingcalleridonzaptransfer 
	* If you set this option (Use Incoming Caller ID On Zap Transfer) to 'yes', then when you transfer a call to another phone, the original caller's Caller ID will get forwarded on too. Default no.    useincomingcalleridonzaptransfer=yes
	* @behavior.fieldname useincomingcalleridonzaptransfer 
	**/
	public String getUseincomingcalleridonzaptransfer();
	
	/**
	*setuseincomingcalleridonzaptransfer 
	* If you set this option (Use Incoming Caller ID On Zap Transfer) to 'yes', then when you transfer a call to another phone, the original caller's Caller ID will get forwarded on too. Default no.    useincomingcalleridonzaptransfer=yes
	* @behavior.fieldname useincomingcalleridonzaptransfer 
	*/
	public void setUseincomingcalleridonzaptransfer(String auseincomingcalleridonzaptransfer);


}