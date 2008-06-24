package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetCallerPresImpl
 * </p>
 * Created : Wed Jul 05 19:00:22 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCallerPresImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SetCallerPresImpl extends SetCallerPres{
	
	/**
	* einfacher Konstruktor für SetCallerPres
	**/
	public SetCallerPresImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCallerPres
	**/
	public SetCallerPresImpl( String apresentation){
		super();
	
		this.presentation = apresentation;	
	}
}