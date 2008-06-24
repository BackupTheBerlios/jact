package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * Queuesection<br>
 * call queue
 * </p>
 * Created : Fri May 26 14:31:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Queuesection.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $
 */
 public  class Queuesection extends AbstractSimpleDataClass implements IQueuesection{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Queuesection
	**/
	public Queuesection(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Queuesection
	**/
	public Queuesection( String asectionname, String amusiconhold, String aannounce, String astrategy, Integer aservicelevel, PbxContext acontext, Integer atimeout, Integer aretry, String aweight, Integer awrapuptime, Integer amaxlen, Integer aannouncefrequency, Boolean aannounceholdtime, String aannounceroundseconds, String amonitorformat, Boolean amonitorjoin, String ajoinempty, String aleavewhenempty, Boolean aeventwhencalled, Boolean aeventmemberstatusoff, Boolean areportholdtime, Integer amemberdelay, Boolean atimeoutrestart){
		super();
	
		this.musiconhold = amusiconhold;	
		this.sectionname = asectionname;	
		this.announce = aannounce;	
		this.strategy = astrategy;	
		this.servicelevel = aservicelevel;	
		this.context = acontext;	
		this.timeout = atimeout;	
		this.retry = aretry;	
		this.weight = aweight;	
		this.wrapuptime = awrapuptime;	
		this.maxlen = amaxlen;	
		this.announcefrequency = aannouncefrequency;	
		this.announceholdtime = aannounceholdtime;	
		this.announceroundseconds = aannounceroundseconds;	
		this.monitorformat = amonitorformat;	
		this.monitorjoin = amonitorjoin;	
		this.joinempty = ajoinempty;	
		this.leavewhenempty = aleavewhenempty;	
		this.eventwhencalled = aeventwhencalled;	
		this.eventmemberstatusoff = aeventmemberstatusoff;	
		this.reportholdtime = areportholdtime;	
		this.memberdelay = amemberdelay;	
		this.timeoutrestart = atimeoutrestart;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Queuesection object){
		this.musiconhold = object.musiconhold;	
		this.sectionname = object.sectionname;	
		this.announce = object.announce;	
		this.strategy = object.strategy;	
		this.servicelevel = object.servicelevel;	
		this.context = object.context;	
		this.timeout = object.timeout;	
		this.retry = object.retry;	
		this.weight = object.weight;	
		this.wrapuptime = object.wrapuptime;	
		this.maxlen = object.maxlen;	
		this.announcefrequency = object.announcefrequency;	
		this.announceholdtime = object.announceholdtime;	
		this.announceroundseconds = object.announceroundseconds;	
		this.monitorformat = object.monitorformat;	
		this.monitorjoin = object.monitorjoin;	
		this.joinempty = object.joinempty;	
		this.leavewhenempty = object.leavewhenempty;	
		this.eventwhencalled = object.eventwhencalled;	
		this.eventmemberstatusoff = object.eventmemberstatusoff;	
		this.reportholdtime = object.reportholdtime;	
		this.memberdelay = object.memberdelay;	
		this.timeoutrestart = object.timeoutrestart;	

	}
//--------------  map Funktionen
	//public static final String QUEUEMEMBERMAP = "queuememberMap";
	/** die typisierte List die die Aggregierten objekte(QueuememberImpl) enthält */
	protected List<Queuemember> queuememberMap = new ArrayList<Queuemember>();
	/** die typisierte Map die die Aggregierten objekte(QueuememberImpl) enthält */
	//protected QueuememberMap queuememberMapMap = new QueuememberMap();

	/**
	 * fügt ein Queuemember Objekt zu der Mapp hinzu
	 * @param aQueuemember
	 */
	public boolean addQueuemember(Queuemember aQueuemember){
		return queuememberMap.add(aQueuemember);
	}

	/**
	 * removed ein Queuemember Objekt aus der Map
	 * @param aQueuemember
	 */
	public boolean removeQueuemember(Queuemember aQueuemember){
		return queuememberMap.remove(aQueuemember);
	}

	

/**
 * gibt die List<Queuemember> queuememberMap zurück	
 * @return List<Queuemember>
 * @see  IQueuesection#getQueuememberMap
 */
public List<Queuemember> getQueuememberMap() {
	return queuememberMap;
}
/**
 * setzt die Map QueuememberMap
 * @param map queuememberMapMap
 */
 @SuppressWarnings("unchecked")
public void setQueuememberMap(List aList){
    queuememberMap = aList;
   // queuememberMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Musiconhold sets which music applies for this particula call queue (configure classes in musiconhold.conf) **/
	protected String musiconhold;
	public static final String VALUEID_MUSICONHOLD="musiconhold" ;

    /**  the section name **/
	protected String sectionname;
	public static final String VALUEID_SECTIONNAME="sectionname" ;

    /**  An announcement may be specified which is played for the member as soon as they answer a call, typically to indicate to them which queue

 this call should be answered as, so that agents or members who are listening to more than one queue can differentiated how they should engage the customer **/
	protected String announce;
	public static final String VALUEID_ANNOUNCE="announce" ;

    /**  ringall - ring all available channels until one answers (default) roundrobin - take turns ringing each available interface  leastrecent - ring interface which was least recently called by this queue fewestcalls - ring the one with fewest completed calls from this queue random - ring random interface rrmemory - round robin with memory, remember where we left off last ring pass **/
	protected String strategy;
	public static final String VALUEID_STRATEGY="strategy" ;

    /**  Second settings for service level (default 0) Used for service level statistics (calls completed within service level time frame) **/
	protected Integer servicelevel;
	public static final String VALUEID_SERVICELEVEL="servicelevel" ;

    /**  A context may be specified, in which if the user types a SINGLE

 digit extension while they are in the queue, they will be taken out

 of the queue and sent to that extension in this context. **/
	protected PbxContext context;
	public static final String VALUEID_CONTEXT="context" ;

    /**  How long do we let the phone ring before we consider this a timeout... **/
	protected Integer timeout;
	public static final String VALUEID_TIMEOUT="timeout" ;

    /**  How long do we wait before trying all the members again? **/
	protected Integer retry;
	public static final String VALUEID_RETRY="retry" ;

    /**  Weight of queue - when compared to other queues, higher weights get  first shot at available channels when the same channel is included in  more than one queue. **/
	protected String weight;
	public static final String VALUEID_WEIGHT="weight" ;

    /**  After a successful call, how long to wait before sending a potentially free member another call (default is 0, or no delay) **/
	protected Integer wrapuptime;
	public static final String VALUEID_WRAPUPTIME="wrapuptime" ;

    /**  Maximum number of people waiting in the queue (0 for unlimited) **/
	protected Integer maxlen;
	public static final String VALUEID_MAXLEN="maxlen" ;

    /**  How often to announce queue position and/or estimated holdtime to caller (0=off) **/
	protected Integer announcefrequency;
	public static final String VALUEID_ANNOUNCEFREQUENCY="announcefrequency" ;

    /**  Should we include estimated hold time in position announcements? Either yes, no, or only once. Hold time will be announced as the estimated time,  or "less than 2 minutes" when appropriate. **/
	protected Boolean announceholdtime;
	public static final String VALUEID_ANNOUNCEHOLDTIME="announceholdtime" ;

    /**  What's the rounding time for the seconds? If this is non zero then we announce the seconds as well as the minutes rounded to this value **/
	protected String announceroundseconds;
	public static final String VALUEID_ANNOUNCEROUNDSECONDS="announceroundseconds" ;

    /**  Calls may be recorded using Asterisk's monitor resource This can be enabled from within the Queue application, starting recording when the call is actually picked up thus, only successful calls are

 recorded, and you are not recording while people are listening to MOH.

 To enable monitoring, simply specify "monitor-format"  it will be disabled

 otherwise. You can specify the monitor filename with by calling Set(MONITOR_FILENAME=foo)

 Otherwise it will use ${UNIQUEID} **/
	protected String monitorformat;
	public static final String VALUEID_MONITORFORMAT="monitorformat" ;

    /**  If you wish to have the two files joined together when the call ends set this to yes **/
	protected Boolean monitorjoin;
	public static final String VALUEID_MONITORJOIN="monitorjoin" ;

    /**  This setting controls whether callers can join a queue with no members. There are three

 choices:

yes - callers can join a queue with no members or only unavailable members no - callers cannot join a queue with no members strict - callers cannot join a queue with no members or only unavailable members **/
	protected String joinempty;
	public static final String VALUEID_JOINEMPTY="joinempty" ;

    /**  If you wish to remove callers from the queue when new callers cannot join, set this setting to one of the same choices for 'joinempty' **/
	protected String leavewhenempty;
	public static final String VALUEID_LEAVEWHENEMPTY="leavewhenempty" ;

    /**  If this is set to yes, the following manager events will be generated:

 AgentCalled, AgentDump, AgentConnect, AgentComplete (may generate some extra manager events, but probably ones you want) **/
	protected Boolean eventwhencalled;
	public static final String VALUEID_EVENTWHENCALLED="eventwhencalled" ;

    /**  If this is set to no, the following manager events will be generated: QueueMemberStatus (may generate a WHOLE LOT of extra manager events) **/
	protected Boolean eventmemberstatusoff;
	public static final String VALUEID_EVENTMEMBERSTATUSOFF="eventmemberstatusoff" ;

    /**  If you wish to report the caller's hold time to the member before they are connected to the caller, set this to yes. **/
	protected Boolean reportholdtime;
	public static final String VALUEID_REPORTHOLDTIME="reportholdtime" ;

    /**  If you wish to have a delay before the member is connected to the caller (or before the member hears any announcement messages), set this to the number of seconds to delay. **/
	protected Integer memberdelay;
	public static final String VALUEID_MEMBERDELAY="memberdelay" ;

    /**  If timeoutrestart is set to yes, then the timeout for an agent to answer is reset if a BUSY or CONGESTION is received.  This can be useful if agents are able to cancel a call with reject or similar. **/
	protected Boolean timeoutrestart;
	public static final String VALUEID_TIMEOUTRESTART="timeoutrestart" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MUSICONHOLD.equals(valueid)){
			return true;
		}
		if(VALUEID_SECTIONNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_ANNOUNCE.equals(valueid)){
			return true;
		}
		if(VALUEID_STRATEGY.equals(valueid)){
			return true;
		}
		if(VALUEID_SERVICELEVEL.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_RETRY.equals(valueid)){
			return true;
		}
		if(VALUEID_WEIGHT.equals(valueid)){
			return true;
		}
		if(VALUEID_WRAPUPTIME.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXLEN.equals(valueid)){
			return true;
		}
		if(VALUEID_ANNOUNCEFREQUENCY.equals(valueid)){
			return true;
		}
		if(VALUEID_ANNOUNCEHOLDTIME.equals(valueid)){
			return true;
		}
		if(VALUEID_ANNOUNCEROUNDSECONDS.equals(valueid)){
			return true;
		}
		if(VALUEID_MONITORFORMAT.equals(valueid)){
			return true;
		}
		if(VALUEID_MONITORJOIN.equals(valueid)){
			return true;
		}
		if(VALUEID_JOINEMPTY.equals(valueid)){
			return true;
		}
		if(VALUEID_LEAVEWHENEMPTY.equals(valueid)){
			return true;
		}
		if(VALUEID_EVENTWHENCALLED.equals(valueid)){
			return true;
		}
		if(VALUEID_EVENTMEMBERSTATUSOFF.equals(valueid)){
			return true;
		}
		if(VALUEID_REPORTHOLDTIME.equals(valueid)){
			return true;
		}
		if(VALUEID_MEMBERDELAY.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUTRESTART.equals(valueid)){
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
		if(VALUEID_MUSICONHOLD.equals(valueid)){
			setMusiconhold((String)data);
			return;
		}
		if(VALUEID_SECTIONNAME.equals(valueid)){
			setSectionname((String)data);
			return;
		}
		if(VALUEID_ANNOUNCE.equals(valueid)){
			setAnnounce((String)data);
			return;
		}
		if(VALUEID_STRATEGY.equals(valueid)){
			setStrategy((String)data);
			return;
		}
		if(VALUEID_SERVICELEVEL.equals(valueid)){
			if(data instanceof String){
		        setServicelevel(new Integer((String)data));
		        return;
		    }
			setServicelevel((Integer)data);
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
		if(VALUEID_TIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setTimeout(new Integer((String)data));
		        return;
		    }
			setTimeout((Integer)data);
			return;
		}
		if(VALUEID_RETRY.equals(valueid)){
			if(data instanceof String){
		        setRetry(new Integer((String)data));
		        return;
		    }
			setRetry((Integer)data);
			return;
		}
		if(VALUEID_WEIGHT.equals(valueid)){
			setWeight((String)data);
			return;
		}
		if(VALUEID_WRAPUPTIME.equals(valueid)){
			if(data instanceof String){
		        setWrapuptime(new Integer((String)data));
		        return;
		    }
			setWrapuptime((Integer)data);
			return;
		}
		if(VALUEID_MAXLEN.equals(valueid)){
			if(data instanceof String){
		        setMaxlen(new Integer((String)data));
		        return;
		    }
			setMaxlen((Integer)data);
			return;
		}
		if(VALUEID_ANNOUNCEFREQUENCY.equals(valueid)){
			if(data instanceof String){
		        setAnnouncefrequency(new Integer((String)data));
		        return;
		    }
			setAnnouncefrequency((Integer)data);
			return;
		}
		if(VALUEID_ANNOUNCEHOLDTIME.equals(valueid)){
			if(data instanceof String){
		        setAnnounceholdtime(new Boolean((String)data));
		        return;
		    }
			setAnnounceholdtime((Boolean)data);
			return;
		}
		if(VALUEID_ANNOUNCEROUNDSECONDS.equals(valueid)){
			setAnnounceroundseconds((String)data);
			return;
		}
		if(VALUEID_MONITORFORMAT.equals(valueid)){
			setMonitorformat((String)data);
			return;
		}
		if(VALUEID_MONITORJOIN.equals(valueid)){
			if(data instanceof String){
		        setMonitorjoin(new Boolean((String)data));
		        return;
		    }
			setMonitorjoin((Boolean)data);
			return;
		}
		if(VALUEID_JOINEMPTY.equals(valueid)){
			setJoinempty((String)data);
			return;
		}
		if(VALUEID_LEAVEWHENEMPTY.equals(valueid)){
			setLeavewhenempty((String)data);
			return;
		}
		if(VALUEID_EVENTWHENCALLED.equals(valueid)){
			if(data instanceof String){
		        setEventwhencalled(new Boolean((String)data));
		        return;
		    }
			setEventwhencalled((Boolean)data);
			return;
		}
		if(VALUEID_EVENTMEMBERSTATUSOFF.equals(valueid)){
			if(data instanceof String){
		        setEventmemberstatusoff(new Boolean((String)data));
		        return;
		    }
			setEventmemberstatusoff((Boolean)data);
			return;
		}
		if(VALUEID_REPORTHOLDTIME.equals(valueid)){
			if(data instanceof String){
		        setReportholdtime(new Boolean((String)data));
		        return;
		    }
			setReportholdtime((Boolean)data);
			return;
		}
		if(VALUEID_MEMBERDELAY.equals(valueid)){
			if(data instanceof String){
		        setMemberdelay(new Integer((String)data));
		        return;
		    }
			setMemberdelay((Integer)data);
			return;
		}
		if(VALUEID_TIMEOUTRESTART.equals(valueid)){
			if(data instanceof String){
		        setTimeoutrestart(new Boolean((String)data));
		        return;
		    }
			setTimeoutrestart((Boolean)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_MUSICONHOLD.equals(valueid)){
			return getMusiconhold();
			
		}
		if(VALUEID_SECTIONNAME.equals(valueid)){
			return getSectionname();
			
		}
		if(VALUEID_ANNOUNCE.equals(valueid)){
			return getAnnounce();
			
		}
		if(VALUEID_STRATEGY.equals(valueid)){
			return getStrategy();
			
		}
		if(VALUEID_SERVICELEVEL.equals(valueid)){
			return getServicelevel();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return getTimeout();
			
		}
		if(VALUEID_RETRY.equals(valueid)){
			return getRetry();
			
		}
		if(VALUEID_WEIGHT.equals(valueid)){
			return getWeight();
			
		}
		if(VALUEID_WRAPUPTIME.equals(valueid)){
			return getWrapuptime();
			
		}
		if(VALUEID_MAXLEN.equals(valueid)){
			return getMaxlen();
			
		}
		if(VALUEID_ANNOUNCEFREQUENCY.equals(valueid)){
			return getAnnouncefrequency();
			
		}
		if(VALUEID_ANNOUNCEHOLDTIME.equals(valueid)){
			return getAnnounceholdtime();
			
		}
		if(VALUEID_ANNOUNCEROUNDSECONDS.equals(valueid)){
			return getAnnounceroundseconds();
			
		}
		if(VALUEID_MONITORFORMAT.equals(valueid)){
			return getMonitorformat();
			
		}
		if(VALUEID_MONITORJOIN.equals(valueid)){
			return getMonitorjoin();
			
		}
		if(VALUEID_JOINEMPTY.equals(valueid)){
			return getJoinempty();
			
		}
		if(VALUEID_LEAVEWHENEMPTY.equals(valueid)){
			return getLeavewhenempty();
			
		}
		if(VALUEID_EVENTWHENCALLED.equals(valueid)){
			return getEventwhencalled();
			
		}
		if(VALUEID_EVENTMEMBERSTATUSOFF.equals(valueid)){
			return getEventmemberstatusoff();
			
		}
		if(VALUEID_REPORTHOLDTIME.equals(valueid)){
			return getReportholdtime();
			
		}
		if(VALUEID_MEMBERDELAY.equals(valueid)){
			return getMemberdelay();
			
		}
		if(VALUEID_TIMEOUTRESTART.equals(valueid)){
			return getTimeoutrestart();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmusiconhold 
	* Musiconhold sets which music applies for this particula call queue (configure classes in musiconhold.conf)
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
	* getsectionname 
	* the section name
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
	* getannounce 
	* An announcement may be specified which is played for the member as soon as they answer a call, typically to indicate to them which queue

 this call should be answered as, so that agents or members who are listening to more than one queue can differentiated how they should engage the customer
	**/
	public String getAnnounce(){		return  announce;
	}
	/**
	*setannounce 
	*/
	public void setAnnounce(String aannounce){
		if(aannounce==null){
		    changed = (this.announce!=null);
		    this.announce = null;	    
		}else{
			changed = aannounce.equals(this.announce);
			this.announce=aannounce;
		}
	}


	/**
	* getstrategy 
	* ringall - ring all available channels until one answers (default) roundrobin - take turns ringing each available interface  leastrecent - ring interface which was least recently called by this queue fewestcalls - ring the one with fewest completed calls from this queue random - ring random interface rrmemory - round robin with memory, remember where we left off last ring pass
	**/
	public String getStrategy(){		return  strategy;
	}
	/**
	*setstrategy 
	*/
	public void setStrategy(String astrategy){
		if(astrategy==null){
		    changed = (this.strategy!=null);
		    this.strategy = null;	    
		}else{
			changed = astrategy.equals(this.strategy);
			this.strategy=astrategy;
		}
	}


	/**
	* getservicelevel 
	* Second settings for service level (default 0) Used for service level statistics (calls completed within service level time frame)
	**/
	public Integer getServicelevel(){		return  servicelevel;
	}
	/**
	*setservicelevel 
	*/
	public void setServicelevel(Integer aservicelevel){
		if(aservicelevel==null){
		    changed = (this.servicelevel!=null);
		    this.servicelevel = null;	    
		}else{
			changed = aservicelevel.equals(this.servicelevel);
			this.servicelevel=aservicelevel;
		}
	}


	/**
	* getcontext 
	* A context may be specified, in which if the user types a SINGLE

 digit extension while they are in the queue, they will be taken out

 of the queue and sent to that extension in this context.
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
	* gettimeout 
	* How long do we let the phone ring before we consider this a timeout...
	**/
	public Integer getTimeout(){		return  timeout;
	}
	/**
	*settimeout 
	*/
	public void setTimeout(Integer atimeout){
		if(atimeout==null){
		    changed = (this.timeout!=null);
		    this.timeout = null;	    
		}else{
			changed = atimeout.equals(this.timeout);
			this.timeout=atimeout;
		}
	}


	/**
	* getretry 
	* How long do we wait before trying all the members again?
	**/
	public Integer getRetry(){		return  retry;
	}
	/**
	*setretry 
	*/
	public void setRetry(Integer aretry){
		if(aretry==null){
		    changed = (this.retry!=null);
		    this.retry = null;	    
		}else{
			changed = aretry.equals(this.retry);
			this.retry=aretry;
		}
	}


	/**
	* getweight 
	* Weight of queue - when compared to other queues, higher weights get  first shot at available channels when the same channel is included in  more than one queue.
	**/
	public String getWeight(){		return  weight;
	}
	/**
	*setweight 
	*/
	public void setWeight(String aweight){
		if(aweight==null){
		    changed = (this.weight!=null);
		    this.weight = null;	    
		}else{
			changed = aweight.equals(this.weight);
			this.weight=aweight;
		}
	}


	/**
	* getwrapuptime 
	* After a successful call, how long to wait before sending a potentially free member another call (default is 0, or no delay)
	**/
	public Integer getWrapuptime(){		return  wrapuptime;
	}
	/**
	*setwrapuptime 
	*/
	public void setWrapuptime(Integer awrapuptime){
		if(awrapuptime==null){
		    changed = (this.wrapuptime!=null);
		    this.wrapuptime = null;	    
		}else{
			changed = awrapuptime.equals(this.wrapuptime);
			this.wrapuptime=awrapuptime;
		}
	}


	/**
	* getmaxlen 
	* Maximum number of people waiting in the queue (0 for unlimited)
	**/
	public Integer getMaxlen(){		return  maxlen;
	}
	/**
	*setmaxlen 
	*/
	public void setMaxlen(Integer amaxlen){
		if(amaxlen==null){
		    changed = (this.maxlen!=null);
		    this.maxlen = null;	    
		}else{
			changed = amaxlen.equals(this.maxlen);
			this.maxlen=amaxlen;
		}
	}


	/**
	* getannouncefrequency 
	* How often to announce queue position and/or estimated holdtime to caller (0=off)
	**/
	public Integer getAnnouncefrequency(){		return  announcefrequency;
	}
	/**
	*setannouncefrequency 
	*/
	public void setAnnouncefrequency(Integer aannouncefrequency){
		if(aannouncefrequency==null){
		    changed = (this.announcefrequency!=null);
		    this.announcefrequency = null;	    
		}else{
			changed = aannouncefrequency.equals(this.announcefrequency);
			this.announcefrequency=aannouncefrequency;
		}
	}


	/**
	* getannounceholdtime 
	* Should we include estimated hold time in position announcements? Either yes, no, or only once. Hold time will be announced as the estimated time,  or "less than 2 minutes" when appropriate.
	**/
	public Boolean getAnnounceholdtime(){		return  announceholdtime;
	}
	/**
	*setannounceholdtime 
	*/
	public void setAnnounceholdtime(Boolean aannounceholdtime){
		if(aannounceholdtime==null){
		    changed = (this.announceholdtime!=null);
		    this.announceholdtime = null;	    
		}else{
			changed = aannounceholdtime.equals(this.announceholdtime);
			this.announceholdtime=aannounceholdtime;
		}
	}


	/**
	* getannounceroundseconds 
	* What's the rounding time for the seconds? If this is non zero then we announce the seconds as well as the minutes rounded to this value
	**/
	public String getAnnounceroundseconds(){		return  announceroundseconds;
	}
	/**
	*setannounceroundseconds 
	*/
	public void setAnnounceroundseconds(String aannounceroundseconds){
		if(aannounceroundseconds==null){
		    changed = (this.announceroundseconds!=null);
		    this.announceroundseconds = null;	    
		}else{
			changed = aannounceroundseconds.equals(this.announceroundseconds);
			this.announceroundseconds=aannounceroundseconds;
		}
	}


	/**
	* getmonitorformat 
	* Calls may be recorded using Asterisk's monitor resource This can be enabled from within the Queue application, starting recording when the call is actually picked up thus, only successful calls are

 recorded, and you are not recording while people are listening to MOH.

 To enable monitoring, simply specify "monitor-format"  it will be disabled

 otherwise. You can specify the monitor filename with by calling Set(MONITOR_FILENAME=foo)

 Otherwise it will use ${UNIQUEID}
	**/
	public String getMonitorformat(){		return  monitorformat;
	}
	/**
	*setmonitorformat 
	*/
	public void setMonitorformat(String amonitorformat){
		if(amonitorformat==null){
		    changed = (this.monitorformat!=null);
		    this.monitorformat = null;	    
		}else{
			changed = amonitorformat.equals(this.monitorformat);
			this.monitorformat=amonitorformat;
		}
	}


	/**
	* getmonitorjoin 
	* If you wish to have the two files joined together when the call ends set this to yes
	**/
	public Boolean getMonitorjoin(){		return  monitorjoin;
	}
	/**
	*setmonitorjoin 
	*/
	public void setMonitorjoin(Boolean amonitorjoin){
		if(amonitorjoin==null){
		    changed = (this.monitorjoin!=null);
		    this.monitorjoin = null;	    
		}else{
			changed = amonitorjoin.equals(this.monitorjoin);
			this.monitorjoin=amonitorjoin;
		}
	}


	/**
	* getjoinempty 
	* This setting controls whether callers can join a queue with no members. There are three

 choices:

yes - callers can join a queue with no members or only unavailable members no - callers cannot join a queue with no members strict - callers cannot join a queue with no members or only unavailable members
	**/
	public String getJoinempty(){		return  joinempty;
	}
	/**
	*setjoinempty 
	*/
	public void setJoinempty(String ajoinempty){
		if(ajoinempty==null){
		    changed = (this.joinempty!=null);
		    this.joinempty = null;	    
		}else{
			changed = ajoinempty.equals(this.joinempty);
			this.joinempty=ajoinempty;
		}
	}


	/**
	* getleavewhenempty 
	* If you wish to remove callers from the queue when new callers cannot join, set this setting to one of the same choices for 'joinempty'
	**/
	public String getLeavewhenempty(){		return  leavewhenempty;
	}
	/**
	*setleavewhenempty 
	*/
	public void setLeavewhenempty(String aleavewhenempty){
		if(aleavewhenempty==null){
		    changed = (this.leavewhenempty!=null);
		    this.leavewhenempty = null;	    
		}else{
			changed = aleavewhenempty.equals(this.leavewhenempty);
			this.leavewhenempty=aleavewhenempty;
		}
	}


	/**
	* geteventwhencalled 
	* If this is set to yes, the following manager events will be generated:

 AgentCalled, AgentDump, AgentConnect, AgentComplete (may generate some extra manager events, but probably ones you want)
	**/
	public Boolean getEventwhencalled(){		return  eventwhencalled;
	}
	/**
	*seteventwhencalled 
	*/
	public void setEventwhencalled(Boolean aeventwhencalled){
		if(aeventwhencalled==null){
		    changed = (this.eventwhencalled!=null);
		    this.eventwhencalled = null;	    
		}else{
			changed = aeventwhencalled.equals(this.eventwhencalled);
			this.eventwhencalled=aeventwhencalled;
		}
	}


	/**
	* geteventmemberstatusoff 
	* If this is set to no, the following manager events will be generated: QueueMemberStatus (may generate a WHOLE LOT of extra manager events)
	**/
	public Boolean getEventmemberstatusoff(){		return  eventmemberstatusoff;
	}
	/**
	*seteventmemberstatusoff 
	*/
	public void setEventmemberstatusoff(Boolean aeventmemberstatusoff){
		if(aeventmemberstatusoff==null){
		    changed = (this.eventmemberstatusoff!=null);
		    this.eventmemberstatusoff = null;	    
		}else{
			changed = aeventmemberstatusoff.equals(this.eventmemberstatusoff);
			this.eventmemberstatusoff=aeventmemberstatusoff;
		}
	}


	/**
	* getreportholdtime 
	* If you wish to report the caller's hold time to the member before they are connected to the caller, set this to yes.
	**/
	public Boolean getReportholdtime(){		return  reportholdtime;
	}
	/**
	*setreportholdtime 
	*/
	public void setReportholdtime(Boolean areportholdtime){
		if(areportholdtime==null){
		    changed = (this.reportholdtime!=null);
		    this.reportholdtime = null;	    
		}else{
			changed = areportholdtime.equals(this.reportholdtime);
			this.reportholdtime=areportholdtime;
		}
	}


	/**
	* getmemberdelay 
	* If you wish to have a delay before the member is connected to the caller (or before the member hears any announcement messages), set this to the number of seconds to delay.
	**/
	public Integer getMemberdelay(){		return  memberdelay;
	}
	/**
	*setmemberdelay 
	*/
	public void setMemberdelay(Integer amemberdelay){
		if(amemberdelay==null){
		    changed = (this.memberdelay!=null);
		    this.memberdelay = null;	    
		}else{
			changed = amemberdelay.equals(this.memberdelay);
			this.memberdelay=amemberdelay;
		}
	}


	/**
	* gettimeoutrestart 
	* If timeoutrestart is set to yes, then the timeout for an agent to answer is reset if a BUSY or CONGESTION is received.  This can be useful if agents are able to cancel a call with reject or similar.
	**/
	public Boolean getTimeoutrestart(){		return  timeoutrestart;
	}
	/**
	*settimeoutrestart 
	*/
	public void setTimeoutrestart(Boolean atimeoutrestart){
		if(atimeoutrestart==null){
		    changed = (this.timeoutrestart!=null);
		    this.timeoutrestart = null;	    
		}else{
			changed = atimeoutrestart.equals(this.timeoutrestart);
			this.timeoutrestart=atimeoutrestart;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("musiconhold=")
		.append(musiconhold)
		.append(",")
		.append("sectionname=")
		.append(sectionname)
		.append(",")
		.append("announce=")
		.append(announce)
		.append(",")
		.append("strategy=")
		.append(strategy)
		.append(",")
		.append("servicelevel=")
		.append(servicelevel)
		.append(",")
		.append("context=")
		.append(context)
		.append(",")
		.append("timeout=")
		.append(timeout)
		.append(",")
		.append("retry=")
		.append(retry)
		.append(",")
		.append("weight=")
		.append(weight)
		.append(",")
		.append("wrapuptime=")
		.append(wrapuptime)
		.append(",")
		.append("maxlen=")
		.append(maxlen)
		.append(",")
		.append("announcefrequency=")
		.append(announcefrequency)
		.append(",")
		.append("announceholdtime=")
		.append(announceholdtime)
		.append(",")
		.append("announceroundseconds=")
		.append(announceroundseconds)
		.append(",")
		.append("monitorformat=")
		.append(monitorformat)
		.append(",")
		.append("monitorjoin=")
		.append(monitorjoin)
		.append(",")
		.append("joinempty=")
		.append(joinempty)
		.append(",")
		.append("leavewhenempty=")
		.append(leavewhenempty)
		.append(",")
		.append("eventwhencalled=")
		.append(eventwhencalled)
		.append(",")
		.append("eventmemberstatusoff=")
		.append(eventmemberstatusoff)
		.append(",")
		.append("reportholdtime=")
		.append(reportholdtime)
		.append(",")
		.append("memberdelay=")
		.append(memberdelay)
		.append(",")
		.append("timeoutrestart=")
		.append(timeoutrestart)
    			.append("]");

		return sb.toString();		
	}}