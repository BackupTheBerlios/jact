package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetVar<br>
 * Set a variables to a CDR. You can specify an endless list of name / value pairs to be set as channel variables. The last arg (if it doesn't contain an '=' ) is intrepreted as a string of options. Valid Options:  - c - CDR, if set set the var as a CDR variable also.  - r - Recursive CDR, if there are any stacked CDRs, also apply to all as a cdr var.  - g - Set a global variable not a channel variable.  #n=value: Sets variable n to value. If prefixed with _, single inheritance assumed. If prefixed with __, infinite inheritance is assumed.
 * </p>
 * Created : Sun Jul 09 18:51:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetVar.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class SetVar extends PbxApplication implements ISetVar{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetVar
	**/
	public SetVar(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetVar
	**/
	public SetVar( String an1, String an2, String avalue, String aoptions){
		super();
	
		this.n1 = an1;	
		this.n2 = an2;	
		this.value = avalue;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetVar object){
		this.n1 = object.n1;	
		this.n2 = object.n2;	
		this.value = object.value;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String n1;
	public static final String VALUEID_N1="n1" ;

    /**   **/
	protected String n2;
	public static final String VALUEID_N2="n2" ;

    /**   **/
	protected String value;
	public static final String VALUEID_VALUE="value" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_N1.equals(valueid)){
			return true;
		}
		if(VALUEID_N2.equals(valueid)){
			return true;
		}
		if(VALUEID_VALUE.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
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
		if(VALUEID_N1.equals(valueid)){
			setN1((String)data);
			return;
		}
		if(VALUEID_N2.equals(valueid)){
			setN2((String)data);
			return;
		}
		if(VALUEID_VALUE.equals(valueid)){
			setValue((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_N1.equals(valueid)){
			return getN1();
			
		}
		if(VALUEID_N2.equals(valueid)){
			return getN2();
			
		}
		if(VALUEID_VALUE.equals(valueid)){
			return getValue();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getn1 
	* 
	**/
	public String getN1(){		return  n1;
	}
	/**
	*setn1 
	*/
	public void setN1(String an1){
		if(an1==null){
		    changed = (this.n1!=null);
		    this.n1 = null;	    
		}else{
			changed = an1.equals(this.n1);
			this.n1=an1;
		}
	}


	/**
	* getn2 
	* 
	**/
	public String getN2(){		return  n2;
	}
	/**
	*setn2 
	*/
	public void setN2(String an2){
		if(an2==null){
		    changed = (this.n2!=null);
		    this.n2 = null;	    
		}else{
			changed = an2.equals(this.n2);
			this.n2=an2;
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
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetVar, ")		
		//.append("n1=")
		.append(n1)
		.append(",")
		//.append("n2=")
		.append(n2)
		.append(",")
		//.append("value=")
		.append(value)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}