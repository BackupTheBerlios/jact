package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * CutImpl
 * </p>
 * Created : Wed Jul 05 19:03:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CutImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class CutImpl extends Cut{
	
	/**
	* einfacher Konstruktor für Cut
	**/
	public CutImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Cut
	**/
	public CutImpl( String anewvar, String avarname, String adelimiter, String afield){
		super();
	
		this.newvar = anewvar;	
		this.varname = avarname;	
		this.delimiter = adelimiter;	
		this.field = afield;	
	}
}