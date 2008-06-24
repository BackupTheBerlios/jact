package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * DumpChan<br>
 * Displays information on channel and listing of all channel variables. If min_verbose_level is specified, output is only displayed when the verbose level is currently set to that number or greater. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:50:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DumpChan.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class DumpChan extends PbxApplication implements IDumpChan{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für DumpChan
	**/
	public DumpChan(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DumpChan
	**/
	public DumpChan( String amin_verbose_level){
		super();
	
		this.min_verbose_level = amin_verbose_level;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(DumpChan object){
		this.min_verbose_level = object.min_verbose_level;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String min_verbose_level;
	public static final String VALUEID_MIN_VERBOSE_LEVEL="min_verbose_level" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MIN_VERBOSE_LEVEL.equals(valueid)){
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
		if(VALUEID_MIN_VERBOSE_LEVEL.equals(valueid)){
			setMin_verbose_level((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_MIN_VERBOSE_LEVEL.equals(valueid)){
			return getMin_verbose_level();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmin_verbose_level 
	* 
	**/
	public String getMin_verbose_level(){		return  min_verbose_level;
	}
	/**
	*setmin_verbose_level 
	*/
	public void setMin_verbose_level(String amin_verbose_level){
		if(amin_verbose_level==null){
		    changed = (this.min_verbose_level!=null);
		    this.min_verbose_level = null;	    
		}else{
			changed = amin_verbose_level.equals(this.min_verbose_level);
			this.min_verbose_level=amin_verbose_level;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("DumpChan, ")		
		//.append("min_verbose_level=")
		.append(min_verbose_level)
    			.append("");

		return sb.toString();		
	}
}