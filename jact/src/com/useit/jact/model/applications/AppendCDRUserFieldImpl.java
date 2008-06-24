package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AppendCDRUserFieldImpl
 * </p>
 * Created : Wed Jul 05 19:00:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AppendCDRUserFieldImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class AppendCDRUserFieldImpl extends AppendCDRUserField{
	
	/**
	* einfacher Konstruktor für AppendCDRUserField
	**/
	public AppendCDRUserFieldImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AppendCDRUserField
	**/
	public AppendCDRUserFieldImpl( String avalue){
		super();
	
		this.value = avalue;	
	}
}