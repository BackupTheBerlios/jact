package com.useit.jact.model.alarmreciverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Alarmreceiverconf<br>
 * Configuration file for the Asterisk alarm receiver application.
 * </p>
 * Created : Fri May 26 14:32:04 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Alarmreceiverconf.java,v 1.1 2008/06/24 20:45:23 urszeidler Exp $
 */
 public  class Alarmreceiverconf extends AbstractSimpleDataClass implements IAlarmreceiverconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Alarmreceiverconf
	**/
	public Alarmreceiverconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Alarmreceiverconf
	**/
	public Alarmreceiverconf( String atimestampformat, String aeventcmd, String aeventspooldir, String alogindividualevents, Integer afdtimeout, Integer asdtimeout, Integer aloudness, String adbfamily){
		super();
	
		this.timestampformat = atimestampformat;	
		this.eventcmd = aeventcmd;	
		this.eventspooldir = aeventspooldir;	
		this.logindividualevents = alogindividualevents;	
		this.fdtimeout = afdtimeout;	
		this.sdtimeout = asdtimeout;	
		this.loudness = aloudness;	
		this.dbfamily = adbfamily;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Alarmreceiverconf object){
		this.timestampformat = object.timestampformat;	
		this.eventcmd = object.eventcmd;	
		this.eventspooldir = object.eventspooldir;	
		this.logindividualevents = object.logindividualevents;	
		this.fdtimeout = object.fdtimeout;	
		this.sdtimeout = object.sdtimeout;	
		this.loudness = object.loudness;	
		this.dbfamily = object.dbfamily;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Specify a timestamp format for the metadata section of the event files Default is %a %b %d, %Y @ %H:%M:%S %Z **/
	protected String timestampformat;
	public static final String VALUEID_TIMESTAMPFORMAT="timestampformat" ;

    /**  Specify a command to execute when the caller hangs up Default is none **/
	protected String eventcmd;
	public static final String VALUEID_EVENTCMD="eventcmd" ;

    /**  Specify a spool directory for the event files. This setting is required if you want the app to be useful. Event files written to the spool directory will be of the template event-XXXXXX, where XXXXXX is a random and unique alphanumeric string. Default is none, and the events will be dropped on the floor. **/
	protected String eventspooldir;
	public static final String VALUEID_EVENTSPOOLDIR="eventspooldir" ;

    /**  The alarmreceiver app can either log the events one-at-a-time to individual files in the spool  directory, or it can store them until the caller disconnects and write them all to one file.  The default setting for logindividualevents is no. **/
	protected String logindividualevents;
	public static final String VALUEID_LOGINDIVIDUALEVENTS="logindividualevents" ;

    /**  The timeout for receiving the first DTMF digit is adjustable from  1000 msec. to 10000 msec. The default is 2000 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 10000 milliseconds. **/
	protected Integer fdtimeout;
	public static final String VALUEID_FDTIMEOUT="fdtimeout" ;

    /**  The timeout for receiving subsequent DTMF digits is adjustable from  110 msec. to 4000 msec. The default is 200 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 4000 milliseconds. **/
	protected Integer sdtimeout;
	public static final String VALUEID_SDTIMEOUT="sdtimeout" ;

    /**  The loudness of the ACK and Kissoff tones is adjustable from 100 to 8192. The default is 8192 This shouldn't need to be messed with, but is included just in case there are problems with  signal levels. **/
	protected Integer loudness;
	public static final String VALUEID_LOUDNESS="loudness" ;

    /**  The db-family setting allows the user to capture statistics on the number of calls, and the errors the alarm receiver sees. The default is for no db-family name to be defined and the database logging to be turned off. **/
	protected String dbfamily;
	public static final String VALUEID_DBFAMILY="dbfamily" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TIMESTAMPFORMAT.equals(valueid)){
			return true;
		}
		if(VALUEID_EVENTCMD.equals(valueid)){
			return true;
		}
		if(VALUEID_EVENTSPOOLDIR.equals(valueid)){
			return true;
		}
		if(VALUEID_LOGINDIVIDUALEVENTS.equals(valueid)){
			return true;
		}
		if(VALUEID_FDTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_SDTIMEOUT.equals(valueid)){
			return true;
		}
		if(VALUEID_LOUDNESS.equals(valueid)){
			return true;
		}
		if(VALUEID_DBFAMILY.equals(valueid)){
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
		if(VALUEID_TIMESTAMPFORMAT.equals(valueid)){
			setTimestampformat((String)data);
			return;
		}
		if(VALUEID_EVENTCMD.equals(valueid)){
			setEventcmd((String)data);
			return;
		}
		if(VALUEID_EVENTSPOOLDIR.equals(valueid)){
			setEventspooldir((String)data);
			return;
		}
		if(VALUEID_LOGINDIVIDUALEVENTS.equals(valueid)){
			setLogindividualevents((String)data);
			return;
		}
		if(VALUEID_FDTIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setFdtimeout(new Integer((String)data));
		        return;
		    }
			setFdtimeout((Integer)data);
			return;
		}
		if(VALUEID_SDTIMEOUT.equals(valueid)){
			if(data instanceof String){
		        setSdtimeout(new Integer((String)data));
		        return;
		    }
			setSdtimeout((Integer)data);
			return;
		}
		if(VALUEID_LOUDNESS.equals(valueid)){
			if(data instanceof String){
		        setLoudness(new Integer((String)data));
		        return;
		    }
			setLoudness((Integer)data);
			return;
		}
		if(VALUEID_DBFAMILY.equals(valueid)){
			setDbfamily((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TIMESTAMPFORMAT.equals(valueid)){
			return getTimestampformat();
			
		}
		if(VALUEID_EVENTCMD.equals(valueid)){
			return getEventcmd();
			
		}
		if(VALUEID_EVENTSPOOLDIR.equals(valueid)){
			return getEventspooldir();
			
		}
		if(VALUEID_LOGINDIVIDUALEVENTS.equals(valueid)){
			return getLogindividualevents();
			
		}
		if(VALUEID_FDTIMEOUT.equals(valueid)){
			return getFdtimeout();
			
		}
		if(VALUEID_SDTIMEOUT.equals(valueid)){
			return getSdtimeout();
			
		}
		if(VALUEID_LOUDNESS.equals(valueid)){
			return getLoudness();
			
		}
		if(VALUEID_DBFAMILY.equals(valueid)){
			return getDbfamily();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettimestampformat 
	* Specify a timestamp format for the metadata section of the event files Default is %a %b %d, %Y @ %H:%M:%S %Z
	**/
	public String getTimestampformat(){		return  timestampformat;
	}
	/**
	*settimestampformat 
	*/
	public void setTimestampformat(String atimestampformat){
		if(atimestampformat==null){
		    changed = (this.timestampformat!=null);
		    this.timestampformat = null;	    
		}else{
			changed = atimestampformat.equals(this.timestampformat);
			this.timestampformat=atimestampformat;
		}
	}


	/**
	* geteventcmd 
	* Specify a command to execute when the caller hangs up Default is none
	**/
	public String getEventcmd(){		return  eventcmd;
	}
	/**
	*seteventcmd 
	*/
	public void setEventcmd(String aeventcmd){
		if(aeventcmd==null){
		    changed = (this.eventcmd!=null);
		    this.eventcmd = null;	    
		}else{
			changed = aeventcmd.equals(this.eventcmd);
			this.eventcmd=aeventcmd;
		}
	}


	/**
	* geteventspooldir 
	* Specify a spool directory for the event files. This setting is required if you want the app to be useful. Event files written to the spool directory will be of the template event-XXXXXX, where XXXXXX is a random and unique alphanumeric string. Default is none, and the events will be dropped on the floor.
	**/
	public String getEventspooldir(){		return  eventspooldir;
	}
	/**
	*seteventspooldir 
	*/
	public void setEventspooldir(String aeventspooldir){
		if(aeventspooldir==null){
		    changed = (this.eventspooldir!=null);
		    this.eventspooldir = null;	    
		}else{
			changed = aeventspooldir.equals(this.eventspooldir);
			this.eventspooldir=aeventspooldir;
		}
	}


	/**
	* getlogindividualevents 
	* The alarmreceiver app can either log the events one-at-a-time to individual files in the spool  directory, or it can store them until the caller disconnects and write them all to one file.  The default setting for logindividualevents is no.
	**/
	public String getLogindividualevents(){		return  logindividualevents;
	}
	/**
	*setlogindividualevents 
	*/
	public void setLogindividualevents(String alogindividualevents){
		if(alogindividualevents==null){
		    changed = (this.logindividualevents!=null);
		    this.logindividualevents = null;	    
		}else{
			changed = alogindividualevents.equals(this.logindividualevents);
			this.logindividualevents=alogindividualevents;
		}
	}


	/**
	* getfdtimeout 
	* The timeout for receiving the first DTMF digit is adjustable from  1000 msec. to 10000 msec. The default is 2000 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 10000 milliseconds.
	**/
	public Integer getFdtimeout(){		return  fdtimeout;
	}
	/**
	*setfdtimeout 
	*/
	public void setFdtimeout(Integer afdtimeout){
		if(afdtimeout==null){
		    changed = (this.fdtimeout!=null);
		    this.fdtimeout = null;	    
		}else{
			changed = afdtimeout.equals(this.fdtimeout);
			this.fdtimeout=afdtimeout;
		}
	}


	/**
	* getsdtimeout 
	* The timeout for receiving subsequent DTMF digits is adjustable from  110 msec. to 4000 msec. The default is 200 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 4000 milliseconds.
	**/
	public Integer getSdtimeout(){		return  sdtimeout;
	}
	/**
	*setsdtimeout 
	*/
	public void setSdtimeout(Integer asdtimeout){
		if(asdtimeout==null){
		    changed = (this.sdtimeout!=null);
		    this.sdtimeout = null;	    
		}else{
			changed = asdtimeout.equals(this.sdtimeout);
			this.sdtimeout=asdtimeout;
		}
	}


	/**
	* getloudness 
	* The loudness of the ACK and Kissoff tones is adjustable from 100 to 8192. The default is 8192 This shouldn't need to be messed with, but is included just in case there are problems with  signal levels.
	**/
	public Integer getLoudness(){		return  loudness;
	}
	/**
	*setloudness 
	*/
	public void setLoudness(Integer aloudness){
		if(aloudness==null){
		    changed = (this.loudness!=null);
		    this.loudness = null;	    
		}else{
			changed = aloudness.equals(this.loudness);
			this.loudness=aloudness;
		}
	}


	/**
	* getdbfamily 
	* The db-family setting allows the user to capture statistics on the number of calls, and the errors the alarm receiver sees. The default is for no db-family name to be defined and the database logging to be turned off.
	**/
	public String getDbfamily(){		return  dbfamily;
	}
	/**
	*setdbfamily 
	*/
	public void setDbfamily(String adbfamily){
		if(adbfamily==null){
		    changed = (this.dbfamily!=null);
		    this.dbfamily = null;	    
		}else{
			changed = adbfamily.equals(this.dbfamily);
			this.dbfamily=adbfamily;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("timestampformat=")
		.append(timestampformat)
		.append(",")
		.append("eventcmd=")
		.append(eventcmd)
		.append(",")
		.append("eventspooldir=")
		.append(eventspooldir)
		.append(",")
		.append("logindividualevents=")
		.append(logindividualevents)
		.append(",")
		.append("fdtimeout=")
		.append(fdtimeout)
		.append(",")
		.append("sdtimeout=")
		.append(sdtimeout)
		.append(",")
		.append("loudness=")
		.append(loudness)
		.append(",")
		.append("dbfamily=")
		.append(dbfamily)
    			.append("]");

		return sb.toString();		
	}}