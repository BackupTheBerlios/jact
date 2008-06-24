/*
 * (c) urs zeidler
 */
package com.useit.jact.io.musiconholdconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.6 2006/01/09 10:17:42 urs
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
        if (data instanceof MohClasses) {
            return writeMohClasses(doc, (MohClasses) data);
        }
        if (data instanceof Music_on_HoldConf) {
            return writeMusic_on_HoldConf(doc, (Music_on_HoldConf) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMohClasses(Document doc, MohClasses impl) {
        Element xMohClasses = doc.createElement("MohClasses");

        // felder schreiben
        if (impl.getName() != null)
            xMohClasses.setAttribute("name", impl.getName().toString());
        if (impl.getPlayer() != null)
            xMohClasses.setAttribute("player", impl.getPlayer().toString());
        if (impl.getMohdir() != null)
            xMohClasses.setAttribute("mohdir", impl.getMohdir().toString());
        if (impl.getMohpara() != null)
            xMohClasses.setAttribute("mohpara", impl.getMohpara().toString());
        // aggregate schreiben

        doc.appendChild(xMohClasses);
        return xMohClasses;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMusic_on_HoldConf(Document doc,
            Music_on_HoldConf impl) {
        Element xMusic_on_HoldConf = doc.createElement("Music_on_HoldConf");

        // felder schreiben
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getMohClassesMap().iterator(); iter.hasNext();) {
            MohClasses mobj = (MohClasses) iter.next();

            Element xMohClasses = writeMohClasses(doc, mobj);
            xMusic_on_HoldConf.appendChild(xMohClasses);

        }
        doc.appendChild(xMusic_on_HoldConf);
        return xMusic_on_HoldConf;
    }
}
