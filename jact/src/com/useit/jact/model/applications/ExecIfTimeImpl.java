package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ExecIfTimeImpl
 * </p>
 * Created : Wed Jul 05 19:00:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIfTimeImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ExecIfTimeImpl extends ExecIfTime{
	
	/**
	* einfacher Konstruktor für ExecIfTime
	**/
	public ExecIfTimeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ExecIfTime
	**/
	public ExecIfTimeImpl( String atimes, String aweekdays, String amdays, String amonths, String aappname, String aappdata){
		super();
	
		this.times = atimes;	
		this.weekdays = aweekdays;	
		this.mdays = amdays;	
		this.months = amonths;	
		this.appname = aappname;	
		this.appdata = aappdata;	
	}
}