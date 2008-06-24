package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.AbstractExtension;

/**
 * <p>
 * AgentCallbackLoginImpl
 * </p>
 * Created : Wed Jul 05 18:59:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentCallbackLoginImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class AgentCallbackLoginImpl extends AgentCallbackLogin{
	
	/**
	* einfacher Konstruktor für AgentCallbackLogin
	**/
	public AgentCallbackLoginImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AgentCallbackLogin
	**/
	public AgentCallbackLoginImpl( String aagentNo, String aoptions, String aexten, String acontext, AbstractExtension aextension){
		super();
	
		this.agentNo = aagentNo;	
		this.options = aoptions;	
		this.extension = aextension;	
		this.exten = aexten;	
		this.context = acontext;	
	}
}