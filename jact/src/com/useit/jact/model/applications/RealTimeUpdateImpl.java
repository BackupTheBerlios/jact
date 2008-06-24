package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * RealTimeUpdateImpl
 * </p>
 * Created : Wed Jul 05 19:02:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTimeUpdateImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class RealTimeUpdateImpl extends RealTimeUpdate{
	
	/**
	* einfacher Konstruktor für RealTimeUpdate
	**/
	public RealTimeUpdateImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RealTimeUpdate
	**/
	public RealTimeUpdateImpl( String afamily, String acolmatch, String avalue, String anewcol, String anewval){
		super();
	
		this.family = afamily;	
		this.colmatch = acolmatch;	
		this.value = avalue;	
		this.newcol = anewcol;	
		this.newval = anewval;	
	}
}