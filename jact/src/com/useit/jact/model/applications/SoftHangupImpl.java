package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SoftHangupImpl
 * </p>
 * Created : Wed Jul 05 19:02:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SoftHangupImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SoftHangupImpl extends SoftHangup{
	
	/**
	* einfacher Konstruktor für SoftHangup
	**/
	public SoftHangupImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SoftHangup
	**/
	public SoftHangupImpl( String atechnology, String aresource, String aoptions){
		super();
	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.options = aoptions;	
	}
}