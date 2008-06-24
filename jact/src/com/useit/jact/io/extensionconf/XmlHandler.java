/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.extensionconf.Context;
import com.useit.jact.model.extensionconf.Extension;
import com.useit.jact.model.extensionconf.Extensionconf;
import com.useit.jact.model.extensionconf.Globalvars;
import com.useit.jact.model.extensionconf.IContext;
import com.useit.jact.model.extensionconf.IExtension;
import com.useit.jact.model.extensionconf.IExtensionconf;
import com.useit.jact.model.extensionconf.IGlobalvars;
import com.useit.jact.model.extensionconf.IIncludeconfigs;
import com.useit.jact.model.extensionconf.IIncludecontext;
import com.useit.jact.model.extensionconf.ISwitch;
import com.useit.jact.model.extensionconf.Includeconfigs;
import com.useit.jact.model.extensionconf.Includecontext;
import com.useit.jact.model.extensionconf.ModelFactoryextensionconfImpl;
import com.useit.jact.model.extensionconf.Switch;
import com.useit.jact.model.types.PbxApplication;
import com.useit.jact.model.types.PbxContext;


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
	protected Context currentContext=null; 
	
	protected Extension currentExtension=null; 
	
	protected Switch currentSwitch=null; 
	
	protected Includecontext currentIncludecontext=null; 
	
	protected Extensionconf currentExtensionconf=null; 
	
	protected Includeconfigs currentIncludeconfigs=null; 
	
	protected Globalvars currentGlobalvars=null; 
	
    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if(qName.equals("Context")){
            endContext();
         }
        if(qName.equals("Extension")){
            endExtension();
         }
        if(qName.equals("Switch")){
            endSwitch();
         }
        if(qName.equals("Includecontext")){
            endIncludecontext();
         }
        if(qName.equals("Extensionconf")){
            endExtensionconf();
         }
        if(qName.equals("Includeconfigs")){
            endIncludeconfigs();
         }
        if(qName.equals("Globalvars")){
            endGlobalvars();
         }
        
        super.endElement(uri, localName, qName);
    }

     /**
     * 
     */
    private void endContext() {
        currentContext=null;
        
    }

     /**
     * 
     */
    private void endExtension() {
        currentExtension=null;
        
    }

     /**
     * 
     */
    private void endSwitch() {
        currentSwitch=null;
        
    }

     /**
     * 
     */
    private void endIncludecontext() {
        currentIncludecontext=null;
        
    }

     /**
     * 
     */
    private void endExtensionconf() {
        currentExtensionconf=null;
        
    }

     /**
     * 
     */
    private void endIncludeconfigs() {
        currentIncludeconfigs=null;
        
    }

     /**
     * 
     */
    private void endGlobalvars() {
        currentGlobalvars=null;
        
    }


    
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        
        if(qName.equals("Context")){
            currentContext = readContext(attributes);
         	linkContext();
         }
        if(qName.equals("Extension")){
            currentExtension = readExtension(attributes);
         	linkExtension();
         }
        if(qName.equals("Switch")){
            currentSwitch = readSwitch(attributes);
         	linkSwitch();
         }
        if(qName.equals("Includecontext")){
            currentIncludecontext = readIncludecontext(attributes);
         	linkIncludecontext();
         }
        if(qName.equals("Extensionconf")){
            currentExtensionconf = readExtensionconf(attributes);
         	linkExtensionconf();
         }
        if(qName.equals("Includeconfigs")){
            currentIncludeconfigs = readIncludeconfigs(attributes);
         	linkIncludeconfigs();
         }
        if(qName.equals("Globalvars")){
            currentGlobalvars = readGlobalvars(attributes);
         	linkGlobalvars();
         }
         
         
        super.startElement(uri, localName, qName, attributes);
    }
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Extension
     */
    protected void linkExtension() {
	
	}
    /**
     * lieﬂt die klasse Extension ein
     * @param attributes
     * @return Extension
     */
    protected Extension readExtension(Attributes attributes) {
        //ExtensionImpl obj = new ExtensionImpl();
        Extension obj =(Extension) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(IExtension.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("exten");
		if(val!=null)
		obj.setExten(
			val
			);
	
		val=attributes.getValue("priority");
		if(val!=null)
		obj.setPriority(
			new Integer(val)
			);
	
		val=attributes.getValue("application");
		if(val!=null)
		obj.setApplication(
			new PbxApplication(val)
			);
	
	// finished reading attibutes of  Extension
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Context
     */
    protected void linkContext() {
	
	}
    /**
     * lieﬂt die klasse Context ein
     * @param attributes
     * @return Context
     */
    protected Context readContext(Attributes attributes) {
        //ContextImpl obj = new ContextImpl();
        Context obj =(Context) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(IContext.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("contextname");
		if(val!=null)
		obj.setContextname(
			val
			);
	
		val=attributes.getValue("ignorepat");
		if(val!=null)
		obj.setIgnorepat(
			val
			);
	
	// finished reading attibutes of  Context
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Includecontext
     */
    protected void linkIncludecontext() {
	
	}
    /**
     * lieﬂt die klasse Includecontext ein
     * @param attributes
     * @return Includecontext
     */
    protected Includecontext readIncludecontext(Attributes attributes) {
        //IncludecontextImpl obj = new IncludecontextImpl();
        Includecontext obj =(Includecontext) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(IIncludecontext.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("contexname");
		if(val!=null)
		obj.setContexname(
			new PbxContext(val)
			);
	
		val=attributes.getValue("timeing");
		if(val!=null)
		obj.setTimeing(
			val
			);
	
	// finished reading attibutes of  Includecontext
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Switch
     */
    protected void linkSwitch() {
	
	}
    /**
     * lieﬂt die klasse Switch ein
     * @param attributes
     * @return Switch
     */
    protected Switch readSwitch(Attributes attributes) {
        //SwitchImpl obj = new SwitchImpl();
        Switch obj =(Switch) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(ISwitch.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("switchdialstr");
		if(val!=null)
		obj.setSwitchdialstr(
			val
			);
	
	// finished reading attibutes of  Switch
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Extensionconf
     */
    protected void linkExtensionconf() {
	
	}
    /**
     * lieﬂt die klasse Extensionconf ein
     * @param attributes
     * @return Extensionconf
     */
    protected Extensionconf readExtensionconf(Attributes attributes) {
        //ExtensionconfImpl obj = new ExtensionconfImpl();
        Extensionconf obj =(Extensionconf) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(IExtensionconf.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("static_");
		if(val!=null)
		obj.setStatic_(
			new Boolean(val)
			);
	
		val=attributes.getValue("writeprotect");
		if(val!=null)
		obj.setWriteprotect(
			new Boolean(val)
			);
	
		val=attributes.getValue("autofallthrough");
		if(val!=null)
		obj.setAutofallthrough(
			new Boolean(val)
			);
	
		val=attributes.getValue("clearglobalvars");
		if(val!=null)
		obj.setClearglobalvars(
			new Boolean(val)
			);
	
	// finished reading attibutes of  Extensionconf
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Globalvars
     */
    protected void linkGlobalvars() {
	
	}
    /**
     * lieﬂt die klasse Globalvars ein
     * @param attributes
     * @return Globalvars
     */
    protected Globalvars readGlobalvars(Attributes attributes) {
        //GlobalvarsImpl obj = new GlobalvarsImpl();
        Globalvars obj =(Globalvars) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(IGlobalvars.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("name");
		if(val!=null)
		obj.setName(
			val
			);
	
		val=attributes.getValue("value");
		if(val!=null)
		obj.setValue(
			val
			);
	
	// finished reading attibutes of  Globalvars
        return obj;
    }
	
	
    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in den Objektbaum aufzunehmen.
     * @param attributes
     * @return Includeconfigs
     */
    protected void linkIncludeconfigs() {
	
	}
    /**
     * lieﬂt die klasse Includeconfigs ein
     * @param attributes
     * @return Includeconfigs
     */
    protected Includeconfigs readIncludeconfigs(Attributes attributes) {
        //IncludeconfigsImpl obj = new IncludeconfigsImpl();
        Includeconfigs obj =(Includeconfigs) ModelFactoryextensionconfImpl.defaultModelFactory.createModelElement(IIncludeconfigs.class);
        
    //felder schreiben
        String val;
		val=attributes.getValue("configname");
		if(val!=null)
		obj.setConfigname(
			val
			);
	
	// finished reading attibutes of  Includeconfigs
        return obj;
    }
	
	

}
