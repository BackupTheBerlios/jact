package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * VoiceMailMainImpl
 * </p>
 * Created : Wed Jul 05 19:03:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailMainImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class VoiceMailMainImpl extends VoiceMailMain{
	
	/**
	* einfacher Konstruktor für VoiceMailMain
	**/
	public VoiceMailMainImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für VoiceMailMain
	**/
	public VoiceMailMainImpl( String as, String amailbox, String acontext){
		super();
	
		this.s = as;	
		this.mailbox = amailbox;	
		this.context = acontext;	
	}
}