package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * UserEventImpl
 * </p>
 * Created : Wed Jul 05 19:00:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: UserEventImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class UserEventImpl extends UserEvent{
	
	/**
	* einfacher Konstruktor für UserEvent
	**/
	public UserEventImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für UserEvent
	**/
	public UserEventImpl( String aeventname, String abody){
		super();
	
		this.eventname = aeventname;	
		this.body = abody;	
	}
}