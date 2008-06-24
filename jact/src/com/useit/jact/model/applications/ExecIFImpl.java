package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ExecIFImpl
 * </p>
 * Created : Wed Jul 05 19:01:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIFImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ExecIFImpl extends ExecIF{
	
	/**
	* einfacher Konstruktor für ExecIF
	**/
	public ExecIFImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ExecIF
	**/
	public ExecIFImpl( String aexpr, String aapp, String adata){
		super();
	
		this.expr = aexpr;	
		this.app = aapp;	
		this.data = adata;	
	}
}