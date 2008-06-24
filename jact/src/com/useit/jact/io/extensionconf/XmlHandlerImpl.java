/*
 * (c) urs zeidler
 */
package com.useit.jact.io.extensionconf;

import org.w3c.dom.Document;

import com.useit.jact.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.7 2006/01/12 15:20:11
 *          urs Exp $
 */
public class XmlHandlerImpl extends XmlHandler {

    private Object conf;

    /**
     * 
     */
    public XmlHandlerImpl() {
        super();
    }

    public Object getConf() {
        return conf;
    }

    /**
     * @param attributes
     * @return Context
     */
    protected void linkContext() {
        if (currentExtensionconf != null) {
            currentExtensionconf.addContext(currentContext);
        }
    }

    /**
     * @param attributes
     * @return Extension
     */
    protected void linkExtension() {
        if (currentContext != null) {
            currentContext.addExtension(currentExtension);
        }
    }

    /**
     * @param attributes
     * @return Switch
     */
    protected void linkSwitch() {
        if (currentContext != null) {
            currentContext.addSwitch(currentSwitch);
        }
    }

    /**
     * @param attributes
     * @return Includecontext
     */
    protected void linkIncludecontext() {
        if (currentContext != null) {
            currentContext.addIncludecontext(currentIncludecontext);
        }
    }

    /**
     * @param attributes
     * @return Extensionconf
     */
    protected void linkExtensionconf() {
        if (currentExtensionconf != null) {
            conf = currentExtensionconf;
        }
    }

    /**
     * @param attributes
     * @return Includeconfigs
     */
    protected void linkIncludeconfigs() {
        if (currentExtensionconf != null) {
            currentExtensionconf.addIncludeconfigs(currentIncludeconfigs);
        }
    }

    /**
     * @param attributes
     * @return Globalvars
     */
    protected void linkGlobalvars() {
        if (currentExtensionconf != null) {
            currentExtensionconf.addGlobalvars(currentGlobalvars);
        }
    }

    /**
     * @param filename
     * @param conf
     */
    public static void writeConf(String filename, Object conf) {
        Document doc = BasicSax.createDomDocument();
        XmlWriter.writeConf(doc, conf);
        BasicSax.writeXmlFile(doc, filename);

    }

    public static Object readConf(String filename) {
        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile(filename, hnd, false);
        return hnd.getConf();
    }

}
