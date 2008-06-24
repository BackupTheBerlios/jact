package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetGlobalVarImpl
 * </p>
 * Created : Wed Jul 05 19:00:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGlobalVarImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetGlobalVarImpl extends SetGlobalVar{
	
	/**
	* einfacher Konstruktor für SetGlobalVar
	**/
	public SetGlobalVarImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetGlobalVar
	**/
	public SetGlobalVarImpl( String an, String avalue){
		super();
	
		this.n = an;	
		this.value = avalue;	
	}
}