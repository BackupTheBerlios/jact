package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;


/**
 * <p>
 * Iaxgeneral<br>
 * Global settings  Inter-Asterisk eXchange driver definition This configuration is re-read at reload or with the CLI command reload chan_iax2.so General settings, like port number to bind to, and an option address (the default is to bind to all local addresses).
 * </p>
 * Created : Fri May 26 14:31:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Iaxgeneral.java,v 1.1 2008/06/24 20:45:11 urszeidler Exp $
 */
 public  class Iaxgeneral extends AbstractSimpleDataClass implements IIaxgeneral{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Iaxgeneral
	**/
	public Iaxgeneral(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Iaxgeneral
	**/
	public Iaxgeneral( Integer abindport, String abindaddr, String aiaxcompat, Boolean anochecksums, Boolean adelayreject, Amaflags aamaflags, String aaccountcode, String alanguage, String abandwidth, Integer atrunktimestamps, String aauthdebug, String atos, Boolean amailboxdetail, String aregcontext, Boolean aautokill, String acodecpriority, Integer artcachefriends, Boolean artupdate, Boolean artautoclear, Boolean artignoreexpire, Integer atrunkfreq, CodecsSet adisallow, CodecsSet aallow, Integer aminregexpire, Integer amaxregexpire, Boolean anotransfer){
		super();
	
		this.bindport = abindport;	
		this.bindaddr = abindaddr;	
		this.iaxcompat = aiaxcompat;	
		this.nochecksums = anochecksums;	
		this.delayreject = adelayreject;	
		this.amaflags = aamaflags;	
		this.accountcode = aaccountcode;	
		this.language = alanguage;	
		this.bandwidth = abandwidth;	
		this.trunktimestamps = atrunktimestamps;	
		this.authdebug = aauthdebug;	
		this.tos = atos;	
		this.mailboxdetail = amailboxdetail;	
		this.regcontext = aregcontext;	
		this.autokill = aautokill;	
		this.codecpriority = acodecpriority;	
		this.rtcachefriends = artcachefriends;	
		this.rtupdate = artupdate;	
		this.rtautoclear = artautoclear;	
		this.rtignoreexpire = artignoreexpire;	
		this.trunkfreq = atrunkfreq;	
		this.disallow = adisallow;	
		this.allow = aallow;	
		this.minregexpire = aminregexpire;	
		this.maxregexpire = amaxregexpire;	
		this.notransfer = anotransfer;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Iaxgeneral object){
		this.bindport = object.bindport;	
		this.bindaddr = object.bindaddr;	
		this.iaxcompat = object.iaxcompat;	
		this.nochecksums = object.nochecksums;	
		this.delayreject = object.delayreject;	
		this.amaflags = object.amaflags;	
		this.accountcode = object.accountcode;	
		this.language = object.language;	
		this.bandwidth = object.bandwidth;	
		this.trunktimestamps = object.trunktimestamps;	
		this.authdebug = object.authdebug;	
		this.tos = object.tos;	
		this.mailboxdetail = object.mailboxdetail;	
		this.regcontext = object.regcontext;	
		this.autokill = object.autokill;	
		this.codecpriority = object.codecpriority;	
		this.rtcachefriends = object.rtcachefriends;	
		this.rtupdate = object.rtupdate;	
		this.rtautoclear = object.rtautoclear;	
		this.rtignoreexpire = object.rtignoreexpire;	
		this.trunkfreq = object.trunkfreq;	
		this.disallow = object.disallow;	
		this.allow = object.allow;	
		this.minregexpire = object.minregexpire;	
		this.maxregexpire = object.maxregexpire;	
		this.notransfer = object.notransfer;	

	}
//--------------  map Funktionen
	//public static final String IAXPEERMAP = "iaxpeerMap";
	/** die typisierte List die die Aggregierten objekte(IaxpeerImpl) enthält */
	protected List<Iaxpeer> iaxpeerMap = new ArrayList<Iaxpeer>();
	//public static final String IAXREGISTERMAP = "iaxregisterMap";
	/** die typisierte List die die Aggregierten objekte(IaxregisterImpl) enthält */
	protected List<Iaxregister> iaxregisterMap = new ArrayList<Iaxregister>();
	/** die typisierte Map die die Aggregierten objekte(IaxpeerImpl) enthält */
	//protected IaxpeerMap iaxpeerMapMap = new IaxpeerMap();
	/** die typisierte Map die die Aggregierten objekte(IaxregisterImpl) enthält */
	//protected IaxregisterMap iaxregisterMapMap = new IaxregisterMap();

	/**
	 * fügt ein Iaxpeer Objekt zu der Mapp hinzu
	 * @param aIaxpeer
	 */
	public boolean addIaxpeer(Iaxpeer aIaxpeer){
		return iaxpeerMap.add(aIaxpeer);
	}

	/**
	 * removed ein Iaxpeer Objekt aus der Map
	 * @param aIaxpeer
	 */
	public boolean removeIaxpeer(Iaxpeer aIaxpeer){
		return iaxpeerMap.remove(aIaxpeer);
	}


	/**
	 * fügt ein Iaxregister Objekt zu der Mapp hinzu
	 * @param aIaxregister
	 */
	public boolean addIaxregister(Iaxregister aIaxregister){
		return iaxregisterMap.add(aIaxregister);
	}

	/**
	 * removed ein Iaxregister Objekt aus der Map
	 * @param aIaxregister
	 */
	public boolean removeIaxregister(Iaxregister aIaxregister){
		return iaxregisterMap.remove(aIaxregister);
	}

	

/**
 * gibt die List<Iaxpeer> iaxpeerMap zurück	
 * @return List<Iaxpeer>
 * @see  IIaxgeneral#getIaxpeerMap
 */
public List<Iaxpeer> getIaxpeerMap() {
	return iaxpeerMap;
}
/**
 * setzt die Map IaxpeerMap
 * @param map iaxpeerMapMap
 */
 @SuppressWarnings("unchecked")
public void setIaxpeerMap(List aList){
    iaxpeerMap = aList;
   // iaxpeerMapTyper.setList(aList); 
}


/**
 * gibt die List<Iaxregister> iaxregisterMap zurück	
 * @return List<Iaxregister>
 * @see  IIaxgeneral#getIaxregisterMap
 */
public List<Iaxregister> getIaxregisterMap() {
	return iaxregisterMap;
}
/**
 * setzt die Map IaxregisterMap
 * @param map iaxregisterMapMap
 */
 @SuppressWarnings("unchecked")
public void setIaxregisterMap(List aList){
    iaxregisterMap = aList;
   // iaxregisterMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Iaxjitter fIaxjitter= new IaxjitterImpl();
/**
 * @return
 */
public Iaxjitter getIaxjitter() {
	return fIaxjitter;
}

/**
 * setzt den Iaxjitter und die Iaxjitterid	
 * @param Iaxjitter
 */
public void setIaxjitter(IIaxjitter aIaxjitter) {
	if (aIaxjitter!=null) {
	fIaxjitter = (Iaxjitter)aIaxjitter;
	//iaxjitter = aIaxjitter.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  bindport and bindaddr may be specified NOTE: bindport must be specified BEFORE bindaddr or may be specified on a specific bindaddr if followed by **/
	protected Integer bindport;
	public static final String VALUEID_BINDPORT="bindport" ;

    /**  addresses, but the first will be the  default **/
	protected String bindaddr;
	public static final String VALUEID_BINDADDR="bindaddr" ;

    /**  Set iaxcompat to yes if you plan to use layered switches or some other scenario which may cause some delay when doing a lookup in the dialplan. It incurs a small performance hit to enable it. This option causes Asterisk to spawn a separate thread when it receives an IAX DPREQ (Dialplan Request) instead of blocking while it waits for a response. **/
	protected String iaxcompat;
	public static final String VALUEID_IAXCOMPAT="iaxcompat" ;

    /**  Disable UDP checksums (if nochecksums is set, then no checkums will be calculated/checked on systems supporting this feature) **/
	protected Boolean nochecksums;
	public static final String VALUEID_NOCHECKSUMS="nochecksums" ;

    /**  For increased security against brute force password attacks enable "delayreject" which will delay the sending of authentication reject for REGREQ or AUTHREP if there is a password. **/
	protected Boolean delayreject;
	public static final String VALUEID_DELAYREJECT="delayreject" ;

    /**  You may specify a global default AMA flag for iaxtel calls.  It must be one of 'default', 'omit', 'billing', or 'documentation'.  These flags are used in the generation of call detail records. **/
	protected Amaflags amaflags;
	public static final String VALUEID_AMAFLAGS="amaflags" ;

    /**  You may specify a default account for Call Detail Records in addition to specifying on a per-user basis **/
	protected String accountcode;
	public static final String VALUEID_ACCOUNTCODE="accountcode" ;

    /**  You may specify a global default language for users.  Can be specified also on a per-user basis If omitted, will fallback to english **/
	protected String language;
	public static final String VALUEID_LANGUAGE="language" ;

    /**  Specify bandwidth of low, medium, or high to control which codecs are used in general. **/
	protected String bandwidth;
	public static final String VALUEID_BANDWIDTH="bandwidth" ;

    /**  Should we send timestamps for the individual sub-frames within trunk frames? There is a small bandwidth use for these (less than 1kbps/call), but they ensure that frame timestamps get sent end-to-end properly.  If both ends of all your trunks go directly to TDM, _and_ your trunkfreq equals the frame length for your codecs, you  can probably suppress these.  The receiver must also support this feature, although they do not also need to have it enabled. **/
	protected Integer trunktimestamps;
	public static final String VALUEID_TRUNKTIMESTAMPS="trunktimestamps" ;

    /**  You can disable authentication debugging to reduce the amount of  debugging traffic. **/
	protected String authdebug;
	public static final String VALUEID_AUTHDEBUG="authdebug" ;

    /**  Finally, you can set values for your TOS bits to help improve  performance.  Valid values are:   lowdelay		-- Minimize delay   throughput		-- Maximize throughput   reliability		-- Maximize reliability   mincost		-- Minimize cost   none		-- No flags **/
	protected String tos;
	public static final String VALUEID_TOS="tos" ;

    /**  If mailboxdetail is set to "yes", the user receives the actual new/old message counts, not just a yes/no as to whether they have messages.  this can be set on a per-peer basis as well **/
	protected Boolean mailboxdetail;
	public static final String VALUEID_MAILBOXDETAIL="mailboxdetail" ;

    /**  If regcontext is specified, Asterisk will dynamically  create and destroy a NoOp priority 1 extension for a given peer who registers or unregisters with us.  The actual extension is the 'regexten' parameter of the registering peer or its name if 'regexten' is not provided.  More than one regexten may be supplied if they are separated by '&'.  Patterns may be used in regexten. **/
	protected String regcontext;
	public static final String VALUEID_REGCONTEXT="regcontext" ;

    /**  If we don't get ACK to our NEW within 2000ms, and autokill is set to yes, then we cancel the whole thing (that's enough time for one  retransmission only).  This is used to keep things from stalling for a long time for a host that is not available, but would be ill advised for bad  connections.  In addition to 'yes' or 'no' you can also specify a number of milliseconds.  See 'qualify' for individual peers to turn on for just a specific peer. **/
	protected Boolean autokill;
	public static final String VALUEID_AUTOKILL="autokill" ;

    /**  codecpriority controls the codec negotiation of an inbound IAX call. This option is inherited to all user entities.  It can also be defined  in each user entity separately which will override the setting in general.

The valid values are: caller   - Consider the callers preferred order ahead of the host's. host     - Consider the host's preferred order ahead of the caller's. disabled - Disable the consideration of codec preference alltogether.            (this is the original behaviour before preferences were added) reqonly  - Same as disabled, only do not consider capabilities if            the requested format is not available the call will only            be accepted if the requested format is available.

The default value is 'host' **/
	protected String codecpriority;
	public static final String VALUEID_CODECPRIORITY="codecpriority" ;

    /**  Cache realtime friends by adding them to the internal list just like friends added from the config file only on a as-needed basis. **/
	protected Integer rtcachefriends;
	public static final String VALUEID_RTCACHEFRIENDS="rtcachefriends" ;

    /**  Send registry updates to database using realtime? (yes|no) If set to yes, when a IAX2 peer registers successfully, the ip address,the origination port, the registration period, and the username of the origination port, the registration period, and the username of  the peer will be set to database via realtime. If not present, defaults to 'yes'. **/
	protected Boolean rtupdate;
	public static final String VALUEID_RTUPDATE="rtupdate" ;

    /**  Auto-Expire friends created on the fly on the same schedule as if it had just registered when the registration expires the friend will vanish from the configuration until requested again.  If set to an integer, friends expire within this number of seconds instead of the same as the registration interval **/
	protected Boolean rtautoclear;
	public static final String VALUEID_RTAUTOCLEAR="rtautoclear" ;

    /**  when reading a peer from Realtime, if the peer's registration has expired based on its registration interval, used the stored  address information regardless **/
	protected Boolean rtignoreexpire;
	public static final String VALUEID_RTIGNOREEXPIRE="rtignoreexpire" ;

    /**  How frequently to send trunk msgs (in ms) **/
	protected Integer trunkfreq;
	public static final String VALUEID_TRUNKFREQ="trunkfreq" ;

    /**  all :Disallow all codecs (global configuration) **/
	protected CodecsSet disallow;
	public static final String VALUEID_DISALLOW="disallow" ;

    /**  Allow codecs in order of preference (Use DISALLOW=ALL first, before allowing other codecs) **/
	protected CodecsSet allow;
	public static final String VALUEID_ALLOW="allow" ;

    /**  Minimum and maximum amounts of time that IAX peers can request as a registration expiration interval (in seconds). **/
	protected Integer minregexpire;
	public static final String VALUEID_MINREGEXPIRE="minregexpire" ;

    /**   **/
	protected Integer maxregexpire;
	public static final String VALUEID_MAXREGEXPIRE="maxregexpire" ;

    /**   **/
	protected Boolean notransfer;
	public static final String VALUEID_NOTRANSFER="notransfer" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_BINDPORT.equals(valueid)){
			return true;
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			return true;
		}
		if(VALUEID_IAXCOMPAT.equals(valueid)){
			return true;
		}
		if(VALUEID_NOCHECKSUMS.equals(valueid)){
			return true;
		}
		if(VALUEID_DELAYREJECT.equals(valueid)){
			return true;
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			return true;
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return true;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return true;
		}
		if(VALUEID_BANDWIDTH.equals(valueid)){
			return true;
		}
		if(VALUEID_TRUNKTIMESTAMPS.equals(valueid)){
			return true;
		}
		if(VALUEID_AUTHDEBUG.equals(valueid)){
			return true;
		}
		if(VALUEID_TOS.equals(valueid)){
			return true;
		}
		if(VALUEID_MAILBOXDETAIL.equals(valueid)){
			return true;
		}
		if(VALUEID_REGCONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_AUTOKILL.equals(valueid)){
			return true;
		}
		if(VALUEID_CODECPRIORITY.equals(valueid)){
			return true;
		}
		if(VALUEID_RTCACHEFRIENDS.equals(valueid)){
			return true;
		}
		if(VALUEID_RTUPDATE.equals(valueid)){
			return true;
		}
		if(VALUEID_RTAUTOCLEAR.equals(valueid)){
			return true;
		}
		if(VALUEID_RTIGNOREEXPIRE.equals(valueid)){
			return true;
		}
		if(VALUEID_TRUNKFREQ.equals(valueid)){
			return true;
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return true;
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return true;
		}
		if(VALUEID_MINREGEXPIRE.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXREGEXPIRE.equals(valueid)){
			return true;
		}
		if(VALUEID_NOTRANSFER.equals(valueid)){
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
		if(VALUEID_BINDPORT.equals(valueid)){
			if(data instanceof String){
		        setBindport(new Integer((String)data));
		        return;
		    }
			setBindport((Integer)data);
			return;
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			setBindaddr((String)data);
			return;
		}
		if(VALUEID_IAXCOMPAT.equals(valueid)){
			setIaxcompat((String)data);
			return;
		}
		if(VALUEID_NOCHECKSUMS.equals(valueid)){
			if(data instanceof String){
		        setNochecksums(new Boolean((String)data));
		        return;
		    }
			setNochecksums((Boolean)data);
			return;
		}
		if(VALUEID_DELAYREJECT.equals(valueid)){
			if(data instanceof String){
		        setDelayreject(new Boolean((String)data));
		        return;
		    }
			setDelayreject((Boolean)data);
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
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			setAccountcode((String)data);
			return;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			setLanguage((String)data);
			return;
		}
		if(VALUEID_BANDWIDTH.equals(valueid)){
			setBandwidth((String)data);
			return;
		}
		if(VALUEID_TRUNKTIMESTAMPS.equals(valueid)){
			if(data instanceof String){
		        setTrunktimestamps(new Integer((String)data));
		        return;
		    }
			setTrunktimestamps((Integer)data);
			return;
		}
		if(VALUEID_AUTHDEBUG.equals(valueid)){
			setAuthdebug((String)data);
			return;
		}
		if(VALUEID_TOS.equals(valueid)){
			setTos((String)data);
			return;
		}
		if(VALUEID_MAILBOXDETAIL.equals(valueid)){
			if(data instanceof String){
		        setMailboxdetail(new Boolean((String)data));
		        return;
		    }
			setMailboxdetail((Boolean)data);
			return;
		}
		if(VALUEID_REGCONTEXT.equals(valueid)){
			setRegcontext((String)data);
			return;
		}
		if(VALUEID_AUTOKILL.equals(valueid)){
			if(data instanceof String){
		        setAutokill(new Boolean((String)data));
		        return;
		    }
			setAutokill((Boolean)data);
			return;
		}
		if(VALUEID_CODECPRIORITY.equals(valueid)){
			setCodecpriority((String)data);
			return;
		}
		if(VALUEID_RTCACHEFRIENDS.equals(valueid)){
			if(data instanceof String){
		        setRtcachefriends(new Integer((String)data));
		        return;
		    }
			setRtcachefriends((Integer)data);
			return;
		}
		if(VALUEID_RTUPDATE.equals(valueid)){
			if(data instanceof String){
		        setRtupdate(new Boolean((String)data));
		        return;
		    }
			setRtupdate((Boolean)data);
			return;
		}
		if(VALUEID_RTAUTOCLEAR.equals(valueid)){
			if(data instanceof String){
		        setRtautoclear(new Boolean((String)data));
		        return;
		    }
			setRtautoclear((Boolean)data);
			return;
		}
		if(VALUEID_RTIGNOREEXPIRE.equals(valueid)){
			if(data instanceof String){
		        setRtignoreexpire(new Boolean((String)data));
		        return;
		    }
			setRtignoreexpire((Boolean)data);
			return;
		}
		if(VALUEID_TRUNKFREQ.equals(valueid)){
			if(data instanceof String){
		        setTrunkfreq(new Integer((String)data));
		        return;
		    }
			setTrunkfreq((Integer)data);
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
		if(VALUEID_MINREGEXPIRE.equals(valueid)){
			if(data instanceof String){
		        setMinregexpire(new Integer((String)data));
		        return;
		    }
			setMinregexpire((Integer)data);
			return;
		}
		if(VALUEID_MAXREGEXPIRE.equals(valueid)){
			if(data instanceof String){
		        setMaxregexpire(new Integer((String)data));
		        return;
		    }
			setMaxregexpire((Integer)data);
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
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_BINDPORT.equals(valueid)){
			return getBindport();
			
		}
		if(VALUEID_BINDADDR.equals(valueid)){
			return getBindaddr();
			
		}
		if(VALUEID_IAXCOMPAT.equals(valueid)){
			return getIaxcompat();
			
		}
		if(VALUEID_NOCHECKSUMS.equals(valueid)){
			return getNochecksums();
			
		}
		if(VALUEID_DELAYREJECT.equals(valueid)){
			return getDelayreject();
			
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			return getAmaflags();
			
		}
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return getAccountcode();
			
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return getLanguage();
			
		}
		if(VALUEID_BANDWIDTH.equals(valueid)){
			return getBandwidth();
			
		}
		if(VALUEID_TRUNKTIMESTAMPS.equals(valueid)){
			return getTrunktimestamps();
			
		}
		if(VALUEID_AUTHDEBUG.equals(valueid)){
			return getAuthdebug();
			
		}
		if(VALUEID_TOS.equals(valueid)){
			return getTos();
			
		}
		if(VALUEID_MAILBOXDETAIL.equals(valueid)){
			return getMailboxdetail();
			
		}
		if(VALUEID_REGCONTEXT.equals(valueid)){
			return getRegcontext();
			
		}
		if(VALUEID_AUTOKILL.equals(valueid)){
			return getAutokill();
			
		}
		if(VALUEID_CODECPRIORITY.equals(valueid)){
			return getCodecpriority();
			
		}
		if(VALUEID_RTCACHEFRIENDS.equals(valueid)){
			return getRtcachefriends();
			
		}
		if(VALUEID_RTUPDATE.equals(valueid)){
			return getRtupdate();
			
		}
		if(VALUEID_RTAUTOCLEAR.equals(valueid)){
			return getRtautoclear();
			
		}
		if(VALUEID_RTIGNOREEXPIRE.equals(valueid)){
			return getRtignoreexpire();
			
		}
		if(VALUEID_TRUNKFREQ.equals(valueid)){
			return getTrunkfreq();
			
		}
		if(VALUEID_DISALLOW.equals(valueid)){
			return getDisallow();
			
		}
		if(VALUEID_ALLOW.equals(valueid)){
			return getAllow();
			
		}
		if(VALUEID_MINREGEXPIRE.equals(valueid)){
			return getMinregexpire();
			
		}
		if(VALUEID_MAXREGEXPIRE.equals(valueid)){
			return getMaxregexpire();
			
		}
		if(VALUEID_NOTRANSFER.equals(valueid)){
			return getNotransfer();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getbindport 
	* bindport and bindaddr may be specified NOTE: bindport must be specified BEFORE bindaddr or may be specified on a specific bindaddr if followed by
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
	* getbindaddr 
	* addresses, but the first will be the  default
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
	* getiaxcompat 
	* Set iaxcompat to yes if you plan to use layered switches or some other scenario which may cause some delay when doing a lookup in the dialplan. It incurs a small performance hit to enable it. This option causes Asterisk to spawn a separate thread when it receives an IAX DPREQ (Dialplan Request) instead of blocking while it waits for a response.
	**/
	public String getIaxcompat(){		return  iaxcompat;
	}
	/**
	*setiaxcompat 
	*/
	public void setIaxcompat(String aiaxcompat){
		if(aiaxcompat==null){
		    changed = (this.iaxcompat!=null);
		    this.iaxcompat = null;	    
		}else{
			changed = aiaxcompat.equals(this.iaxcompat);
			this.iaxcompat=aiaxcompat;
		}
	}


	/**
	* getnochecksums 
	* Disable UDP checksums (if nochecksums is set, then no checkums will be calculated/checked on systems supporting this feature)
	**/
	public Boolean getNochecksums(){		return  nochecksums;
	}
	/**
	*setnochecksums 
	*/
	public void setNochecksums(Boolean anochecksums){
		if(anochecksums==null){
		    changed = (this.nochecksums!=null);
		    this.nochecksums = null;	    
		}else{
			changed = anochecksums.equals(this.nochecksums);
			this.nochecksums=anochecksums;
		}
	}


	/**
	* getdelayreject 
	* For increased security against brute force password attacks enable "delayreject" which will delay the sending of authentication reject for REGREQ or AUTHREP if there is a password.
	**/
	public Boolean getDelayreject(){		return  delayreject;
	}
	/**
	*setdelayreject 
	*/
	public void setDelayreject(Boolean adelayreject){
		if(adelayreject==null){
		    changed = (this.delayreject!=null);
		    this.delayreject = null;	    
		}else{
			changed = adelayreject.equals(this.delayreject);
			this.delayreject=adelayreject;
		}
	}


	/**
	* getamaflags 
	* You may specify a global default AMA flag for iaxtel calls.  It must be one of 'default', 'omit', 'billing', or 'documentation'.  These flags are used in the generation of call detail records.
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
	* getaccountcode 
	* You may specify a default account for Call Detail Records in addition to specifying on a per-user basis
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
	* getlanguage 
	* You may specify a global default language for users.  Can be specified also on a per-user basis If omitted, will fallback to english
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
	* getbandwidth 
	* Specify bandwidth of low, medium, or high to control which codecs are used in general.
	**/
	public String getBandwidth(){		return  bandwidth;
	}
	/**
	*setbandwidth 
	*/
	public void setBandwidth(String abandwidth){
		if(abandwidth==null){
		    changed = (this.bandwidth!=null);
		    this.bandwidth = null;	    
		}else{
			changed = abandwidth.equals(this.bandwidth);
			this.bandwidth=abandwidth;
		}
	}


	/**
	* gettrunktimestamps 
	* Should we send timestamps for the individual sub-frames within trunk frames? There is a small bandwidth use for these (less than 1kbps/call), but they ensure that frame timestamps get sent end-to-end properly.  If both ends of all your trunks go directly to TDM, _and_ your trunkfreq equals the frame length for your codecs, you  can probably suppress these.  The receiver must also support this feature, although they do not also need to have it enabled.
	**/
	public Integer getTrunktimestamps(){		return  trunktimestamps;
	}
	/**
	*settrunktimestamps 
	*/
	public void setTrunktimestamps(Integer atrunktimestamps){
		if(atrunktimestamps==null){
		    changed = (this.trunktimestamps!=null);
		    this.trunktimestamps = null;	    
		}else{
			changed = atrunktimestamps.equals(this.trunktimestamps);
			this.trunktimestamps=atrunktimestamps;
		}
	}


	/**
	* getauthdebug 
	* You can disable authentication debugging to reduce the amount of  debugging traffic.
	**/
	public String getAuthdebug(){		return  authdebug;
	}
	/**
	*setauthdebug 
	*/
	public void setAuthdebug(String aauthdebug){
		if(aauthdebug==null){
		    changed = (this.authdebug!=null);
		    this.authdebug = null;	    
		}else{
			changed = aauthdebug.equals(this.authdebug);
			this.authdebug=aauthdebug;
		}
	}


	/**
	* gettos 
	* Finally, you can set values for your TOS bits to help improve  performance.  Valid values are:   lowdelay		-- Minimize delay   throughput		-- Maximize throughput   reliability		-- Maximize reliability   mincost		-- Minimize cost   none		-- No flags
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
	* getmailboxdetail 
	* If mailboxdetail is set to "yes", the user receives the actual new/old message counts, not just a yes/no as to whether they have messages.  this can be set on a per-peer basis as well
	**/
	public Boolean getMailboxdetail(){		return  mailboxdetail;
	}
	/**
	*setmailboxdetail 
	*/
	public void setMailboxdetail(Boolean amailboxdetail){
		if(amailboxdetail==null){
		    changed = (this.mailboxdetail!=null);
		    this.mailboxdetail = null;	    
		}else{
			changed = amailboxdetail.equals(this.mailboxdetail);
			this.mailboxdetail=amailboxdetail;
		}
	}


	/**
	* getregcontext 
	* If regcontext is specified, Asterisk will dynamically  create and destroy a NoOp priority 1 extension for a given peer who registers or unregisters with us.  The actual extension is the 'regexten' parameter of the registering peer or its name if 'regexten' is not provided.  More than one regexten may be supplied if they are separated by '&'.  Patterns may be used in regexten.
	**/
	public String getRegcontext(){		return  regcontext;
	}
	/**
	*setregcontext 
	*/
	public void setRegcontext(String aregcontext){
		if(aregcontext==null){
		    changed = (this.regcontext!=null);
		    this.regcontext = null;	    
		}else{
			changed = aregcontext.equals(this.regcontext);
			this.regcontext=aregcontext;
		}
	}


	/**
	* getautokill 
	* If we don't get ACK to our NEW within 2000ms, and autokill is set to yes, then we cancel the whole thing (that's enough time for one  retransmission only).  This is used to keep things from stalling for a long time for a host that is not available, but would be ill advised for bad  connections.  In addition to 'yes' or 'no' you can also specify a number of milliseconds.  See 'qualify' for individual peers to turn on for just a specific peer.
	**/
	public Boolean getAutokill(){		return  autokill;
	}
	/**
	*setautokill 
	*/
	public void setAutokill(Boolean aautokill){
		if(aautokill==null){
		    changed = (this.autokill!=null);
		    this.autokill = null;	    
		}else{
			changed = aautokill.equals(this.autokill);
			this.autokill=aautokill;
		}
	}


	/**
	* getcodecpriority 
	* codecpriority controls the codec negotiation of an inbound IAX call. This option is inherited to all user entities.  It can also be defined  in each user entity separately which will override the setting in general.

The valid values are: caller   - Consider the callers preferred order ahead of the host's. host     - Consider the host's preferred order ahead of the caller's. disabled - Disable the consideration of codec preference alltogether.            (this is the original behaviour before preferences were added) reqonly  - Same as disabled, only do not consider capabilities if            the requested format is not available the call will only            be accepted if the requested format is available.

The default value is 'host'
	**/
	public String getCodecpriority(){		return  codecpriority;
	}
	/**
	*setcodecpriority 
	*/
	public void setCodecpriority(String acodecpriority){
		if(acodecpriority==null){
		    changed = (this.codecpriority!=null);
		    this.codecpriority = null;	    
		}else{
			changed = acodecpriority.equals(this.codecpriority);
			this.codecpriority=acodecpriority;
		}
	}


	/**
	* getrtcachefriends 
	* Cache realtime friends by adding them to the internal list just like friends added from the config file only on a as-needed basis.
	**/
	public Integer getRtcachefriends(){		return  rtcachefriends;
	}
	/**
	*setrtcachefriends 
	*/
	public void setRtcachefriends(Integer artcachefriends){
		if(artcachefriends==null){
		    changed = (this.rtcachefriends!=null);
		    this.rtcachefriends = null;	    
		}else{
			changed = artcachefriends.equals(this.rtcachefriends);
			this.rtcachefriends=artcachefriends;
		}
	}


	/**
	* getrtupdate 
	* Send registry updates to database using realtime? (yes|no) If set to yes, when a IAX2 peer registers successfully, the ip address,the origination port, the registration period, and the username of the origination port, the registration period, and the username of  the peer will be set to database via realtime. If not present, defaults to 'yes'.
	**/
	public Boolean getRtupdate(){		return  rtupdate;
	}
	/**
	*setrtupdate 
	*/
	public void setRtupdate(Boolean artupdate){
		if(artupdate==null){
		    changed = (this.rtupdate!=null);
		    this.rtupdate = null;	    
		}else{
			changed = artupdate.equals(this.rtupdate);
			this.rtupdate=artupdate;
		}
	}


	/**
	* getrtautoclear 
	* Auto-Expire friends created on the fly on the same schedule as if it had just registered when the registration expires the friend will vanish from the configuration until requested again.  If set to an integer, friends expire within this number of seconds instead of the same as the registration interval
	**/
	public Boolean getRtautoclear(){		return  rtautoclear;
	}
	/**
	*setrtautoclear 
	*/
	public void setRtautoclear(Boolean artautoclear){
		if(artautoclear==null){
		    changed = (this.rtautoclear!=null);
		    this.rtautoclear = null;	    
		}else{
			changed = artautoclear.equals(this.rtautoclear);
			this.rtautoclear=artautoclear;
		}
	}


	/**
	* getrtignoreexpire 
	* when reading a peer from Realtime, if the peer's registration has expired based on its registration interval, used the stored  address information regardless
	**/
	public Boolean getRtignoreexpire(){		return  rtignoreexpire;
	}
	/**
	*setrtignoreexpire 
	*/
	public void setRtignoreexpire(Boolean artignoreexpire){
		if(artignoreexpire==null){
		    changed = (this.rtignoreexpire!=null);
		    this.rtignoreexpire = null;	    
		}else{
			changed = artignoreexpire.equals(this.rtignoreexpire);
			this.rtignoreexpire=artignoreexpire;
		}
	}


	/**
	* gettrunkfreq 
	* How frequently to send trunk msgs (in ms)
	**/
	public Integer getTrunkfreq(){		return  trunkfreq;
	}
	/**
	*settrunkfreq 
	*/
	public void setTrunkfreq(Integer atrunkfreq){
		if(atrunkfreq==null){
		    changed = (this.trunkfreq!=null);
		    this.trunkfreq = null;	    
		}else{
			changed = atrunkfreq.equals(this.trunkfreq);
			this.trunkfreq=atrunkfreq;
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
	* getminregexpire 
	* Minimum and maximum amounts of time that IAX peers can request as a registration expiration interval (in seconds).
	**/
	public Integer getMinregexpire(){		return  minregexpire;
	}
	/**
	*setminregexpire 
	*/
	public void setMinregexpire(Integer aminregexpire){
		if(aminregexpire==null){
		    changed = (this.minregexpire!=null);
		    this.minregexpire = null;	    
		}else{
			changed = aminregexpire.equals(this.minregexpire);
			this.minregexpire=aminregexpire;
		}
	}


	/**
	* getmaxregexpire 
	* 
	**/
	public Integer getMaxregexpire(){		return  maxregexpire;
	}
	/**
	*setmaxregexpire 
	*/
	public void setMaxregexpire(Integer amaxregexpire){
		if(amaxregexpire==null){
		    changed = (this.maxregexpire!=null);
		    this.maxregexpire = null;	    
		}else{
			changed = amaxregexpire.equals(this.maxregexpire);
			this.maxregexpire=amaxregexpire;
		}
	}


	/**
	* getnotransfer 
	* 
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("bindport=")
		.append(bindport)
		.append(",")
		.append("bindaddr=")
		.append(bindaddr)
		.append(",")
		.append("iaxcompat=")
		.append(iaxcompat)
		.append(",")
		.append("nochecksums=")
		.append(nochecksums)
		.append(",")
		.append("delayreject=")
		.append(delayreject)
		.append(",")
		.append("amaflags=")
		.append(amaflags)
		.append(",")
		.append("accountcode=")
		.append(accountcode)
		.append(",")
		.append("language=")
		.append(language)
		.append(",")
		.append("bandwidth=")
		.append(bandwidth)
		.append(",")
		.append("trunktimestamps=")
		.append(trunktimestamps)
		.append(",")
		.append("authdebug=")
		.append(authdebug)
		.append(",")
		.append("tos=")
		.append(tos)
		.append(",")
		.append("mailboxdetail=")
		.append(mailboxdetail)
		.append(",")
		.append("regcontext=")
		.append(regcontext)
		.append(",")
		.append("autokill=")
		.append(autokill)
		.append(",")
		.append("codecpriority=")
		.append(codecpriority)
		.append(",")
		.append("rtcachefriends=")
		.append(rtcachefriends)
		.append(",")
		.append("rtupdate=")
		.append(rtupdate)
		.append(",")
		.append("rtautoclear=")
		.append(rtautoclear)
		.append(",")
		.append("rtignoreexpire=")
		.append(rtignoreexpire)
		.append(",")
		.append("trunkfreq=")
		.append(trunkfreq)
		.append(",")
		.append("disallow=")
		.append(disallow)
		.append(",")
		.append("allow=")
		.append(allow)
		.append(",")
		.append("minregexpire=")
		.append(minregexpire)
		.append(",")
		.append("maxregexpire=")
		.append(maxregexpire)
		.append(",")
		.append("notransfer=")
		.append(notransfer)
    			.append("]");

		return sb.toString();		
	}}