/*
 * (c) urs zeidler
 */
package com.useit.jact.io.indicationsconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.CustomToneImpl;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;
import com.useit.jact.model.indicationsconf.ToneDefinitions;
import com.useit.jact.model.indicationsconf.ToneDefinitionsImpl;

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
    protected ToneDefinitions currentToneDefinitions = null;

    protected Indicationsconf currentIndicationsconf = null;

    protected CustomTone currentCustomTone = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("ToneDefinitions")) {
            endToneDefinitions();
        }
        if (qName.equals("Indicationsconf")) {
            endIndicationsconf();
        }
        if (qName.equals("CustomTone")) {
            endCustomTone();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endToneDefinitions() {
        currentToneDefinitions = null;

    }

    /**
     * 
     */
    private void endIndicationsconf() {
        currentIndicationsconf = null;

    }

    /**
     * 
     */
    private void endCustomTone() {
        currentCustomTone = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("ToneDefinitions")) {
            currentToneDefinitions = readToneDefinitions(attributes);
            linkToneDefinitions();
        }
        if (qName.equals("Indicationsconf")) {
            currentIndicationsconf = readIndicationsconf(attributes);
            linkIndicationsconf();
        }
        if (qName.equals("CustomTone")) {
            currentCustomTone = readCustomTone(attributes);
            linkCustomTone();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return ToneDefinitions
     */
    protected void linkToneDefinitions() {

    }

    /**
     * lieﬂt die klasse ToneDefinitions ein
     * 
     * @param attributes
     * @return ToneDefinitions
     */
    protected ToneDefinitions readToneDefinitions(Attributes attributes) {
        ToneDefinitionsImpl obj = new ToneDefinitionsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("countrycode");
        if (val != null)
            obj.setCountrycode(val);

        val = attributes.getValue("description");
        if (val != null)
            obj.setDescription(val);

        val = attributes.getValue("alias");
        if (val != null)
            obj.setAlias(val);

        val = attributes.getValue("ringcadence");
        if (val != null)
            obj.setRingcadence(val);

        val = attributes.getValue("dial");
        if (val != null)
            obj.setDial(val);

        val = attributes.getValue("busy");
        if (val != null)
            obj.setBusy(val);

        val = attributes.getValue("ring");
        if (val != null)
            obj.setRing(val);

        val = attributes.getValue("congestion");
        if (val != null)
            obj.setCongestion(val);

        val = attributes.getValue("callwaiting");
        if (val != null)
            obj.setCallwaiting(val);

        val = attributes.getValue("dialrecall");
        if (val != null)
            obj.setDialrecall(val);

        val = attributes.getValue("record");
        if (val != null)
            obj.setRecord(val);

        val = attributes.getValue("info");
        if (val != null)
            obj.setInfo(val);

        // finished reading attibutes of ToneDefinitions
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return CustomTone
     */
    protected void linkCustomTone() {

    }

    /**
     * lieﬂt die klasse CustomTone ein
     * 
     * @param attributes
     * @return CustomTone
     */
    protected CustomTone readCustomTone(Attributes attributes) {
        CustomToneImpl obj = new CustomToneImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("tonecode");
        if (val != null)
            obj.setTonecode(val);

        val = attributes.getValue("name");
        if (val != null)
            obj.setName(val);

        // finished reading attibutes of CustomTone
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Indicationsconf
     */
    protected void linkIndicationsconf() {

    }

    /**
     * lieﬂt die klasse Indicationsconf ein
     * 
     * @param attributes
     * @return Indicationsconf
     */
    protected Indicationsconf readIndicationsconf(Attributes attributes) {
        IndicationsconfImpl obj = new IndicationsconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("country");
        if (val != null)
            obj.setCountry(val);

        // finished reading attibutes of Indicationsconf
        return obj;
    }

}
