package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetGlobalVar<br>
 * Sets global variable n to value. Global variable are available across channels.
 * </p>
 * Created : Sun Jul 09 18:49:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGlobalVar.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SetGlobalVar extends PbxApplication implements ISetGlobalVar{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetGlobalVar
	**/
	public SetGlobalVar(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetGlobalVar
	**/
	public SetGlobalVar( String an, String avalue){
		super();
	
		this.n = an;	
		this.value = avalue;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetGlobalVar object){
		this.n = object.n;	
		this.value = object.value;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String n;
	public static final String VALUEID_N="n" ;

    /**   **/
	protected String value;
	public static final String VALUEID_VALUE="value" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_N.equals(valueid)){
			return true;
		}
		if(VALUEID_VALUE.equals(valueid)){
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
		if(VALUEID_N.equals(valueid)){
			setN((String)data);
			return;
		}
		if(VALUEID_VALUE.equals(valueid)){
			setValue((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_N.equals(valueid)){
			return getN();
			
		}
		if(VALUEID_VALUE.equals(valueid)){
			return getValue();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getn 
	* 
	**/
	public String getN(){		return  n;
	}
	/**
	*setn 
	*/
	public void setN(String an){
		if(an==null){
		    changed = (this.n!=null);
		    this.n = null;	    
		}else{
			changed = an.equals(this.n);
			this.n=an;
		}
	}


	/**
	* getvalue 
	* 
	**/
	public String getValue(){		return  value;
	}
	/**
	*setvalue 
	*/
	public void setValue(String avalue){
		if(avalue==null){
		    changed = (this.value!=null);
		    this.value = null;	    
		}else{
			changed = avalue.equals(this.value);
			this.value=avalue;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetGlobalVar, ")		
		//.append("n=")
		.append(n)
		.append(",")
		//.append("value=")
		.append(value)
    			.append("");

		return sb.toString();		
	}
}