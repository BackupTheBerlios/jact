package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * VMAuthenticate<br>
 * Behaves identically to the Authenticate application, with the exception that the passwords are taken from voicemail.conf.  If the mailbox is specified, only that mailbox's password will be considered valid. If the mailbox is not specified, the channel variable AUTH_MAILBOX will be set with the authenticated mailbox.
 * </p>
 * Created : Sun Jul 09 18:49:47 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VMAuthenticate.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class VMAuthenticate extends PbxApplication implements IVMAuthenticate{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r VMAuthenticate
	**/
	public VMAuthenticate(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r VMAuthenticate
	**/
	public VMAuthenticate( String amailbox, String acontext){
		super();
	
		this.mailbox = amailbox;	
		this.context = acontext;	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(VMAuthenticate object){
		this.mailbox = object.mailbox;	
		this.context = object.context;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String mailbox;
	public static final String VALUEID_MAILBOX="mailbox" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

	/**
	 * �berpr�ft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
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
	 * gibt einen Wert by Vauleid zur�ck
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
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
		sb.append("VMAuthenticate, ")		
		//.append("mailbox=")
		.append(mailbox)
		.append(",")
		//.append("context=")
		.append(context)
    			.append("");

		return sb.toString();		
	}
}