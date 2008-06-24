package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * AnswerImpl
 * </p>
 * Created : Wed Jul 05 19:03:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AnswerImpl.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class AnswerImpl extends Answer{
	
	/**
	* einfacher Konstruktor für Answer
	**/
	public AnswerImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Answer
	**/
	public AnswerImpl( String adelay){
		super();
	
		this.delay = adelay;	
	}
}