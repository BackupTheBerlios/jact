

package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;


/**
 * <p>
 * IIaxpeer<br>
 *  Further user sections may be added, specifying a context and a secret used for connections with that given authentication name. Limited IP based access control is allowed by use of "allow" and "deny" keywords.  Multiple rules are permitted.  Multiple permitted contexts may be specified, in which case the first will be the default. You can also override caller*ID so that when you receive a call you set the Caller*ID to be what you want instead of trusting what the remote user provides There are three authentication methods that are supported:  md5, plaintext, and rsa.  The least secure is "plaintext", which sends passwords cleartext across the net.  "md5" uses a challenge/response md5 sum arrangement, but still requires both ends have plain text access to the secret.  "rsa" allows unidirectional secret knowledge through public/private keys.  If "rsa" authentication is used, "inkeys" is a list of acceptable public keys on the  local system that can be used to authenticate the remote peer, separated by the ":" character.  "outkey" is a single, private key to use to authenticate to the other side.  Public keys are named /var/lib/asterisk/keys/<name>.pub while private keys are named /var/lib/asterisk/keys/<name>.key.  Private keys should always be 3DES encrypted.
 * </p>
 * Created : Fri May 26 14:30:29 CEST 2006
 * 
 * @behavior.elementname Iaxpeer
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIaxpeer.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  interface  IIaxpeer {
public static final String MODELNAME = "Iaxpeer";	

/**
 * gibt die List<Iaxdeny> iaxdenyMap zurück	
 * @return List<Iaxdeny>
 * @behavior.list IaxdenyMap 
 * @behavior.list.type Iaxdeny 
 */
public List getIaxdenyMap();
/**
 * setzt die Map IaxdenyMap
 * @param map iaxdenyMapMap
 * @behavior.list IaxdenyMap 
 * @behavior.list.type Iaxdeny 
 */
public void setIaxdenyMap(List aList);

/**
 * gibt die List<Iaxpermit> iaxpermitMap zurück	
 * @return List<Iaxpermit>
 * @behavior.list IaxpermitMap 
 * @behavior.list.type Iaxpermit 
 */
public List getIaxpermitMap();
/**
 * setzt die Map IaxpermitMap
 * @param map iaxpermitMapMap
 * @behavior.list IaxpermitMap 
 * @behavior.list.type Iaxpermit 
 */
public void setIaxpermitMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_IAXPEERNAME="iaxpeername" ;
// 	public static final String VALUEID_PEERTYPE="peertype" ;
// 	public static final String VALUEID_CALLERID="callerid" ;
// 	public static final String VALUEID_AUTH="auth" ;
// 	public static final String VALUEID_SECRET="secret" ;
// 	public static final String VALUEID_INKEYS="inkeys" ;
// 	public static final String VALUEID_HOST="host" ;
// 	public static final String VALUEID_DEFAULTIP="defaultip" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_DBSECRET="dbsecret" ;
// 	public static final String VALUEID_SETVAR="setvar" ;
// 	public static final String VALUEID_PEERCONTEXT="peercontext" ;
// 	public static final String VALUEID_QUALIFY="qualify" ;
// 	public static final String VALUEID_TRUNK="trunk" ;
// 	public static final String VALUEID_TIMEZONE="timezone" ;
// 	public static final String VALUEID_REGEXTEN="regexten" ;
// 	public static final String VALUEID_DISALLOW="disallow" ;
// 	public static final String VALUEID_ALLOW="allow" ;
// 	public static final String VALUEID_MAILBOX="mailbox" ;
// 	public static final String VALUEID_ACCOUNTCODE="accountcode" ;
// 	public static final String VALUEID_OUTKEY="outkey" ;
// 	public static final String VALUEID_NOTRANSFER="notransfer" ;
// 	public static final String VALUEID_QUALIFYSMOOTHING="qualifysmoothing" ;
// 	public static final String VALUEID_QUALIFYFREQOK="qualifyfreqok" ;
// 	public static final String VALUEID_QUALIFYFREQNOTOK="qualifyfreqnotok" ;
	
	//---------  getter und setter

	/**
	* getiaxpeername 
	* The peer name.
	* @behavior.fieldname iaxpeername 
	**/
	public String getIaxpeername();
	
	/**
	*setiaxpeername 
	* The peer name.
	* @behavior.fieldname iaxpeername 
	*/
	public void setIaxpeername(String aiaxpeername);


	/**
	* getpeertype 
	*  [user|peer|friend]: This line tells Asterisk how to interpret this entity. Users are things
	* @behavior.fieldname peertype 
	**/
	public PeerType getPeertype();
	
	/**
	*setpeertype 
	*  [user|peer|friend]: This line tells Asterisk how to interpret this entity. Users are things
	* @behavior.fieldname peertype 
	*/
	public void setPeertype(PeerType apeertype);


	/**
	* getcallerid 
	* <callerid>: You may override the Caller*ID information passed by a user to you (if they choose to send it) in order that it always be accurate from the perspective of your server.
	* @behavior.fieldname callerid 
	**/
	public String getCallerid();
	
	/**
	*setcallerid 
	* <callerid>: You may override the Caller*ID information passed by a user to you (if they choose to send it) in order that it always be accurate from the perspective of your server.
	* @behavior.fieldname callerid 
	*/
	public void setCallerid(String acallerid);


	/**
	* getauth 
	*  [md5|plaintext|rsa]: You may select which authentication methods are permitted to be used by the user to authenticate to us. Multiple methods may be specified, separated by commas. If md5 or plaintext authentication is selected, a secret must be provided. If RSA authentication is specified, then one or more key names must be specifed with "inkeys" If no secret is specified and no authentication method is specified, then no authentication will be required.
	* @behavior.fieldname auth 
	**/
	public String getAuth();
	
	/**
	*setauth 
	*  [md5|plaintext|rsa]: You may select which authentication methods are permitted to be used by the user to authenticate to us. Multiple methods may be specified, separated by commas. If md5 or plaintext authentication is selected, a secret must be provided. If RSA authentication is specified, then one or more key names must be specifed with "inkeys" If no secret is specified and no authentication method is specified, then no authentication will be required.
	* @behavior.fieldname auth 
	*/
	public void setAuth(String aauth);


	/**
	* getsecret 
	* <secret>: The "secret" line specifies the shared secret for md5 and plaintext authentication methods. It is never suggested to use plaintext except in some cases for debugging.
	* @behavior.fieldname secret 
	**/
	public String getSecret();
	
	/**
	*setsecret 
	* <secret>: The "secret" line specifies the shared secret for md5 and plaintext authentication methods. It is never suggested to use plaintext except in some cases for debugging.
	* @behavior.fieldname secret 
	*/
	public void setSecret(String asecret);


	/**
	* getinkeys 
	*  key1[:key2...]: The "inkeys" line specifies which keys we can use to authenticate the remote peer. If the peer's challenge passes with any of the given keys, then we accept its authentication. The key files live in /var/lib/asterisk/keys/<name>.pub and are *public keys*. Public keys are not typically DES3 encrypted and thus do not usually need initialization.
	* @behavior.fieldname inkeys 
	**/
	public String getInkeys();
	
	/**
	*setinkeys 
	*  key1[:key2...]: The "inkeys" line specifies which keys we can use to authenticate the remote peer. If the peer's challenge passes with any of the given keys, then we accept its authentication. The key files live in /var/lib/asterisk/keys/<name>.pub and are *public keys*. Public keys are not typically DES3 encrypted and thus do not usually need initialization.
	* @behavior.fieldname inkeys 
	*/
	public void setInkeys(String ainkeys);


	/**
	* gethost 
	* Sets the expected outgoing host for this client. Can be set to an ip address or dynamic, which will allow incoming connections from any host (that is not explicitly denied.)
	* @behavior.fieldname host 
	**/
	public String getHost();
	
	/**
	*sethost 
	* Sets the expected outgoing host for this client. Can be set to an ip address or dynamic, which will allow incoming connections from any host (that is not explicitly denied.)
	* @behavior.fieldname host 
	*/
	public void setHost(String ahost);


	/**
	* getdefaultip 
	* The default IP address for an IAX client. This field is consulted if Asterisk receives a call for an IAX client that is dynamic and has not registered to let Asterisk know the current IP address. Takes as itís argument an IP address.
	* @behavior.fieldname defaultip 
	**/
	public String getDefaultip();
	
	/**
	*setdefaultip 
	* The default IP address for an IAX client. This field is consulted if Asterisk receives a call for an IAX client that is dynamic and has not registered to let Asterisk know the current IP address. Takes as itís argument an IP address.
	* @behavior.fieldname defaultip 
	*/
	public void setDefaultip(String adefaultip);


	/**
	* getcontext 
	* When used within a client definition, this keyword overrides the default incoming context set in the general section for the user only.
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* When used within a client definition, this keyword overrides the default incoming context set in the general section for the user only.
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* getdbsecret 
	* Secrets can be stored in astdb, too (mysecrets/place)
	* @behavior.fieldname dbsecret 
	**/
	public String getDbsecret();
	
	/**
	*setdbsecret 
	* Secrets can be stored in astdb, too (mysecrets/place)
	* @behavior.fieldname dbsecret 
	*/
	public void setDbsecret(String adbsecret);


	/**
	* getsetvar 
	* 
	* @behavior.fieldname setvar 
	**/
	public String getSetvar();
	
	/**
	*setsetvar 
	* 
	* @behavior.fieldname setvar 
	*/
	public void setSetvar(String asetvar);


	/**
	* getpeercontext 
	* Default context to request for calls to peer
	* @behavior.fieldname peercontext 
	**/
	public PbxContext getPeercontext();
	
	/**
	*setpeercontext 
	* Default context to request for calls to peer
	* @behavior.fieldname peercontext 
	*/
	public void setPeercontext(PbxContext apeercontext);


	/**
	* getqualify 
	* Tells Asterisk whether to test whether the peer is alive before attempting to connect the call. If set to yes Asterisk will periodically contact the peer before forwarding any call information. The argument specified is the maximum number of milliseconds that a peer can take to respond before it is considered unavailable.
	* @behavior.fieldname qualify 
	**/
	public Integer getQualify();
	
	/**
	*setqualify 
	* Tells Asterisk whether to test whether the peer is alive before attempting to connect the call. If set to yes Asterisk will periodically contact the peer before forwarding any call information. The argument specified is the maximum number of milliseconds that a peer can take to respond before it is considered unavailable.
	* @behavior.fieldname qualify 
	*/
	public void setQualify(Integer aqualify);


	/**
	* gettrunk 
	* Enables or disables trunking for a given user or peer. Trunk mode is a more efficient method of operating IAX if there are typically many calls running on the link. Trunk mode requires having a Zaptel interface in the Asterisk server.
	* @behavior.fieldname trunk 
	**/
	public Boolean getTrunk();
	
	/**
	*settrunk 
	* Enables or disables trunking for a given user or peer. Trunk mode is a more efficient method of operating IAX if there are typically many calls running on the link. Trunk mode requires having a Zaptel interface in the Asterisk server.
	* @behavior.fieldname trunk 
	*/
	public void setTrunk(Boolean atrunk);


	/**
	* gettimezone 
	* Set a timezone for the date/time IE
	* @behavior.fieldname timezone 
	**/
	public String getTimezone();
	
	/**
	*settimezone 
	* Set a timezone for the date/time IE
	* @behavior.fieldname timezone 
	*/
	public void setTimezone(String atimezone);


	/**
	* getregexten 
	* 
	* @behavior.fieldname regexten 
	**/
	public String getRegexten();
	
	/**
	*setregexten 
	* 
	* @behavior.fieldname regexten 
	*/
	public void setRegexten(String aregexten);


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
	* getmailbox 
	* Provides a mailbox to associate with a given peer, so that when it registers it can be notified of any pending messages waiting.
	* @behavior.fieldname mailbox 
	**/
	public String getMailbox();
	
	/**
	*setmailbox 
	* Provides a mailbox to associate with a given peer, so that when it registers it can be notified of any pending messages waiting.
	* @behavior.fieldname mailbox 
	*/
	public void setMailbox(String amailbox);


	/**
	* getaccountcode 
	* When used within a client definition, sets the account code for that client only. This is used by the call logging service.
	* @behavior.fieldname accountcode 
	**/
	public String getAccountcode();
	
	/**
	*setaccountcode 
	* When used within a client definition, sets the account code for that client only. This is used by the call logging service.
	* @behavior.fieldname accountcode 
	*/
	public void setAccountcode(String aaccountcode);


	/**
	* getoutkey 
	* The private key to encrypt outgoing authentication communication for this client.
	* @behavior.fieldname outkey 
	**/
	public String getOutkey();
	
	/**
	*setoutkey 
	* The private key to encrypt outgoing authentication communication for this client.
	* @behavior.fieldname outkey 
	*/
	public void setOutkey(String aoutkey);


	/**
	* getnotransfer 
	* Disable IAX native transfer.
	* @behavior.fieldname notransfer 
	**/
	public Boolean getNotransfer();
	
	/**
	*setnotransfer 
	* Disable IAX native transfer.
	* @behavior.fieldname notransfer 
	*/
	public void setNotransfer(Boolean anotransfer);


	/**
	* getqualifysmoothing 
	* use an average of the last two PONG results to reduce falsly detected LAGGED hosts Default: Off
	* @behavior.fieldname qualifysmoothing 
	**/
	public Boolean getQualifysmoothing();
	
	/**
	*setqualifysmoothing 
	* use an average of the last two PONG results to reduce falsly detected LAGGED hosts Default: Off
	* @behavior.fieldname qualifysmoothing 
	*/
	public void setQualifysmoothing(Boolean aqualifysmoothing);


	/**
	* getqualifyfreqok 
	* how frequently to ping the peer when everything seems to be ok, in milliseconds
	* @behavior.fieldname qualifyfreqok 
	**/
	public Integer getQualifyfreqok();
	
	/**
	*setqualifyfreqok 
	* how frequently to ping the peer when everything seems to be ok, in milliseconds
	* @behavior.fieldname qualifyfreqok 
	*/
	public void setQualifyfreqok(Integer aqualifyfreqok);


	/**
	* getqualifyfreqnotok 
	* how frequently to ping the peer when it's either LAGGED or UNAVAILABLE, in milliseconds
	* @behavior.fieldname qualifyfreqnotok 
	**/
	public Integer getQualifyfreqnotok();
	
	/**
	*setqualifyfreqnotok 
	* how frequently to ping the peer when it's either LAGGED or UNAVAILABLE, in milliseconds
	* @behavior.fieldname qualifyfreqnotok 
	*/
	public void setQualifyfreqnotok(Integer aqualifyfreqnotok);


}