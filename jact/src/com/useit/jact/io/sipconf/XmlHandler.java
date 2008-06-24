/*
 * (c) urs zeidler
 */
package com.useit.jact.io.sipconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.sipconf.ISipConf;
import com.useit.jact.model.sipconf.ISipauth;
import com.useit.jact.model.sipconf.ISipgeneral;
import com.useit.jact.model.sipconf.ISippeers;
import com.useit.jact.model.sipconf.ISipregister;
import com.useit.jact.model.sipconf.ModelFactorysipconfImpl;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;


/** 
 * <p> 
 * XmlHandler, eine SAX Handler implementierung<br>
 *	
 *                                             </br>
 * </p> 
 * Created : 15.08.2005 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class XmlHandler extends DefaultHandler {
	protected Sipregister currentSipregister=null; 
	
	protected Sipauth currentSipauth=null; 
	
	protected SipConf currentSipConf=null; 
	
	protected Sipgeneral currentSipgeneral=null; 
	
	protected Sippeers currentSippeers=null; 
	
    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if(qName.equals("Sipregister")){
            endSipregister();
         }
        if(qName.equals("Sipauth")){
            endSipauth();
         }
        if(qName.equals("SipConf")){
            endSipConf();
         }
        if(qName.equals("Sipgeneral")){
            endSipgeneral();
         }
        if(qName.equals("Sippeers")){
            endSippeers();
         }
        
        super.endElement(uri, localName, qName);
    }

     /**
     * 
     */
    private void endSipregister() {
        currentSipregister=null;
        
    }

     /**
     * 
     */
    private void endSipauth() {
        currentSipauth=null;
        
    }

     /**
     * 
     */
    private void endSipConf() {
        currentSipConf=null;
        
    }

     /**
     * 
     */
    private void endSipgeneral() {
        currentSipgeneral=null;
        
    }

     /**
     * 
     */
    private void endSippeers() {
        currentSippeers=null;
        
    }


    
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        
        if(qName.equals("Sipregister")){
            currentSipregister = readSipregister(attributes);
         	linkSipregister();
         }
        if(qName.equals("Sipauth")){
            currentSipauth = readSipauth(attributes);
         	linkSipauth();
         }
        if(qName.equals("SipConf")){
            currentSipConf = readSipConf(attributes);
         	linkSipConf();
         }
        if(qName.equals("Sipgeneral")){
            currentSipgeneral = readSipgeneral(attributes);
         	linkSipgeneral();
         }
        if(qName.equals("Sippeers")){
            currentSippeers = readSippeers(attributes);
         	linkSippeers();
         }
         
         
        super.startElement(uri, localName, qName, attributes);
    }
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Sipregister
     */
    protected void linkSipregister() {
	
	}
    /**
     * lieﬂt die klasse Sipregister ein
     * @param attributes
     * @return Sipregister
     */
    protected Sipregister readSipregister(Attributes attributes) {
        //SipregisterImpl obj = new SipregisterImpl();
        Sipregister obj =(Sipregister) ModelFactorysipconfImpl.defaultModelFactory.createModelElement(ISipregister.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("user");
		if(val!=null)
		obj.setUser(
			val
			);
	
		val=attributes.getValue("authuser");
		if(val!=null)
		obj.setAuthuser(
			val
			);
	
		val=attributes.getValue("secret");
		if(val!=null)
		obj.setSecret(
			val
			);
	
		val=attributes.getValue("host");
		if(val!=null)
		obj.setHost(
			val
			);
	
		val=attributes.getValue("port");
		if(val!=null)
		obj.setPort(
			new Integer(val)
			);
	
		val=attributes.getValue("extension");
		if(val!=null)
		obj.setExtension(
			val
			);
	
	// finished reading attibutes of  Sipregister
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Sipauth
     */
    protected void linkSipauth() {
	
	}
    /**
     * lieﬂt die klasse Sipauth ein
     * @param attributes
     * @return Sipauth
     */
    protected Sipauth readSipauth(Attributes attributes) {
        //SipauthImpl obj = new SipauthImpl();
        Sipauth obj =(Sipauth) ModelFactorysipconfImpl.defaultModelFactory.createModelElement(ISipauth.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("user");
		if(val!=null)
		obj.setUser(
			val
			);
	
		val=attributes.getValue("secret");
		if(val!=null)
		obj.setSecret(
			val
			);
	
		val=attributes.getValue("md5secret");
		if(val!=null)
		obj.setMd5secret(
			val
			);
	
		val=attributes.getValue("realm");
		if(val!=null)
		obj.setRealm(
			val
			);
	
	// finished reading attibutes of  Sipauth
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return SipConf
     */
    protected void linkSipConf() {
	
	}
    /**
     * lieﬂt die klasse SipConf ein
     * @param attributes
     * @return SipConf
     */
    protected SipConf readSipConf(Attributes attributes) {
        //SipConfImpl obj = new SipConfImpl();
        SipConf obj =(SipConf) ModelFactorysipconfImpl.defaultModelFactory.createModelElement(ISipConf.class);
        
    //felder schreiben
        String val;
	// finished reading attibutes of  SipConf
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Sippeers
     */
    protected void linkSippeers() {
	
	}
    /**
     * lieﬂt die klasse Sippeers ein
     * @param attributes
     * @return Sippeers
     */
    protected Sippeers readSippeers(Attributes attributes) {
        //SippeersImpl obj = new SippeersImpl();
        Sippeers obj =(Sippeers) ModelFactorysipconfImpl.defaultModelFactory.createModelElement(ISippeers.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("sectionname");
		if(val!=null)
		obj.setSectionname(
			val
			);
	
		val=attributes.getValue("accountcode");
		if(val!=null)
		obj.setAccountcode(
			val
			);
	
		val=attributes.getValue("amaflags");
		if(val!=null)
		obj.setAmaflags(
			new Amaflags(val)
			);
	
		val=attributes.getValue("callgroup");
		if(val!=null)
		obj.setCallgroup(
			val
			);
	
		val=attributes.getValue("canreinvite");
		if(val!=null)
		obj.setCanreinvite(
			val
			);
	
		val=attributes.getValue("context");
		if(val!=null)
		obj.setContext(
			new PbxContext(val)
			);
	
		val=attributes.getValue("defaultip");
		if(val!=null)
		obj.setDefaultip(
			val
			);
	
		val=attributes.getValue("dtmfmode");
		if(val!=null)
		obj.setDtmfmode(
			new Dtmfmode(val)
			);
	
		val=attributes.getValue("fromuser");
		if(val!=null)
		obj.setFromuser(
			val
			);
	
		val=attributes.getValue("fromdomain");
		if(val!=null)
		obj.setFromdomain(
			val
			);
	
		val=attributes.getValue("host");
		if(val!=null)
		obj.setHost(
			val
			);
	
		val=attributes.getValue("incominglimit");
		if(val!=null)
		obj.setIncominglimit(
			new Integer(val)
			);
	
		val=attributes.getValue("outgoinglimit");
		if(val!=null)
		obj.setOutgoinglimit(
			new Integer(val)
			);
	
		val=attributes.getValue("insecure");
		if(val!=null)
		obj.setInsecure(
			val
			);
	
		val=attributes.getValue("language");
		if(val!=null)
		obj.setLanguage(
			val
			);
	
		val=attributes.getValue("mailbox");
		if(val!=null)
		obj.setMailbox(
			val
			);
	
		val=attributes.getValue("md5secret");
		if(val!=null)
		obj.setMd5secret(
			val
			);
	
		val=attributes.getValue("nat");
		if(val!=null)
		obj.setNat(
			new Boolean(val)
			);
	
		val=attributes.getValue("pickupgroup");
		if(val!=null)
		obj.setPickupgroup(
			val
			);
	
		val=attributes.getValue("port");
		if(val!=null)
		obj.setPort(
			new Integer(val)
			);
	
		val=attributes.getValue("qualify");
		if(val!=null)
		obj.setQualify(
			val
			);
	
		val=attributes.getValue("restrictcid");
		if(val!=null)
		obj.setRestrictcid(
			new Boolean(val)
			);
	
		val=attributes.getValue("rtptimeout");
		if(val!=null)
		obj.setRtptimeout(
			new Integer(val)
			);
	
		val=attributes.getValue("rtpholdtimeout");
		if(val!=null)
		obj.setRtpholdtimeout(
			new Integer(val)
			);
	
		val=attributes.getValue("secret");
		if(val!=null)
		obj.setSecret(
			val
			);
	
		val=attributes.getValue("type");
		if(val!=null)
		obj.setType(
			new PeerType(val)
			);
	
		val=attributes.getValue("username");
		if(val!=null)
		obj.setUsername(
			val
			);
	
		val=attributes.getValue("musiconhold");
		if(val!=null)
		obj.setMusiconhold(
			val
			);
	
		val=attributes.getValue("callerid");
		if(val!=null)
		obj.setCallerid(
			val
			);
	
		val=attributes.getValue("disallow");
		if(val!=null)
		obj.setDisallow(
			new CodecsSet(val)
			);
	
		val=attributes.getValue("allow");
		if(val!=null)
		obj.setAllow(
			new CodecsSet(val)
			);
	
	// finished reading attibutes of  Sippeers
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Sipgeneral
     */
    protected void linkSipgeneral() {
	
	}
    /**
     * lieﬂt die klasse Sipgeneral ein
     * @param attributes
     * @return Sipgeneral
     */
    protected Sipgeneral readSipgeneral(Attributes attributes) {
        //SipgeneralImpl obj = new SipgeneralImpl();
        Sipgeneral obj =(Sipgeneral) ModelFactorysipconfImpl.defaultModelFactory.createModelElement(ISipgeneral.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("autocreatepeer");
		if(val!=null)
		obj.setAutocreatepeer(
			new Boolean(val)
			);
	
		val=attributes.getValue("bindaddr");
		if(val!=null)
		obj.setBindaddr(
			val
			);
	
		val=attributes.getValue("bindport");
		if(val!=null)
		obj.setBindport(
			new Integer(val)
			);
	
		val=attributes.getValue("canreinvite");
		if(val!=null)
		obj.setCanreinvite(
			val
			);
	
		val=attributes.getValue("context");
		if(val!=null)
		obj.setContext(
			new PbxContext(val)
			);
	
		val=attributes.getValue("defaultexpirey");
		if(val!=null)
		obj.setDefaultexpirey(
			new Integer(val)
			);
	
		val=attributes.getValue("dtmfmode");
		if(val!=null)
		obj.setDtmfmode(
			new Dtmfmode(val)
			);
	
		val=attributes.getValue("externip");
		if(val!=null)
		obj.setExternip(
			val
			);
	
		val=attributes.getValue("externhost");
		if(val!=null)
		obj.setExternhost(
			val
			);
	
		val=attributes.getValue("externrefresh");
		if(val!=null)
		obj.setExternrefresh(
			val
			);
	
		val=attributes.getValue("localnet");
		if(val!=null)
		obj.setLocalnet(
			val
			);
	
		val=attributes.getValue("fromdomain");
		if(val!=null)
		obj.setFromdomain(
			val
			);
	
		val=attributes.getValue("maxexpirey");
		if(val!=null)
		obj.setMaxexpirey(
			new Integer(val)
			);
	
		val=attributes.getValue("nat");
		if(val!=null)
		obj.setNat(
			new Boolean(val)
			);
	
		val=attributes.getValue("notifymimetype");
		if(val!=null)
		obj.setNotifymimetype(
			val
			);
	
		val=attributes.getValue("pedantic");
		if(val!=null)
		obj.setPedantic(
			new Boolean(val)
			);
	
		val=attributes.getValue("port");
		if(val!=null)
		obj.setPort(
			new Integer(val)
			);
	
		val=attributes.getValue("promiscredir");
		if(val!=null)
		obj.setPromiscredir(
			new Boolean(val)
			);
	
		val=attributes.getValue("srvlookup");
		if(val!=null)
		obj.setSrvlookup(
			new Boolean(val)
			);
	
		val=attributes.getValue("tos");
		if(val!=null)
		obj.setTos(
			val
			);
	
		val=attributes.getValue("videosupport");
		if(val!=null)
		obj.setVideosupport(
			new Boolean(val)
			);
	
		val=attributes.getValue("useragent");
		if(val!=null)
		obj.setUseragent(
			val
			);
	
		val=attributes.getValue("trustrpid");
		if(val!=null)
		obj.setTrustrpid(
			new Boolean(val)
			);
	
		val=attributes.getValue("realm");
		if(val!=null)
		obj.setRealm(
			val
			);
	
		val=attributes.getValue("relaxdtmf");
		if(val!=null)
		obj.setRelaxdtmf(
			new Boolean(val)
			);
	
		val=attributes.getValue("rtptimeout");
		if(val!=null)
		obj.setRtptimeout(
			new Integer(val)
			);
	
		val=attributes.getValue("rtpholdtimeout");
		if(val!=null)
		obj.setRtpholdtimeout(
			new Integer(val)
			);
	
		val=attributes.getValue("progressinband");
		if(val!=null)
		obj.setProgressinband(
			val
			);
	
		val=attributes.getValue("usereqphone");
		if(val!=null)
		obj.setUsereqphone(
			new Boolean(val)
			);
	
		val=attributes.getValue("compactheaders");
		if(val!=null)
		obj.setCompactheaders(
			new Boolean(val)
			);
	
		val=attributes.getValue("sipdebug");
		if(val!=null)
		obj.setSipdebug(
			new Boolean(val)
			);
	
		val=attributes.getValue("checkmwi");
		if(val!=null)
		obj.setCheckmwi(
			new Integer(val)
			);
	
		val=attributes.getValue("recordhistory");
		if(val!=null)
		obj.setRecordhistory(
			new Boolean(val)
			);
	
		val=attributes.getValue("allow");
		if(val!=null)
		obj.setAllow(
			new CodecsSet(val)
			);
	
		val=attributes.getValue("disallow");
		if(val!=null)
		obj.setDisallow(
			new CodecsSet(val)
			);
	
	// finished reading attibutes of  Sipgeneral
        return obj;
    }
	
	

}
