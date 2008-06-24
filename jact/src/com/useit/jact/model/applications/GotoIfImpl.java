package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.AbstractExtension;

/**
 * <p>
 * GotoIfImpl
 * </p>
 * Created : Wed Jul 05 19:01:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class GotoIfImpl extends GotoIf{
	
	/**
	* einfacher Konstruktor für GotoIf
	**/
	public GotoIfImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GotoIf
	**/
	public GotoIfImpl( String acondition, String alabel1, String alabel2, AbstractExtension aextension1, AbstractExtension aextension2){
		super();
	
		this.condition = acondition;	
		this.label1 = alabel1;	
		this.extension2 = aextension2;	
		this.extension1 = aextension1;	
		this.label2 = alabel2;	
	}
}