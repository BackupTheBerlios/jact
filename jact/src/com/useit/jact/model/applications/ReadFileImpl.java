package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ReadFileImpl
 * </p>
 * Created : Wed Jul 05 19:02:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ReadFileImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ReadFileImpl extends ReadFile{
	
	/**
	* einfacher Konstruktor für ReadFile
	**/
	public ReadFileImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ReadFile
	**/
	public ReadFileImpl( String avarname, String afile, String alength){
		super();
	
		this.varname = avarname;	
		this.file = afile;	
		this.length = alength;	
	}
}