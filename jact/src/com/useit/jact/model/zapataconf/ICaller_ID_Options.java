

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ICaller_ID_Options<br>
 * caller id
 * </p>
 * Created : Fri May 26 14:30:41 CEST 2006
 * 
 * @behavior.elementname Caller_ID_Options
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICaller_ID_Options.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  ICaller_ID_Options {
public static final String MODELNAME = "Caller_ID_Options";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CALLERID="callerid" ;
// 	public static final String VALUEID_USECALLERID="usecallerid" ;
// 	public static final String VALUEID_HIDECALLERID="hidecallerid" ;
// 	public static final String VALUEID_RESTRICTCID="restrictcid" ;
// 	public static final String VALUEID_USECALLINGPRES="usecallingpres" ;
	
	//---------  getter und setter

	/**
	* getcallerid 
	* Sets the Caller ID string to forward to the recipient when calls come in from this channel. You normally use this to set the Caller ID for handsets. Specify the Caller ID name in double quotation marks, followed by the Caller ID number in <> symbols. For trunk lines, set to "asreceived" to pass the received Caller ID forward.   callerid="Mark Spencer" <256 428-6000>   callerid=   callerid=asreceived Important Note: :Caller ID can only be transmitted to the public phone network with supported hardware, such as a PRI. It is not possible to set external caller ID on analog lines.
	* @behavior.fieldname callerid 
	**/
	public String getCallerid();
	
	/**
	*setcallerid 
	* Sets the Caller ID string to forward to the recipient when calls come in from this channel. You normally use this to set the Caller ID for handsets. Specify the Caller ID name in double quotation marks, followed by the Caller ID number in <> symbols. For trunk lines, set to "asreceived" to pass the received Caller ID forward.   callerid="Mark Spencer" <256 428-6000>   callerid=   callerid=asreceived Important Note: :Caller ID can only be transmitted to the public phone network with supported hardware, such as a PRI. It is not possible to set external caller ID on analog lines.
	* @behavior.fieldname callerid 
	*/
	public void setCallerid(String acallerid);


	/**
	* getusecallerid 
	* For handsets, this option will cause Asterisk to send Caller ID data to the handset when ringing it. For trunk lines, this option causes Asterisk to look for Caller ID on incoming calls. Default:yes.    usecallerid=no
	* @behavior.fieldname usecallerid 
	**/
	public Boolean getUsecallerid();
	
	/**
	*setusecallerid 
	* For handsets, this option will cause Asterisk to send Caller ID data to the handset when ringing it. For trunk lines, this option causes Asterisk to look for Caller ID on incoming calls. Default:yes.    usecallerid=no
	* @behavior.fieldname usecallerid 
	*/
	public void setUsecallerid(Boolean ausecallerid);


	/**
	* gethidecallerid 
	* (Not for FXO trunk lines) For PRI channels, this will stop the sending of Caller ID on outgoing calls. For FXS handsets, this will stop Asterisk from sending this channel's Caller ID information to the called party when you make a call using this handset. FXS handset users may enable or disable sending of their Caller ID for the current call only by lifting the handset and dialing *82 (enable) or *67 (disable); you will then get a "dialrecall" tone whereupon you can dial the number of the extension you wish to contact. Default:no.    hidecallerid=yes
	* @behavior.fieldname hidecallerid 
	**/
	public Boolean getHidecallerid();
	
	/**
	*sethidecallerid 
	* (Not for FXO trunk lines) For PRI channels, this will stop the sending of Caller ID on outgoing calls. For FXS handsets, this will stop Asterisk from sending this channel's Caller ID information to the called party when you make a call using this handset. FXS handset users may enable or disable sending of their Caller ID for the current call only by lifting the handset and dialing *82 (enable) or *67 (disable); you will then get a "dialrecall" tone whereupon you can dial the number of the extension you wish to contact. Default:no.    hidecallerid=yes
	* @behavior.fieldname hidecallerid 
	*/
	public void setHidecallerid(Boolean ahidecallerid);


	/**
	* getrestrictcid 
	* (PRI channels only) This option has effect only when hidecallerid=no. If hidecallerid=no and restrictcid=yes, Asterisk will prevent the sending of the Caller ID data as a presentation number when making outgoing calls (ANI data is still sent). Default:no.    restrictcid=yes
	* @behavior.fieldname restrictcid 
	**/
	public Boolean getRestrictcid();
	
	/**
	*setrestrictcid 
	* (PRI channels only) This option has effect only when hidecallerid=no. If hidecallerid=no and restrictcid=yes, Asterisk will prevent the sending of the Caller ID data as a presentation number when making outgoing calls (ANI data is still sent). Default:no.    restrictcid=yes
	* @behavior.fieldname restrictcid 
	*/
	public void setRestrictcid(Boolean arestrictcid);


	/**
	* getusecallingpres 
	* (PRI channels only) Whether or not to use the Caller ID presentation for the outgoing call that the calling switch is sending. See also the CallingPres command.    usecallingpres=no
	* @behavior.fieldname usecallingpres 
	**/
	public Boolean getUsecallingpres();
	
	/**
	*setusecallingpres 
	* (PRI channels only) Whether or not to use the Caller ID presentation for the outgoing call that the calling switch is sending. See also the CallingPres command.    usecallingpres=no
	* @behavior.fieldname usecallingpres 
	*/
	public void setUsecallingpres(Boolean ausecallingpres);


}