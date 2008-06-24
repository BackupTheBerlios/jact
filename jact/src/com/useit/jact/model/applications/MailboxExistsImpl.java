package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * MailboxExistsImpl
 * </p>
 * Created : Wed Jul 05 19:03:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MailboxExistsImpl.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MailboxExistsImpl extends MailboxExists{
	
	/**
	* einfacher Konstruktor für MailboxExists
	**/
	public MailboxExistsImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MailboxExists
	**/
	public MailboxExistsImpl( String amailbox, String acontext){
		super();
	
		this.mailbox = amailbox;	
		this.context = acontext;	
	}
}