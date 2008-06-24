package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * WaitForSilenceImpl
 * </p>
 * Created : Wed Jul 05 19:00:39 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitForSilenceImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class WaitForSilenceImpl extends WaitForSilence{
	
	/**
	* einfacher Konstruktor für WaitForSilence
	**/
	public WaitForSilenceImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für WaitForSilence
	**/
	public WaitForSilenceImpl( String ax, String ay){
		super();
	
		this.x = ax;	
		this.y = ay;	
	}
}