/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import org.apache.log4j.Logger;

import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.8 2006/01/13 18:31:03
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
        theAgentswriteHelper.agentid_StartToken = "agent => ";
        theAgentswriteHelper.agentid_StopToken = "";
        theAgentswriteHelper.agentpassword_StartToken = ",";
        theAgentswriteHelper.agentpassword_StopToken = "";
        theAgentswriteHelper.name_StartToken = ",";
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

    /**
     * schreibt ein Agentsconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsconf(StringBuffer strB, Agentsconf impl) {
        strB.append(";agents config generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.GENERAL);
        super.writeAgentsconf(strB, impl);

    }

    /**
     * schreibt ein Agents Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgents(StringBuffer strB, Agents impl) {
        writeComment(strB, impl);
        // writeSecHeader(strB, ConfReaderImpl.GENERAL);
        super.writeAgents(strB, impl);

    }

    /**
     * schreibt ein Agentsrecording Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAgentsrecording(StringBuffer strB, Agentsrecording impl) {
        writeComment(strB, impl);
        super.writeAgentsrecording(strB, impl);

    }

}