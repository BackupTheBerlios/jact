package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * MisdnCryptkey<br>
 * Keys for cryption, you reference them in the dialplan later also in dynamic encr.
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCryptkey.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class MisdnCryptkey extends AbstractSimpleDataClass implements IMisdnCryptkey{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MisdnCryptkey
	**/
	public MisdnCryptkey(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MisdnCryptkey
	**/
	public MisdnCryptkey( String akeyname, String akeyvalue){
		super();
	
		this.keyname = akeyname;	
		this.keyvalue = akeyvalue;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MisdnCryptkey object){
		this.keyname = object.keyname;	
		this.keyvalue = object.keyvalue;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  key name **/
	protected String keyname;
	public static final String VALUEID_KEYNAME="keyname" ;

    /**  key value **/
	protected String keyvalue;
	public static final String VALUEID_KEYVALUE="keyvalue" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_KEYNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_KEYVALUE.equals(valueid)){
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
		if(VALUEID_KEYNAME.equals(valueid)){
			setKeyname((String)data);
			return;
		}
		if(VALUEID_KEYVALUE.equals(valueid)){
			setKeyvalue((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_KEYNAME.equals(valueid)){
			return getKeyname();
			
		}
		if(VALUEID_KEYVALUE.equals(valueid)){
			return getKeyvalue();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getkeyname 
	* key name
	**/
	public String getKeyname(){		return  keyname;
	}
	/**
	*setkeyname 
	*/
	public void setKeyname(String akeyname){
		if(akeyname==null){
		    changed = (this.keyname!=null);
		    this.keyname = null;	    
		}else{
			changed = akeyname.equals(this.keyname);
			this.keyname=akeyname;
		}
	}


	/**
	* getkeyvalue 
	* key value
	**/
	public String getKeyvalue(){		return  keyvalue;
	}
	/**
	*setkeyvalue 
	*/
	public void setKeyvalue(String akeyvalue){
		if(akeyvalue==null){
		    changed = (this.keyvalue!=null);
		    this.keyvalue = null;	    
		}else{
			changed = akeyvalue.equals(this.keyvalue);
			this.keyvalue=akeyvalue;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("keyname=")
		.append(keyname)
		.append(",")
		.append("keyvalue=")
		.append(keyvalue)
    			.append("]");

		return sb.toString();		
	}}