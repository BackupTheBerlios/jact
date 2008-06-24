package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SayUnixTimeImpl
 * </p>
 * Created : Wed Jul 05 19:00:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayUnixTimeImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SayUnixTimeImpl extends SayUnixTime{
	
	/**
	* einfacher Konstruktor für SayUnixTime
	**/
	public SayUnixTimeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayUnixTime
	**/
	public SayUnixTimeImpl( String aunixtime, String atimezone, String aformat){
		super();
	
		this.unixtime = aunixtime;	
		this.timezone = atimezone;	
		this.format = aformat;	
	}
}