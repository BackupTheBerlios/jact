package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * RealTimeImpl
 * </p>
 * Created : Wed Jul 05 19:01:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTimeImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class RealTimeImpl extends RealTime{
	
	/**
	* einfacher Konstruktor für RealTime
	**/
	public RealTimeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RealTime
	**/
	public RealTimeImpl( String afamily, String acolmatch, String avalue, String aprefix){
		super();
	
		this.family = afamily;	
		this.colmatch = acolmatch;	
		this.value = avalue;	
		this.prefix = aprefix;	
	}
}