package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MD5CheckImpl
 * </p>
 * Created : Wed Jul 05 19:02:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MD5CheckImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class MD5CheckImpl extends MD5Check{
	
	/**
	* einfacher Konstruktor für MD5Check
	**/
	public MD5CheckImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MD5Check
	**/
	public MD5CheckImpl( String amd5hash, String astring){
		super();
	
		this.md5hash = amd5hash;	
		this.string = astring;	
	}
}