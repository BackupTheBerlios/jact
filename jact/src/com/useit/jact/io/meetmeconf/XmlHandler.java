/*
 * (c) urs zeidler
 */
package com.useit.jact.io.meetmeconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;
import com.useit.jact.model.meetmeconf.Meetmerooms;
import com.useit.jact.model.meetmeconf.MeetmeroomsImpl;

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
    protected Meetmerooms currentMeetmerooms = null;

    protected Meetmeconf currentMeetmeconf = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Meetmerooms")) {
            endMeetmerooms();
        }
        if (qName.equals("Meetmeconf")) {
            endMeetmeconf();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endMeetmerooms() {
        currentMeetmerooms = null;

    }

    /**
     * 
     */
    private void endMeetmeconf() {
        currentMeetmeconf = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Meetmerooms")) {
            currentMeetmerooms = readMeetmerooms(attributes);
            linkMeetmerooms();
        }
        if (qName.equals("Meetmeconf")) {
            currentMeetmeconf = readMeetmeconf(attributes);
            linkMeetmeconf();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Meetmeconf
     */
    protected void linkMeetmeconf() {

    }

    /**
     * lieﬂt die klasse Meetmeconf ein
     * 
     * @param attributes
     * @return Meetmeconf
     */
    protected Meetmeconf readMeetmeconf(Attributes attributes) {
        MeetmeconfImpl obj = new MeetmeconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("fileid");
        if (val != null)
            obj.setFileid(val);

        // finished reading attibutes of Meetmeconf
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Meetmerooms
     */
    protected void linkMeetmerooms() {

    }

    /**
     * lieﬂt die klasse Meetmerooms ein
     * 
     * @param attributes
     * @return Meetmerooms
     */
    protected Meetmerooms readMeetmerooms(Attributes attributes) {
        MeetmeroomsImpl obj = new MeetmeroomsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("confno");
        if (val != null)
            obj.setConfno(val);

        val = attributes.getValue("pincode");
        if (val != null)
            obj.setPincode(val);

        val = attributes.getValue("adminpin");
        if (val != null)
            obj.setAdminpin(val);

        // finished reading attibutes of Meetmerooms
        return obj;
    }

}
