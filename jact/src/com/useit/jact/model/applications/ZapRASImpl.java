package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ZapRASImpl
 * </p>
 * Created : Wed Jul 05 19:02:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapRASImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ZapRASImpl extends ZapRAS{
	
	/**
	* einfacher Konstruktor für ZapRAS
	**/
	public ZapRASImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ZapRAS
	**/
	public ZapRASImpl( String aargs){
		super();
	
		this.args = aargs;	
	}
}