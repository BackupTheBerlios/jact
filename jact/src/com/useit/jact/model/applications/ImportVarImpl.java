package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ImportVarImpl
 * </p>
 * Created : Wed Jul 05 19:02:46 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ImportVarImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ImportVarImpl extends ImportVar{
	
	/**
	* einfacher Konstruktor für ImportVar
	**/
	public ImportVarImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ImportVar
	**/
	public ImportVarImpl( String an, String achannel, String avariable){
		super();
	
		this.n = an;	
		this.channel = achannel;	
		this.variable = avariable;	
	}
}