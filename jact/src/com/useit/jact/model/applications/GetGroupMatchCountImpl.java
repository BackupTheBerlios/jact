package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * GetGroupMatchCountImpl
 * </p>
 * Created : Wed Jul 05 19:01:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupMatchCountImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class GetGroupMatchCountImpl extends GetGroupMatchCount{
	
	/**
	* einfacher Konstruktor für GetGroupMatchCount
	**/
	public GetGroupMatchCountImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GetGroupMatchCount
	**/
	public GetGroupMatchCountImpl( String agroupmatch, String acategory){
		super();
	
		this.groupmatch = agroupmatch;	
		this.category = acategory;	
	}
}