package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetCDRUserFieldImpl
 * </p>
 * Created : Wed Jul 05 19:01:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCDRUserFieldImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetCDRUserFieldImpl extends SetCDRUserField{
	
	/**
	* einfacher Konstruktor für SetCDRUserField
	**/
	public SetCDRUserFieldImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCDRUserField
	**/
	public SetCDRUserFieldImpl( String avalue){
		super();
	
		this.value = avalue;	
	}
}