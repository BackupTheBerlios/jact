/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.6 2006/01/09 10:17:34 urs
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
        if (data instanceof Agentsconf) {
            return writeAgentsconf(doc, (Agentsconf) data);
        }
        if (data instanceof Agents) {
            return writeAgents(doc, (Agents) data);
        }
        if (data instanceof Agentsrecording) {
            return writeAgentsrecording(doc, (Agentsrecording) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAgentsconf(Document doc, Agentsconf impl) {
        Element xAgentsconf = doc.createElement("Agentsconf");

        // felder schreiben
        if (impl.getAutologoff() != null)
            xAgentsconf.setAttribute("autologoff", impl.getAutologoff()
                    .toString());
        if (impl.getAckcall() != null)
            xAgentsconf.setAttribute("ackcall", impl.getAckcall().toString());
        if (impl.getWrapuptime() != null)
            xAgentsconf.setAttribute("wrapuptime", impl.getWrapuptime()
                    .toString());
        if (impl.getMusic_class() != null)
            xAgentsconf.setAttribute("music_class", impl.getMusic_class()
                    .toString());
        if (impl.getCustom_beep() != null)
            xAgentsconf.setAttribute("custom_beep", impl.getCustom_beep()
                    .toString());
        if (impl.getGroup() != null)
            xAgentsconf.setAttribute("group", impl.getGroup().toString());
        // aggregate schreiben
        Element xAgentsrecordingAgg = writeAgentsrecording(doc, impl
                .getAgentsrecording());
        xAgentsconf.appendChild(xAgentsrecordingAgg);

        // maps schreiben

        for (Iterator iter = impl.getAgentsMap().iterator(); iter.hasNext();) {
            Agents mobj = (Agents) iter.next();

            Element xAgents = writeAgents(doc, mobj);
            xAgentsconf.appendChild(xAgents);

        }
        doc.appendChild(xAgentsconf);
        return xAgentsconf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAgents(Document doc, Agents impl) {
        Element xAgents = doc.createElement("Agents");

        // felder schreiben
        if (impl.getAgentid() != null)
            xAgents.setAttribute("agentid", impl.getAgentid().toString());
        if (impl.getAgentpassword() != null)
            xAgents.setAttribute("agentpassword", impl.getAgentpassword()
                    .toString());
        if (impl.getName() != null)
            xAgents.setAttribute("name", impl.getName().toString());
        // aggregate schreiben

        doc.appendChild(xAgents);
        return xAgents;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAgentsrecording(Document doc,
            Agentsrecording impl) {
        Element xAgentsrecording = doc.createElement("Agentsrecording");

        // felder schreiben
        if (impl.getRecordagentcalls() != null)
            xAgentsrecording.setAttribute("recordagentcalls", impl
                    .getRecordagentcalls().toString());
        if (impl.getRecordformat() != null)
            xAgentsrecording.setAttribute("recordformat", impl
                    .getRecordformat().toString());
        if (impl.getCreatelink() != null)
            xAgentsrecording.setAttribute("createlink", impl.getCreatelink()
                    .toString());
        if (impl.getUrlprefix() != null)
            xAgentsrecording.setAttribute("urlprefix", impl.getUrlprefix()
                    .toString());
        if (impl.getSavecallsin() != null)
            xAgentsrecording.setAttribute("savecallsin", impl.getSavecallsin()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xAgentsrecording);
        return xAgentsrecording;
    }
}
