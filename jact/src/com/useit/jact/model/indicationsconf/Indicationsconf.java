package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Indicationsconf<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Indicationsconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class Indicationsconf extends AbstractSimpleDataClass implements IIndicationsconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Indicationsconf
	**/
	public Indicationsconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Indicationsconf
	**/
	public Indicationsconf( String acountry){
		super();
	
		this.country = acountry;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Indicationsconf object){
		this.country = object.country;	

	}
//--------------  map Funktionen
	//public static final String TONEDEFINITIONSMAP = "toneDefinitionsMap";
	/** die typisierte List die die Aggregierten objekte(ToneDefinitionsImpl) enthält */
	protected List<ToneDefinitions> toneDefinitionsMap = new ArrayList<ToneDefinitions>();
	/** die typisierte Map die die Aggregierten objekte(ToneDefinitionsImpl) enthält */
	//protected ToneDefinitionsMap toneDefinitionsMapMap = new ToneDefinitionsMap();

	/**
	 * fügt ein ToneDefinitions Objekt zu der Mapp hinzu
	 * @param aToneDefinitions
	 */
	public boolean addToneDefinitions(ToneDefinitions aToneDefinitions){
		return toneDefinitionsMap.add(aToneDefinitions);
	}

	/**
	 * removed ein ToneDefinitions Objekt aus der Map
	 * @param aToneDefinitions
	 */
	public boolean removeToneDefinitions(ToneDefinitions aToneDefinitions){
		return toneDefinitionsMap.remove(aToneDefinitions);
	}

	

/**
 * gibt die List<ToneDefinitions> toneDefinitionsMap zurück	
 * @return List<ToneDefinitions>
 * @see  IIndicationsconf#getToneDefinitionsMap
 */
public List<ToneDefinitions> getToneDefinitionsMap() {
	return toneDefinitionsMap;
}
/**
 * setzt die Map ToneDefinitionsMap
 * @param map toneDefinitionsMapMap
 */
 @SuppressWarnings("unchecked")
public void setToneDefinitionsMap(List aList){
    toneDefinitionsMap = aList;
   // toneDefinitionsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String country;
	public static final String VALUEID_COUNTRY="country" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_COUNTRY.equals(valueid)){
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
		if(VALUEID_COUNTRY.equals(valueid)){
			setCountry((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_COUNTRY.equals(valueid)){
			return getCountry();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcountry 
	* 
	**/
	public String getCountry(){		return  country;
	}
	/**
	*setcountry 
	*/
	public void setCountry(String acountry){
		if(acountry==null){
		    changed = (this.country!=null);
		    this.country = null;	    
		}else{
			changed = acountry.equals(this.country);
			this.country=acountry;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("country=")
		.append(country)
    			.append("]");

		return sb.toString();		
	}}