

package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;


/**
 * <p>
 * ISippeers<br>
 * These variables can be configured for each SIP peer definition: 
 * </p>
 * Created : Fri May 26 14:30:37 CEST 2006
 * 
 * @behavior.elementname Sippeers
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISippeers.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  ISippeers {
public static final String MODELNAME = "Sippeers";	

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
 
// ------   1-1 aggregates
// 	public static final String VALUEID_SECTIONNAME="sectionname" ;
// 	public static final String VALUEID_ACCOUNTCODE="accountcode" ;
// 	public static final String VALUEID_AMAFLAGS="amaflags" ;
// 	public static final String VALUEID_CALLGROUP="callgroup" ;
// 	public static final String VALUEID_CANREINVITE="canreinvite" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_DEFAULTIP="defaultip" ;
// 	public static final String VALUEID_DTMFMODE="dtmfmode" ;
// 	public static final String VALUEID_FROMUSER="fromuser" ;
// 	public static final String VALUEID_FROMDOMAIN="fromdomain" ;
// 	public static final String VALUEID_HOST="host" ;
// 	public static final String VALUEID_INCOMINGLIMIT="incominglimit" ;
// 	public static final String VALUEID_OUTGOINGLIMIT="outgoinglimit" ;
// 	public static final String VALUEID_INSECURE="insecure" ;
// 	public static final String VALUEID_LANGUAGE="language" ;
// 	public static final String VALUEID_MAILBOX="mailbox" ;
// 	public static final String VALUEID_MD5SECRET="md5secret" ;
// 	public static final String VALUEID_NAT="nat" ;
// 	public static final String VALUEID_PICKUPGROUP="pickupgroup" ;
// 	public static final String VALUEID_PORT="port" ;
// 	public static final String VALUEID_QUALIFY="qualify" ;
// 	public static final String VALUEID_RESTRICTCID="restrictcid" ;
// 	public static final String VALUEID_RTPTIMEOUT="rtptimeout" ;
// 	public static final String VALUEID_RTPHOLDTIMEOUT="rtpholdtimeout" ;
// 	public static final String VALUEID_SECRET="secret" ;
// 	public static final String VALUEID_TYPE="type" ;
// 	public static final String VALUEID_USERNAME="username" ;
// 	public static final String VALUEID_MUSICONHOLD="musiconhold" ;
// 	public static final String VALUEID_CALLERID="callerid" ;
// 	public static final String VALUEID_DISALLOW="disallow" ;
// 	public static final String VALUEID_ALLOW="allow" ;
	
	//---------  getter und setter

	/**
	* getsectionname 
	* Peer Section Name
	* @behavior.fieldname sectionname 
	**/
	public String getSectionname();
	
	/**
	*setsectionname 
	* Peer Section Name
	* @behavior.fieldname sectionname 
	*/
	public void setSectionname(String asectionname);


	/**
	* getaccountcode 
	* Users may be associated with an accountcode. See Asterisk billing
	* @behavior.fieldname accountcode 
	**/
	public String getAccountcode();
	
	/**
	*setaccountcode 
	* Users may be associated with an accountcode. See Asterisk billing
	* @behavior.fieldname accountcode 
	*/
	public void setAccountcode(String aaccountcode);


	/**
	* getamaflags 
	* Categorization for CDR records. Choices are default, omit, billing, documentation. See Asterisk billing
	* @behavior.fieldname amaflags 
	**/
	public Amaflags getAmaflags();
	
	/**
	*setamaflags 
	* Categorization for CDR records. Choices are default, omit, billing, documentation. See Asterisk billing
	* @behavior.fieldname amaflags 
	*/
	public void setAmaflags(Amaflags aamaflags);


	/**
	* getcallgroup 
	* 
	* @behavior.fieldname callgroup 
	**/
	public String getCallgroup();
	
	/**
	*setcallgroup 
	* 
	* @behavior.fieldname callgroup 
	*/
	public void setCallgroup(String acallgroup);


	/**
	* getcanreinvite 
	* If the client is able to support SIP re-invites
	* @behavior.fieldname canreinvite 
	**/
	public String getCanreinvite();
	
	/**
	*setcanreinvite 
	* If the client is able to support SIP re-invites
	* @behavior.fieldname canreinvite 
	*/
	public void setCanreinvite(String acanreinvite);


	/**
	* getcontext 
	*  Context in the dialplan for outbound calls from this client
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	*  Context in the dialplan for outbound calls from this client
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* getdefaultip 
	* Default IP address of client host= is specified as DYNAMIC. Used if client have not been registred at any other IP adress.
	* @behavior.fieldname defaultip 
	**/
	public String getDefaultip();
	
	/**
	*setdefaultip 
	* Default IP address of client host= is specified as DYNAMIC. Used if client have not been registred at any other IP adress.
	* @behavior.fieldname defaultip 
	*/
	public void setDefaultip(String adefaultip);


	/**
	* getdtmfmode 
	* How the client handles DMTF? signalling
	* @behavior.fieldname dtmfmode 
	**/
	public Dtmfmode getDtmfmode();
	
	/**
	*setdtmfmode 
	* How the client handles DMTF? signalling
	* @behavior.fieldname dtmfmode 
	*/
	public void setDtmfmode(Dtmfmode adtmfmode);


	/**
	* getfromuser 
	* Specify user to put in "from" instead of callerid (overrides the callerid) when placing calls _to_ peer (another SIP proxy)
	* @behavior.fieldname fromuser 
	**/
	public String getFromuser();
	
	/**
	*setfromuser 
	* Specify user to put in "from" instead of callerid (overrides the callerid) when placing calls _to_ peer (another SIP proxy)
	* @behavior.fieldname fromuser 
	*/
	public void setFromuser(String afromuser);


	/**
	* getfromdomain 
	* <domain> Sets default From domain in SIP messages when placing calls _to_ peer
	* @behavior.fieldname fromdomain 
	**/
	public String getFromdomain();
	
	/**
	*setfromdomain 
	* <domain> Sets default From domain in SIP messages when placing calls _to_ peer
	* @behavior.fieldname fromdomain 
	*/
	public void setFromdomain(String afromdomain);


	/**
	* gethost 
	*  How to find the client - IP # or host name. If you want the phone to register itself, use the keyword dynamic instead of Host IP
	* @behavior.fieldname host 
	**/
	public String getHost();
	
	/**
	*sethost 
	*  How to find the client - IP # or host name. If you want the phone to register itself, use the keyword dynamic instead of Host IP
	* @behavior.fieldname host 
	*/
	public void setHost(String ahost);


	/**
	* getincominglimit 
	* Limits for number of simultaneous active calls for a SIP client
	* @behavior.fieldname incominglimit 
	**/
	public Integer getIncominglimit();
	
	/**
	*setincominglimit 
	* Limits for number of simultaneous active calls for a SIP client
	* @behavior.fieldname incominglimit 
	*/
	public void setIncominglimit(Integer aincominglimit);


	/**
	* getoutgoinglimit 
	* Limits for number of simultaneous active calls for a SIP client
	* @behavior.fieldname outgoinglimit 
	**/
	public Integer getOutgoinglimit();
	
	/**
	*setoutgoinglimit 
	* Limits for number of simultaneous active calls for a SIP client
	* @behavior.fieldname outgoinglimit 
	*/
	public void setOutgoinglimit(Integer aoutgoinglimit);


	/**
	* getinsecure 
	* Don't check host ip and port for peer (not user)
	* @behavior.fieldname insecure 
	**/
	public String getInsecure();
	
	/**
	*setinsecure 
	* Don't check host ip and port for peer (not user)
	* @behavior.fieldname insecure 
	*/
	public void setInsecure(String ainsecure);


	/**
	* getlanguage 
	* A language code defined in indications.conf - defines language for prompts and specific local phone signals
	* @behavior.fieldname language 
	**/
	public String getLanguage();
	
	/**
	*setlanguage 
	* A language code defined in indications.conf - defines language for prompts and specific local phone signals
	* @behavior.fieldname language 
	*/
	public void setLanguage(String alanguage);


	/**
	* getmailbox 
	* Voicemail extension (for message waiting indications)
	* @behavior.fieldname mailbox 
	**/
	public String getMailbox();
	
	/**
	*setmailbox 
	* Voicemail extension (for message waiting indications)
	* @behavior.fieldname mailbox 
	*/
	public void setMailbox(String amailbox);


	/**
	* getmd5secret 
	* MD5-Hash of "<user>:asterisk:<secret>" (can be used instead of secret)
	* @behavior.fieldname md5secret 
	**/
	public String getMd5secret();
	
	/**
	*setmd5secret 
	* MD5-Hash of "<user>:asterisk:<secret>" (can be used instead of secret)
	* @behavior.fieldname md5secret 
	*/
	public void setMd5secret(String amd5secret);


	/**
	* getnat 
	* This variable changes the behaviour of Asterisk for clients behind a firewall. This does not solve the problem if Asterisk is behind the firewall and the client on the outside.
	* @behavior.fieldname nat 
	**/
	public Boolean getNat();
	
	/**
	*setnat 
	* This variable changes the behaviour of Asterisk for clients behind a firewall. This does not solve the problem if Asterisk is behind the firewall and the client on the outside.
	* @behavior.fieldname nat 
	*/
	public void setNat(Boolean anat);


	/**
	* getpickupgroup 
	*  Group that can pickup fellow workers' calls using *8 and the Pickup() application on the *8 extension
	* @behavior.fieldname pickupgroup 
	**/
	public String getPickupgroup();
	
	/**
	*setpickupgroup 
	*  Group that can pickup fellow workers' calls using *8 and the Pickup() application on the *8 extension
	* @behavior.fieldname pickupgroup 
	*/
	public void setPickupgroup(String apickupgroup);


	/**
	* getport 
	*  SIP port of the client
	* @behavior.fieldname port 
	**/
	public Integer getPort();
	
	/**
	*setport 
	*  SIP port of the client
	* @behavior.fieldname port 
	*/
	public void setPort(Integer aport);


	/**
	* getqualify 
	* Check if client is reachable
	* @behavior.fieldname qualify 
	**/
	public String getQualify();
	
	/**
	*setqualify 
	* Check if client is reachable
	* @behavior.fieldname qualify 
	*/
	public void setQualify(String aqualify);


	/**
	* getrestrictcid 
	*  (yes/no) To have the callerid restricted -> sent as ANI; use this to hide the caller ID
	* @behavior.fieldname restrictcid 
	**/
	public Boolean getRestrictcid();
	
	/**
	*setrestrictcid 
	*  (yes/no) To have the callerid restricted -> sent as ANI; use this to hide the caller ID
	* @behavior.fieldname restrictcid 
	*/
	public void setRestrictcid(Boolean arestrictcid);


	/**
	* getrtptimeout 
	* Terminate call if x seconds of no RTP activity when we're not on hold
	* @behavior.fieldname rtptimeout 
	**/
	public Integer getRtptimeout();
	
	/**
	*setrtptimeout 
	* Terminate call if x seconds of no RTP activity when we're not on hold
	* @behavior.fieldname rtptimeout 
	*/
	public void setRtptimeout(Integer artptimeout);


	/**
	* getrtpholdtimeout 
	* Terminate call if x seconds of no RTP activity when we're on hold (must be larger than rtptimeout)
	* @behavior.fieldname rtpholdtimeout 
	**/
	public Integer getRtpholdtimeout();
	
	/**
	*setrtpholdtimeout 
	* Terminate call if x seconds of no RTP activity when we're on hold (must be larger than rtptimeout)
	* @behavior.fieldname rtpholdtimeout 
	*/
	public void setRtpholdtimeout(Integer artpholdtimeout);


	/**
	* getsecret 
	*  If Asterisk is acting as a SIP Server, then this SIP client must login with this Password (A shared secret). If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server.
	* @behavior.fieldname secret 
	**/
	public String getSecret();
	
	/**
	*setsecret 
	*  If Asterisk is acting as a SIP Server, then this SIP client must login with this Password (A shared secret). If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server.
	* @behavior.fieldname secret 
	*/
	public void setSecret(String asecret);


	/**
	* gettype 
	* Relationship to client - outbound provider or full client?
	* @behavior.fieldname type 
	**/
	public PeerType getType();
	
	/**
	*settype 
	* Relationship to client - outbound provider or full client?
	* @behavior.fieldname type 
	*/
	public void setType(PeerType atype);


	/**
	* getusername 
	* If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server. Also, for peers that register with Asterisk, this username is used in INVITEs until we have a registration.
	* @behavior.fieldname username 
	**/
	public String getUsername();
	
	/**
	*setusername 
	* If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server. Also, for peers that register with Asterisk, this username is used in INVITEs until we have a registration.
	* @behavior.fieldname username 
	*/
	public void setUsername(String ausername);


	/**
	* getmusiconhold 
	* Set class of musiconhold on calls from SIP phone. Calls to the phone require SetMusicOnHold cmd of higher priority (lower numerical value of priority) than Dial cmd in dialplan in order to set this class for the call. Calls have the MusicOnHold class set on a per call basis, not on a per phone basis, and making a call through any extension specifying SetMusicOnHold will override this value for the call.
	* @behavior.fieldname musiconhold 
	**/
	public String getMusiconhold();
	
	/**
	*setmusiconhold 
	* Set class of musiconhold on calls from SIP phone. Calls to the phone require SetMusicOnHold cmd of higher priority (lower numerical value of priority) than Dial cmd in dialplan in order to set this class for the call. Calls have the MusicOnHold class set on a per call basis, not on a per phone basis, and making a call through any extension specifying SetMusicOnHold will override this value for the call.
	* @behavior.fieldname musiconhold 
	*/
	public void setMusiconhold(String amusiconhold);


	/**
	* getcallerid 
	* the callerid
	* @behavior.fieldname callerid 
	**/
	public String getCallerid();
	
	/**
	*setcallerid 
	* the callerid
	* @behavior.fieldname callerid 
	*/
	public void setCallerid(String acallerid);


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


}