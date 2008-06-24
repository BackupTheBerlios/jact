package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Extension<br>
 * Extension names may be numbers, letters, or combinations thereof. If an extension name is prefixed by a '_' character, it is interpreted as a pattern rather than a literal.  In patterns, some characters have special meanings:
 * </p>
 * Created : Fri May 26 17:18:26 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Extension.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Extension extends AbstractSimpleDataClass implements IExtension{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Extension
	**/
	public Extension(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Extension
	**/
	public Extension( String aexten, Integer apriority, PbxApplication aapplication){
		super();
	
		this.exten = aexten;	
		this.priority = apriority;	
		this.application = aapplication;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Extension object){
		this.exten = object.exten;	
		this.priority = object.priority;	
		this.application = object.application;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  extension is the label of the extension, and can be either a literal constant string (alphanumeric plus a few special symols allowed) or a dynamically evaluated pattern (see below) to match many possible phone numbers, for example. Every command line that is part of a given extensions has this same label. **/
	protected String exten;
	public static final String VALUEID_EXTEN="exten" ;

    /**  priority is usually an integer (see note, however). It's just a sequence number for each command line of an extension. The first executable command of an extensions has the priority "1", so when Asterisk transfers a call to an extension, it will look for a command with priority 1. If there is not a line with a priority of 1, then the extension will not match the dialed number. After executing the priority 1 command, Asterisk will increment the priority to "2" unless the command itself determines the next priority to be executed. If this next priority is not defined in the extension, Asterisk finishes processing for this extension, even if there exists another command with a priority higher than the missing one. **/
	protected Integer priority;
	public static final String VALUEID_PRIORITY="priority" ;

    /**  command is the name of the command (also called an "application") to execute. **/
	protected PbxApplication application;
	public static final String VALUEID_APPLICATION="application" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
			return true;
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			return true;
		}
		if(VALUEID_APPLICATION.equals(valueid)){
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
		if(VALUEID_EXTEN.equals(valueid)){
			setExten((String)data);
			return;
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			if(data instanceof String){
		        setPriority(new Integer((String)data));
		        return;
		    }
			setPriority((Integer)data);
			return;
		}
		if(VALUEID_APPLICATION.equals(valueid)){
			if(data instanceof String){
		        setApplication(new PbxApplication((String)data));
		        return;
		    }
			setApplication((PbxApplication)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
			return getExten();
			
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			return getPriority();
			
		}
		if(VALUEID_APPLICATION.equals(valueid)){
			return getApplication();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getexten 
	* extension is the label of the extension, and can be either a literal constant string (alphanumeric plus a few special symols allowed) or a dynamically evaluated pattern (see below) to match many possible phone numbers, for example. Every command line that is part of a given extensions has this same label.
	**/
	public String getExten(){		return  exten;
	}
	/**
	*setexten 
	*/
	public void setExten(String aexten){
		if(aexten==null){
		    changed = (this.exten!=null);
		    this.exten = null;	    
		}else{
			changed = aexten.equals(this.exten);
			this.exten=aexten;
		}
	}


	/**
	* getpriority 
	* priority is usually an integer (see note, however). It's just a sequence number for each command line of an extension. The first executable command of an extensions has the priority "1", so when Asterisk transfers a call to an extension, it will look for a command with priority 1. If there is not a line with a priority of 1, then the extension will not match the dialed number. After executing the priority 1 command, Asterisk will increment the priority to "2" unless the command itself determines the next priority to be executed. If this next priority is not defined in the extension, Asterisk finishes processing for this extension, even if there exists another command with a priority higher than the missing one.
	**/
	public Integer getPriority(){		return  priority;
	}
	/**
	*setpriority 
	*/
	public void setPriority(Integer apriority){
		if(apriority==null){
		    changed = (this.priority!=null);
		    this.priority = null;	    
		}else{
			changed = apriority.equals(this.priority);
			this.priority=apriority;
		}
	}


	/**
	* getapplication 
	* command is the name of the command (also called an "application") to execute.
	**/
	public PbxApplication getApplication(){		return  application;
	}
	/**
	*setapplication 
	*/
	public void setApplication(PbxApplication aapplication){
		if(aapplication==null){
		    changed = (this.application!=null);
		    this.application = null;	    
		}else{
			changed = aapplication.equals(this.application);
			this.application=aapplication;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("exten=")
		.append(exten)
		.append(",")
		.append("priority=")
		.append(priority)
		.append(",")
		.append("application=")
		.append(application)
    			.append("]");

		return sb.toString();		
	}}