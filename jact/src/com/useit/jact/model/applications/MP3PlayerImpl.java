package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MP3PlayerImpl
 * </p>
 * Created : Wed Jul 05 19:00:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MP3PlayerImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class MP3PlayerImpl extends MP3Player{
	
	/**
	* einfacher Konstruktor für MP3Player
	**/
	public MP3PlayerImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MP3Player
	**/
	public MP3PlayerImpl( String alocation){
		super();
	
		this.location = alocation;	
	}
}