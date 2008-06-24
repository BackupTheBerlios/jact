package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ZapatellerImpl
 * </p>
 * Created : Wed Jul 05 19:01:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapatellerImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ZapatellerImpl extends Zapateller{
	
	/**
	* einfacher Konstruktor für Zapateller
	**/
	public ZapatellerImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zapateller
	**/
	public ZapatellerImpl( String aoptions){
		super();
	
		this.options = aoptions;	
	}
}