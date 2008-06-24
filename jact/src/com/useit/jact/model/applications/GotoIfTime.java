package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * GotoIfTime<br>
 * If the current time matches the specified time, then branch to the specified extension. Each of the elements may be specified either as '*' (for always) or as a range. See the 'include' syntax for details.
 * </p>
 * Created : Sun Jul 09 18:49:28 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GotoIfTime.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class GotoIfTime extends PbxApplication implements IGotoIfTime{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für GotoIfTime
	**/
	public GotoIfTime(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GotoIfTime
	**/
	public GotoIfTime( String atimes, String aweekdays, String amdays, String amonths, String acontext, String aextension, String apri){
		super();
	
		this.times = atimes;	
		this.weekdays = aweekdays;	
		this.mdays = amdays;	
		this.months = amonths;	
		this.context = acontext;	
		this.extension = aextension;	
		this.pri = apri;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(GotoIfTime object){
		this.times = object.times;	
		this.weekdays = object.weekdays;	
		this.mdays = object.mdays;	
		this.months = object.months;	
		this.context = object.context;	
		this.extension = object.extension;	
		this.pri = object.pri;	

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
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

    /**   **/
	protected String extension;
	public static final String VALUEID_EXTENSION="extension" ;

    /**   **/
	protected String pri;
	public static final String VALUEID_PRI="pri" ;

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
		if(VALUEID_CONTEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return true;
		}
		if(VALUEID_PRI.equals(valueid)){
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
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
			return;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			setExtension((String)data);
			return;
		}
		if(VALUEID_PRI.equals(valueid)){
			setPri((String)data);
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
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return getExtension();
			
		}
		if(VALUEID_PRI.equals(valueid)){
			return getPri();
			
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
	* getpri 
	* 
	**/
	public String getPri(){		return  pri;
	}
	/**
	*setpri 
	*/
	public void setPri(String apri){
		if(apri==null){
		    changed = (this.pri!=null);
		    this.pri = null;	    
		}else{
			changed = apri.equals(this.pri);
			this.pri=apri;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("GotoIfTime, ")		
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
		//.append("context=")
		.append(context)
		.append(",")
		//.append("extension=")
		.append(extension)
		.append(",")
		//.append("pri=")
		.append(pri)
    			.append("");

		return sb.toString();		
	}
}