package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetAMAFlagsImpl
 * </p>
 * Created : Wed Jul 05 19:02:45 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAMAFlagsImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SetAMAFlagsImpl extends SetAMAFlags{
	
	/**
	* einfacher Konstruktor für SetAMAFlags
	**/
	public SetAMAFlagsImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetAMAFlags
	**/
	public SetAMAFlagsImpl( String aflag){
		super();
	
		this.flag = aflag;	
	}
}