package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * RetryDialImpl
 * </p>
 * Created : Wed Jul 05 19:03:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RetryDialImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class RetryDialImpl extends RetryDial{
	
	/**
	* einfacher Konstruktor für RetryDial
	**/
	public RetryDialImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RetryDial
	**/
	public RetryDialImpl( String aannounce, String asleep, String aloops, String atechnology, String aresource, String atechnology2, String aresource2, String atimeout, String aoptions, String auRL){
		super();
	
		this.announce = aannounce;	
		this.sleep = asleep;	
		this.loops = aloops;	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.technology2 = atechnology2;	
		this.resource2 = aresource2;	
		this.timeout = atimeout;	
		this.options = aoptions;	
		this.uRL = auRL;	
	}
}