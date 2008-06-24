package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Voicemailcontextentry<br>
 * The final part of the voicemail.conf configuration file contains one or more context sections where voice mail boxes are defined and configured. (Remember that context sections are sections which are named after contexts defined elsewhere in Asterisk). Multiple voice mail boxes may be defined in a context section. 
 * </p>
 * Created : Fri May 26 14:31:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Voicemailcontextentry.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  class Voicemailcontextentry extends AbstractSimpleDataClass implements IVoicemailcontextentry{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Voicemailcontextentry
	**/
	public Voicemailcontextentry(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Voicemailcontextentry
	**/
	public Voicemailcontextentry( String amailbox, String avoicemail_password, String auser_name, String auser_email_address, String apager_email_address, String auser_options){
		super();
	
		this.mailbox = amailbox;	
		this.voicemail_password = avoicemail_password;	
		this.user_name = auser_name;	
		this.user_email_address = auser_email_address;	
		this.pager_email_address = apager_email_address;	
		this.user_options = auser_options;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Voicemailcontextentry object){
		this.mailbox = object.mailbox;	
		this.voicemail_password = object.voicemail_password;	
		this.user_name = object.user_name;	
		this.user_email_address = object.user_email_address;	
		this.pager_email_address = object.pager_email_address;	
		this.user_options = object.user_options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  the mailbox name **/
	protected String mailbox;
	public static final String VALUEID_MAILBOX="mailbox" ;

    /**   field contains the numeric

password for this voice mail box entry. The voicemail system will

compare the password entered by the user against this value. **/
	protected String voicemail_password;
	public static final String VALUEID_VOICEMAIL_PASSWORD="voicemail_password" ;

    /**   is an alpha field which is usually set to the first and last name of the user of this voice mail box. **/
	protected String user_name;
	public static final String VALUEID_USER_NAME="user_name" ;

    /**   can be set to the email address

of the user so that when a voice mail message is left by a caller, an

e-maill notification will be sent to the address defined in this field. **/
	protected String user_email_address;
	public static final String VALUEID_USER_EMAIL_ADDRESS="user_email_address" ;

    /**   can be set to the email

address of a pager so that when a voice mail message is left by a

caller, a page will be sent to the pager email address defined in this

field. **/
	protected String pager_email_address;
	public static final String VALUEID_PAGER_EMAIL_ADDRESS="pager_email_address" ;

    /**   field can be used to override

default settings defined in the general section, or set a specific time

zone for this user. Specifically, there are 9 <i>setting=value</i> pairs which can be specified in the user_option(s) field. There can be multiple <i>setting=value</i> pairs defined in the user_option(s) field. Each <i>setting=value</i> pair after the first must be delimited with a vertical bar (|). The nine settings which may be used are: <b>attach,  serveremail, tz, saycid, review, operator, callback, dialout **/
	protected String user_options;
	public static final String VALUEID_USER_OPTIONS="user_options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MAILBOX.equals(valueid)){
			return true;
		}
		if(VALUEID_VOICEMAIL_PASSWORD.equals(valueid)){
			return true;
		}
		if(VALUEID_USER_NAME.equals(valueid)){
			return true;
		}
		if(VALUEID_USER_EMAIL_ADDRESS.equals(valueid)){
			return true;
		}
		if(VALUEID_PAGER_EMAIL_ADDRESS.equals(valueid)){
			return true;
		}
		if(VALUEID_USER_OPTIONS.equals(valueid)){
			return true;
		}
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
		if(VALUEID_MAILBOX.equals(valueid)){
			setMailbox((String)data);
			return;
		}
		if(VALUEID_VOICEMAIL_PASSWORD.equals(valueid)){
			setVoicemail_password((String)data);
			return;
		}
		if(VALUEID_USER_NAME.equals(valueid)){
			setUser_name((String)data);
			return;
		}
		if(VALUEID_USER_EMAIL_ADDRESS.equals(valueid)){
			setUser_email_address((String)data);
			return;
		}
		if(VALUEID_PAGER_EMAIL_ADDRESS.equals(valueid)){
			setPager_email_address((String)data);
			return;
		}
		if(VALUEID_USER_OPTIONS.equals(valueid)){
			setUser_options((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_MAILBOX.equals(valueid)){
			return getMailbox();
			
		}
		if(VALUEID_VOICEMAIL_PASSWORD.equals(valueid)){
			return getVoicemail_password();
			
		}
		if(VALUEID_USER_NAME.equals(valueid)){
			return getUser_name();
			
		}
		if(VALUEID_USER_EMAIL_ADDRESS.equals(valueid)){
			return getUser_email_address();
			
		}
		if(VALUEID_PAGER_EMAIL_ADDRESS.equals(valueid)){
			return getPager_email_address();
			
		}
		if(VALUEID_USER_OPTIONS.equals(valueid)){
			return getUser_options();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmailbox 
	* the mailbox name
	**/
	public String getMailbox(){		return  mailbox;
	}
	/**
	*setmailbox 
	*/
	public void setMailbox(String amailbox){
		if(amailbox==null){
		    changed = (this.mailbox!=null);
		    this.mailbox = null;	    
		}else{
			changed = amailbox.equals(this.mailbox);
			this.mailbox=amailbox;
		}
	}


	/**
	* getvoicemail_password 
	*  field contains the numeric

password for this voice mail box entry. The voicemail system will

compare the password entered by the user against this value.
	**/
	public String getVoicemail_password(){		return  voicemail_password;
	}
	/**
	*setvoicemail_password 
	*/
	public void setVoicemail_password(String avoicemail_password){
		if(avoicemail_password==null){
		    changed = (this.voicemail_password!=null);
		    this.voicemail_password = null;	    
		}else{
			changed = avoicemail_password.equals(this.voicemail_password);
			this.voicemail_password=avoicemail_password;
		}
	}


	/**
	* getuser_name 
	*  is an alpha field which is usually set to the first and last name of the user of this voice mail box.
	**/
	public String getUser_name(){		return  user_name;
	}
	/**
	*setuser_name 
	*/
	public void setUser_name(String auser_name){
		if(auser_name==null){
		    changed = (this.user_name!=null);
		    this.user_name = null;	    
		}else{
			changed = auser_name.equals(this.user_name);
			this.user_name=auser_name;
		}
	}


	/**
	* getuser_email_address 
	*  can be set to the email address

of the user so that when a voice mail message is left by a caller, an

e-maill notification will be sent to the address defined in this field.
	**/
	public String getUser_email_address(){		return  user_email_address;
	}
	/**
	*setuser_email_address 
	*/
	public void setUser_email_address(String auser_email_address){
		if(auser_email_address==null){
		    changed = (this.user_email_address!=null);
		    this.user_email_address = null;	    
		}else{
			changed = auser_email_address.equals(this.user_email_address);
			this.user_email_address=auser_email_address;
		}
	}


	/**
	* getpager_email_address 
	*  can be set to the email

address of a pager so that when a voice mail message is left by a

caller, a page will be sent to the pager email address defined in this

field.
	**/
	public String getPager_email_address(){		return  pager_email_address;
	}
	/**
	*setpager_email_address 
	*/
	public void setPager_email_address(String apager_email_address){
		if(apager_email_address==null){
		    changed = (this.pager_email_address!=null);
		    this.pager_email_address = null;	    
		}else{
			changed = apager_email_address.equals(this.pager_email_address);
			this.pager_email_address=apager_email_address;
		}
	}


	/**
	* getuser_options 
	*  field can be used to override

default settings defined in the general section, or set a specific time

zone for this user. Specifically, there are 9 <i>setting=value</i> pairs which can be specified in the user_option(s) field. There can be multiple <i>setting=value</i> pairs defined in the user_option(s) field. Each <i>setting=value</i> pair after the first must be delimited with a vertical bar (|). The nine settings which may be used are: <b>attach,  serveremail, tz, saycid, review, operator, callback, dialout
	**/
	public String getUser_options(){		return  user_options;
	}
	/**
	*setuser_options 
	*/
	public void setUser_options(String auser_options){
		if(auser_options==null){
		    changed = (this.user_options!=null);
		    this.user_options = null;	    
		}else{
			changed = auser_options.equals(this.user_options);
			this.user_options=auser_options;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("mailbox=")
		.append(mailbox)
		.append(",")
		.append("voicemail_password=")
		.append(voicemail_password)
		.append(",")
		.append("user_name=")
		.append(user_name)
		.append(",")
		.append("user_email_address=")
		.append(user_email_address)
		.append(",")
		.append("pager_email_address=")
		.append(pager_email_address)
		.append(",")
		.append("user_options=")
		.append(user_options)
    			.append("]");

		return sb.toString();		
	}}