package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DateTimeImpl
 * </p>
 * Created : Wed Jul 05 19:02:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DateTimeImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class DateTimeImpl extends DateTime{
	
	/**
	* einfacher Konstruktor für DateTime
	**/
	public DateTimeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DateTime
	**/
	public DateTimeImpl( String aunixtime, String atimezone, String aformat){
		super();
	
		this.unixtime = aunixtime;	
		this.timezone = atimezone;	
		this.format = aformat;	
	}
}