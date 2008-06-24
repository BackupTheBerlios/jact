

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IVMAuthenticate<br>
 * Behaves identically to the Authenticate application, with the exception that the passwords are taken from voicemail.conf.  If the mailbox is specified, only that mailbox's password will be considered valid. If the mailbox is not specified, the channel variable AUTH_MAILBOX will be set with the authenticated mailbox.
 * </p>
 * Created : Wed Jul 05 18:54:33 CEST 2006
 * 
 * @behavior.elementname VMAuthenticate
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVMAuthenticate.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IVMAuthenticate {
public static final String MODELNAME = "VMAuthenticate";	
 
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