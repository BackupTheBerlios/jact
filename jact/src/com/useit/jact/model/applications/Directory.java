package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Directory<br>
 * Presents the user with a directory of extensions from which they may select by name. The list of names  and extensions is discovered from voicemail.conf. The vm-context argument is required, and specifies the context of voicemail.conf to use. The dial-context is the context to use for dialing the users, and defaults to the vm-context if unspecified. The 'f' option causes the directory to match based on the first name in voicemail.conf instead of the last name. Returns 0 unless the user hangs up. It also sets up the channel on exit to enter the extension the user selected. If the user enters '0' and there exists an extension 'o' in the current context, the directory will exit with 0 and call control will resume at that extension. Entering '*' will exit similarly, but to the 'a' extension, much like app_voicemail's behavior.
 * </p>
 * Created : Sun Jul 09 18:49:30 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Directory.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class Directory extends PbxApplication implements IDirectory{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Directory
	**/
	public Directory(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Directory
	**/
	public Directory( String avm, String adial, String acontext, String aoptions){
		super();
	
		this.vm = avm;	
		this.dial = adial;	
		this.context = acontext;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Directory object){
		this.vm = object.vm;	
		this.dial = object.dial;	
		this.context = object.context;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String vm;
	public static final String VALUEID_VM="vm" ;

    /**   **/
	protected String dial;
	public static final String VALUEID_DIAL="dial" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_VM.equals(valueid)){
			return true;
		}
		if(VALUEID_DIAL.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
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
		if(VALUEID_VM.equals(valueid)){
			setVm((String)data);
			return;
		}
		if(VALUEID_DIAL.equals(valueid)){
			setDial((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_VM.equals(valueid)){
			return getVm();
			
		}
		if(VALUEID_DIAL.equals(valueid)){
			return getDial();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getvm 
	* 
	**/
	public String getVm(){		return  vm;
	}
	/**
	*setvm 
	*/
	public void setVm(String avm){
		if(avm==null){
		    changed = (this.vm!=null);
		    this.vm = null;	    
		}else{
			changed = avm.equals(this.vm);
			this.vm=avm;
		}
	}


	/**
	* getdial 
	* 
	**/
	public String getDial(){		return  dial;
	}
	/**
	*setdial 
	*/
	public void setDial(String adial){
		if(adial==null){
		    changed = (this.dial!=null);
		    this.dial = null;	    
		}else{
			changed = adial.equals(this.dial);
			this.dial=adial;
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
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Directory, ")		
		//.append("vm=")
		.append(vm)
		.append(",")
		//.append("dial=")
		.append(dial)
		.append(",")
		//.append("context=")
		.append(context)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}