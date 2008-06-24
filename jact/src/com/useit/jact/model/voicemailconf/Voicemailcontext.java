package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Voicemailcontext<br>
 * 
 * </p>
 * Created : Fri May 26 14:31:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Voicemailcontext.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  class Voicemailcontext extends AbstractSimpleDataClass implements IVoicemailcontext{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Voicemailcontext
	**/
	public Voicemailcontext(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Voicemailcontext
	**/
	public Voicemailcontext( String acontextname){
		super();
	
		this.contextname = acontextname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Voicemailcontext object){
		this.contextname = object.contextname;	

	}
//--------------  map Funktionen
	//public static final String VOICEMAILCONTEXTENTRYMAP = "voicemailcontextentryMap";
	/** die typisierte List die die Aggregierten objekte(VoicemailcontextentryImpl) enthält */
	protected List<Voicemailcontextentry> voicemailcontextentryMap = new ArrayList<Voicemailcontextentry>();
	/** die typisierte Map die die Aggregierten objekte(VoicemailcontextentryImpl) enthält */
	//protected VoicemailcontextentryMap voicemailcontextentryMapMap = new VoicemailcontextentryMap();

	/**
	 * fügt ein Voicemailcontextentry Objekt zu der Mapp hinzu
	 * @param aVoicemailcontextentry
	 */
	public boolean addVoicemailcontextentry(Voicemailcontextentry aVoicemailcontextentry){
		return voicemailcontextentryMap.add(aVoicemailcontextentry);
	}

	/**
	 * removed ein Voicemailcontextentry Objekt aus der Map
	 * @param aVoicemailcontextentry
	 */
	public boolean removeVoicemailcontextentry(Voicemailcontextentry aVoicemailcontextentry){
		return voicemailcontextentryMap.remove(aVoicemailcontextentry);
	}

	

/**
 * gibt die List<Voicemailcontextentry> voicemailcontextentryMap zurück	
 * @return List<Voicemailcontextentry>
 * @see  IVoicemailcontext#getVoicemailcontextentryMap
 */
public List<Voicemailcontextentry> getVoicemailcontextentryMap() {
	return voicemailcontextentryMap;
}
/**
 * setzt die Map VoicemailcontextentryMap
 * @param map voicemailcontextentryMapMap
 */
 @SuppressWarnings("unchecked")
public void setVoicemailcontextentryMap(List aList){
    voicemailcontextentryMap = aList;
   // voicemailcontextentryMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String contextname;
	public static final String VALUEID_CONTEXTNAME="contextname" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONTEXTNAME.equals(valueid)){
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
		if(VALUEID_CONTEXTNAME.equals(valueid)){
			setContextname((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONTEXTNAME.equals(valueid)){
			return getContextname();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcontextname 
	* 
	**/
	public String getContextname(){		return  contextname;
	}
	/**
	*setcontextname 
	*/
	public void setContextname(String acontextname){
		if(acontextname==null){
		    changed = (this.contextname!=null);
		    this.contextname = null;	    
		}else{
			changed = acontextname.equals(this.contextname);
			this.contextname=acontextname;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("contextname=")
		.append(contextname)
    			.append("]");

		return sb.toString();		
	}}