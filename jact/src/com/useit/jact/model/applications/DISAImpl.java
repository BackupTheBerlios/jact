package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DISAImpl
 * </p>
 * Created : Wed Jul 05 19:01:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DISAImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class DISAImpl extends DISA{
	
	/**
	* einfacher Konstruktor für DISA
	**/
	public DISAImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DISA
	**/
	public DISAImpl( String adirect, String ainward, String asystem, String aaccess){
		super();
	
		this.direct = adirect;	
		this.inward = ainward;	
		this.system = asystem;	
		this.access = aaccess;	
	}
}