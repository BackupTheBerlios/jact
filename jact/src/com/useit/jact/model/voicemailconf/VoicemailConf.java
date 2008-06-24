package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * VoicemailConf<br>
 * The voicemail.conf file contains one general section, one zonemessages section and one or more user-defined context sections. The general section holds global configuration informaton. The zonemessages section defines time zones and time reporting formats, and the context sections which follow define groups of users within a specific context. For example, in the above case, two context sections are defined: default and another_context. 
 * </p>
 * Created : Fri May 26 14:31:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailConf.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  class VoicemailConf extends AbstractSimpleDataClass implements IVoicemailConf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für VoicemailConf
	**/
	public VoicemailConf(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(VoicemailConf object){

	}
//--------------  map Funktionen
	//public static final String VOICEMAILCONTEXTMAP = "voicemailcontextMap";
	/** die typisierte List die die Aggregierten objekte(VoicemailcontextImpl) enthält */
	protected List<Voicemailcontext> voicemailcontextMap = new ArrayList<Voicemailcontext>();
	//public static final String ZONEMESSAGESMAP = "zonemessagesMap";
	/** die typisierte List die die Aggregierten objekte(ZonemessagesImpl) enthält */
	protected List<Zonemessages> zonemessagesMap = new ArrayList<Zonemessages>();
	/** die typisierte Map die die Aggregierten objekte(VoicemailcontextImpl) enthält */
	//protected VoicemailcontextMap voicemailcontextMapMap = new VoicemailcontextMap();
	/** die typisierte Map die die Aggregierten objekte(ZonemessagesImpl) enthält */
	//protected ZonemessagesMap zonemessagesMapMap = new ZonemessagesMap();

	/**
	 * fügt ein Voicemailcontext Objekt zu der Mapp hinzu
	 * @param aVoicemailcontext
	 */
	public boolean addVoicemailcontext(Voicemailcontext aVoicemailcontext){
		return voicemailcontextMap.add(aVoicemailcontext);
	}

	/**
	 * removed ein Voicemailcontext Objekt aus der Map
	 * @param aVoicemailcontext
	 */
	public boolean removeVoicemailcontext(Voicemailcontext aVoicemailcontext){
		return voicemailcontextMap.remove(aVoicemailcontext);
	}


	/**
	 * fügt ein Zonemessages Objekt zu der Mapp hinzu
	 * @param aZonemessages
	 */
	public boolean addZonemessages(Zonemessages aZonemessages){
		return zonemessagesMap.add(aZonemessages);
	}

	/**
	 * removed ein Zonemessages Objekt aus der Map
	 * @param aZonemessages
	 */
	public boolean removeZonemessages(Zonemessages aZonemessages){
		return zonemessagesMap.remove(aZonemessages);
	}

	

/**
 * gibt die List<Voicemailcontext> voicemailcontextMap zurück	
 * @return List<Voicemailcontext>
 * @see  IVoicemailConf#getVoicemailcontextMap
 */
public List<Voicemailcontext> getVoicemailcontextMap() {
	return voicemailcontextMap;
}
/**
 * setzt die Map VoicemailcontextMap
 * @param map voicemailcontextMapMap
 */
 @SuppressWarnings("unchecked")
public void setVoicemailcontextMap(List aList){
    voicemailcontextMap = aList;
   // voicemailcontextMapTyper.setList(aList); 
}


/**
 * gibt die List<Zonemessages> zonemessagesMap zurück	
 * @return List<Zonemessages>
 * @see  IVoicemailConf#getZonemessagesMap
 */
public List<Zonemessages> getZonemessagesMap() {
	return zonemessagesMap;
}
/**
 * setzt die Map ZonemessagesMap
 * @param map zonemessagesMapMap
 */
 @SuppressWarnings("unchecked")
public void setZonemessagesMap(List aList){
    zonemessagesMap = aList;
   // zonemessagesMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Voicemailgeneral fVoicemailgeneral= new VoicemailgeneralImpl();
/**
 * @return
 */
public Voicemailgeneral getVoicemailgeneral() {
	return fVoicemailgeneral;
}

/**
 * setzt den Voicemailgeneral und die Voicemailgeneralid	
 * @param Voicemailgeneral
 */
public void setVoicemailgeneral(IVoicemailgeneral aVoicemailgeneral) {
	if (aVoicemailgeneral!=null) {
	fVoicemailgeneral = (Voicemailgeneral)aVoicemailgeneral;
	//voicemailgeneral = aVoicemailgeneral.get();
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