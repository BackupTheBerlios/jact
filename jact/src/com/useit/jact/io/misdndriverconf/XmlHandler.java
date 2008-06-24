/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdndriverconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnCardsImpl;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;
import com.useit.jact.model.misdndriverconf.MisdncardPortsImpl;
import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;
import com.useit.jact.model.types.MisdnPortOptions;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.6 2006/01/12 15:20:12 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected MisdnCards currentMisdnCards = null;

    protected MisdnDriverConf currentMisdnDriverConf = null;

    protected MisdncardPorts currentMisdncardPorts = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("MisdnCards")) {
            endMisdnCards();
        }
        if (qName.equals("MisdnDriverConf")) {
            endMisdnDriverConf();
        }
        if (qName.equals("MisdncardPorts")) {
            endMisdncardPorts();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endMisdnCards() {
        currentMisdnCards = null;

    }

    /**
     * 
     */
    private void endMisdnDriverConf() {
        currentMisdnDriverConf = null;

    }

    /**
     * 
     */
    private void endMisdncardPorts() {
        currentMisdncardPorts = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("MisdnCards")) {
            currentMisdnCards = readMisdnCards(attributes);
            linkMisdnCards();
        }
        if (qName.equals("MisdnDriverConf")) {
            currentMisdnDriverConf = readMisdnDriverConf(attributes);
            linkMisdnDriverConf();
        }
        if (qName.equals("MisdncardPorts")) {
            currentMisdncardPorts = readMisdncardPorts(attributes);
            linkMisdncardPorts();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MisdncardPorts
     */
    protected void linkMisdncardPorts() {

    }

    /**
     * lieﬂt die klasse MisdncardPorts ein
     * 
     * @param attributes
     * @return MisdncardPorts
     */
    protected MisdncardPorts readMisdncardPorts(Attributes attributes) {
        MisdncardPortsImpl obj = new MisdncardPortsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("portN");
        if (val != null)
            obj.setPortN(new Integer(val));

        val = attributes.getValue("portOption");
        if (val != null)
            obj.setPortOption(new MisdnPortOptions(val));

        val = attributes.getValue("mPortOption");
        if (val != null)
            obj.setMPortOption(new MPortOptionSet(val));

        // finished reading attibutes of MisdncardPorts
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MisdnCards
     */
    protected void linkMisdnCards() {

    }

    /**
     * lieﬂt die klasse MisdnCards ein
     * 
     * @param attributes
     * @return MisdnCards
     */
    protected MisdnCards readMisdnCards(Attributes attributes) {
        MisdnCardsImpl obj = new MisdnCardsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("cardName");
        if (val != null)
            obj.setCardName(val);

        val = attributes.getValue("cardType");
        if (val != null)
            obj.setCardType(new MisdnCardTypes(val));

        val = attributes.getValue("cardOptions");
        if (val != null)
            obj.setCardOptions(new MCardOptionSet(val));

        // finished reading attibutes of MisdnCards
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MisdnDriverConf
     */
    protected void linkMisdnDriverConf() {

    }

    /**
     * lieﬂt die klasse MisdnDriverConf ein
     * 
     * @param attributes
     * @return MisdnDriverConf
     */
    protected MisdnDriverConf readMisdnDriverConf(Attributes attributes) {
        MisdnDriverConfImpl obj = new MisdnDriverConfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("poll");
        if (val != null)
            obj.setPoll(new Integer(val));

        val = attributes.getValue("pcm");
        if (val != null)
            obj.setPcm(new Boolean(val));

        val = attributes.getValue("debug");
        if (val != null)
            obj.setDebug(new Integer(val));

        // finished reading attibutes of MisdnDriverConf
        return obj;
    }

}
