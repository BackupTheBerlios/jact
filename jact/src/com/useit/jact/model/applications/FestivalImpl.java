package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * FestivalImpl
 * </p>
 * Created : Wed Jul 05 19:02:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: FestivalImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class FestivalImpl extends Festival{
	
	/**
	* einfacher Konstruktor für Festival
	**/
	public FestivalImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Festival
	**/
	public FestivalImpl( String atext, String aintkeys){
		super();
	
		this.text = atext;	
		this.intkeys = aintkeys;	
	}
}