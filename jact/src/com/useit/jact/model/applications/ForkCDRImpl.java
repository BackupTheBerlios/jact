package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * ForkCDRImpl
 * </p>
 * Created : Wed Jul 05 19:02:17 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ForkCDRImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ForkCDRImpl extends ForkCDR{
	
	/**
	* einfacher Konstruktor für ForkCDR
	**/
	public ForkCDRImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ForkCDR
	**/
	public ForkCDRImpl( String aoptions){
		super();
	
		this.options = aoptions;	
	}
}