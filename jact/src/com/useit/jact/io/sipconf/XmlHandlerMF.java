/*
 * (c) urs zeidler
 */
package com.useit.jact.io.sipconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.app.framework.model.dataModel.IModelFactory;
import com.useit.jact.model.sipconf.ISipConf;
import com.useit.jact.model.sipconf.ISipauth;
import com.useit.jact.model.sipconf.ISipgeneral;
import com.useit.jact.model.sipconf.ISippeers;
import com.useit.jact.model.sipconf.ISipregister;
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
 * @version $Revision: 1.1 $, $Id: XmlHandlerMF.java,v 1.1 2008/06/24 20:45:24 urszeidler Exp $ 
 */
public class XmlHandlerMF extends DefaultHandler {
 protected IModelFactory fact;
	protected ISipregister currentSipregister=null; 
	
	protected ISipauth currentSipauth=null; 
	
	protected ISipConf currentSipConf=null; 
	
	protected ISipgeneral currentSipgeneral=null; 
	
	protected ISippeers currentSippeers=null; 
	
    /**
     * 
     */
    public XmlHandlerMF(IModelFactory factory) {
        super();
        fact = factory;
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
    protected ISipregister readSipregister(Attributes attributes) {
       // SipregisterImpl obj = new SipregisterImpl();
       ISipregister obj =(ISipregister) fact.createModelElement(ISipregister.class);
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
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
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
    protected ISipauth readSipauth(Attributes attributes) {
       // SipauthImpl obj = new SipauthImpl();
       ISipauth obj =(ISipauth) fact.createModelElement(ISipauth.class);
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
    protected ISipConf readSipConf(Attributes attributes) {
       // SipConfImpl obj = new SipConfImpl();
       ISipConf obj =(ISipConf) fact.createModelElement(ISipConf.class);
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
    protected ISippeers readSippeers(Attributes attributes) {
       // SippeersImpl obj = new SippeersImpl();
       ISippeers obj =(ISippeers) fact.createModelElement(ISippeers.class);
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
		 ( Amaflags) fact.createTypeFromString( Amaflags.class, val) 
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
		 ( PbxContext) fact.createTypeFromString( PbxContext.class, val) 
		);
	
		val=attributes.getValue("defaultip");
		if(val!=null)
		obj.setDefaultip(
		val
		);
	
		val=attributes.getValue("dtmfmode");
		if(val!=null)
		obj.setDtmfmode(
		 ( Dtmfmode) fact.createTypeFromString( Dtmfmode.class, val) 
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
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("outgoinglimit");
		if(val!=null)
		obj.setOutgoinglimit(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
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
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("pickupgroup");
		if(val!=null)
		obj.setPickupgroup(
		val
		);
	
		val=attributes.getValue("port");
		if(val!=null)
		obj.setPort(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("qualify");
		if(val!=null)
		obj.setQualify(
		val
		);
	
		val=attributes.getValue("restrictcid");
		if(val!=null)
		obj.setRestrictcid(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("rtptimeout");
		if(val!=null)
		obj.setRtptimeout(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("rtpholdtimeout");
		if(val!=null)
		obj.setRtpholdtimeout(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("secret");
		if(val!=null)
		obj.setSecret(
		val
		);
	
		val=attributes.getValue("type");
		if(val!=null)
		obj.setType(
		 ( PeerType) fact.createTypeFromString( PeerType.class, val) 
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
		 ( CodecsSet) fact.createTypeFromString( CodecsSet.class, val) 
		);
	
		val=attributes.getValue("allow");
		if(val!=null)
		obj.setAllow(
		 ( CodecsSet) fact.createTypeFromString( CodecsSet.class, val) 
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
    protected ISipgeneral readSipgeneral(Attributes attributes) {
       // SipgeneralImpl obj = new SipgeneralImpl();
       ISipgeneral obj =(ISipgeneral) fact.createModelElement(ISipgeneral.class);
    //felder schreiben
        String val;
		val=attributes.getValue("autocreatepeer");
		if(val!=null)
		obj.setAutocreatepeer(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("bindaddr");
		if(val!=null)
		obj.setBindaddr(
		val
		);
	
		val=attributes.getValue("bindport");
		if(val!=null)
		obj.setBindport(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("canreinvite");
		if(val!=null)
		obj.setCanreinvite(
		val
		);
	
		val=attributes.getValue("context");
		if(val!=null)
		obj.setContext(
		 ( PbxContext) fact.createTypeFromString( PbxContext.class, val) 
		);
	
		val=attributes.getValue("defaultexpirey");
		if(val!=null)
		obj.setDefaultexpirey(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("dtmfmode");
		if(val!=null)
		obj.setDtmfmode(
		 ( Dtmfmode) fact.createTypeFromString( Dtmfmode.class, val) 
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
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("nat");
		if(val!=null)
		obj.setNat(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("notifymimetype");
		if(val!=null)
		obj.setNotifymimetype(
		val
		);
	
		val=attributes.getValue("pedantic");
		if(val!=null)
		obj.setPedantic(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("port");
		if(val!=null)
		obj.setPort(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("promiscredir");
		if(val!=null)
		obj.setPromiscredir(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("srvlookup");
		if(val!=null)
		obj.setSrvlookup(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("tos");
		if(val!=null)
		obj.setTos(
		val
		);
	
		val=attributes.getValue("videosupport");
		if(val!=null)
		obj.setVideosupport(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("useragent");
		if(val!=null)
		obj.setUseragent(
		val
		);
	
		val=attributes.getValue("trustrpid");
		if(val!=null)
		obj.setTrustrpid(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("realm");
		if(val!=null)
		obj.setRealm(
		val
		);
	
		val=attributes.getValue("relaxdtmf");
		if(val!=null)
		obj.setRelaxdtmf(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("rtptimeout");
		if(val!=null)
		obj.setRtptimeout(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("rtpholdtimeout");
		if(val!=null)
		obj.setRtpholdtimeout(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("progressinband");
		if(val!=null)
		obj.setProgressinband(
		val
		);
	
		val=attributes.getValue("usereqphone");
		if(val!=null)
		obj.setUsereqphone(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("compactheaders");
		if(val!=null)
		obj.setCompactheaders(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("sipdebug");
		if(val!=null)
		obj.setSipdebug(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("checkmwi");
		if(val!=null)
		obj.setCheckmwi(
		 ( Integer) fact.createTypeFromString( Integer.class, val) 
		);
	
		val=attributes.getValue("recordhistory");
		if(val!=null)
		obj.setRecordhistory(
		 ( Boolean) fact.createTypeFromString( Boolean.class, val) 
		);
	
		val=attributes.getValue("allow");
		if(val!=null)
		obj.setAllow(
		 ( CodecsSet) fact.createTypeFromString( CodecsSet.class, val) 
		);
	
		val=attributes.getValue("disallow");
		if(val!=null)
		obj.setDisallow(
		 ( CodecsSet) fact.createTypeFromString( CodecsSet.class, val) 
		);
	
	// finished reading attibutes of  Sipgeneral
        return obj;
    }
	
	

}
