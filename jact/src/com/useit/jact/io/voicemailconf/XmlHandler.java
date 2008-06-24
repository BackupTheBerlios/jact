/*
 * (c) urs zeidler
 */
package com.useit.jact.io.voicemailconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.VoicemailcontextImpl;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.VoicemailgeneralImpl;
import com.useit.jact.model.voicemailconf.Zonemessages;
import com.useit.jact.model.voicemailconf.ZonemessagesImpl;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.6 2006/01/14 15:00:13 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected VoicemailConf currentVoicemailConf = null;

    protected Zonemessages currentZonemessages = null;

    protected Voicemailcontext currentVoicemailcontext = null;

    protected Voicemailcontextentry currentVoicemailcontextentry = null;

    protected Voicemailgeneral currentVoicemailgeneral = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("VoicemailConf")) {
            endVoicemailConf();
        }
        if (qName.equals("Zonemessages")) {
            endZonemessages();
        }
        if (qName.equals("Voicemailcontext")) {
            endVoicemailcontext();
        }
        if (qName.equals("Voicemailcontextentry")) {
            endVoicemailcontextentry();
        }
        if (qName.equals("Voicemailgeneral")) {
            endVoicemailgeneral();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endVoicemailConf() {
        currentVoicemailConf = null;

    }

    /**
     * 
     */
    private void endZonemessages() {
        currentZonemessages = null;

    }

    /**
     * 
     */
    private void endVoicemailcontext() {
        currentVoicemailcontext = null;

    }

    /**
     * 
     */
    private void endVoicemailcontextentry() {
        currentVoicemailcontextentry = null;

    }

    /**
     * 
     */
    private void endVoicemailgeneral() {
        currentVoicemailgeneral = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("VoicemailConf")) {
            currentVoicemailConf = readVoicemailConf(attributes);
            linkVoicemailConf();
        }
        if (qName.equals("Zonemessages")) {
            currentZonemessages = readZonemessages(attributes);
            linkZonemessages();
        }
        if (qName.equals("Voicemailcontext")) {
            currentVoicemailcontext = readVoicemailcontext(attributes);
            linkVoicemailcontext();
        }
        if (qName.equals("Voicemailcontextentry")) {
            currentVoicemailcontextentry = readVoicemailcontextentry(attributes);
            linkVoicemailcontextentry();
        }
        if (qName.equals("Voicemailgeneral")) {
            currentVoicemailgeneral = readVoicemailgeneral(attributes);
            linkVoicemailgeneral();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Voicemailgeneral
     */
    protected void linkVoicemailgeneral() {

    }

    /**
     * lieﬂt die klasse Voicemailgeneral ein
     * 
     * @param attributes
     * @return Voicemailgeneral
     */
    protected Voicemailgeneral readVoicemailgeneral(Attributes attributes) {
        VoicemailgeneralImpl obj = new VoicemailgeneralImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("attach");
        if (val != null)
            obj.setAttach(new Boolean(val));

        val = attributes.getValue("delete");
        if (val != null)
            obj.setDelete(new Boolean(val));

        val = attributes.getValue("mailcmd");
        if (val != null)
            obj.setMailcmd(val);

        val = attributes.getValue("maxsilence");
        if (val != null)
            obj.setMaxsilence(val);

        val = attributes.getValue("envelope");
        if (val != null)
            obj.setEnvelope(val);

        val = attributes.getValue("externnotify");
        if (val != null)
            obj.setExternnotify(val);

        val = attributes.getValue("silencethreshold");
        if (val != null)
            obj.setSilencethreshold(val);

        val = attributes.getValue("serveremail");
        if (val != null)
            obj.setServeremail(val);

        val = attributes.getValue("maxmessage");
        if (val != null)
            obj.setMaxmessage(val);

        val = attributes.getValue("minmessage");
        if (val != null)
            obj.setMinmessage(val);

        val = attributes.getValue("format");
        if (val != null)
            obj.setFormat(val);

        val = attributes.getValue("maxgreet");
        if (val != null)
            obj.setMaxgreet(val);

        val = attributes.getValue("skipms");
        if (val != null)
            obj.setSkipms(val);

        val = attributes.getValue("maxlogins");
        if (val != null)
            obj.setMaxlogins(val);

        val = attributes.getValue("cidinternalcontexts");
        if (val != null)
            obj.setCidinternalcontexts(val);

        val = attributes.getValue("review");
        if (val != null)
            obj.setReview(new Boolean(val));

        val = attributes.getValue("operator");
        if (val != null)
            obj.setOperator(new Boolean(val));

        val = attributes.getValue("saycid");
        if (val != null)
            obj.setSaycid(new Boolean(val));

        val = attributes.getValue("dialout");
        if (val != null)
            obj.setDialout(val);

        val = attributes.getValue("callback");
        if (val != null)
            obj.setCallback(val);

        val = attributes.getValue("dbuser");
        if (val != null)
            obj.setDbuser(val);

        val = attributes.getValue("dbpass");
        if (val != null)
            obj.setDbpass(val);

        val = attributes.getValue("dbhost");
        if (val != null)
            obj.setDbhost(val);

        val = attributes.getValue("dbname");
        if (val != null)
            obj.setDbname(val);

        val = attributes.getValue("dboption");
        if (val != null)
            obj.setDboption(val);

        val = attributes.getValue("pbxskip");
        if (val != null)
            obj.setPbxskip(val);

        val = attributes.getValue("fromstring");
        if (val != null)
            obj.setFromstring(val);

        val = attributes.getValue("emailsubject");
        if (val != null)
            obj.setEmailsubject(val);

        val = attributes.getValue("emailbody");
        if (val != null)
            obj.setEmailbody(val);

        val = attributes.getValue("exitcontext");
        if (val != null)
            obj.setExitcontext(val);

        val = attributes.getValue("nextaftercmd");
        if (val != null)
            obj.setNextaftercmd(val);

        // finished reading attibutes of Voicemailgeneral
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return VoicemailConf
     */
    protected void linkVoicemailConf() {

    }

    /**
     * lieﬂt die klasse VoicemailConf ein
     * 
     * @param attributes
     * @return VoicemailConf
     */
    protected VoicemailConf readVoicemailConf(Attributes attributes) {
        VoicemailConfImpl obj = new VoicemailConfImpl();
        // felder schreiben
        String val;
        // finished reading attibutes of VoicemailConf
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Voicemailcontext
     */
    protected void linkVoicemailcontext() {

    }

    /**
     * lieﬂt die klasse Voicemailcontext ein
     * 
     * @param attributes
     * @return Voicemailcontext
     */
    protected Voicemailcontext readVoicemailcontext(Attributes attributes) {
        VoicemailcontextImpl obj = new VoicemailcontextImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("contextname");
        if (val != null)
            obj.setContextname(val);

        // finished reading attibutes of Voicemailcontext
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zonemessages
     */
    protected void linkZonemessages() {

    }

    /**
     * lieﬂt die klasse Zonemessages ein
     * 
     * @param attributes
     * @return Zonemessages
     */
    protected Zonemessages readZonemessages(Attributes attributes) {
        ZonemessagesImpl obj = new ZonemessagesImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("timezonename");
        if (val != null)
            obj.setTimezonename(val);

        val = attributes.getValue("country");
        if (val != null)
            obj.setCountry(val);

        val = attributes.getValue("city");
        if (val != null)
            obj.setCity(val);

        val = attributes.getValue("options");
        if (val != null)
            obj.setOptions(val);

        // finished reading attibutes of Zonemessages
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Voicemailcontextentry
     */
    protected void linkVoicemailcontextentry() {

    }

    /**
     * lieﬂt die klasse Voicemailcontextentry ein
     * 
     * @param attributes
     * @return Voicemailcontextentry
     */
    protected Voicemailcontextentry readVoicemailcontextentry(
            Attributes attributes) {
        VoicemailcontextentryImpl obj = new VoicemailcontextentryImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("mailbox");
        if (val != null)
            obj.setMailbox(val);

        val = attributes.getValue("voicemail_password");
        if (val != null)
            obj.setVoicemail_password(val);

        val = attributes.getValue("user_name");
        if (val != null)
            obj.setUser_name(val);

        val = attributes.getValue("user_email_address");
        if (val != null)
            obj.setUser_email_address(val);

        val = attributes.getValue("pager_email_address");
        if (val != null)
            obj.setPager_email_address(val);

        val = attributes.getValue("user_options");
        if (val != null)
            obj.setUser_options(val);

        // finished reading attibutes of Voicemailcontextentry
        return obj;
    }

}
