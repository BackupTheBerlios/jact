package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SendDTMFImpl
 * </p>
 * Created : Wed Jul 05 19:03:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendDTMFImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SendDTMFImpl extends SendDTMF{
	
	/**
	* einfacher Konstruktor f�r SendDTMF
	**/
	public SendDTMFImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r SendDTMF
	**/
	public SendDTMFImpl( String adigits, String atimeout_ms){
		super();
	
		this.digits = adigits;	
		this.timeout_ms = atimeout_ms;	
	}
}