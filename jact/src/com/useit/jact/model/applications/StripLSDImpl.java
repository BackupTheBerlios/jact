package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * StripLSDImpl
 * </p>
 * Created : Wed Jul 05 19:02:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StripLSDImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class StripLSDImpl extends StripLSD{
	
	/**
	* einfacher Konstruktor für StripLSD
	**/
	public StripLSDImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für StripLSD
	**/
	public StripLSDImpl( String acount){
		super();
	
		this.count = acount;	
	}
}