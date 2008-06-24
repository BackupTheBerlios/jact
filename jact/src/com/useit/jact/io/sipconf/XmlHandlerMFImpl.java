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

import org.w3c.dom.Document;

import com.useit.app.framework.io.BasicSax;
import com.useit.app.framework.model.dataModel.IModelFactory;
import com.useit.jact.model.sipconf.ISipConf;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.8 2006/01/09 19:00:44
 *          urs Exp $
 */
public class XmlHandlerMFImpl extends XmlHandlerMF {

    private ISipConf sipConf;

    /**
     * 
     */
    public XmlHandlerMFImpl(IModelFactory factory) {
        super(factory);
    }

    public ISipConf getSipConf() {
        return sipConf;
    }

    /**
     * @param attributes
     * @return Sipregister
     */
    protected void linkSipregister() {
        if (currentSipgeneral != null) {
            currentSipgeneral.getSipregisterMap().add(currentSipregister);
            return;
        }

    }

    // /**
    // * @param attributes
    // * @return Sipallow
    // */
    // protected void linkSipallow() {
    // if(currentSippeers!=null){
    // currentSippeers.addSipallow(currentSipallow);
    // return;
    // }
    // if(currentSipgeneral!=null){
    // currentSipgeneral.addSipallow(currentSipallow);
    // return;
    // }
    //	
    // }

    // protected void linkAllow() {
    // if(currentSippeers!=null){
    // currentSippeers.addAllow(currentAllow);
    // return;
    // }
    // if(currentSipgeneral!=null){
    // currentSipgeneral.addAllow(currentAllow);
    // return;
    // }
    //        
    //        
    // super.linkAllow();
    // }
    // /**
    // * @param attributes
    // * @return Sipdisallow
    // */
    // protected void linkSipdisallow() {
    // if(currentSippeers!=null){
    // currentSippeers.addSipdisallow(currentSipdisallow);
    // return;
    // }
    // if(currentSipgeneral!=null){
    // currentSipgeneral.addSipdisallow(currentSipdisallow);
    // return;
    // }
    //	
    // }
    //
    // protected void linkDisallow() {
    // if(currentSippeers!=null){
    // currentSippeers.addDisallow(currentDisallow);
    // return;
    // }
    // if(currentSipgeneral!=null){
    // currentSipgeneral.addDisallow(currentDisallow);
    // return;
    // }
    // super.linkDisallow();
    // }
    // protected void linkRegister() {
    // super.linkRegister();
    // }
    protected void linkSipgeneral() {
        if (currentSipConf != null) {
            currentSipConf.setSipgeneral(currentSipgeneral);
            return;
        }

        super.linkSipgeneral();
    }

    protected void linkSippeers() {
        if (currentSipConf != null) {
            currentSipConf.getSippeersMap().add(currentSippeers);
            return;
        }
        super.linkSippeers();
    }

    protected void linkSipConf() {
        sipConf = currentSipConf;

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.sipconf.XmlHandler#linkSipauth()
     */
    protected void linkSipauth() {
        if (currentSippeers != null) {
            currentSippeers.getSipauthMap().add(currentSipauth);
            return;
        }
        if (currentSipgeneral != null) {
            currentSipgeneral.getSipauthMap().add(currentSipauth);
            return;
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

    public static Object readConf(String filename,IModelFactory factory) {
        XmlHandlerMFImpl hnd = new XmlHandlerMFImpl(factory);
        BasicSax.parseXmlFile(filename, hnd, false);
        return hnd.getSipConf();
    }

}
