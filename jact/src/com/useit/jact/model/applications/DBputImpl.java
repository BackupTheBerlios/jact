package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DBputImpl
 * </p>
 * Created : Wed Jul 05 19:00:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBputImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class DBputImpl extends DBput{
	
	/**
	* einfacher Konstruktor für DBput
	**/
	public DBputImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DBput
	**/
	public DBputImpl( String afamily, String akey, String avalue){
		super();
	
		this.family = afamily;	
		this.key = akey;	
		this.value = avalue;	
	}
}