package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zonemessages<br>
 * the zonemessages section allows the adminstrator to define custom time zones, and to change the way time is announced in a particular time zone. Users may have different time zone settings, and also different formats for announcing the date and time of voicemail messages. When a time zone is defined here, you may use it in individual malboxes by specifying a tz= option on the individual mailbox entry (Mailbox entries are discussed in the next section on contexts). 
 * </p>
 * Created : Fri May 26 14:31:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zonemessages.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  class Zonemessages extends AbstractSimpleDataClass implements IZonemessages{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zonemessages
	**/
	public Zonemessages(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zonemessages
	**/
	public Zonemessages( String atimezonename, String acountry, String acity, String aoptions){
		super();
	
		this.timezonename = atimezonename;	
		this.country = acountry;	
		this.city = acity;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zonemessages object){
		this.timezonename = object.timezonename;	
		this.country = object.country;	
		this.city = object.city;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  The Timezonename field is a name you pick for your custom time zone **/
	protected String timezonename;
	public static final String VALUEID_TIMEZONENAME="timezonename" ;

    /**  The Country field contains the name of the country where the time zone is located **/
	protected String country;
	public static final String VALUEID_COUNTRY="country" ;

    /**  The City field contains the name of the city within the country, **/
	protected String city;
	public static final String VALUEID_CITY="city" ;

    /**   the Options field contains a set of options you choose to customize the time announcement format. **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TIMEZONENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_COUNTRY.equals(valueid)){
			return true;
		}
		if(VALUEID_CITY.equals(valueid)){
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
		if(VALUEID_TIMEZONENAME.equals(valueid)){
			setTimezonename((String)data);
			return;
		}
		if(VALUEID_COUNTRY.equals(valueid)){
			setCountry((String)data);
			return;
		}
		if(VALUEID_CITY.equals(valueid)){
			setCity((String)data);
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
		if(VALUEID_TIMEZONENAME.equals(valueid)){
			return getTimezonename();
			
		}
		if(VALUEID_COUNTRY.equals(valueid)){
			return getCountry();
			
		}
		if(VALUEID_CITY.equals(valueid)){
			return getCity();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettimezonename 
	* The Timezonename field is a name you pick for your custom time zone
	**/
	public String getTimezonename(){		return  timezonename;
	}
	/**
	*settimezonename 
	*/
	public void setTimezonename(String atimezonename){
		if(atimezonename==null){
		    changed = (this.timezonename!=null);
		    this.timezonename = null;	    
		}else{
			changed = atimezonename.equals(this.timezonename);
			this.timezonename=atimezonename;
		}
	}


	/**
	* getcountry 
	* The Country field contains the name of the country where the time zone is located
	**/
	public String getCountry(){		return  country;
	}
	/**
	*setcountry 
	*/
	public void setCountry(String acountry){
		if(acountry==null){
		    changed = (this.country!=null);
		    this.country = null;	    
		}else{
			changed = acountry.equals(this.country);
			this.country=acountry;
		}
	}


	/**
	* getcity 
	* The City field contains the name of the city within the country,
	**/
	public String getCity(){		return  city;
	}
	/**
	*setcity 
	*/
	public void setCity(String acity){
		if(acity==null){
		    changed = (this.city!=null);
		    this.city = null;	    
		}else{
			changed = acity.equals(this.city);
			this.city=acity;
		}
	}


	/**
	* getoptions 
	*  the Options field contains a set of options you choose to customize the time announcement format.
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
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("timezonename=")
		.append(timezonename)
		.append(",")
		.append("country=")
		.append(country)
		.append(",")
		.append("city=")
		.append(city)
		.append(",")
		.append("options=")
		.append(options)
    			.append("]");

		return sb.toString();		
	}}