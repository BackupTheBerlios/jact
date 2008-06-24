package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ICES<br>
 * Streams to an icecast server using ices (available separately). A configuration file must be supplied for ices (see examples/asterisk-ices.conf). Returns -1 on hangup or 0 otherwise.
 * </p>
 * Created : Sun Jul 09 18:49:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICES.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class ICES extends PbxApplication implements IICES{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ICES
	**/
	public ICES(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ICES
	**/
	public ICES( String aconfig, String axml){
		super();
	
		this.config = aconfig;	
		this.xml = axml;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ICES object){
		this.config = object.config;	
		this.xml = object.xml;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String config;
	public static final String VALUEID_CONFIG="config" ;

    /**   **/
	protected String xml;
	public static final String VALUEID_XML="xml" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONFIG.equals(valueid)){
			return true;
		}
		if(VALUEID_XML.equals(valueid)){
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
		if(VALUEID_CONFIG.equals(valueid)){
			setConfig((String)data);
			return;
		}
		if(VALUEID_XML.equals(valueid)){
			setXml((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONFIG.equals(valueid)){
			return getConfig();
			
		}
		if(VALUEID_XML.equals(valueid)){
			return getXml();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getconfig 
	* 
	**/
	public String getConfig(){		return  config;
	}
	/**
	*setconfig 
	*/
	public void setConfig(String aconfig){
		if(aconfig==null){
		    changed = (this.config!=null);
		    this.config = null;	    
		}else{
			changed = aconfig.equals(this.config);
			this.config=aconfig;
		}
	}


	/**
	* getxml 
	* 
	**/
	public String getXml(){		return  xml;
	}
	/**
	*setxml 
	*/
	public void setXml(String axml){
		if(axml==null){
		    changed = (this.xml!=null);
		    this.xml = null;	    
		}else{
			changed = axml.equals(this.xml);
			this.xml=axml;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ICES, ")		
		//.append("config=")
		.append(config)
		.append(",")
		//.append("xml=")
		.append(xml)
    			.append("");

		return sb.toString();		
	}
}