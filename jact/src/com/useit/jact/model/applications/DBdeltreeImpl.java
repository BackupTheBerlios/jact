package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DBdeltreeImpl
 * </p>
 * Created : Wed Jul 05 19:02:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBdeltreeImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class DBdeltreeImpl extends DBdeltree{
	
	/**
	* einfacher Konstruktor für DBdeltree
	**/
	public DBdeltreeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DBdeltree
	**/
	public DBdeltreeImpl( String afamily, String akeytree){
		super();
	
		this.family = afamily;	
		this.keytree = akeytree;	
	}
}