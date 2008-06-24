package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SystemImpl
 * </p>
 * Created : Wed Jul 05 19:01:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SystemImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SystemImpl extends System{
	
	/**
	* einfacher Konstruktor für System
	**/
	public SystemImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für System
	**/
	public SystemImpl( String acommand){
		super();
	
		this.command = acommand;	
	}
}