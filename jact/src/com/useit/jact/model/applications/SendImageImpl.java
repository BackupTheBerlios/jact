package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SendImageImpl
 * </p>
 * Created : Wed Jul 05 19:00:25 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendImageImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SendImageImpl extends SendImage{
	
	/**
	* einfacher Konstruktor für SendImage
	**/
	public SendImageImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendImage
	**/
	public SendImageImpl( String afilename){
		super();
	
		this.filename = afilename;	
	}
}