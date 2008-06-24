package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ADSIProgImpl
 * </p>
 * Created : Wed Jul 05 19:02:26 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ADSIProgImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ADSIProgImpl extends ADSIProg{
	
	/**
	* einfacher Konstruktor für ADSIProg
	**/
	public ADSIProgImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ADSIProg
	**/
	public ADSIProgImpl( String ascript){
		super();
	
		this.script = ascript;	
	}
}