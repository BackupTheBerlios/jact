package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * DUNDiLookupImpl
 * </p>
 * Created : Wed Jul 05 19:01:17 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DUNDiLookupImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class DUNDiLookupImpl extends DUNDiLookup{
	
	/**
	* einfacher Konstruktor für DUNDiLookup
	**/
	public DUNDiLookupImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DUNDiLookup
	**/
	public DUNDiLookupImpl( String anumber, String acontext, String aoptions){
		super();
	
		this.number = anumber;	
		this.context = acontext;	
		this.options = aoptions;	
	}
}