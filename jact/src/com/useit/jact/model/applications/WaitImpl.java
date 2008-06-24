package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * WaitImpl
 * </p>
 * Created : Wed Jul 05 19:01:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class WaitImpl extends Wait{
	
	/**
	* einfacher Konstruktor für Wait
	**/
	public WaitImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Wait
	**/
	public WaitImpl( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
}