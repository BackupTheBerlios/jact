package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AuthenticateImpl
 * </p>
 * Created : Wed Jul 05 19:02:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AuthenticateImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class AuthenticateImpl extends Authenticate{
	
	/**
	* einfacher Konstruktor für Authenticate
	**/
	public AuthenticateImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Authenticate
	**/
	public AuthenticateImpl( String apassword, String aoptions){
		super();
	
		this.password = apassword;	
		this.options = aoptions;	
	}
}