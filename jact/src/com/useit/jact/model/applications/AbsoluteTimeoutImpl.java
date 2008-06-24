package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AbsoluteTimeoutImpl
 * </p>
 * Created : Wed Jul 05 19:02:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AbsoluteTimeoutImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class AbsoluteTimeoutImpl extends AbsoluteTimeout{
	
	/**
	* einfacher Konstruktor für AbsoluteTimeout
	**/
	public AbsoluteTimeoutImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AbsoluteTimeout
	**/
	public AbsoluteTimeoutImpl( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
}