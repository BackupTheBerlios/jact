package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * IAX2Provision<br>
 * Provisions the calling IAXy (assuming the calling entity is in fact an IAXy) with the given template or default if one is not specified. Returns -1 on error or 0 on success.
 * </p>
 * Created : Sun Jul 09 18:48:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAX2Provision.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class IAX2Provision extends PbxApplication implements IIAX2Provision{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für IAX2Provision
	**/
	public IAX2Provision(){
		super();
	
	}
	/**
	* komplexer Konstruktor für IAX2Provision
	**/
	public IAX2Provision( String atemplate){
		super();
	
		this.template = atemplate;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(IAX2Provision object){
		this.template = object.template;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String template;
	public static final String VALUEID_TEMPLATE="template" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TEMPLATE.equals(valueid)){
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
		if(VALUEID_TEMPLATE.equals(valueid)){
			setTemplate((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TEMPLATE.equals(valueid)){
			return getTemplate();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettemplate 
	* 
	**/
	public String getTemplate(){		return  template;
	}
	/**
	*settemplate 
	*/
	public void setTemplate(String atemplate){
		if(atemplate==null){
		    changed = (this.template!=null);
		    this.template = null;	    
		}else{
			changed = atemplate.equals(this.template);
			this.template=atemplate;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("IAX2Provision, ")		
		//.append("template=")
		.append(template)
    			.append("");

		return sb.toString();		
	}
}