package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Authenticate<br>
 * Requires a user to enter agiven password in order to continue execution. If the password begins with the '/' character, it is interpreted as a file which contains a list of valid passwords (1 per line). an optional set of opions may be provided by concatenating any of the following letters:  a - Set account code to the password that is entered  d - Interpret path as database key, not literal file  j - Support jumping to n+101  r - Remove database key upon successful entry (valid with 'd' only)  When using a database key, the value associated with the key can be anything. Returns 0 if the user enters a valid password within three tries, or -1 on hangup. If the priority n+101 exists and invalid authentication was entered, and the 'j' flag was specified, processing will jump to n+101 and 0 will be returned.
 * </p>
 * Created : Sun Jul 09 18:51:20 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Authenticate.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Authenticate extends PbxApplication implements IAuthenticate{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Authenticate
	**/
	public Authenticate(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Authenticate
	**/
	public Authenticate( String apassword, String aoptions){
		super();
	
		this.password = apassword;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Authenticate object){
		this.password = object.password;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String password;
	public static final String VALUEID_PASSWORD="password" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PASSWORD.equals(valueid)){
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
		if(VALUEID_PASSWORD.equals(valueid)){
			setPassword((String)data);
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
		if(VALUEID_PASSWORD.equals(valueid)){
			return getPassword();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getpassword 
	* 
	**/
	public String getPassword(){		return  password;
	}
	/**
	*setpassword 
	*/
	public void setPassword(String apassword){
		if(apassword==null){
		    changed = (this.password!=null);
		    this.password = null;	    
		}else{
			changed = apassword.equals(this.password);
			this.password=apassword;
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
		sb.append("Authenticate, ")		
		//.append("password=")
		.append(password)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}