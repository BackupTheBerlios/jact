package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ParkImpl
 * </p>
 * Created : Wed Jul 05 19:01:18 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ParkImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ParkImpl extends Park{
	
	/**
	* einfacher Konstruktor für Park
	**/
	public ParkImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Park
	**/
	public ParkImpl( String aexten){
		super();
	
		this.exten = aexten;	
	}
}