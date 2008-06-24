package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * DBput<br>
 * Stores the given value in the Asterisk database. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBput.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class DBput extends PbxApplication implements IDBput{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für DBput
	**/
	public DBput(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DBput
	**/
	public DBput( String afamily, String akey, String avalue){
		super();
	
		this.family = afamily;	
		this.key = akey;	
		this.value = avalue;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(DBput object){
		this.family = object.family;	
		this.key = object.key;	
		this.value = object.value;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String family;
	public static final String VALUEID_FAMILY="family" ;

    /**   **/
	protected String key;
	public static final String VALUEID_KEY="key" ;

    /**   **/
	protected String value;
	public static final String VALUEID_VALUE="value" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FAMILY.equals(valueid)){
			return true;
		}
		if(VALUEID_KEY.equals(valueid)){
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
		if(VALUEID_FAMILY.equals(valueid)){
			setFamily((String)data);
			return;
		}
		if(VALUEID_KEY.equals(valueid)){
			setKey((String)data);
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
		if(VALUEID_FAMILY.equals(valueid)){
			return getFamily();
			
		}
		if(VALUEID_KEY.equals(valueid)){
			return getKey();
			
		}
		if(VALUEID_VALUE.equals(valueid)){
			return getValue();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfamily 
	* 
	**/
	public String getFamily(){		return  family;
	}
	/**
	*setfamily 
	*/
	public void setFamily(String afamily){
		if(afamily==null){
		    changed = (this.family!=null);
		    this.family = null;	    
		}else{
			changed = afamily.equals(this.family);
			this.family=afamily;
		}
	}


	/**
	* getkey 
	* 
	**/
	public String getKey(){		return  key;
	}
	/**
	*setkey 
	*/
	public void setKey(String akey){
		if(akey==null){
		    changed = (this.key!=null);
		    this.key = null;	    
		}else{
			changed = akey.equals(this.key);
			this.key=akey;
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
		sb.append("DBput, ")		
		//.append("family=")
		.append(family)
		.append(",")
		//.append("key=")
		.append(key)
		.append(",")
		//.append("value=")
		.append(value)
    			.append("");

		return sb.toString();		
	}
}