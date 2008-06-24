package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SoftHangup<br>
 * Hangs up the requested channel. Always returns 0 - 'options' may contain the following letter:  'a' : hang up all channels on a specified device instead of a single resource
 * </p>
 * Created : Sun Jul 09 18:51:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SoftHangup.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SoftHangup extends PbxApplication implements ISoftHangup{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SoftHangup
	**/
	public SoftHangup(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SoftHangup
	**/
	public SoftHangup( String atechnology, String aresource, String aoptions){
		super();
	
		this.technology = atechnology;	
		this.resource = aresource;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SoftHangup object){
		this.technology = object.technology;	
		this.resource = object.resource;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String technology;
	public static final String VALUEID_TECHNOLOGY="technology" ;

    /**   **/
	protected String resource;
	public static final String VALUEID_RESOURCE="resource" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			return true;
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
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
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			setTechnology((String)data);
			return;
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			setResource((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TECHNOLOGY.equals(valueid)){
			return getTechnology();
			
		}
		if(VALUEID_RESOURCE.equals(valueid)){
			return getResource();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettechnology 
	* 
	**/
	public String getTechnology(){		return  technology;
	}
	/**
	*settechnology 
	*/
	public void setTechnology(String atechnology){
		if(atechnology==null){
		    changed = (this.technology!=null);
		    this.technology = null;	    
		}else{
			changed = atechnology.equals(this.technology);
			this.technology=atechnology;
		}
	}


	/**
	* getresource 
	* 
	**/
	public String getResource(){		return  resource;
	}
	/**
	*setresource 
	*/
	public void setResource(String aresource){
		if(aresource==null){
		    changed = (this.resource!=null);
		    this.resource = null;	    
		}else{
			changed = aresource.equals(this.resource);
			this.resource=aresource;
		}
	}


	/**
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SoftHangup, ")		
		//.append("technology=")
		.append(technology)
		.append(",")
		//.append("resource=")
		.append(resource)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}