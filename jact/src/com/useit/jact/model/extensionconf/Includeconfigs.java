package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Includeconfigs<br>
 * 
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Includeconfigs.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Includeconfigs extends AbstractSimpleDataClass implements IIncludeconfigs{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Includeconfigs
	**/
	public Includeconfigs(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Includeconfigs
	**/
	public Includeconfigs( String aconfigname){
		super();
	
		this.configname = aconfigname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Includeconfigs object){
		this.configname = object.configname;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String configname;
	public static final String VALUEID_CONFIGNAME="configname" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONFIGNAME.equals(valueid)){
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
		if(VALUEID_CONFIGNAME.equals(valueid)){
			setConfigname((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONFIGNAME.equals(valueid)){
			return getConfigname();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getconfigname 
	* 
	**/
	public String getConfigname(){		return  configname;
	}
	/**
	*setconfigname 
	*/
	public void setConfigname(String aconfigname){
		if(aconfigname==null){
		    changed = (this.configname!=null);
		    this.configname = null;	    
		}else{
			changed = aconfigname.equals(this.configname);
			this.configname=aconfigname;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("configname=")
		.append(configname)
    			.append("]");

		return sb.toString();		
	}}