package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ResetCDRImpl
 * </p>
 * Created : Wed Jul 05 19:02:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ResetCDRImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class ResetCDRImpl extends ResetCDR{
	
	/**
	* einfacher Konstruktor für ResetCDR
	**/
	public ResetCDRImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ResetCDR
	**/
	public ResetCDRImpl( String aoptions){
		super();
	
		this.options = aoptions;	
	}
}