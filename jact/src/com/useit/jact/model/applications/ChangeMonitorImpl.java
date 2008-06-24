package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ChangeMonitorImpl
 * </p>
 * Created : Wed Jul 05 18:59:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ChangeMonitorImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ChangeMonitorImpl extends ChangeMonitor{
	
	/**
	* einfacher Konstruktor für ChangeMonitor
	**/
	public ChangeMonitorImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ChangeMonitor
	**/
	public ChangeMonitorImpl( String afilename_base){
		super();
	
		this.filename_base = afilename_base;	
	}
}