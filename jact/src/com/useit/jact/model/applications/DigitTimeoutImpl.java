package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DigitTimeoutImpl
 * </p>
 * Created : Wed Jul 05 19:00:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DigitTimeoutImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class DigitTimeoutImpl extends DigitTimeout{
	
	/**
	* einfacher Konstruktor für DigitTimeout
	**/
	public DigitTimeoutImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DigitTimeout
	**/
	public DigitTimeoutImpl( String aseconds){
		super();
	
		this.seconds = aseconds;	
	}
}