package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MeetMeAdminImpl
 * </p>
 * Created : Wed Jul 05 19:01:39 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeAdminImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class MeetMeAdminImpl extends MeetMeAdmin{
	
	/**
	* einfacher Konstruktor für MeetMeAdmin
	**/
	public MeetMeAdminImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MeetMeAdmin
	**/
	public MeetMeAdminImpl( String aconfno, String acommand, String auser){
		super();
	
		this.confno = aconfno;	
		this.command = acommand;	
		this.user = auser;	
	}
}