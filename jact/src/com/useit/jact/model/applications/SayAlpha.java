package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SayAlpha<br>
 * Spells the passed string
 * </p>
 * Created : Sun Jul 09 18:51:43 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayAlpha.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SayAlpha extends PbxApplication implements ISayAlpha{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SayAlpha
	**/
	public SayAlpha(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayAlpha
	**/
	public SayAlpha( String astring){
		super();
	
		this.string = astring;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SayAlpha object){
		this.string = object.string;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String string;
	public static final String VALUEID_STRING="string" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_STRING.equals(valueid)){
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
		if(VALUEID_STRING.equals(valueid)){
			setString((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_STRING.equals(valueid)){
			return getString();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getstring 
	* 
	**/
	public String getString(){		return  string;
	}
	/**
	*setstring 
	*/
	public void setString(String astring){
		if(astring==null){
		    changed = (this.string!=null);
		    this.string = null;	    
		}else{
			changed = astring.equals(this.string);
			this.string=astring;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SayAlpha, ")		
		//.append("string=")
		.append(string)
    			.append("");

		return sb.toString();		
	}
}