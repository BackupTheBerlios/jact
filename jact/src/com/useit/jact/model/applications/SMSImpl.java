package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SMSImpl
 * </p>
 * Created : Wed Jul 05 19:00:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SMSImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SMSImpl extends SMS{
	
	/**
	* einfacher Konstruktor für SMS
	**/
	public SMSImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SMS
	**/
	public SMSImpl( String aname, String aa, String as){
		super();
	
		this.name = aname;	
		this.a = aa;	
		this.s = as;	
	}
}