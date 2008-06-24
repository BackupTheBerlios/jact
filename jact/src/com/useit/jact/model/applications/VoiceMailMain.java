package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * VoiceMailMain<br>
 * Enters the main voicemail system for the checking of voicemail. The mailbox can be passed as the option, which will stop the voicemail system from prompting the user for the mailbox. If the mailbox is preceded by 's' then the password check will be skipped. If the mailbox is preceded by 'p' then the supplied mailbox is prepended to the user's entry and the resulting string is used as the mailbox number. This is useful for virtual hosting of voicemail boxes. If a context is specified, logins are considered in that voicemail context only. Returns -1 if the user hangs up or 0 otherwise.
 * </p>
 * Created : Sun Jul 09 18:51:44 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMailMain.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class VoiceMailMain extends PbxApplication implements IVoiceMailMain{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für VoiceMailMain
	**/
	public VoiceMailMain(){
		super();
	
	}
	/**
	* komplexer Konstruktor für VoiceMailMain
	**/
	public VoiceMailMain( String as, String amailbox, String acontext){
		super();
	
		this.s = as;	
		this.mailbox = amailbox;	
		this.context = acontext;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(VoiceMailMain object){
		this.s = object.s;	
		this.mailbox = object.mailbox;	
		this.context = object.context;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String s;
	public static final String VALUEID_S="s" ;

    /**   **/
	protected String mailbox;
	public static final String VALUEID_MAILBOX="mailbox" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_S.equals(valueid)){
			return true;
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
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
		if(VALUEID_S.equals(valueid)){
			setS((String)data);
			return;
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			setMailbox((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_S.equals(valueid)){
			return getS();
			
		}
		if(VALUEID_MAILBOX.equals(valueid)){
			return getMailbox();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gets 
	* 
	**/
	public String getS(){		return  s;
	}
	/**
	*sets 
	*/
	public void setS(String as){
		if(as==null){
		    changed = (this.s!=null);
		    this.s = null;	    
		}else{
			changed = as.equals(this.s);
			this.s=as;
		}
	}


	/**
	* getmailbox 
	* 
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
	* getcontext 
	* 
	**/
	public String getContext(){		return  context;
	}
	/**
	*setcontext 
	*/
	public void setContext(String acontext){
		if(acontext==null){
		    changed = (this.context!=null);
		    this.context = null;	    
		}else{
			changed = acontext.equals(this.context);
			this.context=acontext;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("VoiceMailMain, ")		
		//.append("s=")
		.append(s)
		.append(",")
		//.append("mailbox=")
		.append(mailbox)
		.append(",")
		//.append("context=")
		.append(context)
    			.append("");

		return sb.toString();		
	}
}