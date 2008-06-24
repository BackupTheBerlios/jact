package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SIPGetHeaderImpl
 * </p>
 * Created : Wed Jul 05 19:00:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPGetHeaderImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SIPGetHeaderImpl extends SIPGetHeader{
	
	/**
	* einfacher Konstruktor für SIPGetHeader
	**/
	public SIPGetHeaderImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SIPGetHeader
	**/
	public SIPGetHeaderImpl( String avar, String aheadername){
		super();
	
		this.var = avar;	
		this.headername = aheadername;	
	}
}