package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MacroImpl
 * </p>
 * Created : Wed Jul 05 18:59:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class MacroImpl extends Macro{
	
	/**
	* einfacher Konstruktor für Macro
	**/
	public MacroImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Macro
	**/
	public MacroImpl( String amacroname, String aarg1, String aarg2){
		super();
	
		this.macroname = amacroname;	
		this.arg1 = aarg1;	
		this.arg2 = aarg2;	
	}
}