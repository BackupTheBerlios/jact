package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * PauseQueueMemberImpl
 * </p>
 * Created : Wed Jul 05 19:00:18 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PauseQueueMemberImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class PauseQueueMemberImpl extends PauseQueueMember{
	
	/**
	* einfacher Konstruktor für PauseQueueMember
	**/
	public PauseQueueMemberImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für PauseQueueMember
	**/
	public PauseQueueMemberImpl( String aqueuename, String ainterface_){
		super();
	
		this.queuename = aqueuename;	
		this.interface_ = ainterface_;	
	}
}