package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MP3Player<br>
 * Executes mpg123 to play the given location which typically would be a filename o a URL. User can exit by pressing any key .Returns -1 on hangup or 0 otherwise.
 * </p>
 * Created : Sun Jul 09 18:48:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MP3Player.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class MP3Player extends PbxApplication implements IMP3Player{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MP3Player
	**/
	public MP3Player(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MP3Player
	**/
	public MP3Player( String alocation){
		super();
	
		this.location = alocation;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MP3Player object){
		this.location = object.location;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String location;
	public static final String VALUEID_LOCATION="location" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_LOCATION.equals(valueid)){
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
		if(VALUEID_LOCATION.equals(valueid)){
			setLocation((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_LOCATION.equals(valueid)){
			return getLocation();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getlocation 
	* 
	**/
	public String getLocation(){		return  location;
	}
	/**
	*setlocation 
	*/
	public void setLocation(String alocation){
		if(alocation==null){
		    changed = (this.location!=null);
		    this.location = null;	    
		}else{
			changed = alocation.equals(this.location);
			this.location=alocation;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MP3Player, ")		
		//.append("location=")
		.append(location)
    			.append("");

		return sb.toString();		
	}
}