package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * PrefixImpl
 * </p>
 * Created : Wed Jul 05 19:00:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PrefixImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class PrefixImpl extends Prefix{
	
	/**
	* einfacher Konstruktor für Prefix
	**/
	public PrefixImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Prefix
	**/
	public PrefixImpl( String adigits){
		super();
	
		this.digits = adigits;	
	}
}