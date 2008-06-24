/*
 * (c) urs zeidler
 */
package com.useit.jact.io.alarmreciverconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.6 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class AlarmreceiverconfwriteHelper {

        public String timestampformat_StartToken;

        public String timestampformat_StopToken;

        public void writetimestampformat(StringBuffer strB,
                Alarmreceiverconf impl) {
            if (impl.getTimestampformat() != null
                    && timestampformat_StartToken != null) {
                strB.append(timestampformat_StartToken).append(
                        impl.getTimestampformat()).append(
                        timestampformat_StopToken);
            }
        }

        public String eventcmd_StartToken;

        public String eventcmd_StopToken;

        public void writeeventcmd(StringBuffer strB, Alarmreceiverconf impl) {
            if (impl.getEventcmd() != null && eventcmd_StartToken != null) {
                strB.append(eventcmd_StartToken).append(impl.getEventcmd())
                        .append(eventcmd_StopToken);
            }
        }

        public String eventspooldir_StartToken;

        public String eventspooldir_StopToken;

        public void writeeventspooldir(StringBuffer strB, Alarmreceiverconf impl) {
            if (impl.getEventspooldir() != null
                    && eventspooldir_StartToken != null) {
                strB.append(eventspooldir_StartToken).append(
                        impl.getEventspooldir())
                        .append(eventspooldir_StopToken);
            }
        }

        public String logindividualevents_StartToken;

        public String logindividualevents_StopToken;

        public void writelogindividualevents(StringBuffer strB,
                Alarmreceiverconf impl) {
            if (impl.getLogindividualevents() != null
                    && logindividualevents_StartToken != null) {
                strB.append(logindividualevents_StartToken).append(
                        impl.getLogindividualevents()).append(
                        logindividualevents_StopToken);
            }
        }

        public String fdtimeout_StartToken;

        public String fdtimeout_StopToken;

        public void writefdtimeout(StringBuffer strB, Alarmreceiverconf impl) {
            if (impl.getFdtimeout() != null && fdtimeout_StartToken != null) {
                strB.append(fdtimeout_StartToken).append(impl.getFdtimeout())
                        .append(fdtimeout_StopToken);
            }
        }

        public String sdtimeout_StartToken;

        public String sdtimeout_StopToken;

        public void writesdtimeout(StringBuffer strB, Alarmreceiverconf impl) {
            if (impl.getSdtimeout() != null && sdtimeout_StartToken != null) {
                strB.append(sdtimeout_StartToken).append(impl.getSdtimeout())
                        .append(sdtimeout_StopToken);
            }
        }

        public String loudness_StartToken;

        public String loudness_StopToken;

        public void writeloudness(StringBuffer strB, Alarmreceiverconf impl) {
            if (impl.getLoudness() != null && loudness_StartToken != null) {
                strB.append(loudness_StartToken).append(impl.getLoudness())
                        .append(loudness_StopToken);
            }
        }

        public String dbfamily_StartToken;

        public String dbfamily_StopToken;

        public void writedbfamily(StringBuffer strB, Alarmreceiverconf impl) {
            if (impl.getDbfamily() != null && dbfamily_StartToken != null) {
                strB.append(dbfamily_StartToken).append(impl.getDbfamily())
                        .append(dbfamily_StopToken);
            }
        }
    }; // end of AlarmreceiverconfwriteHelper Declaration

    protected AlarmreceiverconfwriteHelper theAlarmreceiverconfwriteHelper;

    /**
     * 
     */
    public ConfWriter() {
        super();

    }

    /**
     * schreibt die config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String string) {
        File file = new File(string);
        try {
            UseFileHelper.writeStringToFile(file, writetoString(data));
        } catch (FileNotFoundException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        } catch (IOException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        }

    }

    /**
     * gibt die config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        StringBuffer strb = new StringBuffer();
        writeConf(strb, data);
        return strb.toString();
    }

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public void writeConf(StringBuffer strB, Object data) {
        if (data instanceof Alarmreceiverconf) {
            writeAlarmreceiverconf(strB, (Alarmreceiverconf) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Alarmreceiverconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeAlarmreceiverconfFields(StringBuffer strB,
            Alarmreceiverconf impl) {

        // felder schreiben
        theAlarmreceiverconfwriteHelper.writetimestampformat(strB, impl);
        theAlarmreceiverconfwriteHelper.writeeventcmd(strB, impl);
        theAlarmreceiverconfwriteHelper.writeeventspooldir(strB, impl);
        theAlarmreceiverconfwriteHelper.writelogindividualevents(strB, impl);
        theAlarmreceiverconfwriteHelper.writefdtimeout(strB, impl);
        theAlarmreceiverconfwriteHelper.writesdtimeout(strB, impl);
        theAlarmreceiverconfwriteHelper.writeloudness(strB, impl);
        theAlarmreceiverconfwriteHelper.writedbfamily(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Alarmreceiverconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeAlarmreceiverconfAggregates(StringBuffer strB,
            Alarmreceiverconf impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Alarmreceiverconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAlarmreceiverconf(StringBuffer strB,
            Alarmreceiverconf impl) {
        writeAlarmreceiverconfFields(strB, impl);
        writeAlarmreceiverconfAggregates(strB, impl);

    }

    protected void initHelper() {
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

}
