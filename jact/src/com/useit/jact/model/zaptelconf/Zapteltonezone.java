package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zapteltonezone<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zapteltonezone.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zapteltonezone extends AbstractSimpleDataClass implements IZapteltonezone{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zapteltonezone
	**/
	public Zapteltonezone(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zapteltonezone
	**/
	public Zapteltonezone( String azonename){
		super();
	
		this.zonename = azonename;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zapteltonezone object){
		this.zonename = object.zonename;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String zonename;
	public static final String VALUEID_ZONENAME="zonename" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ZONENAME.equals(valueid)){
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
		if(VALUEID_ZONENAME.equals(valueid)){
			setZonename((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ZONENAME.equals(valueid)){
			return getZonename();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getzonename 
	* 
	**/
	public String getZonename(){		return  zonename;
	}
	/**
	*setzonename 
	*/
	public void setZonename(String azonename){
		if(azonename==null){
		    changed = (this.zonename!=null);
		    this.zonename = null;	    
		}else{
			changed = azonename.equals(this.zonename);
			this.zonename=azonename;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("zonename=")
		.append(zonename)
    			.append("]");

		return sb.toString();		
	}}