package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AgentMonitorOutgoingImpl
 * </p>
 * Created : Wed Jul 05 19:00:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentMonitorOutgoingImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class AgentMonitorOutgoingImpl extends AgentMonitorOutgoing{
	
	/**
	* einfacher Konstruktor für AgentMonitorOutgoing
	**/
	public AgentMonitorOutgoingImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AgentMonitorOutgoing
	**/
	public AgentMonitorOutgoingImpl( String aoptions){
		super();
	
		this.options = aoptions;	
	}
}