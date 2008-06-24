/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdndriverconf;

import org.w3c.dom.Document;

import com.useit.jact.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.1 2005/12/25 18:10:01
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
     * @return MisdnCards
     */
    protected void linkMisdnCards() {
        // if(currentMisdnCards!=null){
        //		
        // }
    }

    /**
     * @param attributes
     * @return MisdnDriverConf
     */
    protected void linkMisdnDriverConf() {
        // if(currentMisdnDriverConf!=null){
        //		
        // }
    }

    /**
     * @param attributes
     * @return MisdncardPorts
     */
    protected void linkMisdncardPorts() {
        // if(currentMisdncardPorts!=null){
        //		
        // }
    }

    /**
     * @param filename
     * @param conf
     */
    public static void writeConf(String filename, Object conf) {
        Document doc = BasicSax.createDomDocument();
        // TODO : die wirklich schreib metohe aufrufen.
        // XmlWriter.writeSipConf(doc, (SipConf) conf);
        BasicSax.writeXmlFile(doc, filename);

    }

    public static Object readConf(String filename) {
        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile(filename, hnd, false);
        return hnd.getConf();
    }

}
