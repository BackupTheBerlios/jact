package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetCIDName<br>
 * Set Caller*ID Name on a call to a new value, while preserving the original Caller*ID number. This is useful for providing additional information to the called party. Always returns 0
 * </p>
 * Created : Sun Jul 09 18:51:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDName.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SetCIDName extends PbxApplication implements ISetCIDName{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetCIDName
	**/
	public SetCIDName(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCIDName
	**/
	public SetCIDName( String acname, String aa){
		super();
	
		this.cname = acname;	
		this.a = aa;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetCIDName object){
		this.cname = object.cname;	
		this.a = object.a;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String cname;
	public static final String VALUEID_CNAME="cname" ;

    /**   **/
	protected String a;
	public static final String VALUEID_A="a" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CNAME.equals(valueid)){
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
		if(VALUEID_CNAME.equals(valueid)){
			setCname((String)data);
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
		if(VALUEID_CNAME.equals(valueid)){
			return getCname();
			
		}
		if(VALUEID_A.equals(valueid)){
			return getA();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcname 
	* 
	**/
	public String getCname(){		return  cname;
	}
	/**
	*setcname 
	*/
	public void setCname(String acname){
		if(acname==null){
		    changed = (this.cname!=null);
		    this.cname = null;	    
		}else{
			changed = acname.equals(this.cname);
			this.cname=acname;
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
		sb.append("SetCIDName, ")		
		//.append("cname=")
		.append(cname)
		.append(",")
		//.append("a=")
		.append(a)
    			.append("");

		return sb.toString();		
	}
}