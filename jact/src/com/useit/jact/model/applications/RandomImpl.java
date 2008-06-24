package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * RandomImpl
 * </p>
 * Created : Wed Jul 05 19:03:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RandomImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class RandomImpl extends Random{
	
	/**
	* einfacher Konstruktor für Random
	**/
	public RandomImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Random
	**/
	public RandomImpl( String aprobability, String acontext, String aextension, String apriority){
		super();
	
		this.probability = aprobability;	
		this.context = acontext;	
		this.extension = aextension;	
		this.priority = apriority;	
	}
}