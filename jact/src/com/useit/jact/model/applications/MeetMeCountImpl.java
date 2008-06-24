package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MeetMeCountImpl
 * </p>
 * Created : Wed Jul 05 19:02:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeCountImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class MeetMeCountImpl extends MeetMeCount{
	
	/**
	* einfacher Konstruktor für MeetMeCount
	**/
	public MeetMeCountImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MeetMeCount
	**/
	public MeetMeCountImpl( String aconfno, String avar){
		super();
	
		this.confno = aconfno;	
		this.var = avar;	
	}
}