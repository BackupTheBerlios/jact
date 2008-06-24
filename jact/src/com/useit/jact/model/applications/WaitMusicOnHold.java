package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * WaitMusicOnHold<br>
 * Plays hold music specified number of seconds. Returns 0 when done, or -1 on hangup. If no hold music is available, the delay will still occur with no sound.
 * </p>
 * Created : Sun Jul 09 18:51:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitMusicOnHold.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class WaitMusicOnHold extends PbxApplication implements IWaitMusicOnHold{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für WaitMusicOnHold
	**/
	public WaitMusicOnHold(){
		super();
	
	}
	/**
	* komplexer Konstruktor für WaitMusicOnHold
	**/
	public WaitMusicOnHold( String adelay){
		super();
	
		this.delay = adelay;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(WaitMusicOnHold object){
		this.delay = object.delay;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String delay;
	public static final String VALUEID_DELAY="delay" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DELAY.equals(valueid)){
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
		if(VALUEID_DELAY.equals(valueid)){
			setDelay((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DELAY.equals(valueid)){
			return getDelay();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdelay 
	* 
	**/
	public String getDelay(){		return  delay;
	}
	/**
	*setdelay 
	*/
	public void setDelay(String adelay){
		if(adelay==null){
		    changed = (this.delay!=null);
		    this.delay = null;	    
		}else{
			changed = adelay.equals(this.delay);
			this.delay=adelay;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("WaitMusicOnHold, ")		
		//.append("delay=")
		.append(delay)
    			.append("");

		return sb.toString();		
	}
}