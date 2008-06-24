/*
 * (c) urs zeidler
 */
package com.useit.jact.io.managerconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.ManagerSectionImpl;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagerdenyImpl;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.ManagergeneralSectionImpl;
import com.useit.jact.model.managerconf.Managerpermit;
import com.useit.jact.model.managerconf.ManagerpermitImpl;

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
    protected ManagergeneralSection currentManagergeneralSection = null;

    protected Managerdeny currentManagerdeny = null;

    protected ManagerSection currentManagerSection = null;

    protected Managerpermit currentManagerpermit = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("ManagergeneralSection")) {
            endManagergeneralSection();
        }
        if (qName.equals("Managerdeny")) {
            endManagerdeny();
        }
        if (qName.equals("ManagerSection")) {
            endManagerSection();
        }
        if (qName.equals("Managerpermit")) {
            endManagerpermit();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endManagergeneralSection() {
        currentManagergeneralSection = null;

    }

    /**
     * 
     */
    private void endManagerdeny() {
        currentManagerdeny = null;

    }

    /**
     * 
     */
    private void endManagerSection() {
        currentManagerSection = null;

    }

    /**
     * 
     */
    private void endManagerpermit() {
        currentManagerpermit = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("ManagergeneralSection")) {
            currentManagergeneralSection = readManagergeneralSection(attributes);
            linkManagergeneralSection();
        }
        if (qName.equals("Managerdeny")) {
            currentManagerdeny = readManagerdeny(attributes);
            linkManagerdeny();
        }
        if (qName.equals("ManagerSection")) {
            currentManagerSection = readManagerSection(attributes);
            linkManagerSection();
        }
        if (qName.equals("Managerpermit")) {
            currentManagerpermit = readManagerpermit(attributes);
            linkManagerpermit();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return ManagerSection
     */
    protected void linkManagerSection() {

    }

    /**
     * lieﬂt die klasse ManagerSection ein
     * 
     * @param attributes
     * @return ManagerSection
     */
    protected ManagerSection readManagerSection(Attributes attributes) {
        ManagerSectionImpl obj = new ManagerSectionImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("username");
        if (val != null)
            obj.setUsername(val);

        val = attributes.getValue("secret");
        if (val != null)
            obj.setSecret(val);

        val = attributes.getValue("read");
        if (val != null)
            obj.setRead(val);

        val = attributes.getValue("write");
        if (val != null)
            obj.setWrite(val);

        // finished reading attibutes of ManagerSection
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Managerdeny
     */
    protected void linkManagerdeny() {

    }

    /**
     * lieﬂt die klasse Managerdeny ein
     * 
     * @param attributes
     * @return Managerdeny
     */
    protected Managerdeny readManagerdeny(Attributes attributes) {
        ManagerdenyImpl obj = new ManagerdenyImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("value");
        if (val != null)
            obj.setValue(val);

        // finished reading attibutes of Managerdeny
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Managerpermit
     */
    protected void linkManagerpermit() {

    }

    /**
     * lieﬂt die klasse Managerpermit ein
     * 
     * @param attributes
     * @return Managerpermit
     */
    protected Managerpermit readManagerpermit(Attributes attributes) {
        ManagerpermitImpl obj = new ManagerpermitImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("value");
        if (val != null)
            obj.setValue(val);

        // finished reading attibutes of Managerpermit
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return ManagergeneralSection
     */
    protected void linkManagergeneralSection() {

    }

    /**
     * lieﬂt die klasse ManagergeneralSection ein
     * 
     * @param attributes
     * @return ManagergeneralSection
     */
    protected ManagergeneralSection readManagergeneralSection(
            Attributes attributes) {
        ManagergeneralSectionImpl obj = new ManagergeneralSectionImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("generalid");
        if (val != null)
            obj.setGeneralid(val);

        val = attributes.getValue("enabled");
        if (val != null)
            obj.setEnabled(new Boolean(val));

        val = attributes.getValue("portno");
        if (val != null)
            obj.setPortno(new Integer(val));

        val = attributes.getValue("bindaddr");
        if (val != null)
            obj.setBindaddr(val);

        val = attributes.getValue("port");
        if (val != null)
            obj.setPort(new Integer(val));

        val = attributes.getValue("fileid");
        if (val != null)
            obj.setFileid(val);

        // finished reading attibutes of ManagergeneralSection
        return obj;
    }

}
