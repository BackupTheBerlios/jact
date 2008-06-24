package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * WaitExtenImpl
 * </p>
 * Created : Wed Jul 05 19:00:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitExtenImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class WaitExtenImpl extends WaitExten{
	
	/**
	* einfacher Konstruktor für WaitExten
	**/
	public WaitExtenImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für WaitExten
	**/
	public WaitExtenImpl( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
}