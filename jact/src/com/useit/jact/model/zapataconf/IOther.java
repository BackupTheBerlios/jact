

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IOther<br>
 * other stuff
 * </p>
 * Created : Fri May 26 14:30:38 CEST 2006
 * 
 * @behavior.elementname Other
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOther.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IOther {
public static final String MODELNAME = "Other";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MAILBOX="mailbox" ;
// 	public static final String VALUEID_GROUP="group" ;
// 	public static final String VALUEID_LANGUAGE="language" ;
	
	//---------  getter und setter

	/**
	* getmailbox 
	* If this option is defined for a channel, then when the handset is lifted, Asterisk will check the voicemail mailbox(es) specified here for new (unheard) messages. If there are any unheard messages in any of the mailboxes, Asterisk will use a stutter dialtone rather than the ordinary dialtone. On supported hardware, the message waiting light will also be activated ? this probably requires that you also set adsi=yes. Update: This option does NOT require ADSI. It will send a standard FSK tone down the line that lights up the MWI on any capable analog phone. The parameters to this option are one or more comma-separated mailbox numbers, as defined in voicemail.conf.
	* @behavior.fieldname mailbox 
	**/
	public String getMailbox();
	
	/**
	*setmailbox 
	* If this option is defined for a channel, then when the handset is lifted, Asterisk will check the voicemail mailbox(es) specified here for new (unheard) messages. If there are any unheard messages in any of the mailboxes, Asterisk will use a stutter dialtone rather than the ordinary dialtone. On supported hardware, the message waiting light will also be activated ? this probably requires that you also set adsi=yes. Update: This option does NOT require ADSI. It will send a standard FSK tone down the line that lights up the MWI on any capable analog phone. The parameters to this option are one or more comma-separated mailbox numbers, as defined in voicemail.conf.
	* @behavior.fieldname mailbox 
	*/
	public void setMailbox(String amailbox);


	/**
	* getgroup 
	* Allows you to group together a number of channels so that the Dial command will treat the group as a single channel. When Dial tries to make a call on a Zap group, the Zap channel module will use the first available (i.e. non-busy) channel in the group for the call. Multiple group memberships may be specified with commas, and to signify no group membership, the portion after the equals sign may be omitted. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.
	* @behavior.fieldname group 
	**/
	public String getGroup();
	
	/**
	*setgroup 
	* Allows you to group together a number of channels so that the Dial command will treat the group as a single channel. When Dial tries to make a call on a Zap group, the Zap channel module will use the first available (i.e. non-busy) channel in the group for the call. Multiple group memberships may be specified with commas, and to signify no group membership, the portion after the equals sign may be omitted. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.
	* @behavior.fieldname group 
	*/
	public void setGroup(String agroup);


	/**
	* getlanguage 
	* Each channel has a default language code that affects which language version of prerecorded sounds Asterisk uses for this channel. See Setting up a Multi-Language Asterisk Installation. The default is an empty string.
	* @behavior.fieldname language 
	**/
	public String getLanguage();
	
	/**
	*setlanguage 
	* Each channel has a default language code that affects which language version of prerecorded sounds Asterisk uses for this channel. See Setting up a Multi-Language Asterisk Installation. The default is an empty string.
	* @behavior.fieldname language 
	*/
	public void setLanguage(String alanguage);


}