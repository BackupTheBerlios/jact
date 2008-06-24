package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zapataconf<br>
 * The format of the zapata.conf file is unfortunately not as simple as it could be. Most keywords do not do anything by themselves; they merely set up the parameters of any channel definitions that follow. The channel keyword actually creates the channel, using the settings specified before it.
 * </p>
 * Created : Fri May 26 14:32:09 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zapataconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zapataconf extends AbstractSimpleDataClass implements IZapataconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zapataconf
	**/
	public Zapataconf(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zapataconf object){

	}
//--------------  map Funktionen
	//public static final String ZAPTELCHANNELMAP = "zaptelchannelMap";
	/** die typisierte List die die Aggregierten objekte(ZaptelchannelImpl) enthält */
	protected List<Zaptelchannel> zaptelchannelMap = new ArrayList<Zaptelchannel>();
	/** die typisierte Map die die Aggregierten objekte(ZaptelchannelImpl) enthält */
	//protected ZaptelchannelMap zaptelchannelMapMap = new ZaptelchannelMap();

	/**
	 * fügt ein Zaptelchannel Objekt zu der Mapp hinzu
	 * @param aZaptelchannel
	 */
	public boolean addZaptelchannel(Zaptelchannel aZaptelchannel){
		return zaptelchannelMap.add(aZaptelchannel);
	}

	/**
	 * removed ein Zaptelchannel Objekt aus der Map
	 * @param aZaptelchannel
	 */
	public boolean removeZaptelchannel(Zaptelchannel aZaptelchannel){
		return zaptelchannelMap.remove(aZaptelchannel);
	}

	

/**
 * gibt die List<Zaptelchannel> zaptelchannelMap zurück	
 * @return List<Zaptelchannel>
 * @see  IZapataconf#getZaptelchannelMap
 */
public List<Zaptelchannel> getZaptelchannelMap() {
	return zaptelchannelMap;
}
/**
 * setzt die Map ZaptelchannelMap
 * @param map zaptelchannelMapMap
 */
 @SuppressWarnings("unchecked")
public void setZaptelchannelMap(List aList){
    zaptelchannelMap = aList;
   // zaptelchannelMapTyper.setList(aList); 
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