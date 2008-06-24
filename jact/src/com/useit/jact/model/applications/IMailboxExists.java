

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMailboxExists<br>
 * Conditionally branches to priority n+101 if the specified voice mailbox exists.
 * </p>
 * Created : Wed Jul 05 18:56:13 CEST 2006
 * 
 * @behavior.elementname MailboxExists
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMailboxExists.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IMailboxExists {
public static final String MODELNAME = "MailboxExists";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MAILBOX="mailbox" ;
// 	public static final String VALUEID_CONTEXT="context" ;
	//test
	//---------  getter und setter
	/**
	* getmailbox 
	* 
	* @behavior.fieldname mailbox 
	**/
	public String getMailbox();
	
	/**
	*setmailbox 
	* 
	* @behavior.fieldname mailbox 
	*/
	public void setMailbox(String amailbox);
	/**
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public String getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(String acontext);

}