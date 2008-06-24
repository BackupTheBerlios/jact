package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetGroupImpl
 * </p>
 * Created : Wed Jul 05 19:00:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGroupImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetGroupImpl extends SetGroup{
	
	/**
	* einfacher Konstruktor für SetGroup
	**/
	public SetGroupImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetGroup
	**/
	public SetGroupImpl( String agroup){
		super();
	
		this.group = agroup;	
	}
}