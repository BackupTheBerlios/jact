package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * VMAuthenticateImpl
 * </p>
 * Created : Wed Jul 05 19:01:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VMAuthenticateImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class VMAuthenticateImpl extends VMAuthenticate{
	
	/**
	* einfacher Konstruktor für VMAuthenticate
	**/
	public VMAuthenticateImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für VMAuthenticate
	**/
	public VMAuthenticateImpl( String amailbox, String acontext){
		super();
	
		this.mailbox = amailbox;	
		this.context = acontext;	
	}
}