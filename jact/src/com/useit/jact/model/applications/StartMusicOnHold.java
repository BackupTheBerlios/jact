package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * StartMusicOnHold<br>
 * Starts playing music on hold, uses default music class for channel. Starts playing music specified by class. If omitted, the default music source for the channel will be used. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StartMusicOnHold.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class StartMusicOnHold extends PbxApplication implements IStartMusicOnHold{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für StartMusicOnHold
	**/
	public StartMusicOnHold(){
		super();
	
	}
	/**
	* komplexer Konstruktor für StartMusicOnHold
	**/
	public StartMusicOnHold( String aclass_){
		super();
	
		this.class_ = aclass_;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(StartMusicOnHold object){
		this.class_ = object.class_;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String class_;
	public static final String VALUEID_CLASS_="class_" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CLASS_.equals(valueid)){
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
		if(VALUEID_CLASS_.equals(valueid)){
			setClass_((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CLASS_.equals(valueid)){
			return getClass_();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getclass_ 
	* 
	**/
	public String getClass_(){		return  class_;
	}
	/**
	*setclass_ 
	*/
	public void setClass_(String aclass_){
		if(aclass_==null){
		    changed = (this.class_!=null);
		    this.class_ = null;	    
		}else{
			changed = aclass_.equals(this.class_);
			this.class_=aclass_;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("StartMusicOnHold, ")		
		//.append("class_=")
		.append(class_)
    			.append("");

		return sb.toString();		
	}
}