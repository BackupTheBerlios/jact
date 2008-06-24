package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SayDigitsImpl
 * </p>
 * Created : Wed Jul 05 19:02:31 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayDigitsImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SayDigitsImpl extends SayDigits{
	
	/**
	* einfacher Konstruktor für SayDigits
	**/
	public SayDigitsImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayDigits
	**/
	public SayDigitsImpl( String adigits){
		super();
	
		this.digits = adigits;	
	}
}