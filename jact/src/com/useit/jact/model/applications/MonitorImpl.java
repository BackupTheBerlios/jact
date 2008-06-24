package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MonitorImpl
 * </p>
 * Created : Wed Jul 05 19:02:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MonitorImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class MonitorImpl extends Monitor{
	
	/**
	* einfacher Konstruktor für Monitor
	**/
	public MonitorImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Monitor
	**/
	public MonitorImpl( String afile_format, String aurlbase, String afname_base, String aoptions){
		super();
	
		this.file_format = afile_format;	
		this.urlbase = aurlbase;	
		this.fname_base = afname_base;	
		this.options = aoptions;	
	}
}