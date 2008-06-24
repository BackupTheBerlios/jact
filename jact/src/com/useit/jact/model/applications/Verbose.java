package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Verbose<br>
 * level must be an integer value. If not specified, defaults to 0. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:21 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Verbose.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Verbose extends PbxApplication implements IVerbose{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Verbose
	**/
	public Verbose(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Verbose
	**/
	public Verbose( String alevel, String amessage){
		super();
	
		this.level = alevel;	
		this.message = amessage;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Verbose object){
		this.level = object.level;	
		this.message = object.message;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String level;
	public static final String VALUEID_LEVEL="level" ;

    /**   **/
	protected String message;
	public static final String VALUEID_MESSAGE="message" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_LEVEL.equals(valueid)){
			return true;
		}
		if(VALUEID_MESSAGE.equals(valueid)){
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
		if(VALUEID_LEVEL.equals(valueid)){
			setLevel((String)data);
			return;
		}
		if(VALUEID_MESSAGE.equals(valueid)){
			setMessage((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_LEVEL.equals(valueid)){
			return getLevel();
			
		}
		if(VALUEID_MESSAGE.equals(valueid)){
			return getMessage();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getlevel 
	* 
	**/
	public String getLevel(){		return  level;
	}
	/**
	*setlevel 
	*/
	public void setLevel(String alevel){
		if(alevel==null){
		    changed = (this.level!=null);
		    this.level = null;	    
		}else{
			changed = alevel.equals(this.level);
			this.level=alevel;
		}
	}


	/**
	* getmessage 
	* 
	**/
	public String getMessage(){		return  message;
	}
	/**
	*setmessage 
	*/
	public void setMessage(String amessage){
		if(amessage==null){
		    changed = (this.message!=null);
		    this.message = null;	    
		}else{
			changed = amessage.equals(this.message);
			this.message=amessage;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Verbose, ")		
		//.append("level=")
		.append(level)
		.append(",")
		//.append("message=")
		.append(message)
    			.append("");

		return sb.toString();		
	}
}