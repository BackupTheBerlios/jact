package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MusicOnHoldImpl
 * </p>
 * Created : Wed Jul 05 19:00:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MusicOnHoldImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MusicOnHoldImpl extends MusicOnHold{
	
	/**
	* einfacher Konstruktor für MusicOnHold
	**/
	public MusicOnHoldImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MusicOnHold
	**/
	public MusicOnHoldImpl( String aclass_){
		super();
	
		this.class_ = aclass_;	
	}
}