package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetAMAFlags<br>
 * Set the channel AMA Flags for billing purposes. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:51:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAMAFlags.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetAMAFlags extends PbxApplication implements ISetAMAFlags{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetAMAFlags
	**/
	public SetAMAFlags(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetAMAFlags
	**/
	public SetAMAFlags( String aflag){
		super();
	
		this.flag = aflag;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetAMAFlags object){
		this.flag = object.flag;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String flag;
	public static final String VALUEID_FLAG="flag" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FLAG.equals(valueid)){
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
		if(VALUEID_FLAG.equals(valueid)){
			setFlag((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FLAG.equals(valueid)){
			return getFlag();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getflag 
	* 
	**/
	public String getFlag(){		return  flag;
	}
	/**
	*setflag 
	*/
	public void setFlag(String aflag){
		if(aflag==null){
		    changed = (this.flag!=null);
		    this.flag = null;	    
		}else{
			changed = aflag.equals(this.flag);
			this.flag=aflag;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetAMAFlags, ")		
		//.append("flag=")
		.append(flag)
    			.append("");

		return sb.toString();		
	}
}