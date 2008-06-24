package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * HasNewVoicemailImpl
 * </p>
 * Created : Wed Jul 05 19:01:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: HasNewVoicemailImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class HasNewVoicemailImpl extends HasNewVoicemail{
	
	/**
	* einfacher Konstruktor für HasNewVoicemail
	**/
	public HasNewVoicemailImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für HasNewVoicemail
	**/
	public HasNewVoicemailImpl( String avmbox, String afolder, String acontext, String avarname){
		super();
	
		this.vmbox = avmbox;	
		this.folder = afolder;	
		this.context = acontext;	
		this.varname = avarname;	
	}
}