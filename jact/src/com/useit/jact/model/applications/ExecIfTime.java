package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ExecIfTime<br>
 * If the current time matches the specified time, then execute the specified application. Each of the elements may be specified either as '*' (for always) or as a range. See the 'include' syntax for details.
 * </p>
 * Created : Sun Jul 09 18:49:17 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExecIfTime.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class ExecIfTime extends PbxApplication implements IExecIfTime{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ExecIfTime
	**/
	public ExecIfTime(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ExecIfTime
	**/
	public ExecIfTime( String atimes, String aweekdays, String amdays, String amonths, String aappname, String aappdata){
		super();
	
		this.times = atimes;	
		this.weekdays = aweekdays;	
		this.mdays = amdays;	
		this.months = amonths;	
		this.appname = aappname;	
		this.appdata = aappdata;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ExecIfTime object){
		this.times = object.times;	
		this.weekdays = object.weekdays;	
		this.mdays = object.mdays;	
		this.months = object.months;	
		this.appname = object.appname;	
		this.appdata = object.appdata;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String times;
	public static final String VALUEID_TIMES="times" ;

    /**   **/
	protected String weekdays;
	public static final String VALUEID_WEEKDAYS="weekdays" ;

    /**   **/
	protected String mdays;
	public static final String VALUEID_MDAYS="mdays" ;

    /**   **/
	protected String months;
	public static final String VALUEID_MONTHS="months" ;

    /**   **/
	protected String appname;
	public static final String VALUEID_APPNAME="appname" ;

    /**   **/
	protected String appdata;
	public static final String VALUEID_APPDATA="appdata" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TIMES.equals(valueid)){
			return true;
		}
		if(VALUEID_WEEKDAYS.equals(valueid)){
			return true;
		}
		if(VALUEID_MDAYS.equals(valueid)){
			return true;
		}
		if(VALUEID_MONTHS.equals(valueid)){
			return true;
		}
		if(VALUEID_APPNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_APPDATA.equals(valueid)){
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
		if(VALUEID_TIMES.equals(valueid)){
			setTimes((String)data);
			return;
		}
		if(VALUEID_WEEKDAYS.equals(valueid)){
			setWeekdays((String)data);
			return;
		}
		if(VALUEID_MDAYS.equals(valueid)){
			setMdays((String)data);
			return;
		}
		if(VALUEID_MONTHS.equals(valueid)){
			setMonths((String)data);
			return;
		}
		if(VALUEID_APPNAME.equals(valueid)){
			setAppname((String)data);
			return;
		}
		if(VALUEID_APPDATA.equals(valueid)){
			setAppdata((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TIMES.equals(valueid)){
			return getTimes();
			
		}
		if(VALUEID_WEEKDAYS.equals(valueid)){
			return getWeekdays();
			
		}
		if(VALUEID_MDAYS.equals(valueid)){
			return getMdays();
			
		}
		if(VALUEID_MONTHS.equals(valueid)){
			return getMonths();
			
		}
		if(VALUEID_APPNAME.equals(valueid)){
			return getAppname();
			
		}
		if(VALUEID_APPDATA.equals(valueid)){
			return getAppdata();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettimes 
	* 
	**/
	public String getTimes(){		return  times;
	}
	/**
	*settimes 
	*/
	public void setTimes(String atimes){
		if(atimes==null){
		    changed = (this.times!=null);
		    this.times = null;	    
		}else{
			changed = atimes.equals(this.times);
			this.times=atimes;
		}
	}


	/**
	* getweekdays 
	* 
	**/
	public String getWeekdays(){		return  weekdays;
	}
	/**
	*setweekdays 
	*/
	public void setWeekdays(String aweekdays){
		if(aweekdays==null){
		    changed = (this.weekdays!=null);
		    this.weekdays = null;	    
		}else{
			changed = aweekdays.equals(this.weekdays);
			this.weekdays=aweekdays;
		}
	}


	/**
	* getmdays 
	* 
	**/
	public String getMdays(){		return  mdays;
	}
	/**
	*setmdays 
	*/
	public void setMdays(String amdays){
		if(amdays==null){
		    changed = (this.mdays!=null);
		    this.mdays = null;	    
		}else{
			changed = amdays.equals(this.mdays);
			this.mdays=amdays;
		}
	}


	/**
	* getmonths 
	* 
	**/
	public String getMonths(){		return  months;
	}
	/**
	*setmonths 
	*/
	public void setMonths(String amonths){
		if(amonths==null){
		    changed = (this.months!=null);
		    this.months = null;	    
		}else{
			changed = amonths.equals(this.months);
			this.months=amonths;
		}
	}


	/**
	* getappname 
	* 
	**/
	public String getAppname(){		return  appname;
	}
	/**
	*setappname 
	*/
	public void setAppname(String aappname){
		if(aappname==null){
		    changed = (this.appname!=null);
		    this.appname = null;	    
		}else{
			changed = aappname.equals(this.appname);
			this.appname=aappname;
		}
	}


	/**
	* getappdata 
	* 
	**/
	public String getAppdata(){		return  appdata;
	}
	/**
	*setappdata 
	*/
	public void setAppdata(String aappdata){
		if(aappdata==null){
		    changed = (this.appdata!=null);
		    this.appdata = null;	    
		}else{
			changed = aappdata.equals(this.appdata);
			this.appdata=aappdata;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ExecIfTime, ")		
		//.append("times=")
		.append(times)
		.append(",")
		//.append("weekdays=")
		.append(weekdays)
		.append(",")
		//.append("mdays=")
		.append(mdays)
		.append(",")
		//.append("months=")
		.append(months)
		.append(",")
		//.append("appname=")
		.append(appname)
		.append(",")
		//.append("appdata=")
		.append(appdata)
    			.append("");

		return sb.toString();		
	}
}