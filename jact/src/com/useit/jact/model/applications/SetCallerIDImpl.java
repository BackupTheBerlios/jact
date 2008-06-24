package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetCallerIDImpl
 * </p>
 * Created : Wed Jul 05 19:02:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCallerIDImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetCallerIDImpl extends SetCallerID{
	
	/**
	* einfacher Konstruktor für SetCallerID
	**/
	public SetCallerIDImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCallerID
	**/
	public SetCallerIDImpl( String aclid, String aa){
		super();
	
		this.clid = aclid;	
		this.a = aa;	
	}
}