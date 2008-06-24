package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * Sipgeneral<br>
 * The [general] section of sip.conf includes the following variables
 * </p>
 * Created : Fri May 26 14:32:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Sipgeneral.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class Sipgeneral extends AbstractSimpleDataClass implements ISipgeneral{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Sipgeneral
	**/
	public Sipgeneral(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Sipgeneral
	**/
	public Sipgeneral( Boolean aautocreatepeer, String abindaddr, Integer abindport, String acanreinvite, PbxContext acontext, Integer adefaultexpirey, Dtmfmode adtmfmode, String aexternip, String aexternhost, String aexternrefresh, String alocalnet, String afromdomain, Integer amaxexpirey, Boolean anat, String anotifymimetype, Boolean apedantic, Integer aport, Boolean apromiscredir, Boolean asrvlookup, String atos, Boolean avideosupport, String auseragent, Boolean atrustrpid, String arealm, Boolean arelaxdtmf, Integer artptimeout, Integer artpholdtimeout, String aprogressinband, Boolean ausereqphone, Boolean acompactheaders, Boolean asipdebug, Integer acheckmwi, Boolean arecordhistory, CodecsSet aallow, CodecsSet adisallow){
		super();
	
		this.autocreatepeer = aautocreatepeer;	
		this.bindaddr = abindaddr;	
		this.bindport = abindport;	
		this.canreinvite = acanreinvite;	
		this.context = acontext;	
		this.defaultexpirey = adefaultexpirey;	
		this.dtmfmode = adtmfmode;	
		this.externip = aexternip;	
		this.externhost = aexternhost;	
		this.externrefresh = aexternrefresh;	
		this.localnet = alocalnet;	
		this.fromdomain = afromdomain;	
		this.maxexpirey = amaxexpirey;	
		this.nat = anat;	
		this.notifymimetype = anotifymimetype;	
		this.pedantic = apedantic;	
		this.port = aport;	
		this.promiscredir = apromiscredir;	
		this.srvlookup = asrvlookup;	
		this.tos = atos;	
		this.videosupport = avideosupport;	
		this.useragent = auseragent;	
		this.trustrpid = atrustrpid;	
		this.realm = arealm;	
		this.rtptimeout = artptimeout;	
		this.relaxdtmf = arelaxdtmf;	
		this.rtpholdtimeout = artpholdtimeout;	
		this.progressinband = aprogressinband;	
		this.usereqphone = ausereqphone;	
		this.compactheaders = acompactheaders;	
		this.sipdebug = asipdebug;	
		this.checkmwi = acheckmwi;	
		this.recordhistory = arecordhistory;	
		this.allow = aallow;	
		this.disallow = adisallow;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Sipgeneral object){
		this.autocreatepeer = object.autocreatepeer;	
		this.bindaddr = object.bindaddr;	
		this.bindport = object.bindport;	
		this.canreinvite = object.canreinvite;	
		this.context = object.context;	
		this.defaultexpirey = object.defaultexpirey;	
		this.dtmfmode = object.dtmfmode;	
		this.externip = object.externip;	
		this.externhost = object.externhost;	
		this.externrefresh = object.externrefresh;	
		this.localnet = object.localnet;	
		this.fromdomain = object.fromdomain;	
		this.maxexpirey = object.maxexpirey;	
		this.nat = object.nat;	
		this.notifymimetype = object.notifymimetype;	
		this.pedantic = object.pedantic;	
		this.port = object.port;	
		this.promiscredir = object.promiscredir;	
		this.srvlookup = object.srvlookup;	
		this.tos = object.tos;	
		this.videosupport = object.videosupport;	
		this.useragent = object.useragent;	
		this.trustrpid = object.trustrpid;	
		this.realm = object.realm;	
		this.rtptimeout = object.rtptimeout;	
		this.relaxdtmf = object.relaxdtmf;	
		this.rtpholdtimeout = object.rtpholdtimeout;	
		this.progressinband = object.progressinband;	
		this.usereqphone = object.usereqphone;	
		this.compactheaders = object.compactheaders;	
		this.sipdebug = object.sipdebug;	
		this.checkmwi = object.checkmwi;	
		this.recordhistory = object.recordhistory;	
		this.allow = object.allow;	
		this.disallow = object.disallow;	

	}
//--------------  map Funktionen
	//public static final String SIPAUTHMAP = "sipauthMap";
	/** die typisierte List die die Aggregierten objekte(SipauthImpl) enthält */
	protected List<Sipauth> sipauthMap = new ArrayList<Sipauth>();
	//public static final String SIPREGISTERMAP = "sipregisterMap";
	/** die typisierte List die die Aggregierten objekte(SipregisterImpl) enthält */
	protected List<Sipregister> sipregisterMap = new ArrayList<Sipregister>();
	/** die typisierte Map die die Aggregierten objekte(SipauthImpl) enthält */
	//protected SipauthMap sipauthMapMap = new SipauthMap();
	/** die typisierte Map die die Aggregierten objekte(SipregisterImpl) enthält */
	//protected SipregisterMap sipregisterMapMap = new SipregisterMap();

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
	 * fügt ein Sipregister Objekt zu der Mapp hinzu
	 * @param aSipregister
	 */
	public boolean addSipregister(Sipregister aSipregister){
		return sipregisterMap.add(aSipregister);
	}

	/**
	 * removed ein Sipregister Objekt aus der Map
	 * @param aSipregister
	 */
	public boolean removeSipregister(Sipregister aSipregister){
		return sipregisterMap.remove(aSipregister);
	}

	

/**
 * gibt die List<Sipauth> sipauthMap zurück	
 * @return List<Sipauth>
 * @see  ISipgeneral#getSipauthMap
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


/**
 * gibt die List<Sipregister> sipregisterMap zurück	
 * @return List<Sipregister>
 * @see  ISipgeneral#getSipregisterMap
 */
public List<Sipregister> getSipregisterMap() {
	return sipregisterMap;
}
/**
 * setzt die Map SipregisterMap
 * @param map sipregisterMapMap
 */
 @SuppressWarnings("unchecked")
public void setSipregisterMap(List aList){
    sipregisterMap = aList;
   // sipregisterMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  yes | no: If set, anyone will be able to log in as a peer (with no check of credentials; useful for operation with SER). **/
	protected Boolean autocreatepeer;
	public static final String VALUEID_AUTOCREATEPEER="autocreatepeer" ;

    /**  0.0.0.0 :IP Address to bind to (listen on) **/
	protected String bindaddr;
	public static final String VALUEID_BINDADDR="bindaddr" ;

    /**  5060 :port to bind to (listen on) **/
	protected Integer bindport;
	public static final String VALUEID_BINDPORT="bindport" ;

    /**  update | yes | no (global setting) **/
	protected String canreinvite;
	public static final String VALUEID_CANREINVITE="canreinvite" ;

    /**  <contextname> :This is the default context and is used when a endpoint has no context property. The context in secton of a endpoint is used to route calls from that endpoint to the wanted destination. The context body is located in extensions.conf. **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  120 :Default length of incoming/outoing registration **/
	protected Integer defaultexpirey;
	public static final String VALUEID_DEFAULTEXPIREY="defaultexpirey" ;

    /**  inband | info | rfc2833 (global setting) **/
	protected Dtmfmode dtmfmode;
	public static final String VALUEID_DTMFMODE="dtmfmode" ;

    /**  200.201.202.203 :Address that we're going to put in SIP messages if we're behind a NAT **/
	protected String externip;
	public static final String VALUEID_EXTERNIP="externip" ;

    /**  hostname.tld : (new in Asterisk 1.2.x) **/
	protected String externhost;
	public static final String VALUEID_EXTERNHOST="externhost" ;

    /**  xxx : Specify how often a hostname DNS lookup should be performed for the value entered in 'externhost' (new in Asterisk 1.2.x) **/
	protected String externrefresh;
	public static final String VALUEID_EXTERNREFRESH="externrefresh" ;

    /**  192.168.1.0/255.255.255.0 :local network and mask **/
	protected String localnet;
	public static final String VALUEID_LOCALNET="localnet" ;

    /**  <domain> : Sets default From: domain in SIP messages when acting as a SIP ua (client) **/
	protected String fromdomain;
	public static final String VALUEID_FROMDOMAIN="fromdomain" ;

    /**  3600 :Max length of incoming registration we allow **/
	protected Integer maxexpirey;
	public static final String VALUEID_MAXEXPIREY="maxexpirey" ;

    /**  yes | no (per connection setting) Please note that in Asterisk 1.0.x nat can now have the values: no | never | route | yes. **/
	protected Boolean nat;
	public static final String VALUEID_NAT="nat" ;

    /**  text/plain :Allow overriding of mime type in MWI NOTIFY used in voicemail online messages. **/
	protected String notifymimetype;
	public static final String VALUEID_NOTIFYMIMETYPE="notifymimetype" ;

    /**  yes|no :Enable slow, pedantic checking of Call-ID:s, multiline SIP headers and URI-encoded headers **/
	protected Boolean pedantic;
	public static final String VALUEID_PEDANTIC="pedantic" ;

    /**  <portno>: Default SIP port. (this is not the port for Asterisk to listen. See bindport) **/
	protected Integer port;
	public static final String VALUEID_PORT="port" ;

    /**  yes | no Allows support for 302 Redirects; (No will redirect them all to the local extension returned in Contact rather than to that extension at the destination) **/
	protected Boolean promiscredir;
	public static final String VALUEID_PROMISCREDIR="promiscredir" ;

    /**  yes|no :Enable DNS SRV lookups on calls **/
	protected Boolean srvlookup;
	public static final String VALUEID_SRVLOOKUP="srvlookup" ;

    /**  <value>: Set IP QoS? parameters for outgoing media streams (numeric values are also accepted, like tos=184 ) **/
	protected String tos;
	public static final String VALUEID_TOS="tos" ;

    /**  yes|no : Turn on support for SIP video **/
	protected Boolean videosupport;
	public static final String VALUEID_VIDEOSUPPORT="videosupport" ;

    /**  Allow the SIP header "User-Agent" to be customized **/
	protected String useragent;
	public static final String VALUEID_USERAGENT="useragent" ;

    /**  yes|no : If Remote-Party-ID should be trusted **/
	protected Boolean trustrpid;
	public static final String VALUEID_TRUSTRPID="trustrpid" ;

    /**  my realm (Change authentication realm from Asterisk (default) to your own. Requires Asterisk v1.x) **/
	protected String realm;
	public static final String VALUEID_REALM="realm" ;

    /**  Terminate call if xx seconds of no RTP activity when we're not on hold **/
	protected Integer rtptimeout;
	public static final String VALUEID_RTPTIMEOUT="rtptimeout" ;

    /**  Relax dtmf handling **/
	protected Boolean relaxdtmf;
	public static final String VALUEID_RELAXDTMF="relaxdtmf" ;

    /**  when we're on hold (must be > rtptimeout) **/
	protected Integer rtpholdtimeout;
	public static final String VALUEID_RTPHOLDTIMEOUT="rtpholdtimeout" ;

    /**  If we should generate in-band ringing always **/
	protected String progressinband;
	public static final String VALUEID_PROGRESSINBAND="progressinband" ;

    /**  If yes, ";user=phone" is added to uri that contains a valid phone number. **/
	protected Boolean usereqphone;
	public static final String VALUEID_USEREQPHONE="usereqphone" ;

    /**   **/
	protected Boolean compactheaders;
	public static final String VALUEID_COMPACTHEADERS="compactheaders" ;

    /**   **/
	protected Boolean sipdebug;
	public static final String VALUEID_SIPDEBUG="sipdebug" ;

    /**   **/
	protected Integer checkmwi;
	public static final String VALUEID_CHECKMWI="checkmwi" ;

    /**   **/
	protected Boolean recordhistory;
	public static final String VALUEID_RECORDHISTORY="recordhistory" ;

    /**   **/
	protected CodecsSet allow;
	public static final String VALUEID_ALLOW="allow" ;

    /**   **/
	protected CodecsSet disallow;
	public static final String VALUEID_DISALLOW="disallow" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_AUTOCREATEPEER.equals(valueid)){
			return true;
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			return true;
		}
		if(VALUEID_BINDPORT.equals(valueid)){
			return true;
		}
		if(VALUEID_CANREINVITE.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_DEFAULTEXPIREY.equals(valueid)){
			return true;
		}
		if(VALUEID_DTMFMODE.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTERNIP.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTERNHOST.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTERNREFRESH.equals(valueid)){
			return true;
		}
		if(VALUEID_LOCALNET.equals(valueid)){
			return true;
		}
		if(VALUEID_FROMDOMAIN.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXEXPIREY.equals(valueid)){
			return true;
		}
		if(VALUEID_NAT.equals(valueid)){
			return true;
		}
		if(VALUEID_NOTIFYMIMETYPE.equals(valueid)){
			return true;
		}
		if(VALUEID_PEDANTIC.equals(valueid)){
			return true;
		}
		if(VALUEID_PORT.equals(valueid)){
			return true;
		}
		if(VALUEID_PROMISCREDIR.equals(valueid)){
			return true;
		}
		if(VALUEID_SRVLOOKUP.equals(valueid)){
			return true;
		}
		if(VALUEID_TOS.equals(valueid)){
			return true;
		}
		if(VALUEID_VIDEOSUPPORT.equals(valueid)){
			return true;
		}
		if(VALUEID_USERAGENT.equals(valueid)){
			return true;
		}
		if(VALUEID_TRUSTRPID.equals(valueid)){
			return true;
		}
		if(VALUEID_REALM.equals(valueid)){
			return true;
		}
		if(VALUEID_RTPTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_RELAXDTMF.equals(valueid)){
			return true;
		}
		if(VALUEID_RTPHOLDTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_PROGRESSINBAND.equals(valueid)){
			return true;
		}
		if(VALUEID_USEREQPHONE.equals(valueid)){
			return true;
		}
		if(VALUEID_COMPACTHEADERS.equals(valueid)){
			return true;
		}
		if(VALUEID_SIPDEBUG.equals(valueid)){
			return true;
		}
		if(VALUEID_CHECKMWI.equals(valueid)){
			return true;
		}
		if(VALUEID_RECORDHISTORY.equals(valueid)){
			return true;
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return true;
		}
		if(VALUEID_DISALLOW.equals(valueid)){
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
		if(VALUEID_AUTOCREATEPEER.equals(valueid)){
			if(data instanceof String){
		        setAutocreatepeer(new Boolean((String)data));
		        return;
		    }
			setAutocreatepeer((Boolean)data);
			return;
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			setBindaddr((String)data);
			return;
		}
		if(VALUEID_BINDPORT.equals(valueid)){
			if(data instanceof String){
		        setBindport(new Integer((String)data));
		        return;
		    }
			setBindport((Integer)data);
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
		if(VALUEID_DEFAULTEXPIREY.equals(valueid)){
			if(data instanceof String){
		        setDefaultexpirey(new Integer((String)data));
		        return;
		    }
			setDefaultexpirey((Integer)data);
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
		if(VALUEID_EXTERNIP.equals(valueid)){
			setExternip((String)data);
			return;
		}
		if(VALUEID_EXTERNHOST.equals(valueid)){
			setExternhost((String)data);
			return;
		}
		if(VALUEID_EXTERNREFRESH.equals(valueid)){
			setExternrefresh((String)data);
			return;
		}
		if(VALUEID_LOCALNET.equals(valueid)){
			setLocalnet((String)data);
			return;
		}
		if(VALUEID_FROMDOMAIN.equals(valueid)){
			setFromdomain((String)data);
			return;
		}
		if(VALUEID_MAXEXPIREY.equals(valueid)){
			if(data instanceof String){
		        setMaxexpirey(new Integer((String)data));
		        return;
		    }
			setMaxexpirey((Integer)data);
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
		if(VALUEID_NOTIFYMIMETYPE.equals(valueid)){
			setNotifymimetype((String)data);
			return;
		}
		if(VALUEID_PEDANTIC.equals(valueid)){
			if(data instanceof String){
		        setPedantic(new Boolean((String)data));
		        return;
		    }
			setPedantic((Boolean)data);
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
		if(VALUEID_PROMISCREDIR.equals(valueid)){
			if(data instanceof String){
		        setPromiscredir(new Boolean((String)data));
		        return;
		    }
			setPromiscredir((Boolean)data);
			return;
		}
		if(VALUEID_SRVLOOKUP.equals(valueid)){
			if(data instanceof String){
		        setSrvlookup(new Boolean((String)data));
		        return;
		    }
			setSrvlookup((Boolean)data);
			return;
		}
		if(VALUEID_TOS.equals(valueid)){
			setTos((String)data);
			return;
		}
		if(VALUEID_VIDEOSUPPORT.equals(valueid)){
			if(data instanceof String){
		        setVideosupport(new Boolean((String)data));
		        return;
		    }
			setVideosupport((Boolean)data);
			return;
		}
		if(VALUEID_USERAGENT.equals(valueid)){
			setUseragent((String)data);
			return;
		}
		if(VALUEID_TRUSTRPID.equals(valueid)){
			if(data instanceof String){
		        setTrustrpid(new Boolean((String)data));
		        return;
		    }
			setTrustrpid((Boolean)data);
			return;
		}
		if(VALUEID_REALM.equals(valueid)){
			setRealm((String)data);
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
		if(VALUEID_RELAXDTMF.equals(valueid)){
			if(data instanceof String){
		        setRelaxdtmf(new Boolean((String)data));
		        return;
		    }
			setRelaxdtmf((Boolean)data);
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
		if(VALUEID_PROGRESSINBAND.equals(valueid)){
			setProgressinband((String)data);
			return;
		}
		if(VALUEID_USEREQPHONE.equals(valueid)){
			if(data instanceof String){
		        setUsereqphone(new Boolean((String)data));
		        return;
		    }
			setUsereqphone((Boolean)data);
			return;
		}
		if(VALUEID_COMPACTHEADERS.equals(valueid)){
			if(data instanceof String){
		        setCompactheaders(new Boolean((String)data));
		        return;
		    }
			setCompactheaders((Boolean)data);
			return;
		}
		if(VALUEID_SIPDEBUG.equals(valueid)){
			if(data instanceof String){
		        setSipdebug(new Boolean((String)data));
		        return;
		    }
			setSipdebug((Boolean)data);
			return;
		}
		if(VALUEID_CHECKMWI.equals(valueid)){
			if(data instanceof String){
		        setCheckmwi(new Integer((String)data));
		        return;
		    }
			setCheckmwi((Integer)data);
			return;
		}
		if(VALUEID_RECORDHISTORY.equals(valueid)){
			if(data instanceof String){
		        setRecordhistory(new Boolean((String)data));
		        return;
		    }
			setRecordhistory((Boolean)data);
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
		if(VALUEID_DISALLOW.equals(valueid)){
			if(data instanceof String){
		        setDisallow(new CodecsSet((String)data));
		        return;
		    }
			setDisallow((CodecsSet)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_AUTOCREATEPEER.equals(valueid)){
			return getAutocreatepeer();
			
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			return getBindaddr();
			
		}
		if(VALUEID_BINDPORT.equals(valueid)){
			return getBindport();
			
		}
		if(VALUEID_CANREINVITE.equals(valueid)){
			return getCanreinvite();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_DEFAULTEXPIREY.equals(valueid)){
			return getDefaultexpirey();
			
		}
		if(VALUEID_DTMFMODE.equals(valueid)){
			return getDtmfmode();
			
		}
		if(VALUEID_EXTERNIP.equals(valueid)){
			return getExternip();
			
		}
		if(VALUEID_EXTERNHOST.equals(valueid)){
			return getExternhost();
			
		}
		if(VALUEID_EXTERNREFRESH.equals(valueid)){
			return getExternrefresh();
			
		}
		if(VALUEID_LOCALNET.equals(valueid)){
			return getLocalnet();
			
		}
		if(VALUEID_FROMDOMAIN.equals(valueid)){
			return getFromdomain();
			
		}
		if(VALUEID_MAXEXPIREY.equals(valueid)){
			return getMaxexpirey();
			
		}
		if(VALUEID_NAT.equals(valueid)){
			return getNat();
			
		}
		if(VALUEID_NOTIFYMIMETYPE.equals(valueid)){
			return getNotifymimetype();
			
		}
		if(VALUEID_PEDANTIC.equals(valueid)){
			return getPedantic();
			
		}
		if(VALUEID_PORT.equals(valueid)){
			return getPort();
			
		}
		if(VALUEID_PROMISCREDIR.equals(valueid)){
			return getPromiscredir();
			
		}
		if(VALUEID_SRVLOOKUP.equals(valueid)){
			return getSrvlookup();
			
		}
		if(VALUEID_TOS.equals(valueid)){
			return getTos();
			
		}
		if(VALUEID_VIDEOSUPPORT.equals(valueid)){
			return getVideosupport();
			
		}
		if(VALUEID_USERAGENT.equals(valueid)){
			return getUseragent();
			
		}
		if(VALUEID_TRUSTRPID.equals(valueid)){
			return getTrustrpid();
			
		}
		if(VALUEID_REALM.equals(valueid)){
			return getRealm();
			
		}
		if(VALUEID_RTPTIMEOUT.equals(valueid)){
			return getRtptimeout();
			
		}
		if(VALUEID_RELAXDTMF.equals(valueid)){
			return getRelaxdtmf();
			
		}
		if(VALUEID_RTPHOLDTIMEOUT.equals(valueid)){
			return getRtpholdtimeout();
			
		}
		if(VALUEID_PROGRESSINBAND.equals(valueid)){
			return getProgressinband();
			
		}
		if(VALUEID_USEREQPHONE.equals(valueid)){
			return getUsereqphone();
			
		}
		if(VALUEID_COMPACTHEADERS.equals(valueid)){
			return getCompactheaders();
			
		}
		if(VALUEID_SIPDEBUG.equals(valueid)){
			return getSipdebug();
			
		}
		if(VALUEID_CHECKMWI.equals(valueid)){
			return getCheckmwi();
			
		}
		if(VALUEID_RECORDHISTORY.equals(valueid)){
			return getRecordhistory();
			
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return getAllow();
			
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return getDisallow();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getautocreatepeer 
	* yes | no: If set, anyone will be able to log in as a peer (with no check of credentials; useful for operation with SER).
	**/
	public Boolean getAutocreatepeer(){		return  autocreatepeer;
	}
	/**
	*setautocreatepeer 
	*/
	public void setAutocreatepeer(Boolean aautocreatepeer){
		if(aautocreatepeer==null){
		    changed = (this.autocreatepeer!=null);
		    this.autocreatepeer = null;	    
		}else{
			changed = aautocreatepeer.equals(this.autocreatepeer);
			this.autocreatepeer=aautocreatepeer;
		}
	}


	/**
	* getbindaddr 
	* 0.0.0.0 :IP Address to bind to (listen on)
	**/
	public String getBindaddr(){		return  bindaddr;
	}
	/**
	*setbindaddr 
	*/
	public void setBindaddr(String abindaddr){
		if(abindaddr==null){
		    changed = (this.bindaddr!=null);
		    this.bindaddr = null;	    
		}else{
			changed = abindaddr.equals(this.bindaddr);
			this.bindaddr=abindaddr;
		}
	}


	/**
	* getbindport 
	* 5060 :port to bind to (listen on)
	**/
	public Integer getBindport(){		return  bindport;
	}
	/**
	*setbindport 
	*/
	public void setBindport(Integer abindport){
		if(abindport==null){
		    changed = (this.bindport!=null);
		    this.bindport = null;	    
		}else{
			changed = abindport.equals(this.bindport);
			this.bindport=abindport;
		}
	}


	/**
	* getcanreinvite 
	* update | yes | no (global setting)
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
	* <contextname> :This is the default context and is used when a endpoint has no context property. The context in secton of a endpoint is used to route calls from that endpoint to the wanted destination. The context body is located in extensions.conf.
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
	* getdefaultexpirey 
	* 120 :Default length of incoming/outoing registration
	**/
	public Integer getDefaultexpirey(){		return  defaultexpirey;
	}
	/**
	*setdefaultexpirey 
	*/
	public void setDefaultexpirey(Integer adefaultexpirey){
		if(adefaultexpirey==null){
		    changed = (this.defaultexpirey!=null);
		    this.defaultexpirey = null;	    
		}else{
			changed = adefaultexpirey.equals(this.defaultexpirey);
			this.defaultexpirey=adefaultexpirey;
		}
	}


	/**
	* getdtmfmode 
	* inband | info | rfc2833 (global setting)
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
	* getexternip 
	* 200.201.202.203 :Address that we're going to put in SIP messages if we're behind a NAT
	**/
	public String getExternip(){		return  externip;
	}
	/**
	*setexternip 
	*/
	public void setExternip(String aexternip){
		if(aexternip==null){
		    changed = (this.externip!=null);
		    this.externip = null;	    
		}else{
			changed = aexternip.equals(this.externip);
			this.externip=aexternip;
		}
	}


	/**
	* getexternhost 
	* hostname.tld : (new in Asterisk 1.2.x)
	**/
	public String getExternhost(){		return  externhost;
	}
	/**
	*setexternhost 
	*/
	public void setExternhost(String aexternhost){
		if(aexternhost==null){
		    changed = (this.externhost!=null);
		    this.externhost = null;	    
		}else{
			changed = aexternhost.equals(this.externhost);
			this.externhost=aexternhost;
		}
	}


	/**
	* getexternrefresh 
	* xxx : Specify how often a hostname DNS lookup should be performed for the value entered in 'externhost' (new in Asterisk 1.2.x)
	**/
	public String getExternrefresh(){		return  externrefresh;
	}
	/**
	*setexternrefresh 
	*/
	public void setExternrefresh(String aexternrefresh){
		if(aexternrefresh==null){
		    changed = (this.externrefresh!=null);
		    this.externrefresh = null;	    
		}else{
			changed = aexternrefresh.equals(this.externrefresh);
			this.externrefresh=aexternrefresh;
		}
	}


	/**
	* getlocalnet 
	* 192.168.1.0/255.255.255.0 :local network and mask
	**/
	public String getLocalnet(){		return  localnet;
	}
	/**
	*setlocalnet 
	*/
	public void setLocalnet(String alocalnet){
		if(alocalnet==null){
		    changed = (this.localnet!=null);
		    this.localnet = null;	    
		}else{
			changed = alocalnet.equals(this.localnet);
			this.localnet=alocalnet;
		}
	}


	/**
	* getfromdomain 
	* <domain> : Sets default From: domain in SIP messages when acting as a SIP ua (client)
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
	* getmaxexpirey 
	* 3600 :Max length of incoming registration we allow
	**/
	public Integer getMaxexpirey(){		return  maxexpirey;
	}
	/**
	*setmaxexpirey 
	*/
	public void setMaxexpirey(Integer amaxexpirey){
		if(amaxexpirey==null){
		    changed = (this.maxexpirey!=null);
		    this.maxexpirey = null;	    
		}else{
			changed = amaxexpirey.equals(this.maxexpirey);
			this.maxexpirey=amaxexpirey;
		}
	}


	/**
	* getnat 
	* yes | no (per connection setting) Please note that in Asterisk 1.0.x nat can now have the values: no | never | route | yes.
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
	* getnotifymimetype 
	* text/plain :Allow overriding of mime type in MWI NOTIFY used in voicemail online messages.
	**/
	public String getNotifymimetype(){		return  notifymimetype;
	}
	/**
	*setnotifymimetype 
	*/
	public void setNotifymimetype(String anotifymimetype){
		if(anotifymimetype==null){
		    changed = (this.notifymimetype!=null);
		    this.notifymimetype = null;	    
		}else{
			changed = anotifymimetype.equals(this.notifymimetype);
			this.notifymimetype=anotifymimetype;
		}
	}


	/**
	* getpedantic 
	* yes|no :Enable slow, pedantic checking of Call-ID:s, multiline SIP headers and URI-encoded headers
	**/
	public Boolean getPedantic(){		return  pedantic;
	}
	/**
	*setpedantic 
	*/
	public void setPedantic(Boolean apedantic){
		if(apedantic==null){
		    changed = (this.pedantic!=null);
		    this.pedantic = null;	    
		}else{
			changed = apedantic.equals(this.pedantic);
			this.pedantic=apedantic;
		}
	}


	/**
	* getport 
	* <portno>: Default SIP port. (this is not the port for Asterisk to listen. See bindport)
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
	* getpromiscredir 
	* yes | no Allows support for 302 Redirects; (No will redirect them all to the local extension returned in Contact rather than to that extension at the destination)
	**/
	public Boolean getPromiscredir(){		return  promiscredir;
	}
	/**
	*setpromiscredir 
	*/
	public void setPromiscredir(Boolean apromiscredir){
		if(apromiscredir==null){
		    changed = (this.promiscredir!=null);
		    this.promiscredir = null;	    
		}else{
			changed = apromiscredir.equals(this.promiscredir);
			this.promiscredir=apromiscredir;
		}
	}


	/**
	* getsrvlookup 
	* yes|no :Enable DNS SRV lookups on calls
	**/
	public Boolean getSrvlookup(){		return  srvlookup;
	}
	/**
	*setsrvlookup 
	*/
	public void setSrvlookup(Boolean asrvlookup){
		if(asrvlookup==null){
		    changed = (this.srvlookup!=null);
		    this.srvlookup = null;	    
		}else{
			changed = asrvlookup.equals(this.srvlookup);
			this.srvlookup=asrvlookup;
		}
	}


	/**
	* gettos 
	* <value>: Set IP QoS? parameters for outgoing media streams (numeric values are also accepted, like tos=184 )
	**/
	public String getTos(){		return  tos;
	}
	/**
	*settos 
	*/
	public void setTos(String atos){
		if(atos==null){
		    changed = (this.tos!=null);
		    this.tos = null;	    
		}else{
			changed = atos.equals(this.tos);
			this.tos=atos;
		}
	}


	/**
	* getvideosupport 
	* yes|no : Turn on support for SIP video
	**/
	public Boolean getVideosupport(){		return  videosupport;
	}
	/**
	*setvideosupport 
	*/
	public void setVideosupport(Boolean avideosupport){
		if(avideosupport==null){
		    changed = (this.videosupport!=null);
		    this.videosupport = null;	    
		}else{
			changed = avideosupport.equals(this.videosupport);
			this.videosupport=avideosupport;
		}
	}


	/**
	* getuseragent 
	* Allow the SIP header "User-Agent" to be customized
	**/
	public String getUseragent(){		return  useragent;
	}
	/**
	*setuseragent 
	*/
	public void setUseragent(String auseragent){
		if(auseragent==null){
		    changed = (this.useragent!=null);
		    this.useragent = null;	    
		}else{
			changed = auseragent.equals(this.useragent);
			this.useragent=auseragent;
		}
	}


	/**
	* gettrustrpid 
	* yes|no : If Remote-Party-ID should be trusted
	**/
	public Boolean getTrustrpid(){		return  trustrpid;
	}
	/**
	*settrustrpid 
	*/
	public void setTrustrpid(Boolean atrustrpid){
		if(atrustrpid==null){
		    changed = (this.trustrpid!=null);
		    this.trustrpid = null;	    
		}else{
			changed = atrustrpid.equals(this.trustrpid);
			this.trustrpid=atrustrpid;
		}
	}


	/**
	* getrealm 
	* my realm (Change authentication realm from Asterisk (default) to your own. Requires Asterisk v1.x)
	**/
	public String getRealm(){		return  realm;
	}
	/**
	*setrealm 
	*/
	public void setRealm(String arealm){
		if(arealm==null){
		    changed = (this.realm!=null);
		    this.realm = null;	    
		}else{
			changed = arealm.equals(this.realm);
			this.realm=arealm;
		}
	}


	/**
	* getrtptimeout 
	* Terminate call if xx seconds of no RTP activity when we're not on hold
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
	* getrelaxdtmf 
	* Relax dtmf handling
	**/
	public Boolean getRelaxdtmf(){		return  relaxdtmf;
	}
	/**
	*setrelaxdtmf 
	*/
	public void setRelaxdtmf(Boolean arelaxdtmf){
		if(arelaxdtmf==null){
		    changed = (this.relaxdtmf!=null);
		    this.relaxdtmf = null;	    
		}else{
			changed = arelaxdtmf.equals(this.relaxdtmf);
			this.relaxdtmf=arelaxdtmf;
		}
	}


	/**
	* getrtpholdtimeout 
	* when we're on hold (must be > rtptimeout)
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
	* getprogressinband 
	* If we should generate in-band ringing always
	**/
	public String getProgressinband(){		return  progressinband;
	}
	/**
	*setprogressinband 
	*/
	public void setProgressinband(String aprogressinband){
		if(aprogressinband==null){
		    changed = (this.progressinband!=null);
		    this.progressinband = null;	    
		}else{
			changed = aprogressinband.equals(this.progressinband);
			this.progressinband=aprogressinband;
		}
	}


	/**
	* getusereqphone 
	* If yes, ";user=phone" is added to uri that contains a valid phone number.
	**/
	public Boolean getUsereqphone(){		return  usereqphone;
	}
	/**
	*setusereqphone 
	*/
	public void setUsereqphone(Boolean ausereqphone){
		if(ausereqphone==null){
		    changed = (this.usereqphone!=null);
		    this.usereqphone = null;	    
		}else{
			changed = ausereqphone.equals(this.usereqphone);
			this.usereqphone=ausereqphone;
		}
	}


	/**
	* getcompactheaders 
	* 
	**/
	public Boolean getCompactheaders(){		return  compactheaders;
	}
	/**
	*setcompactheaders 
	*/
	public void setCompactheaders(Boolean acompactheaders){
		if(acompactheaders==null){
		    changed = (this.compactheaders!=null);
		    this.compactheaders = null;	    
		}else{
			changed = acompactheaders.equals(this.compactheaders);
			this.compactheaders=acompactheaders;
		}
	}


	/**
	* getsipdebug 
	* 
	**/
	public Boolean getSipdebug(){		return  sipdebug;
	}
	/**
	*setsipdebug 
	*/
	public void setSipdebug(Boolean asipdebug){
		if(asipdebug==null){
		    changed = (this.sipdebug!=null);
		    this.sipdebug = null;	    
		}else{
			changed = asipdebug.equals(this.sipdebug);
			this.sipdebug=asipdebug;
		}
	}


	/**
	* getcheckmwi 
	* 
	**/
	public Integer getCheckmwi(){		return  checkmwi;
	}
	/**
	*setcheckmwi 
	*/
	public void setCheckmwi(Integer acheckmwi){
		if(acheckmwi==null){
		    changed = (this.checkmwi!=null);
		    this.checkmwi = null;	    
		}else{
			changed = acheckmwi.equals(this.checkmwi);
			this.checkmwi=acheckmwi;
		}
	}


	/**
	* getrecordhistory 
	* 
	**/
	public Boolean getRecordhistory(){		return  recordhistory;
	}
	/**
	*setrecordhistory 
	*/
	public void setRecordhistory(Boolean arecordhistory){
		if(arecordhistory==null){
		    changed = (this.recordhistory!=null);
		    this.recordhistory = null;	    
		}else{
			changed = arecordhistory.equals(this.recordhistory);
			this.recordhistory=arecordhistory;
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("autocreatepeer=")
		.append(autocreatepeer)
		.append(",")
		.append("bindaddr=")
		.append(bindaddr)
		.append(",")
		.append("bindport=")
		.append(bindport)
		.append(",")
		.append("canreinvite=")
		.append(canreinvite)
		.append(",")
		.append("context=")
		.append(context)
		.append(",")
		.append("defaultexpirey=")
		.append(defaultexpirey)
		.append(",")
		.append("dtmfmode=")
		.append(dtmfmode)
		.append(",")
		.append("externip=")
		.append(externip)
		.append(",")
		.append("externhost=")
		.append(externhost)
		.append(",")
		.append("externrefresh=")
		.append(externrefresh)
		.append(",")
		.append("localnet=")
		.append(localnet)
		.append(",")
		.append("fromdomain=")
		.append(fromdomain)
		.append(",")
		.append("maxexpirey=")
		.append(maxexpirey)
		.append(",")
		.append("nat=")
		.append(nat)
		.append(",")
		.append("notifymimetype=")
		.append(notifymimetype)
		.append(",")
		.append("pedantic=")
		.append(pedantic)
		.append(",")
		.append("port=")
		.append(port)
		.append(",")
		.append("promiscredir=")
		.append(promiscredir)
		.append(",")
		.append("srvlookup=")
		.append(srvlookup)
		.append(",")
		.append("tos=")
		.append(tos)
		.append(",")
		.append("videosupport=")
		.append(videosupport)
		.append(",")
		.append("useragent=")
		.append(useragent)
		.append(",")
		.append("trustrpid=")
		.append(trustrpid)
		.append(",")
		.append("realm=")
		.append(realm)
		.append(",")
		.append("rtptimeout=")
		.append(rtptimeout)
		.append(",")
		.append("relaxdtmf=")
		.append(relaxdtmf)
		.append(",")
		.append("rtpholdtimeout=")
		.append(rtpholdtimeout)
		.append(",")
		.append("progressinband=")
		.append(progressinband)
		.append(",")
		.append("usereqphone=")
		.append(usereqphone)
		.append(",")
		.append("compactheaders=")
		.append(compactheaders)
		.append(",")
		.append("sipdebug=")
		.append(sipdebug)
		.append(",")
		.append("checkmwi=")
		.append(checkmwi)
		.append(",")
		.append("recordhistory=")
		.append(recordhistory)
		.append(",")
		.append("allow=")
		.append(allow)
		.append(",")
		.append("disallow=")
		.append(disallow)
    			.append("]");

		return sb.toString();		
	}}