package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ParkAndAnnounceImpl
 * </p>
 * Created : Wed Jul 05 19:01:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkAndAnnounceImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ParkAndAnnounceImpl extends ParkAndAnnounce{
	
	/**
	* einfacher Konstruktor für ParkAndAnnounce
	**/
	public ParkAndAnnounceImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ParkAndAnnounce
	**/
	public ParkAndAnnounceImpl( String aannounce, String atemplate, String atimeout, String adial, String areturn_context){
		super();
	
		this.announce = aannounce;	
		this.template = atemplate;	
		this.timeout = atimeout;	
		this.dial = adial;	
		this.return_context = areturn_context;	
	}
}