package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetCallerID<br>
 * Set Caller*ID on a call to a new value. Sets ANI as well if a flag is used. Always returns 0
 * </p>
 * Created : Sun Jul 09 18:51:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCallerID.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetCallerID extends PbxApplication implements ISetCallerID{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetCallerID
	**/
	public SetCallerID(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCallerID
	**/
	public SetCallerID( String aclid, String aa){
		super();
	
		this.clid = aclid;	
		this.a = aa;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetCallerID object){
		this.clid = object.clid;	
		this.a = object.a;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String clid;
	public static final String VALUEID_CLID="clid" ;

    /**   **/
	protected String a;
	public static final String VALUEID_A="a" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CLID.equals(valueid)){
			return true;
		}
		if(VALUEID_A.equals(valueid)){
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
		if(VALUEID_CLID.equals(valueid)){
			setClid((String)data);
			return;
		}
		if(VALUEID_A.equals(valueid)){
			setA((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CLID.equals(valueid)){
			return getClid();
			
		}
		if(VALUEID_A.equals(valueid)){
			return getA();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getclid 
	* 
	**/
	public String getClid(){		return  clid;
	}
	/**
	*setclid 
	*/
	public void setClid(String aclid){
		if(aclid==null){
		    changed = (this.clid!=null);
		    this.clid = null;	    
		}else{
			changed = aclid.equals(this.clid);
			this.clid=aclid;
		}
	}


	/**
	* geta 
	* 
	**/
	public String getA(){		return  a;
	}
	/**
	*seta 
	*/
	public void setA(String aa){
		if(aa==null){
		    changed = (this.a!=null);
		    this.a = null;	    
		}else{
			changed = aa.equals(this.a);
			this.a=aa;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetCallerID, ")		
		//.append("clid=")
		.append(clid)
		.append(",")
		//.append("a=")
		.append(a)
    			.append("");

		return sb.toString();		
	}
}