

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IQueue<br>
 * Queues an incoming call in a particular call queue as defined in queues.conf.  This application returns -1 if the originating channel hangs up, or if the call is bridged and either of the parties in the bridge terminate the call. Returns 0 if the queue is full, nonexistant, or has no members. The option string may contain zero or more of the following characters:  't' -- allow the called user transfer the calling user  'T' -- to allow the calling user to transfer the call.  'd' -- data-quality (modem) call (minimum delay).  'h' -- allow callee to hang up by hitting *.  'H' -- allow caller to hang up by hitting *.  'n' -- no retries on the timeout; will exit this application and    go to the next step.  'r' -- ring instead of playing MOH  In addition to transferring the call, a call may be parked and then picked up by another user.  The optional URL will be sent to the called party if the channel supports it.  The timeout will cause the queue to fail out after a specified number of seconds, checked between each queues.conf 'timeout' and 'retry' cycle.
 * </p>
 * Created : Wed Jul 05 18:55:50 CEST 2006
 * 
 * @behavior.elementname Queue
 * @author urs
 * @version $Revision: 1.1 $, $Id: IQueue.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IQueue {
public static final String MODELNAME = "Queue";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_QUEUENAME="queuename" ;
// 	public static final String VALUEID_OPTIONS="options" ;
// 	public static final String VALUEID_URL="url" ;
// 	public static final String VALUEID_ANNOUNCEOVERRIDE="announceoverride" ;
// 	public static final String VALUEID_TIMEOUT="timeout" ;
	//test
	//---------  getter und setter
	/**
	* getqueuename 
	* 
	* @behavior.fieldname queuename 
	**/
	public String getQueuename();
	
	/**
	*setqueuename 
	* 
	* @behavior.fieldname queuename 
	*/
	public void setQueuename(String aqueuename);
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);
	/**
	* getuRL 
	* 
	* @behavior.fieldname uRL 
	**/
	public String getURL();
	
	/**
	*setuRL 
	* 
	* @behavior.fieldname uRL 
	*/
	public void setURL(String auRL);
	/**
	* getannounceoverride 
	* 
	* @behavior.fieldname announceoverride 
	**/
	public String getAnnounceoverride();
	
	/**
	*setannounceoverride 
	* 
	* @behavior.fieldname announceoverride 
	*/
	public void setAnnounceoverride(String aannounceoverride);
	/**
	* gettimeout 
	* 
	* @behavior.fieldname timeout 
	**/
	public String getTimeout();
	
	/**
	*settimeout 
	* 
	* @behavior.fieldname timeout 
	*/
	public void setTimeout(String atimeout);

}