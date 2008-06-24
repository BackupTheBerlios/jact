package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Transfer<br>
 * Requests the remote caller be transferred a given extension. Returns -1 on hangup, or 0 on completion regardless of whether the transfer was successful. If the transfer was *not* supported or successful and there exists a priority n + 101, then that priority will be taken next.
 * </p>
 * Created : Sun Jul 09 18:48:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Transfer.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Transfer extends PbxApplication implements ITransfer{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Transfer
	**/
	public Transfer(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Transfer
	**/
	public Transfer( String atech, String adest){
		super();
	
		this.tech = atech;	
		this.dest = adest;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Transfer object){
		this.tech = object.tech;	
		this.dest = object.dest;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String tech;
	public static final String VALUEID_TECH="tech" ;

    /**   **/
	protected String dest;
	public static final String VALUEID_DEST="dest" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TECH.equals(valueid)){
			return true;
		}
		if(VALUEID_DEST.equals(valueid)){
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
		if(VALUEID_TECH.equals(valueid)){
			setTech((String)data);
			return;
		}
		if(VALUEID_DEST.equals(valueid)){
			setDest((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TECH.equals(valueid)){
			return getTech();
			
		}
		if(VALUEID_DEST.equals(valueid)){
			return getDest();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettech 
	* 
	**/
	public String getTech(){		return  tech;
	}
	/**
	*settech 
	*/
	public void setTech(String atech){
		if(atech==null){
		    changed = (this.tech!=null);
		    this.tech = null;	    
		}else{
			changed = atech.equals(this.tech);
			this.tech=atech;
		}
	}


	/**
	* getdest 
	* 
	**/
	public String getDest(){		return  dest;
	}
	/**
	*setdest 
	*/
	public void setDest(String adest){
		if(adest==null){
		    changed = (this.dest!=null);
		    this.dest = null;	    
		}else{
			changed = adest.equals(this.dest);
			this.dest=adest;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Transfer, ")		
		//.append("tech=")
		.append(tech)
		.append(",")
		//.append("dest=")
		.append(dest)
    			.append("");

		return sb.toString();		
	}
}