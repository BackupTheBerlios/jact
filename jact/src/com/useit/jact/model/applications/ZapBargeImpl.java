package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ZapBargeImpl
 * </p>
 * Created : Wed Jul 05 19:01:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapBargeImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ZapBargeImpl extends ZapBarge{
	
	/**
	* einfacher Konstruktor für ZapBarge
	**/
	public ZapBargeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ZapBarge
	**/
	public ZapBargeImpl( String achannel){
		super();
	
		this.channel = achannel;	
	}
}