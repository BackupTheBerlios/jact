package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetRDNISImpl
 * </p>
 * Created : Wed Jul 05 19:01:37 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetRDNISImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SetRDNISImpl extends SetRDNIS{
	
	/**
	* einfacher Konstruktor für SetRDNIS
	**/
	public SetRDNISImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetRDNIS
	**/
	public SetRDNISImpl( String acnum){
		super();
	
		this.cnum = acnum;	
	}
}