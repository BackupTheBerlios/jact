package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetRDNIS<br>
 * Set RDNIS Number on a call to a new value. Always returns 0
 * </p>
 * Created : Sun Jul 09 18:50:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetRDNIS.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetRDNIS extends PbxApplication implements ISetRDNIS{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetRDNIS
	**/
	public SetRDNIS(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetRDNIS
	**/
	public SetRDNIS( String acnum){
		super();
	
		this.cnum = acnum;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetRDNIS object){
		this.cnum = object.cnum;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String cnum;
	public static final String VALUEID_CNUM="cnum" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CNUM.equals(valueid)){
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
		if(VALUEID_CNUM.equals(valueid)){
			setCnum((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CNUM.equals(valueid)){
			return getCnum();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcnum 
	* 
	**/
	public String getCnum(){		return  cnum;
	}
	/**
	*setcnum 
	*/
	public void setCnum(String acnum){
		if(acnum==null){
		    changed = (this.cnum!=null);
		    this.cnum = null;	    
		}else{
			changed = acnum.equals(this.cnum);
			this.cnum=acnum;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetRDNIS, ")		
		//.append("cnum=")
		.append(cnum)
    			.append("");

		return sb.toString();		
	}
}