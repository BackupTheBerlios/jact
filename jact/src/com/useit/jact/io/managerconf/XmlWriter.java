/*
 * (c) urs zeidler
 */
package com.useit.jact.io.managerconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.Managerpermit;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.6 2006/01/09 10:17:34 urs
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
        if (data instanceof ManagergeneralSection) {
            return writeManagergeneralSection(doc, (ManagergeneralSection) data);
        }
        if (data instanceof Managerdeny) {
            return writeManagerdeny(doc, (Managerdeny) data);
        }
        if (data instanceof ManagerSection) {
            return writeManagerSection(doc, (ManagerSection) data);
        }
        if (data instanceof Managerpermit) {
            return writeManagerpermit(doc, (Managerpermit) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeManagergeneralSection(Document doc,
            ManagergeneralSection impl) {
        Element xManagergeneralSection = doc
                .createElement("ManagergeneralSection");

        // felder schreiben
        if (impl.getGeneralid() != null)
            xManagergeneralSection.setAttribute("generalid", impl
                    .getGeneralid().toString());
        if (impl.getEnabled() != null)
            xManagergeneralSection.setAttribute("enabled", impl.getEnabled()
                    .toString());
        if (impl.getPortno() != null)
            xManagergeneralSection.setAttribute("portno", impl.getPortno()
                    .toString());
        if (impl.getBindaddr() != null)
            xManagergeneralSection.setAttribute("bindaddr", impl.getBindaddr()
                    .toString());
        if (impl.getPort() != null)
            xManagergeneralSection.setAttribute("port", impl.getPort()
                    .toString());
        if (impl.getFileid() != null)
            xManagergeneralSection.setAttribute("fileid", impl.getFileid()
                    .toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getManagerSectionMap().iterator(); iter
                .hasNext();) {
            ManagerSection mobj = (ManagerSection) iter.next();

            Element xManagerSection = writeManagerSection(doc, mobj);
            xManagergeneralSection.appendChild(xManagerSection);

        }
        doc.appendChild(xManagergeneralSection);
        return xManagergeneralSection;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeManagerdeny(Document doc, Managerdeny impl) {
        Element xManagerdeny = doc.createElement("Managerdeny");

        // felder schreiben
        if (impl.getValue() != null)
            xManagerdeny.setAttribute("value", impl.getValue().toString());
        // aggregate schreiben

        doc.appendChild(xManagerdeny);
        return xManagerdeny;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeManagerSection(Document doc, ManagerSection impl) {
        Element xManagerSection = doc.createElement("ManagerSection");

        // felder schreiben
        if (impl.getUsername() != null)
            xManagerSection.setAttribute("username", impl.getUsername()
                    .toString());
        if (impl.getSecret() != null)
            xManagerSection.setAttribute("secret", impl.getSecret().toString());
        if (impl.getRead() != null)
            xManagerSection.setAttribute("read", impl.getRead().toString());
        if (impl.getWrite() != null)
            xManagerSection.setAttribute("write", impl.getWrite().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getManagerdenyMap().iterator(); iter
                .hasNext();) {
            Managerdeny mobj = (Managerdeny) iter.next();

            Element xManagerdeny = writeManagerdeny(doc, mobj);
            xManagerSection.appendChild(xManagerdeny);

        }
        // maps schreiben

        for (Iterator iter = impl.getManagerpermitMap().iterator(); iter
                .hasNext();) {
            Managerpermit mobj = (Managerpermit) iter.next();

            Element xManagerpermit = writeManagerpermit(doc, mobj);
            xManagerSection.appendChild(xManagerpermit);

        }
        doc.appendChild(xManagerSection);
        return xManagerSection;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeManagerpermit(Document doc, Managerpermit impl) {
        Element xManagerpermit = doc.createElement("Managerpermit");

        // felder schreiben
        if (impl.getValue() != null)
            xManagerpermit.setAttribute("value", impl.getValue().toString());
        // aggregate schreiben

        doc.appendChild(xManagerpermit);
        return xManagerpermit;
    }
}
