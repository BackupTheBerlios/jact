package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;


/**
 * <p>
 * Sippeers<br>
 * These variables can be configured for each SIP peer definition: 
 * </p>
 * Created : Fri May 26 14:32:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Sippeers.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class Sippeers extends AbstractSimpleDataClass implements ISippeers{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Sippeers
	**/
	public Sippeers(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Sippeers
	**/
	public Sippeers( String asectionname, String aaccountcode, Amaflags aamaflags, String acallgroup, String acanreinvite, PbxContext acontext, String adefaultip, Dtmfmode adtmfmode, String afromuser, String afromdomain, String ahost, Integer aincominglimit, Integer aoutgoinglimit, String ainsecure, String alanguage, String amailbox, String amd5secret, Boolean anat, String apickupgroup, Integer aport, String aqualify, Boolean arestrictcid, Integer artptimeout, Integer artpholdtimeout, String asecret, PeerType atype, String ausername, String amusiconhold, String acallerid, CodecsSet adisallow, CodecsSet aallow){
		super();
	
		this.sectionname = asectionname;	
		this.accountcode = aaccountcode;	
		this.amaflags = aamaflags;	
		this.callgroup = acallgroup;	
		this.canreinvite = acanreinvite;	
		this.context = acontext;	
		this.defaultip = adefaultip;	
		this.dtmfmode = adtmfmode;	
		this.fromuser = afromuser;	
		this.fromdomain = afromdomain;	
		this.host = ahost;	
		this.incominglimit = aincominglimit;	
		this.outgoinglimit = aoutgoinglimit;	
		this.insecure = ainsecure;	
		this.language = alanguage;	
		this.mailbox = amailbox;	
		this.md5secret = amd5secret;	
		this.nat = anat;	
		this.pickupgroup = apickupgroup;	
		this.port = aport;	
		this.qualify = aqualify;	
		this.restrictcid = arestrictcid;	
		this.rtptimeout = artptimeout;	
		this.rtpholdtimeout = artpholdtimeout;	
		this.secret = asecret;	
		this.type = atype;	
		this.username = ausername;	
		this.musiconhold = amusiconhold;	
		this.callerid = acallerid;	
		this.disallow = adisallow;	
		this.allow = aallow;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Sippeers object){
		this.sectionname = object.sectionname;	
		this.accountcode = object.accountcode;	
		this.amaflags = object.amaflags;	
		this.callgroup = object.callgroup;	
		this.canreinvite = object.canreinvite;	
		this.context = object.context;	
		this.defaultip = object.defaultip;	
		this.dtmfmode = object.dtmfmode;	
		this.fromuser = object.fromuser;	
		this.fromdomain = object.fromdomain;	
		this.host = object.host;	
		this.incominglimit = object.incominglimit;	
		this.outgoinglimit = object.outgoinglimit;	
		this.insecure = object.insecure;	
		this.language = object.language;	
		this.mailbox = object.mailbox;	
		this.md5secret = object.md5secret;	
		this.nat = object.nat;	
		this.pickupgroup = object.pickupgroup;	
		this.port = object.port;	
		this.qualify = object.qualify;	
		this.restrictcid = object.restrictcid;	
		this.rtptimeout = object.rtptimeout;	
		this.rtpholdtimeout = object.rtpholdtimeout;	
		this.secret = object.secret;	
		this.type = object.type;	
		this.username = object.username;	
		this.musiconhold = object.musiconhold;	
		this.callerid = object.callerid;	
		this.disallow = object.disallow;	
		this.allow = object.allow;	

	}
//--------------  map Funktionen
	//public static final String SIPAUTHMAP = "sipauthMap";
	/** die typisierte List die die Aggregierten objekte(SipauthImpl) enthält */
	protected List<Sipauth> sipauthMap = new ArrayList<Sipauth>();
	/** die typisierte Map die die Aggregierten objekte(SipauthImpl) enthält */
	//protected SipauthMap sipauthMapMap = new SipauthMap();

	/**
	 * fügt ein Sipauth Objekt zu der Mapp hinzu
	 * @param aSipauth
	 */
	public boolean addSipauth(Sipauth aSipauth){
		return sipauthMap.add(aSipauth);
	}

	/**
	 * removed ein Sipauth Objekt aus der Map
	 * @param aSipauth
	 */
	public boolean removeSipauth(Sipauth aSipauth){
		return sipauthMap.remove(aSipauth);
	}

	

/**
 * gibt die List<Sipauth> sipauthMap zurück	
 * @return List<Sipauth>
 * @see  ISippeers#getSipauthMap
 */
public List<Sipauth> getSipauthMap() {
	return sipauthMap;
}
/**
 * setzt die Map SipauthMap
 * @param map sipauthMapMap
 */
 @SuppressWarnings("unchecked")
public void setSipauthMap(List aList){
    sipauthMap = aList;
   // sipauthMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Peer Section Name **/
	protected String sectionname;
	public static final String VALUEID_SECTIONNAME="sectionname" ;

    /**  Users may be associated with an accountcode. See Asterisk billing **/
	protected String accountcode;
	public static final String VALUEID_ACCOUNTCODE="accountcode" ;

    /**  Categorization for CDR records. Choices are default, omit, billing, documentation. See Asterisk billing **/
	protected Amaflags amaflags;
	public static final String VALUEID_AMAFLAGS="amaflags" ;

    /**   **/
	protected String callgroup;
	public static final String VALUEID_CALLGROUP="callgroup" ;

    /**  If the client is able to support SIP re-invites **/
	protected String canreinvite;
	public static final String VALUEID_CANREINVITE="canreinvite" ;

    /**   Context in the dialplan for outbound calls from this client **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  Default IP address of client host= is specified as DYNAMIC. Used if client have not been registred at any other IP adress. **/
	protected String defaultip;
	public static final String VALUEID_DEFAULTIP="defaultip" ;

    /**  How the client handles DMTF? signalling **/
	protected Dtmfmode dtmfmode;
	public static final String VALUEID_DTMFMODE="dtmfmode" ;

    /**  Specify user to put in "from" instead of callerid (overrides the callerid) when placing calls _to_ peer (another SIP proxy) **/
	protected String fromuser;
	public static final String VALUEID_FROMUSER="fromuser" ;

    /**  <domain> Sets default From domain in SIP messages when placing calls _to_ peer **/
	protected String fromdomain;
	public static final String VALUEID_FROMDOMAIN="fromdomain" ;

    /**   How to find the client - IP # or host name. If you want the phone to register itself, use the keyword dynamic instead of Host IP **/
	protected String host;
	public static final String VALUEID_HOST="host" ;

    /**  Limits for number of simultaneous active calls for a SIP client **/
	protected Integer incominglimit;
	public static final String VALUEID_INCOMINGLIMIT="incominglimit" ;

    /**  Limits for number of simultaneous active calls for a SIP client **/
	protected Integer outgoinglimit;
	public static final String VALUEID_OUTGOINGLIMIT="outgoinglimit" ;

    /**  Don't check host ip and port for peer (not user) **/
	protected String insecure;
	public static final String VALUEID_INSECURE="insecure" ;

    /**  A language code defined in indications.conf - defines language for prompts and specific local phone signals **/
	protected String language;
	public static final String VALUEID_LANGUAGE="language" ;

    /**  Voicemail extension (for message waiting indications) **/
	protected String mailbox;
	public static final String VALUEID_MAILBOX="mailbox" ;

    /**  MD5-Hash of "<user>:asterisk:<secret>" (can be used instead of secret) **/
	protected String md5secret;
	public static final String VALUEID_MD5SECRET="md5secret" ;

    /**  This variable changes the behaviour of Asterisk for clients behind a firewall. This does not solve the problem if Asterisk is behind the firewall and the client on the outside. **/
	protected Boolean nat;
	public static final String VALUEID_NAT="nat" ;

    /**   Group that can pickup fellow workers' calls using *8 and the Pickup() application on the *8 extension **/
	protected String pickupgroup;
	public static final String VALUEID_PICKUPGROUP="pickupgroup" ;

    /**   SIP port of the client **/
	protected Integer port;
	public static final String VALUEID_PORT="port" ;

    /**  Check if client is reachable **/
	protected String qualify;
	public static final String VALUEID_QUALIFY="qualify" ;

    /**   (yes/no) To have the callerid restricted -> sent as ANI; use this to hide the caller ID **/
	protected Boolean restrictcid;
	public static final String VALUEID_RESTRICTCID="restrictcid" ;

    /**  Terminate call if x seconds of no RTP activity when we're not on hold **/
	protected Integer rtptimeout;
	public static final String VALUEID_RTPTIMEOUT="rtptimeout" ;

    /**  Terminate call if x seconds of no RTP activity when we're on hold (must be larger than rtptimeout) **/
	protected Integer rtpholdtimeout;
	public static final String VALUEID_RTPHOLDTIMEOUT="rtpholdtimeout" ;

    /**   If Asterisk is acting as a SIP Server, then this SIP client must login with this Password (A shared secret). If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server. **/
	protected String secret;
	public static final String VALUEID_SECRET="secret" ;

    /**  Relationship to client - outbound provider or full client? **/
	protected PeerType type;
	public static final String VALUEID_TYPE="type" ;

    /**  If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server. Also, for peers that register with Asterisk, this username is used in INVITEs until we have a registration. **/
	protected String username;
	public static final String VALUEID_USERNAME="username" ;

    /**  Set class of musiconhold on calls from SIP phone. Calls to the phone require SetMusicOnHold cmd of higher priority (lower numerical value of priority) than Dial cmd in dialplan in order to set this class for the call. Calls have the MusicOnHold class set on a per call basis, not on a per phone basis, and making a call through any extension specifying SetMusicOnHold will override this value for the call. **/
	protected String musiconhold;
	public static final String VALUEID_MUSICONHOLD="musiconhold" ;

    /**  the callerid **/
	protected String callerid;
	public static final String VALUEID_CALLERID="callerid" ;

    /**   **/
	protected CodecsSet disallow;
	public static final String VALUEID_DISALLOW="disallow" ;

    /**   **/
	protected CodecsSet allow;
	public static final String VALUEID_ALLOW="allow" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SECTIONNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return true;
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_CANREINVITE.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_DEFAULTIP.equals(valueid)){
			return true;
		}
		if(VALUEID_DTMFMODE.equals(valueid)){
			return true;
		}
		if(VALUEID_FROMUSER.equals(valueid)){
			return true;
		}
		if(VALUEID_FROMDOMAIN.equals(valueid)){
			return true;
		}
		if(VALUEID_HOST.equals(valueid)){
			return true;
		}
		if(VALUEID_INCOMINGLIMIT.equals(valueid)){
			return true;
		}
		if(VALUEID_OUTGOINGLIMIT.equals(valueid)){
			return true;
		}
		if(VALUEID_INSECURE.equals(valueid)){
			return true;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return true;
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			return true;
		}
		if(VALUEID_MD5SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_NAT.equals(valueid)){
			return true;
		}
		if(VALUEID_PICKUPGROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_PORT.equals(valueid)){
			return true;
		}
		if(VALUEID_QUALIFY.equals(valueid)){
			return true;
		}
		if(VALUEID_RESTRICTCID.equals(valueid)){
			return true;
		}
		if(VALUEID_RTPTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_RTPHOLDTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_SECRET.equals(valueid)){
			return true;
		}
		if(VALUEID_TYPE.equals(valueid)){
			return true;
		}
		if(VALUEID_USERNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_MUSICONHOLD.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLERID.equals(valueid)){
			return true;
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return true;
		}
		if(VALUEID_ALLOW.equals(valueid)){
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
		if(VALUEID_SECTIONNAME.equals(valueid)){
			setSectionname((String)data);
			return;
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			setAccountcode((String)data);
			return;
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			if(data instanceof String){
		        setAmaflags(new Amaflags((String)data));
		        return;
		    }
			setAmaflags((Amaflags)data);
			return;
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			setCallgroup((String)data);
			return;
		}
		if(VALUEID_CANREINVITE.equals(valueid)){
			setCanreinvite((String)data);
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
		if(VALUEID_DEFAULTIP.equals(valueid)){
			setDefaultip((String)data);
			return;
		}
		if(VALUEID_DTMFMODE.equals(valueid)){
			if(data instanceof String){
		        setDtmfmode(new Dtmfmode((String)data));
		        return;
		    }
			setDtmfmode((Dtmfmode)data);
			return;
		}
		if(VALUEID_FROMUSER.equals(valueid)){
			setFromuser((String)data);
			return;
		}
		if(VALUEID_FROMDOMAIN.equals(valueid)){
			setFromdomain((String)data);
			return;
		}
		if(VALUEID_HOST.equals(valueid)){
			setHost((String)data);
			return;
		}
		if(VALUEID_INCOMINGLIMIT.equals(valueid)){
			if(data instanceof String){
		        setIncominglimit(new Integer((String)data));
		        return;
		    }
			setIncominglimit((Integer)data);
			return;
		}
		if(VALUEID_OUTGOINGLIMIT.equals(valueid)){
			if(data instanceof String){
		        setOutgoinglimit(new Integer((String)data));
		        return;
		    }
			setOutgoinglimit((Integer)data);
			return;
		}
		if(VALUEID_INSECURE.equals(valueid)){
			setInsecure((String)data);
			return;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			setLanguage((String)data);
			return;
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			setMailbox((String)data);
			return;
		}
		if(VALUEID_MD5SECRET.equals(valueid)){
			setMd5secret((String)data);
			return;
		}
		if(VALUEID_NAT.equals(valueid)){
			if(data instanceof String){
		        setNat(new Boolean((String)data));
		        return;
		    }
			setNat((Boolean)data);
			return;
		}
		if(VALUEID_PICKUPGROUP.equals(valueid)){
			setPickupgroup((String)data);
			return;
		}
		if(VALUEID_PORT.equals(valueid)){
			if(data instanceof String){
		        setPort(new Integer((String)data));
		        return;
		    }
			setPort((Integer)data);
			return;
		}
		if(VALUEID_QUALIFY.equals(valueid)){
			setQualify((String)data);
			return;
		}
		if(VALUEID_RESTRICTCID.equals(valueid)){
			if(data instanceof String){
		        setRestrictcid(new Boolean((String)data));
		        return;
		    }
			setRestrictcid((Boolean)data);
			return;
		}
		if(VALUEID_RTPTIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setRtptimeout(new Integer((String)data));
		        return;
		    }
			setRtptimeout((Integer)data);
			return;
		}
		if(VALUEID_RTPHOLDTIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setRtpholdtimeout(new Integer((String)data));
		        return;
		    }
			setRtpholdtimeout((Integer)data);
			return;
		}
		if(VALUEID_SECRET.equals(valueid)){
			setSecret((String)data);
			return;
		}
		if(VALUEID_TYPE.equals(valueid)){
			if(data instanceof String){
		        setType(new PeerType((String)data));
		        return;
		    }
			setType((PeerType)data);
			return;
		}
		if(VALUEID_USERNAME.equals(valueid)){
			setUsername((String)data);
			return;
		}
		if(VALUEID_MUSICONHOLD.equals(valueid)){
			setMusiconhold((String)data);
			return;
		}
		if(VALUEID_CALLERID.equals(valueid)){
			setCallerid((String)data);
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
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SECTIONNAME.equals(valueid)){
			return getSectionname();
			
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return getAccountcode();
			
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			return getAmaflags();
			
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			return getCallgroup();
			
		}
		if(VALUEID_CANREINVITE.equals(valueid)){
			return getCanreinvite();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_DEFAULTIP.equals(valueid)){
			return getDefaultip();
			
		}
		if(VALUEID_DTMFMODE.equals(valueid)){
			return getDtmfmode();
			
		}
		if(VALUEID_FROMUSER.equals(valueid)){
			return getFromuser();
			
		}
		if(VALUEID_FROMDOMAIN.equals(valueid)){
			return getFromdomain();
			
		}
		if(VALUEID_HOST.equals(valueid)){
			return getHost();
			
		}
		if(VALUEID_INCOMINGLIMIT.equals(valueid)){
			return getIncominglimit();
			
		}
		if(VALUEID_OUTGOINGLIMIT.equals(valueid)){
			return getOutgoinglimit();
			
		}
		if(VALUEID_INSECURE.equals(valueid)){
			return getInsecure();
			
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return getLanguage();
			
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			return getMailbox();
			
		}
		if(VALUEID_MD5SECRET.equals(valueid)){
			return getMd5secret();
			
		}
		if(VALUEID_NAT.equals(valueid)){
			return getNat();
			
		}
		if(VALUEID_PICKUPGROUP.equals(valueid)){
			return getPickupgroup();
			
		}
		if(VALUEID_PORT.equals(valueid)){
			return getPort();
			
		}
		if(VALUEID_QUALIFY.equals(valueid)){
			return getQualify();
			
		}
		if(VALUEID_RESTRICTCID.equals(valueid)){
			return getRestrictcid();
			
		}
		if(VALUEID_RTPTIMEOUT.equals(valueid)){
			return getRtptimeout();
			
		}
		if(VALUEID_RTPHOLDTIMEOUT.equals(valueid)){
			return getRtpholdtimeout();
			
		}
		if(VALUEID_SECRET.equals(valueid)){
			return getSecret();
			
		}
		if(VALUEID_TYPE.equals(valueid)){
			return getType();
			
		}
		if(VALUEID_USERNAME.equals(valueid)){
			return getUsername();
			
		}
		if(VALUEID_MUSICONHOLD.equals(valueid)){
			return getMusiconhold();
			
		}
		if(VALUEID_CALLERID.equals(valueid)){
			return getCallerid();
			
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return getDisallow();
			
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return getAllow();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getsectionname 
	* Peer Section Name
	**/
	public String getSectionname(){		return  sectionname;
	}
	/**
	*setsectionname 
	*/
	public void setSectionname(String asectionname){
		if(asectionname==null){
		    changed = (this.sectionname!=null);
		    this.sectionname = null;	    
		}else{
			changed = asectionname.equals(this.sectionname);
			this.sectionname=asectionname;
		}
	}


	/**
	* getaccountcode 
	* Users may be associated with an accountcode. See Asterisk billing
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
	* getamaflags 
	* Categorization for CDR records. Choices are default, omit, billing, documentation. See Asterisk billing
	**/
	public Amaflags getAmaflags(){		return  amaflags;
	}
	/**
	*setamaflags 
	*/
	public void setAmaflags(Amaflags aamaflags){
		if(aamaflags==null){
		    changed = (this.amaflags!=null);
		    this.amaflags = null;	    
		}else{
			changed = aamaflags.equals(this.amaflags);
			this.amaflags=aamaflags;
		}
	}


	/**
	* getcallgroup 
	* 
	**/
	public String getCallgroup(){		return  callgroup;
	}
	/**
	*setcallgroup 
	*/
	public void setCallgroup(String acallgroup){
		if(acallgroup==null){
		    changed = (this.callgroup!=null);
		    this.callgroup = null;	    
		}else{
			changed = acallgroup.equals(this.callgroup);
			this.callgroup=acallgroup;
		}
	}


	/**
	* getcanreinvite 
	* If the client is able to support SIP re-invites
	**/
	public String getCanreinvite(){		return  canreinvite;
	}
	/**
	*setcanreinvite 
	*/
	public void setCanreinvite(String acanreinvite){
		if(acanreinvite==null){
		    changed = (this.canreinvite!=null);
		    this.canreinvite = null;	    
		}else{
			changed = acanreinvite.equals(this.canreinvite);
			this.canreinvite=acanreinvite;
		}
	}


	/**
	* getcontext 
	*  Context in the dialplan for outbound calls from this client
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
	* getdefaultip 
	* Default IP address of client host= is specified as DYNAMIC. Used if client have not been registred at any other IP adress.
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
	* getdtmfmode 
	* How the client handles DMTF? signalling
	**/
	public Dtmfmode getDtmfmode(){		return  dtmfmode;
	}
	/**
	*setdtmfmode 
	*/
	public void setDtmfmode(Dtmfmode adtmfmode){
		if(adtmfmode==null){
		    changed = (this.dtmfmode!=null);
		    this.dtmfmode = null;	    
		}else{
			changed = adtmfmode.equals(this.dtmfmode);
			this.dtmfmode=adtmfmode;
		}
	}


	/**
	* getfromuser 
	* Specify user to put in "from" instead of callerid (overrides the callerid) when placing calls _to_ peer (another SIP proxy)
	**/
	public String getFromuser(){		return  fromuser;
	}
	/**
	*setfromuser 
	*/
	public void setFromuser(String afromuser){
		if(afromuser==null){
		    changed = (this.fromuser!=null);
		    this.fromuser = null;	    
		}else{
			changed = afromuser.equals(this.fromuser);
			this.fromuser=afromuser;
		}
	}


	/**
	* getfromdomain 
	* <domain> Sets default From domain in SIP messages when placing calls _to_ peer
	**/
	public String getFromdomain(){		return  fromdomain;
	}
	/**
	*setfromdomain 
	*/
	public void setFromdomain(String afromdomain){
		if(afromdomain==null){
		    changed = (this.fromdomain!=null);
		    this.fromdomain = null;	    
		}else{
			changed = afromdomain.equals(this.fromdomain);
			this.fromdomain=afromdomain;
		}
	}


	/**
	* gethost 
	*  How to find the client - IP # or host name. If you want the phone to register itself, use the keyword dynamic instead of Host IP
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
	* getincominglimit 
	* Limits for number of simultaneous active calls for a SIP client
	**/
	public Integer getIncominglimit(){		return  incominglimit;
	}
	/**
	*setincominglimit 
	*/
	public void setIncominglimit(Integer aincominglimit){
		if(aincominglimit==null){
		    changed = (this.incominglimit!=null);
		    this.incominglimit = null;	    
		}else{
			changed = aincominglimit.equals(this.incominglimit);
			this.incominglimit=aincominglimit;
		}
	}


	/**
	* getoutgoinglimit 
	* Limits for number of simultaneous active calls for a SIP client
	**/
	public Integer getOutgoinglimit(){		return  outgoinglimit;
	}
	/**
	*setoutgoinglimit 
	*/
	public void setOutgoinglimit(Integer aoutgoinglimit){
		if(aoutgoinglimit==null){
		    changed = (this.outgoinglimit!=null);
		    this.outgoinglimit = null;	    
		}else{
			changed = aoutgoinglimit.equals(this.outgoinglimit);
			this.outgoinglimit=aoutgoinglimit;
		}
	}


	/**
	* getinsecure 
	* Don't check host ip and port for peer (not user)
	**/
	public String getInsecure(){		return  insecure;
	}
	/**
	*setinsecure 
	*/
	public void setInsecure(String ainsecure){
		if(ainsecure==null){
		    changed = (this.insecure!=null);
		    this.insecure = null;	    
		}else{
			changed = ainsecure.equals(this.insecure);
			this.insecure=ainsecure;
		}
	}


	/**
	* getlanguage 
	* A language code defined in indications.conf - defines language for prompts and specific local phone signals
	**/
	public String getLanguage(){		return  language;
	}
	/**
	*setlanguage 
	*/
	public void setLanguage(String alanguage){
		if(alanguage==null){
		    changed = (this.language!=null);
		    this.language = null;	    
		}else{
			changed = alanguage.equals(this.language);
			this.language=alanguage;
		}
	}


	/**
	* getmailbox 
	* Voicemail extension (for message waiting indications)
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
	* getmd5secret 
	* MD5-Hash of "<user>:asterisk:<secret>" (can be used instead of secret)
	**/
	public String getMd5secret(){		return  md5secret;
	}
	/**
	*setmd5secret 
	*/
	public void setMd5secret(String amd5secret){
		if(amd5secret==null){
		    changed = (this.md5secret!=null);
		    this.md5secret = null;	    
		}else{
			changed = amd5secret.equals(this.md5secret);
			this.md5secret=amd5secret;
		}
	}


	/**
	* getnat 
	* This variable changes the behaviour of Asterisk for clients behind a firewall. This does not solve the problem if Asterisk is behind the firewall and the client on the outside.
	**/
	public Boolean getNat(){		return  nat;
	}
	/**
	*setnat 
	*/
	public void setNat(Boolean anat){
		if(anat==null){
		    changed = (this.nat!=null);
		    this.nat = null;	    
		}else{
			changed = anat.equals(this.nat);
			this.nat=anat;
		}
	}


	/**
	* getpickupgroup 
	*  Group that can pickup fellow workers' calls using *8 and the Pickup() application on the *8 extension
	**/
	public String getPickupgroup(){		return  pickupgroup;
	}
	/**
	*setpickupgroup 
	*/
	public void setPickupgroup(String apickupgroup){
		if(apickupgroup==null){
		    changed = (this.pickupgroup!=null);
		    this.pickupgroup = null;	    
		}else{
			changed = apickupgroup.equals(this.pickupgroup);
			this.pickupgroup=apickupgroup;
		}
	}


	/**
	* getport 
	*  SIP port of the client
	**/
	public Integer getPort(){		return  port;
	}
	/**
	*setport 
	*/
	public void setPort(Integer aport){
		if(aport==null){
		    changed = (this.port!=null);
		    this.port = null;	    
		}else{
			changed = aport.equals(this.port);
			this.port=aport;
		}
	}


	/**
	* getqualify 
	* Check if client is reachable
	**/
	public String getQualify(){		return  qualify;
	}
	/**
	*setqualify 
	*/
	public void setQualify(String aqualify){
		if(aqualify==null){
		    changed = (this.qualify!=null);
		    this.qualify = null;	    
		}else{
			changed = aqualify.equals(this.qualify);
			this.qualify=aqualify;
		}
	}


	/**
	* getrestrictcid 
	*  (yes/no) To have the callerid restricted -> sent as ANI; use this to hide the caller ID
	**/
	public Boolean getRestrictcid(){		return  restrictcid;
	}
	/**
	*setrestrictcid 
	*/
	public void setRestrictcid(Boolean arestrictcid){
		if(arestrictcid==null){
		    changed = (this.restrictcid!=null);
		    this.restrictcid = null;	    
		}else{
			changed = arestrictcid.equals(this.restrictcid);
			this.restrictcid=arestrictcid;
		}
	}


	/**
	* getrtptimeout 
	* Terminate call if x seconds of no RTP activity when we're not on hold
	**/
	public Integer getRtptimeout(){		return  rtptimeout;
	}
	/**
	*setrtptimeout 
	*/
	public void setRtptimeout(Integer artptimeout){
		if(artptimeout==null){
		    changed = (this.rtptimeout!=null);
		    this.rtptimeout = null;	    
		}else{
			changed = artptimeout.equals(this.rtptimeout);
			this.rtptimeout=artptimeout;
		}
	}


	/**
	* getrtpholdtimeout 
	* Terminate call if x seconds of no RTP activity when we're on hold (must be larger than rtptimeout)
	**/
	public Integer getRtpholdtimeout(){		return  rtpholdtimeout;
	}
	/**
	*setrtpholdtimeout 
	*/
	public void setRtpholdtimeout(Integer artpholdtimeout){
		if(artpholdtimeout==null){
		    changed = (this.rtpholdtimeout!=null);
		    this.rtpholdtimeout = null;	    
		}else{
			changed = artpholdtimeout.equals(this.rtpholdtimeout);
			this.rtpholdtimeout=artpholdtimeout;
		}
	}


	/**
	* getsecret 
	*  If Asterisk is acting as a SIP Server, then this SIP client must login with this Password (A shared secret). If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server.
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
	* gettype 
	* Relationship to client - outbound provider or full client?
	**/
	public PeerType getType(){		return  type;
	}
	/**
	*settype 
	*/
	public void setType(PeerType atype){
		if(atype==null){
		    changed = (this.type!=null);
		    this.type = null;	    
		}else{
			changed = atype.equals(this.type);
			this.type=atype;
		}
	}


	/**
	* getusername 
	* If Asterisk is acting as a SIP client to a remote SIP server that requires SIP INVITE authentication, then this field is used to authenticate SIP INVITEs that Asterisk sends to the remote SIP server. Also, for peers that register with Asterisk, this username is used in INVITEs until we have a registration.
	**/
	public String getUsername(){		return  username;
	}
	/**
	*setusername 
	*/
	public void setUsername(String ausername){
		if(ausername==null){
		    changed = (this.username!=null);
		    this.username = null;	    
		}else{
			changed = ausername.equals(this.username);
			this.username=ausername;
		}
	}


	/**
	* getmusiconhold 
	* Set class of musiconhold on calls from SIP phone. Calls to the phone require SetMusicOnHold cmd of higher priority (lower numerical value of priority) than Dial cmd in dialplan in order to set this class for the call. Calls have the MusicOnHold class set on a per call basis, not on a per phone basis, and making a call through any extension specifying SetMusicOnHold will override this value for the call.
	**/
	public String getMusiconhold(){		return  musiconhold;
	}
	/**
	*setmusiconhold 
	*/
	public void setMusiconhold(String amusiconhold){
		if(amusiconhold==null){
		    changed = (this.musiconhold!=null);
		    this.musiconhold = null;	    
		}else{
			changed = amusiconhold.equals(this.musiconhold);
			this.musiconhold=amusiconhold;
		}
	}


	/**
	* getcallerid 
	* the callerid
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
	* getdisallow 
	* 
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
	* 
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("sectionname=")
		.append(sectionname)
		.append(",")
		.append("accountcode=")
		.append(accountcode)
		.append(",")
		.append("amaflags=")
		.append(amaflags)
		.append(",")
		.append("callgroup=")
		.append(callgroup)
		.append(",")
		.append("canreinvite=")
		.append(canreinvite)
		.append(",")
		.append("context=")
		.append(context)
		.append(",")
		.append("defaultip=")
		.append(defaultip)
		.append(",")
		.append("dtmfmode=")
		.append(dtmfmode)
		.append(",")
		.append("fromuser=")
		.append(fromuser)
		.append(",")
		.append("fromdomain=")
		.append(fromdomain)
		.append(",")
		.append("host=")
		.append(host)
		.append(",")
		.append("incominglimit=")
		.append(incominglimit)
		.append(",")
		.append("outgoinglimit=")
		.append(outgoinglimit)
		.append(",")
		.append("insecure=")
		.append(insecure)
		.append(",")
		.append("language=")
		.append(language)
		.append(",")
		.append("mailbox=")
		.append(mailbox)
		.append(",")
		.append("md5secret=")
		.append(md5secret)
		.append(",")
		.append("nat=")
		.append(nat)
		.append(",")
		.append("pickupgroup=")
		.append(pickupgroup)
		.append(",")
		.append("port=")
		.append(port)
		.append(",")
		.append("qualify=")
		.append(qualify)
		.append(",")
		.append("restrictcid=")
		.append(restrictcid)
		.append(",")
		.append("rtptimeout=")
		.append(rtptimeout)
		.append(",")
		.append("rtpholdtimeout=")
		.append(rtpholdtimeout)
		.append(",")
		.append("secret=")
		.append(secret)
		.append(",")
		.append("type=")
		.append(type)
		.append(",")
		.append("username=")
		.append(username)
		.append(",")
		.append("musiconhold=")
		.append(musiconhold)
		.append(",")
		.append("callerid=")
		.append(callerid)
		.append(",")
		.append("disallow=")
		.append(disallow)
		.append(",")
		.append("allow=")
		.append(allow)
    			.append("]");

		return sb.toString();		
	}}