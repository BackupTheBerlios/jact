package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Park<br>
 * Used to park yourself (typically in combination with a supervised transfer to know the parking space). This application is always registered internally and does not need to be explicitly added into the dialplan, although you should include the 'parkedcalls' context.
 * </p>
 * Created : Sun Jul 09 18:49:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Park.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Park extends PbxApplication implements IPark{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r Park
	**/
	public Park(){
		super();
	
	}
	/**
	* komplexer Konstruktor f�r Park
	**/
	public Park( String aexten){
		super();
	
		this.exten = aexten;	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(Park object){
		this.exten = object.exten;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String exten;
	public static final String VALUEID_EXTEN="exten" ;

	/**
	 * �berpr�ft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
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
		if(VALUEID_EXTEN.equals(valueid)){
			setExten((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zur�ck
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_EXTEN.equals(valueid)){
			return getExten();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getexten 
	* 
	**/
	public String getExten(){		return  exten;
	}
	/**
	*setexten 
	*/
	public void setExten(String aexten){
		if(aexten==null){
		    changed = (this.exten!=null);
		    this.exten = null;	    
		}else{
			changed = aexten.equals(this.exten);
			this.exten=aexten;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Park, ")		
		//.append("exten=")
		.append(exten)
    			.append("");

		return sb.toString();		
	}
}