package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * WaitMusicOnHoldImpl
 * </p>
 * Created : Wed Jul 05 19:02:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitMusicOnHoldImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class WaitMusicOnHoldImpl extends WaitMusicOnHold{
	
	/**
	* einfacher Konstruktor für WaitMusicOnHold
	**/
	public WaitMusicOnHoldImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für WaitMusicOnHold
	**/
	public WaitMusicOnHoldImpl( String adelay){
		super();
	
		this.delay = adelay;	
	}
}