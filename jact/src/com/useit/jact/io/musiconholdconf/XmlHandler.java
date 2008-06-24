/*
 * (c) urs zeidler
 */
package com.useit.jact.io.musiconholdconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.MohClassesImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.7 2006/01/12 15:20:12 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected MohClasses currentMohClasses = null;

    protected Music_on_HoldConf currentMusic_on_HoldConf = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("MohClasses")) {
            endMohClasses();
        }
        if (qName.equals("Music_on_HoldConf")) {
            endMusic_on_HoldConf();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endMohClasses() {
        currentMohClasses = null;

    }

    /**
     * 
     */
    private void endMusic_on_HoldConf() {
        currentMusic_on_HoldConf = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("MohClasses")) {
            currentMohClasses = readMohClasses(attributes);
            linkMohClasses();
        }
        if (qName.equals("Music_on_HoldConf")) {
            currentMusic_on_HoldConf = readMusic_on_HoldConf(attributes);
            linkMusic_on_HoldConf();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return MohClasses
     */
    protected void linkMohClasses() {

    }

    /**
     * lieﬂt die klasse MohClasses ein
     * 
     * @param attributes
     * @return MohClasses
     */
    protected MohClasses readMohClasses(Attributes attributes) {
        MohClassesImpl obj = new MohClassesImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("name");
        if (val != null)
            obj.setName(val);

        val = attributes.getValue("player");
        if (val != null)
            obj.setPlayer(val);

        val = attributes.getValue("mohdir");
        if (val != null)
            obj.setMohdir(val);

        val = attributes.getValue("mohpara");
        if (val != null)
            obj.setMohpara(val);

        // finished reading attibutes of MohClasses
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Music_on_HoldConf
     */
    protected void linkMusic_on_HoldConf() {

    }

    /**
     * lieﬂt die klasse Music_on_HoldConf ein
     * 
     * @param attributes
     * @return Music_on_HoldConf
     */
    protected Music_on_HoldConf readMusic_on_HoldConf(Attributes attributes) {
        Music_on_HoldConfImpl obj = new Music_on_HoldConfImpl();
        // felder schreiben
        String val;
        // finished reading attibutes of Music_on_HoldConf
        return obj;
    }

}
