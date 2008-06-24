package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SayPhoneticImpl
 * </p>
 * Created : Wed Jul 05 19:03:10 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayPhoneticImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SayPhoneticImpl extends SayPhonetic{
	
	/**
	* einfacher Konstruktor für SayPhonetic
	**/
	public SayPhoneticImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayPhonetic
	**/
	public SayPhoneticImpl( String astring){
		super();
	
		this.string = astring;	
	}
}