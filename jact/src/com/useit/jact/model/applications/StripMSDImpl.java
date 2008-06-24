package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * StripMSDImpl
 * </p>
 * Created : Wed Jul 05 19:02:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StripMSDImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class StripMSDImpl extends StripMSD{
	
	/**
	* einfacher Konstruktor für StripMSD
	**/
	public StripMSDImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für StripMSD
	**/
	public StripMSDImpl( String acount){
		super();
	
		this.count = acount;	
	}
}