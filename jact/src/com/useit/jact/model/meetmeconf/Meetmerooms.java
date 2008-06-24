package com.useit.jact.model.meetmeconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Meetmerooms<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Meetmerooms.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  class Meetmerooms extends AbstractSimpleDataClass implements IMeetmerooms{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Meetmerooms
	**/
	public Meetmerooms(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Meetmerooms
	**/
	public Meetmerooms( String aconfno, String apincode, String aadminpin){
		super();
	
		this.confno = aconfno;	
		this.pincode = apincode;	
		this.adminpin = aadminpin;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Meetmerooms object){
		this.confno = object.confno;	
		this.pincode = object.pincode;	
		this.adminpin = object.adminpin;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String confno;
	public static final String VALUEID_CONFNO="confno" ;

    /**   **/
	protected String pincode;
	public static final String VALUEID_PINCODE="pincode" ;

    /**   **/
	protected String adminpin;
	public static final String VALUEID_ADMINPIN="adminpin" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return true;
		}
		if(VALUEID_PINCODE.equals(valueid)){
			return true;
		}
		if(VALUEID_ADMINPIN.equals(valueid)){
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
		if(VALUEID_CONFNO.equals(valueid)){
			setConfno((String)data);
			return;
		}
		if(VALUEID_PINCODE.equals(valueid)){
			setPincode((String)data);
			return;
		}
		if(VALUEID_ADMINPIN.equals(valueid)){
			setAdminpin((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return getConfno();
			
		}
		if(VALUEID_PINCODE.equals(valueid)){
			return getPincode();
			
		}
		if(VALUEID_ADMINPIN.equals(valueid)){
			return getAdminpin();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getconfno 
	* 
	**/
	public String getConfno(){		return  confno;
	}
	/**
	*setconfno 
	*/
	public void setConfno(String aconfno){
		if(aconfno==null){
		    changed = (this.confno!=null);
		    this.confno = null;	    
		}else{
			changed = aconfno.equals(this.confno);
			this.confno=aconfno;
		}
	}


	/**
	* getpincode 
	* 
	**/
	public String getPincode(){		return  pincode;
	}
	/**
	*setpincode 
	*/
	public void setPincode(String apincode){
		if(apincode==null){
		    changed = (this.pincode!=null);
		    this.pincode = null;	    
		}else{
			changed = apincode.equals(this.pincode);
			this.pincode=apincode;
		}
	}


	/**
	* getadminpin 
	* 
	**/
	public String getAdminpin(){		return  adminpin;
	}
	/**
	*setadminpin 
	*/
	public void setAdminpin(String aadminpin){
		if(aadminpin==null){
		    changed = (this.adminpin!=null);
		    this.adminpin = null;	    
		}else{
			changed = aadminpin.equals(this.adminpin);
			this.adminpin=aadminpin;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("confno=")
		.append(confno)
		.append(",")
		.append("pincode=")
		.append(pincode)
		.append(",")
		.append("adminpin=")
		.append(adminpin)
    			.append("]");

		return sb.toString();		
	}}