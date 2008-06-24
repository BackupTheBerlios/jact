package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * MisdnDriverConf<br>
 * 
 * </p>
 * Created : Fri May 26 14:31:58 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnDriverConf.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $
 */
 public  class MisdnDriverConf extends AbstractSimpleDataClass implements IMisdnDriverConf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MisdnDriverConf
	**/
	public MisdnDriverConf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MisdnDriverConf
	**/
	public MisdnDriverConf( Integer apoll, Boolean apcm, Integer adebug){
		super();
	
		this.poll = apoll;	
		this.pcm = apcm;	
		this.debug = adebug;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MisdnDriverConf object){
		this.poll = object.poll;	
		this.pcm = object.pcm;	
		this.debug = object.debug;	

	}
//--------------  map Funktionen
	//public static final String MISDNCARDSMAP = "misdnCardsMap";
	/** die typisierte List die die Aggregierten objekte(MisdnCardsImpl) enthält */
	protected List<MisdnCards> misdnCardsMap = new ArrayList<MisdnCards>();
	/** die typisierte Map die die Aggregierten objekte(MisdnCardsImpl) enthält */
	//protected MisdnCardsMap misdnCardsMapMap = new MisdnCardsMap();

	/**
	 * fügt ein MisdnCards Objekt zu der Mapp hinzu
	 * @param aMisdnCards
	 */
	public boolean addMisdnCards(MisdnCards aMisdnCards){
		return misdnCardsMap.add(aMisdnCards);
	}

	/**
	 * removed ein MisdnCards Objekt aus der Map
	 * @param aMisdnCards
	 */
	public boolean removeMisdnCards(MisdnCards aMisdnCards){
		return misdnCardsMap.remove(aMisdnCards);
	}

	

/**
 * gibt die List<MisdnCards> misdnCardsMap zurück	
 * @return List<MisdnCards>
 * @see  IMisdnDriverConf#getMisdnCardsMap
 */
public List<MisdnCards> getMisdnCardsMap() {
	return misdnCardsMap;
}
/**
 * setzt die Map MisdnCardsMap
 * @param map misdnCardsMapMap
 */
 @SuppressWarnings("unchecked")
public void setMisdnCardsMap(List aList){
    misdnCardsMap = aList;
   // misdnCardsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Only one poll value must be given for all cards. Give the number of samples for each fifo process. By default 128 is used. Decrease to reduce delay, increase to reduce cpu load. If unsure, don't mess with it! Valid is 8, 16, 32, 64, 128, 256. **/
	protected Integer poll;
	public static final String VALUEID_POLL="poll" ;

    /**  Give the id of the PCM bus. All PCM busses with the same ID are expected to be connected and have equal slots. Only one chip of the PCM bus must be master, the others slave. -1 means no support of PCM bus. **/
	protected Boolean pcm;
	public static final String VALUEID_PCM="pcm" ;

    /**   **/
	protected Integer debug;
	public static final String VALUEID_DEBUG="debug" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_POLL.equals(valueid)){
			return true;
		}
		if(VALUEID_PCM.equals(valueid)){
			return true;
		}
		if(VALUEID_DEBUG.equals(valueid)){
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
		if(VALUEID_POLL.equals(valueid)){
			if(data instanceof String){
		        setPoll(new Integer((String)data));
		        return;
		    }
			setPoll((Integer)data);
			return;
		}
		if(VALUEID_PCM.equals(valueid)){
			if(data instanceof String){
		        setPcm(new Boolean((String)data));
		        return;
		    }
			setPcm((Boolean)data);
			return;
		}
		if(VALUEID_DEBUG.equals(valueid)){
			if(data instanceof String){
		        setDebug(new Integer((String)data));
		        return;
		    }
			setDebug((Integer)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_POLL.equals(valueid)){
			return getPoll();
			
		}
		if(VALUEID_PCM.equals(valueid)){
			return getPcm();
			
		}
		if(VALUEID_DEBUG.equals(valueid)){
			return getDebug();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getpoll 
	* Only one poll value must be given for all cards. Give the number of samples for each fifo process. By default 128 is used. Decrease to reduce delay, increase to reduce cpu load. If unsure, don't mess with it! Valid is 8, 16, 32, 64, 128, 256.
	**/
	public Integer getPoll(){		return  poll;
	}
	/**
	*setpoll 
	*/
	public void setPoll(Integer apoll){
		if(apoll==null){
		    changed = (this.poll!=null);
		    this.poll = null;	    
		}else{
			changed = apoll.equals(this.poll);
			this.poll=apoll;
		}
	}


	/**
	* getpcm 
	* Give the id of the PCM bus. All PCM busses with the same ID are expected to be connected and have equal slots. Only one chip of the PCM bus must be master, the others slave. -1 means no support of PCM bus.
	**/
	public Boolean getPcm(){		return  pcm;
	}
	/**
	*setpcm 
	*/
	public void setPcm(Boolean apcm){
		if(apcm==null){
		    changed = (this.pcm!=null);
		    this.pcm = null;	    
		}else{
			changed = apcm.equals(this.pcm);
			this.pcm=apcm;
		}
	}


	/**
	* getdebug 
	* 
	**/
	public Integer getDebug(){		return  debug;
	}
	/**
	*setdebug 
	*/
	public void setDebug(Integer adebug){
		if(adebug==null){
		    changed = (this.debug!=null);
		    this.debug = null;	    
		}else{
			changed = adebug.equals(this.debug);
			this.debug=adebug;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("poll=")
		.append(poll)
		.append(",")
		.append("pcm=")
		.append(pcm)
		.append(",")
		.append("debug=")
		.append(debug)
    			.append("]");

		return sb.toString();		
	}}