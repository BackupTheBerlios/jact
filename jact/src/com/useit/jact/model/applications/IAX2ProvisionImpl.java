package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * IAX2ProvisionImpl
 * </p>
 * Created : Wed Jul 05 19:00:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAX2ProvisionImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class IAX2ProvisionImpl extends IAX2Provision{
	
	/**
	* einfacher Konstruktor für IAX2Provision
	**/
	public IAX2ProvisionImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für IAX2Provision
	**/
	public IAX2ProvisionImpl( String atemplate){
		super();
	
		this.template = atemplate;	
	}
}