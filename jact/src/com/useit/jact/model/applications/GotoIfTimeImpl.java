package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * GotoIfTimeImpl
 * </p>
 * Created : Wed Jul 05 19:00:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfTimeImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class GotoIfTimeImpl extends GotoIfTime{
	
	/**
	* einfacher Konstruktor für GotoIfTime
	**/
	public GotoIfTimeImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GotoIfTime
	**/
	public GotoIfTimeImpl( String atimes, String aweekdays, String amdays, String amonths, String acontext, String aextension, String apri){
		super();
	
		this.times = atimes;	
		this.weekdays = aweekdays;	
		this.mdays = amdays;	
		this.months = amonths;	
		this.context = acontext;	
		this.extension = aextension;	
		this.pri = apri;	
	}
}