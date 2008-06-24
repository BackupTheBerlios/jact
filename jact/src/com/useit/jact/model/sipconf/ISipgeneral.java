

package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * ISipgeneral<br>
 * The [general] section of sip.conf includes the following variables
 * </p>
 * Created : Fri May 26 14:30:38 CEST 2006
 * 
 * @behavior.elementname Sipgeneral
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISipgeneral.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  ISipgeneral {
public static final String MODELNAME = "Sipgeneral";	

/**
 * gibt die List<Sipauth> sipauthMap zurück	
 * @return List<Sipauth>
 * @behavior.list SipauthMap 
 * @behavior.list.type Sipauth 
 */
public List getSipauthMap();
/**
 * setzt die Map SipauthMap
 * @param map sipauthMapMap
 * @behavior.list SipauthMap 
 * @behavior.list.type Sipauth 
 */
public void setSipauthMap(List aList);

/**
 * gibt die List<Sipregister> sipregisterMap zurück	
 * @return List<Sipregister>
 * @behavior.list SipregisterMap 
 * @behavior.list.type Sipregister 
 */
public List getSipregisterMap();
/**
 * setzt die Map SipregisterMap
 * @param map sipregisterMapMap
 * @behavior.list SipregisterMap 
 * @behavior.list.type Sipregister 
 */
public void setSipregisterMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_AUTOCREATEPEER="autocreatepeer" ;
// 	public static final String VALUEID_BINDADDR="bindaddr" ;
// 	public static final String VALUEID_BINDPORT="bindport" ;
// 	public static final String VALUEID_CANREINVITE="canreinvite" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_DEFAULTEXPIREY="defaultexpirey" ;
// 	public static final String VALUEID_DTMFMODE="dtmfmode" ;
// 	public static final String VALUEID_EXTERNIP="externip" ;
// 	public static final String VALUEID_EXTERNHOST="externhost" ;
// 	public static final String VALUEID_EXTERNREFRESH="externrefresh" ;
// 	public static final String VALUEID_LOCALNET="localnet" ;
// 	public static final String VALUEID_FROMDOMAIN="fromdomain" ;
// 	public static final String VALUEID_MAXEXPIREY="maxexpirey" ;
// 	public static final String VALUEID_NAT="nat" ;
// 	public static final String VALUEID_NOTIFYMIMETYPE="notifymimetype" ;
// 	public static final String VALUEID_PEDANTIC="pedantic" ;
// 	public static final String VALUEID_PORT="port" ;
// 	public static final String VALUEID_PROMISCREDIR="promiscredir" ;
// 	public static final String VALUEID_SRVLOOKUP="srvlookup" ;
// 	public static final String VALUEID_TOS="tos" ;
// 	public static final String VALUEID_VIDEOSUPPORT="videosupport" ;
// 	public static final String VALUEID_USERAGENT="useragent" ;
// 	public static final String VALUEID_TRUSTRPID="trustrpid" ;
// 	public static final String VALUEID_REALM="realm" ;
// 	public static final String VALUEID_RTPTIMEOUT="rtptimeout" ;
// 	public static final String VALUEID_RELAXDTMF="relaxdtmf" ;
// 	public static final String VALUEID_RTPHOLDTIMEOUT="rtpholdtimeout" ;
// 	public static final String VALUEID_PROGRESSINBAND="progressinband" ;
// 	public static final String VALUEID_USEREQPHONE="usereqphone" ;
// 	public static final String VALUEID_COMPACTHEADERS="compactheaders" ;
// 	public static final String VALUEID_SIPDEBUG="sipdebug" ;
// 	public static final String VALUEID_CHECKMWI="checkmwi" ;
// 	public static final String VALUEID_RECORDHISTORY="recordhistory" ;
// 	public static final String VALUEID_ALLOW="allow" ;
// 	public static final String VALUEID_DISALLOW="disallow" ;
	
	//---------  getter und setter

	/**
	* getautocreatepeer 
	* yes | no: If set, anyone will be able to log in as a peer (with no check of credentials; useful for operation with SER).
	* @behavior.fieldname autocreatepeer 
	**/
	public Boolean getAutocreatepeer();
	
	/**
	*setautocreatepeer 
	* yes | no: If set, anyone will be able to log in as a peer (with no check of credentials; useful for operation with SER).
	* @behavior.fieldname autocreatepeer 
	*/
	public void setAutocreatepeer(Boolean aautocreatepeer);


	/**
	* getbindaddr 
	* 0.0.0.0 :IP Address to bind to (listen on)
	* @behavior.fieldname bindaddr 
	**/
	public String getBindaddr();
	
	/**
	*setbindaddr 
	* 0.0.0.0 :IP Address to bind to (listen on)
	* @behavior.fieldname bindaddr 
	*/
	public void setBindaddr(String abindaddr);


	/**
	* getbindport 
	* 5060 :port to bind to (listen on)
	* @behavior.fieldname bindport 
	**/
	public Integer getBindport();
	
	/**
	*setbindport 
	* 5060 :port to bind to (listen on)
	* @behavior.fieldname bindport 
	*/
	public void setBindport(Integer abindport);


	/**
	* getcanreinvite 
	* update | yes | no (global setting)
	* @behavior.fieldname canreinvite 
	**/
	public String getCanreinvite();
	
	/**
	*setcanreinvite 
	* update | yes | no (global setting)
	* @behavior.fieldname canreinvite 
	*/
	public void setCanreinvite(String acanreinvite);


	/**
	* getcontext 
	* <contextname> :This is the default context and is used when a endpoint has no context property. The context in secton of a endpoint is used to route calls from that endpoint to the wanted destination. The context body is located in extensions.conf.
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* <contextname> :This is the default context and is used when a endpoint has no context property. The context in secton of a endpoint is used to route calls from that endpoint to the wanted destination. The context body is located in extensions.conf.
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* getdefaultexpirey 
	* 120 :Default length of incoming/outoing registration
	* @behavior.fieldname defaultexpirey 
	**/
	public Integer getDefaultexpirey();
	
	/**
	*setdefaultexpirey 
	* 120 :Default length of incoming/outoing registration
	* @behavior.fieldname defaultexpirey 
	*/
	public void setDefaultexpirey(Integer adefaultexpirey);


	/**
	* getdtmfmode 
	* inband | info | rfc2833 (global setting)
	* @behavior.fieldname dtmfmode 
	**/
	public Dtmfmode getDtmfmode();
	
	/**
	*setdtmfmode 
	* inband | info | rfc2833 (global setting)
	* @behavior.fieldname dtmfmode 
	*/
	public void setDtmfmode(Dtmfmode adtmfmode);


	/**
	* getexternip 
	* 200.201.202.203 :Address that we're going to put in SIP messages if we're behind a NAT
	* @behavior.fieldname externip 
	**/
	public String getExternip();
	
	/**
	*setexternip 
	* 200.201.202.203 :Address that we're going to put in SIP messages if we're behind a NAT
	* @behavior.fieldname externip 
	*/
	public void setExternip(String aexternip);


	/**
	* getexternhost 
	* hostname.tld : (new in Asterisk 1.2.x)
	* @behavior.fieldname externhost 
	**/
	public String getExternhost();
	
	/**
	*setexternhost 
	* hostname.tld : (new in Asterisk 1.2.x)
	* @behavior.fieldname externhost 
	*/
	public void setExternhost(String aexternhost);


	/**
	* getexternrefresh 
	* xxx : Specify how often a hostname DNS lookup should be performed for the value entered in 'externhost' (new in Asterisk 1.2.x)
	* @behavior.fieldname externrefresh 
	**/
	public String getExternrefresh();
	
	/**
	*setexternrefresh 
	* xxx : Specify how often a hostname DNS lookup should be performed for the value entered in 'externhost' (new in Asterisk 1.2.x)
	* @behavior.fieldname externrefresh 
	*/
	public void setExternrefresh(String aexternrefresh);


	/**
	* getlocalnet 
	* 192.168.1.0/255.255.255.0 :local network and mask
	* @behavior.fieldname localnet 
	**/
	public String getLocalnet();
	
	/**
	*setlocalnet 
	* 192.168.1.0/255.255.255.0 :local network and mask
	* @behavior.fieldname localnet 
	*/
	public void setLocalnet(String alocalnet);


	/**
	* getfromdomain 
	* <domain> : Sets default From: domain in SIP messages when acting as a SIP ua (client)
	* @behavior.fieldname fromdomain 
	**/
	public String getFromdomain();
	
	/**
	*setfromdomain 
	* <domain> : Sets default From: domain in SIP messages when acting as a SIP ua (client)
	* @behavior.fieldname fromdomain 
	*/
	public void setFromdomain(String afromdomain);


	/**
	* getmaxexpirey 
	* 3600 :Max length of incoming registration we allow
	* @behavior.fieldname maxexpirey 
	**/
	public Integer getMaxexpirey();
	
	/**
	*setmaxexpirey 
	* 3600 :Max length of incoming registration we allow
	* @behavior.fieldname maxexpirey 
	*/
	public void setMaxexpirey(Integer amaxexpirey);


	/**
	* getnat 
	* yes | no (per connection setting) Please note that in Asterisk 1.0.x nat can now have the values: no | never | route | yes.
	* @behavior.fieldname nat 
	**/
	public Boolean getNat();
	
	/**
	*setnat 
	* yes | no (per connection setting) Please note that in Asterisk 1.0.x nat can now have the values: no | never | route | yes.
	* @behavior.fieldname nat 
	*/
	public void setNat(Boolean anat);


	/**
	* getnotifymimetype 
	* text/plain :Allow overriding of mime type in MWI NOTIFY used in voicemail online messages.
	* @behavior.fieldname notifymimetype 
	**/
	public String getNotifymimetype();
	
	/**
	*setnotifymimetype 
	* text/plain :Allow overriding of mime type in MWI NOTIFY used in voicemail online messages.
	* @behavior.fieldname notifymimetype 
	*/
	public void setNotifymimetype(String anotifymimetype);


	/**
	* getpedantic 
	* yes|no :Enable slow, pedantic checking of Call-ID:s, multiline SIP headers and URI-encoded headers
	* @behavior.fieldname pedantic 
	**/
	public Boolean getPedantic();
	
	/**
	*setpedantic 
	* yes|no :Enable slow, pedantic checking of Call-ID:s, multiline SIP headers and URI-encoded headers
	* @behavior.fieldname pedantic 
	*/
	public void setPedantic(Boolean apedantic);


	/**
	* getport 
	* <portno>: Default SIP port. (this is not the port for Asterisk to listen. See bindport)
	* @behavior.fieldname port 
	**/
	public Integer getPort();
	
	/**
	*setport 
	* <portno>: Default SIP port. (this is not the port for Asterisk to listen. See bindport)
	* @behavior.fieldname port 
	*/
	public void setPort(Integer aport);


	/**
	* getpromiscredir 
	* yes | no Allows support for 302 Redirects; (No will redirect them all to the local extension returned in Contact rather than to that extension at the destination)
	* @behavior.fieldname promiscredir 
	**/
	public Boolean getPromiscredir();
	
	/**
	*setpromiscredir 
	* yes | no Allows support for 302 Redirects; (No will redirect them all to the local extension returned in Contact rather than to that extension at the destination)
	* @behavior.fieldname promiscredir 
	*/
	public void setPromiscredir(Boolean apromiscredir);


	/**
	* getsrvlookup 
	* yes|no :Enable DNS SRV lookups on calls
	* @behavior.fieldname srvlookup 
	**/
	public Boolean getSrvlookup();
	
	/**
	*setsrvlookup 
	* yes|no :Enable DNS SRV lookups on calls
	* @behavior.fieldname srvlookup 
	*/
	public void setSrvlookup(Boolean asrvlookup);


	/**
	* gettos 
	* <value>: Set IP QoS? parameters for outgoing media streams (numeric values are also accepted, like tos=184 )
	* @behavior.fieldname tos 
	**/
	public String getTos();
	
	/**
	*settos 
	* <value>: Set IP QoS? parameters for outgoing media streams (numeric values are also accepted, like tos=184 )
	* @behavior.fieldname tos 
	*/
	public void setTos(String atos);


	/**
	* getvideosupport 
	* yes|no : Turn on support for SIP video
	* @behavior.fieldname videosupport 
	**/
	public Boolean getVideosupport();
	
	/**
	*setvideosupport 
	* yes|no : Turn on support for SIP video
	* @behavior.fieldname videosupport 
	*/
	public void setVideosupport(Boolean avideosupport);


	/**
	* getuseragent 
	* Allow the SIP header "User-Agent" to be customized
	* @behavior.fieldname useragent 
	**/
	public String getUseragent();
	
	/**
	*setuseragent 
	* Allow the SIP header "User-Agent" to be customized
	* @behavior.fieldname useragent 
	*/
	public void setUseragent(String auseragent);


	/**
	* gettrustrpid 
	* yes|no : If Remote-Party-ID should be trusted
	* @behavior.fieldname trustrpid 
	**/
	public Boolean getTrustrpid();
	
	/**
	*settrustrpid 
	* yes|no : If Remote-Party-ID should be trusted
	* @behavior.fieldname trustrpid 
	*/
	public void setTrustrpid(Boolean atrustrpid);


	/**
	* getrealm 
	* my realm (Change authentication realm from Asterisk (default) to your own. Requires Asterisk v1.x)
	* @behavior.fieldname realm 
	**/
	public String getRealm();
	
	/**
	*setrealm 
	* my realm (Change authentication realm from Asterisk (default) to your own. Requires Asterisk v1.x)
	* @behavior.fieldname realm 
	*/
	public void setRealm(String arealm);


	/**
	* getrtptimeout 
	* Terminate call if xx seconds of no RTP activity when we're not on hold
	* @behavior.fieldname rtptimeout 
	**/
	public Integer getRtptimeout();
	
	/**
	*setrtptimeout 
	* Terminate call if xx seconds of no RTP activity when we're not on hold
	* @behavior.fieldname rtptimeout 
	*/
	public void setRtptimeout(Integer artptimeout);


	/**
	* getrelaxdtmf 
	* Relax dtmf handling
	* @behavior.fieldname relaxdtmf 
	**/
	public Boolean getRelaxdtmf();
	
	/**
	*setrelaxdtmf 
	* Relax dtmf handling
	* @behavior.fieldname relaxdtmf 
	*/
	public void setRelaxdtmf(Boolean arelaxdtmf);


	/**
	* getrtpholdtimeout 
	* when we're on hold (must be > rtptimeout)
	* @behavior.fieldname rtpholdtimeout 
	**/
	public Integer getRtpholdtimeout();
	
	/**
	*setrtpholdtimeout 
	* when we're on hold (must be > rtptimeout)
	* @behavior.fieldname rtpholdtimeout 
	*/
	public void setRtpholdtimeout(Integer artpholdtimeout);


	/**
	* getprogressinband 
	* If we should generate in-band ringing always
	* @behavior.fieldname progressinband 
	**/
	public String getProgressinband();
	
	/**
	*setprogressinband 
	* If we should generate in-band ringing always
	* @behavior.fieldname progressinband 
	*/
	public void setProgressinband(String aprogressinband);


	/**
	* getusereqphone 
	* If yes, ";user=phone" is added to uri that contains a valid phone number.
	* @behavior.fieldname usereqphone 
	**/
	public Boolean getUsereqphone();
	
	/**
	*setusereqphone 
	* If yes, ";user=phone" is added to uri that contains a valid phone number.
	* @behavior.fieldname usereqphone 
	*/
	public void setUsereqphone(Boolean ausereqphone);


	/**
	* getcompactheaders 
	* 
	* @behavior.fieldname compactheaders 
	**/
	public Boolean getCompactheaders();
	
	/**
	*setcompactheaders 
	* 
	* @behavior.fieldname compactheaders 
	*/
	public void setCompactheaders(Boolean acompactheaders);


	/**
	* getsipdebug 
	* 
	* @behavior.fieldname sipdebug 
	**/
	public Boolean getSipdebug();
	
	/**
	*setsipdebug 
	* 
	* @behavior.fieldname sipdebug 
	*/
	public void setSipdebug(Boolean asipdebug);


	/**
	* getcheckmwi 
	* 
	* @behavior.fieldname checkmwi 
	**/
	public Integer getCheckmwi();
	
	/**
	*setcheckmwi 
	* 
	* @behavior.fieldname checkmwi 
	*/
	public void setCheckmwi(Integer acheckmwi);


	/**
	* getrecordhistory 
	* 
	* @behavior.fieldname recordhistory 
	**/
	public Boolean getRecordhistory();
	
	/**
	*setrecordhistory 
	* 
	* @behavior.fieldname recordhistory 
	*/
	public void setRecordhistory(Boolean arecordhistory);


	/**
	* getallow 
	* 
	* @behavior.fieldname allow 
	**/
	public CodecsSet getAllow();
	
	/**
	*setallow 
	* 
	* @behavior.fieldname allow 
	*/
	public void setAllow(CodecsSet aallow);


	/**
	* getdisallow 
	* 
	* @behavior.fieldname disallow 
	**/
	public CodecsSet getDisallow();
	
	/**
	*setdisallow 
	* 
	* @behavior.fieldname disallow 
	*/
	public void setDisallow(CodecsSet adisallow);


}