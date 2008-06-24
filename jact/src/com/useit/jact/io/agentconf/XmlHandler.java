/*
 * (c) urs zeidler
 */
package com.useit.jact.io.agentconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.AgentsImpl;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.AgentsconfImpl;
import com.useit.jact.model.agentconf.Agentsrecording;
import com.useit.jact.model.agentconf.AgentsrecordingImpl;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.7 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected Agentsconf currentAgentsconf = null;

    protected Agents currentAgents = null;

    protected Agentsrecording currentAgentsrecording = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Agentsconf")) {
            endAgentsconf();
        }
        if (qName.equals("Agents")) {
            endAgents();
        }
        if (qName.equals("Agentsrecording")) {
            endAgentsrecording();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endAgentsconf() {
        currentAgentsconf = null;

    }

    /**
     * 
     */
    private void endAgents() {
        currentAgents = null;

    }

    /**
     * 
     */
    private void endAgentsrecording() {
        currentAgentsrecording = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Agentsconf")) {
            currentAgentsconf = readAgentsconf(attributes);
            linkAgentsconf();
        }
        if (qName.equals("Agents")) {
            currentAgents = readAgents(attributes);
            linkAgents();
        }
        if (qName.equals("Agentsrecording")) {
            currentAgentsrecording = readAgentsrecording(attributes);
            linkAgentsrecording();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Agents
     */
    protected void linkAgents() {

    }

    /**
     * lieﬂt die klasse Agents ein
     * 
     * @param attributes
     * @return Agents
     */
    protected Agents readAgents(Attributes attributes) {
        AgentsImpl obj = new AgentsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("agentid");
        if (val != null)
            obj.setAgentid(val);

        val = attributes.getValue("agentpassword");
        if (val != null)
            obj.setAgentpassword(val);

        val = attributes.getValue("name");
        if (val != null)
            obj.setName(val);

        // finished reading attibutes of Agents
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Agentsconf
     */
    protected void linkAgentsconf() {

    }

    /**
     * lieﬂt die klasse Agentsconf ein
     * 
     * @param attributes
     * @return Agentsconf
     */
    protected Agentsconf readAgentsconf(Attributes attributes) {
        AgentsconfImpl obj = new AgentsconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("autologoff");
        if (val != null)
            obj.setAutologoff(val);

        val = attributes.getValue("ackcall");
        if (val != null)
            obj.setAckcall(val);

        val = attributes.getValue("wrapuptime");
        if (val != null)
            obj.setWrapuptime(val);

        val = attributes.getValue("music_class");
        if (val != null)
            obj.setMusic_class(val);

        val = attributes.getValue("custom_beep");
        if (val != null)
            obj.setCustom_beep(val);

        val = attributes.getValue("group");
        if (val != null)
            obj.setGroup(val);

        // finished reading attibutes of Agentsconf
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Agentsrecording
     */
    protected void linkAgentsrecording() {

    }

    /**
     * lieﬂt die klasse Agentsrecording ein
     * 
     * @param attributes
     * @return Agentsrecording
     */
    protected Agentsrecording readAgentsrecording(Attributes attributes) {
        AgentsrecordingImpl obj = new AgentsrecordingImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("recordagentcalls");
        if (val != null)
            obj.setRecordagentcalls(new Boolean(val));

        val = attributes.getValue("recordformat");
        if (val != null)
            obj.setRecordformat(val);

        val = attributes.getValue("createlink");
        if (val != null)
            obj.setCreatelink(val);

        val = attributes.getValue("urlprefix");
        if (val != null)
            obj.setUrlprefix(val);

        val = attributes.getValue("savecallsin");
        if (val != null)
            obj.setSavecallsin(val);

        // finished reading attibutes of Agentsrecording
        return obj;
    }

}
