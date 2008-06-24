package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SendURLImpl
 * </p>
 * Created : Wed Jul 05 19:01:14 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendURLImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SendURLImpl extends SendURL{
	
	/**
	* einfacher Konstruktor für SendURL
	**/
	public SendURLImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendURL
	**/
	public SendURLImpl( String auRL, String aoption){
		super();
	
		this.uRL = auRL;	
		this.option = aoption;	
	}
}