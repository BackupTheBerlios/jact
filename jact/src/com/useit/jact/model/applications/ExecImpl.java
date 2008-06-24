package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ExecImpl
 * </p>
 * Created : Wed Jul 05 19:01:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ExecImpl extends Exec{
	
	/**
	* einfacher Konstruktor für Exec
	**/
	public ExecImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Exec
	**/
	public ExecImpl( String aappname, String aarguments){
		super();
	
		this.arguments = aarguments;	
		this.appname = aappname;	
	}
}