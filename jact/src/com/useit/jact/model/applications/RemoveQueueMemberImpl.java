package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * RemoveQueueMemberImpl
 * </p>
 * Created : Wed Jul 05 19:01:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RemoveQueueMemberImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class RemoveQueueMemberImpl extends RemoveQueueMember{
	
	/**
	* einfacher Konstruktor für RemoveQueueMember
	**/
	public RemoveQueueMemberImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RemoveQueueMember
	**/
	public RemoveQueueMemberImpl( String aqueuename, String ainterface_){
		super();
	
		this.queuename = aqueuename;	
		this.interface_ = ainterface_;	
	}
}