package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Queuegeneral<br>
 * Global settings for call queues
 * </p>
 * Created : Fri May 26 14:31:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Queuegeneral.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $
 */
 public  class Queuegeneral extends AbstractSimpleDataClass implements IQueuegeneral{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Queuegeneral
	**/
	public Queuegeneral(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Queuegeneral
	**/
	public Queuegeneral( Boolean apersistentmembers){
		super();
	
		this.persistentmembers = apersistentmembers;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Queuegeneral object){
		this.persistentmembers = object.persistentmembers;	

	}
//--------------  map Funktionen
	//public static final String QUEUESECTIONMAP = "queuesectionMap";
	/** die typisierte List die die Aggregierten objekte(QueuesectionImpl) enthält */
	protected List<Queuesection> queuesectionMap = new ArrayList<Queuesection>();
	/** die typisierte Map die die Aggregierten objekte(QueuesectionImpl) enthält */
	//protected QueuesectionMap queuesectionMapMap = new QueuesectionMap();

	/**
	 * fügt ein Queuesection Objekt zu der Mapp hinzu
	 * @param aQueuesection
	 */
	public boolean addQueuesection(Queuesection aQueuesection){
		return queuesectionMap.add(aQueuesection);
	}

	/**
	 * removed ein Queuesection Objekt aus der Map
	 * @param aQueuesection
	 */
	public boolean removeQueuesection(Queuesection aQueuesection){
		return queuesectionMap.remove(aQueuesection);
	}

	

/**
 * gibt die List<Queuesection> queuesectionMap zurück	
 * @return List<Queuesection>
 * @see  IQueuegeneral#getQueuesectionMap
 */
public List<Queuesection> getQueuesectionMap() {
	return queuesectionMap;
}
/**
 * setzt die Map QueuesectionMap
 * @param map queuesectionMapMap
 */
 @SuppressWarnings("unchecked")
public void setQueuesectionMap(List aList){
    queuesectionMap = aList;
   // queuesectionMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Persistent Members

    Store each dynamic agent in each queue in the astdb so that  when asterisk is restarted, each agent will be automatically  readded into their recorded queues. Default is 'yes'. **/
	protected Boolean persistentmembers;
	public static final String VALUEID_PERSISTENTMEMBERS="persistentmembers" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PERSISTENTMEMBERS.equals(valueid)){
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
		if(VALUEID_PERSISTENTMEMBERS.equals(valueid)){
			if(data instanceof String){
		        setPersistentmembers(new Boolean((String)data));
		        return;
		    }
			setPersistentmembers((Boolean)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PERSISTENTMEMBERS.equals(valueid)){
			return getPersistentmembers();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getpersistentmembers 
	* Persistent Members

    Store each dynamic agent in each queue in the astdb so that  when asterisk is restarted, each agent will be automatically  readded into their recorded queues. Default is 'yes'.
	**/
	public Boolean getPersistentmembers(){		return  persistentmembers;
	}
	/**
	*setpersistentmembers 
	*/
	public void setPersistentmembers(Boolean apersistentmembers){
		if(apersistentmembers==null){
		    changed = (this.persistentmembers!=null);
		    this.persistentmembers = null;	    
		}else{
			changed = apersistentmembers.equals(this.persistentmembers);
			this.persistentmembers=apersistentmembers;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("persistentmembers=")
		.append(persistentmembers)
    			.append("]");

		return sb.toString();		
	}}