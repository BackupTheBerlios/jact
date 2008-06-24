/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.IaxdenyImpl;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.IaxjitterImpl;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.IaxpeerImpl;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.IaxpermitImpl;
import com.useit.jact.model.iaxconf.Iaxregister;
import com.useit.jact.model.iaxconf.IaxregisterImpl;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

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
    protected Iaxregister currentIaxregister = null;

    protected Iaxdeny currentIaxdeny = null;

    protected Iaxpermit currentIaxpermit = null;

    protected Iaxgeneral currentIaxgeneral = null;

    protected Iaxpeer currentIaxpeer = null;

    protected Iaxjitter currentIaxjitter = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Iaxregister")) {
            endIaxregister();
        }
        if (qName.equals("Iaxdeny")) {
            endIaxdeny();
        }
        if (qName.equals("Iaxpermit")) {
            endIaxpermit();
        }
        if (qName.equals("Iaxgeneral")) {
            endIaxgeneral();
        }
        if (qName.equals("Iaxpeer")) {
            endIaxpeer();
        }
        if (qName.equals("Iaxjitter")) {
            endIaxjitter();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endIaxregister() {
        currentIaxregister = null;

    }

    /**
     * 
     */
    private void endIaxdeny() {
        currentIaxdeny = null;

    }

    /**
     * 
     */
    private void endIaxpermit() {
        currentIaxpermit = null;

    }

    /**
     * 
     */
    private void endIaxgeneral() {
        currentIaxgeneral = null;

    }

    /**
     * 
     */
    private void endIaxpeer() {
        currentIaxpeer = null;

    }

    /**
     * 
     */
    private void endIaxjitter() {
        currentIaxjitter = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Iaxregister")) {
            currentIaxregister = readIaxregister(attributes);
            linkIaxregister();
        }
        if (qName.equals("Iaxdeny")) {
            currentIaxdeny = readIaxdeny(attributes);
            linkIaxdeny();
        }
        if (qName.equals("Iaxpermit")) {
            currentIaxpermit = readIaxpermit(attributes);
            linkIaxpermit();
        }
        if (qName.equals("Iaxgeneral")) {
            currentIaxgeneral = readIaxgeneral(attributes);
            linkIaxgeneral();
        }
        if (qName.equals("Iaxpeer")) {
            currentIaxpeer = readIaxpeer(attributes);
            linkIaxpeer();
        }
        if (qName.equals("Iaxjitter")) {
            currentIaxjitter = readIaxjitter(attributes);
            linkIaxjitter();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Iaxjitter
     */
    protected void linkIaxjitter() {

    }

    /**
     * lieﬂt die klasse Iaxjitter ein
     * 
     * @param attributes
     * @return Iaxjitter
     */
    protected Iaxjitter readIaxjitter(Attributes attributes) {
        IaxjitterImpl obj = new IaxjitterImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("jitterbuffer");
        if (val != null)
            obj.setJitterbuffer(new Boolean(val));

        val = attributes.getValue("forcejitterbuffer");
        if (val != null)
            obj.setForcejitterbuffer(new Boolean(val));

        val = attributes.getValue("dropcount");
        if (val != null)
            obj.setDropcount(new Integer(val));

        val = attributes.getValue("maxjitterbuffer");
        if (val != null)
            obj.setMaxjitterbuffer(new Integer(val));

        val = attributes.getValue("resyncthreshold");
        if (val != null)
            obj.setResyncthreshold(new Integer(val));

        val = attributes.getValue("maxjitterinterps");
        if (val != null)
            obj.setMaxjitterinterps(new Integer(val));

        val = attributes.getValue("maxexcessbuffer");
        if (val != null)
            obj.setMaxexcessbuffer(new Integer(val));

        val = attributes.getValue("minexcessbuffer");
        if (val != null)
            obj.setMinexcessbuffer(new Integer(val));

        val = attributes.getValue("jittershrinkrate");
        if (val != null)
            obj.setJittershrinkrate(new Integer(val));

        // finished reading attibutes of Iaxjitter
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Iaxregister
     */
    protected void linkIaxregister() {

    }

    /**
     * lieﬂt die klasse Iaxregister ein
     * 
     * @param attributes
     * @return Iaxregister
     */
    protected Iaxregister readIaxregister(Attributes attributes) {
        IaxregisterImpl obj = new IaxregisterImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("user");
        if (val != null)
            obj.setUser(val);

        val = attributes.getValue("authuser");
        if (val != null)
            obj.setAuthuser(val);

        val = attributes.getValue("secret");
        if (val != null)
            obj.setSecret(val);

        val = attributes.getValue("host");
        if (val != null)
            obj.setHost(val);

        val = attributes.getValue("port");
        if (val != null)
            obj.setPort(new Integer(val));

        val = attributes.getValue("extension");
        if (val != null)
            obj.setExtension(val);

        // finished reading attibutes of Iaxregister
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Iaxdeny
     */
    protected void linkIaxdeny() {

    }

    /**
     * lieﬂt die klasse Iaxdeny ein
     * 
     * @param attributes
     * @return Iaxdeny
     */
    protected Iaxdeny readIaxdeny(Attributes attributes) {
        IaxdenyImpl obj = new IaxdenyImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("value");
        if (val != null)
            obj.setValue(val);

        // finished reading attibutes of Iaxdeny
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Iaxpermit
     */
    protected void linkIaxpermit() {

    }

    /**
     * lieﬂt die klasse Iaxpermit ein
     * 
     * @param attributes
     * @return Iaxpermit
     */
    protected Iaxpermit readIaxpermit(Attributes attributes) {
        IaxpermitImpl obj = new IaxpermitImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("value");
        if (val != null)
            obj.setValue(val);

        // finished reading attibutes of Iaxpermit
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Iaxpeer
     */
    protected void linkIaxpeer() {

    }

    /**
     * lieﬂt die klasse Iaxpeer ein
     * 
     * @param attributes
     * @return Iaxpeer
     */
    protected Iaxpeer readIaxpeer(Attributes attributes) {
        IaxpeerImpl obj = new IaxpeerImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("iaxpeername");
        if (val != null)
            obj.setIaxpeername(val);

        val = attributes.getValue("peertype");
        if (val != null)
            obj.setPeertype(new PeerType(val));

        val = attributes.getValue("callerid");
        if (val != null)
            obj.setCallerid(val);

        val = attributes.getValue("auth");
        if (val != null)
            obj.setAuth(val);

        val = attributes.getValue("secret");
        if (val != null)
            obj.setSecret(val);

        val = attributes.getValue("inkeys");
        if (val != null)
            obj.setInkeys(val);

        val = attributes.getValue("host");
        if (val != null)
            obj.setHost(val);

        val = attributes.getValue("defaultip");
        if (val != null)
            obj.setDefaultip(val);

        val = attributes.getValue("context");
        if (val != null)
            obj.setContext(new PbxContext(val));

        val = attributes.getValue("dbsecret");
        if (val != null)
            obj.setDbsecret(val);

        val = attributes.getValue("setvar");
        if (val != null)
            obj.setSetvar(val);

        val = attributes.getValue("peercontext");
        if (val != null)
            obj.setPeercontext(new PbxContext(val));

        val = attributes.getValue("qualify");
        if (val != null)
            obj.setQualify(new Integer(val));

        val = attributes.getValue("trunk");
        if (val != null)
            obj.setTrunk(new Boolean(val));

        val = attributes.getValue("timezone");
        if (val != null)
            obj.setTimezone(val);

        val = attributes.getValue("regexten");
        if (val != null)
            obj.setRegexten(val);

        val = attributes.getValue("disallow");
        if (val != null)
            obj.setDisallow(new CodecsSet(val));

        val = attributes.getValue("allow");
        if (val != null)
            obj.setAllow(new CodecsSet(val));

        val = attributes.getValue("mailbox");
        if (val != null)
            obj.setMailbox(val);

        val = attributes.getValue("accountcode");
        if (val != null)
            obj.setAccountcode(val);

        val = attributes.getValue("outkey");
        if (val != null)
            obj.setOutkey(val);

        val = attributes.getValue("notransfer");
        if (val != null)
            obj.setNotransfer(new Boolean(val));

        val = attributes.getValue("qualifysmoothing");
        if (val != null)
            obj.setQualifysmoothing(new Boolean(val));

        val = attributes.getValue("qualifyfreqok");
        if (val != null)
            obj.setQualifyfreqok(new Integer(val));

        val = attributes.getValue("qualifyfreqnotok");
        if (val != null)
            obj.setQualifyfreqnotok(new Integer(val));

        // finished reading attibutes of Iaxpeer
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Iaxgeneral
     */
    protected void linkIaxgeneral() {

    }

    /**
     * lieﬂt die klasse Iaxgeneral ein
     * 
     * @param attributes
     * @return Iaxgeneral
     */
    protected Iaxgeneral readIaxgeneral(Attributes attributes) {
        IaxgeneralImpl obj = new IaxgeneralImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("bindport");
        if (val != null)
            obj.setBindport(new Integer(val));

        val = attributes.getValue("bindaddr");
        if (val != null)
            obj.setBindaddr(val);

        val = attributes.getValue("iaxcompat");
        if (val != null)
            obj.setIaxcompat(val);

        val = attributes.getValue("nochecksums");
        if (val != null)
            obj.setNochecksums(new Boolean(val));

        val = attributes.getValue("delayreject");
        if (val != null)
            obj.setDelayreject(new Boolean(val));

        val = attributes.getValue("amaflags");
        if (val != null)
            obj.setAmaflags(new Amaflags(val));

        val = attributes.getValue("accountcode");
        if (val != null)
            obj.setAccountcode(val);

        val = attributes.getValue("language");
        if (val != null)
            obj.setLanguage(val);

        val = attributes.getValue("bandwidth");
        if (val != null)
            obj.setBandwidth(val);

        val = attributes.getValue("trunktimestamps");
        if (val != null)
            obj.setTrunktimestamps(new Integer(val));

        val = attributes.getValue("authdebug");
        if (val != null)
            obj.setAuthdebug(val);

        val = attributes.getValue("tos");
        if (val != null)
            obj.setTos(val);

        val = attributes.getValue("mailboxdetail");
        if (val != null)
            obj.setMailboxdetail(new Boolean(val));

        val = attributes.getValue("regcontext");
        if (val != null)
            obj.setRegcontext(val);

        val = attributes.getValue("autokill");
        if (val != null)
            obj.setAutokill(new Boolean(val));

        val = attributes.getValue("codecpriority");
        if (val != null)
            obj.setCodecpriority(val);

        val = attributes.getValue("rtcachefriends");
        if (val != null)
            obj.setRtcachefriends(new Integer(val));

        val = attributes.getValue("rtupdate");
        if (val != null)
            obj.setRtupdate(new Boolean(val));

        val = attributes.getValue("rtautoclear");
        if (val != null)
            obj.setRtautoclear(new Boolean(val));

        val = attributes.getValue("rtignoreexpire");
        if (val != null)
            obj.setRtignoreexpire(new Boolean(val));

        val = attributes.getValue("trunkfreq");
        if (val != null)
            obj.setTrunkfreq(new Integer(val));

        val = attributes.getValue("disallow");
        if (val != null)
            obj.setDisallow(new CodecsSet(val));

        val = attributes.getValue("allow");
        if (val != null)
            obj.setAllow(new CodecsSet(val));

        val = attributes.getValue("minregexpire");
        if (val != null)
            obj.setMinregexpire(new Integer(val));

        val = attributes.getValue("maxregexpire");
        if (val != null)
            obj.setMaxregexpire(new Integer(val));

        val = attributes.getValue("notransfer");
        if (val != null)
            obj.setNotransfer(new Boolean(val));

        // finished reading attibutes of Iaxgeneral
        return obj;
    }

}
