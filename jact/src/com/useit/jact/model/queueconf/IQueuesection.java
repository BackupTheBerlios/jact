

package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * IQueuesection<br>
 * call queue
 * </p>
 * Created : Fri May 26 14:30:29 CEST 2006
 * 
 * @behavior.elementname Queuesection
 * @author urs
 * @version $Revision: 1.1 $, $Id: IQueuesection.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $
 */
 public  interface  IQueuesection {
public static final String MODELNAME = "Queuesection";	

/**
 * gibt die List<Queuemember> queuememberMap zurück	
 * @return List<Queuemember>
 * @behavior.list QueuememberMap 
 * @behavior.list.type Queuemember 
 */
public List getQueuememberMap();
/**
 * setzt die Map QueuememberMap
 * @param map queuememberMapMap
 * @behavior.list QueuememberMap 
 * @behavior.list.type Queuemember 
 */
public void setQueuememberMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_SECTIONNAME="sectionname" ;
// 	public static final String VALUEID_MUSICONHOLD="musiconhold" ;
// 	public static final String VALUEID_ANNOUNCE="announce" ;
// 	public static final String VALUEID_STRATEGY="strategy" ;
// 	public static final String VALUEID_SERVICELEVEL="servicelevel" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_TIMEOUT="timeout" ;
// 	public static final String VALUEID_RETRY="retry" ;
// 	public static final String VALUEID_WEIGHT="weight" ;
// 	public static final String VALUEID_WRAPUPTIME="wrapuptime" ;
// 	public static final String VALUEID_MAXLEN="maxlen" ;
// 	public static final String VALUEID_ANNOUNCEFREQUENCY="announcefrequency" ;
// 	public static final String VALUEID_ANNOUNCEHOLDTIME="announceholdtime" ;
// 	public static final String VALUEID_ANNOUNCEROUNDSECONDS="announceroundseconds" ;
// 	public static final String VALUEID_MONITORFORMAT="monitorformat" ;
// 	public static final String VALUEID_MONITORJOIN="monitorjoin" ;
// 	public static final String VALUEID_JOINEMPTY="joinempty" ;
// 	public static final String VALUEID_LEAVEWHENEMPTY="leavewhenempty" ;
// 	public static final String VALUEID_EVENTWHENCALLED="eventwhencalled" ;
// 	public static final String VALUEID_EVENTMEMBERSTATUSOFF="eventmemberstatusoff" ;
// 	public static final String VALUEID_REPORTHOLDTIME="reportholdtime" ;
// 	public static final String VALUEID_MEMBERDELAY="memberdelay" ;
// 	public static final String VALUEID_TIMEOUTRESTART="timeoutrestart" ;
	
	//---------  getter und setter

	/**
	* getsectionname 
	* the section name
	* @behavior.fieldname sectionname 
	**/
	public String getSectionname();
	
	/**
	*setsectionname 
	* the section name
	* @behavior.fieldname sectionname 
	*/
	public void setSectionname(String asectionname);


	/**
	* getmusiconhold 
	* Musiconhold sets which music applies for this particula call queue (configure classes in musiconhold.conf)
	* @behavior.fieldname musiconhold 
	**/
	public String getMusiconhold();
	
	/**
	*setmusiconhold 
	* Musiconhold sets which music applies for this particula call queue (configure classes in musiconhold.conf)
	* @behavior.fieldname musiconhold 
	*/
	public void setMusiconhold(String amusiconhold);


	/**
	* getannounce 
	* An announcement may be specified which is played for the member as soon as they answer a call, typically to indicate to them which queue

 this call should be answered as, so that agents or members who are listening to more than one queue can differentiated how they should engage the customer
	* @behavior.fieldname announce 
	**/
	public String getAnnounce();
	
	/**
	*setannounce 
	* An announcement may be specified which is played for the member as soon as they answer a call, typically to indicate to them which queue

 this call should be answered as, so that agents or members who are listening to more than one queue can differentiated how they should engage the customer
	* @behavior.fieldname announce 
	*/
	public void setAnnounce(String aannounce);


	/**
	* getstrategy 
	* ringall - ring all available channels until one answers (default) roundrobin - take turns ringing each available interface  leastrecent - ring interface which was least recently called by this queue fewestcalls - ring the one with fewest completed calls from this queue random - ring random interface rrmemory - round robin with memory, remember where we left off last ring pass
	* @behavior.fieldname strategy 
	**/
	public String getStrategy();
	
	/**
	*setstrategy 
	* ringall - ring all available channels until one answers (default) roundrobin - take turns ringing each available interface  leastrecent - ring interface which was least recently called by this queue fewestcalls - ring the one with fewest completed calls from this queue random - ring random interface rrmemory - round robin with memory, remember where we left off last ring pass
	* @behavior.fieldname strategy 
	*/
	public void setStrategy(String astrategy);


	/**
	* getservicelevel 
	* Second settings for service level (default 0) Used for service level statistics (calls completed within service level time frame)
	* @behavior.fieldname servicelevel 
	**/
	public Integer getServicelevel();
	
	/**
	*setservicelevel 
	* Second settings for service level (default 0) Used for service level statistics (calls completed within service level time frame)
	* @behavior.fieldname servicelevel 
	*/
	public void setServicelevel(Integer aservicelevel);


	/**
	* getcontext 
	* A context may be specified, in which if the user types a SINGLE

 digit extension while they are in the queue, they will be taken out

 of the queue and sent to that extension in this context.
	* @behavior.fieldname context 
	**/
	public PbxContext getContext();
	
	/**
	*setcontext 
	* A context may be specified, in which if the user types a SINGLE

 digit extension while they are in the queue, they will be taken out

 of the queue and sent to that extension in this context.
	* @behavior.fieldname context 
	*/
	public void setContext(PbxContext acontext);


	/**
	* gettimeout 
	* How long do we let the phone ring before we consider this a timeout...
	* @behavior.fieldname timeout 
	**/
	public Integer getTimeout();
	
	/**
	*settimeout 
	* How long do we let the phone ring before we consider this a timeout...
	* @behavior.fieldname timeout 
	*/
	public void setTimeout(Integer atimeout);


	/**
	* getretry 
	* How long do we wait before trying all the members again?
	* @behavior.fieldname retry 
	**/
	public Integer getRetry();
	
	/**
	*setretry 
	* How long do we wait before trying all the members again?
	* @behavior.fieldname retry 
	*/
	public void setRetry(Integer aretry);


	/**
	* getweight 
	* Weight of queue - when compared to other queues, higher weights get  first shot at available channels when the same channel is included in  more than one queue.
	* @behavior.fieldname weight 
	**/
	public String getWeight();
	
	/**
	*setweight 
	* Weight of queue - when compared to other queues, higher weights get  first shot at available channels when the same channel is included in  more than one queue.
	* @behavior.fieldname weight 
	*/
	public void setWeight(String aweight);


	/**
	* getwrapuptime 
	* After a successful call, how long to wait before sending a potentially free member another call (default is 0, or no delay)
	* @behavior.fieldname wrapuptime 
	**/
	public Integer getWrapuptime();
	
	/**
	*setwrapuptime 
	* After a successful call, how long to wait before sending a potentially free member another call (default is 0, or no delay)
	* @behavior.fieldname wrapuptime 
	*/
	public void setWrapuptime(Integer awrapuptime);


	/**
	* getmaxlen 
	* Maximum number of people waiting in the queue (0 for unlimited)
	* @behavior.fieldname maxlen 
	**/
	public Integer getMaxlen();
	
	/**
	*setmaxlen 
	* Maximum number of people waiting in the queue (0 for unlimited)
	* @behavior.fieldname maxlen 
	*/
	public void setMaxlen(Integer amaxlen);


	/**
	* getannouncefrequency 
	* How often to announce queue position and/or estimated holdtime to caller (0=off)
	* @behavior.fieldname announcefrequency 
	**/
	public Integer getAnnouncefrequency();
	
	/**
	*setannouncefrequency 
	* How often to announce queue position and/or estimated holdtime to caller (0=off)
	* @behavior.fieldname announcefrequency 
	*/
	public void setAnnouncefrequency(Integer aannouncefrequency);


	/**
	* getannounceholdtime 
	* Should we include estimated hold time in position announcements? Either yes, no, or only once. Hold time will be announced as the estimated time,  or "less than 2 minutes" when appropriate.
	* @behavior.fieldname announceholdtime 
	**/
	public Boolean getAnnounceholdtime();
	
	/**
	*setannounceholdtime 
	* Should we include estimated hold time in position announcements? Either yes, no, or only once. Hold time will be announced as the estimated time,  or "less than 2 minutes" when appropriate.
	* @behavior.fieldname announceholdtime 
	*/
	public void setAnnounceholdtime(Boolean aannounceholdtime);


	/**
	* getannounceroundseconds 
	* What's the rounding time for the seconds? If this is non zero then we announce the seconds as well as the minutes rounded to this value
	* @behavior.fieldname announceroundseconds 
	**/
	public String getAnnounceroundseconds();
	
	/**
	*setannounceroundseconds 
	* What's the rounding time for the seconds? If this is non zero then we announce the seconds as well as the minutes rounded to this value
	* @behavior.fieldname announceroundseconds 
	*/
	public void setAnnounceroundseconds(String aannounceroundseconds);


	/**
	* getmonitorformat 
	* Calls may be recorded using Asterisk's monitor resource This can be enabled from within the Queue application, starting recording when the call is actually picked up thus, only successful calls are

 recorded, and you are not recording while people are listening to MOH.

 To enable monitoring, simply specify "monitor-format"  it will be disabled

 otherwise. You can specify the monitor filename with by calling Set(MONITOR_FILENAME=foo)

 Otherwise it will use ${UNIQUEID}
	* @behavior.fieldname monitorformat 
	**/
	public String getMonitorformat();
	
	/**
	*setmonitorformat 
	* Calls may be recorded using Asterisk's monitor resource This can be enabled from within the Queue application, starting recording when the call is actually picked up thus, only successful calls are

 recorded, and you are not recording while people are listening to MOH.

 To enable monitoring, simply specify "monitor-format"  it will be disabled

 otherwise. You can specify the monitor filename with by calling Set(MONITOR_FILENAME=foo)

 Otherwise it will use ${UNIQUEID}
	* @behavior.fieldname monitorformat 
	*/
	public void setMonitorformat(String amonitorformat);


	/**
	* getmonitorjoin 
	* If you wish to have the two files joined together when the call ends set this to yes
	* @behavior.fieldname monitorjoin 
	**/
	public Boolean getMonitorjoin();
	
	/**
	*setmonitorjoin 
	* If you wish to have the two files joined together when the call ends set this to yes
	* @behavior.fieldname monitorjoin 
	*/
	public void setMonitorjoin(Boolean amonitorjoin);


	/**
	* getjoinempty 
	* This setting controls whether callers can join a queue with no members. There are three

 choices:

yes - callers can join a queue with no members or only unavailable members no - callers cannot join a queue with no members strict - callers cannot join a queue with no members or only unavailable members
	* @behavior.fieldname joinempty 
	**/
	public String getJoinempty();
	
	/**
	*setjoinempty 
	* This setting controls whether callers can join a queue with no members. There are three

 choices:

yes - callers can join a queue with no members or only unavailable members no - callers cannot join a queue with no members strict - callers cannot join a queue with no members or only unavailable members
	* @behavior.fieldname joinempty 
	*/
	public void setJoinempty(String ajoinempty);


	/**
	* getleavewhenempty 
	* If you wish to remove callers from the queue when new callers cannot join, set this setting to one of the same choices for 'joinempty'
	* @behavior.fieldname leavewhenempty 
	**/
	public String getLeavewhenempty();
	
	/**
	*setleavewhenempty 
	* If you wish to remove callers from the queue when new callers cannot join, set this setting to one of the same choices for 'joinempty'
	* @behavior.fieldname leavewhenempty 
	*/
	public void setLeavewhenempty(String aleavewhenempty);


	/**
	* geteventwhencalled 
	* If this is set to yes, the following manager events will be generated:

 AgentCalled, AgentDump, AgentConnect, AgentComplete (may generate some extra manager events, but probably ones you want)
	* @behavior.fieldname eventwhencalled 
	**/
	public Boolean getEventwhencalled();
	
	/**
	*seteventwhencalled 
	* If this is set to yes, the following manager events will be generated:

 AgentCalled, AgentDump, AgentConnect, AgentComplete (may generate some extra manager events, but probably ones you want)
	* @behavior.fieldname eventwhencalled 
	*/
	public void setEventwhencalled(Boolean aeventwhencalled);


	/**
	* geteventmemberstatusoff 
	* If this is set to no, the following manager events will be generated: QueueMemberStatus (may generate a WHOLE LOT of extra manager events)
	* @behavior.fieldname eventmemberstatusoff 
	**/
	public Boolean getEventmemberstatusoff();
	
	/**
	*seteventmemberstatusoff 
	* If this is set to no, the following manager events will be generated: QueueMemberStatus (may generate a WHOLE LOT of extra manager events)
	* @behavior.fieldname eventmemberstatusoff 
	*/
	public void setEventmemberstatusoff(Boolean aeventmemberstatusoff);


	/**
	* getreportholdtime 
	* If you wish to report the caller's hold time to the member before they are connected to the caller, set this to yes.
	* @behavior.fieldname reportholdtime 
	**/
	public Boolean getReportholdtime();
	
	/**
	*setreportholdtime 
	* If you wish to report the caller's hold time to the member before they are connected to the caller, set this to yes.
	* @behavior.fieldname reportholdtime 
	*/
	public void setReportholdtime(Boolean areportholdtime);


	/**
	* getmemberdelay 
	* If you wish to have a delay before the member is connected to the caller (or before the member hears any announcement messages), set this to the number of seconds to delay.
	* @behavior.fieldname memberdelay 
	**/
	public Integer getMemberdelay();
	
	/**
	*setmemberdelay 
	* If you wish to have a delay before the member is connected to the caller (or before the member hears any announcement messages), set this to the number of seconds to delay.
	* @behavior.fieldname memberdelay 
	*/
	public void setMemberdelay(Integer amemberdelay);


	/**
	* gettimeoutrestart 
	* If timeoutrestart is set to yes, then the timeout for an agent to answer is reset if a BUSY or CONGESTION is received.  This can be useful if agents are able to cancel a call with reject or similar.
	* @behavior.fieldname timeoutrestart 
	**/
	public Boolean getTimeoutrestart();
	
	/**
	*settimeoutrestart 
	* If timeoutrestart is set to yes, then the timeout for an agent to answer is reset if a BUSY or CONGESTION is received.  This can be useful if agents are able to cancel a call with reject or similar.
	* @behavior.fieldname timeoutrestart 
	*/
	public void setTimeoutrestart(Boolean atimeoutrestart);


}