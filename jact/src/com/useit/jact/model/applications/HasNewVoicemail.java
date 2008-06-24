package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * HasNewVoicemail<br>
 * Branches to priority + 101, if there is voicemail in folder 'folder' or INBOX. if folder is not specified. Optionally sets <varname> to the number of messages in that folder.
 * </p>
 * Created : Sun Jul 09 18:50:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: HasNewVoicemail.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class HasNewVoicemail extends PbxApplication implements IHasNewVoicemail{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für HasNewVoicemail
	**/
	public HasNewVoicemail(){
		super();
	
	}
	/**
	* komplexer Konstruktor für HasNewVoicemail
	**/
	public HasNewVoicemail( String avmbox, String afolder, String acontext, String avarname){
		super();
	
		this.vmbox = avmbox;	
		this.folder = afolder;	
		this.context = acontext;	
		this.varname = avarname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(HasNewVoicemail object){
		this.vmbox = object.vmbox;	
		this.folder = object.folder;	
		this.context = object.context;	
		this.varname = object.varname;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String vmbox;
	public static final String VALUEID_VMBOX="vmbox" ;

    /**   **/
	protected String folder;
	public static final String VALUEID_FOLDER="folder" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

    /**   **/
	protected String varname;
	public static final String VALUEID_VARNAME="varname" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_VMBOX.equals(valueid)){
			return true;
		}
		if(VALUEID_FOLDER.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_VARNAME.equals(valueid)){
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
		if(VALUEID_VMBOX.equals(valueid)){
			setVmbox((String)data);
			return;
		}
		if(VALUEID_FOLDER.equals(valueid)){
			setFolder((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
			return;
		}
		if(VALUEID_VARNAME.equals(valueid)){
			setVarname((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_VMBOX.equals(valueid)){
			return getVmbox();
			
		}
		if(VALUEID_FOLDER.equals(valueid)){
			return getFolder();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_VARNAME.equals(valueid)){
			return getVarname();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getvmbox 
	* 
	**/
	public String getVmbox(){		return  vmbox;
	}
	/**
	*setvmbox 
	*/
	public void setVmbox(String avmbox){
		if(avmbox==null){
		    changed = (this.vmbox!=null);
		    this.vmbox = null;	    
		}else{
			changed = avmbox.equals(this.vmbox);
			this.vmbox=avmbox;
		}
	}


	/**
	* getfolder 
	* 
	**/
	public String getFolder(){		return  folder;
	}
	/**
	*setfolder 
	*/
	public void setFolder(String afolder){
		if(afolder==null){
		    changed = (this.folder!=null);
		    this.folder = null;	    
		}else{
			changed = afolder.equals(this.folder);
			this.folder=afolder;
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
	* getvarname 
	* 
	**/
	public String getVarname(){		return  varname;
	}
	/**
	*setvarname 
	*/
	public void setVarname(String avarname){
		if(avarname==null){
		    changed = (this.varname!=null);
		    this.varname = null;	    
		}else{
			changed = avarname.equals(this.varname);
			this.varname=avarname;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("HasNewVoicemail, ")		
		//.append("vmbox=")
		.append(vmbox)
		.append(",")
		//.append("folder=")
		.append(folder)
		.append(",")
		//.append("context=")
		.append(context)
		.append(",")
		//.append("varname=")
		.append(varname)
    			.append("");

		return sb.toString();		
	}
}