package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * EnumLookup<br>
 * Looks up an extension via ENUM and sets the variable 'ENUM'. For VoIP URIs this variable will  look like 'TECHNOLOGY/URI' with the appropriate technology. Returns -1 on hangup, or 0 on completion regardless of whether the  lookup was successful.  Currently, the enumservices SIP, H323, IAX, IAX2 and TEL are recognized.  A good SIP, H323, IAX or IAX2 entry will result in normal priority handling,  whereas a good TEL entry will increase the priority by 51 (if existing). If the lookup was *not* successful and there exists a priority n + 101, then that priority will be taken next.
 * </p>
 * Created : Sun Jul 09 18:51:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: EnumLookup.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class EnumLookup extends PbxApplication implements IEnumLookup{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für EnumLookup
	**/
	public EnumLookup(){
		super();
	
	}
	/**
	* komplexer Konstruktor für EnumLookup
	**/
	public EnumLookup( String aexten){
		super();
	
		this.exten = aexten;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(EnumLookup object){
		this.exten = object.exten;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String exten;
	public static final String VALUEID_EXTEN="exten" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
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
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getexten 
	* 
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("EnumLookup, ")		
		//.append("exten=")
		.append(exten)
    			.append("");

		return sb.toString();		
	}
}