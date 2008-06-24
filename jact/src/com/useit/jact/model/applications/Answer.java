package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Answer<br>
 * If the channel is ringing, answer it, otherwise do nothing.  If delay is specified, asterisk will pause execution for the specified amount of milliseconds if an answer is required, in order to give audio a chance to become ready. Returns 0 unless it tries to answer the channel and fails.
 * </p>
 * Created : Sun Jul 09 18:51:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Answer.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Answer extends PbxApplication implements IAnswer{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Answer
	**/
	public Answer(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Answer
	**/
	public Answer( String adelay){
		super();
	
		this.delay = adelay;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Answer object){
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
		sb.append("Answer, ")		
		//.append("delay=")
		.append(delay)
    			.append("");

		return sb.toString();		
	}
}