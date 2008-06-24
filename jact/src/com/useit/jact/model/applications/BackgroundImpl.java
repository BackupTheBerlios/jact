package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * BackgroundImpl
 * </p>
 * Created : Wed Jul 05 19:01:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class BackgroundImpl extends Background{
	
	/**
	* einfacher Konstruktor für Background
	**/
	public BackgroundImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Background
	**/
	public BackgroundImpl( String afilename1, String afilename2, String aoptions, String alangoverride){
		super();
	
		this.filename1 = afilename1;	
		this.filename2 = afilename2;	
		this.options = aoptions;	
		this.langoverride = alangoverride;	
	}
}