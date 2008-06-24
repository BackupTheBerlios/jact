package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * WaitForRingImpl
 * </p>
 * Created : Wed Jul 05 19:01:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitForRingImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class WaitForRingImpl extends WaitForRing{
	
	/**
	* einfacher Konstruktor für WaitForRing
	**/
	public WaitForRingImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für WaitForRing
	**/
	public WaitForRingImpl( String atimeout){
		super();
	
		this.timeout = atimeout;	
	}
}