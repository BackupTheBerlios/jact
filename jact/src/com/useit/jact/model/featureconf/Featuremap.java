package com.useit.jact.model.featureconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Featuremap<br>
 * additinal
 * </p>
 * Created : Fri May 26 14:31:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Featuremap.java,v 1.1 2008/06/24 20:45:12 urszeidler Exp $
 */
 public  class Featuremap extends AbstractSimpleDataClass implements IFeaturemap{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Featuremap
	**/
	public Featuremap(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Featuremap
	**/
	public Featuremap( String ablindxfer, String adisconnect, String aautomon, String aatxfer){
		super();
	
		this.blindxfer = ablindxfer;	
		this.disconnect = adisconnect;	
		this.automon = aautomon;	
		this.atxfer = aatxfer;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Featuremap object){
		this.blindxfer = object.blindxfer;	
		this.disconnect = object.disconnect;	
		this.automon = object.automon;	
		this.atxfer = object.atxfer;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Blind transfer **/
	protected String blindxfer;
	public static final String VALUEID_BLINDXFER="blindxfer" ;

    /**  Disconnect **/
	protected String disconnect;
	public static final String VALUEID_DISCONNECT="disconnect" ;

    /**  One Touch Record **/
	protected String automon;
	public static final String VALUEID_AUTOMON="automon" ;

    /**  Attended transfer **/
	protected String atxfer;
	public static final String VALUEID_ATXFER="atxfer" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_BLINDXFER.equals(valueid)){
			return true;
		}
		if(VALUEID_DISCONNECT.equals(valueid)){
			return true;
		}
		if(VALUEID_AUTOMON.equals(valueid)){
			return true;
		}
		if(VALUEID_ATXFER.equals(valueid)){
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
		if(VALUEID_BLINDXFER.equals(valueid)){
			setBlindxfer((String)data);
			return;
		}
		if(VALUEID_DISCONNECT.equals(valueid)){
			setDisconnect((String)data);
			return;
		}
		if(VALUEID_AUTOMON.equals(valueid)){
			setAutomon((String)data);
			return;
		}
		if(VALUEID_ATXFER.equals(valueid)){
			setAtxfer((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_BLINDXFER.equals(valueid)){
			return getBlindxfer();
			
		}
		if(VALUEID_DISCONNECT.equals(valueid)){
			return getDisconnect();
			
		}
		if(VALUEID_AUTOMON.equals(valueid)){
			return getAutomon();
			
		}
		if(VALUEID_ATXFER.equals(valueid)){
			return getAtxfer();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getblindxfer 
	* Blind transfer
	**/
	public String getBlindxfer(){		return  blindxfer;
	}
	/**
	*setblindxfer 
	*/
	public void setBlindxfer(String ablindxfer){
		if(ablindxfer==null){
		    changed = (this.blindxfer!=null);
		    this.blindxfer = null;	    
		}else{
			changed = ablindxfer.equals(this.blindxfer);
			this.blindxfer=ablindxfer;
		}
	}


	/**
	* getdisconnect 
	* Disconnect
	**/
	public String getDisconnect(){		return  disconnect;
	}
	/**
	*setdisconnect 
	*/
	public void setDisconnect(String adisconnect){
		if(adisconnect==null){
		    changed = (this.disconnect!=null);
		    this.disconnect = null;	    
		}else{
			changed = adisconnect.equals(this.disconnect);
			this.disconnect=adisconnect;
		}
	}


	/**
	* getautomon 
	* One Touch Record
	**/
	public String getAutomon(){		return  automon;
	}
	/**
	*setautomon 
	*/
	public void setAutomon(String aautomon){
		if(aautomon==null){
		    changed = (this.automon!=null);
		    this.automon = null;	    
		}else{
			changed = aautomon.equals(this.automon);
			this.automon=aautomon;
		}
	}


	/**
	* getatxfer 
	* Attended transfer
	**/
	public String getAtxfer(){		return  atxfer;
	}
	/**
	*setatxfer 
	*/
	public void setAtxfer(String aatxfer){
		if(aatxfer==null){
		    changed = (this.atxfer!=null);
		    this.atxfer = null;	    
		}else{
			changed = aatxfer.equals(this.atxfer);
			this.atxfer=aatxfer;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("blindxfer=")
		.append(blindxfer)
		.append(",")
		.append("disconnect=")
		.append(disconnect)
		.append(",")
		.append("automon=")
		.append(automon)
		.append(",")
		.append("atxfer=")
		.append(atxfer)
    			.append("]");

		return sb.toString();		
	}}