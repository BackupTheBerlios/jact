package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * GetGroupCountImpl
 * </p>
 * Created : Wed Jul 05 19:00:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupCountImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class GetGroupCountImpl extends GetGroupCount{
	
	/**
	* einfacher Konstruktor f�r GetGroupCount
	**/
	public GetGroupCountImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r GetGroupCount
	**/
	public GetGroupCountImpl( String agroup, String acategory){
		super();
	
		this.group = agroup;	
		this.category = acategory;	
	}
}