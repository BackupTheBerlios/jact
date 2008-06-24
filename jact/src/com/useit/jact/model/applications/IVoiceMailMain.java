

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IVoiceMailMain<br>
 * Enters the main voicemail system for the checking of voicemail. The mailbox can be passed as the option, which will stop the voicemail system from prompting the user for the mailbox. If the mailbox is preceded by 's' then the password check will be skipped. If the mailbox is preceded by 'p' then the supplied mailbox is prepended to the user's entry and the resulting string is used as the mailbox number. This is useful for virtual hosting of voicemail boxes. If a context is specified, logins are considered in that voicemail context only. Returns -1 if the user hangs up or 0 otherwise.
 * </p>
 * Created : Wed Jul 05 18:56:21 CEST 2006
 * 
 * @behavior.elementname VoiceMailMain
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVoiceMailMain.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IVoiceMailMain {
public static final String MODELNAME = "VoiceMailMain";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_S="s" ;
// 	public static final String VALUEID_MAILBOX="mailbox" ;
// 	public static final String VALUEID_CONTEXT="context" ;
	//test
	//---------  getter und setter
	/**
	* gets 
	* 
	* @behavior.fieldname s 
	**/
	public String getS();
	
	/**
	*sets 
	* 
	* @behavior.fieldname s 
	*/
	public void setS(String as);
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