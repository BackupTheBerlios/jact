package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DumpChanImpl
 * </p>
 * Created : Wed Jul 05 19:02:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DumpChanImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class DumpChanImpl extends DumpChan{
	
	/**
	* einfacher Konstruktor für DumpChan
	**/
	public DumpChanImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DumpChan
	**/
	public DumpChanImpl( String amin_verbose_level){
		super();
	
		this.min_verbose_level = amin_verbose_level;	
	}
}