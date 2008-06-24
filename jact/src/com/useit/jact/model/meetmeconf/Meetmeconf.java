package com.useit.jact.model.meetmeconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Meetmeconf<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Meetmeconf.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  class Meetmeconf extends AbstractSimpleDataClass implements IMeetmeconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Meetmeconf
	**/
	public Meetmeconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Meetmeconf
	**/
	public Meetmeconf( String afileid){
		super();
	
		this.fileid = afileid;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Meetmeconf object){
		this.fileid = object.fileid;	

	}
//--------------  map Funktionen
	//public static final String MEETMEROOMSMAP = "meetmeroomsMap";
	/** die typisierte List die die Aggregierten objekte(MeetmeroomsImpl) enthält */
	protected List<Meetmerooms> meetmeroomsMap = new ArrayList<Meetmerooms>();
	/** die typisierte Map die die Aggregierten objekte(MeetmeroomsImpl) enthält */
	//protected MeetmeroomsMap meetmeroomsMapMap = new MeetmeroomsMap();

	/**
	 * fügt ein Meetmerooms Objekt zu der Mapp hinzu
	 * @param aMeetmerooms
	 */
	public boolean addMeetmerooms(Meetmerooms aMeetmerooms){
		return meetmeroomsMap.add(aMeetmerooms);
	}

	/**
	 * removed ein Meetmerooms Objekt aus der Map
	 * @param aMeetmerooms
	 */
	public boolean removeMeetmerooms(Meetmerooms aMeetmerooms){
		return meetmeroomsMap.remove(aMeetmerooms);
	}

	

/**
 * gibt die List<Meetmerooms> meetmeroomsMap zurück	
 * @return List<Meetmerooms>
 * @see  IMeetmeconf#getMeetmeroomsMap
 */
public List<Meetmerooms> getMeetmeroomsMap() {
	return meetmeroomsMap;
}
/**
 * setzt die Map MeetmeroomsMap
 * @param map meetmeroomsMapMap
 */
 @SuppressWarnings("unchecked")
public void setMeetmeroomsMap(List aList){
    meetmeroomsMap = aList;
   // meetmeroomsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String fileid;
	public static final String VALUEID_FILEID="fileid" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILEID.equals(valueid)){
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
		if(VALUEID_FILEID.equals(valueid)){
			setFileid((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FILEID.equals(valueid)){
			return getFileid();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfileid 
	* 
	**/
	public String getFileid(){		return  fileid;
	}
	/**
	*setfileid 
	*/
	public void setFileid(String afileid){
		if(afileid==null){
		    changed = (this.fileid!=null);
		    this.fileid = null;	    
		}else{
			changed = afileid.equals(this.fileid);
			this.fileid=afileid;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("fileid=")
		.append(fileid)
    			.append("]");

		return sb.toString();		
	}}