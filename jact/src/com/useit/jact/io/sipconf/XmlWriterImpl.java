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
package com.useit.jact.io.sipconf;

import java.io.InputStream;
import java.io.OutputStream;

import org.w3c.dom.Document;

import com.useit.app.framework.io.BasicSax;
import com.useit.jact.model.sipconf.SipConf;

/**
 * <p>
 * XmlWriterImpl
 * </p>
 * Created : 16.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriterImpl.java,v 1.4 2006/03/17 15:47:22
 *          urs Exp $
 */
public class XmlWriterImpl extends XmlWriter {

    /**
     * @param filename
     * @param conf
     */
    public static void writeConf(String filename, Object conf) {
        Document doc = BasicSax.createDomDocument();
        writeSipConf(doc, (SipConf) conf);
        BasicSax.writeXmlFile(doc, filename);

    }

    /**
     * @param filename
     * @param conf
     */
    public static void writeConf(OutputStream out, Object conf) {
        Document doc = BasicSax.createDomDocument();
        writeSipConf(doc, (SipConf) conf);
        BasicSax.writeXmlFile(doc, out);

    }

    public static Object readConf(String filename) {
        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile(filename, hnd, false);
        return hnd.getSipConf();
    }

    public static Object readConf(InputStream stream) {
        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile(stream, hnd, false);
        return hnd.getSipConf();
    }
}
