package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * CongestionImpl
 * </p>
 * Created : Wed Jul 05 19:00:46 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CongestionImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class CongestionImpl extends Congestion{
	
	/**
	* einfacher Konstruktor für Congestion
	**/
	public CongestionImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Congestion
	**/
	public CongestionImpl( String atimeout){
		super();
	
		this.timeout = atimeout;	
	}
}