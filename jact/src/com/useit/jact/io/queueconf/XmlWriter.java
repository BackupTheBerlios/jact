/*
 * (c) urs zeidler
 */
package com.useit.jact.io.queueconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.Queuesection;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.7 2006/01/14 15:44:47 urs
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
        if (data instanceof Queuegeneral) {
            return writeQueuegeneral(doc, (Queuegeneral) data);
        }
        if (data instanceof Queuesection) {
            return writeQueuesection(doc, (Queuesection) data);
        }
        if (data instanceof Queuemember) {
            return writeQueuemember(doc, (Queuemember) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeQueuegeneral(Document doc, Queuegeneral impl) {
        Element xQueuegeneral = doc.createElement("Queuegeneral");

        // felder schreiben
        if (impl.getPersistentmembers() != null)
            xQueuegeneral.setAttribute("persistentmembers", impl
                    .getPersistentmembers().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getQueuesectionMap().iterator(); iter
                .hasNext();) {
            Queuesection mobj = (Queuesection) iter.next();

            Element xQueuesection = writeQueuesection(doc, mobj);
            xQueuegeneral.appendChild(xQueuesection);

        }
        doc.appendChild(xQueuegeneral);
        return xQueuegeneral;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeQueuesection(Document doc, Queuesection impl) {
        Element xQueuesection = doc.createElement("Queuesection");

        // felder schreiben
        if (impl.getMusiconhold() != null)
            xQueuesection.setAttribute("musiconhold", impl.getMusiconhold()
                    .toString());
        if (impl.getSectionname() != null)
            xQueuesection.setAttribute("sectionname", impl.getSectionname()
                    .toString());
        if (impl.getAnnounce() != null)
            xQueuesection.setAttribute("announce", impl.getAnnounce()
                    .toString());
        if (impl.getStrategy() != null)
            xQueuesection.setAttribute("strategy", impl.getStrategy()
                    .toString());
        if (impl.getServicelevel() != null)
            xQueuesection.setAttribute("servicelevel", impl.getServicelevel()
                    .toString());
        if (impl.getContext() != null)
            xQueuesection.setAttribute("context", impl.getContext().toString());
        if (impl.getTimeout() != null)
            xQueuesection.setAttribute("timeout", impl.getTimeout().toString());
        if (impl.getRetry() != null)
            xQueuesection.setAttribute("retry", impl.getRetry().toString());
        if (impl.getWeight() != null)
            xQueuesection.setAttribute("weight", impl.getWeight().toString());
        if (impl.getWrapuptime() != null)
            xQueuesection.setAttribute("wrapuptime", impl.getWrapuptime()
                    .toString());
        if (impl.getMaxlen() != null)
            xQueuesection.setAttribute("maxlen", impl.getMaxlen().toString());
        if (impl.getAnnouncefrequency() != null)
            xQueuesection.setAttribute("announcefrequency", impl
                    .getAnnouncefrequency().toString());
        if (impl.getAnnounceholdtime() != null)
            xQueuesection.setAttribute("announceholdtime", impl
                    .getAnnounceholdtime().toString());
        if (impl.getAnnounceroundseconds() != null)
            xQueuesection.setAttribute("announceroundseconds", impl
                    .getAnnounceroundseconds().toString());
        if (impl.getMonitorformat() != null)
            xQueuesection.setAttribute("monitorformat", impl.getMonitorformat()
                    .toString());
        if (impl.getMonitorjoin() != null)
            xQueuesection.setAttribute("monitorjoin", impl.getMonitorjoin()
                    .toString());
        if (impl.getJoinempty() != null)
            xQueuesection.setAttribute("joinempty", impl.getJoinempty()
                    .toString());
        if (impl.getLeavewhenempty() != null)
            xQueuesection.setAttribute("leavewhenempty", impl
                    .getLeavewhenempty().toString());
        if (impl.getEventwhencalled() != null)
            xQueuesection.setAttribute("eventwhencalled", impl
                    .getEventwhencalled().toString());
        if (impl.getEventmemberstatusoff() != null)
            xQueuesection.setAttribute("eventmemberstatusoff", impl
                    .getEventmemberstatusoff().toString());
        if (impl.getReportholdtime() != null)
            xQueuesection.setAttribute("reportholdtime", impl
                    .getReportholdtime().toString());
        if (impl.getMemberdelay() != null)
            xQueuesection.setAttribute("memberdelay", impl.getMemberdelay()
                    .toString());
        if (impl.getTimeoutrestart() != null)
            xQueuesection.setAttribute("timeoutrestart", impl
                    .getTimeoutrestart().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getQueuememberMap().iterator(); iter
                .hasNext();) {
            Queuemember mobj = (Queuemember) iter.next();

            Element xQueuemember = writeQueuemember(doc, mobj);
            xQueuesection.appendChild(xQueuemember);

        }
        doc.appendChild(xQueuesection);
        return xQueuesection;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeQueuemember(Document doc, Queuemember impl) {
        Element xQueuemember = doc.createElement("Queuemember");

        // felder schreiben
        if (impl.getTech() != null)
            xQueuemember.setAttribute("tech", impl.getTech().toString());
        if (impl.getDialstring() != null)
            xQueuemember.setAttribute("dialstring", impl.getDialstring()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xQueuemember);
        return xQueuemember;
    }
}
