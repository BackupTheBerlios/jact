

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRemoveQueueMember<br>
 * Dynamically removes interface to an existing queue If the interface is NOT in the queue and there exists an n+101 priority then it will then jump to this priority. Otherwise it will return an error Returns -1 if there is an error. Example: RemoveQueueMember(techsupport|SIP/3000)
 * </p>
 * Created : Wed Jul 05 18:54:26 CEST 2006
 * 
 * @behavior.elementname RemoveQueueMember
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRemoveQueueMember.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IRemoveQueueMember {
public static final String MODELNAME = "RemoveQueueMember";	
 
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