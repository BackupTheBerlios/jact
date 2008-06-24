/*
 * (c) urs zeidler
 */
package com.useit.jact.io.managerconf;

import org.w3c.dom.Document;

import com.useit.jact.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.7 2006/01/12 19:44:45
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
     * @return ManagergeneralSection
     */
    protected void linkManagergeneralSection() {
        if (currentManagergeneralSection != null) {
            conf = currentManagergeneralSection;
        }
    }

    /**
     * @param attributes
     * @return Managerdeny
     */
    protected void linkManagerdeny() {
        if (currentManagerSection != null) {
            currentManagerSection.addManagerdeny(currentManagerdeny);
        }
        // if(currentManagerdeny!=null){
        //		
        // }
    }

    /**
     * @param attributes
     * @return ManagerSection
     */
    protected void linkManagerSection() {
        if (currentManagergeneralSection != null) {
            if (currentManagerSection != null) {
                currentManagergeneralSection
                        .addManagerSection(currentManagerSection);
            }
        }
    }

    /**
     * @param attributes
     * @return Managerpermit
     */
    protected void linkManagerpermit() {
        if (currentManagerSection != null) {
            currentManagerSection.addManagerpermit(currentManagerpermit);
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
