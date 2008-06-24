

package com.useit.jact.model.alarmreciverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAlarmreceiverconf<br>
 * Configuration file for the Asterisk alarm receiver application.
 * </p>
 * Created : Fri May 26 14:30:36 CEST 2006
 * 
 * @behavior.elementname Alarmreceiverconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAlarmreceiverconf.java,v 1.1 2008/06/24 20:45:23 urszeidler Exp $
 */
 public  interface  IAlarmreceiverconf {
public static final String MODELNAME = "Alarmreceiverconf";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TIMESTAMPFORMAT="timestampformat" ;
// 	public static final String VALUEID_EVENTCMD="eventcmd" ;
// 	public static final String VALUEID_EVENTSPOOLDIR="eventspooldir" ;
// 	public static final String VALUEID_LOGINDIVIDUALEVENTS="logindividualevents" ;
// 	public static final String VALUEID_FDTIMEOUT="fdtimeout" ;
// 	public static final String VALUEID_SDTIMEOUT="sdtimeout" ;
// 	public static final String VALUEID_LOUDNESS="loudness" ;
// 	public static final String VALUEID_DBFAMILY="dbfamily" ;
	
	//---------  getter und setter

	/**
	* gettimestampformat 
	* Specify a timestamp format for the metadata section of the event files Default is %a %b %d, %Y @ %H:%M:%S %Z
	* @behavior.fieldname timestampformat 
	**/
	public String getTimestampformat();
	
	/**
	*settimestampformat 
	* Specify a timestamp format for the metadata section of the event files Default is %a %b %d, %Y @ %H:%M:%S %Z
	* @behavior.fieldname timestampformat 
	*/
	public void setTimestampformat(String atimestampformat);


	/**
	* geteventcmd 
	* Specify a command to execute when the caller hangs up Default is none
	* @behavior.fieldname eventcmd 
	**/
	public String getEventcmd();
	
	/**
	*seteventcmd 
	* Specify a command to execute when the caller hangs up Default is none
	* @behavior.fieldname eventcmd 
	*/
	public void setEventcmd(String aeventcmd);


	/**
	* geteventspooldir 
	* Specify a spool directory for the event files. This setting is required if you want the app to be useful. Event files written to the spool directory will be of the template event-XXXXXX, where XXXXXX is a random and unique alphanumeric string. Default is none, and the events will be dropped on the floor.
	* @behavior.fieldname eventspooldir 
	**/
	public String getEventspooldir();
	
	/**
	*seteventspooldir 
	* Specify a spool directory for the event files. This setting is required if you want the app to be useful. Event files written to the spool directory will be of the template event-XXXXXX, where XXXXXX is a random and unique alphanumeric string. Default is none, and the events will be dropped on the floor.
	* @behavior.fieldname eventspooldir 
	*/
	public void setEventspooldir(String aeventspooldir);


	/**
	* getlogindividualevents 
	* The alarmreceiver app can either log the events one-at-a-time to individual files in the spool  directory, or it can store them until the caller disconnects and write them all to one file.  The default setting for logindividualevents is no.
	* @behavior.fieldname logindividualevents 
	**/
	public String getLogindividualevents();
	
	/**
	*setlogindividualevents 
	* The alarmreceiver app can either log the events one-at-a-time to individual files in the spool  directory, or it can store them until the caller disconnects and write them all to one file.  The default setting for logindividualevents is no.
	* @behavior.fieldname logindividualevents 
	*/
	public void setLogindividualevents(String alogindividualevents);


	/**
	* getfdtimeout 
	* The timeout for receiving the first DTMF digit is adjustable from  1000 msec. to 10000 msec. The default is 2000 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 10000 milliseconds.
	* @behavior.fieldname fdtimeout 
	**/
	public Integer getFdtimeout();
	
	/**
	*setfdtimeout 
	* The timeout for receiving the first DTMF digit is adjustable from  1000 msec. to 10000 msec. The default is 2000 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 10000 milliseconds.
	* @behavior.fieldname fdtimeout 
	*/
	public void setFdtimeout(Integer afdtimeout);


	/**
	* getsdtimeout 
	* The timeout for receiving subsequent DTMF digits is adjustable from  110 msec. to 4000 msec. The default is 200 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 4000 milliseconds.
	* @behavior.fieldname sdtimeout 
	**/
	public Integer getSdtimeout();
	
	/**
	*setsdtimeout 
	* The timeout for receiving subsequent DTMF digits is adjustable from  110 msec. to 4000 msec. The default is 200 msec. Note: if you wish to test the receiver by entering digits manually, set this to a reasonable time out like 4000 milliseconds.
	* @behavior.fieldname sdtimeout 
	*/
	public void setSdtimeout(Integer asdtimeout);


	/**
	* getloudness 
	* The loudness of the ACK and Kissoff tones is adjustable from 100 to 8192. The default is 8192 This shouldn't need to be messed with, but is included just in case there are problems with  signal levels.
	* @behavior.fieldname loudness 
	**/
	public Integer getLoudness();
	
	/**
	*setloudness 
	* The loudness of the ACK and Kissoff tones is adjustable from 100 to 8192. The default is 8192 This shouldn't need to be messed with, but is included just in case there are problems with  signal levels.
	* @behavior.fieldname loudness 
	*/
	public void setLoudness(Integer aloudness);


	/**
	* getdbfamily 
	* The db-family setting allows the user to capture statistics on the number of calls, and the errors the alarm receiver sees. The default is for no db-family name to be defined and the database logging to be turned off.
	* @behavior.fieldname dbfamily 
	**/
	public String getDbfamily();
	
	/**
	*setdbfamily 
	* The db-family setting allows the user to capture statistics on the number of calls, and the errors the alarm receiver sees. The default is for no db-family name to be defined and the database logging to be turned off.
	* @behavior.fieldname dbfamily 
	*/
	public void setDbfamily(String adbfamily);


}