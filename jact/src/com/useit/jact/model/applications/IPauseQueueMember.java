

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IPauseQueueMember<br>
 * Pauses (blocks calls for) a queue member. The given interface will be paused in the given queue. This prevents any calls from being sent from the queue to the interface until it is unpaused with UnpauseQueueMember or the manager interface. If no queuename is given, the interface is paused in every queue it is a member of. If the interface is not in the named queue, or if no queue is given and the interface is not in any queue, it will jump to  priority n+101, if it exists. Returns -1 if the interface is not found and no extension to jump to exists, 0 otherwise. Example: PauseQueueMember(|SIP/3000)
 * </p>
 * Created : Wed Jul 05 18:53:53 CEST 2006
 * 
 * @behavior.elementname PauseQueueMember
 * @author urs
 * @version $Revision: 1.1 $, $Id: IPauseQueueMember.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IPauseQueueMember {
public static final String MODELNAME = "PauseQueueMember";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_QUEUENAME="queuename" ;
// 	public static final String VALUEID_INTERFACE_="interface_" ;
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
	* getinterface_ 
	* 
	* @behavior.fieldname interface_ 
	**/
	public String getInterface_();
	
	/**
	*setinterface_ 
	* 
	* @behavior.fieldname interface_ 
	*/
	public void setInterface_(String ainterface_);

}