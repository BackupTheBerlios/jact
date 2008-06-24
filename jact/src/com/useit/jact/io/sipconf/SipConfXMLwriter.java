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
import com.useit.jact.model.sipconf.SipConf;

/**
 * <p>
 * SipConfXMLwriter
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipConfXMLwriter.java,v 1.4 2005/09/20
 *          14:02:21 urs Exp $
 */
public class SipConfXMLwriter {

    /**
     * 
     */
    public SipConfXMLwriter(SipConf sconf) {
        super();
        Document doc = BasicSax.createDomDocument();
        //        
        // Element sipconf = doc.createElement("sipconf");
        // //document.appendChild(document)
        // Element general = creategeneralElement(sconf.getSipgeneral(), doc);
        // sipconf.appendChild(general);
        //       
        //       
        // doc.appendChild(sipconf);
        //       
        // BasicSax.writeXmlFile(doc, "test.xml");
        //       
        //       
        // doc = BasicSax.createDomDocument();
        XmlWriter writer = new XmlWriter();
        writer.writeSipConf(doc, sconf);

        BasicSax.writeXmlFile(doc, "test1.xml");
    }

}
