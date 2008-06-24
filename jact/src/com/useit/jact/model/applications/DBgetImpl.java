package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DBgetImpl
 * </p>
 * Created : Wed Jul 05 19:03:20 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBgetImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class DBgetImpl extends DBget{
	
	/**
	* einfacher Konstruktor für DBget
	**/
	public DBgetImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DBget
	**/
	public DBgetImpl( String avarname, String afamily, String akey){
		super();
	
		this.varname = avarname;	
		this.family = afamily;	
		this.key = akey;	
	}
}