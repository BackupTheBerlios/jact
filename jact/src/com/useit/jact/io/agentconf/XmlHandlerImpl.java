/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import org.w3c.dom.Document;

import com.useit.jact.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.9 2006/01/09 19:00:45
 *          urs Exp $
 */
public class XmlHandlerImpl extends XmlHandler {

    private Object conf;

    /**
     * 
     */
    public XmlHandlerImpl() {
        super();
    }

    public Object getConf() {
        return conf;
    }

    /**
     * @param attributes
     * @return Agentsconf
     */
    protected void linkAgentsconf() {
        if (currentAgentsconf != null) {
            conf = currentAgentsconf;
        }
    }

    /**
     * @param attributes
     * @return Agents
     */
    protected void linkAgents() {
        if (currentAgents != null) {
            if (currentAgentsconf != null) {
                currentAgentsconf.addAgents(currentAgents);
            }

        }
    }

    /**
     * @param attributes
     * @return Agentsrecording
     */
    protected void linkAgentsrecording() {
        if (currentAgentsrecording != null) {
            if (currentAgentsconf != null) {
                currentAgentsconf.setAgentsrecording(currentAgentsrecording);
            }

        }
    }

    /**
     * @param filename
     * @param conf
     */
    public static void writeConf(String filename, Object conf) {
        Document doc = BasicSax.createDomDocument();
        XmlWriter.writeConf(doc, conf);
        BasicSax.writeXmlFile(doc, filename);

    }

    public static Object readConf(String filename) {
        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile(filename, hnd, false);
        return hnd.getConf();
    }

}
