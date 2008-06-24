package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetMusicOnHold<br>
 * Sets the default class for music on hold for a given channel. When music on hold is activated, this class will be used to select which music is played.
 * </p>
 * Created : Sun Jul 09 18:50:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetMusicOnHold.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetMusicOnHold extends PbxApplication implements ISetMusicOnHold{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetMusicOnHold
	**/
	public SetMusicOnHold(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetMusicOnHold
	**/
	public SetMusicOnHold( String aclass_){
		super();
	
		this.class_ = aclass_;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetMusicOnHold object){
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
		sb.append("SetMusicOnHold, ")		
		//.append("class_=")
		.append(class_)
    			.append("");

		return sb.toString();		
	}
}