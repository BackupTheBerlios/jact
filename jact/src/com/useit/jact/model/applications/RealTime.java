package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * RealTime<br>
 * All unique column names will be set as channel variables with optional prefix to the name. e.g. prefix of 'var_' would make the column 'name' become the variable ${var_name}
 * </p>
 * Created : Sun Jul 09 18:49:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTime.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class RealTime extends PbxApplication implements IRealTime{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für RealTime
	**/
	public RealTime(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RealTime
	**/
	public RealTime( String afamily, String acolmatch, String avalue, String aprefix){
		super();
	
		this.family = afamily;	
		this.colmatch = acolmatch;	
		this.value = avalue;	
		this.prefix = aprefix;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(RealTime object){
		this.family = object.family;	
		this.colmatch = object.colmatch;	
		this.value = object.value;	
		this.prefix = object.prefix;	

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
	protected String colmatch;
	public static final String VALUEID_COLMATCH="colmatch" ;

    /**   **/
	protected String value;
	public static final String VALUEID_VALUE="value" ;

    /**   **/
	protected String prefix;
	public static final String VALUEID_PREFIX="prefix" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FAMILY.equals(valueid)){
			return true;
		}
		if(VALUEID_COLMATCH.equals(valueid)){
			return true;
		}
		if(VALUEID_VALUE.equals(valueid)){
			return true;
		}
		if(VALUEID_PREFIX.equals(valueid)){
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
		if(VALUEID_COLMATCH.equals(valueid)){
			setColmatch((String)data);
			return;
		}
		if(VALUEID_VALUE.equals(valueid)){
			setValue((String)data);
			return;
		}
		if(VALUEID_PREFIX.equals(valueid)){
			setPrefix((String)data);
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
		if(VALUEID_COLMATCH.equals(valueid)){
			return getColmatch();
			
		}
		if(VALUEID_VALUE.equals(valueid)){
			return getValue();
			
		}
		if(VALUEID_PREFIX.equals(valueid)){
			return getPrefix();
			
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
	* getcolmatch 
	* 
	**/
	public String getColmatch(){		return  colmatch;
	}
	/**
	*setcolmatch 
	*/
	public void setColmatch(String acolmatch){
		if(acolmatch==null){
		    changed = (this.colmatch!=null);
		    this.colmatch = null;	    
		}else{
			changed = acolmatch.equals(this.colmatch);
			this.colmatch=acolmatch;
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
	* getprefix 
	* 
	**/
	public String getPrefix(){		return  prefix;
	}
	/**
	*setprefix 
	*/
	public void setPrefix(String aprefix){
		if(aprefix==null){
		    changed = (this.prefix!=null);
		    this.prefix = null;	    
		}else{
			changed = aprefix.equals(this.prefix);
			this.prefix=aprefix;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("RealTime, ")		
		//.append("family=")
		.append(family)
		.append(",")
		//.append("colmatch=")
		.append(colmatch)
		.append(",")
		//.append("value=")
		.append(value)
		.append(",")
		//.append("prefix=")
		.append(prefix)
    			.append("");

		return sb.toString();		
	}
}