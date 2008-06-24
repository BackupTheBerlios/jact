package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * TrySystemImpl
 * </p>
 * Created : Wed Jul 05 19:01:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TrySystemImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class TrySystemImpl extends TrySystem{
	
	/**
	* einfacher Konstruktor für TrySystem
	**/
	public TrySystemImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für TrySystem
	**/
	public TrySystemImpl( String acommand){
		super();
	
		this.command = acommand;	
	}
}