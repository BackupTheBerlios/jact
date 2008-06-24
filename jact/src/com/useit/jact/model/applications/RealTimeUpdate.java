package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * RealTimeUpdate<br>
 * The column <newcol> in 'family' matching column <colmatch>=<value> will be updated to <newval>
 * </p>
 * Created : Sun Jul 09 18:50:40 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: RealTimeUpdate.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class RealTimeUpdate extends PbxApplication implements IRealTimeUpdate{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für RealTimeUpdate
	**/
	public RealTimeUpdate(){
		super();
	
	}
	/**
	* komplexer Konstruktor für RealTimeUpdate
	**/
	public RealTimeUpdate( String afamily, String acolmatch, String avalue, String anewcol, String anewval){
		super();
	
		this.family = afamily;	
		this.colmatch = acolmatch;	
		this.value = avalue;	
		this.newcol = anewcol;	
		this.newval = anewval;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(RealTimeUpdate object){
		this.family = object.family;	
		this.colmatch = object.colmatch;	
		this.value = object.value;	
		this.newcol = object.newcol;	
		this.newval = object.newval;	

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
	protected String newcol;
	public static final String VALUEID_NEWCOL="newcol" ;

    /**   **/
	protected String newval;
	public static final String VALUEID_NEWVAL="newval" ;

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
		if(VALUEID_NEWCOL.equals(valueid)){
			return true;
		}
		if(VALUEID_NEWVAL.equals(valueid)){
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
		if(VALUEID_NEWCOL.equals(valueid)){
			setNewcol((String)data);
			return;
		}
		if(VALUEID_NEWVAL.equals(valueid)){
			setNewval((String)data);
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
		if(VALUEID_NEWCOL.equals(valueid)){
			return getNewcol();
			
		}
		if(VALUEID_NEWVAL.equals(valueid)){
			return getNewval();
			
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
	* getnewcol 
	* 
	**/
	public String getNewcol(){		return  newcol;
	}
	/**
	*setnewcol 
	*/
	public void setNewcol(String anewcol){
		if(anewcol==null){
		    changed = (this.newcol!=null);
		    this.newcol = null;	    
		}else{
			changed = anewcol.equals(this.newcol);
			this.newcol=anewcol;
		}
	}


	/**
	* getnewval 
	* 
	**/
	public String getNewval(){		return  newval;
	}
	/**
	*setnewval 
	*/
	public void setNewval(String anewval){
		if(anewval==null){
		    changed = (this.newval!=null);
		    this.newval = null;	    
		}else{
			changed = anewval.equals(this.newval);
			this.newval=anewval;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("RealTimeUpdate, ")		
		//.append("family=")
		.append(family)
		.append(",")
		//.append("colmatch=")
		.append(colmatch)
		.append(",")
		//.append("value=")
		.append(value)
		.append(",")
		//.append("newcol=")
		.append(newcol)
		.append(",")
		//.append("newval=")
		.append(newval)
    			.append("");

		return sb.toString();		
	}
}