/*
 * (c) urs zeidler
 */
package com.useit.jact.io.queueconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.QueuegeneralImpl;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.QueuememberImpl;
import com.useit.jact.model.queueconf.Queuesection;
import com.useit.jact.model.queueconf.QueuesectionImpl;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.8 2006/01/14 15:44:47 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected Queuegeneral currentQueuegeneral = null;

    protected Queuesection currentQueuesection = null;

    protected Queuemember currentQueuemember = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Queuegeneral")) {
            endQueuegeneral();
        }
        if (qName.equals("Queuesection")) {
            endQueuesection();
        }
        if (qName.equals("Queuemember")) {
            endQueuemember();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endQueuegeneral() {
        currentQueuegeneral = null;

    }

    /**
     * 
     */
    private void endQueuesection() {
        currentQueuesection = null;

    }

    /**
     * 
     */
    private void endQueuemember() {
        currentQueuemember = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Queuegeneral")) {
            currentQueuegeneral = readQueuegeneral(attributes);
            linkQueuegeneral();
        }
        if (qName.equals("Queuesection")) {
            currentQueuesection = readQueuesection(attributes);
            linkQueuesection();
        }
        if (qName.equals("Queuemember")) {
            currentQueuemember = readQueuemember(attributes);
            linkQueuemember();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Queuegeneral
     */
    protected void linkQueuegeneral() {

    }

    /**
     * lieﬂt die klasse Queuegeneral ein
     * 
     * @param attributes
     * @return Queuegeneral
     */
    protected Queuegeneral readQueuegeneral(Attributes attributes) {
        QueuegeneralImpl obj = new QueuegeneralImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("persistentmembers");
        if (val != null)
            obj.setPersistentmembers(new Boolean(val));

        // finished reading attibutes of Queuegeneral
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Queuesection
     */
    protected void linkQueuesection() {

    }

    /**
     * lieﬂt die klasse Queuesection ein
     * 
     * @param attributes
     * @return Queuesection
     */
    protected Queuesection readQueuesection(Attributes attributes) {
        QueuesectionImpl obj = new QueuesectionImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("sectionname");
        if (val != null)
            obj.setSectionname(val);

        val = attributes.getValue("musiconhold");
        if (val != null)
            obj.setMusiconhold(val);

        val = attributes.getValue("announce");
        if (val != null)
            obj.setAnnounce(val);

        val = attributes.getValue("strategy");
        if (val != null)
            obj.setStrategy(val);

        val = attributes.getValue("servicelevel");
        if (val != null)
            obj.setServicelevel(new Integer(val));

        val = attributes.getValue("context");
        if (val != null)
            obj.setContext(new PbxContext(val));

        val = attributes.getValue("timeout");
        if (val != null)
            obj.setTimeout(new Integer(val));

        val = attributes.getValue("retry");
        if (val != null)
            obj.setRetry(new Integer(val));

        val = attributes.getValue("weight");
        if (val != null)
            obj.setWeight(val);

        val = attributes.getValue("wrapuptime");
        if (val != null)
            obj.setWrapuptime(new Integer(val));

        val = attributes.getValue("maxlen");
        if (val != null)
            obj.setMaxlen(new Integer(val));

        val = attributes.getValue("announcefrequency");
        if (val != null)
            obj.setAnnouncefrequency(new Integer(val));

        val = attributes.getValue("announceholdtime");
        if (val != null)
            obj.setAnnounceholdtime(new Boolean(val));

        val = attributes.getValue("announceroundseconds");
        if (val != null)
            obj.setAnnounceroundseconds(val);

        val = attributes.getValue("monitorformat");
        if (val != null)
            obj.setMonitorformat(val);

        val = attributes.getValue("monitorjoin");
        if (val != null)
            obj.setMonitorjoin(new Boolean(val));

        val = attributes.getValue("joinempty");
        if (val != null)
            obj.setJoinempty(val);

        val = attributes.getValue("leavewhenempty");
        if (val != null)
            obj.setLeavewhenempty(val);

        val = attributes.getValue("eventwhencalled");
        if (val != null)
            obj.setEventwhencalled(new Boolean(val));

        val = attributes.getValue("eventmemberstatusoff");
        if (val != null)
            obj.setEventmemberstatusoff(new Boolean(val));

        val = attributes.getValue("reportholdtime");
        if (val != null)
            obj.setReportholdtime(new Boolean(val));

        val = attributes.getValue("memberdelay");
        if (val != null)
            obj.setMemberdelay(new Integer(val));

        val = attributes.getValue("timeoutrestart");
        if (val != null)
            obj.setTimeoutrestart(new Boolean(val));

        // finished reading attibutes of Queuesection
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Queuemember
     */
    protected void linkQueuemember() {

    }

    /**
     * lieﬂt die klasse Queuemember ein
     * 
     * @param attributes
     * @return Queuemember
     */
    protected Queuemember readQueuemember(Attributes attributes) {
        QueuememberImpl obj = new QueuememberImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("tech");
        if (val != null)
            obj.setTech(val);

        val = attributes.getValue("dialstring");
        if (val != null)
            obj.setDialstring(val);

        // finished reading attibutes of Queuemember
        return obj;
    }

}
