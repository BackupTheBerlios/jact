package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * VoiceMail<br>
 * Leavesvoicemail for a given extension (must be configured in voicemail.conf).  If the extension is preceded by  * 's' then instructions for leaving the message will be skipped. * 'u' then the "unavailable" message will be played.  (/var/lib/asterisk/sounds/vm/<exten>/unavail) if it exists. * 'b' then the the busy message will be played (that is, busy instead of unavail). If the caller presses '0' (zero) during the prompt, the call jumps to extension 'o' in the current context. If the caller presses '*' during the prompt, the call jumps to extension 'a' in the current context. If the requested mailbox does not exist, and there exists a priority n + 101, then that priority will be taken next. When multiple mailboxes are specified, the unavailable or busy message will be taken from the first mailbox specified. Returns -1 on error or mailbox not found, or if the user hangs up. Otherwise, it returns 0.
 * </p>
 * Created : Sun Jul 09 18:50:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoiceMail.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class VoiceMail extends PbxApplication implements IVoiceMail{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für VoiceMail
	**/
	public VoiceMail(){
		super();
	
	}
	/**
	* komplexer Konstruktor für VoiceMail
	**/
	public VoiceMail( String as, String au, String ab, String aextension, String acontext){
		super();
	
		this.s = as;	
		this.u = au;	
		this.b = ab;	
		this.extension = aextension;	
		this.context = acontext;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(VoiceMail object){
		this.s = object.s;	
		this.u = object.u;	
		this.b = object.b;	
		this.extension = object.extension;	
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
	protected String u;
	public static final String VALUEID_U="u" ;

    /**   **/
	protected String b;
	public static final String VALUEID_B="b" ;

    /**   **/
	protected String extension;
	public static final String VALUEID_EXTENSION="extension" ;

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
		if(VALUEID_U.equals(valueid)){
			return true;
		}
		if(VALUEID_B.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
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
		if(VALUEID_U.equals(valueid)){
			setU((String)data);
			return;
		}
		if(VALUEID_B.equals(valueid)){
			setB((String)data);
			return;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			setExtension((String)data);
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
		if(VALUEID_U.equals(valueid)){
			return getU();
			
		}
		if(VALUEID_B.equals(valueid)){
			return getB();
			
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return getExtension();
			
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
	* getu 
	* 
	**/
	public String getU(){		return  u;
	}
	/**
	*setu 
	*/
	public void setU(String au){
		if(au==null){
		    changed = (this.u!=null);
		    this.u = null;	    
		}else{
			changed = au.equals(this.u);
			this.u=au;
		}
	}


	/**
	* getb 
	* 
	**/
	public String getB(){		return  b;
	}
	/**
	*setb 
	*/
	public void setB(String ab){
		if(ab==null){
		    changed = (this.b!=null);
		    this.b = null;	    
		}else{
			changed = ab.equals(this.b);
			this.b=ab;
		}
	}


	/**
	* getextension 
	* 
	**/
	public String getExtension(){		return  extension;
	}
	/**
	*setextension 
	*/
	public void setExtension(String aextension){
		if(aextension==null){
		    changed = (this.extension!=null);
		    this.extension = null;	    
		}else{
			changed = aextension.equals(this.extension);
			this.extension=aextension;
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
		sb.append("VoiceMail, ")		
		//.append("s=")
		.append(s)
		.append(",")
		//.append("u=")
		.append(u)
		.append(",")
		//.append("b=")
		.append(b)
		.append(",")
		//.append("extension=")
		.append(extension)
		.append(",")
		//.append("context=")
		.append(context)
    			.append("");

		return sb.toString();		
	}
}