package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zapteldynamicspan<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zapteldynamicspan.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zapteldynamicspan extends AbstractSimpleDataClass implements IZapteldynamicspan{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zapteldynamicspan
	**/
	public Zapteldynamicspan(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zapteldynamicspan
	**/
	public Zapteldynamicspan( String adriver, String aaddress, Integer anumchans, Integer atiming){
		super();
	
		this.driver = adriver;	
		this.address = aaddress;	
		this.numchans = anumchans;	
		this.timing = atiming;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zapteldynamicspan object){
		this.driver = object.driver;	
		this.address = object.address;	
		this.numchans = object.numchans;	
		this.timing = object.timing;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Where <driver> is the name of the driver (e.g. eth) **/
	protected String driver;
	public static final String VALUEID_DRIVER="driver" ;

    /**  <address> is the  driver specific address (like a MAC for eth) **/
	protected String address;
	public static final String VALUEID_ADDRESS="address" ;

    /**  <numchans> is the number of channels **/
	protected Integer numchans;
	public static final String VALUEID_NUMCHANS="numchans" ;

    /**  <timing> is a timing priority, like for a normal span **/
	protected Integer timing;
	public static final String VALUEID_TIMING="timing" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DRIVER.equals(valueid)){
			return true;
		}
		if(VALUEID_ADDRESS.equals(valueid)){
			return true;
		}
		if(VALUEID_NUMCHANS.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMING.equals(valueid)){
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
		if(VALUEID_DRIVER.equals(valueid)){
			setDriver((String)data);
			return;
		}
		if(VALUEID_ADDRESS.equals(valueid)){
			setAddress((String)data);
			return;
		}
		if(VALUEID_NUMCHANS.equals(valueid)){
			if(data instanceof String){
		        setNumchans(new Integer((String)data));
		        return;
		    }
			setNumchans((Integer)data);
			return;
		}
		if(VALUEID_TIMING.equals(valueid)){
			if(data instanceof String){
		        setTiming(new Integer((String)data));
		        return;
		    }
			setTiming((Integer)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DRIVER.equals(valueid)){
			return getDriver();
			
		}
		if(VALUEID_ADDRESS.equals(valueid)){
			return getAddress();
			
		}
		if(VALUEID_NUMCHANS.equals(valueid)){
			return getNumchans();
			
		}
		if(VALUEID_TIMING.equals(valueid)){
			return getTiming();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdriver 
	* Where <driver> is the name of the driver (e.g. eth)
	**/
	public String getDriver(){		return  driver;
	}
	/**
	*setdriver 
	*/
	public void setDriver(String adriver){
		if(adriver==null){
		    changed = (this.driver!=null);
		    this.driver = null;	    
		}else{
			changed = adriver.equals(this.driver);
			this.driver=adriver;
		}
	}


	/**
	* getaddress 
	* <address> is the  driver specific address (like a MAC for eth)
	**/
	public String getAddress(){		return  address;
	}
	/**
	*setaddress 
	*/
	public void setAddress(String aaddress){
		if(aaddress==null){
		    changed = (this.address!=null);
		    this.address = null;	    
		}else{
			changed = aaddress.equals(this.address);
			this.address=aaddress;
		}
	}


	/**
	* getnumchans 
	* <numchans> is the number of channels
	**/
	public Integer getNumchans(){		return  numchans;
	}
	/**
	*setnumchans 
	*/
	public void setNumchans(Integer anumchans){
		if(anumchans==null){
		    changed = (this.numchans!=null);
		    this.numchans = null;	    
		}else{
			changed = anumchans.equals(this.numchans);
			this.numchans=anumchans;
		}
	}


	/**
	* gettiming 
	* <timing> is a timing priority, like for a normal span
	**/
	public Integer getTiming(){		return  timing;
	}
	/**
	*settiming 
	*/
	public void setTiming(Integer atiming){
		if(atiming==null){
		    changed = (this.timing!=null);
		    this.timing = null;	    
		}else{
			changed = atiming.equals(this.timing);
			this.timing=atiming;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("driver=")
		.append(driver)
		.append(",")
		.append("address=")
		.append(address)
		.append(",")
		.append("numchans=")
		.append(numchans)
		.append(",")
		.append("timing=")
		.append(timing)
    			.append("]");

		return sb.toString();		
	}}