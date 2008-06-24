

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAlarmReceiver<br>
 * Alarm receiver application for Asterisk. Only 1 signalling format is supported at this time: Ademco Contact ID. This application should be called whenever there is an alarm panel calling in to dump its events. The application will handshake with the alarm panel, and receive events, validate them, handshake them, and store them until the panel hangs up. Once the panel hangs up, the application will run the command line specified by the eventcmd setting in alarmreceiver.conf and pipe the events to the standard input of the application. Alarmreceiver.conf also contains settings for DTMF timing, and for the loudness of the acknowledgement tones.
 * </p>
 * Created : Wed Jul 05 18:56:27 CEST 2006
 * 
 * @behavior.elementname AlarmReceiver
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAlarmReceiver.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IAlarmReceiver {
public static final String MODELNAME = "AlarmReceiver";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}