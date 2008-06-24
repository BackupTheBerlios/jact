package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ChanIsAvailImpl
 * </p>
 * Created : Wed Jul 05 18:59:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ChanIsAvailImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ChanIsAvailImpl extends ChanIsAvail{
	
	/**
	* einfacher Konstruktor für ChanIsAvail
	**/
	public ChanIsAvailImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ChanIsAvail
	**/
	public ChanIsAvailImpl( String aformatstr, String atechnology, String aresource, String atechnology2, String aresource2, String aoption){
		super();
	
		this.formatstr = aformatstr;	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.technology2 = atechnology2;	
		this.resource2 = aresource2;	
		this.option = aoption;	
	}
}