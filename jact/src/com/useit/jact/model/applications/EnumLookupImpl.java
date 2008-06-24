package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * EnumLookupImpl
 * </p>
 * Created : Wed Jul 05 19:03:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumLookupImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class EnumLookupImpl extends EnumLookup{
	
	/**
	* einfacher Konstruktor für EnumLookup
	**/
	public EnumLookupImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für EnumLookup
	**/
	public EnumLookupImpl( String aexten){
		super();
	
		this.exten = aexten;	
	}
}