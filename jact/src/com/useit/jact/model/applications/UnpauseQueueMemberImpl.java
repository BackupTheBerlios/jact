package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * UnpauseQueueMemberImpl
 * </p>
 * Created : Wed Jul 05 19:03:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: UnpauseQueueMemberImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class UnpauseQueueMemberImpl extends UnpauseQueueMember{
	
	/**
	* einfacher Konstruktor für UnpauseQueueMember
	**/
	public UnpauseQueueMemberImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für UnpauseQueueMember
	**/
	public UnpauseQueueMemberImpl( String aqueuename, String ainterface_){
		super();
	
		this.queuename = aqueuename;	
		this.interface_ = ainterface_;	
	}
}