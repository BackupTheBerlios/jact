package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetCIDNameImpl
 * </p>
 * Created : Wed Jul 05 19:03:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDNameImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetCIDNameImpl extends SetCIDName{
	
	/**
	* einfacher Konstruktor für SetCIDName
	**/
	public SetCIDNameImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCIDName
	**/
	public SetCIDNameImpl( String acname, String aa){
		super();
	
		this.cname = acname;	
		this.a = aa;	
	}
}