package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Voicemailgeneral<br>
 * Lets first discuss the contents of the general section. This section contains configuration settings which will apply as a common policy across all users. The general section must be defined and present in voicemail.conf. Configuration entries are coded in setting=value format. The configuration settings available in the general section are as follows:


 * </p>
 * Created : Fri May 26 14:31:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Voicemailgeneral.java,v 1.1 2008/06/24 20:45:15 urszeidler Exp $
 */
 public  class Voicemailgeneral extends AbstractSimpleDataClass implements IVoicemailgeneral{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Voicemailgeneral
	**/
	public Voicemailgeneral(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Voicemailgeneral
	**/
	public Voicemailgeneral( Boolean aattach, Boolean adelete, String amailcmd, String amaxsilence, String aenvelope, String aexternnotify, String asilencethreshold, String aserveremail, String amaxmessage, String aminmessage, String aformat, String amaxgreet, String askipms, String amaxlogins, String acidinternalcontexts, Boolean areview, Boolean aoperator, Boolean asaycid, String adialout, String acallback, String adbuser, String adbpass, String adbhost, String adbname, String adboption, String apbxskip, String afromstring, String aemailsubject, String aemailbody, String aexitcontext, String anextaftercmd){
		super();
	
		this.attach = aattach;	
		this.delete = adelete;	
		this.mailcmd = amailcmd;	
		this.maxsilence = amaxsilence;	
		this.envelope = aenvelope;	
		this.externnotify = aexternnotify;	
		this.silencethreshold = asilencethreshold;	
		this.serveremail = aserveremail;	
		this.maxmessage = amaxmessage;	
		this.minmessage = aminmessage;	
		this.format = aformat;	
		this.maxgreet = amaxgreet;	
		this.skipms = askipms;	
		this.maxlogins = amaxlogins;	
		this.cidinternalcontexts = acidinternalcontexts;	
		this.review = areview;	
		this.operator = aoperator;	
		this.saycid = asaycid;	
		this.dialout = adialout;	
		this.callback = acallback;	
		this.dbuser = adbuser;	
		this.dbpass = adbpass;	
		this.dbhost = adbhost;	
		this.dbname = adbname;	
		this.dboption = adboption;	
		this.pbxskip = apbxskip;	
		this.fromstring = afromstring;	
		this.emailsubject = aemailsubject;	
		this.emailbody = aemailbody;	
		this.exitcontext = aexitcontext;	
		this.nextaftercmd = anextaftercmd;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Voicemailgeneral object){
		this.attach = object.attach;	
		this.delete = object.delete;	
		this.mailcmd = object.mailcmd;	
		this.maxsilence = object.maxsilence;	
		this.envelope = object.envelope;	
		this.externnotify = object.externnotify;	
		this.silencethreshold = object.silencethreshold;	
		this.serveremail = object.serveremail;	
		this.maxmessage = object.maxmessage;	
		this.minmessage = object.minmessage;	
		this.format = object.format;	
		this.maxgreet = object.maxgreet;	
		this.skipms = object.skipms;	
		this.maxlogins = object.maxlogins;	
		this.cidinternalcontexts = object.cidinternalcontexts;	
		this.review = object.review;	
		this.operator = object.operator;	
		this.saycid = object.saycid;	
		this.dialout = object.dialout;	
		this.callback = object.callback;	
		this.dbuser = object.dbuser;	
		this.dbpass = object.dbpass;	
		this.dbhost = object.dbhost;	
		this.dbname = object.dbname;	
		this.dboption = object.dboption;	
		this.pbxskip = object.pbxskip;	
		this.fromstring = object.fromstring;	
		this.emailsubject = object.emailsubject;	
		this.emailbody = object.emailbody;	
		this.exitcontext = object.exitcontext;	
		this.nextaftercmd = object.nextaftercmd;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Attach causes Asterisk to copy a voicemail message to an audio file and send it to the user as an attachment in an e-mail  voicemail notification message.  The default is not to do this. Attach takes two values yes or no. **/
	protected Boolean attach;
	public static final String VALUEID_ATTACH="attach" ;

    /**  If set to &quot;yes&quot; the message will be deleted from the voicemailbox (after having been emailed).

The delete flag, when used alone (instead of with voicemail broadcast), provides functionality that allows a user to receive their voicemail via email alone.

Note This settting does not always work as a global setting. It is recommended to put this as an option for each voice mailbox that's messages are to be deleted after being emailed.

Note This setting needs to be prefixed with a | not a , in order to set it on a user's extension if other settings are being configured.  For example 823 =&gt; 1234,office,office@demo.local,,attach=yes|delete=1 **/
	protected Boolean delete;
	public static final String VALUEID_DELETE="delete" ;

    /**  Mailcmd allows the administrator to override the default mailer command with a defined command. Mailcmd takes a string value set to the desired command line to execute when a user needs to be notified of a voice mail message. The default command line is: '/usr/sbin/sendmail -t' **/
	protected String mailcmd;
	public static final String VALUEID_MAILCMD="mailcmd" ;

    /**  Maxsilence defines how long Asterisk will wait for a contiguous period of silence before terminating an incoming call to voice mail. The default value is 0, which means the silence detector is disabled and the wait time is infinite. Maxsilence takes a value of zero or a positive integer value which is the number of seconds of silence to wait before disconnecting. **/
	protected String maxsilence;
	public static final String VALUEID_MAXSILENCE="maxsilence" ;

    /**  Envelope controls whether or not Asterisk will play the message envelope (date/time) before playing the voicemail message. This settng does not affect the operation of the envelope option in the advanced voicemail menu. Envelope takes two values yes or no.  The default value is yes. Note: this is only in the Asterisk CVS version dated 5/19/04 or later. **/
	protected String envelope;
	public static final String VALUEID_ENVELOPE="envelope" ;

    /**  Want to run an external program whenever a caller leaves a voice mail message for a user? This is where the externnotify command comes in handy. Externnotify takes a string value which is the command line you want to execute when the caller finishes leaving a message.

Note: see a poorly written, but functional example of an external notification script <a class='wiki'  href='http://mikecathey.com/code/vmnotify/'>here</a>.

The way it works is basically any time that somebody leaves a voicemail on the system (regardless of mailbox number), the command specified for externnotify is run with the arguments (in this order): context, extension, and number of voicemails in that mailbox. These arguments are passed to the program that you set in the externnotify variable. **/
	protected String externnotify;
	public static final String VALUEID_EXTERNNOTIFY="externnotify" ;

    /**  When using the maxsilence setting, it is sometimes necessary to adjust the silence detection threshold to eliminate false triggering on background noise.

Silencethreshold allows the adminstrator to do just that. The default silencethreshold value is 128.  Higher numbers raise the threshold so that more background noise is needed to cause the silence detector to reset. When employing this setting, some experimentation will be necessary to find the best result. **/
	protected String silencethreshold;
	public static final String VALUEID_SILENCETHRESHOLD="silencethreshold" ;

    /**  This setting can be used to identify the source of a voicemail  notification message. The value is a string which can be encoded one of two ways. If the string is of the form <i>someone@host.com</i>, then the string will be used as the source address for all voicemail notification emails. If the string is of the form <i>someone</i>, then the host name of the machine running Asterisk will be postpended to the string after insertion of a '@'. **/
	protected String serveremail;
	public static final String VALUEID_SERVEREMAIL="serveremail" ;

    /**  This defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. The default value for this setting is 0 which means there will be no maximum time limit enforced. **/
	protected String maxmessage;
	public static final String VALUEID_MAXMESSAGE="maxmessage" ;

    /**  This setting can be used to elimiinate messages which are shorter than a given amount of time in seconds. The default value for this setting is 0 which means there will be no minimum time limit enforced. **/
	protected String minmessage;
	public static final String VALUEID_MINMESSAGE="minmessage" ;

    /**  The format setting selects audio file format(s) to use when storing voice mail messages. The value is a string defining the audio format(s) of the message file. The default format string is <i>wav49|gsm|wav</i>, meaning that Asterisk will save the voicemail message in all three supported formats. When emailing the attachment, however, it will send only the first of the formats defined here. What the value of saving in more than one format is, I don't know.

 wav49: In this format, the file size will be small, the quality good, and it's a good choice for sending voicemail messages in email. The file will have a .wav extension, which all Windows users should have no problems with, and users on other platforms should also be able to easily play these sound files.

 gsm: Voicemail saved in this format will have about the same file size and same audio quality as wav49. It may be less well supported by client operating systems if sent to users in email, however.

 wav: This is an uncompressed sound format, so the file size is very large. Not recommended.

 g723sf: The sample voicemail.conf file has this option commented out. If you try to activate it, you will find that it doesn't work. **/
	protected String format;
	public static final String VALUEID_FORMAT="format" ;

    /**  This setting allows the adminstrator to limit the length of the user-recordable voicemail greeting. Use this option on systems with a large number of users and limited disk space. The value is an integer defining the maximum length in seconds of a  greeting message. The default value is 0 which means that the greeting message can be any length. This setting will control the lengths of the unavailable greeting, busy greeting, and user name messages. **/
	protected String maxgreet;
	public static final String VALUEID_MAXGREET="maxgreet" ;

    /**  This setting defines an interval in milliseconds to use when skipping forward or reverse while a voicemail message is being played. The value entered here should be a positive integer. The default value for this setting is 3000 (3 seconds). **/
	protected String skipms;
	public static final String VALUEID_SKIPMS="skipms" ;

    /**  This setting defines the number of retries a user has to enter voicemail passwords before Asterisk will disconnect the user. The value should be a positive integer. The default value for this setting is 3. **/
	protected String maxlogins;
	public static final String VALUEID_MAXLOGINS="maxlogins" ;

    /**  This setting defines the internal contexts used to determine the type of voice announcement to play when reading back the caller ID in a message envelope, or when the saycid advanced feature is enabled. In case of an internal call the voice prompt reads &quot;Call from extension ...&quot; instead of &quot;Call from 12345678&quot;. This setting is only available in versions of Asterisk with advanced voicemail feature support. The value is a string listing the internal contexts. Each additional internal context should be separated from the previous one with a comma. The default value is an empty string, and no internal contexts defined. **/
	protected String cidinternalcontexts;
	public static final String VALUEID_CIDINTERNALCONTEXTS="cidinternalcontexts" ;

    /**  Sometimes it is nice to let a caller review their message before committing it to a mailbox. This setting takes a yes or no value. If set to yes, then the caller will be asked to review the message, or save it as is after they have pressed '#'. If set to no, the message will be saved and the voice maill system will disconnect the caller. The default value for review is no. This setting is only available in versions of Asterisk with advanced voicemail feature support. **/
	protected Boolean review;
	public static final String VALUEID_REVIEW="review" ;

    /**  This setting enables the user to reach an operator during the time the voicemail message is being recorded, or once a voicemail message has been left, if the review option has been set to yes.  This setting takes a yes or no value. The operator must be specified at extension 'o' in extensions.conf. This setting is only available in versions of Asterisk with advanced voicemail feature support. **/
	protected Boolean operator;
	public static final String VALUEID_OPERATOR="operator" ;

    /**  Read back caller's telephone number prior to playing the incoming message, and just after announcing the date and time the message was left. This setting takes a yes or no value. If the administrator wants the caller's phone number to be heard prior to playing back a voicemail message, this option should be set  to yes. The default value for saycid is no. This setting is only available in versions of Asterisk with advanced voicemail feature support. **/
	protected Boolean saycid;
	public static final String VALUEID_SAYCID="saycid" ;

    /**  Specify a context to be used from the &quot;place an outgoing call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support. **/
	protected String dialout;
	public static final String VALUEID_DIALOUT="dialout" ;

    /**  Specify a context to be used from the &quot;return phone call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support. **/
	protected String callback;
	public static final String VALUEID_CALLBACK="callback" ;

    /**  Specify the Mysql database user name for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful. **/
	protected String dbuser;
	public static final String VALUEID_DBUSER="dbuser" ;

    /**  Specify the Mysql database password for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful. **/
	protected String dbpass;
	public static final String VALUEID_DBPASS="dbpass" ;

    /**  Specify the Mysql database server hostname for the voicemail application to use. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful. **/
	protected String dbhost;
	public static final String VALUEID_DBHOST="dbhost" ;

    /**  Specify the Mysql database name.  The value is a string. The default value is &quot;vmdb&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful. **/
	protected String dbname;
	public static final String VALUEID_DBNAME="dbname" ;

    /**  Specify the Postgres database option. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Postgres support for this option to be meaningfu1, and this option must be specified if Postgres support is enabled. **/
	protected String dboption;
	public static final String VALUEID_DBOPTION="dboption" ;

    /**  This setting changes the <i>Subject:</i> line in a voicemail notification message. This setting takes a yes or no value.  The default value is no. When set to yes the <i>Subject:</i> line will read &quot;Subject: New message <i>M</i> in mailbox <i>B</i>&quot;. When set to no the <i>Subject:</i> line will read &quot;Subject: [PBX]: New message <i>M</i> in mailbox <i>B</i>&quot;. **/
	protected String pbxskip;
	public static final String VALUEID_PBXSKIP="pbxskip" ;

    /**  This setting allows the adminstrator to override a portion of the From: line in the voicemail notification message. By default, Asterisk sends the string &quot;From: Asterisk PBX &lt;who&gt;.  The &quot;Asterisk PBX&quot; portion of the From: line can be overridden by specifying your own string as the value for this setting.  One might use this  to customize the voicemail notification message and/or remove the reference to &quot;Asterisk PBX&quot;. **/
	protected String fromstring;
	public static final String VALUEID_FROMSTRING="fromstring" ;

    /**  This setting completely overrides <i>Subject:</i> line in the voicemail notification message, and substitutes its own text in place of it. The value passed is a string containing the text to send in place of the <i>Subject:</i> line. **/
	protected String emailsubject;
	public static final String VALUEID_EMAILSUBJECT="emailsubject" ;

    /**  This setting overrides the normal message text seen in the body of a voicemail notification message.  It also supports variable substitution which can be used to make the message more meaningful. The workings of variable substitution may be covered in a separate section in a future version of this document. **/
	protected String emailbody;
	public static final String VALUEID_EMAILBODY="emailbody" ;

    /**  Optional context to drop the user into after he/she has pressed * or 0 to exit voicemail **/
	protected String exitcontext;
	public static final String VALUEID_EXITCONTEXT="exitcontext" ;

    /**  If set to &quot;yes,&quot; after deleting a voicemail message, the system will automatically play the next message. **/
	protected String nextaftercmd;
	public static final String VALUEID_NEXTAFTERCMD="nextaftercmd" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ATTACH.equals(valueid)){
			return true;
		}
		if(VALUEID_DELETE.equals(valueid)){
			return true;
		}
		if(VALUEID_MAILCMD.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXSILENCE.equals(valueid)){
			return true;
		}
		if(VALUEID_ENVELOPE.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTERNNOTIFY.equals(valueid)){
			return true;
		}
		if(VALUEID_SILENCETHRESHOLD.equals(valueid)){
			return true;
		}
		if(VALUEID_SERVEREMAIL.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXMESSAGE.equals(valueid)){
			return true;
		}
		if(VALUEID_MINMESSAGE.equals(valueid)){
			return true;
		}
		if(VALUEID_FORMAT.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXGREET.equals(valueid)){
			return true;
		}
		if(VALUEID_SKIPMS.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXLOGINS.equals(valueid)){
			return true;
		}
		if(VALUEID_CIDINTERNALCONTEXTS.equals(valueid)){
			return true;
		}
		if(VALUEID_REVIEW.equals(valueid)){
			return true;
		}
		if(VALUEID_OPERATOR.equals(valueid)){
			return true;
		}
		if(VALUEID_SAYCID.equals(valueid)){
			return true;
		}
		if(VALUEID_DIALOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLBACK.equals(valueid)){
			return true;
		}
		if(VALUEID_DBUSER.equals(valueid)){
			return true;
		}
		if(VALUEID_DBPASS.equals(valueid)){
			return true;
		}
		if(VALUEID_DBHOST.equals(valueid)){
			return true;
		}
		if(VALUEID_DBNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_DBOPTION.equals(valueid)){
			return true;
		}
		if(VALUEID_PBXSKIP.equals(valueid)){
			return true;
		}
		if(VALUEID_FROMSTRING.equals(valueid)){
			return true;
		}
		if(VALUEID_EMAILSUBJECT.equals(valueid)){
			return true;
		}
		if(VALUEID_EMAILBODY.equals(valueid)){
			return true;
		}
		if(VALUEID_EXITCONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_NEXTAFTERCMD.equals(valueid)){
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
		if(VALUEID_ATTACH.equals(valueid)){
			if(data instanceof String){
		        setAttach(new Boolean((String)data));
		        return;
		    }
			setAttach((Boolean)data);
			return;
		}
		if(VALUEID_DELETE.equals(valueid)){
			if(data instanceof String){
		        setDelete(new Boolean((String)data));
		        return;
		    }
			setDelete((Boolean)data);
			return;
		}
		if(VALUEID_MAILCMD.equals(valueid)){
			setMailcmd((String)data);
			return;
		}
		if(VALUEID_MAXSILENCE.equals(valueid)){
			setMaxsilence((String)data);
			return;
		}
		if(VALUEID_ENVELOPE.equals(valueid)){
			setEnvelope((String)data);
			return;
		}
		if(VALUEID_EXTERNNOTIFY.equals(valueid)){
			setExternnotify((String)data);
			return;
		}
		if(VALUEID_SILENCETHRESHOLD.equals(valueid)){
			setSilencethreshold((String)data);
			return;
		}
		if(VALUEID_SERVEREMAIL.equals(valueid)){
			setServeremail((String)data);
			return;
		}
		if(VALUEID_MAXMESSAGE.equals(valueid)){
			setMaxmessage((String)data);
			return;
		}
		if(VALUEID_MINMESSAGE.equals(valueid)){
			setMinmessage((String)data);
			return;
		}
		if(VALUEID_FORMAT.equals(valueid)){
			setFormat((String)data);
			return;
		}
		if(VALUEID_MAXGREET.equals(valueid)){
			setMaxgreet((String)data);
			return;
		}
		if(VALUEID_SKIPMS.equals(valueid)){
			setSkipms((String)data);
			return;
		}
		if(VALUEID_MAXLOGINS.equals(valueid)){
			setMaxlogins((String)data);
			return;
		}
		if(VALUEID_CIDINTERNALCONTEXTS.equals(valueid)){
			setCidinternalcontexts((String)data);
			return;
		}
		if(VALUEID_REVIEW.equals(valueid)){
			if(data instanceof String){
		        setReview(new Boolean((String)data));
		        return;
		    }
			setReview((Boolean)data);
			return;
		}
		if(VALUEID_OPERATOR.equals(valueid)){
			if(data instanceof String){
		        setOperator(new Boolean((String)data));
		        return;
		    }
			setOperator((Boolean)data);
			return;
		}
		if(VALUEID_SAYCID.equals(valueid)){
			if(data instanceof String){
		        setSaycid(new Boolean((String)data));
		        return;
		    }
			setSaycid((Boolean)data);
			return;
		}
		if(VALUEID_DIALOUT.equals(valueid)){
			setDialout((String)data);
			return;
		}
		if(VALUEID_CALLBACK.equals(valueid)){
			setCallback((String)data);
			return;
		}
		if(VALUEID_DBUSER.equals(valueid)){
			setDbuser((String)data);
			return;
		}
		if(VALUEID_DBPASS.equals(valueid)){
			setDbpass((String)data);
			return;
		}
		if(VALUEID_DBHOST.equals(valueid)){
			setDbhost((String)data);
			return;
		}
		if(VALUEID_DBNAME.equals(valueid)){
			setDbname((String)data);
			return;
		}
		if(VALUEID_DBOPTION.equals(valueid)){
			setDboption((String)data);
			return;
		}
		if(VALUEID_PBXSKIP.equals(valueid)){
			setPbxskip((String)data);
			return;
		}
		if(VALUEID_FROMSTRING.equals(valueid)){
			setFromstring((String)data);
			return;
		}
		if(VALUEID_EMAILSUBJECT.equals(valueid)){
			setEmailsubject((String)data);
			return;
		}
		if(VALUEID_EMAILBODY.equals(valueid)){
			setEmailbody((String)data);
			return;
		}
		if(VALUEID_EXITCONTEXT.equals(valueid)){
			setExitcontext((String)data);
			return;
		}
		if(VALUEID_NEXTAFTERCMD.equals(valueid)){
			setNextaftercmd((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ATTACH.equals(valueid)){
			return getAttach();
			
		}
		if(VALUEID_DELETE.equals(valueid)){
			return getDelete();
			
		}
		if(VALUEID_MAILCMD.equals(valueid)){
			return getMailcmd();
			
		}
		if(VALUEID_MAXSILENCE.equals(valueid)){
			return getMaxsilence();
			
		}
		if(VALUEID_ENVELOPE.equals(valueid)){
			return getEnvelope();
			
		}
		if(VALUEID_EXTERNNOTIFY.equals(valueid)){
			return getExternnotify();
			
		}
		if(VALUEID_SILENCETHRESHOLD.equals(valueid)){
			return getSilencethreshold();
			
		}
		if(VALUEID_SERVEREMAIL.equals(valueid)){
			return getServeremail();
			
		}
		if(VALUEID_MAXMESSAGE.equals(valueid)){
			return getMaxmessage();
			
		}
		if(VALUEID_MINMESSAGE.equals(valueid)){
			return getMinmessage();
			
		}
		if(VALUEID_FORMAT.equals(valueid)){
			return getFormat();
			
		}
		if(VALUEID_MAXGREET.equals(valueid)){
			return getMaxgreet();
			
		}
		if(VALUEID_SKIPMS.equals(valueid)){
			return getSkipms();
			
		}
		if(VALUEID_MAXLOGINS.equals(valueid)){
			return getMaxlogins();
			
		}
		if(VALUEID_CIDINTERNALCONTEXTS.equals(valueid)){
			return getCidinternalcontexts();
			
		}
		if(VALUEID_REVIEW.equals(valueid)){
			return getReview();
			
		}
		if(VALUEID_OPERATOR.equals(valueid)){
			return getOperator();
			
		}
		if(VALUEID_SAYCID.equals(valueid)){
			return getSaycid();
			
		}
		if(VALUEID_DIALOUT.equals(valueid)){
			return getDialout();
			
		}
		if(VALUEID_CALLBACK.equals(valueid)){
			return getCallback();
			
		}
		if(VALUEID_DBUSER.equals(valueid)){
			return getDbuser();
			
		}
		if(VALUEID_DBPASS.equals(valueid)){
			return getDbpass();
			
		}
		if(VALUEID_DBHOST.equals(valueid)){
			return getDbhost();
			
		}
		if(VALUEID_DBNAME.equals(valueid)){
			return getDbname();
			
		}
		if(VALUEID_DBOPTION.equals(valueid)){
			return getDboption();
			
		}
		if(VALUEID_PBXSKIP.equals(valueid)){
			return getPbxskip();
			
		}
		if(VALUEID_FROMSTRING.equals(valueid)){
			return getFromstring();
			
		}
		if(VALUEID_EMAILSUBJECT.equals(valueid)){
			return getEmailsubject();
			
		}
		if(VALUEID_EMAILBODY.equals(valueid)){
			return getEmailbody();
			
		}
		if(VALUEID_EXITCONTEXT.equals(valueid)){
			return getExitcontext();
			
		}
		if(VALUEID_NEXTAFTERCMD.equals(valueid)){
			return getNextaftercmd();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getattach 
	* Attach causes Asterisk to copy a voicemail message to an audio file and send it to the user as an attachment in an e-mail  voicemail notification message.  The default is not to do this. Attach takes two values yes or no.
	**/
	public Boolean getAttach(){		return  attach;
	}
	/**
	*setattach 
	*/
	public void setAttach(Boolean aattach){
		if(aattach==null){
		    changed = (this.attach!=null);
		    this.attach = null;	    
		}else{
			changed = aattach.equals(this.attach);
			this.attach=aattach;
		}
	}


	/**
	* getdelete 
	* If set to &quot;yes&quot; the message will be deleted from the voicemailbox (after having been emailed).

The delete flag, when used alone (instead of with voicemail broadcast), provides functionality that allows a user to receive their voicemail via email alone.

Note This settting does not always work as a global setting. It is recommended to put this as an option for each voice mailbox that's messages are to be deleted after being emailed.

Note This setting needs to be prefixed with a | not a , in order to set it on a user's extension if other settings are being configured.  For example 823 =&gt; 1234,office,office@demo.local,,attach=yes|delete=1
	**/
	public Boolean getDelete(){		return  delete;
	}
	/**
	*setdelete 
	*/
	public void setDelete(Boolean adelete){
		if(adelete==null){
		    changed = (this.delete!=null);
		    this.delete = null;	    
		}else{
			changed = adelete.equals(this.delete);
			this.delete=adelete;
		}
	}


	/**
	* getmailcmd 
	* Mailcmd allows the administrator to override the default mailer command with a defined command. Mailcmd takes a string value set to the desired command line to execute when a user needs to be notified of a voice mail message. The default command line is: '/usr/sbin/sendmail -t'
	**/
	public String getMailcmd(){		return  mailcmd;
	}
	/**
	*setmailcmd 
	*/
	public void setMailcmd(String amailcmd){
		if(amailcmd==null){
		    changed = (this.mailcmd!=null);
		    this.mailcmd = null;	    
		}else{
			changed = amailcmd.equals(this.mailcmd);
			this.mailcmd=amailcmd;
		}
	}


	/**
	* getmaxsilence 
	* Maxsilence defines how long Asterisk will wait for a contiguous period of silence before terminating an incoming call to voice mail. The default value is 0, which means the silence detector is disabled and the wait time is infinite. Maxsilence takes a value of zero or a positive integer value which is the number of seconds of silence to wait before disconnecting.
	**/
	public String getMaxsilence(){		return  maxsilence;
	}
	/**
	*setmaxsilence 
	*/
	public void setMaxsilence(String amaxsilence){
		if(amaxsilence==null){
		    changed = (this.maxsilence!=null);
		    this.maxsilence = null;	    
		}else{
			changed = amaxsilence.equals(this.maxsilence);
			this.maxsilence=amaxsilence;
		}
	}


	/**
	* getenvelope 
	* Envelope controls whether or not Asterisk will play the message envelope (date/time) before playing the voicemail message. This settng does not affect the operation of the envelope option in the advanced voicemail menu. Envelope takes two values yes or no.  The default value is yes. Note: this is only in the Asterisk CVS version dated 5/19/04 or later.
	**/
	public String getEnvelope(){		return  envelope;
	}
	/**
	*setenvelope 
	*/
	public void setEnvelope(String aenvelope){
		if(aenvelope==null){
		    changed = (this.envelope!=null);
		    this.envelope = null;	    
		}else{
			changed = aenvelope.equals(this.envelope);
			this.envelope=aenvelope;
		}
	}


	/**
	* getexternnotify 
	* Want to run an external program whenever a caller leaves a voice mail message for a user? This is where the externnotify command comes in handy. Externnotify takes a string value which is the command line you want to execute when the caller finishes leaving a message.

Note: see a poorly written, but functional example of an external notification script <a class='wiki'  href='http://mikecathey.com/code/vmnotify/'>here</a>.

The way it works is basically any time that somebody leaves a voicemail on the system (regardless of mailbox number), the command specified for externnotify is run with the arguments (in this order): context, extension, and number of voicemails in that mailbox. These arguments are passed to the program that you set in the externnotify variable.
	**/
	public String getExternnotify(){		return  externnotify;
	}
	/**
	*setexternnotify 
	*/
	public void setExternnotify(String aexternnotify){
		if(aexternnotify==null){
		    changed = (this.externnotify!=null);
		    this.externnotify = null;	    
		}else{
			changed = aexternnotify.equals(this.externnotify);
			this.externnotify=aexternnotify;
		}
	}


	/**
	* getsilencethreshold 
	* When using the maxsilence setting, it is sometimes necessary to adjust the silence detection threshold to eliminate false triggering on background noise.

Silencethreshold allows the adminstrator to do just that. The default silencethreshold value is 128.  Higher numbers raise the threshold so that more background noise is needed to cause the silence detector to reset. When employing this setting, some experimentation will be necessary to find the best result.
	**/
	public String getSilencethreshold(){		return  silencethreshold;
	}
	/**
	*setsilencethreshold 
	*/
	public void setSilencethreshold(String asilencethreshold){
		if(asilencethreshold==null){
		    changed = (this.silencethreshold!=null);
		    this.silencethreshold = null;	    
		}else{
			changed = asilencethreshold.equals(this.silencethreshold);
			this.silencethreshold=asilencethreshold;
		}
	}


	/**
	* getserveremail 
	* This setting can be used to identify the source of a voicemail  notification message. The value is a string which can be encoded one of two ways. If the string is of the form <i>someone@host.com</i>, then the string will be used as the source address for all voicemail notification emails. If the string is of the form <i>someone</i>, then the host name of the machine running Asterisk will be postpended to the string after insertion of a '@'.
	**/
	public String getServeremail(){		return  serveremail;
	}
	/**
	*setserveremail 
	*/
	public void setServeremail(String aserveremail){
		if(aserveremail==null){
		    changed = (this.serveremail!=null);
		    this.serveremail = null;	    
		}else{
			changed = aserveremail.equals(this.serveremail);
			this.serveremail=aserveremail;
		}
	}


	/**
	* getmaxmessage 
	* This defines the maximum amount of time in seconds of an incoming message. Use this when there are many users and disk space is limited. The default value for this setting is 0 which means there will be no maximum time limit enforced.
	**/
	public String getMaxmessage(){		return  maxmessage;
	}
	/**
	*setmaxmessage 
	*/
	public void setMaxmessage(String amaxmessage){
		if(amaxmessage==null){
		    changed = (this.maxmessage!=null);
		    this.maxmessage = null;	    
		}else{
			changed = amaxmessage.equals(this.maxmessage);
			this.maxmessage=amaxmessage;
		}
	}


	/**
	* getminmessage 
	* This setting can be used to elimiinate messages which are shorter than a given amount of time in seconds. The default value for this setting is 0 which means there will be no minimum time limit enforced.
	**/
	public String getMinmessage(){		return  minmessage;
	}
	/**
	*setminmessage 
	*/
	public void setMinmessage(String aminmessage){
		if(aminmessage==null){
		    changed = (this.minmessage!=null);
		    this.minmessage = null;	    
		}else{
			changed = aminmessage.equals(this.minmessage);
			this.minmessage=aminmessage;
		}
	}


	/**
	* getformat 
	* The format setting selects audio file format(s) to use when storing voice mail messages. The value is a string defining the audio format(s) of the message file. The default format string is <i>wav49|gsm|wav</i>, meaning that Asterisk will save the voicemail message in all three supported formats. When emailing the attachment, however, it will send only the first of the formats defined here. What the value of saving in more than one format is, I don't know.

 wav49: In this format, the file size will be small, the quality good, and it's a good choice for sending voicemail messages in email. The file will have a .wav extension, which all Windows users should have no problems with, and users on other platforms should also be able to easily play these sound files.

 gsm: Voicemail saved in this format will have about the same file size and same audio quality as wav49. It may be less well supported by client operating systems if sent to users in email, however.

 wav: This is an uncompressed sound format, so the file size is very large. Not recommended.

 g723sf: The sample voicemail.conf file has this option commented out. If you try to activate it, you will find that it doesn't work.
	**/
	public String getFormat(){		return  format;
	}
	/**
	*setformat 
	*/
	public void setFormat(String aformat){
		if(aformat==null){
		    changed = (this.format!=null);
		    this.format = null;	    
		}else{
			changed = aformat.equals(this.format);
			this.format=aformat;
		}
	}


	/**
	* getmaxgreet 
	* This setting allows the adminstrator to limit the length of the user-recordable voicemail greeting. Use this option on systems with a large number of users and limited disk space. The value is an integer defining the maximum length in seconds of a  greeting message. The default value is 0 which means that the greeting message can be any length. This setting will control the lengths of the unavailable greeting, busy greeting, and user name messages.
	**/
	public String getMaxgreet(){		return  maxgreet;
	}
	/**
	*setmaxgreet 
	*/
	public void setMaxgreet(String amaxgreet){
		if(amaxgreet==null){
		    changed = (this.maxgreet!=null);
		    this.maxgreet = null;	    
		}else{
			changed = amaxgreet.equals(this.maxgreet);
			this.maxgreet=amaxgreet;
		}
	}


	/**
	* getskipms 
	* This setting defines an interval in milliseconds to use when skipping forward or reverse while a voicemail message is being played. The value entered here should be a positive integer. The default value for this setting is 3000 (3 seconds).
	**/
	public String getSkipms(){		return  skipms;
	}
	/**
	*setskipms 
	*/
	public void setSkipms(String askipms){
		if(askipms==null){
		    changed = (this.skipms!=null);
		    this.skipms = null;	    
		}else{
			changed = askipms.equals(this.skipms);
			this.skipms=askipms;
		}
	}


	/**
	* getmaxlogins 
	* This setting defines the number of retries a user has to enter voicemail passwords before Asterisk will disconnect the user. The value should be a positive integer. The default value for this setting is 3.
	**/
	public String getMaxlogins(){		return  maxlogins;
	}
	/**
	*setmaxlogins 
	*/
	public void setMaxlogins(String amaxlogins){
		if(amaxlogins==null){
		    changed = (this.maxlogins!=null);
		    this.maxlogins = null;	    
		}else{
			changed = amaxlogins.equals(this.maxlogins);
			this.maxlogins=amaxlogins;
		}
	}


	/**
	* getcidinternalcontexts 
	* This setting defines the internal contexts used to determine the type of voice announcement to play when reading back the caller ID in a message envelope, or when the saycid advanced feature is enabled. In case of an internal call the voice prompt reads &quot;Call from extension ...&quot; instead of &quot;Call from 12345678&quot;. This setting is only available in versions of Asterisk with advanced voicemail feature support. The value is a string listing the internal contexts. Each additional internal context should be separated from the previous one with a comma. The default value is an empty string, and no internal contexts defined.
	**/
	public String getCidinternalcontexts(){		return  cidinternalcontexts;
	}
	/**
	*setcidinternalcontexts 
	*/
	public void setCidinternalcontexts(String acidinternalcontexts){
		if(acidinternalcontexts==null){
		    changed = (this.cidinternalcontexts!=null);
		    this.cidinternalcontexts = null;	    
		}else{
			changed = acidinternalcontexts.equals(this.cidinternalcontexts);
			this.cidinternalcontexts=acidinternalcontexts;
		}
	}


	/**
	* getreview 
	* Sometimes it is nice to let a caller review their message before committing it to a mailbox. This setting takes a yes or no value. If set to yes, then the caller will be asked to review the message, or save it as is after they have pressed '#'. If set to no, the message will be saved and the voice maill system will disconnect the caller. The default value for review is no. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	**/
	public Boolean getReview(){		return  review;
	}
	/**
	*setreview 
	*/
	public void setReview(Boolean areview){
		if(areview==null){
		    changed = (this.review!=null);
		    this.review = null;	    
		}else{
			changed = areview.equals(this.review);
			this.review=areview;
		}
	}


	/**
	* getoperator 
	* This setting enables the user to reach an operator during the time the voicemail message is being recorded, or once a voicemail message has been left, if the review option has been set to yes.  This setting takes a yes or no value. The operator must be specified at extension 'o' in extensions.conf. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	**/
	public Boolean getOperator(){		return  operator;
	}
	/**
	*setoperator 
	*/
	public void setOperator(Boolean aoperator){
		if(aoperator==null){
		    changed = (this.operator!=null);
		    this.operator = null;	    
		}else{
			changed = aoperator.equals(this.operator);
			this.operator=aoperator;
		}
	}


	/**
	* getsaycid 
	* Read back caller's telephone number prior to playing the incoming message, and just after announcing the date and time the message was left. This setting takes a yes or no value. If the administrator wants the caller's phone number to be heard prior to playing back a voicemail message, this option should be set  to yes. The default value for saycid is no. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	**/
	public Boolean getSaycid(){		return  saycid;
	}
	/**
	*setsaycid 
	*/
	public void setSaycid(Boolean asaycid){
		if(asaycid==null){
		    changed = (this.saycid!=null);
		    this.saycid = null;	    
		}else{
			changed = asaycid.equals(this.saycid);
			this.saycid=asaycid;
		}
	}


	/**
	* getdialout 
	* Specify a context to be used from the &quot;place an outgoing call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	**/
	public String getDialout(){		return  dialout;
	}
	/**
	*setdialout 
	*/
	public void setDialout(String adialout){
		if(adialout==null){
		    changed = (this.dialout!=null);
		    this.dialout = null;	    
		}else{
			changed = adialout.equals(this.dialout);
			this.dialout=adialout;
		}
	}


	/**
	* getcallback 
	* Specify a context to be used from the &quot;return phone call&quot;  feature in the advanced voicemail features menu. This setting takes a string value set to the outgoing context to be used. The default value for this setting is an empty string. This setting is only available in versions of Asterisk with advanced voicemail feature support.
	**/
	public String getCallback(){		return  callback;
	}
	/**
	*setcallback 
	*/
	public void setCallback(String acallback){
		if(acallback==null){
		    changed = (this.callback!=null);
		    this.callback = null;	    
		}else{
			changed = acallback.equals(this.callback);
			this.callback=acallback;
		}
	}


	/**
	* getdbuser 
	* Specify the Mysql database user name for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	**/
	public String getDbuser(){		return  dbuser;
	}
	/**
	*setdbuser 
	*/
	public void setDbuser(String adbuser){
		if(adbuser==null){
		    changed = (this.dbuser!=null);
		    this.dbuser = null;	    
		}else{
			changed = adbuser.equals(this.dbuser);
			this.dbuser=adbuser;
		}
	}


	/**
	* getdbpass 
	* Specify the Mysql database password for the voicemail application to use. The value is a string. The default value is &quot;test&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	**/
	public String getDbpass(){		return  dbpass;
	}
	/**
	*setdbpass 
	*/
	public void setDbpass(String adbpass){
		if(adbpass==null){
		    changed = (this.dbpass!=null);
		    this.dbpass = null;	    
		}else{
			changed = adbpass.equals(this.dbpass);
			this.dbpass=adbpass;
		}
	}


	/**
	* getdbhost 
	* Specify the Mysql database server hostname for the voicemail application to use. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	**/
	public String getDbhost(){		return  dbhost;
	}
	/**
	*setdbhost 
	*/
	public void setDbhost(String adbhost){
		if(adbhost==null){
		    changed = (this.dbhost!=null);
		    this.dbhost = null;	    
		}else{
			changed = adbhost.equals(this.dbhost);
			this.dbhost=adbhost;
		}
	}


	/**
	* getdbname 
	* Specify the Mysql database name.  The value is a string. The default value is &quot;vmdb&quot;. Note that Asterisk has to be compiled for Mysql support for this option to be meaningful.
	**/
	public String getDbname(){		return  dbname;
	}
	/**
	*setdbname 
	*/
	public void setDbname(String adbname){
		if(adbname==null){
		    changed = (this.dbname!=null);
		    this.dbname = null;	    
		}else{
			changed = adbname.equals(this.dbname);
			this.dbname=adbname;
		}
	}


	/**
	* getdboption 
	* Specify the Postgres database option. The value is a string. The default value is an empty string. Note that Asterisk has to be compiled for Postgres support for this option to be meaningfu1, and this option must be specified if Postgres support is enabled.
	**/
	public String getDboption(){		return  dboption;
	}
	/**
	*setdboption 
	*/
	public void setDboption(String adboption){
		if(adboption==null){
		    changed = (this.dboption!=null);
		    this.dboption = null;	    
		}else{
			changed = adboption.equals(this.dboption);
			this.dboption=adboption;
		}
	}


	/**
	* getpbxskip 
	* This setting changes the <i>Subject:</i> line in a voicemail notification message. This setting takes a yes or no value.  The default value is no. When set to yes the <i>Subject:</i> line will read &quot;Subject: New message <i>M</i> in mailbox <i>B</i>&quot;. When set to no the <i>Subject:</i> line will read &quot;Subject: [PBX]: New message <i>M</i> in mailbox <i>B</i>&quot;.
	**/
	public String getPbxskip(){		return  pbxskip;
	}
	/**
	*setpbxskip 
	*/
	public void setPbxskip(String apbxskip){
		if(apbxskip==null){
		    changed = (this.pbxskip!=null);
		    this.pbxskip = null;	    
		}else{
			changed = apbxskip.equals(this.pbxskip);
			this.pbxskip=apbxskip;
		}
	}


	/**
	* getfromstring 
	* This setting allows the adminstrator to override a portion of the From: line in the voicemail notification message. By default, Asterisk sends the string &quot;From: Asterisk PBX &lt;who&gt;.  The &quot;Asterisk PBX&quot; portion of the From: line can be overridden by specifying your own string as the value for this setting.  One might use this  to customize the voicemail notification message and/or remove the reference to &quot;Asterisk PBX&quot;.
	**/
	public String getFromstring(){		return  fromstring;
	}
	/**
	*setfromstring 
	*/
	public void setFromstring(String afromstring){
		if(afromstring==null){
		    changed = (this.fromstring!=null);
		    this.fromstring = null;	    
		}else{
			changed = afromstring.equals(this.fromstring);
			this.fromstring=afromstring;
		}
	}


	/**
	* getemailsubject 
	* This setting completely overrides <i>Subject:</i> line in the voicemail notification message, and substitutes its own text in place of it. The value passed is a string containing the text to send in place of the <i>Subject:</i> line.
	**/
	public String getEmailsubject(){		return  emailsubject;
	}
	/**
	*setemailsubject 
	*/
	public void setEmailsubject(String aemailsubject){
		if(aemailsubject==null){
		    changed = (this.emailsubject!=null);
		    this.emailsubject = null;	    
		}else{
			changed = aemailsubject.equals(this.emailsubject);
			this.emailsubject=aemailsubject;
		}
	}


	/**
	* getemailbody 
	* This setting overrides the normal message text seen in the body of a voicemail notification message.  It also supports variable substitution which can be used to make the message more meaningful. The workings of variable substitution may be covered in a separate section in a future version of this document.
	**/
	public String getEmailbody(){		return  emailbody;
	}
	/**
	*setemailbody 
	*/
	public void setEmailbody(String aemailbody){
		if(aemailbody==null){
		    changed = (this.emailbody!=null);
		    this.emailbody = null;	    
		}else{
			changed = aemailbody.equals(this.emailbody);
			this.emailbody=aemailbody;
		}
	}


	/**
	* getexitcontext 
	* Optional context to drop the user into after he/she has pressed * or 0 to exit voicemail
	**/
	public String getExitcontext(){		return  exitcontext;
	}
	/**
	*setexitcontext 
	*/
	public void setExitcontext(String aexitcontext){
		if(aexitcontext==null){
		    changed = (this.exitcontext!=null);
		    this.exitcontext = null;	    
		}else{
			changed = aexitcontext.equals(this.exitcontext);
			this.exitcontext=aexitcontext;
		}
	}


	/**
	* getnextaftercmd 
	* If set to &quot;yes,&quot; after deleting a voicemail message, the system will automatically play the next message.
	**/
	public String getNextaftercmd(){		return  nextaftercmd;
	}
	/**
	*setnextaftercmd 
	*/
	public void setNextaftercmd(String anextaftercmd){
		if(anextaftercmd==null){
		    changed = (this.nextaftercmd!=null);
		    this.nextaftercmd = null;	    
		}else{
			changed = anextaftercmd.equals(this.nextaftercmd);
			this.nextaftercmd=anextaftercmd;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("attach=")
		.append(attach)
		.append(",")
		.append("delete=")
		.append(delete)
		.append(",")
		.append("mailcmd=")
		.append(mailcmd)
		.append(",")
		.append("maxsilence=")
		.append(maxsilence)
		.append(",")
		.append("envelope=")
		.append(envelope)
		.append(",")
		.append("externnotify=")
		.append(externnotify)
		.append(",")
		.append("silencethreshold=")
		.append(silencethreshold)
		.append(",")
		.append("serveremail=")
		.append(serveremail)
		.append(",")
		.append("maxmessage=")
		.append(maxmessage)
		.append(",")
		.append("minmessage=")
		.append(minmessage)
		.append(",")
		.append("format=")
		.append(format)
		.append(",")
		.append("maxgreet=")
		.append(maxgreet)
		.append(",")
		.append("skipms=")
		.append(skipms)
		.append(",")
		.append("maxlogins=")
		.append(maxlogins)
		.append(",")
		.append("cidinternalcontexts=")
		.append(cidinternalcontexts)
		.append(",")
		.append("review=")
		.append(review)
		.append(",")
		.append("operator=")
		.append(operator)
		.append(",")
		.append("saycid=")
		.append(saycid)
		.append(",")
		.append("dialout=")
		.append(dialout)
		.append(",")
		.append("callback=")
		.append(callback)
		.append(",")
		.append("dbuser=")
		.append(dbuser)
		.append(",")
		.append("dbpass=")
		.append(dbpass)
		.append(",")
		.append("dbhost=")
		.append(dbhost)
		.append(",")
		.append("dbname=")
		.append(dbname)
		.append(",")
		.append("dboption=")
		.append(dboption)
		.append(",")
		.append("pbxskip=")
		.append(pbxskip)
		.append(",")
		.append("fromstring=")
		.append(fromstring)
		.append(",")
		.append("emailsubject=")
		.append(emailsubject)
		.append(",")
		.append("emailbody=")
		.append(emailbody)
		.append(",")
		.append("exitcontext=")
		.append(exitcontext)
		.append(",")
		.append("nextaftercmd=")
		.append(nextaftercmd)
    			.append("]");

		return sb.toString();		
	}}