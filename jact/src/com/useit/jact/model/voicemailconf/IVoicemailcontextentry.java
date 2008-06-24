

package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IVoicemailcontextentry<br>
 * The final part of the voicemail.conf configuration file contains one or more context sections where voice mail boxes are defined and configured. (Remember that context sections are sections which are named after contexts defined elsewhere in Asterisk). Multiple voice mail boxes may be defined in a context section. 
 * </p>
 * Created : Fri May 26 14:30:31 CEST 2006
 * 
 * @behavior.elementname Voicemailcontextentry
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVoicemailcontextentry.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  interface  IVoicemailcontextentry {
public static final String MODELNAME = "Voicemailcontextentry";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MAILBOX="mailbox" ;
// 	public static final String VALUEID_VOICEMAIL_PASSWORD="voicemail_password" ;
// 	public static final String VALUEID_USER_NAME="user_name" ;
// 	public static final String VALUEID_USER_EMAIL_ADDRESS="user_email_address" ;
// 	public static final String VALUEID_PAGER_EMAIL_ADDRESS="pager_email_address" ;
// 	public static final String VALUEID_USER_OPTIONS="user_options" ;
	
	//---------  getter und setter

	/**
	* getmailbox 
	* the mailbox name
	* @behavior.fieldname mailbox 
	**/
	public String getMailbox();
	
	/**
	*setmailbox 
	* the mailbox name
	* @behavior.fieldname mailbox 
	*/
	public void setMailbox(String amailbox);


	/**
	* getvoicemail_password 
	*  field contains the numeric

password for this voice mail box entry. The voicemail system will

compare the password entered by the user against this value.
	* @behavior.fieldname voicemail_password 
	**/
	public String getVoicemail_password();
	
	/**
	*setvoicemail_password 
	*  field contains the numeric

password for this voice mail box entry. The voicemail system will

compare the password entered by the user against this value.
	* @behavior.fieldname voicemail_password 
	*/
	public void setVoicemail_password(String avoicemail_password);


	/**
	* getuser_name 
	*  is an alpha field which is usually set to the first and last name of the user of this voice mail box.
	* @behavior.fieldname user_name 
	**/
	public String getUser_name();
	
	/**
	*setuser_name 
	*  is an alpha field which is usually set to the first and last name of the user of this voice mail box.
	* @behavior.fieldname user_name 
	*/
	public void setUser_name(String auser_name);


	/**
	* getuser_email_address 
	*  can be set to the email address

of the user so that when a voice mail message is left by a caller, an

e-maill notification will be sent to the address defined in this field.
	* @behavior.fieldname user_email_address 
	**/
	public String getUser_email_address();
	
	/**
	*setuser_email_address 
	*  can be set to the email address

of the user so that when a voice mail message is left by a caller, an

e-maill notification will be sent to the address defined in this field.
	* @behavior.fieldname user_email_address 
	*/
	public void setUser_email_address(String auser_email_address);


	/**
	* getpager_email_address 
	*  can be set to the email

address of a pager so that when a voice mail message is left by a

caller, a page will be sent to the pager email address defined in this

field.
	* @behavior.fieldname pager_email_address 
	**/
	public String getPager_email_address();
	
	/**
	*setpager_email_address 
	*  can be set to the email

address of a pager so that when a voice mail message is left by a

caller, a page will be sent to the pager email address defined in this

field.
	* @behavior.fieldname pager_email_address 
	*/
	public void setPager_email_address(String apager_email_address);


	/**
	* getuser_options 
	*  field can be used to override

default settings defined in the general section, or set a specific time

zone for this user. Specifically, there are 9 <i>setting=value</i> pairs which can be specified in the user_option(s) field. There can be multiple <i>setting=value</i> pairs defined in the user_option(s) field. Each <i>setting=value</i> pair after the first must be delimited with a vertical bar (|). The nine settings which may be used are: <b>attach,  serveremail, tz, saycid, review, operator, callback, dialout
	* @behavior.fieldname user_options 
	**/
	public String getUser_options();
	
	/**
	*setuser_options 
	*  field can be used to override

default settings defined in the general section, or set a specific time

zone for this user. Specifically, there are 9 <i>setting=value</i> pairs which can be specified in the user_option(s) field. There can be multiple <i>setting=value</i> pairs defined in the user_option(s) field. Each <i>setting=value</i> pair after the first must be delimited with a vertical bar (|). The nine settings which may be used are: <b>attach,  serveremail, tz, saycid, review, operator, callback, dialout
	* @behavior.fieldname user_options 
	*/
	public void setUser_options(String auser_options);


}