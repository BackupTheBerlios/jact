package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetLanguageImpl
 * </p>
 * Created : Wed Jul 05 19:02:37 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetLanguageImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SetLanguageImpl extends SetLanguage{
	
	/**
	* einfacher Konstruktor für SetLanguage
	**/
	public SetLanguageImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetLanguage
	**/
	public SetLanguageImpl( String alanguage){
		super();
	
		this.language = alanguage;	
	}
}