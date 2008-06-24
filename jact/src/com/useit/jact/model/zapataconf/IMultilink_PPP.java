

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMultilink_PPP<br>
 * If you have an ISDN PRI, you may be able to run multi-link PPP over it, to provide you with a data connection. Multi-link PPP is a technology that allows channels on a PRI to be dynamically allocated between voice and data. Asterisk can take voice channels allocated to it, dial a Remote Access Server, and dump the channels into a special extension that delivers the channel to the zaptel data layer. Configure the settings here, and then see the ZapRAS command to make it happen. PRI channels can have an idle extension and a minunused number. So long as at least minunused channels are idle, the Zap channel module will try to dial idledial on them, and then Asterisk will begin executing the commands for the context and extension specified by idleext. When channels are needed for voice calls, the "idle" calls are disconnected (so long as there are at least minidle calls still running, of course) to make more channels available. The primary use of this is to create a dynamic service, where idle channels are bundled through multilink PPP, thus more efficiently utilizing combined voice/data services than conventional fixed mappings/muxings.
 * </p>
 * Created : Fri May 26 14:30:39 CEST 2006
 * 
 * @behavior.elementname Multilink_PPP
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMultilink_PPP.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IMultilink_PPP {
public static final String MODELNAME = "Multilink_PPP";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MINUNUSED="minunused" ;
// 	public static final String VALUEID_MINIDLE="minidle" ;
// 	public static final String VALUEID_IDLEDIAL="idledial" ;
// 	public static final String VALUEID_IDLEEXT="idleext" ;
	
	//---------  getter und setter

	/**
	* getminunused 
	* The minimum number of unused channels available. If there are fewer channels available, Asterisk will not attempt to bundle any channels and give them to the data connection. Takes an integer.
	* @behavior.fieldname minunused 
	**/
	public String getMinunused();
	
	/**
	*setminunused 
	* The minimum number of unused channels available. If there are fewer channels available, Asterisk will not attempt to bundle any channels and give them to the data connection. Takes an integer.
	* @behavior.fieldname minunused 
	*/
	public void setMinunused(String aminunused);


	/**
	* getminidle 
	* The minimum number of idle channels to bundle for the data link. Asterisk will keep this number of channels open for data, rather than taking them back for voice channels when needed. Takes an integer.
	* @behavior.fieldname minidle 
	**/
	public Integer getMinidle();
	
	/**
	*setminidle 
	* The minimum number of idle channels to bundle for the data link. Asterisk will keep this number of channels open for data, rather than taking them back for voice channels when needed. Takes an integer.
	* @behavior.fieldname minidle 
	*/
	public void setMinidle(Integer aminidle);


	/**
	* getidledial 
	* The number to dial as the idle number. This is typically the number to dial a Remote Access Server (RAS). Channels being idled for data will be sent to this extension. Takes an integer that does not conflict with any other extension in the Dialplan, and has been defined as an idleext.
	* @behavior.fieldname idledial 
	**/
	public Integer getIdledial();
	
	/**
	*setidledial 
	* The number to dial as the idle number. This is typically the number to dial a Remote Access Server (RAS). Channels being idled for data will be sent to this extension. Takes an integer that does not conflict with any other extension in the Dialplan, and has been defined as an idleext.
	* @behavior.fieldname idledial 
	*/
	public void setIdledial(Integer aidledial);


	/**
	* getidleext 
	* The extension to use as the idle extension. Takes a value in the form of exten@context. Typically, the extension would be an extension to run the ZapRAS command.
	* @behavior.fieldname idleext 
	**/
	public String getIdleext();
	
	/**
	*setidleext 
	* The extension to use as the idle extension. Takes a value in the form of exten@context. Typically, the extension would be an extension to run the ZapRAS command.
	* @behavior.fieldname idleext 
	*/
	public void setIdleext(String aidleext);


}