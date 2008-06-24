package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * SipConf<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:05 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipConf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class SipConf extends AbstractSimpleDataClass implements ISipConf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SipConf
	**/
	public SipConf(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SipConf object){

	}
//--------------  map Funktionen
	//public static final String SIPPEERSMAP = "sippeersMap";
	/** die typisierte List die die Aggregierten objekte(SippeersImpl) enthält */
	protected List<Sippeers> sippeersMap = new ArrayList<Sippeers>();
	/** die typisierte Map die die Aggregierten objekte(SippeersImpl) enthält */
	//protected SippeersMap sippeersMapMap = new SippeersMap();

	/**
	 * fügt ein Sippeers Objekt zu der Mapp hinzu
	 * @param aSippeers
	 */
	public boolean addSippeers(Sippeers aSippeers){
		return sippeersMap.add(aSippeers);
	}

	/**
	 * removed ein Sippeers Objekt aus der Map
	 * @param aSippeers
	 */
	public boolean removeSippeers(Sippeers aSippeers){
		return sippeersMap.remove(aSippeers);
	}

	

/**
 * gibt die List<Sippeers> sippeersMap zurück	
 * @return List<Sippeers>
 * @see  ISipConf#getSippeersMap
 */
public List<Sippeers> getSippeersMap() {
	return sippeersMap;
}
/**
 * setzt die Map SippeersMap
 * @param map sippeersMapMap
 */
 @SuppressWarnings("unchecked")
public void setSippeersMap(List aList){
    sippeersMap = aList;
   // sippeersMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Sipgeneral fSipgeneral= new SipgeneralImpl();
/**
 * @return
 */
public Sipgeneral getSipgeneral() {
	return fSipgeneral;
}

/**
 * setzt den Sipgeneral und die Sipgeneralid	
 * @param Sipgeneral
 */
public void setSipgeneral(ISipgeneral aSipgeneral) {
	if (aSipgeneral!=null) {
	fSipgeneral = (Sipgeneral)aSipgeneral;
	//sipgeneral = aSipgeneral.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
	    
	    return null;
	}

	
	//---------  getter und setter


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("]");

		return sb.toString();		
	}}