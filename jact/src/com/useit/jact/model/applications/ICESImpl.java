package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ICESImpl
 * </p>
 * Created : Wed Jul 05 19:01:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICESImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class ICESImpl extends ICES{
	
	/**
	* einfacher Konstruktor für ICES
	**/
	public ICESImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ICES
	**/
	public ICESImpl( String aconfig, String axml){
		super();
	
		this.config = aconfig;	
		this.xml = axml;	
	}
}