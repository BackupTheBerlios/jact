package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetLanguage<br>
 * Set the channel language to 'language'. This information is used for the syntax in generation of numbers, and to choose a natural language file when available.  For example, if language is set to 'fr' and the file 'demo-congrats' is  requested to be played, if the file 'fr/demo-congrats' exists, then it will play that file, and if not will play the normal 'demo-congrats'. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:51:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetLanguage.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetLanguage extends PbxApplication implements ISetLanguage{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetLanguage
	**/
	public SetLanguage(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetLanguage
	**/
	public SetLanguage( String alanguage){
		super();
	
		this.language = alanguage;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetLanguage object){
		this.language = object.language;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String language;
	public static final String VALUEID_LANGUAGE="language" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
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
		if(VALUEID_LANGUAGE.equals(valueid)){
			return getLanguage();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getlanguage 
	* 
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
		StringBuilder sb = new StringBuilder();
		sb.append("SetLanguage, ")		
		//.append("language=")
		.append(language)
    			.append("");

		return sb.toString();		
	}
}