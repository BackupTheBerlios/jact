package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * VerboseImpl
 * </p>
 * Created : Wed Jul 05 19:00:36 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VerboseImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class VerboseImpl extends Verbose{
	
	/**
	* einfacher Konstruktor für Verbose
	**/
	public VerboseImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Verbose
	**/
	public VerboseImpl( String alevel, String amessage){
		super();
	
		this.level = alevel;	
		this.message = amessage;	
	}
}