package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetCIDNumImpl
 * </p>
 * Created : Wed Jul 05 18:59:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDNumImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SetCIDNumImpl extends SetCIDNum{
	
	/**
	* einfacher Konstruktor für SetCIDNum
	**/
	public SetCIDNumImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCIDNum
	**/
	public SetCIDNumImpl( String acnum, String aa){
		super();
	
		this.cnum = acnum;	
		this.a = aa;	
	}
}