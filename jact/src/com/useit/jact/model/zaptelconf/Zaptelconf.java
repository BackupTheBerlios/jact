package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zaptelconf<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zaptelconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zaptelconf extends AbstractSimpleDataClass implements IZaptelconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zaptelconf
	**/
	public Zaptelconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zaptelconf
	**/
	public Zaptelconf( String adefaultzone){
		super();
	
		this.defaultzone = adefaultzone;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zaptelconf object){
		this.defaultzone = object.defaultzone;	

	}
//--------------  map Funktionen
	//public static final String ZAPTELCHANNELSMAP = "zaptelchannelsMap";
	/** die typisierte List die die Aggregierten objekte(ZaptelchannelsImpl) enthält */
	protected List<Zaptelchannels> zaptelchannelsMap = new ArrayList<Zaptelchannels>();
	//public static final String ZAPTELDYNAMICSPANMAP = "zapteldynamicspanMap";
	/** die typisierte List die die Aggregierten objekte(ZapteldynamicspanImpl) enthält */
	protected List<Zapteldynamicspan> zapteldynamicspanMap = new ArrayList<Zapteldynamicspan>();
	//public static final String ZAPTELSPANMAP = "zaptelspanMap";
	/** die typisierte List die die Aggregierten objekte(ZaptelspanImpl) enthält */
	protected List<Zaptelspan> zaptelspanMap = new ArrayList<Zaptelspan>();
	//public static final String ZAPTELTONEZONEMAP = "zapteltonezoneMap";
	/** die typisierte List die die Aggregierten objekte(ZapteltonezoneImpl) enthält */
	protected List<Zapteltonezone> zapteltonezoneMap = new ArrayList<Zapteltonezone>();
	/** die typisierte Map die die Aggregierten objekte(ZaptelchannelsImpl) enthält */
	//protected ZaptelchannelsMap zaptelchannelsMapMap = new ZaptelchannelsMap();
	/** die typisierte Map die die Aggregierten objekte(ZapteldynamicspanImpl) enthält */
	//protected ZapteldynamicspanMap zapteldynamicspanMapMap = new ZapteldynamicspanMap();
	/** die typisierte Map die die Aggregierten objekte(ZaptelspanImpl) enthält */
	//protected ZaptelspanMap zaptelspanMapMap = new ZaptelspanMap();
	/** die typisierte Map die die Aggregierten objekte(ZapteltonezoneImpl) enthält */
	//protected ZapteltonezoneMap zapteltonezoneMapMap = new ZapteltonezoneMap();

	/**
	 * fügt ein Zaptelchannels Objekt zu der Mapp hinzu
	 * @param aZaptelchannels
	 */
	public boolean addZaptelchannels(Zaptelchannels aZaptelchannels){
		return zaptelchannelsMap.add(aZaptelchannels);
	}

	/**
	 * removed ein Zaptelchannels Objekt aus der Map
	 * @param aZaptelchannels
	 */
	public boolean removeZaptelchannels(Zaptelchannels aZaptelchannels){
		return zaptelchannelsMap.remove(aZaptelchannels);
	}


	/**
	 * fügt ein Zapteldynamicspan Objekt zu der Mapp hinzu
	 * @param aZapteldynamicspan
	 */
	public boolean addZapteldynamicspan(Zapteldynamicspan aZapteldynamicspan){
		return zapteldynamicspanMap.add(aZapteldynamicspan);
	}

	/**
	 * removed ein Zapteldynamicspan Objekt aus der Map
	 * @param aZapteldynamicspan
	 */
	public boolean removeZapteldynamicspan(Zapteldynamicspan aZapteldynamicspan){
		return zapteldynamicspanMap.remove(aZapteldynamicspan);
	}


	/**
	 * fügt ein Zaptelspan Objekt zu der Mapp hinzu
	 * @param aZaptelspan
	 */
	public boolean addZaptelspan(Zaptelspan aZaptelspan){
		return zaptelspanMap.add(aZaptelspan);
	}

	/**
	 * removed ein Zaptelspan Objekt aus der Map
	 * @param aZaptelspan
	 */
	public boolean removeZaptelspan(Zaptelspan aZaptelspan){
		return zaptelspanMap.remove(aZaptelspan);
	}


	/**
	 * fügt ein Zapteltonezone Objekt zu der Mapp hinzu
	 * @param aZapteltonezone
	 */
	public boolean addZapteltonezone(Zapteltonezone aZapteltonezone){
		return zapteltonezoneMap.add(aZapteltonezone);
	}

	/**
	 * removed ein Zapteltonezone Objekt aus der Map
	 * @param aZapteltonezone
	 */
	public boolean removeZapteltonezone(Zapteltonezone aZapteltonezone){
		return zapteltonezoneMap.remove(aZapteltonezone);
	}

	

/**
 * gibt die List<Zaptelchannels> zaptelchannelsMap zurück	
 * @return List<Zaptelchannels>
 * @see  IZaptelconf#getZaptelchannelsMap
 */
public List<Zaptelchannels> getZaptelchannelsMap() {
	return zaptelchannelsMap;
}
/**
 * setzt die Map ZaptelchannelsMap
 * @param map zaptelchannelsMapMap
 */
 @SuppressWarnings("unchecked")
public void setZaptelchannelsMap(List aList){
    zaptelchannelsMap = aList;
   // zaptelchannelsMapTyper.setList(aList); 
}


/**
 * gibt die List<Zapteldynamicspan> zapteldynamicspanMap zurück	
 * @return List<Zapteldynamicspan>
 * @see  IZaptelconf#getZapteldynamicspanMap
 */
public List<Zapteldynamicspan> getZapteldynamicspanMap() {
	return zapteldynamicspanMap;
}
/**
 * setzt die Map ZapteldynamicspanMap
 * @param map zapteldynamicspanMapMap
 */
 @SuppressWarnings("unchecked")
public void setZapteldynamicspanMap(List aList){
    zapteldynamicspanMap = aList;
   // zapteldynamicspanMapTyper.setList(aList); 
}


/**
 * gibt die List<Zaptelspan> zaptelspanMap zurück	
 * @return List<Zaptelspan>
 * @see  IZaptelconf#getZaptelspanMap
 */
public List<Zaptelspan> getZaptelspanMap() {
	return zaptelspanMap;
}
/**
 * setzt die Map ZaptelspanMap
 * @param map zaptelspanMapMap
 */
 @SuppressWarnings("unchecked")
public void setZaptelspanMap(List aList){
    zaptelspanMap = aList;
   // zaptelspanMapTyper.setList(aList); 
}


/**
 * gibt die List<Zapteltonezone> zapteltonezoneMap zurück	
 * @return List<Zapteltonezone>
 * @see  IZaptelconf#getZapteltonezoneMap
 */
public List<Zapteltonezone> getZapteltonezoneMap() {
	return zapteltonezoneMap;
}
/**
 * setzt die Map ZapteltonezoneMap
 * @param map zapteltonezoneMapMap
 */
 @SuppressWarnings("unchecked")
public void setZapteltonezoneMap(List aList){
    zapteltonezoneMap = aList;
   // zapteltonezoneMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String defaultzone;
	public static final String VALUEID_DEFAULTZONE="defaultzone" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DEFAULTZONE.equals(valueid)){
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
		if(VALUEID_DEFAULTZONE.equals(valueid)){
			setDefaultzone((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DEFAULTZONE.equals(valueid)){
			return getDefaultzone();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdefaultzone 
	* 
	**/
	public String getDefaultzone(){		return  defaultzone;
	}
	/**
	*setdefaultzone 
	*/
	public void setDefaultzone(String adefaultzone){
		if(adefaultzone==null){
		    changed = (this.defaultzone!=null);
		    this.defaultzone = null;	    
		}else{
			changed = adefaultzone.equals(this.defaultzone);
			this.defaultzone=adefaultzone;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("defaultzone=")
		.append(defaultzone)
    			.append("]");

		return sb.toString();		
	}}