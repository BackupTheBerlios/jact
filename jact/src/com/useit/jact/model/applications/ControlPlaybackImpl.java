package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ControlPlaybackImpl
 * </p>
 * Created : Wed Jul 05 19:02:15 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ControlPlaybackImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ControlPlaybackImpl extends ControlPlayback{
	
	/**
	* einfacher Konstruktor für ControlPlayback
	**/
	public ControlPlaybackImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ControlPlayback
	**/
	public ControlPlaybackImpl( String afilename, String askipms, String affchar, String arewchar, String astopchar, String apausechr){
		super();
	
		this.filename = afilename;	
		this.skipms = askipms;	
		this.ffchar = affchar;	
		this.rewchar = arewchar;	
		this.stopchar = astopchar;	
		this.pausechr = apausechr;	
	}
}