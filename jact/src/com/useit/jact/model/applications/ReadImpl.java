package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ReadImpl
 * </p>
 * Created : Wed Jul 05 19:03:36 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadImpl.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class ReadImpl extends Read{
	
	/**
	* einfacher Konstruktor für Read
	**/
	public ReadImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Read
	**/
	public ReadImpl( String avariable, String afilename, String amaxdigits, String aoption, String aattempts, String atimeout){
		super();
	
		this.variable = avariable;	
		this.filename = afilename;	
		this.maxdigits = amaxdigits;	
		this.option = aoption;	
		this.attempts = aattempts;	
		this.timeout = atimeout;	
	}
}