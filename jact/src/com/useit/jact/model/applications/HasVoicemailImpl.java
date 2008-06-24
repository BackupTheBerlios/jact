package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * HasVoicemailImpl
 * </p>
 * Created : Wed Jul 05 19:02:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: HasVoicemailImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class HasVoicemailImpl extends HasVoicemail{
	
	/**
	* einfacher Konstruktor für HasVoicemail
	**/
	public HasVoicemailImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für HasVoicemail
	**/
	public HasVoicemailImpl( String avmbox, String acontext, String afolder, String avarname){
		super();
	
		this.vmbox = avmbox;	
		this.context = acontext;	
		this.folder = afolder;	
		this.varname = avarname;	
	}
}