package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SIPDtmfModeImpl
 * </p>
 * Created : Wed Jul 05 19:03:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPDtmfModeImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SIPDtmfModeImpl extends SIPDtmfMode{
	
	/**
	* einfacher Konstruktor für SIPDtmfMode
	**/
	public SIPDtmfModeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SIPDtmfMode
	**/
	public SIPDtmfModeImpl( String ainband, String ainfo, String arfc2833){
		super();
	
		this.inband = ainband;	
		this.info = ainfo;	
		this.rfc2833 = arfc2833;	
	}
}