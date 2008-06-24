package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * StripMSD<br>
 * Strips the leading 'count' digits from the channel's associated extension. For example, the number 5551212 when stripped with a count of 3 would be changed to 1212. This app always returns 0, and the PBX will continue processing at the next priority for the *new* extension.  So, for example, if priority 3 of 5551212 is StripMSD 3, the next step executed will be priority 4 of 1212. If you switch into an extension which has no first step, the PBX will treat it as though the user dialed an invalid extension.
 * </p>
 * Created : Sun Jul 09 18:51:07 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: StripMSD.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class StripMSD extends PbxApplication implements IStripMSD{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für StripMSD
	**/
	public StripMSD(){
		super();
	
	}
	/**
	* komplexer Konstruktor für StripMSD
	**/
	public StripMSD( String acount){
		super();
	
		this.count = acount;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(StripMSD object){
		this.count = object.count;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String count;
	public static final String VALUEID_COUNT="count" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_COUNT.equals(valueid)){
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
		if(VALUEID_COUNT.equals(valueid)){
			setCount((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_COUNT.equals(valueid)){
			return getCount();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcount 
	* 
	**/
	public String getCount(){		return  count;
	}
	/**
	*setcount 
	*/
	public void setCount(String acount){
		if(acount==null){
		    changed = (this.count!=null);
		    this.count = null;	    
		}else{
			changed = acount.equals(this.count);
			this.count=acount;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("StripMSD, ")		
		//.append("count=")
		.append(count)
    			.append("");

		return sb.toString();		
	}
}