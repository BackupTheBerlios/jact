package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.AbstractExtension;

/**
 * <p>
 * GotoImpl
 * </p>
 * Created : Wed Jul 05 19:02:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class GotoImpl extends Goto{
	
	/**
	* einfacher Konstruktor für Goto
	**/
	public GotoImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Goto
	**/
	public GotoImpl( String acontext, AbstractExtension aextension, String apriority){
		super();
	
		this.context = acontext;	
		this.extension = aextension;	
		this.priority = apriority;	
	}
}