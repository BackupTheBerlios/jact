package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SayAlphaImpl
 * </p>
 * Created : Wed Jul 05 19:03:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayAlphaImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SayAlphaImpl extends SayAlpha{
	
	/**
	* einfacher Konstruktor für SayAlpha
	**/
	public SayAlphaImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayAlpha
	**/
	public SayAlphaImpl( String astring){
		super();
	
		this.string = astring;	
	}
}