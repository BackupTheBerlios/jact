package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ChangeMonitor<br>
 * Changes monitoring filename of a channel. Has no effect if the channel is not monitored The argument is the new filename base to use for monitoring this channel.
 * </p>
 * Created : Sun Jul 09 18:48:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ChangeMonitor.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ChangeMonitor extends PbxApplication implements IChangeMonitor{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ChangeMonitor
	**/
	public ChangeMonitor(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ChangeMonitor
	**/
	public ChangeMonitor( String afilename_base){
		super();
	
		this.filename_base = afilename_base;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ChangeMonitor object){
		this.filename_base = object.filename_base;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String filename_base;
	public static final String VALUEID_FILENAME_BASE="filename_base" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME_BASE.equals(valueid)){
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
		if(VALUEID_FILENAME_BASE.equals(valueid)){
			setFilename_base((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FILENAME_BASE.equals(valueid)){
			return getFilename_base();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfilename_base 
	* 
	**/
	public String getFilename_base(){		return  filename_base;
	}
	/**
	*setfilename_base 
	*/
	public void setFilename_base(String afilename_base){
		if(afilename_base==null){
		    changed = (this.filename_base!=null);
		    this.filename_base = null;	    
		}else{
			changed = afilename_base.equals(this.filename_base);
			this.filename_base=afilename_base;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ChangeMonitor, ")		
		//.append("filename_base=")
		.append(filename_base)
    			.append("");

		return sb.toString();		
	}
}