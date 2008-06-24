package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Switch<br>
 * The SWITCH statement permits a server to share the dialplain with another server. Use with care: Reciprocal switch statements are not allowed (e.g. both A -> B and B -> A), and the switched server needs to be on-line or else dialing can be severly delayed.
 * </p>
 * Created : Fri May 26 17:18:26 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Switch.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Switch extends AbstractSimpleDataClass implements ISwitch{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Switch
	**/
	public Switch(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Switch
	**/
	public Switch( String aswitchdialstr){
		super();
	
		this.switchdialstr = aswitchdialstr;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Switch object){
		this.switchdialstr = object.switchdialstr;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String switchdialstr;
	public static final String VALUEID_SWITCHDIALSTR="switchdialstr" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_SWITCHDIALSTR.equals(valueid)){
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
		if(VALUEID_SWITCHDIALSTR.equals(valueid)){
			setSwitchdialstr((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_SWITCHDIALSTR.equals(valueid)){
			return getSwitchdialstr();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getswitchdialstr 
	* 
	**/
	public String getSwitchdialstr(){		return  switchdialstr;
	}
	/**
	*setswitchdialstr 
	*/
	public void setSwitchdialstr(String aswitchdialstr){
		if(aswitchdialstr==null){
		    changed = (this.switchdialstr!=null);
		    this.switchdialstr = null;	    
		}else{
			changed = aswitchdialstr.equals(this.switchdialstr);
			this.switchdialstr=aswitchdialstr;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("switchdialstr=")
		.append(switchdialstr)
    			.append("]");

		return sb.toString();		
	}}