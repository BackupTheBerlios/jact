package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ParkedCallImpl
 * </p>
 * Created : Wed Jul 05 19:00:20 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkedCallImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ParkedCallImpl extends ParkedCall{
	
	/**
	* einfacher Konstruktor für ParkedCall
	**/
	public ParkedCallImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ParkedCall
	**/
	public ParkedCallImpl( String aexten){
		super();
	
		this.exten = aexten;	
	}
}