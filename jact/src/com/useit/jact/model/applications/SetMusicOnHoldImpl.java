package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetMusicOnHoldImpl
 * </p>
 * Created : Wed Jul 05 19:01:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetMusicOnHoldImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SetMusicOnHoldImpl extends SetMusicOnHold{
	
	/**
	* einfacher Konstruktor für SetMusicOnHold
	**/
	public SetMusicOnHoldImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetMusicOnHold
	**/
	public SetMusicOnHoldImpl( String aclass_){
		super();
	
		this.class_ = aclass_;	
	}
}