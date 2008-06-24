/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import org.w3c.dom.Document;

import com.useit.jact.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.4 2006/01/12 15:20:11
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
     * @return Iaxregister
     */
    protected void linkIaxregister() {
        if (currentIaxregister != null) {
            if (currentIaxgeneral != null) {
                currentIaxgeneral.addIaxregister(currentIaxregister);
            }
        }
    }

    /**
     * @param attributes
     * @return Iaxdeny
     */
    protected void linkIaxdeny() {
        if (currentIaxdeny != null) {
            if (currentIaxpeer != null)
                currentIaxpeer.addIaxdeny(currentIaxdeny);

        }
    }

    /**
     * @param attributes
     * @return Iaxpermit
     */
    protected void linkIaxpermit() {
        if (currentIaxpermit != null) {
            if (currentIaxpeer != null)
                currentIaxpeer.addIaxpermit(currentIaxpermit);

        }
    }

    /**
     * @param attributes
     * @return Iaxgeneral
     */
    protected void linkIaxgeneral() {
        if (currentIaxgeneral != null) {
            conf = currentIaxgeneral;
        }
    }

    /**
     * @param attributes
     * @return Iaxpeer
     */
    protected void linkIaxpeer() {
        if (currentIaxpeer != null) {
            if (currentIaxgeneral != null) {
                currentIaxgeneral.addIaxpeer(currentIaxpeer);
            }

        }
    }

    /**
     * @param attributes
     * @return Iaxjitter
     */
    protected void linkIaxjitter() {
        if (currentIaxjitter != null) {
            if (currentIaxgeneral != null) {
                currentIaxgeneral.setIaxjitter(currentIaxjitter);
            }

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
