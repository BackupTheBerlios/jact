package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SetVarImpl
 * </p>
 * Created : Wed Jul 05 19:03:38 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetVarImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SetVarImpl extends SetVar{
	
	/**
	* einfacher Konstruktor für SetVar
	**/
	public SetVarImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetVar
	**/
	public SetVarImpl( String an1, String an2, String avalue, String aoptions){
		super();
	
		this.n1 = an1;	
		this.n2 = an2;	
		this.value = avalue;	
		this.options = aoptions;	
	}
}