package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DBdelImpl
 * </p>
 * Created : Wed Jul 05 19:03:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBdelImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class DBdelImpl extends DBdel{
	
	/**
	* einfacher Konstruktor für DBdel
	**/
	public DBdelImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DBdel
	**/
	public DBdelImpl( String afamily, String akey){
		super();
	
		this.family = afamily;	
		this.key = akey;	
	}
}