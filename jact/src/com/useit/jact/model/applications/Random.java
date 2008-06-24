package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Random<br>
 * probability := INTEGER in the range 1 to 100
 * </p>
 * Created : Sun Jul 09 18:51:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Random.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class Random extends PbxApplication implements IRandom{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Random
	**/
	public Random(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Random
	**/
	public Random( String aprobability, String acontext, String aextension, String apriority){
		super();
	
		this.probability = aprobability;	
		this.context = acontext;	
		this.extension = aextension;	
		this.priority = apriority;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Random object){
		this.probability = object.probability;	
		this.context = object.context;	
		this.extension = object.extension;	
		this.priority = object.priority;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String probability;
	public static final String VALUEID_PROBABILITY="probability" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

    /**   **/
	protected String extension;
	public static final String VALUEID_EXTENSION="extension" ;

    /**   **/
	protected String priority;
	public static final String VALUEID_PRIORITY="priority" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PROBABILITY.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return true;
		}
		if(VALUEID_PRIORITY.equals(valueid)){
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
		if(VALUEID_PROBABILITY.equals(valueid)){
			setProbability((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
			return;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			setExtension((String)data);
			return;
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			setPriority((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PROBABILITY.equals(valueid)){
			return getProbability();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return getExtension();
			
		}
		if(VALUEID_PRIORITY.equals(valueid)){
			return getPriority();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getprobability 
	* 
	**/
	public String getProbability(){		return  probability;
	}
	/**
	*setprobability 
	*/
	public void setProbability(String aprobability){
		if(aprobability==null){
		    changed = (this.probability!=null);
		    this.probability = null;	    
		}else{
			changed = aprobability.equals(this.probability);
			this.probability=aprobability;
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
	* getextension 
	* 
	**/
	public String getExtension(){		return  extension;
	}
	/**
	*setextension 
	*/
	public void setExtension(String aextension){
		if(aextension==null){
		    changed = (this.extension!=null);
		    this.extension = null;	    
		}else{
			changed = aextension.equals(this.extension);
			this.extension=aextension;
		}
	}


	/**
	* getpriority 
	* 
	**/
	public String getPriority(){		return  priority;
	}
	/**
	*setpriority 
	*/
	public void setPriority(String apriority){
		if(apriority==null){
		    changed = (this.priority!=null);
		    this.priority = null;	    
		}else{
			changed = apriority.equals(this.priority);
			this.priority=apriority;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Random, ")		
		//.append("probability=")
		.append(probability)
		.append(",")
		//.append("context=")
		.append(context)
		.append(",")
		//.append("extension=")
		.append(extension)
		.append(",")
		//.append("priority=")
		.append(priority)
    			.append("");

		return sb.toString();		
	}
}