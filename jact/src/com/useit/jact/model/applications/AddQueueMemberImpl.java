package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AddQueueMemberImpl
 * </p>
 * Created : Wed Jul 05 19:01:21 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AddQueueMemberImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class AddQueueMemberImpl extends AddQueueMember{
	
	/**
	* einfacher Konstruktor für AddQueueMember
	**/
	public AddQueueMemberImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AddQueueMember
	**/
	public AddQueueMemberImpl( String aqueuename, String ainterface_, String apenalty){
		super();
	
		this.queuename = aqueuename;	
		this.interface_ = ainterface_;	
		this.penalty = apenalty;	
	}
}