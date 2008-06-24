package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;


/**
 * <p>
 * Iaxpeer<br>
 *  Further user sections may be added, specifying a context and a secret used for connections with that given authentication name. Limited IP based access control is allowed by use of "allow" and "deny" keywords.  Multiple rules are permitted.  Multiple permitted contexts may be specified, in which case the first will be the default. You can also override caller*ID so that when you receive a call you set the Caller*ID to be what you want instead of trusting what the remote user provides There are three authentication methods that are supported:  md5, plaintext, and rsa.  The least secure is "plaintext", which sends passwords cleartext across the net.  "md5" uses a challenge/response md5 sum arrangement, but still requires both ends have plain text access to the secret.  "rsa" allows unidirectional secret knowledge through public/private keys.  If "rsa" authentication is used, "inkeys" is a list of acceptable public keys on the  local system that can be used to authenticate the remote peer, separated by the ":" character.  "outkey" is a single, private key to use to authenticate to the other side.  Public keys are named /var/lib/asterisk/keys/<name>.pub while private keys are named /var/lib/asterisk/keys/<name>.key.  Private keys should always be 3DES encrypted.
 * </p>
 * Created : Fri May 26 14:31:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Iaxpeer.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  class Iaxpeer extends AbstractSimpleDataClass implements IIaxpeer{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Iaxpeer
	**/
	public Iaxpeer(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Iaxpeer
	**/
	public Iaxpeer( String aiaxpeername, PeerType apeertype, String acallerid, String aauth, String asecret, String ainkeys, String ahost, String adefaultip, PbxContext acontext, String adbsecret, String asetvar, PbxContext apeercontext, Integer aqualify, Boolean atrunk, String atimezone, String aregexten, CodecsSet adisallow, CodecsSet aallow, String amailbox, String aaccountcode, String aoutkey, Boolean anotransfer, Boolean aqualifysmoothing, Integer aqualifyfreqok, Integer aqualifyfreqnotok){
		super();
	
		this.iaxpeername = aiaxpeername;	
		this.peertype = apeertype;	
		this.callerid = acallerid;	
		this.auth = aauth;	
		this.secret = asecret;	
		this.inkeys = ainkeys;	
		this.host = ahost;	
		this.defaultip = adefaultip;	
		this.context = acontext;	
		this.dbsecret = adbsecret;	
		this.setvar = asetvar;	
		this.peercontext = apeercontext;	
		this.qualify = aqualify;	
		this.trunk = atrunk;	
		this.timezone = atimezone;	
		this.regexten = aregexten;	
		this.disallow = adisallow;	
		this.allow = aallow;	
		this.mailbox = amailbox;	
		this.accountcode = aaccountcode;	
		this.outkey = aoutkey;	
		this.notransfer = anotransfer;	
		this.qualifysmoothing = aqualifysmoothing;	
		this.qualifyfreqok = aqualifyfreqok;	
		this.qualifyfreqnotok = aqualifyfreqnotok;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Iaxpeer object){
		this.iaxpeername = object.iaxpeername;	
		this.peertype = object.peertype;	
		this.callerid = object.callerid;	
		this.auth = object.auth;	
		this.secret = object.secret;	
		this.inkeys = object.inkeys;	
		this.host = object.host;	
		this.defaultip = object.defaultip;	
		this.context = object.context;	
		this.dbsecret = object.dbsecret;	
		this.setvar = object.setvar;	
		this.peercontext = object.peercontext;	
		this.qualify = object.qualify;	
		this.trunk = object.trunk;	
		this.timezone = object.timezone;	
		this.regexten = object.regexten;	
		this.disallow = object.disallow;	
		this.allow = object.allow;	
		this.mailbox = object.mailbox;	
		this.accountcode = object.accountcode;	
		this.outkey = object.outkey;	
		this.notransfer = object.notransfer;	
		this.qualifysmoothing = object.qualifysmoothing;	
		this.qualifyfreqok = object.qualifyfreqok;	
		this.qualifyfreqnotok = object.qualifyfreqnotok;	

	}
//--------------  map Funktionen
	//public static final String IAXDENYMAP = "iaxdenyMap";
	/** die typisierte List die die Aggregierten objekte(IaxdenyImpl) enthält */
	protected List<Iaxdeny> iaxdenyMap = new ArrayList<Iaxdeny>();
	//public static final String IAXPERMITMAP = "iaxpermitMap";
	/** die typisierte List die die Aggregierten objekte(IaxpermitImpl) enthält */
	protected List<Iaxpermit> iaxpermitMap = new ArrayList<Iaxpermit>();
	/** die typisierte Map die die Aggregierten objekte(IaxdenyImpl) enthält */
	//protected IaxdenyMap iaxdenyMapMap = new IaxdenyMap();
	/** die typisierte Map die die Aggregierten objekte(IaxpermitImpl) enthält */
	//protected IaxpermitMap iaxpermitMapMap = new IaxpermitMap();

	/**
	 * fügt ein Iaxdeny Objekt zu der Mapp hinzu
	 * @param aIaxdeny
	 */
	public boolean addIaxdeny(Iaxdeny aIaxdeny){
		return iaxdenyMap.add(aIaxdeny);
	}

	/**
	 * removed ein Iaxdeny Objekt aus der Map
	 * @param aIaxdeny
	 */
	public boolean removeIaxdeny(Iaxdeny aIaxdeny){
		return iaxdenyMap.remove(aIaxdeny);
	}


	/**
	 * fügt ein Iaxpermit Objekt zu der Mapp hinzu
	 * @param aIaxpermit
	 */
	public boolean addIaxpermit(Iaxpermit aIaxpermit){
		return iaxpermitMap.add(aIaxpermit);
	}

	/**
	 * removed ein Iaxpermit Objekt aus der Map
	 * @param aIaxpermit
	 */
	public boolean removeIaxpermit(Iaxpermit aIaxpermit){
		return iaxpermitMap.remove(aIaxpermit);
	}

	

/**
 * gibt die List<Iaxdeny> iaxdenyMap zurück	
 * @return List<Iaxdeny>
 * @see  IIaxpeer#getIaxdenyMap
 */
public List<Iaxdeny> getIaxdenyMap() {
	return iaxdenyMap;
}
/**
 * setzt die Map IaxdenyMap
 * @param map iaxdenyMapMap
 */
 @SuppressWarnings("unchecked")
public void setIaxdenyMap(List aList){
    iaxdenyMap = aList;
   // iaxdenyMapTyper.setList(aList); 
}


/**
 * gibt die List<Iaxpermit> iaxpermitMap zurück	
 * @return List<Iaxpermit>
 * @see  IIaxpeer#getIaxpermitMap
 */
public List<Iaxpermit> getIaxpermitMap() {
	return iaxpermitMap;
}
/**
 * setzt die Map IaxpermitMap
 * @param map iaxpermitMapMap
 */
 @SuppressWarnings("unchecked")
public void setIaxpermitMap(List aList){
    iaxpermitMap = aList;
   // iaxpermitMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  The peer name. **/
	protected String iaxpeername;
	public static final String VALUEID_IAXPEERNAME="iaxpeername" ;

    /**   [user|peer|friend]: This line tells Asterisk how to interpret this entity. Users are things **/
	protected PeerType peertype;
	public static final String VALUEID_PEERTYPE="peertype" ;

    /**  <callerid>: You may override the Caller*ID information passed by a user to you (if they choose to send it) in order that it always be accurate from the perspective of your server. **/
	protected String callerid;
	public static final String VALUEID_CALLERID="callerid" ;

    /**   [md5|plaintext|rsa]: You may select which authentication methods are permitted to be used by the user to authenticate to us. Multiple methods may be specified, separated by commas. If md5 or plaintext authentication is selected, a secret must be provided. If RSA authentication is specified, then one or more key names must be specifed with "inkeys" If no secret is specified and no authentication method is specified, then no authentication will be required. **/
	protected String auth;
	public static final String VALUEID_AUTH="auth" ;

    /**  <secret>: The "secret" line specifies the shared secret for md5 and plaintext authentication methods. It is never suggested to use plaintext except in some cases for debugging. **/
	protected String secret;
	public static final String VALUEID_SECRET="secret" ;

    /**   key1[:key2...]: The "inkeys" line specifies which keys we can use to authenticate the remote peer. If the peer's challenge passes with any of the given keys, then we accept its authentication. The key files live in /var/lib/asterisk/keys/<name>.pub and are *public keys*. Public keys are not typically DES3 encrypted and thus do not usually need initialization. **/
	protected String inkeys;
	public static final String VALUEID_INKEYS="inkeys" ;

    /**  Sets the expected outgoing host for this client. Can be set to an ip address or dynamic, which will allow incoming connections from any host (that is not explicitly denied.) **/
	protected String host;
	public static final String VALUEID_HOST="host" ;

    /**  The default IP address for an IAX client. This field is consulted if Asterisk receives a call for an IAX client that is dynamic and has not registered to let Asterisk know the current IP address. Takes as itís argument an IP address. **/
	protected String defaultip;
	public static final String VALUEID_DEFAULTIP="defaultip" ;

    /**  When used within a client definition, this keyword overrides the default incoming context set in the general section for the user only. **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  Secrets can be stored in astdb, too (mysecrets/place) **/
	protected String dbsecret;
	public static final String VALUEID_DBSECRET="dbsecret" ;

    /**   **/
	protected String setvar;
	public static final String VALUEID_SETVAR="setvar" ;

    /**  Default context to request for calls to peer **/
	protected PbxContext peercontext;
	public static final String VALUEID_PEERCONTEXT="peercontext" ;

    /**  Tells Asterisk whether to test whether the peer is alive before attempting to connect the call. If set to yes Asterisk will periodically contact the peer before forwarding any call information. The argument specified is the maximum number of milliseconds that a peer can take to respond before it is considered unavailable. **/
	protected Integer qualify;
	public static final String VALUEID_QUALIFY="qualify" ;

    /**  Enables or disables trunking for a given user or peer. Trunk mode is a more efficient method of operating IAX if there are typically many calls running on the link. Trunk mode requires having a Zaptel interface in the Asterisk server. **/
	protected Boolean trunk;
	public static final String VALUEID_TRUNK="trunk" ;

    /**  Set a timezone for the date/time IE **/
	protected String timezone;
	public static final String VALUEID_TIMEZONE="timezone" ;

    /**   **/
	protected String regexten;
	public static final String VALUEID_REGEXTEN="regexten" ;

    /**  all :Disallow all codecs (global configuration) **/
	protected CodecsSet disallow;
	public static final String VALUEID_DISALLOW="disallow" ;

    /**  Allow codecs in order of preference (Use DISALLOW=ALL first, before allowing other codecs) **/
	protected CodecsSet allow;
	public static final String VALUEID_ALLOW="allow" ;

    /**  Provides a mailbox to associate with a given peer, so that when it registers it can be notified of any pending messages waiting. **/
	protected String mailbox;
	public static final String VALUEID_MAILBOX="mailbox" ;

    /**  When used within a client definition, sets the account code for that client only. This is used by the call logging service. **/
	protected String accountcode;
	public static final String VALUEID_ACCOUNTCODE="accountcode" ;

    /**  The private key to encrypt outgoing authentication communication for this client. **/
	protected String outkey;
	public static final String VALUEID_OUTKEY="outkey" ;

    /**  Disable IAX native transfer. **/
	protected Boolean notransfer;
	public static final String VALUEID_NOTRANSFER="notransfer" ;

    /**  use an average of the last two PONG results to reduce falsly detected LAGGED hosts Default: Off **/
	protected Boolean qualifysmoothing;
	public static final String VALUEID_QUALIFYSMOOTHING="qualifysmoothing" ;

    /**  how frequently to ping the peer when everything seems to be ok, in milliseconds **/
	protected Integer qualifyfreqok;
	public static final String VALUEID_QUALIFYFREQOK="qualifyfreqok" ;

    /**  how frequently to ping the peer when it's either LAGGED or UNAVAILABLE, in milliseconds **/
	protected Integer qualifyfreqnotok;
	public static final String VALUEID_QUALIFYFREQNOTOK="qualifyfreqnotok" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_IAXPEERNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_PEERTYPE.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLERID.equals(valueid)){
			return true;
		}
		if(VALUEID_AUTH.equals(valueid)){
			return true;
		}
		if(VALUEID_SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_INKEYS.equals(valueid)){
			return true;
		}
		if(VALUEID_HOST.equals(valueid)){
			return true;
		}
		if(VALUEID_DEFAULTIP.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_DBSECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_SETVAR.equals(valueid)){
			return true;
		}
		if(VALUEID_PEERCONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_QUALIFY.equals(valueid)){
			return true;
		}
		if(VALUEID_TRUNK.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEZONE.equals(valueid)){
			return true;
		}
		if(VALUEID_REGEXTEN.equals(valueid)){
			return true;
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return true;
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return true;
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			return true;
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return true;
		}
		if(VALUEID_OUTKEY.equals(valueid)){
			return true;
		}
		if(VALUEID_NOTRANSFER.equals(valueid)){
			return true;
		}
		if(VALUEID_QUALIFYSMOOTHING.equals(valueid)){
			return true;
		}
		if(VALUEID_QUALIFYFREQOK.equals(valueid)){
			return true;
		}
		if(VALUEID_QUALIFYFREQNOTOK.equals(valueid)){
			return true;
		}
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
		if(VALUEID_IAXPEERNAME.equals(valueid)){
			setIaxpeername((String)data);
			return;
		}
		if(VALUEID_PEERTYPE.equals(valueid)){
			if(data instanceof String){
		        setPeertype(new PeerType((String)data));
		        return;
		    }
			setPeertype((PeerType)data);
			return;
		}
		if(VALUEID_CALLERID.equals(valueid)){
			setCallerid((String)data);
			return;
		}
		if(VALUEID_AUTH.equals(valueid)){
			setAuth((String)data);
			return;
		}
		if(VALUEID_SECRET.equals(valueid)){
			setSecret((String)data);
			return;
		}
		if(VALUEID_INKEYS.equals(valueid)){
			setInkeys((String)data);
			return;
		}
		if(VALUEID_HOST.equals(valueid)){
			setHost((String)data);
			return;
		}
		if(VALUEID_DEFAULTIP.equals(valueid)){
			setDefaultip((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			if(data instanceof String){
		        setContext(new PbxContext((String)data));
		        return;
		    }
			setContext((PbxContext)data);
			return;
		}
		if(VALUEID_DBSECRET.equals(valueid)){
			setDbsecret((String)data);
			return;
		}
		if(VALUEID_SETVAR.equals(valueid)){
			setSetvar((String)data);
			return;
		}
		if(VALUEID_PEERCONTEXT.equals(valueid)){
			if(data instanceof String){
		        setPeercontext(new PbxContext((String)data));
		        return;
		    }
			setPeercontext((PbxContext)data);
			return;
		}
		if(VALUEID_QUALIFY.equals(valueid)){
			if(data instanceof String){
		        setQualify(new Integer((String)data));
		        return;
		    }
			setQualify((Integer)data);
			return;
		}
		if(VALUEID_TRUNK.equals(valueid)){
			if(data instanceof String){
		        setTrunk(new Boolean((String)data));
		        return;
		    }
			setTrunk((Boolean)data);
			return;
		}
		if(VALUEID_TIMEZONE.equals(valueid)){
			setTimezone((String)data);
			return;
		}
		if(VALUEID_REGEXTEN.equals(valueid)){
			setRegexten((String)data);
			return;
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			if(data instanceof String){
		        setDisallow(new CodecsSet((String)data));
		        return;
		    }
			setDisallow((CodecsSet)data);
			return;
		}
		if(VALUEID_ALLOW.equals(valueid)){
			if(data instanceof String){
		        setAllow(new CodecsSet((String)data));
		        return;
		    }
			setAllow((CodecsSet)data);
			return;
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			setMailbox((String)data);
			return;
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			setAccountcode((String)data);
			return;
		}
		if(VALUEID_OUTKEY.equals(valueid)){
			setOutkey((String)data);
			return;
		}
		if(VALUEID_NOTRANSFER.equals(valueid)){
			if(data instanceof String){
		        setNotransfer(new Boolean((String)data));
		        return;
		    }
			setNotransfer((Boolean)data);
			return;
		}
		if(VALUEID_QUALIFYSMOOTHING.equals(valueid)){
			if(data instanceof String){
		        setQualifysmoothing(new Boolean((String)data));
		        return;
		    }
			setQualifysmoothing((Boolean)data);
			return;
		}
		if(VALUEID_QUALIFYFREQOK.equals(valueid)){
			if(data instanceof String){
		        setQualifyfreqok(new Integer((String)data));
		        return;
		    }
			setQualifyfreqok((Integer)data);
			return;
		}
		if(VALUEID_QUALIFYFREQNOTOK.equals(valueid)){
			if(data instanceof String){
		        setQualifyfreqnotok(new Integer((String)data));
		        return;
		    }
			setQualifyfreqnotok((Integer)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_IAXPEERNAME.equals(valueid)){
			return getIaxpeername();
			
		}
		if(VALUEID_PEERTYPE.equals(valueid)){
			return getPeertype();
			
		}
		if(VALUEID_CALLERID.equals(valueid)){
			return getCallerid();
			
		}
		if(VALUEID_AUTH.equals(valueid)){
			return getAuth();
			
		}
		if(VALUEID_SECRET.equals(valueid)){
			return getSecret();
			
		}
		if(VALUEID_INKEYS.equals(valueid)){
			return getInkeys();
			
		}
		if(VALUEID_HOST.equals(valueid)){
			return getHost();
			
		}
		if(VALUEID_DEFAULTIP.equals(valueid)){
			return getDefaultip();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_DBSECRET.equals(valueid)){
			return getDbsecret();
			
		}
		if(VALUEID_SETVAR.equals(valueid)){
			return getSetvar();
			
		}
		if(VALUEID_PEERCONTEXT.equals(valueid)){
			return getPeercontext();
			
		}
		if(VALUEID_QUALIFY.equals(valueid)){
			return getQualify();
			
		}
		if(VALUEID_TRUNK.equals(valueid)){
			return getTrunk();
			
		}
		if(VALUEID_TIMEZONE.equals(valueid)){
			return getTimezone();
			
		}
		if(VALUEID_REGEXTEN.equals(valueid)){
			return getRegexten();
			
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return getDisallow();
			
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return getAllow();
			
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			return getMailbox();
			
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return getAccountcode();
			
		}
		if(VALUEID_OUTKEY.equals(valueid)){
			return getOutkey();
			
		}
		if(VALUEID_NOTRANSFER.equals(valueid)){
			return getNotransfer();
			
		}
		if(VALUEID_QUALIFYSMOOTHING.equals(valueid)){
			return getQualifysmoothing();
			
		}
		if(VALUEID_QUALIFYFREQOK.equals(valueid)){
			return getQualifyfreqok();
			
		}
		if(VALUEID_QUALIFYFREQNOTOK.equals(valueid)){
			return getQualifyfreqnotok();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getiaxpeername 
	* The peer name.
	**/
	public String getIaxpeername(){		return  iaxpeername;
	}
	/**
	*setiaxpeername 
	*/
	public void setIaxpeername(String aiaxpeername){
		if(aiaxpeername==null){
		    changed = (this.iaxpeername!=null);
		    this.iaxpeername = null;	    
		}else{
			changed = aiaxpeername.equals(this.iaxpeername);
			this.iaxpeername=aiaxpeername;
		}
	}


	/**
	* getpeertype 
	*  [user|peer|friend]: This line tells Asterisk how to interpret this entity. Users are things
	**/
	public PeerType getPeertype(){		return  peertype;
	}
	/**
	*setpeertype 
	*/
	public void setPeertype(PeerType apeertype){
		if(apeertype==null){
		    changed = (this.peertype!=null);
		    this.peertype = null;	    
		}else{
			changed = apeertype.equals(this.peertype);
			this.peertype=apeertype;
		}
	}


	/**
	* getcallerid 
	* <callerid>: You may override the Caller*ID information passed by a user to you (if they choose to send it) in order that it always be accurate from the perspective of your server.
	**/
	public String getCallerid(){		return  callerid;
	}
	/**
	*setcallerid 
	*/
	public void setCallerid(String acallerid){
		if(acallerid==null){
		    changed = (this.callerid!=null);
		    this.callerid = null;	    
		}else{
			changed = acallerid.equals(this.callerid);
			this.callerid=acallerid;
		}
	}


	/**
	* getauth 
	*  [md5|plaintext|rsa]: You may select which authentication methods are permitted to be used by the user to authenticate to us. Multiple methods may be specified, separated by commas. If md5 or plaintext authentication is selected, a secret must be provided. If RSA authentication is specified, then one or more key names must be specifed with "inkeys" If no secret is specified and no authentication method is specified, then no authentication will be required.
	**/
	public String getAuth(){		return  auth;
	}
	/**
	*setauth 
	*/
	public void setAuth(String aauth){
		if(aauth==null){
		    changed = (this.auth!=null);
		    this.auth = null;	    
		}else{
			changed = aauth.equals(this.auth);
			this.auth=aauth;
		}
	}


	/**
	* getsecret 
	* <secret>: The "secret" line specifies the shared secret for md5 and plaintext authentication methods. It is never suggested to use plaintext except in some cases for debugging.
	**/
	public String getSecret(){		return  secret;
	}
	/**
	*setsecret 
	*/
	public void setSecret(String asecret){
		if(asecret==null){
		    changed = (this.secret!=null);
		    this.secret = null;	    
		}else{
			changed = asecret.equals(this.secret);
			this.secret=asecret;
		}
	}


	/**
	* getinkeys 
	*  key1[:key2...]: The "inkeys" line specifies which keys we can use to authenticate the remote peer. If the peer's challenge passes with any of the given keys, then we accept its authentication. The key files live in /var/lib/asterisk/keys/<name>.pub and are *public keys*. Public keys are not typically DES3 encrypted and thus do not usually need initialization.
	**/
	public String getInkeys(){		return  inkeys;
	}
	/**
	*setinkeys 
	*/
	public void setInkeys(String ainkeys){
		if(ainkeys==null){
		    changed = (this.inkeys!=null);
		    this.inkeys = null;	    
		}else{
			changed = ainkeys.equals(this.inkeys);
			this.inkeys=ainkeys;
		}
	}


	/**
	* gethost 
	* Sets the expected outgoing host for this client. Can be set to an ip address or dynamic, which will allow incoming connections from any host (that is not explicitly denied.)
	**/
	public String getHost(){		return  host;
	}
	/**
	*sethost 
	*/
	public void setHost(String ahost){
		if(ahost==null){
		    changed = (this.host!=null);
		    this.host = null;	    
		}else{
			changed = ahost.equals(this.host);
			this.host=ahost;
		}
	}


	/**
	* getdefaultip 
	* The default IP address for an IAX client. This field is consulted if Asterisk receives a call for an IAX client that is dynamic and has not registered to let Asterisk know the current IP address. Takes as itís argument an IP address.
	**/
	public String getDefaultip(){		return  defaultip;
	}
	/**
	*setdefaultip 
	*/
	public void setDefaultip(String adefaultip){
		if(adefaultip==null){
		    changed = (this.defaultip!=null);
		    this.defaultip = null;	    
		}else{
			changed = adefaultip.equals(this.defaultip);
			this.defaultip=adefaultip;
		}
	}


	/**
	* getcontext 
	* When used within a client definition, this keyword overrides the default incoming context set in the general section for the user only.
	**/
	public PbxContext getContext(){		return  context;
	}
	/**
	*setcontext 
	*/
	public void setContext(PbxContext acontext){
		if(acontext==null){
		    changed = (this.context!=null);
		    this.context = null;	    
		}else{
			changed = acontext.equals(this.context);
			this.context=acontext;
		}
	}


	/**
	* getdbsecret 
	* Secrets can be stored in astdb, too (mysecrets/place)
	**/
	public String getDbsecret(){		return  dbsecret;
	}
	/**
	*setdbsecret 
	*/
	public void setDbsecret(String adbsecret){
		if(adbsecret==null){
		    changed = (this.dbsecret!=null);
		    this.dbsecret = null;	    
		}else{
			changed = adbsecret.equals(this.dbsecret);
			this.dbsecret=adbsecret;
		}
	}


	/**
	* getsetvar 
	* 
	**/
	public String getSetvar(){		return  setvar;
	}
	/**
	*setsetvar 
	*/
	public void setSetvar(String asetvar){
		if(asetvar==null){
		    changed = (this.setvar!=null);
		    this.setvar = null;	    
		}else{
			changed = asetvar.equals(this.setvar);
			this.setvar=asetvar;
		}
	}


	/**
	* getpeercontext 
	* Default context to request for calls to peer
	**/
	public PbxContext getPeercontext(){		return  peercontext;
	}
	/**
	*setpeercontext 
	*/
	public void setPeercontext(PbxContext apeercontext){
		if(apeercontext==null){
		    changed = (this.peercontext!=null);
		    this.peercontext = null;	    
		}else{
			changed = apeercontext.equals(this.peercontext);
			this.peercontext=apeercontext;
		}
	}


	/**
	* getqualify 
	* Tells Asterisk whether to test whether the peer is alive before attempting to connect the call. If set to yes Asterisk will periodically contact the peer before forwarding any call information. The argument specified is the maximum number of milliseconds that a peer can take to respond before it is considered unavailable.
	**/
	public Integer getQualify(){		return  qualify;
	}
	/**
	*setqualify 
	*/
	public void setQualify(Integer aqualify){
		if(aqualify==null){
		    changed = (this.qualify!=null);
		    this.qualify = null;	    
		}else{
			changed = aqualify.equals(this.qualify);
			this.qualify=aqualify;
		}
	}


	/**
	* gettrunk 
	* Enables or disables trunking for a given user or peer. Trunk mode is a more efficient method of operating IAX if there are typically many calls running on the link. Trunk mode requires having a Zaptel interface in the Asterisk server.
	**/
	public Boolean getTrunk(){		return  trunk;
	}
	/**
	*settrunk 
	*/
	public void setTrunk(Boolean atrunk){
		if(atrunk==null){
		    changed = (this.trunk!=null);
		    this.trunk = null;	    
		}else{
			changed = atrunk.equals(this.trunk);
			this.trunk=atrunk;
		}
	}


	/**
	* gettimezone 
	* Set a timezone for the date/time IE
	**/
	public String getTimezone(){		return  timezone;
	}
	/**
	*settimezone 
	*/
	public void setTimezone(String atimezone){
		if(atimezone==null){
		    changed = (this.timezone!=null);
		    this.timezone = null;	    
		}else{
			changed = atimezone.equals(this.timezone);
			this.timezone=atimezone;
		}
	}


	/**
	* getregexten 
	* 
	**/
	public String getRegexten(){		return  regexten;
	}
	/**
	*setregexten 
	*/
	public void setRegexten(String aregexten){
		if(aregexten==null){
		    changed = (this.regexten!=null);
		    this.regexten = null;	    
		}else{
			changed = aregexten.equals(this.regexten);
			this.regexten=aregexten;
		}
	}


	/**
	* getdisallow 
	* all :Disallow all codecs (global configuration)
	**/
	public CodecsSet getDisallow(){		return  disallow;
	}
	/**
	*setdisallow 
	*/
	public void setDisallow(CodecsSet adisallow){
		if(adisallow==null){
		    changed = (this.disallow!=null);
		    this.disallow = null;	    
		}else{
			changed = adisallow.equals(this.disallow);
			this.disallow=adisallow;
		}
	}


	/**
	* getallow 
	* Allow codecs in order of preference (Use DISALLOW=ALL first, before allowing other codecs)
	**/
	public CodecsSet getAllow(){		return  allow;
	}
	/**
	*setallow 
	*/
	public void setAllow(CodecsSet aallow){
		if(aallow==null){
		    changed = (this.allow!=null);
		    this.allow = null;	    
		}else{
			changed = aallow.equals(this.allow);
			this.allow=aallow;
		}
	}


	/**
	* getmailbox 
	* Provides a mailbox to associate with a given peer, so that when it registers it can be notified of any pending messages waiting.
	**/
	public String getMailbox(){		return  mailbox;
	}
	/**
	*setmailbox 
	*/
	public void setMailbox(String amailbox){
		if(amailbox==null){
		    changed = (this.mailbox!=null);
		    this.mailbox = null;	    
		}else{
			changed = amailbox.equals(this.mailbox);
			this.mailbox=amailbox;
		}
	}


	/**
	* getaccountcode 
	* When used within a client definition, sets the account code for that client only. This is used by the call logging service.
	**/
	public String getAccountcode(){		return  accountcode;
	}
	/**
	*setaccountcode 
	*/
	public void setAccountcode(String aaccountcode){
		if(aaccountcode==null){
		    changed = (this.accountcode!=null);
		    this.accountcode = null;	    
		}else{
			changed = aaccountcode.equals(this.accountcode);
			this.accountcode=aaccountcode;
		}
	}


	/**
	* getoutkey 
	* The private key to encrypt outgoing authentication communication for this client.
	**/
	public String getOutkey(){		return  outkey;
	}
	/**
	*setoutkey 
	*/
	public void setOutkey(String aoutkey){
		if(aoutkey==null){
		    changed = (this.outkey!=null);
		    this.outkey = null;	    
		}else{
			changed = aoutkey.equals(this.outkey);
			this.outkey=aoutkey;
		}
	}


	/**
	* getnotransfer 
	* Disable IAX native transfer.
	**/
	public Boolean getNotransfer(){		return  notransfer;
	}
	/**
	*setnotransfer 
	*/
	public void setNotransfer(Boolean anotransfer){
		if(anotransfer==null){
		    changed = (this.notransfer!=null);
		    this.notransfer = null;	    
		}else{
			changed = anotransfer.equals(this.notransfer);
			this.notransfer=anotransfer;
		}
	}


	/**
	* getqualifysmoothing 
	* use an average of the last two PONG results to reduce falsly detected LAGGED hosts Default: Off
	**/
	public Boolean getQualifysmoothing(){		return  qualifysmoothing;
	}
	/**
	*setqualifysmoothing 
	*/
	public void setQualifysmoothing(Boolean aqualifysmoothing){
		if(aqualifysmoothing==null){
		    changed = (this.qualifysmoothing!=null);
		    this.qualifysmoothing = null;	    
		}else{
			changed = aqualifysmoothing.equals(this.qualifysmoothing);
			this.qualifysmoothing=aqualifysmoothing;
		}
	}


	/**
	* getqualifyfreqok 
	* how frequently to ping the peer when everything seems to be ok, in milliseconds
	**/
	public Integer getQualifyfreqok(){		return  qualifyfreqok;
	}
	/**
	*setqualifyfreqok 
	*/
	public void setQualifyfreqok(Integer aqualifyfreqok){
		if(aqualifyfreqok==null){
		    changed = (this.qualifyfreqok!=null);
		    this.qualifyfreqok = null;	    
		}else{
			changed = aqualifyfreqok.equals(this.qualifyfreqok);
			this.qualifyfreqok=aqualifyfreqok;
		}
	}


	/**
	* getqualifyfreqnotok 
	* how frequently to ping the peer when it's either LAGGED or UNAVAILABLE, in milliseconds
	**/
	public Integer getQualifyfreqnotok(){		return  qualifyfreqnotok;
	}
	/**
	*setqualifyfreqnotok 
	*/
	public void setQualifyfreqnotok(Integer aqualifyfreqnotok){
		if(aqualifyfreqnotok==null){
		    changed = (this.qualifyfreqnotok!=null);
		    this.qualifyfreqnotok = null;	    
		}else{
			changed = aqualifyfreqnotok.equals(this.qualifyfreqnotok);
			this.qualifyfreqnotok=aqualifyfreqnotok;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("iaxpeername=")
		.append(iaxpeername)
		.append(",")
		.append("peertype=")
		.append(peertype)
		.append(",")
		.append("callerid=")
		.append(callerid)
		.append(",")
		.append("auth=")
		.append(auth)
		.append(",")
		.append("secret=")
		.append(secret)
		.append(",")
		.append("inkeys=")
		.append(inkeys)
		.append(",")
		.append("host=")
		.append(host)
		.append(",")
		.append("defaultip=")
		.append(defaultip)
		.append(",")
		.append("context=")
		.append(context)
		.append(",")
		.append("dbsecret=")
		.append(dbsecret)
		.append(",")
		.append("setvar=")
		.append(setvar)
		.append(",")
		.append("peercontext=")
		.append(peercontext)
		.append(",")
		.append("qualify=")
		.append(qualify)
		.append(",")
		.append("trunk=")
		.append(trunk)
		.append(",")
		.append("timezone=")
		.append(timezone)
		.append(",")
		.append("regexten=")
		.append(regexten)
		.append(",")
		.append("disallow=")
		.append(disallow)
		.append(",")
		.append("allow=")
		.append(allow)
		.append(",")
		.append("mailbox=")
		.append(mailbox)
		.append(",")
		.append("accountcode=")
		.append(accountcode)
		.append(",")
		.append("outkey=")
		.append(outkey)
		.append(",")
		.append("notransfer=")
		.append(notransfer)
		.append(",")
		.append("qualifysmoothing=")
		.append(qualifysmoothing)
		.append(",")
		.append("qualifyfreqok=")
		.append(qualifyfreqok)
		.append(",")
		.append("qualifyfreqnotok=")
		.append(qualifyfreqnotok)
    			.append("]");

		return sb.toString();		
	}}