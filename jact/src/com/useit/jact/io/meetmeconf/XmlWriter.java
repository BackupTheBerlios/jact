/*
 * (c) urs zeidler
 */
package com.useit.jact.io.meetmeconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;

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
        if (data instanceof Meetmerooms) {
            return writeMeetmerooms(doc, (Meetmerooms) data);
        }
        if (data instanceof Meetmeconf) {
            return writeMeetmeconf(doc, (Meetmeconf) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMeetmerooms(Document doc, Meetmerooms impl) {
        Element xMeetmerooms = doc.createElement("Meetmerooms");

        // felder schreiben
        if (impl.getConfno() != null)
            xMeetmerooms.setAttribute("confno", impl.getConfno().toString());
        if (impl.getPincode() != null)
            xMeetmerooms.setAttribute("pincode", impl.getPincode().toString());
        if (impl.getAdminpin() != null)
            xMeetmerooms
                    .setAttribute("adminpin", impl.getAdminpin().toString());
        // aggregate schreiben

        doc.appendChild(xMeetmerooms);
        return xMeetmerooms;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMeetmeconf(Document doc, Meetmeconf impl) {
        Element xMeetmeconf = doc.createElement("Meetmeconf");

        // felder schreiben
        if (impl.getFileid() != null)
            xMeetmeconf.setAttribute("fileid", impl.getFileid().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getMeetmeroomsMap().iterator(); iter
                .hasNext();) {
            Meetmerooms mobj = (Meetmerooms) iter.next();

            Element xMeetmerooms = writeMeetmerooms(doc, mobj);
            xMeetmeconf.appendChild(xMeetmerooms);

        }
        doc.appendChild(xMeetmeconf);
        return xMeetmeconf;
    }
}
