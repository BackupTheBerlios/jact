package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * SuffixImpl
 * </p>
 * Created : Wed Jul 05 19:01:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SuffixImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SuffixImpl extends Suffix{
	
	/**
	* einfacher Konstruktor f�r Suffix
	**/
	public SuffixImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r Suffix
	**/
	public SuffixImpl( String adigits){
		super();
	
		this.digits = adigits;	
	}
}