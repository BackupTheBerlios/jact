/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zaptelconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.ZaptelchannelsImpl;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.ZapteldynamicspanImpl;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.ZaptelspanImpl;
import com.useit.jact.model.zaptelconf.Zapteltonezone;
import com.useit.jact.model.zaptelconf.ZapteltonezoneImpl;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected Zapteltonezone currentZapteltonezone = null;

    protected Zaptelchannels currentZaptelchannels = null;

    protected Zaptelconf currentZaptelconf = null;

    protected Zapteldynamicspan currentZapteldynamicspan = null;

    protected Zaptelspan currentZaptelspan = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Zapteltonezone")) {
            endZapteltonezone();
        }
        if (qName.equals("Zaptelchannels")) {
            endZaptelchannels();
        }
        if (qName.equals("Zaptelconf")) {
            endZaptelconf();
        }
        if (qName.equals("Zapteldynamicspan")) {
            endZapteldynamicspan();
        }
        if (qName.equals("Zaptelspan")) {
            endZaptelspan();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endZapteltonezone() {
        currentZapteltonezone = null;

    }

    /**
     * 
     */
    private void endZaptelchannels() {
        currentZaptelchannels = null;

    }

    /**
     * 
     */
    private void endZaptelconf() {
        currentZaptelconf = null;

    }

    /**
     * 
     */
    private void endZapteldynamicspan() {
        currentZapteldynamicspan = null;

    }

    /**
     * 
     */
    private void endZaptelspan() {
        currentZaptelspan = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Zapteltonezone")) {
            currentZapteltonezone = readZapteltonezone(attributes);
            linkZapteltonezone();
        }
        if (qName.equals("Zaptelchannels")) {
            currentZaptelchannels = readZaptelchannels(attributes);
            linkZaptelchannels();
        }
        if (qName.equals("Zaptelconf")) {
            currentZaptelconf = readZaptelconf(attributes);
            linkZaptelconf();
        }
        if (qName.equals("Zapteldynamicspan")) {
            currentZapteldynamicspan = readZapteldynamicspan(attributes);
            linkZapteldynamicspan();
        }
        if (qName.equals("Zaptelspan")) {
            currentZaptelspan = readZaptelspan(attributes);
            linkZaptelspan();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zaptelchannels
     */
    protected void linkZaptelchannels() {

    }

    /**
     * lieﬂt die klasse Zaptelchannels ein
     * 
     * @param attributes
     * @return Zaptelchannels
     */
    protected Zaptelchannels readZaptelchannels(Attributes attributes) {
        ZaptelchannelsImpl obj = new ZaptelchannelsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("device");
        if (val != null)
            obj.setDevice(val);

        val = attributes.getValue("channellist");
        if (val != null)
            obj.setChannellist(val);

        // finished reading attibutes of Zaptelchannels
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zapteltonezone
     */
    protected void linkZapteltonezone() {

    }

    /**
     * lieﬂt die klasse Zapteltonezone ein
     * 
     * @param attributes
     * @return Zapteltonezone
     */
    protected Zapteltonezone readZapteltonezone(Attributes attributes) {
        ZapteltonezoneImpl obj = new ZapteltonezoneImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("zonename");
        if (val != null)
            obj.setZonename(val);

        // finished reading attibutes of Zapteltonezone
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zaptelspan
     */
    protected void linkZaptelspan() {

    }

    /**
     * lieﬂt die klasse Zaptelspan ein
     * 
     * @param attributes
     * @return Zaptelspan
     */
    protected Zaptelspan readZaptelspan(Attributes attributes) {
        ZaptelspanImpl obj = new ZaptelspanImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("span_num");
        if (val != null)
            obj.setSpan_num(new Integer(val));

        val = attributes.getValue("timing");
        if (val != null)
            obj.setTiming(new Integer(val));

        val = attributes.getValue("lbo");
        if (val != null)
            obj.setLbo(new Integer(val));

        val = attributes.getValue("framing");
        if (val != null)
            obj.setFraming(val);

        val = attributes.getValue("coding");
        if (val != null)
            obj.setCoding(val);

        val = attributes.getValue("yellow");
        if (val != null)
            obj.setYellow(val);

        // finished reading attibutes of Zaptelspan
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zapteldynamicspan
     */
    protected void linkZapteldynamicspan() {

    }

    /**
     * lieﬂt die klasse Zapteldynamicspan ein
     * 
     * @param attributes
     * @return Zapteldynamicspan
     */
    protected Zapteldynamicspan readZapteldynamicspan(Attributes attributes) {
        ZapteldynamicspanImpl obj = new ZapteldynamicspanImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("driver");
        if (val != null)
            obj.setDriver(val);

        val = attributes.getValue("address");
        if (val != null)
            obj.setAddress(val);

        val = attributes.getValue("numchans");
        if (val != null)
            obj.setNumchans(new Integer(val));

        val = attributes.getValue("timing");
        if (val != null)
            obj.setTiming(new Integer(val));

        // finished reading attibutes of Zapteldynamicspan
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zaptelconf
     */
    protected void linkZaptelconf() {

    }

    /**
     * lieﬂt die klasse Zaptelconf ein
     * 
     * @param attributes
     * @return Zaptelconf
     */
    protected Zaptelconf readZaptelconf(Attributes attributes) {
        ZaptelconfImpl obj = new ZaptelconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("defaultzone");
        if (val != null)
            obj.setDefaultzone(val);

        // finished reading attibutes of Zaptelconf
        return obj;
    }

}
