package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DirectoryImpl
 * </p>
 * Created : Wed Jul 05 19:00:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DirectoryImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class DirectoryImpl extends Directory{
	
	/**
	* einfacher Konstruktor für Directory
	**/
	public DirectoryImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Directory
	**/
	public DirectoryImpl( String avm, String adial, String acontext, String aoptions){
		super();
	
		this.vm = avm;	
		this.dial = adial;	
		this.context = acontext;	
		this.options = aoptions;	
	}
}