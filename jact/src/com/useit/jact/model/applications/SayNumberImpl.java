package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SayNumberImpl
 * </p>
 * Created : Wed Jul 05 19:01:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayNumberImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SayNumberImpl extends SayNumber{
	
	/**
	* einfacher Konstruktor für SayNumber
	**/
	public SayNumberImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayNumber
	**/
	public SayNumberImpl( String adigits, String agender){
		super();
	
		this.digits = adigits;	
		this.gender = agender;	
	}
}