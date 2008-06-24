package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * PlaybackImpl
 * </p>
 * Created : Wed Jul 05 19:03:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PlaybackImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class PlaybackImpl extends Playback{
	
	/**
	* einfacher Konstruktor für Playback
	**/
	public PlaybackImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Playback
	**/
	public PlaybackImpl( String afilename, String aoption){
		super();
	
		this.filename = afilename;	
		this.option = aoption;	
	}
}