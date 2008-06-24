

package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;


/**
 * <p>
 * IIaxgeneral<br>
 * Global settings  Inter-Asterisk eXchange driver definition This configuration is re-read at reload or with the CLI command reload chan_iax2.so General settings, like port number to bind to, and an option address (the default is to bind to all local addresses).
 * </p>
 * Created : Fri May 26 14:30:29 CEST 2006
 * 
 * @behavior.elementname Iaxgeneral
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIaxgeneral.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  interface  IIaxgeneral {
public static final String MODELNAME = "Iaxgeneral";	

/**
 * gibt die List<Iaxpeer> iaxpeerMap zurück	
 * @return List<Iaxpeer>
 * @behavior.list IaxpeerMap 
 * @behavior.list.type Iaxpeer 
 */
public List getIaxpeerMap();
/**
 * setzt die Map IaxpeerMap
 * @param map iaxpeerMapMap
 * @behavior.list IaxpeerMap 
 * @behavior.list.type Iaxpeer 
 */
public void setIaxpeerMap(List aList);

/**
 * gibt die List<Iaxregister> iaxregisterMap zurück	
 * @return List<Iaxregister>
 * @behavior.list IaxregisterMap 
 * @behavior.list.type Iaxregister 
 */
public List getIaxregisterMap();
/**
 * setzt die Map IaxregisterMap
 * @param map iaxregisterMapMap
 * @behavior.list IaxregisterMap 
 * @behavior.list.type Iaxregister 
 */
public void setIaxregisterMap(List aList);
 
// ------   1-1 aggregates
/**
 * @return Iaxjitter the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Iaxjitter 
 */
public IIaxjitter getIaxjitter();

/**
 * setzt den Iaxjitter und die Iaxjitterid	
 * @param Iaxjitter
 */
public void setIaxjitter(IIaxjitter aIaxjitter);
// 	public static final String VALUEID_BINDPORT="bindport" ;
// 	public static final String VALUEID_BINDADDR="bindaddr" ;
// 	public static final String VALUEID_IAXCOMPAT="iaxcompat" ;
// 	public static final String VALUEID_NOCHECKSUMS="nochecksums" ;
// 	public static final String VALUEID_DELAYREJECT="delayreject" ;
// 	public static final String VALUEID_AMAFLAGS="amaflags" ;
// 	public static final String VALUEID_ACCOUNTCODE="accountcode" ;
// 	public static final String VALUEID_LANGUAGE="language" ;
// 	public static final String VALUEID_BANDWIDTH="bandwidth" ;
// 	public static final String VALUEID_TRUNKTIMESTAMPS="trunktimestamps" ;
// 	public static final String VALUEID_AUTHDEBUG="authdebug" ;
// 	public static final String VALUEID_TOS="tos" ;
// 	public static final String VALUEID_MAILBOXDETAIL="mailboxdetail" ;
// 	public static final String VALUEID_REGCONTEXT="regcontext" ;
// 	public static final String VALUEID_AUTOKILL="autokill" ;
// 	public static final String VALUEID_CODECPRIORITY="codecpriority" ;
// 	public static final String VALUEID_RTCACHEFRIENDS="rtcachefriends" ;
// 	public static final String VALUEID_RTUPDATE="rtupdate" ;
// 	public static final String VALUEID_RTAUTOCLEAR="rtautoclear" ;
// 	public static final String VALUEID_RTIGNOREEXPIRE="rtignoreexpire" ;
// 	public static final String VALUEID_TRUNKFREQ="trunkfreq" ;
// 	public static final String VALUEID_DISALLOW="disallow" ;
// 	public static final String VALUEID_ALLOW="allow" ;
// 	public static final String VALUEID_MINREGEXPIRE="minregexpire" ;
// 	public static final String VALUEID_MAXREGEXPIRE="maxregexpire" ;
// 	public static final String VALUEID_NOTRANSFER="notransfer" ;
	
	//---------  getter und setter

	/**
	* getbindport 
	* bindport and bindaddr may be specified NOTE: bindport must be specified BEFORE bindaddr or may be specified on a specific bindaddr if followed by
	* @behavior.fieldname bindport 
	**/
	public Integer getBindport();
	
	/**
	*setbindport 
	* bindport and bindaddr may be specified NOTE: bindport must be specified BEFORE bindaddr or may be specified on a specific bindaddr if followed by
	* @behavior.fieldname bindport 
	*/
	public void setBindport(Integer abindport);


	/**
	* getbindaddr 
	* addresses, but the first will be the  default
	* @behavior.fieldname bindaddr 
	**/
	public String getBindaddr();
	
	/**
	*setbindaddr 
	* addresses, but the first will be the  default
	* @behavior.fieldname bindaddr 
	*/
	public void setBindaddr(String abindaddr);


	/**
	* getiaxcompat 
	* Set iaxcompat to yes if you plan to use layered switches or some other scenario which may cause some delay when doing a lookup in the dialplan. It incurs a small performance hit to enable it. This option causes Asterisk to spawn a separate thread when it receives an IAX DPREQ (Dialplan Request) instead of blocking while it waits for a response.
	* @behavior.fieldname iaxcompat 
	**/
	public String getIaxcompat();
	
	/**
	*setiaxcompat 
	* Set iaxcompat to yes if you plan to use layered switches or some other scenario which may cause some delay when doing a lookup in the dialplan. It incurs a small performance hit to enable it. This option causes Asterisk to spawn a separate thread when it receives an IAX DPREQ (Dialplan Request) instead of blocking while it waits for a response.
	* @behavior.fieldname iaxcompat 
	*/
	public void setIaxcompat(String aiaxcompat);


	/**
	* getnochecksums 
	* Disable UDP checksums (if nochecksums is set, then no checkums will be calculated/checked on systems supporting this feature)
	* @behavior.fieldname nochecksums 
	**/
	public Boolean getNochecksums();
	
	/**
	*setnochecksums 
	* Disable UDP checksums (if nochecksums is set, then no checkums will be calculated/checked on systems supporting this feature)
	* @behavior.fieldname nochecksums 
	*/
	public void setNochecksums(Boolean anochecksums);


	/**
	* getdelayreject 
	* For increased security against brute force password attacks enable "delayreject" which will delay the sending of authentication reject for REGREQ or AUTHREP if there is a password.
	* @behavior.fieldname delayreject 
	**/
	public Boolean getDelayreject();
	
	/**
	*setdelayreject 
	* For increased security against brute force password attacks enable "delayreject" which will delay the sending of authentication reject for REGREQ or AUTHREP if there is a password.
	* @behavior.fieldname delayreject 
	*/
	public void setDelayreject(Boolean adelayreject);


	/**
	* getamaflags 
	* You may specify a global default AMA flag for iaxtel calls.  It must be one of 'default', 'omit', 'billing', or 'documentation'.  These flags are used in the generation of call detail records.
	* @behavior.fieldname amaflags 
	**/
	public Amaflags getAmaflags();
	
	/**
	*setamaflags 
	* You may specify a global default AMA flag for iaxtel calls.  It must be one of 'default', 'omit', 'billing', or 'documentation'.  These flags are used in the generation of call detail records.
	* @behavior.fieldname amaflags 
	*/
	public void setAmaflags(Amaflags aamaflags);


	/**
	* getaccountcode 
	* You may specify a default account for Call Detail Records in addition to specifying on a per-user basis
	* @behavior.fieldname accountcode 
	**/
	public String getAccountcode();
	
	/**
	*setaccountcode 
	* You may specify a default account for Call Detail Records in addition to specifying on a per-user basis
	* @behavior.fieldname accountcode 
	*/
	public void setAccountcode(String aaccountcode);


	/**
	* getlanguage 
	* You may specify a global default language for users.  Can be specified also on a per-user basis If omitted, will fallback to english
	* @behavior.fieldname language 
	**/
	public String getLanguage();
	
	/**
	*setlanguage 
	* You may specify a global default language for users.  Can be specified also on a per-user basis If omitted, will fallback to english
	* @behavior.fieldname language 
	*/
	public void setLanguage(String alanguage);


	/**
	* getbandwidth 
	* Specify bandwidth of low, medium, or high to control which codecs are used in general.
	* @behavior.fieldname bandwidth 
	**/
	public String getBandwidth();
	
	/**
	*setbandwidth 
	* Specify bandwidth of low, medium, or high to control which codecs are used in general.
	* @behavior.fieldname bandwidth 
	*/
	public void setBandwidth(String abandwidth);


	/**
	* gettrunktimestamps 
	* Should we send timestamps for the individual sub-frames within trunk frames? There is a small bandwidth use for these (less than 1kbps/call), but they ensure that frame timestamps get sent end-to-end properly.  If both ends of all your trunks go directly to TDM, _and_ your trunkfreq equals the frame length for your codecs, you  can probably suppress these.  The receiver must also support this feature, although they do not also need to have it enabled.
	* @behavior.fieldname trunktimestamps 
	**/
	public Integer getTrunktimestamps();
	
	/**
	*settrunktimestamps 
	* Should we send timestamps for the individual sub-frames within trunk frames? There is a small bandwidth use for these (less than 1kbps/call), but they ensure that frame timestamps get sent end-to-end properly.  If both ends of all your trunks go directly to TDM, _and_ your trunkfreq equals the frame length for your codecs, you  can probably suppress these.  The receiver must also support this feature, although they do not also need to have it enabled.
	* @behavior.fieldname trunktimestamps 
	*/
	public void setTrunktimestamps(Integer atrunktimestamps);


	/**
	* getauthdebug 
	* You can disable authentication debugging to reduce the amount of  debugging traffic.
	* @behavior.fieldname authdebug 
	**/
	public String getAuthdebug();
	
	/**
	*setauthdebug 
	* You can disable authentication debugging to reduce the amount of  debugging traffic.
	* @behavior.fieldname authdebug 
	*/
	public void setAuthdebug(String aauthdebug);


	/**
	* gettos 
	* Finally, you can set values for your TOS bits to help improve  performance.  Valid values are:   lowdelay		-- Minimize delay   throughput		-- Maximize throughput   reliability		-- Maximize reliability   mincost		-- Minimize cost   none		-- No flags
	* @behavior.fieldname tos 
	**/
	public String getTos();
	
	/**
	*settos 
	* Finally, you can set values for your TOS bits to help improve  performance.  Valid values are:   lowdelay		-- Minimize delay   throughput		-- Maximize throughput   reliability		-- Maximize reliability   mincost		-- Minimize cost   none		-- No flags
	* @behavior.fieldname tos 
	*/
	public void setTos(String atos);


	/**
	* getmailboxdetail 
	* If mailboxdetail is set to "yes", the user receives the actual new/old message counts, not just a yes/no as to whether they have messages.  this can be set on a per-peer basis as well
	* @behavior.fieldname mailboxdetail 
	**/
	public Boolean getMailboxdetail();
	
	/**
	*setmailboxdetail 
	* If mailboxdetail is set to "yes", the user receives the actual new/old message counts, not just a yes/no as to whether they have messages.  this can be set on a per-peer basis as well
	* @behavior.fieldname mailboxdetail 
	*/
	public void setMailboxdetail(Boolean amailboxdetail);


	/**
	* getregcontext 
	* If regcontext is specified, Asterisk will dynamically  create and destroy a NoOp priority 1 extension for a given peer who registers or unregisters with us.  The actual extension is the 'regexten' parameter of the registering peer or its name if 'regexten' is not provided.  More than one regexten may be supplied if they are separated by '&'.  Patterns may be used in regexten.
	* @behavior.fieldname regcontext 
	**/
	public String getRegcontext();
	
	/**
	*setregcontext 
	* If regcontext is specified, Asterisk will dynamically  create and destroy a NoOp priority 1 extension for a given peer who registers or unregisters with us.  The actual extension is the 'regexten' parameter of the registering peer or its name if 'regexten' is not provided.  More than one regexten may be supplied if they are separated by '&'.  Patterns may be used in regexten.
	* @behavior.fieldname regcontext 
	*/
	public void setRegcontext(String aregcontext);


	/**
	* getautokill 
	* If we don't get ACK to our NEW within 2000ms, and autokill is set to yes, then we cancel the whole thing (that's enough time for one  retransmission only).  This is used to keep things from stalling for a long time for a host that is not available, but would be ill advised for bad  connections.  In addition to 'yes' or 'no' you can also specify a number of milliseconds.  See 'qualify' for individual peers to turn on for just a specific peer.
	* @behavior.fieldname autokill 
	**/
	public Boolean getAutokill();
	
	/**
	*setautokill 
	* If we don't get ACK to our NEW within 2000ms, and autokill is set to yes, then we cancel the whole thing (that's enough time for one  retransmission only).  This is used to keep things from stalling for a long time for a host that is not available, but would be ill advised for bad  connections.  In addition to 'yes' or 'no' you can also specify a number of milliseconds.  See 'qualify' for individual peers to turn on for just a specific peer.
	* @behavior.fieldname autokill 
	*/
	public void setAutokill(Boolean aautokill);


	/**
	* getcodecpriority 
	* codecpriority controls the codec negotiation of an inbound IAX call. This option is inherited to all user entities.  It can also be defined  in each user entity separately which will override the setting in general.

The valid values are: caller   - Consider the callers preferred order ahead of the host's. host     - Consider the host's preferred order ahead of the caller's. disabled - Disable the consideration of codec preference alltogether.            (this is the original behaviour before preferences were added) reqonly  - Same as disabled, only do not consider capabilities if            the requested format is not available the call will only            be accepted if the requested format is available.

The default value is 'host'
	* @behavior.fieldname codecpriority 
	**/
	public String getCodecpriority();
	
	/**
	*setcodecpriority 
	* codecpriority controls the codec negotiation of an inbound IAX call. This option is inherited to all user entities.  It can also be defined  in each user entity separately which will override the setting in general.

The valid values are: caller   - Consider the callers preferred order ahead of the host's. host     - Consider the host's preferred order ahead of the caller's. disabled - Disable the consideration of codec preference alltogether.            (this is the original behaviour before preferences were added) reqonly  - Same as disabled, only do not consider capabilities if            the requested format is not available the call will only            be accepted if the requested format is available.

The default value is 'host'
	* @behavior.fieldname codecpriority 
	*/
	public void setCodecpriority(String acodecpriority);


	/**
	* getrtcachefriends 
	* Cache realtime friends by adding them to the internal list just like friends added from the config file only on a as-needed basis.
	* @behavior.fieldname rtcachefriends 
	**/
	public Integer getRtcachefriends();
	
	/**
	*setrtcachefriends 
	* Cache realtime friends by adding them to the internal list just like friends added from the config file only on a as-needed basis.
	* @behavior.fieldname rtcachefriends 
	*/
	public void setRtcachefriends(Integer artcachefriends);


	/**
	* getrtupdate 
	* Send registry updates to database using realtime? (yes|no) If set to yes, when a IAX2 peer registers successfully, the ip address,the origination port, the registration period, and the username of the origination port, the registration period, and the username of  the peer will be set to database via realtime. If not present, defaults to 'yes'.
	* @behavior.fieldname rtupdate 
	**/
	public Boolean getRtupdate();
	
	/**
	*setrtupdate 
	* Send registry updates to database using realtime? (yes|no) If set to yes, when a IAX2 peer registers successfully, the ip address,the origination port, the registration period, and the username of the origination port, the registration period, and the username of  the peer will be set to database via realtime. If not present, defaults to 'yes'.
	* @behavior.fieldname rtupdate 
	*/
	public void setRtupdate(Boolean artupdate);


	/**
	* getrtautoclear 
	* Auto-Expire friends created on the fly on the same schedule as if it had just registered when the registration expires the friend will vanish from the configuration until requested again.  If set to an integer, friends expire within this number of seconds instead of the same as the registration interval
	* @behavior.fieldname rtautoclear 
	**/
	public Boolean getRtautoclear();
	
	/**
	*setrtautoclear 
	* Auto-Expire friends created on the fly on the same schedule as if it had just registered when the registration expires the friend will vanish from the configuration until requested again.  If set to an integer, friends expire within this number of seconds instead of the same as the registration interval
	* @behavior.fieldname rtautoclear 
	*/
	public void setRtautoclear(Boolean artautoclear);


	/**
	* getrtignoreexpire 
	* when reading a peer from Realtime, if the peer's registration has expired based on its registration interval, used the stored  address information regardless
	* @behavior.fieldname rtignoreexpire 
	**/
	public Boolean getRtignoreexpire();
	
	/**
	*setrtignoreexpire 
	* when reading a peer from Realtime, if the peer's registration has expired based on its registration interval, used the stored  address information regardless
	* @behavior.fieldname rtignoreexpire 
	*/
	public void setRtignoreexpire(Boolean artignoreexpire);


	/**
	* gettrunkfreq 
	* How frequently to send trunk msgs (in ms)
	* @behavior.fieldname trunkfreq 
	**/
	public Integer getTrunkfreq();
	
	/**
	*settrunkfreq 
	* How frequently to send trunk msgs (in ms)
	* @behavior.fieldname trunkfreq 
	*/
	public void setTrunkfreq(Integer atrunkfreq);


	/**
	* getdisallow 
	* all :Disallow all codecs (global configuration)
	* @behavior.fieldname disallow 
	**/
	public CodecsSet getDisallow();
	
	/**
	*setdisallow 
	* all :Disallow all codecs (global configuration)
	* @behavior.fieldname disallow 
	*/
	public void setDisallow(CodecsSet adisallow);


	/**
	* getallow 
	* Allow codecs in order of preference (Use DISALLOW=ALL first, before allowing other codecs)
	* @behavior.fieldname allow 
	**/
	public CodecsSet getAllow();
	
	/**
	*setallow 
	* Allow codecs in order of preference (Use DISALLOW=ALL first, before allowing other codecs)
	* @behavior.fieldname allow 
	*/
	public void setAllow(CodecsSet aallow);


	/**
	* getminregexpire 
	* Minimum and maximum amounts of time that IAX peers can request as a registration expiration interval (in seconds).
	* @behavior.fieldname minregexpire 
	**/
	public Integer getMinregexpire();
	
	/**
	*setminregexpire 
	* Minimum and maximum amounts of time that IAX peers can request as a registration expiration interval (in seconds).
	* @behavior.fieldname minregexpire 
	*/
	public void setMinregexpire(Integer aminregexpire);


	/**
	* getmaxregexpire 
	* 
	* @behavior.fieldname maxregexpire 
	**/
	public Integer getMaxregexpire();
	
	/**
	*setmaxregexpire 
	* 
	* @behavior.fieldname maxregexpire 
	*/
	public void setMaxregexpire(Integer amaxregexpire);


	/**
	* getnotransfer 
	* 
	* @behavior.fieldname notransfer 
	**/
	public Boolean getNotransfer();
	
	/**
	*setnotransfer 
	* 
	* @behavior.fieldname notransfer 
	*/
	public void setNotransfer(Boolean anotransfer);


}