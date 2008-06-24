package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SendTextImpl
 * </p>
 * Created : Wed Jul 05 19:01:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendTextImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SendTextImpl extends SendText{
	
	/**
	* einfacher Konstruktor für SendText
	**/
	public SendTextImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendText
	**/
	public SendTextImpl( String atext){
		super();
	
		this.text = atext;	
	}
}