package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ZapScanImpl
 * </p>
 * Created : Wed Jul 05 19:02:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapScanImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ZapScanImpl extends ZapScan{
	
	/**
	* einfacher Konstruktor für ZapScan
	**/
	public ZapScanImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ZapScan
	**/
	public ZapScanImpl( String agroup){
		super();
	
		this.group = agroup;	
	}
}