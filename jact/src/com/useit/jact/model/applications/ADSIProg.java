package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ADSIProg<br>
 * Programs an ADSI Phone with the given script. If none is specified, the default is used. Returns 0 unless CPE is hungup.
 * </p>
 * Created : Sun Jul 09 18:50:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ADSIProg.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ADSIProg extends PbxApplication implements IADSIProg{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ADSIProg
	**/
	public ADSIProg(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ADSIProg
	**/
	public ADSIProg( String ascript){
		super();
	
		this.script = ascript;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ADSIProg object){
		this.script = object.script;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String script;
	public static final String VALUEID_SCRIPT="script" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SCRIPT.equals(valueid)){
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
		if(VALUEID_SCRIPT.equals(valueid)){
			setScript((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SCRIPT.equals(valueid)){
			return getScript();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getscript 
	* 
	**/
	public String getScript(){		return  script;
	}
	/**
	*setscript 
	*/
	public void setScript(String ascript){
		if(ascript==null){
		    changed = (this.script!=null);
		    this.script = null;	    
		}else{
			changed = ascript.equals(this.script);
			this.script=ascript;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ADSIProg, ")		
		//.append("script=")
		.append(script)
    			.append("");

		return sb.toString();		
	}
}