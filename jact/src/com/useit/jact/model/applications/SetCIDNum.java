package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetCIDNum<br>
 * Set Caller*ID Number on a call to a new value, while preserving the original Caller*ID name. This is useful for providing additional information to the called party. Sets ANI as well if a flag is used. Always returns 0
 * </p>
 * Created : Sun Jul 09 18:48:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetCIDNum.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetCIDNum extends PbxApplication implements ISetCIDNum{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetCIDNum
	**/
	public SetCIDNum(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetCIDNum
	**/
	public SetCIDNum( String acnum, String aa){
		super();
	
		this.cnum = acnum;	
		this.a = aa;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetCIDNum object){
		this.cnum = object.cnum;	
		this.a = object.a;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String cnum;
	public static final String VALUEID_CNUM="cnum" ;

    /**   **/
	protected String a;
	public static final String VALUEID_A="a" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CNUM.equals(valueid)){
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
		if(VALUEID_CNUM.equals(valueid)){
			setCnum((String)data);
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
		if(VALUEID_CNUM.equals(valueid)){
			return getCnum();
			
		}
		if(VALUEID_A.equals(valueid)){
			return getA();
			
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
		sb.append("SetCIDNum, ")		
		//.append("cnum=")
		.append(cnum)
		.append(",")
		//.append("a=")
		.append(a)
    			.append("");

		return sb.toString();		
	}
}