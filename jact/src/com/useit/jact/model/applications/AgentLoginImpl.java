package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AgentLoginImpl
 * </p>
 * Created : Wed Jul 05 19:03:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentLoginImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class AgentLoginImpl extends AgentLogin{
	
	/**
	* einfacher Konstruktor für AgentLogin
	**/
	public AgentLoginImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AgentLogin
	**/
	public AgentLoginImpl( String aagentNo, String aoptions){
		super();
	
		this.agentNo = aagentNo;	
		this.options = aoptions;	
	}
}