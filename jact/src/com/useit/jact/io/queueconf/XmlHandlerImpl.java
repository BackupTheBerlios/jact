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
package com.useit.jact.io.queueconf;

import org.w3c.dom.Document;

import com.useit.app.framework.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.6 2006/01/12 15:20:11
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
     * @return Queuegeneral
     */
    protected void linkQueuegeneral() {
        if (currentQueuegeneral != null) {
            conf = currentQueuegeneral;
        }
    }

    /**
     * @param attributes
     * @return Queuesection
     */
    protected void linkQueuesection() {
        if (currentQueuegeneral != null) {
            currentQueuegeneral.addQueuesection(currentQueuesection);
        }
    }

    /**
     * @param attributes
     * @return Queuemember
     */
    protected void linkQueuemember() {
        if (currentQueuesection != null) {
            currentQueuesection.addQueuemember(currentQueuemember);
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
