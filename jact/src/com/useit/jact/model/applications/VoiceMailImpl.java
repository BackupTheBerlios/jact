package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * VoiceMailImpl
 * </p>
 * Created : Wed Jul 05 19:01:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class VoiceMailImpl extends VoiceMail{
	
	/**
	* einfacher Konstruktor für VoiceMail
	**/
	public VoiceMailImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für VoiceMail
	**/
	public VoiceMailImpl( String as, String au, String ab, String aextension, String acontext){
		super();
	
		this.s = as;	
		this.u = au;	
		this.b = ab;	
		this.extension = aextension;	
		this.context = acontext;	
	}
}