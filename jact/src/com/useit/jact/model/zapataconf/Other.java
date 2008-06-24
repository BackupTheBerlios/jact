package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Other<br>
 * other stuff
 * </p>
 * Created : Fri May 26 14:32:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Other.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Other extends AbstractSimpleDataClass implements IOther{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Other
	**/
	public Other(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Other
	**/
	public Other( String amailbox, String agroup, String alanguage){
		super();
	
		this.mailbox = amailbox;	
		this.group = agroup;	
		this.language = alanguage;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Other object){
		this.mailbox = object.mailbox;	
		this.group = object.group;	
		this.language = object.language;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  If this option is defined for a channel, then when the handset is lifted, Asterisk will check the voicemail mailbox(es) specified here for new (unheard) messages. If there are any unheard messages in any of the mailboxes, Asterisk will use a stutter dialtone rather than the ordinary dialtone. On supported hardware, the message waiting light will also be activated ? this probably requires that you also set adsi=yes. Update: This option does NOT require ADSI. It will send a standard FSK tone down the line that lights up the MWI on any capable analog phone. The parameters to this option are one or more comma-separated mailbox numbers, as defined in voicemail.conf. **/
	protected String mailbox;
	public static final String VALUEID_MAILBOX="mailbox" ;

    /**  Allows you to group together a number of channels so that the Dial command will treat the group as a single channel. When Dial tries to make a call on a Zap group, the Zap channel module will use the first available (i.e. non-busy) channel in the group for the call. Multiple group memberships may be specified with commas, and to signify no group membership, the portion after the equals sign may be omitted. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups. **/
	protected String group;
	public static final String VALUEID_GROUP="group" ;

    /**  Each channel has a default language code that affects which language version of prerecorded sounds Asterisk uses for this channel. See Setting up a Multi-Language Asterisk Installation. The default is an empty string. **/
	protected String language;
	public static final String VALUEID_LANGUAGE="language" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MAILBOX.equals(valueid)){
			return true;
		}
		if(VALUEID_GROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
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
		if(VALUEID_GROUP.equals(valueid)){
			setGroup((String)data);
			return;
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			setLanguage((String)data);
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
		if(VALUEID_GROUP.equals(valueid)){
			return getGroup();
			
		}
		if(VALUEID_LANGUAGE.equals(valueid)){
			return getLanguage();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmailbox 
	* If this option is defined for a channel, then when the handset is lifted, Asterisk will check the voicemail mailbox(es) specified here for new (unheard) messages. If there are any unheard messages in any of the mailboxes, Asterisk will use a stutter dialtone rather than the ordinary dialtone. On supported hardware, the message waiting light will also be activated ? this probably requires that you also set adsi=yes. Update: This option does NOT require ADSI. It will send a standard FSK tone down the line that lights up the MWI on any capable analog phone. The parameters to this option are one or more comma-separated mailbox numbers, as defined in voicemail.conf.
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
	* getgroup 
	* Allows you to group together a number of channels so that the Dial command will treat the group as a single channel. When Dial tries to make a call on a Zap group, the Zap channel module will use the first available (i.e. non-busy) channel in the group for the call. Multiple group memberships may be specified with commas, and to signify no group membership, the portion after the equals sign may be omitted. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.
	**/
	public String getGroup(){		return  group;
	}
	/**
	*setgroup 
	*/
	public void setGroup(String agroup){
		if(agroup==null){
		    changed = (this.group!=null);
		    this.group = null;	    
		}else{
			changed = agroup.equals(this.group);
			this.group=agroup;
		}
	}


	/**
	* getlanguage 
	* Each channel has a default language code that affects which language version of prerecorded sounds Asterisk uses for this channel. See Setting up a Multi-Language Asterisk Installation. The default is an empty string.
	**/
	public String getLanguage(){		return  language;
	}
	/**
	*setlanguage 
	*/
	public void setLanguage(String alanguage){
		if(alanguage==null){
		    changed = (this.language!=null);
		    this.language = null;	    
		}else{
			changed = alanguage.equals(this.language);
			this.language=alanguage;
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
		.append("group=")
		.append(group)
		.append(",")
		.append("language=")
		.append(language)
    			.append("]");

		return sb.toString();		
	}}