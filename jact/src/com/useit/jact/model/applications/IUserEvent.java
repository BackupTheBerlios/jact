

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IUserEvent<br>
 * Sends an arbitrary event to the manager interface, with an optional body representing additional arguments. The format of the event will be:  Event: UserEvent<specified event name>  Channel: <channel name>  Uniqueid: <call uniqueid>  [body] If the body is not specified, only Event, Channel, and Uniqueid fields will be present. Returns 0.
 * </p>
 * Created : Wed Jul 05 18:53:42 CEST 2006
 * 
 * @behavior.elementname UserEvent
 * @author urs
 * @version $Revision: 1.1 $, $Id: IUserEvent.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IUserEvent {
public static final String MODELNAME = "UserEvent";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EVENTNAME="eventname" ;
// 	public static final String VALUEID_BODY="body" ;
	//test
	//---------  getter und setter
	/**
	* geteventname 
	* 
	* @behavior.fieldname eventname 
	**/
	public String getEventname();
	
	/**
	*seteventname 
	* 
	* @behavior.fieldname eventname 
	*/
	public void setEventname(String aeventname);
	/**
	* getbody 
	* 
	* @behavior.fieldname body 
	**/
	public String getBody();
	
	/**
	*setbody 
	* 
	* @behavior.fieldname body 
	*/
	public void setBody(String abody);

}