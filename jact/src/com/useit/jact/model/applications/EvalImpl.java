package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * EvalImpl
 * </p>
 * Created : Wed Jul 05 19:00:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EvalImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class EvalImpl extends Eval{
	
	/**
	* einfacher Konstruktor für Eval
	**/
	public EvalImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Eval
	**/
	public EvalImpl( String anewvar, String asomestring){
		super();
	
		this.newvar = anewvar;	
		this.somestring = asomestring;	
	}
}