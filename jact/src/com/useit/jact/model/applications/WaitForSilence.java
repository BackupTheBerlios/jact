package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * WaitForSilence<br>
 * Wait for Silence: Waits for up to 'x'  milliseconds of silence, 'y' times or 1 if omitted Examples:  - WaitForSilence(500,2) will wait for 1/2 second of silence, twice  - WaitForSilence(1000) will wait for 1 second of silence, once
 * </p>
 * Created : Sun Jul 09 18:49:23 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: WaitForSilence.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class WaitForSilence extends PbxApplication implements IWaitForSilence{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für WaitForSilence
	**/
	public WaitForSilence(){
		super();
	
	}
	/**
	* komplexer Konstruktor für WaitForSilence
	**/
	public WaitForSilence( String ax, String ay){
		super();
	
		this.x = ax;	
		this.y = ay;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(WaitForSilence object){
		this.x = object.x;	
		this.y = object.y;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String x;
	public static final String VALUEID_X="x" ;

    /**   **/
	protected String y;
	public static final String VALUEID_Y="y" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_X.equals(valueid)){
			return true;
		}
		if(VALUEID_Y.equals(valueid)){
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
		if(VALUEID_X.equals(valueid)){
			setX((String)data);
			return;
		}
		if(VALUEID_Y.equals(valueid)){
			setY((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_X.equals(valueid)){
			return getX();
			
		}
		if(VALUEID_Y.equals(valueid)){
			return getY();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getx 
	* 
	**/
	public String getX(){		return  x;
	}
	/**
	*setx 
	*/
	public void setX(String ax){
		if(ax==null){
		    changed = (this.x!=null);
		    this.x = null;	    
		}else{
			changed = ax.equals(this.x);
			this.x=ax;
		}
	}


	/**
	* gety 
	* 
	**/
	public String getY(){		return  y;
	}
	/**
	*sety 
	*/
	public void setY(String ay){
		if(ay==null){
		    changed = (this.y!=null);
		    this.y = null;	    
		}else{
			changed = ay.equals(this.y);
			this.y=ay;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("WaitForSilence, ")		
		//.append("x=")
		.append(x)
		.append(",")
		//.append("y=")
		.append(y)
    			.append("");

		return sb.toString();		
	}
}