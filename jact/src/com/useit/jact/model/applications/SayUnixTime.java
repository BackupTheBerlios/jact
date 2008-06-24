package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SayUnixTime<br>
 * unixtime: time, in seconds since Jan 1, 1970. May be negative.  defaults to now.  timezone: timezone, see /usr/share/zoneinfo for a list.  defaults to machine default.  format: a format the time is to be said in. See voicemail.conf.  defaults to "ABdY 'digits/at' IMp"  Returns 0 or -1 on hangup.
 * </p>
 * Created : Sun Jul 09 18:49:34 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SayUnixTime.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class SayUnixTime extends PbxApplication implements ISayUnixTime{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SayUnixTime
	**/
	public SayUnixTime(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SayUnixTime
	**/
	public SayUnixTime( String aunixtime, String atimezone, String aformat){
		super();
	
		this.unixtime = aunixtime;	
		this.timezone = atimezone;	
		this.format = aformat;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SayUnixTime object){
		this.unixtime = object.unixtime;	
		this.timezone = object.timezone;	
		this.format = object.format;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String unixtime;
	public static final String VALUEID_UNIXTIME="unixtime" ;

    /**   **/
	protected String timezone;
	public static final String VALUEID_TIMEZONE="timezone" ;

    /**   **/
	protected String format;
	public static final String VALUEID_FORMAT="format" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_UNIXTIME.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEZONE.equals(valueid)){
			return true;
		}
		if(VALUEID_FORMAT.equals(valueid)){
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
		if(VALUEID_UNIXTIME.equals(valueid)){
			setUnixtime((String)data);
			return;
		}
		if(VALUEID_TIMEZONE.equals(valueid)){
			setTimezone((String)data);
			return;
		}
		if(VALUEID_FORMAT.equals(valueid)){
			setFormat((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_UNIXTIME.equals(valueid)){
			return getUnixtime();
			
		}
		if(VALUEID_TIMEZONE.equals(valueid)){
			return getTimezone();
			
		}
		if(VALUEID_FORMAT.equals(valueid)){
			return getFormat();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getunixtime 
	* 
	**/
	public String getUnixtime(){		return  unixtime;
	}
	/**
	*setunixtime 
	*/
	public void setUnixtime(String aunixtime){
		if(aunixtime==null){
		    changed = (this.unixtime!=null);
		    this.unixtime = null;	    
		}else{
			changed = aunixtime.equals(this.unixtime);
			this.unixtime=aunixtime;
		}
	}


	/**
	* gettimezone 
	* 
	**/
	public String getTimezone(){		return  timezone;
	}
	/**
	*settimezone 
	*/
	public void setTimezone(String atimezone){
		if(atimezone==null){
		    changed = (this.timezone!=null);
		    this.timezone = null;	    
		}else{
			changed = atimezone.equals(this.timezone);
			this.timezone=atimezone;
		}
	}


	/**
	* getformat 
	* 
	**/
	public String getFormat(){		return  format;
	}
	/**
	*setformat 
	*/
	public void setFormat(String aformat){
		if(aformat==null){
		    changed = (this.format!=null);
		    this.format = null;	    
		}else{
			changed = aformat.equals(this.format);
			this.format=aformat;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SayUnixTime, ")		
		//.append("unixtime=")
		.append(unixtime)
		.append(",")
		//.append("timezone=")
		.append(timezone)
		.append(",")
		//.append("format=")
		.append(format)
    			.append("");

		return sb.toString();		
	}
}