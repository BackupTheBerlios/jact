package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * BusyImpl
 * </p>
 * Created : Wed Jul 05 19:00:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BusyImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class BusyImpl extends Busy{
	
	/**
	* einfacher Konstruktor für Busy
	**/
	public BusyImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Busy
	**/
	public BusyImpl( String atimeout){
		super();
	
		this.timeout = atimeout;	
	}
}