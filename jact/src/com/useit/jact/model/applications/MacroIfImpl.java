package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MacroIfImpl
 * </p>
 * Created : Wed Jul 05 19:03:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MacroIfImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MacroIfImpl extends MacroIf{
	
	/**
	* einfacher Konstruktor für MacroIf
	**/
	public MacroIfImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MacroIf
	**/
	public MacroIfImpl( String aexpr, String amacroname_a, String amacroname_b, String aarg1){
		super();
	
		this.expr = aexpr;	
		this.macroname_a = amacroname_a;	
		this.macroname_b = amacroname_b;	
		this.arg1 = aarg1;	
	}
}