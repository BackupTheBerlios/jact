/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zaptelconf;

import org.w3c.dom.Document;

import com.useit.app.framework.io.BasicSax;

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
     * @return Zaptelchannels
     */
    protected void linkZaptelchannels() {
        if (currentZaptelconf != null) {
            currentZaptelconf.addZaptelchannels(currentZaptelchannels);

        }
    }

    /**
     * @param attributes
     * @return Zapteltonezone
     */
    protected void linkZapteltonezone() {
        if (currentZaptelconf != null) {
            currentZaptelconf.addZapteltonezone(currentZapteltonezone);

        }
    }

    /**
     * @param attributes
     * @return Zaptelspan
     */
    protected void linkZaptelspan() {
        if (currentZaptelconf != null) {
            currentZaptelconf.addZaptelspan(currentZaptelspan);

        }
    }

    /**
     * @param attributes
     * @return Zapteldynamicspan
     */
    protected void linkZapteldynamicspan() {
        if (currentZaptelconf != null) {
            currentZaptelconf.addZapteldynamicspan(currentZapteldynamicspan);

        }
    }

    /**
     * @param attributes
     * @return Zaptelconf
     */
    protected void linkZaptelconf() {
        if (currentZaptelconf != null) {
            conf = currentZaptelconf;

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
