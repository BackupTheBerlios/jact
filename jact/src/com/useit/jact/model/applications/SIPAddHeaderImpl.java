package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SIPAddHeaderImpl
 * </p>
 * Created : Wed Jul 05 19:02:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPAddHeaderImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SIPAddHeaderImpl extends SIPAddHeader{
	
	/**
	* einfacher Konstruktor für SIPAddHeader
	**/
	public SIPAddHeaderImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SIPAddHeader
	**/
	public SIPAddHeaderImpl( String aheader, String acontent){
		super();
	
		this.header = aheader;	
		this.content = acontent;	
	}
}