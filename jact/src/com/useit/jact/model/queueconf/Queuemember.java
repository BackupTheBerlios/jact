package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Queuemember<br>
 * Each member of this call queue is listed on a separate line in the form technology/dialstring.  "member" means a normal member of a queue.  An optional penalty may be specified after a comma, such that entries with higher penalties are considered last.
 * </p>
 * Created : Fri May 26 14:31:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Queuemember.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $
 */
 public  class Queuemember extends AbstractSimpleDataClass implements IQueuemember{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Queuemember
	**/
	public Queuemember(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Queuemember
	**/
	public Queuemember( String atech, String adialstring){
		super();
	
		this.tech = atech;	
		this.dialstring = adialstring;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Queuemember object){
		this.tech = object.tech;	
		this.dialstring = object.dialstring;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  the technology **/
	protected String tech;
	public static final String VALUEID_TECH="tech" ;

    /**  the dial string **/
	protected String dialstring;
	public static final String VALUEID_DIALSTRING="dialstring" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TECH.equals(valueid)){
			return true;
		}
		if(VALUEID_DIALSTRING.equals(valueid)){
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
		if(VALUEID_TECH.equals(valueid)){
			setTech((String)data);
			return;
		}
		if(VALUEID_DIALSTRING.equals(valueid)){
			setDialstring((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TECH.equals(valueid)){
			return getTech();
			
		}
		if(VALUEID_DIALSTRING.equals(valueid)){
			return getDialstring();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettech 
	* the technology
	**/
	public String getTech(){		return  tech;
	}
	/**
	*settech 
	*/
	public void setTech(String atech){
		if(atech==null){
		    changed = (this.tech!=null);
		    this.tech = null;	    
		}else{
			changed = atech.equals(this.tech);
			this.tech=atech;
		}
	}


	/**
	* getdialstring 
	* the dial string
	**/
	public String getDialstring(){		return  dialstring;
	}
	/**
	*setdialstring 
	*/
	public void setDialstring(String adialstring){
		if(adialstring==null){
		    changed = (this.dialstring!=null);
		    this.dialstring = null;	    
		}else{
			changed = adialstring.equals(this.dialstring);
			this.dialstring=adialstring;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("tech=")
		.append(tech)
		.append(",")
		.append("dialstring=")
		.append(dialstring)
    			.append("]");

		return sb.toString();		
	}}