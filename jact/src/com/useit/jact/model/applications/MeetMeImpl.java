package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MeetMeImpl
 * </p>
 * Created : Wed Jul 05 19:03:18 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MeetMeImpl extends MeetMe{
	
	/**
	* einfacher Konstruktor für MeetMe
	**/
	public MeetMeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MeetMe
	**/
	public MeetMeImpl( String aconfno, String aoptions, String apin){
		super();
	
		this.confno = aconfno;	
		this.options = aoptions;	
		this.pin = apin;	
	}
}