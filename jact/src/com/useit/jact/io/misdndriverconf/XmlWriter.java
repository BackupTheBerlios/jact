/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdndriverconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.6 2006/01/09 10:17:35 urs
 *          Exp $
 */
public class XmlWriter {

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public static Element writeConf(Document doc, Object data) {
        if (data instanceof MisdnCards) {
            return writeMisdnCards(doc, (MisdnCards) data);
        }
        if (data instanceof MisdnDriverConf) {
            return writeMisdnDriverConf(doc, (MisdnDriverConf) data);
        }
        if (data instanceof MisdncardPorts) {
            return writeMisdncardPorts(doc, (MisdncardPorts) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdnCards(Document doc, MisdnCards impl) {
        Element xMisdnCards = doc.createElement("MisdnCards");

        // felder schreiben
        if (impl.getCardName() != null)
            xMisdnCards.setAttribute("cardName", impl.getCardName().toString());
        if (impl.getCardType() != null)
            xMisdnCards.setAttribute("cardType", impl.getCardType().toString());
        if (impl.getCardOptions() != null)
            xMisdnCards.setAttribute("cardOptions", impl.getCardOptions()
                    .toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getMisdncardPortsMap().iterator(); iter
                .hasNext();) {
            MisdncardPorts mobj = (MisdncardPorts) iter.next();

            Element xMisdncardPorts = writeMisdncardPorts(doc, mobj);
            xMisdnCards.appendChild(xMisdncardPorts);

        }
        doc.appendChild(xMisdnCards);
        return xMisdnCards;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdnDriverConf(Document doc,
            MisdnDriverConf impl) {
        Element xMisdnDriverConf = doc.createElement("MisdnDriverConf");

        // felder schreiben
        if (impl.getPoll() != null)
            xMisdnDriverConf.setAttribute("poll", impl.getPoll().toString());
        if (impl.getPcm() != null)
            xMisdnDriverConf.setAttribute("pcm", impl.getPcm().toString());
        if (impl.getDebug() != null)
            xMisdnDriverConf.setAttribute("debug", impl.getDebug().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getMisdnCardsMap().iterator(); iter.hasNext();) {
            MisdnCards mobj = (MisdnCards) iter.next();

            Element xMisdnCards = writeMisdnCards(doc, mobj);
            xMisdnDriverConf.appendChild(xMisdnCards);

        }
        doc.appendChild(xMisdnDriverConf);
        return xMisdnDriverConf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdncardPorts(Document doc, MisdncardPorts impl) {
        Element xMisdncardPorts = doc.createElement("MisdncardPorts");

        // felder schreiben
        if (impl.getPortN() != null)
            xMisdncardPorts.setAttribute("portN", impl.getPortN().toString());
        if (impl.getPortOption() != null)
            xMisdncardPorts.setAttribute("portOption", impl.getPortOption()
                    .toString());
        if (impl.getMPortOption() != null)
            xMisdncardPorts.setAttribute("mPortOption", impl.getMPortOption()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xMisdncardPorts);
        return xMisdncardPorts;
    }
}
