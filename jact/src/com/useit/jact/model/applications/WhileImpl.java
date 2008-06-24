package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * WhileImpl
 * </p>
 * Created : Wed Jul 05 19:03:15 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WhileImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class WhileImpl extends While{
	
	/**
	* einfacher Konstruktor für While
	**/
	public WhileImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für While
	**/
	public WhileImpl( String aexpr){
		super();
	
		this.expr = aexpr;	
	}
}