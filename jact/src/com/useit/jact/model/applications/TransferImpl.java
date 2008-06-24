package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * TransferImpl
 * </p>
 * Created : Wed Jul 05 19:00:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TransferImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class TransferImpl extends Transfer{
	
	/**
	* einfacher Konstruktor für Transfer
	**/
	public TransferImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Transfer
	**/
	public TransferImpl( String atech, String adest){
		super();
	
		this.tech = atech;	
		this.dest = adest;	
	}
}