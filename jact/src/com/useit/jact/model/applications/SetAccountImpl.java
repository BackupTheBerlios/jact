package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetAccountImpl
 * </p>
 * Created : Wed Jul 05 19:00:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAccountImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetAccountImpl extends SetAccount{
	
	/**
	* einfacher Konstruktor für SetAccount
	**/
	public SetAccountImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetAccount
	**/
	public SetAccountImpl( String aaccount){
		super();
	
		this.account = aaccount;	
	}
}