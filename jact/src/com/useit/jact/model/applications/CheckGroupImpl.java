package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * CheckGroupImpl
 * </p>
 * Created : Wed Jul 05 19:02:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CheckGroupImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class CheckGroupImpl extends CheckGroup{
	
	/**
	* einfacher Konstruktor für CheckGroup
	**/
	public CheckGroupImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für CheckGroup
	**/
	public CheckGroupImpl( String amax, String acategory){
		super();
	
		this.max = amax;	
		this.category = acategory;	
	}
}