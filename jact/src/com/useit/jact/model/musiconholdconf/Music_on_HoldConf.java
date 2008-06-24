package com.useit.jact.model.musiconholdconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Music_on_HoldConf<br>
 * 
 * </p>
 * Created : Fri May 26 14:31:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Music_on_HoldConf.java,v 1.1 2008/06/24 20:45:26 urszeidler Exp $
 */
 public  class Music_on_HoldConf extends AbstractSimpleDataClass implements IMusic_on_HoldConf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Music_on_HoldConf
	**/
	public Music_on_HoldConf(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Music_on_HoldConf object){

	}
//--------------  map Funktionen
	//public static final String MOHCLASSESMAP = "mohClassesMap";
	/** die typisierte List die die Aggregierten objekte(MohClassesImpl) enthält */
	protected List<MohClasses> mohClassesMap = new ArrayList<MohClasses>();
	/** die typisierte Map die die Aggregierten objekte(MohClassesImpl) enthält */
	//protected MohClassesMap mohClassesMapMap = new MohClassesMap();

	/**
	 * fügt ein MohClasses Objekt zu der Mapp hinzu
	 * @param aMohClasses
	 */
	public boolean addMohClasses(MohClasses aMohClasses){
		return mohClassesMap.add(aMohClasses);
	}

	/**
	 * removed ein MohClasses Objekt aus der Map
	 * @param aMohClasses
	 */
	public boolean removeMohClasses(MohClasses aMohClasses){
		return mohClassesMap.remove(aMohClasses);
	}

	

/**
 * gibt die List<MohClasses> mohClassesMap zurück	
 * @return List<MohClasses>
 * @see  IMusic_on_HoldConf#getMohClassesMap
 */
public List<MohClasses> getMohClassesMap() {
	return mohClassesMap;
}
/**
 * setzt die Map MohClassesMap
 * @param map mohClassesMapMap
 */
 @SuppressWarnings("unchecked")
public void setMohClassesMap(List aList){
    mohClassesMap = aList;
   // mohClassesMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
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