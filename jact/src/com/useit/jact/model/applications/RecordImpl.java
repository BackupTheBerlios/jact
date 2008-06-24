package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * RecordImpl
 * </p>
 * Created : Wed Jul 05 19:02:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RecordImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class RecordImpl extends Record{
	
	/**
	* einfacher Konstruktor für Record
	**/
	public RecordImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Record
	**/
	public RecordImpl( String afilename, String aformat, String asilence, String amaxduration, String aoptions){
		super();
	
		this.filename = afilename;	
		this.format = aformat;	
		this.silence = asilence;	
		this.maxduration = amaxduration;	
		this.options = aoptions;	
	}
}