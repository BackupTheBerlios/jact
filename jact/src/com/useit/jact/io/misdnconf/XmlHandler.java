/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdnconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnCryptkeyImpl;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnPortsImpl;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.MisdnSectionsImpl;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.types.Dialplan;
import com.useit.jact.model.types.MisdnPortOptions;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Presentation;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.10 2006/01/12 15:20:11
 *          urs Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected MisdnCryptkey currentMisdnCryptkey = null;

    protected MisdnPorts currentMisdnPorts = null;

    protected MisdnSections currentMisdnSections = null;

    protected Misdnconf currentMisdnconf = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("MisdnCryptkey")) {
            endMisdnCryptkey();
        }
        if (qName.equals("MisdnPorts")) {
            endMisdnPorts();
        }
        if (qName.equals("MisdnSections")) {
            endMisdnSections();
        }
        if (qName.equals("Misdnconf")) {
            endMisdnconf();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endMisdnCryptkey() {
        currentMisdnCryptkey = null;

    }

    /**
     * 
     */
    private void endMisdnPorts() {
        currentMisdnPorts = null;

    }

    /**
     * 
     */
    private void endMisdnSections() {
        currentMisdnSections = null;

    }

    /**
     * 
     */
    private void endMisdnconf() {
        currentMisdnconf = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("MisdnCryptkey")) {
            currentMisdnCryptkey = readMisdnCryptkey(attributes);
            linkMisdnCryptkey();
        }
        if (qName.equals("MisdnPorts")) {
            currentMisdnPorts = readMisdnPorts(attributes);
            linkMisdnPorts();
        }
        if (qName.equals("MisdnSections")) {
            currentMisdnSections = readMisdnSections(attributes);
            linkMisdnSections();
        }
        if (qName.equals("Misdnconf")) {
            currentMisdnconf = readMisdnconf(attributes);
            linkMisdnconf();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Misdnconf
     */
    protected void linkMisdnconf() {

    }

    /**
     * lieﬂt die klasse Misdnconf ein
     * 
     * @param attributes
     * @return Misdnconf
     */
    protected Misdnconf readMisdnconf(Attributes attributes) {
        MisdnconfImpl obj = new MisdnconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("debug");
        if (val != null)
            obj.setDebug(new Integer(val));

        val = attributes.getValue("tracefile");
        if (val != null)
            obj.setTracefile(val);

        val = attributes.getValue("trace_calls");
        if (val != null)
            obj.setTrace_calls(new Boolean(val));

        val = attributes.getValue("trace_dir");
        if (val != null)
            obj.setTrace_dir(val);

        val = attributes.getValue("bridging");
        if (val != null)
            obj.setBridging(new Boolean(val));

        val = attributes.getValue("stop_tone_after_first_digit");
        if (val != null)
            obj.setStop_tone_after_first_digit(new Boolean(val));

        val = attributes.getValue("append_digits2exten");
        if (val != null)
            obj.setAppend_digits2exten(new Boolean(val));

        val = attributes.getValue("l1_info_ok");
        if (val != null)
            obj.setL1_info_ok(new Boolean(val));

        val = attributes.getValue("clear_l3");
        if (val != null)
            obj.setClear_l3(new Boolean(val));

        val = attributes.getValue("dynamic_crypt");
        if (val != null)
            obj.setDynamic_crypt(new Boolean(val));

        val = attributes.getValue("crypt_prefix");
        if (val != null)
            obj.setCrypt_prefix(val);

        val = attributes.getValue("fileid");
        if (val != null)
            obj.setFileid(val);

        val = attributes.getValue("context");
        if (val != null)
            obj.setContext(new PbxContext(val));

        // finished reading attibutes of Misdnconf
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MisdnCryptkey
     */
    protected void linkMisdnCryptkey() {

    }

    /**
     * lieﬂt die klasse MisdnCryptkey ein
     * 
     * @param attributes
     * @return MisdnCryptkey
     */
    protected MisdnCryptkey readMisdnCryptkey(Attributes attributes) {
        MisdnCryptkeyImpl obj = new MisdnCryptkeyImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("keyname");
        if (val != null)
            obj.setKeyname(val);

        val = attributes.getValue("keyvalue");
        if (val != null)
            obj.setKeyvalue(val);

        // finished reading attibutes of MisdnCryptkey
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MisdnSections
     */
    protected void linkMisdnSections() {

    }

    /**
     * lieﬂt die klasse MisdnSections ein
     * 
     * @param attributes
     * @return MisdnSections
     */
    protected MisdnSections readMisdnSections(Attributes attributes) {
        MisdnSectionsImpl obj = new MisdnSectionsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("context");
        if (val != null)
            obj.setContext(new PbxContext(val));

        val = attributes.getValue("language");
        if (val != null)
            obj.setLanguage(val);

        val = attributes.getValue("nationalprefix");
        if (val != null)
            obj.setNationalprefix(val);

        val = attributes.getValue("internationalprefix");
        if (val != null)
            obj.setInternationalprefix(val);

        val = attributes.getValue("rxgain");
        if (val != null)
            obj.setRxgain(new Integer(val));

        val = attributes.getValue("txgain");
        if (val != null)
            obj.setTxgain(new Integer(val));

        val = attributes.getValue("te_choose_channel");
        if (val != null)
            obj.setTe_choose_channel(new Boolean(val));

        val = attributes.getValue("early_bconnect");
        if (val != null)
            obj.setEarly_bconnect(new Boolean(val));

        val = attributes.getValue("dialplan");
        if (val != null)
            obj.setDialplan(new Dialplan(val));

        val = attributes.getValue("use_callingpres");
        if (val != null)
            obj.setUse_callingpres(new Boolean(val));

        val = attributes.getValue("always_immediate");
        if (val != null)
            obj.setAlways_immediate(new Boolean(val));

        val = attributes.getValue("immediate");
        if (val != null)
            obj.setImmediate(new Boolean(val));

        val = attributes.getValue("hold_allowed");
        if (val != null)
            obj.setHold_allowed(new Boolean(val));

        val = attributes.getValue("pickgroup");
        if (val != null)
            obj.setPickgroup(val);

        val = attributes.getValue("callgroup");
        if (val != null)
            obj.setCallgroup(val);

        val = attributes.getValue("presentation");
        if (val != null)
            obj.setPresentation(new Presentation(val));

        val = attributes.getValue("echocancel");
        if (val != null)
            obj.setEchocancel(new Boolean(val));

        val = attributes.getValue("echocancelwhenbridged");
        if (val != null)
            obj.setEchocancelwhenbridged(new Boolean(val));

        val = attributes.getValue("echotraining");
        if (val != null)
            obj.setEchotraining(val);

        val = attributes.getValue("sectionname");
        if (val != null)
            obj.setSectionname(val);

        // finished reading attibutes of MisdnSections
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MisdnPorts
     */
    protected void linkMisdnPorts() {

    }

    /**
     * lieﬂt die klasse MisdnPorts ein
     * 
     * @param attributes
     * @return MisdnPorts
     */
    protected MisdnPorts readMisdnPorts(Attributes attributes) {
        MisdnPortsImpl obj = new MisdnPortsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("portN");
        if (val != null)
            obj.setPortN(new Integer(val));

        val = attributes.getValue("portOption");
        if (val != null)
            obj.setPortOption(new MisdnPortOptions(val));

        // finished reading attibutes of MisdnPorts
        return obj;
    }

}
