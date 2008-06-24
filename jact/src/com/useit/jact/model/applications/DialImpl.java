package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DialImpl
 * </p>
 * Created : Wed Jul 05 19:00:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DialImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class DialImpl extends Dial{
	
	/**
	* einfacher Konstruktor für Dial
	**/
	public DialImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Dial
	**/
	public DialImpl( String atechnology, String aresource, String atechnology2, String aresource2, String atimeout, String aoptions, String auRL){
		super();
	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.technology2 = atechnology2;	
		this.resource2 = aresource2;	
		this.timeout = atimeout;	
		this.options = aoptions;	
		this.uRL = auRL;	
	}
}