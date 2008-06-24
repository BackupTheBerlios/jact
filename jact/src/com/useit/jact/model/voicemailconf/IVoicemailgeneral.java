

package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IVoicemailgeneral<br>
 * Lets first discuss the contents of the general section. This section contains configuration settings which will apply as a common policy across all users. The general section must be defined and present in voicemail.conf. Configuration entries are coded in setting=value format. The configuration settings available in the general section are as follows:


 * </p>
 * Created : Fri May 26 14:30:30 CEST 2006
 * 
 * @behavior.elementname Voicemailgeneral
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVoicemailgeneral.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  interface  IVoicemailgeneral {
public static final String MODELNAME = "Voicemailgeneral";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ATTACH="attach" ;
// 	public static final String VALUEID_DELETE="delete" ;
// 	public static final String VALUEID_MAILCMD="mailcmd" ;
// 	public static final String VALUEID_MAXSILENCE="maxsilence" ;
// 	public static final String VALUEID_ENVELOPE="envelope" ;
// 	public static final String VALUEID_EXTERNNOTIFY="externnotify" ;
// 	public static final String VALUEID_SILENCETHRESHOLD="silencethreshold" ;
// 	public static final String VALUEID_SERVEREMAIL="serveremail" ;
// 	public static final String VALUEID_MAXMESSAGE="maxmessage" ;
// 	public static final String VALUEID_MINMESSAGE="minmessage" ;
// 	public static final String VALUEID_FORMAT="format" ;
// 	public static final String VALUEID_MAXGREET="maxgreet" ;
// 	public static final String VALUEID_SKIPMS="skipms" ;
// 	public static final String VALUEID_MAXLOGINS="maxlogins" ;
// 	public static final String VALUEID_CIDINTERNALCONTEXTS="cidinternalcontexts" ;
// 	public static final String VALUEID_REVIEW="review" ;
// 	public static final String VALUEID_OPERATOR="operator" ;
// 	public static final String VALUEID_SAYCID="saycid" ;
// 	public static final String VALUEID_DIALOUT="dialout" ;
// 	public static final String VALUEID_CALLBACK="callback" ;
// 	public static final String VALUEID_DBUSER="dbuser" ;
// 	public static final String VALUEID_DBPASS="dbpass" ;
// 	public static final String VALUEID_DBHOST="dbhost" ;
// 	public static final String VALUEID_DBNAME="dbname" ;
// 	public static final String VALUEID_DBOPTION="dboption" ;
// 	public static final String VALUEID_PBXSKIP="pbxskip" ;
// 	public static final String VALUEID_FROMSTRING="fromstring" ;
// 	public static final String VALUEID_EMAILSUBJECT="emailsubject" ;
// 	public static final String VALUEID_EMAILBODY="emailbody" ;
// 	public static final String VALUEID_EXITCONTEXT="exitcontext" ;
// 	public static final String VALUEID_NEXTAFTERCMD="nextaftercmd" ;
	
	//---------  getter und setter

	/**
	* getattach 
	* Attach causes Asterisk to copy a voicemail message to an audio file and send it to the user as an attachment in an e-mail  voicemail notification message.  The default is not to do this. Attach takes two values yes or no.
	* @behavior.fieldname attach 
	**/
	public Boolean getAttach();
	
	/**
	*setattach 
	* Attach causes Asterisk to copy a voicemail message to an audio file and send it to the user as an attachment in an e-mail  voicemail notification message.  The default is not to do this. Attach takes two values yes or no.
	* @behavior.fieldname attach 
	*/
	public void setAttach(Boolean aattach);


	/**
	* getdelete 
	* If set to &quot;yes&quot; the message will be deleted from the voicemailbox (after having been emailed).

The delete flag, when used alone (instead of with voicemail broadcast), provides functionality that allows a user to receive their voicemail via email alone.

Note This settting does not always work as a global setting. It is recommended to put this as an option for each voice mailbox that's messages are to be deleted after being emailed.

Note This setting needs to be prefixed with a | not a , in order to set it on a user's extension if other settings are being configured.  For example 823 =&gt; 1234,office,office@demo.local,,attach=yes|delete=1
	* @behavior.fieldname delete 
	**/
	public Boolean getDelete();
	
	/**
	*setdelete 
	* If set to &quot;yes&quot; the message will be deleted from the voicemailbox (after having been emailed).

The delete flag, when used alone (instead of with voicemail broadcast), provides functionality that allows a user to receive their voicemail via email alone.

Note This settting does not always work as a global setting. It is recommended to put this as an option for each voice mailbox that's messages are to be deleted after being emailed.

Note This setting needs to be prefixed with a | not a , in order to set it on a user's extension if other settings are being configured.  For example 823 =&gt; 1234,office,office@demo.local,,attach=yes|delete=1
	* @behavior.fieldname delete 
	*/
	public void setDelete(Boolean adelete);


	/**
	* getmailcmd 
	* Mailcmd allows the administrator to override the default mailer command with a defined command. Mailcmd takes a string value set to the desired command line to execute when a user needs to be notified of a voice mail message. The default command line is: '/usr/sbin/sendmail -t'
	* @behavior.fieldname mailcmd 
	**/
	public String getMailcmd();
	
	/**
	*setmailcmd 
	* Mailcmd allows the administrator to override the default mailer command with a defined command. Mailcmd takes a string value set to the desired command line to execute when a user needs to be notified of a voice mail message. The default command line is: '/usr/sbin/sendmail -t'
	* @behavior.fieldname mailcmd 
	*/
	public void setMailcmd(String amailcmd);


	/**
	* getmaxsilence 
	* Maxsilence defines how long Asterisk will wait for a contiguous period of silence before terminating an incoming call to voice mail. The default value is 0, which means the silence detector is disabled and the wait time is infinite. Maxsilence takes a value of zero or a positive integer value which is the number of seconds of silence to wait before disconnecting.
	* @behavior.fieldname maxsilence 
	**/
	public String getMaxsilence();
	
	/**
	*setmaxsilence 
	* Maxsilence defines how long Asterisk will wait for a contiguous period of silence before terminating an incoming call to voice mail. The default value is 0, which means the silence detector is disabled and the wait time is infinite. Maxsilence takes a value of zero or a positive integer value which is the number of seconds of silence to wait before disconnecting.
	* @behavior.fieldname maxsilence 
	*/
	public void setMaxsilence(String amaxsilence);


	/**
	* getenvelope 
	* Envelope controls whether or not Asterisk will play the message envelope (date/time) before playing the voicemail message. This settng does not affect the operation of the envelope option in the advanced voicemail menu. Envelope takes two values yes or no.  The default value is yes. Note: this is only in the Asterisk CVS version dated 5/19/04 or later.
	* @behavior.fieldname envelope 
	**/
	public String getEnvelope();
	
	/**
	*setenvelope 
	* Envelope controls whether or not Asterisk will play the message envelope (date/time) before playing the voicemail message. This settng does not affect the operation of the envelope option in the advanced voicemail menu. Envelope takes two values yes or no.  The default value is yes. Note: this is only in the Asterisk CVS version dated 5/19/04 or later.
	* @behavior.fieldname envelope 
	*/
	public void setEnvelope(String aenvelope);


	/**
	* getexternnotify 
	* Want to run an external program whenever a caller leaves a voice mail message for a user? This is where the externnotify command comes in handy. Externnotify takes a string value which is the command line you want to execute when the caller finishes leaving a message.

Note: see a poorly written, but functional example of an external notification script <a class='wiki'  href='http://mikecathey.com/code/vmnotify/'>here</a>.

The way it works is basically any time that somebody leaves a voicemail on the system (regardless of mailbox number), the command specified for externnotify is run with the arguments (in this order): context, extension, and number of voicemails in that mailbox. These arguments are passed to the program that you set in the externnotify variable.
	* @behavior.fieldname externnotify 
	**/
	public String getExternnotify();
	
	/**
	*setexternnotify 
	* Want to run an external program whenever a caller leaves a voice mail message for a user? This is where the externnotify command comes in handy. Externnotify takes a string value which is the command line you want to execute when the caller finishes leaving a message.

Note: see a poorly written, but functional example of an external notification script <a class='wiki'  href='http://mikecathey.com/code/vmnotify/'>here</a>.

The way it works is basically any time that somebody leaves a voicemail on the system (regardless of mailbox number), the command specified for externnotify is run with the arguments (in this order): context, extension, and number of voicemails in that mailbox. These arguments are passed to the program that you set in the externnotify variable.
	* @behavior.fieldname externnotify 
	*/
	public void setExternnotify(String aexternnotify);


	/**
	* getsilencethreshold 
	* When using the maxsilence setting, it is sometimes necessary to adjust the silence detection threshold to eliminate false triggering on background noise.

Silencethreshold allows the adminstrator to do just that. The default silencethreshold value is 128.  Higher numbers raise the threshold so that more background noise is needed to cause the silence detector to reset. When employing this setting, some experimentation will be necessary to find the best result.
	* @behavior.fieldname silencethreshold 
	**/
	public String getSilencethreshold();
	
	/**
	*setsilencethreshold 
	* When using the maxsilence setting, it is sometimes necessary to adjust the silence detection threshold to eliminate false triggering on background noise.

Silencethreshold allows the adminstrator to do just that. The default silencethreshold value is 128.  Higher numbers raise the threshold so that more background noise is needed to cause the silence detector to reset. When employing this setting, some experimentation will be necessary to find the best result.
	* @behavior.fieldname silencethreshold 
	*/
	public void setSilencethreshold(String asilencethreshold);


	/**
	* getserveremail 
	* This setting can be used to identify the source of a voicemail  notification message. The value is a string which can be encoded one of two ways. If the string is of the form <i>someone@host.com</i>, then the string will be used as the source address for all voicemail notification emails. If the string is of the form <i>someone</i>, then the host name of the machine running Asterisk will be postpended to the string after insertion of a '@'.
	* @behavior.fieldname serveremail 
	**/
	public String getServeremail();
	
	/**
	*setserveremail 
	* This setting can be used to identify the source of a voicemail  notification message. The value is a string which can be encoded one of two ways. If the string is of the form <i>someone@host.com</i>, then the string will be used as the source address for all voicemail notification emails. If the string is of the form <i>someone</i>, then the host name of the machine running Asterisk will be postpended to the string after insertion of a '@'.
	* @behavior.fieldname serveremail 
	*/
	public void setServeremail(String aserveremail);


	/**
	* getmaxmessage 
	* This defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. The default value for this setting is 0 which means there will be no maximum time limit enforced.
	* @behavior.fieldname maxmessage 
	**/
	public String getMaxmessage();
	
	/**
	*setmaxmessage 
	* This defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. The default value for this setting is 0 which means there will be no maximum time limit enforced.
	* @behavior.fieldname maxmessage 
	*/
	public void setMaxmessage(String amaxmessage);


	/**
	* getminmessage 
	* This setting can be used to elimiinate messages which are shorter than a given amount of time in seconds. The default value for this setting is 0 which means there will be no minimum time limit enforced.
	* @behavior.fieldname minmessage 
	**/
	public String getMinmessage();
	
	/**
	*setminmessage 
	* This setting can be used to elimiinate messages which are shorter than a given amount of time in seconds. The default value for this setting is 0 which means there will be no minimum time limit enforced.
	* @behavior.fieldname minmessage 
	*/
	public void setMinmessage(String aminmessage);


	/**
	* getformat 
	* The format setting selects audio file format(s) to use when storing voice mail messages. The value is a string defining the audio format(s) of the message file. The default format string is <i>wav49|gsm|wav</i>, meaning that Asterisk will save the voicemail message in all three supported formats. When emailing the attachment, however, it will send only the first of the formats defined here. What the value of saving in more than one format is, I don't know.

 wav49: In this format, the file size will be small, the quality good, and it's a good choice for sending voicemail messages in email. The file will have a .wav extension, which all Windows users should have no problems with, and users on other platforms should also be able to easily play these sound files.

 gsm: Voicemail saved in this format will have about the same file size and same audio quality as wav49. It may be less well supported by client operating systems if sent to users in email, however.

 wav: This is an uncompressed sound format, so the file size is very large. Not recommended.

 g723sf: The sample voicemail.conf file has this option commented out. If you try to activate it, you will find that it doesn't work.
	* @behavior.fieldname format 
	**/
	public String getFormat();
	
	/**
	*setformat 
	* The format setting selects audio file format(s) to use when storing voice mail messages. The value is a string defining the audio format(s) of the message file. The default format string is <i>wav49|gsm|wav</i>, meaning that Asterisk will save the voicemail message in all three supported formats. When emailing the attachment, however, it will send only the first of the formats defined here. What the value of saving in more than one format is, I don't know.

 wav49: In this format, the file size will be small, the quality good, and it's a good choice for sending voicemail messages in email. The file will have a .wav extension, which all Windows users should have no problems with, and users on other platforms should also be able to easily play these sound files.

 gsm: Voicemail saved in this format will have about the same file size and same audio quality as wav49. It may be less well supported by client operating systems if sent to users in email, however.

 wav: This is an uncompressed sound format, so the file size is very large. Not recommended.

 g723sf: The sample voicemail.conf file has this option commented out. If you try to activate it, you will find that it doesn't work.
	* @behavior.fieldname format 
	*/
	public void setFormat(String aformat);


	/**
	* getmaxgreet 
	* This setting allows the adminstrator to limit the length of the user-recordable voicemail greeting. Use this option on systems with a large number of users and limited disk space. The value is an integer defining the maximum length in seconds of a  greeting message. The default value is 0 which means that the greeting message can be any length. This setting will control the lengths of the unavailable greeting, busy greeting, and user name messages.
	* @behavior.fieldname maxgreet 
	**/
	public String getMaxgreet();
	
	/**
	*setmaxgreet 
	* This setting allows the adminstrator to limit the length of the user-recordable voicemail greeting. Use this option on systems with a large number of users and limited disk space. The value is an integer defining the maximum length in seconds of a  greeting message. The default value is 0 which means that the greeting message can be any length. This setting will control the lengths of the unavailable greeting, busy greeting, and user name messages.
	* @behavior.fieldname maxgreet 
	*/
	public void setMaxgreet(String amaxgreet);


	/**
	* getskipms 
	* This setting defines an interval in milliseconds to use when skipping forward or reverse while a voicemail message is being played. The value entered here should be a positive integer. The default value for this setting is 3000 (3 seconds).
	* @behavior.fieldname skipms 
	**/
	public String getSkipms();
	
	/**
	*setskipms 
	* This setting defines an interval in milliseconds to use when skipping forward or reverse while a voicemail message is being played. The value entered here should be a positive integer. The default value for this setting is 3000 (3 seconds).
	* @behavior.fieldname skipms 
	*/
	public void setSkipms(String askipms);


	/**
	* getmaxlogins 
	* This setting defines the number of retries a user has to enter voicemail passwords before Asterisk will disconnect the user. The value should be a positive integer. The default value for this setting is 3.
	* @behavior.fieldname maxlogins 
	**/
	public String getMaxlogins();
	
	/**
	*setmaxlogins 
	* This setting defines the number of retries a user has to enter voicemail passwords before Asterisk will disconnect the user. The value should be a positive integer. The default value for this setting is 3.
	* @behavior.fieldname maxlogins 
	*/
	public void setMaxlogins(String amaxlogins);


	/**
	* getcidinternalcontexts 
	* This setting defines the internal contexts used to determine the type of voice announcement to play when reading back the caller ID in a message envelope, or when the saycid advanced feature is enabled. In case of an internal call the voice prompt reads &quot;Call from extension ...&quot; instead of &quot;Call from 12345678&quot;. This setting is only available in versions of Asterisk with advanced voicemail feature support. The value is a string listing the internal contexts. Each additional internal context should be separated from the previous one with a comma. The default value is an empty string, and no internal contexts defined.
	* @behavior.fieldname cidinternalcontexts 
	**/
	public String getCidinternalcontexts();
	
	/**
	*setcidinternalcontexts 
	* This setting defines the internal contexts used to determine the type of voice announcement to play when reading back the caller ID in a message envelope, or when the saycid advanced feature is enabled. In case of an internal call the voice prompt reads &quot;Call from extension ...&quot; instead of &quot;Call from 12345678&quot;. This setting is only available in versions of Asterisk with advanced voicemail feature support. The value is a string listing the internal contexts. Each additional internal context should be separated from the previous one with a comma. The default value is an empty string, and no internal contexts defined.
	* @behavior.fieldname cidinternalcontexts 
	*/
	public void setCidinternalcontexts(String acidinternalcontexts);


	/**
	* getreview 
	* Sometimes it is nice to let a caller review their message before committing it to a mailbox. This setting takes a yes or no value. If set to yes, then the caller will be asked to review the message, or save it as is after they have pressed '#'. If set to no, the message will be saved and the voice maill system will disconnect the caller. The default value for review is no. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname review 
	**/
	public Boolean getReview();
	
	/**
	*setreview 
	* Sometimes it is nice to let a caller review their message before committing it to a mailbox. This setting takes a yes or no value. If set to yes, then the caller will be asked to review the message, or save it as is after they have pressed '#'. If set to no, the message will be saved and the voice maill system will disconnect the caller. The default value for review is no. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname review 
	*/
	public void setReview(Boolean areview);


	/**
	* getoperator 
	* This setting enables the user to reach an operator during the time the voicemail message is being recorded, or once a voicemail message has been left, if the review option has been set to yes.  This setting takes a yes or no value. The operator must be specified at extension 'o' in extensions.conf. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname operator 
	**/
	public Boolean getOperator();
	
	/**
	*setoperator 
	* This setting enables the user to reach an operator during the time the voicemail message is being recorded, or once a voicemail message has been left, if the review option has been set to yes.  This setting takes a yes or no value. The operator must be specified at extension 'o' in extensions.conf. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname operator 
	*/
	public void setOperator(Boolean aoperator);


	/**
	* getsaycid 
	* Read back caller's telephone number prior to playing the incoming message, and just after announcing the date and time the message was left. This setting takes a yes or no value. If the administrator wants the caller's phone number to be heard prior to playing back a voicemail message, this option should be set  to yes. The default value for saycid is no. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname saycid 
	**/
	public Boolean getSaycid();
	
	/**
	*setsaycid 
	* Read back caller's telephone number prior to playing the incoming message, and just after announcing the date and time the message was left. This setting takes a yes or no value. If the administrator wants the caller's phone number to be heard prior to playing back a voicemail message, this option should be set  to yes. The default value for saycid is no. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname saycid 
	*/
	public void setSaycid(Boolean asaycid);


	/**
	* getdialout 
	* Specify a context to be used from the &quot;place an outgoing call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname dialout 
	**/
	public String getDialout();
	
	/**
	*setdialout 
	* Specify a context to be used from the &quot;place an outgoing call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname dialout 
	*/
	public void setDialout(String adialout);


	/**
	* getcallback 
	* Specify a context to be used from the &quot;return phone call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname callback 
	**/
	public String getCallback();
	
	/**
	*setcallback 
	* Specify a context to be used from the &quot;return phone call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	* @behavior.fieldname callback 
	*/
	public void setCallback(String acallback);


	/**
	* getdbuser 
	* Specify the Mysql database user name for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbuser 
	**/
	public String getDbuser();
	
	/**
	*setdbuser 
	* Specify the Mysql database user name for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbuser 
	*/
	public void setDbuser(String adbuser);


	/**
	* getdbpass 
	* Specify the Mysql database password for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbpass 
	**/
	public String getDbpass();
	
	/**
	*setdbpass 
	* Specify the Mysql database password for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbpass 
	*/
	public void setDbpass(String adbpass);


	/**
	* getdbhost 
	* Specify the Mysql database server hostname for the voicemail application to use. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbhost 
	**/
	public String getDbhost();
	
	/**
	*setdbhost 
	* Specify the Mysql database server hostname for the voicemail application to use. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbhost 
	*/
	public void setDbhost(String adbhost);


	/**
	* getdbname 
	* Specify the Mysql database name.  The value is a string. The default value is &quot;vmdb&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbname 
	**/
	public String getDbname();
	
	/**
	*setdbname 
	* Specify the Mysql database name.  The value is a string. The default value is &quot;vmdb&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	* @behavior.fieldname dbname 
	*/
	public void setDbname(String adbname);


	/**
	* getdboption 
	* Specify the Postgres database option. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Postgres support for this option to be meaningfu1, and this option must be specified if Postgres support is enabled.
	* @behavior.fieldname dboption 
	**/
	public String getDboption();
	
	/**
	*setdboption 
	* Specify the Postgres database option. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Postgres support for this option to be meaningfu1, and this option must be specified if Postgres support is enabled.
	* @behavior.fieldname dboption 
	*/
	public void setDboption(String adboption);


	/**
	* getpbxskip 
	* This setting changes the <i>Subject:</i> line in a voicemail notification message. This setting takes a yes or no value.  The default value is no. When set to yes the <i>Subject:</i> line will read &quot;Subject: New message <i>M</i> in mailbox <i>B</i>&quot;. When set to no the <i>Subject:</i> line will read &quot;Subject: [PBX]: New message <i>M</i> in mailbox <i>B</i>&quot;.
	* @behavior.fieldname pbxskip 
	**/
	public String getPbxskip();
	
	/**
	*setpbxskip 
	* This setting changes the <i>Subject:</i> line in a voicemail notification message. This setting takes a yes or no value.  The default value is no. When set to yes the <i>Subject:</i> line will read &quot;Subject: New message <i>M</i> in mailbox <i>B</i>&quot;. When set to no the <i>Subject:</i> line will read &quot;Subject: [PBX]: New message <i>M</i> in mailbox <i>B</i>&quot;.
	* @behavior.fieldname pbxskip 
	*/
	public void setPbxskip(String apbxskip);


	/**
	* getfromstring 
	* This setting allows the adminstrator to override a portion of the From: line in the voicemail notification message. By default, Asterisk sends the string &quot;From: Asterisk PBX &lt;who&gt;.  The &quot;Asterisk PBX&quot; portion of the From: line can be overridden by specifying your own string as the value for this setting.  One might use this  to customize the voicemail notification message and/or remove the reference to &quot;Asterisk PBX&quot;.
	* @behavior.fieldname fromstring 
	**/
	public String getFromstring();
	
	/**
	*setfromstring 
	* This setting allows the adminstrator to override a portion of the From: line in the voicemail notification message. By default, Asterisk sends the string &quot;From: Asterisk PBX &lt;who&gt;.  The &quot;Asterisk PBX&quot; portion of the From: line can be overridden by specifying your own string as the value for this setting.  One might use this  to customize the voicemail notification message and/or remove the reference to &quot;Asterisk PBX&quot;.
	* @behavior.fieldname fromstring 
	*/
	public void setFromstring(String afromstring);


	/**
	* getemailsubject 
	* This setting completely overrides <i>Subject:</i> line in the voicemail notification message, and substitutes its own text in place of it. The value passed is a string containing the text to send in place of the <i>Subject:</i> line.
	* @behavior.fieldname emailsubject 
	**/
	public String getEmailsubject();
	
	/**
	*setemailsubject 
	* This setting completely overrides <i>Subject:</i> line in the voicemail notification message, and substitutes its own text in place of it. The value passed is a string containing the text to send in place of the <i>Subject:</i> line.
	* @behavior.fieldname emailsubject 
	*/
	public void setEmailsubject(String aemailsubject);


	/**
	* getemailbody 
	* This setting overrides the normal message text seen in the body of a voicemail notification message.  It also supports variable substitution which can be used to make the message more meaningful. The workings of variable substitution may be covered in a separate section in a future version of this document.
	* @behavior.fieldname emailbody 
	**/
	public String getEmailbody();
	
	/**
	*setemailbody 
	* This setting overrides the normal message text seen in the body of a voicemail notification message.  It also supports variable substitution which can be used to make the message more meaningful. The workings of variable substitution may be covered in a separate section in a future version of this document.
	* @behavior.fieldname emailbody 
	*/
	public void setEmailbody(String aemailbody);


	/**
	* getexitcontext 
	* Optional context to drop the user into after he/she has pressed * or 0 to exit voicemail
	* @behavior.fieldname exitcontext 
	**/
	public String getExitcontext();
	
	/**
	*setexitcontext 
	* Optional context to drop the user into after he/she has pressed * or 0 to exit voicemail
	* @behavior.fieldname exitcontext 
	*/
	public void setExitcontext(String aexitcontext);


	/**
	* getnextaftercmd 
	* If set to &quot;yes,&quot; after deleting a voicemail message, the system will automatically play the next message.
	* @behavior.fieldname nextaftercmd 
	**/
	public String getNextaftercmd();
	
	/**
	*setnextaftercmd 
	* If set to &quot;yes,&quot; after deleting a voicemail message, the system will automatically play the next message.
	* @behavior.fieldname nextaftercmd 
	*/
	public void setNextaftercmd(String anextaftercmd);


}