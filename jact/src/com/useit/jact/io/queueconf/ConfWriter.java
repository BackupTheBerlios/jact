/*
 * (c) urs zeidler
 */
package com.useit.jact.io.queueconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.Queuesection;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.9 2006/01/14 15:44:47 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class QueuegeneralwriteHelper {

        public String persistentmembers_StartToken;

        public String persistentmembers_StopToken;

        public void writepersistentmembers(StringBuffer strB, Queuegeneral impl) {
            if (impl.getPersistentmembers() != null
                    && persistentmembers_StartToken != null) {
                strB.append(persistentmembers_StartToken).append(
                        impl.getPersistentmembers()).append(
                        persistentmembers_StopToken);
            }
        }
    }; // end of QueuegeneralwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class QueuesectionwriteHelper {

        public String musiconhold_StartToken;

        public String musiconhold_StopToken;

        public void writemusiconhold(StringBuffer strB, Queuesection impl) {
            if (impl.getMusiconhold() != null && musiconhold_StartToken != null) {
                strB.append(musiconhold_StartToken).append(
                        impl.getMusiconhold()).append(musiconhold_StopToken);
            }
        }

        public String sectionname_StartToken;

        public String sectionname_StopToken;

        public void writesectionname(StringBuffer strB, Queuesection impl) {
            if (impl.getSectionname() != null && sectionname_StartToken != null) {
                strB.append(sectionname_StartToken).append(
                        impl.getSectionname()).append(sectionname_StopToken);
            }
        }

        public String announce_StartToken;

        public String announce_StopToken;

        public void writeannounce(StringBuffer strB, Queuesection impl) {
            if (impl.getAnnounce() != null && announce_StartToken != null) {
                strB.append(announce_StartToken).append(impl.getAnnounce())
                        .append(announce_StopToken);
            }
        }

        public String strategy_StartToken;

        public String strategy_StopToken;

        public void writestrategy(StringBuffer strB, Queuesection impl) {
            if (impl.getStrategy() != null && strategy_StartToken != null) {
                strB.append(strategy_StartToken).append(impl.getStrategy())
                        .append(strategy_StopToken);
            }
        }

        public String servicelevel_StartToken;

        public String servicelevel_StopToken;

        public void writeservicelevel(StringBuffer strB, Queuesection impl) {
            if (impl.getServicelevel() != null
                    && servicelevel_StartToken != null) {
                strB.append(servicelevel_StartToken).append(
                        impl.getServicelevel()).append(servicelevel_StopToken);
            }
        }

        public String context_StartToken;

        public String context_StopToken;

        public void writecontext(StringBuffer strB, Queuesection impl) {
            if (impl.getContext() != null && context_StartToken != null) {
                strB.append(context_StartToken).append(impl.getContext())
                        .append(context_StopToken);
            }
        }

        public String timeout_StartToken;

        public String timeout_StopToken;

        public void writetimeout(StringBuffer strB, Queuesection impl) {
            if (impl.getTimeout() != null && timeout_StartToken != null) {
                strB.append(timeout_StartToken).append(impl.getTimeout())
                        .append(timeout_StopToken);
            }
        }

        public String retry_StartToken;

        public String retry_StopToken;

        public void writeretry(StringBuffer strB, Queuesection impl) {
            if (impl.getRetry() != null && retry_StartToken != null) {
                strB.append(retry_StartToken).append(impl.getRetry()).append(
                        retry_StopToken);
            }
        }

        public String weight_StartToken;

        public String weight_StopToken;

        public void writeweight(StringBuffer strB, Queuesection impl) {
            if (impl.getWeight() != null && weight_StartToken != null) {
                strB.append(weight_StartToken).append(impl.getWeight()).append(
                        weight_StopToken);
            }
        }

        public String wrapuptime_StartToken;

        public String wrapuptime_StopToken;

        public void writewrapuptime(StringBuffer strB, Queuesection impl) {
            if (impl.getWrapuptime() != null && wrapuptime_StartToken != null) {
                strB.append(wrapuptime_StartToken).append(impl.getWrapuptime())
                        .append(wrapuptime_StopToken);
            }
        }

        public String maxlen_StartToken;

        public String maxlen_StopToken;

        public void writemaxlen(StringBuffer strB, Queuesection impl) {
            if (impl.getMaxlen() != null && maxlen_StartToken != null) {
                strB.append(maxlen_StartToken).append(impl.getMaxlen()).append(
                        maxlen_StopToken);
            }
        }

        public String announcefrequency_StartToken;

        public String announcefrequency_StopToken;

        public void writeannouncefrequency(StringBuffer strB, Queuesection impl) {
            if (impl.getAnnouncefrequency() != null
                    && announcefrequency_StartToken != null) {
                strB.append(announcefrequency_StartToken).append(
                        impl.getAnnouncefrequency()).append(
                        announcefrequency_StopToken);
            }
        }

        public String announceholdtime_StartToken;

        public String announceholdtime_StopToken;

        public void writeannounceholdtime(StringBuffer strB, Queuesection impl) {
            if (impl.getAnnounceholdtime() != null
                    && announceholdtime_StartToken != null) {
                strB.append(announceholdtime_StartToken).append(
                        impl.getAnnounceholdtime()).append(
                        announceholdtime_StopToken);
            }
        }

        public String announceroundseconds_StartToken;

        public String announceroundseconds_StopToken;

        public void writeannounceroundseconds(StringBuffer strB,
                Queuesection impl) {
            if (impl.getAnnounceroundseconds() != null
                    && announceroundseconds_StartToken != null) {
                strB.append(announceroundseconds_StartToken).append(
                        impl.getAnnounceroundseconds()).append(
                        announceroundseconds_StopToken);
            }
        }

        public String monitorformat_StartToken;

        public String monitorformat_StopToken;

        public void writemonitorformat(StringBuffer strB, Queuesection impl) {
            if (impl.getMonitorformat() != null
                    && monitorformat_StartToken != null) {
                strB.append(monitorformat_StartToken).append(
                        impl.getMonitorformat())
                        .append(monitorformat_StopToken);
            }
        }

        public String monitorjoin_StartToken;

        public String monitorjoin_StopToken;

        public void writemonitorjoin(StringBuffer strB, Queuesection impl) {
            if (impl.getMonitorjoin() != null && monitorjoin_StartToken != null) {
                strB.append(monitorjoin_StartToken).append(
                        impl.getMonitorjoin()).append(monitorjoin_StopToken);
            }
        }

        public String joinempty_StartToken;

        public String joinempty_StopToken;

        public void writejoinempty(StringBuffer strB, Queuesection impl) {
            if (impl.getJoinempty() != null && joinempty_StartToken != null) {
                strB.append(joinempty_StartToken).append(impl.getJoinempty())
                        .append(joinempty_StopToken);
            }
        }

        public String leavewhenempty_StartToken;

        public String leavewhenempty_StopToken;

        public void writeleavewhenempty(StringBuffer strB, Queuesection impl) {
            if (impl.getLeavewhenempty() != null
                    && leavewhenempty_StartToken != null) {
                strB.append(leavewhenempty_StartToken).append(
                        impl.getLeavewhenempty()).append(
                        leavewhenempty_StopToken);
            }
        }

        public String eventwhencalled_StartToken;

        public String eventwhencalled_StopToken;

        public void writeeventwhencalled(StringBuffer strB, Queuesection impl) {
            if (impl.getEventwhencalled() != null
                    && eventwhencalled_StartToken != null) {
                strB.append(eventwhencalled_StartToken).append(
                        impl.getEventwhencalled()).append(
                        eventwhencalled_StopToken);
            }
        }

        public String eventmemberstatusoff_StartToken;

        public String eventmemberstatusoff_StopToken;

        public void writeeventmemberstatusoff(StringBuffer strB,
                Queuesection impl) {
            if (impl.getEventmemberstatusoff() != null
                    && eventmemberstatusoff_StartToken != null) {
                strB.append(eventmemberstatusoff_StartToken).append(
                        impl.getEventmemberstatusoff()).append(
                        eventmemberstatusoff_StopToken);
            }
        }

        public String reportholdtime_StartToken;

        public String reportholdtime_StopToken;

        public void writereportholdtime(StringBuffer strB, Queuesection impl) {
            if (impl.getReportholdtime() != null
                    && reportholdtime_StartToken != null) {
                strB.append(reportholdtime_StartToken).append(
                        impl.getReportholdtime()).append(
                        reportholdtime_StopToken);
            }
        }

        public String memberdelay_StartToken;

        public String memberdelay_StopToken;

        public void writememberdelay(StringBuffer strB, Queuesection impl) {
            if (impl.getMemberdelay() != null && memberdelay_StartToken != null) {
                strB.append(memberdelay_StartToken).append(
                        impl.getMemberdelay()).append(memberdelay_StopToken);
            }
        }

        public String timeoutrestart_StartToken;

        public String timeoutrestart_StopToken;

        public void writetimeoutrestart(StringBuffer strB, Queuesection impl) {
            if (impl.getTimeoutrestart() != null
                    && timeoutrestart_StartToken != null) {
                strB.append(timeoutrestart_StartToken).append(
                        impl.getTimeoutrestart()).append(
                        timeoutrestart_StopToken);
            }
        }
    }; // end of QueuesectionwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class QueuememberwriteHelper {

        public String tech_StartToken;

        public String tech_StopToken;

        public void writetech(StringBuffer strB, Queuemember impl) {
            if (impl.getTech() != null && tech_StartToken != null) {
                strB.append(tech_StartToken).append(impl.getTech()).append(
                        tech_StopToken);
            }
        }

        public String dialstring_StartToken;

        public String dialstring_StopToken;

        public void writedialstring(StringBuffer strB, Queuemember impl) {
            if (impl.getDialstring() != null && dialstring_StartToken != null) {
                strB.append(dialstring_StartToken).append(impl.getDialstring())
                        .append(dialstring_StopToken);
            }
        }
    }; // end of QueuememberwriteHelper Declaration

    protected QueuegeneralwriteHelper theQueuegeneralwriteHelper;

    protected QueuesectionwriteHelper theQueuesectionwriteHelper;

    protected QueuememberwriteHelper theQueuememberwriteHelper;

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
        if (data instanceof Queuegeneral) {
            writeQueuegeneral(strB, (Queuegeneral) data);
            return;
        }
        if (data instanceof Queuesection) {
            writeQueuesection(strB, (Queuesection) data);
            return;
        }
        if (data instanceof Queuemember) {
            writeQueuemember(strB, (Queuemember) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Queuegeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuegeneralFields(StringBuffer strB, Queuegeneral impl) {

        // felder schreiben
        theQueuegeneralwriteHelper.writepersistentmembers(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Queuegeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuegeneralAggregates(StringBuffer strB,
            Queuegeneral impl) {

        // aggregate schreiben
        // maps schreiben
        // QueuesectionMap
        for (Iterator iter = impl.getQueuesectionMap().iterator(); iter
                .hasNext();) {
            Queuesection mobj = (Queuesection) iter.next();
            writeQueuesection(strB, mobj);
        }

    }

    /**
     * schreibt ein Queuegeneral Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuegeneral(StringBuffer strB, Queuegeneral impl) {
        writeQueuegeneralFields(strB, impl);
        writeQueuegeneralAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Queuesection
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuesectionFields(StringBuffer strB, Queuesection impl) {

        // felder schreiben
        theQueuesectionwriteHelper.writemusiconhold(strB, impl);
        theQueuesectionwriteHelper.writesectionname(strB, impl);
        theQueuesectionwriteHelper.writeannounce(strB, impl);
        theQueuesectionwriteHelper.writestrategy(strB, impl);
        theQueuesectionwriteHelper.writeservicelevel(strB, impl);
        theQueuesectionwriteHelper.writecontext(strB, impl);
        theQueuesectionwriteHelper.writetimeout(strB, impl);
        theQueuesectionwriteHelper.writeretry(strB, impl);
        theQueuesectionwriteHelper.writeweight(strB, impl);
        theQueuesectionwriteHelper.writewrapuptime(strB, impl);
        theQueuesectionwriteHelper.writemaxlen(strB, impl);
        theQueuesectionwriteHelper.writeannouncefrequency(strB, impl);
        theQueuesectionwriteHelper.writeannounceholdtime(strB, impl);
        theQueuesectionwriteHelper.writeannounceroundseconds(strB, impl);
        theQueuesectionwriteHelper.writemonitorformat(strB, impl);
        theQueuesectionwriteHelper.writemonitorjoin(strB, impl);
        theQueuesectionwriteHelper.writejoinempty(strB, impl);
        theQueuesectionwriteHelper.writeleavewhenempty(strB, impl);
        theQueuesectionwriteHelper.writeeventwhencalled(strB, impl);
        theQueuesectionwriteHelper.writeeventmemberstatusoff(strB, impl);
        theQueuesectionwriteHelper.writereportholdtime(strB, impl);
        theQueuesectionwriteHelper.writememberdelay(strB, impl);
        theQueuesectionwriteHelper.writetimeoutrestart(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Queuesection
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuesectionAggregates(StringBuffer strB,
            Queuesection impl) {

        // aggregate schreiben
        // maps schreiben
        // QueuememberMap
        for (Iterator iter = impl.getQueuememberMap().iterator(); iter
                .hasNext();) {
            Queuemember mobj = (Queuemember) iter.next();
            writeQueuemember(strB, mobj);
        }

    }

    /**
     * schreibt ein Queuesection Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuesection(StringBuffer strB, Queuesection impl) {
        writeQueuesectionFields(strB, impl);
        writeQueuesectionAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Queuemember
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuememberFields(StringBuffer strB, Queuemember impl) {

        // felder schreiben
        theQueuememberwriteHelper.writetech(strB, impl);
        theQueuememberwriteHelper.writedialstring(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Queuemember
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuememberAggregates(StringBuffer strB,
            Queuemember impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Queuemember Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeQueuemember(StringBuffer strB, Queuemember impl) {
        writeQueuememberFields(strB, impl);
        writeQueuememberAggregates(strB, impl);

    }

    protected void initHelper() {
        theQueuegeneralwriteHelper = new QueuegeneralwriteHelper();
        theQueuegeneralwriteHelper.persistentmembers_StartToken = "persistentmembers=";
        theQueuegeneralwriteHelper.persistentmembers_StopToken = "\n";

        theQueuesectionwriteHelper = new QueuesectionwriteHelper();
        theQueuesectionwriteHelper.musiconhold_StartToken = "musiconhold=";
        theQueuesectionwriteHelper.musiconhold_StopToken = "\n";
        theQueuesectionwriteHelper.sectionname_StartToken = "sectionname=";
        theQueuesectionwriteHelper.sectionname_StopToken = "\n";
        theQueuesectionwriteHelper.announce_StartToken = "announce=";
        theQueuesectionwriteHelper.announce_StopToken = "\n";
        theQueuesectionwriteHelper.strategy_StartToken = "strategy=";
        theQueuesectionwriteHelper.strategy_StopToken = "\n";
        theQueuesectionwriteHelper.servicelevel_StartToken = "servicelevel=";
        theQueuesectionwriteHelper.servicelevel_StopToken = "\n";
        theQueuesectionwriteHelper.context_StartToken = "context=";
        theQueuesectionwriteHelper.context_StopToken = "\n";
        theQueuesectionwriteHelper.timeout_StartToken = "timeout=";
        theQueuesectionwriteHelper.timeout_StopToken = "\n";
        theQueuesectionwriteHelper.retry_StartToken = "retry=";
        theQueuesectionwriteHelper.retry_StopToken = "\n";
        theQueuesectionwriteHelper.weight_StartToken = "weight=";
        theQueuesectionwriteHelper.weight_StopToken = "\n";
        theQueuesectionwriteHelper.wrapuptime_StartToken = "wrapuptime=";
        theQueuesectionwriteHelper.wrapuptime_StopToken = "\n";
        theQueuesectionwriteHelper.maxlen_StartToken = "maxlen=";
        theQueuesectionwriteHelper.maxlen_StopToken = "\n";
        theQueuesectionwriteHelper.announcefrequency_StartToken = "announcefrequency=";
        theQueuesectionwriteHelper.announcefrequency_StopToken = "\n";
        theQueuesectionwriteHelper.announceholdtime_StartToken = "announceholdtime=";
        theQueuesectionwriteHelper.announceholdtime_StopToken = "\n";
        theQueuesectionwriteHelper.announceroundseconds_StartToken = "announceroundseconds=";
        theQueuesectionwriteHelper.announceroundseconds_StopToken = "\n";
        theQueuesectionwriteHelper.monitorformat_StartToken = "monitorformat=";
        theQueuesectionwriteHelper.monitorformat_StopToken = "\n";
        theQueuesectionwriteHelper.monitorjoin_StartToken = "monitorjoin=";
        theQueuesectionwriteHelper.monitorjoin_StopToken = "\n";
        theQueuesectionwriteHelper.joinempty_StartToken = "joinempty=";
        theQueuesectionwriteHelper.joinempty_StopToken = "\n";
        theQueuesectionwriteHelper.leavewhenempty_StartToken = "leavewhenempty=";
        theQueuesectionwriteHelper.leavewhenempty_StopToken = "\n";
        theQueuesectionwriteHelper.eventwhencalled_StartToken = "eventwhencalled=";
        theQueuesectionwriteHelper.eventwhencalled_StopToken = "\n";
        theQueuesectionwriteHelper.eventmemberstatusoff_StartToken = "eventmemberstatusoff=";
        theQueuesectionwriteHelper.eventmemberstatusoff_StopToken = "\n";
        theQueuesectionwriteHelper.reportholdtime_StartToken = "reportholdtime=";
        theQueuesectionwriteHelper.reportholdtime_StopToken = "\n";
        theQueuesectionwriteHelper.memberdelay_StartToken = "memberdelay=";
        theQueuesectionwriteHelper.memberdelay_StopToken = "\n";
        theQueuesectionwriteHelper.timeoutrestart_StartToken = "timeoutrestart=";
        theQueuesectionwriteHelper.timeoutrestart_StopToken = "\n";

        theQueuememberwriteHelper = new QueuememberwriteHelper();
        theQueuememberwriteHelper.tech_StartToken = "tech=";
        theQueuememberwriteHelper.tech_StopToken = "\n";
        theQueuememberwriteHelper.dialstring_StartToken = "dialstring=";
        theQueuememberwriteHelper.dialstring_StopToken = "\n";

    }

}
