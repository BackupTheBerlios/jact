package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Globalvars<br>
 * The "Globals" category contains global variables that can be referenced in the dialplan with ${VARIABLE} or ${ENV(VARIABLE)} for Environmental variable ${${VARIABLE}} or ${text${VARIABLE}} or any hybrid
 * </p>
 * Created : Fri May 26 17:18:27 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Globalvars.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Globalvars extends AbstractSimpleDataClass implements IGlobalvars{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Globalvars
	**/
	public Globalvars(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Globalvars
	**/
	public Globalvars( String aname, String avalue){
		super();
	
		this.name = aname;	
		this.value = avalue;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Globalvars object){
		this.name = object.name;	
		this.value = object.value;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  name **/
	protected String name;
	public static final String VALUEID_NAME="name" ;

    /**  value **/
	protected String value;
	public static final String VALUEID_VALUE="value" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_NAME.equals(valueid)){
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
		if(VALUEID_NAME.equals(valueid)){
			setName((String)data);
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
		if(VALUEID_NAME.equals(valueid)){
			return getName();
			
		}
		if(VALUEID_VALUE.equals(valueid)){
			return getValue();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getname 
	* name
	**/
	public String getName(){		return  name;
	}
	/**
	*setname 
	*/
	public void setName(String aname){
		if(aname==null){
		    changed = (this.name!=null);
		    this.name = null;	    
		}else{
			changed = aname.equals(this.name);
			this.name=aname;
		}
	}


	/**
	* getvalue 
	* value
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
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("name=")
		.append(name)
		.append(",")
		.append("value=")
		.append(value)
    			.append("]");

		return sb.toString();		
	}}