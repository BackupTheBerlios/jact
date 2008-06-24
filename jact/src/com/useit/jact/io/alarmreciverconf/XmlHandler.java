/*
 * (c) urs zeidler
 */
package com.useit.jact.io.alarmreciverconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;
import com.useit.jact.model.alarmreciverconf.AlarmreceiverconfImpl;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.5 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected Alarmreceiverconf currentAlarmreceiverconf = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Alarmreceiverconf")) {
            endAlarmreceiverconf();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endAlarmreceiverconf() {
        currentAlarmreceiverconf = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Alarmreceiverconf")) {
            currentAlarmreceiverconf = readAlarmreceiverconf(attributes);
            linkAlarmreceiverconf();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Alarmreceiverconf
     */
    protected void linkAlarmreceiverconf() {

    }

    /**
     * lieﬂt die klasse Alarmreceiverconf ein
     * 
     * @param attributes
     * @return Alarmreceiverconf
     */
    protected Alarmreceiverconf readAlarmreceiverconf(Attributes attributes) {
        AlarmreceiverconfImpl obj = new AlarmreceiverconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("timestampformat");
        if (val != null)
            obj.setTimestampformat(val);

        val = attributes.getValue("eventcmd");
        if (val != null)
            obj.setEventcmd(val);

        val = attributes.getValue("eventspooldir");
        if (val != null)
            obj.setEventspooldir(val);

        val = attributes.getValue("logindividualevents");
        if (val != null)
            obj.setLogindividualevents(val);

        val = attributes.getValue("fdtimeout");
        if (val != null)
            obj.setFdtimeout(new Integer(val));

        val = attributes.getValue("sdtimeout");
        if (val != null)
            obj.setSdtimeout(new Integer(val));

        val = attributes.getValue("loudness");
        if (val != null)
            obj.setLoudness(new Integer(val));

        val = attributes.getValue("dbfamily");
        if (val != null)
            obj.setDbfamily(val);

        // finished reading attibutes of Alarmreceiverconf
        return obj;
    }

}
