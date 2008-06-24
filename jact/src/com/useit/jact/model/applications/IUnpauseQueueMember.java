

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IUnpauseQueueMember<br>
 * Unpauses (resumes calls to) a queue member. This is the counterpart to PauseQueueMember and operates exactly the same way, except it unpauses instead of pausing the given interface. Example: UnpauseQueueMember(|SIP/3000)
 * </p>
 * Created : Wed Jul 05 18:56:00 CEST 2006
 * 
 * @behavior.elementname UnpauseQueueMember
 * @author urs
 * @version $Revision: 1.1 $, $Id: IUnpauseQueueMember.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IUnpauseQueueMember {
public static final String MODELNAME = "UnpauseQueueMember";	
 
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