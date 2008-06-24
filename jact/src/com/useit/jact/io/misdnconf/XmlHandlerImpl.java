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
package com.useit.jact.io.misdnconf;

import org.w3c.dom.Document;

import com.useit.app.framework.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.8 2006/01/14 15:00:13
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
     * @return Misdnconf
     */
    protected void linkMisdnconf() {
        if (currentMisdnconf != null) {
            conf = currentMisdnconf;
        }
    }

    /**
     * @param attributes
     * @return MisdnCryptkey
     */
    protected void linkMisdnCryptkey() {
        if (currentMisdnconf != null) {
            currentMisdnconf.addMisdnCryptkey(currentMisdnCryptkey);
        }
    }

    /**
     * @param attributes
     * @return MisdnSections
     */
    protected void linkMisdnSections() {
        if (currentMisdnconf != null) {
            if (currentMisdnSections.getSectionname().equals("default"))
                currentMisdnconf.setMisdnSections(currentMisdnSections);
            else
                currentMisdnconf.addMisdnSections(currentMisdnSections);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.misdnconf.XmlHandler#linkMisdnPorts()
     */
    protected void linkMisdnPorts() {
        if (currentMisdnSections != null) {
            currentMisdnSections.addMisdnPorts(currentMisdnPorts);
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
