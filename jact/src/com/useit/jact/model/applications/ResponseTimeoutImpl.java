package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ResponseTimeoutImpl
 * </p>
 * Created : Wed Jul 05 19:03:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ResponseTimeoutImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ResponseTimeoutImpl extends ResponseTimeout{
	
	/**
	* einfacher Konstruktor f�r ResponseTimeout
	**/
	public ResponseTimeoutImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r ResponseTimeout
	**/
	public ResponseTimeoutImpl( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
}