package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * StartMusicOnHoldImpl
 * </p>
 * Created : Wed Jul 05 19:01:19 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StartMusicOnHoldImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class StartMusicOnHoldImpl extends StartMusicOnHold{
	
	/**
	* einfacher Konstruktor für StartMusicOnHold
	**/
	public StartMusicOnHoldImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für StartMusicOnHold
	**/
	public StartMusicOnHoldImpl( String aclass_){
		super();
	
		this.class_ = aclass_;	
	}
}