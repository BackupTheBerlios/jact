package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * DUNDiLookup<br>
 * Looks up a given number in the global context specified or in the reserved 'e164' context if not specified. Returns -1 if the channel is hungup during the lookup or 0 otherwise. On completion, the variable ${DUNDTECH} and ${DUNDDEST} will contain the technology and destination of the appropriate technology and destination to access the number. If no answer was found, and the priority n + 101 exists, execution will continue at that location.
 * </p>
 * Created : Sun Jul 09 18:49:53 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DUNDiLookup.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class DUNDiLookup extends PbxApplication implements IDUNDiLookup{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für DUNDiLookup
	**/
	public DUNDiLookup(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DUNDiLookup
	**/
	public DUNDiLookup( String anumber, String acontext, String aoptions){
		super();
	
		this.number = anumber;	
		this.context = acontext;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(DUNDiLookup object){
		this.number = object.number;	
		this.context = object.context;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String number;
	public static final String VALUEID_NUMBER="number" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_NUMBER.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
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
		if(VALUEID_NUMBER.equals(valueid)){
			setNumber((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
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
		if(VALUEID_NUMBER.equals(valueid)){
			return getNumber();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getnumber 
	* 
	**/
	public String getNumber(){		return  number;
	}
	/**
	*setnumber 
	*/
	public void setNumber(String anumber){
		if(anumber==null){
		    changed = (this.number!=null);
		    this.number = null;	    
		}else{
			changed = anumber.equals(this.number);
			this.number=anumber;
		}
	}


	/**
	* getcontext 
	* 
	**/
	public String getContext(){		return  context;
	}
	/**
	*setcontext 
	*/
	public void setContext(String acontext){
		if(acontext==null){
		    changed = (this.context!=null);
		    this.context = null;	    
		}else{
			changed = acontext.equals(this.context);
			this.context=acontext;
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
		sb.append("DUNDiLookup, ")		
		//.append("number=")
		.append(number)
		.append(",")
		//.append("context=")
		.append(context)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}