/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class AgentsconfwriteHelper {

        public String autologoff_StartToken;

        public String autologoff_StopToken;

        public void writeautologoff(StringBuffer strB, Agentsconf impl) {
            if (impl.getAutologoff() != null && autologoff_StartToken != null) {
                strB.append(autologoff_StartToken).append(impl.getAutologoff())
                        .append(autologoff_StopToken);
            }
        }

        public String ackcall_StartToken;

        public String ackcall_StopToken;

        public void writeackcall(StringBuffer strB, Agentsconf impl) {
            if (impl.getAckcall() != null && ackcall_StartToken != null) {
                strB.append(ackcall_StartToken).append(impl.getAckcall())
                        .append(ackcall_StopToken);
            }
        }

        public String wrapuptime_StartToken;

        public String wrapuptime_StopToken;

        public void writewrapuptime(StringBuffer strB, Agentsconf impl) {
            if (impl.getWrapuptime() != null && wrapuptime_StartToken != null) {
                strB.append(wrapuptime_StartToken).append(impl.getWrapuptime())
                        .append(wrapuptime_StopToken);
            }
        }

        public String music_class_StartToken;

        public String music_class_StopToken;

        public void writemusic_class(StringBuffer strB, Agentsconf impl) {
            if (impl.getMusic_class() != null && music_class_StartToken != null) {
                strB.append(music_class_StartToken).append(
                        impl.getMusic_class()).append(music_class_StopToken);
            }
        }

        public String custom_beep_StartToken;

        public String custom_beep_StopToken;

        public void writecustom_beep(StringBuffer strB, Agentsconf impl) {
            if (impl.getCustom_beep() != null && custom_beep_StartToken != null) {
                strB.append(custom_beep_StartToken).append(
                        impl.getCustom_beep()).append(custom_beep_StopToken);
            }
        }

        public String group_StartToken;

        public String group_StopToken;

        public void writegroup(StringBuffer strB, Agentsconf impl) {
            if (impl.getGroup() != null && group_StartToken != null) {
                strB.append(group_StartToken).append(impl.getGroup()).append(
                        group_StopToken);
            }
        }
    }; // end of AgentsconfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class AgentswriteHelper {

        public String agentid_StartToken;

        public String agentid_StopToken;

        public void writeagentid(StringBuffer strB, Agents impl) {
            if (impl.getAgentid() != null && agentid_StartToken != null) {
                strB.append(agentid_StartToken).append(impl.getAgentid())
                        .append(agentid_StopToken);
            }
        }

        public String agentpassword_StartToken;

        public String agentpassword_StopToken;

        public void writeagentpassword(StringBuffer strB, Agents impl) {
            if (impl.getAgentpassword() != null
                    && agentpassword_StartToken != null) {
                strB.append(agentpassword_StartToken).append(
                        impl.getAgentpassword())
                        .append(agentpassword_StopToken);
            }
        }

        public String name_StartToken;

        public String name_StopToken;

        public void writename(StringBuffer strB, Agents impl) {
            if (impl.getName() != null && name_StartToken != null) {
                strB.append(name_StartToken).append(impl.getName()).append(
                        name_StopToken);
            }
        }
    }; // end of AgentswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class AgentsrecordingwriteHelper {

        public String recordagentcalls_StartToken;

        public String recordagentcalls_StopToken;

        public void writerecordagentcalls(StringBuffer strB,
                Agentsrecording impl) {
            if (impl.getRecordagentcalls() != null
                    && recordagentcalls_StartToken != null) {
                strB.append(recordagentcalls_StartToken).append(
                        impl.getRecordagentcalls()).append(
                        recordagentcalls_StopToken);
            }
        }

        public String recordformat_StartToken;

        public String recordformat_StopToken;

        public void writerecordformat(StringBuffer strB, Agentsrecording impl) {
            if (impl.getRecordformat() != null
                    && recordformat_StartToken != null) {
                strB.append(recordformat_StartToken).append(
                        impl.getRecordformat()).append(recordformat_StopToken);
            }
        }

        public String createlink_StartToken;

        public String createlink_StopToken;

        public void writecreatelink(StringBuffer strB, Agentsrecording impl) {
            if (impl.getCreatelink() != null && createlink_StartToken != null) {
                strB.append(createlink_StartToken).append(impl.getCreatelink())
                        .append(createlink_StopToken);
            }
        }

        public String urlprefix_StartToken;

        public String urlprefix_StopToken;

        public void writeurlprefix(StringBuffer strB, Agentsrecording impl) {
            if (impl.getUrlprefix() != null && urlprefix_StartToken != null) {
                strB.append(urlprefix_StartToken).append(impl.getUrlprefix())
                        .append(urlprefix_StopToken);
            }
        }

        public String savecallsin_StartToken;

        public String savecallsin_StopToken;

        public void writesavecallsin(StringBuffer strB, Agentsrecording impl) {
            if (impl.getSavecallsin() != null && savecallsin_StartToken != null) {
                strB.append(savecallsin_StartToken).append(
                        impl.getSavecallsin()).append(savecallsin_StopToken);
            }
        }
    }; // end of AgentsrecordingwriteHelper Declaration

    protected AgentsconfwriteHelper theAgentsconfwriteHelper;

    protected AgentswriteHelper theAgentswriteHelper;

    protected AgentsrecordingwriteHelper theAgentsrecordingwriteHelper;

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
        if (data instanceof Agentsconf) {
            writeAgentsconf(strB, (Agentsconf) data);
            return;
        }
        if (data instanceof Agents) {
            writeAgents(strB, (Agents) data);
            return;
        }
        if (data instanceof Agentsrecording) {
            writeAgentsrecording(strB, (Agentsrecording) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Agentsconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsconfFields(StringBuffer strB, Agentsconf impl) {

        // felder schreiben
        theAgentsconfwriteHelper.writeautologoff(strB, impl);
        theAgentsconfwriteHelper.writeackcall(strB, impl);
        theAgentsconfwriteHelper.writewrapuptime(strB, impl);
        theAgentsconfwriteHelper.writemusic_class(strB, impl);
        theAgentsconfwriteHelper.writecustom_beep(strB, impl);
        theAgentsconfwriteHelper.writegroup(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Agentsconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsconfAggregates(StringBuffer strB, Agentsconf impl) {

        // aggregate schreiben
        // Agentsrecording
        writeAgentsrecording(strB, impl.getAgentsrecording());
        // maps schreiben
        // AgentsMap
        for (Iterator iter = impl.getAgentsMap().iterator(); iter.hasNext();) {
            Agents mobj = (Agents) iter.next();
            writeAgents(strB, mobj);
        }

    }

    /**
     * schreibt ein Agentsconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsconf(StringBuffer strB, Agentsconf impl) {
        writeAgentsconfFields(strB, impl);
        writeAgentsconfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Agents
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsFields(StringBuffer strB, Agents impl) {

        // felder schreiben
        theAgentswriteHelper.writeagentid(strB, impl);
        theAgentswriteHelper.writeagentpassword(strB, impl);
        theAgentswriteHelper.writename(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Agents
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsAggregates(StringBuffer strB, Agents impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Agents Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgents(StringBuffer strB, Agents impl) {
        writeAgentsFields(strB, impl);
        writeAgentsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Agentsrecording
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsrecordingFields(StringBuffer strB,
            Agentsrecording impl) {

        // felder schreiben
        theAgentsrecordingwriteHelper.writerecordagentcalls(strB, impl);
        theAgentsrecordingwriteHelper.writerecordformat(strB, impl);
        theAgentsrecordingwriteHelper.writecreatelink(strB, impl);
        theAgentsrecordingwriteHelper.writeurlprefix(strB, impl);
        theAgentsrecordingwriteHelper.writesavecallsin(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Agentsrecording
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsrecordingAggregates(StringBuffer strB,
            Agentsrecording impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Agentsrecording Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsrecording(StringBuffer strB, Agentsrecording impl) {
        writeAgentsrecordingFields(strB, impl);
        writeAgentsrecordingAggregates(strB, impl);

    }

    protected void initHelper() {
        theAgentsconfwriteHelper = new AgentsconfwriteHelper();
        theAgentsconfwriteHelper.autologoff_StartToken = "autologoff=";
        theAgentsconfwriteHelper.autologoff_StopToken = "\n";
        theAgentsconfwriteHelper.ackcall_StartToken = "ackcall=";
        theAgentsconfwriteHelper.ackcall_StopToken = "\n";
        theAgentsconfwriteHelper.wrapuptime_StartToken = "wrapuptime=";
        theAgentsconfwriteHelper.wrapuptime_StopToken = "\n";
        theAgentsconfwriteHelper.music_class_StartToken = "music_class=";
        theAgentsconfwriteHelper.music_class_StopToken = "\n";
        theAgentsconfwriteHelper.custom_beep_StartToken = "custom_beep=";
        theAgentsconfwriteHelper.custom_beep_StopToken = "\n";
        theAgentsconfwriteHelper.group_StartToken = "group=";
        theAgentsconfwriteHelper.group_StopToken = "\n";

        theAgentswriteHelper = new AgentswriteHelper();
        theAgentswriteHelper.agentid_StartToken = "agentid=";
        theAgentswriteHelper.agentid_StopToken = "\n";
        theAgentswriteHelper.agentpassword_StartToken = "agentpassword=";
        theAgentswriteHelper.agentpassword_StopToken = "\n";
        theAgentswriteHelper.name_StartToken = "name=";
        theAgentswriteHelper.name_StopToken = "\n";

        theAgentsrecordingwriteHelper = new AgentsrecordingwriteHelper();
        theAgentsrecordingwriteHelper.recordagentcalls_StartToken = "recordagentcalls=";
        theAgentsrecordingwriteHelper.recordagentcalls_StopToken = "\n";
        theAgentsrecordingwriteHelper.recordformat_StartToken = "recordformat=";
        theAgentsrecordingwriteHelper.recordformat_StopToken = "\n";
        theAgentsrecordingwriteHelper.createlink_StartToken = "createlink=";
        theAgentsrecordingwriteHelper.createlink_StopToken = "\n";
        theAgentsrecordingwriteHelper.urlprefix_StartToken = "urlprefix=";
        theAgentsrecordingwriteHelper.urlprefix_StopToken = "\n";
        theAgentsrecordingwriteHelper.savecallsin_StartToken = "savecallsin=";
        theAgentsrecordingwriteHelper.savecallsin_StopToken = "\n";

    }

}
