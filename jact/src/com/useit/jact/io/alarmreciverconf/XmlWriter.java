/*
 * (c) urs zeidler
 */
package com.useit.jact.io.alarmreciverconf;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.4 2006/01/09 10:17:35 urs
 *          Exp $
 */
public class XmlWriter {

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public static Element writeConf(Document doc, Object data) {
        if (data instanceof Alarmreceiverconf) {
            return writeAlarmreceiverconf(doc, (Alarmreceiverconf) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAlarmreceiverconf(Document doc,
            Alarmreceiverconf impl) {
        Element xAlarmreceiverconf = doc.createElement("Alarmreceiverconf");

        // felder schreiben
        if (impl.getTimestampformat() != null)
            xAlarmreceiverconf.setAttribute("timestampformat", impl
                    .getTimestampformat().toString());
        if (impl.getEventcmd() != null)
            xAlarmreceiverconf.setAttribute("eventcmd", impl.getEventcmd()
                    .toString());
        if (impl.getEventspooldir() != null)
            xAlarmreceiverconf.setAttribute("eventspooldir", impl
                    .getEventspooldir().toString());
        if (impl.getLogindividualevents() != null)
            xAlarmreceiverconf.setAttribute("logindividualevents", impl
                    .getLogindividualevents().toString());
        if (impl.getFdtimeout() != null)
            xAlarmreceiverconf.setAttribute("fdtimeout", impl.getFdtimeout()
                    .toString());
        if (impl.getSdtimeout() != null)
            xAlarmreceiverconf.setAttribute("sdtimeout", impl.getSdtimeout()
                    .toString());
        if (impl.getLoudness() != null)
            xAlarmreceiverconf.setAttribute("loudness", impl.getLoudness()
                    .toString());
        if (impl.getDbfamily() != null)
            xAlarmreceiverconf.setAttribute("dbfamily", impl.getDbfamily()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xAlarmreceiverconf);
        return xAlarmreceiverconf;
    }
}
