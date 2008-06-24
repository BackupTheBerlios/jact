package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Exec<br>
 * Allows an arbitrary application to be invoked even when not hardcoded into the dialplan. Returns whatever value the app returns or -2 when the app cannot be found.
 * </p>
 * Created : Sun Jul 09 18:50:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Exec.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Exec extends PbxApplication implements IExec{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Exec
	**/
	public Exec(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Exec
	**/
	public Exec( String aappname, String aarguments){
		super();
	
		this.arguments = aarguments;	
		this.appname = aappname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Exec object){
		this.arguments = object.arguments;	
		this.appname = object.appname;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String arguments;
	public static final String VALUEID_ARGUMENTS="arguments" ;

    /**   **/
	protected String appname;
	public static final String VALUEID_APPNAME="appname" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ARGUMENTS.equals(valueid)){
			return true;
		}
		if(VALUEID_APPNAME.equals(valueid)){
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
		if(VALUEID_ARGUMENTS.equals(valueid)){
			setArguments((String)data);
			return;
		}
		if(VALUEID_APPNAME.equals(valueid)){
			setAppname((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ARGUMENTS.equals(valueid)){
			return getArguments();
			
		}
		if(VALUEID_APPNAME.equals(valueid)){
			return getAppname();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getarguments 
	* 
	**/
	public String getArguments(){		return  arguments;
	}
	/**
	*setarguments 
	*/
	public void setArguments(String aarguments){
		if(aarguments==null){
		    changed = (this.arguments!=null);
		    this.arguments = null;	    
		}else{
			changed = aarguments.equals(this.arguments);
			this.arguments=aarguments;
		}
	}


	/**
	* getappname 
	* 
	**/
	public String getAppname(){		return  appname;
	}
	/**
	*setappname 
	*/
	public void setAppname(String aappname){
		if(aappname==null){
		    changed = (this.appname!=null);
		    this.appname = null;	    
		}else{
			changed = aappname.equals(this.appname);
			this.appname=aappname;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Exec, ")		
		//.append("arguments=")
		.append(arguments)
		.append(",")
		//.append("appname=")
		.append(appname)
    			.append("");

		return sb.toString();		
	}
}