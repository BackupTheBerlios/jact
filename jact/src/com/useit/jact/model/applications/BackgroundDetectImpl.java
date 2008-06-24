package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * BackgroundDetectImpl
 * </p>
 * Created : Wed Jul 05 19:02:19 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundDetectImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class BackgroundDetectImpl extends BackgroundDetect{
	
	/**
	* einfacher Konstruktor für BackgroundDetect
	**/
	public BackgroundDetectImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für BackgroundDetect
	**/
	public BackgroundDetectImpl( String afilename, String asil, String amin, String amax){
		super();
	
		this.filename = afilename;	
		this.sil = asil;	
		this.min = amin;	
		this.max = amax;	
	}
}