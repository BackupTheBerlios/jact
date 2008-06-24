/*
 * (c) urs zeidler
 */
package com.useit.jact.io.alarmreciverconf;

import org.apache.log4j.Logger;

import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.4 2006/01/14 15:00:13
 *          urs Exp $
 */
public class ConfWriterImpl extends ConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriterImpl.class);

    /**
     * 
     */
    public ConfWriterImpl() {
        super();
        // TODO: die tokens anpassen

        theAlarmreceiverconfwriteHelper = new AlarmreceiverconfwriteHelper();
        theAlarmreceiverconfwriteHelper.timestampformat_StartToken = "timestampformat=";
        theAlarmreceiverconfwriteHelper.timestampformat_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.eventcmd_StartToken = "eventcmd=";
        theAlarmreceiverconfwriteHelper.eventcmd_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.eventspooldir_StartToken = "eventspooldir=";
        theAlarmreceiverconfwriteHelper.eventspooldir_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.logindividualevents_StartToken = "logindividualevents=";
        theAlarmreceiverconfwriteHelper.logindividualevents_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.fdtimeout_StartToken = "fdtimeout=";
        theAlarmreceiverconfwriteHelper.fdtimeout_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.sdtimeout_StartToken = "sdtimeout=";
        theAlarmreceiverconfwriteHelper.sdtimeout_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.loudness_StartToken = "loudness=";
        theAlarmreceiverconfwriteHelper.loudness_StopToken = "\n";
        theAlarmreceiverconfwriteHelper.dbfamily_StartToken = "dbfamily=";
        theAlarmreceiverconfwriteHelper.dbfamily_StopToken = "\n";

    }

    /**
     * schreibt ein Alarmreceiverconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAlarmreceiverconf(StringBuffer strB,
            Alarmreceiverconf impl) {
        super.writeAlarmreceiverconf(strB, impl);

    }

}
