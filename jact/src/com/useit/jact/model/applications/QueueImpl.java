package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * QueueImpl
 * </p>
 * Created : Wed Jul 05 19:02:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueueImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class QueueImpl extends Queue{
	
	/**
	* einfacher Konstruktor für Queue
	**/
	public QueueImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Queue
	**/
	public QueueImpl( String aqueuename, String aoptions, String auRL, String aannounceoverride, String atimeout){
		super();
	
		this.queuename = aqueuename;	
		this.options = aoptions;	
		this.uRL = auRL;	
		this.announceoverride = aannounceoverride;	
		this.timeout = atimeout;	
	}
}