/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zaptelconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.7 2006/01/09 10:17:34 urs
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
        if (data instanceof Zapteltonezone) {
            return writeZapteltonezone(doc, (Zapteltonezone) data);
        }
        if (data instanceof Zaptelchannels) {
            return writeZaptelchannels(doc, (Zaptelchannels) data);
        }
        if (data instanceof Zaptelconf) {
            return writeZaptelconf(doc, (Zaptelconf) data);
        }
        if (data instanceof Zapteldynamicspan) {
            return writeZapteldynamicspan(doc, (Zapteldynamicspan) data);
        }
        if (data instanceof Zaptelspan) {
            return writeZaptelspan(doc, (Zaptelspan) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZapteltonezone(Document doc, Zapteltonezone impl) {
        Element xZapteltonezone = doc.createElement("Zapteltonezone");

        // felder schreiben
        if (impl.getZonename() != null)
            xZapteltonezone.setAttribute("zonename", impl.getZonename()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xZapteltonezone);
        return xZapteltonezone;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZaptelchannels(Document doc, Zaptelchannels impl) {
        Element xZaptelchannels = doc.createElement("Zaptelchannels");

        // felder schreiben
        if (impl.getDevice() != null)
            xZaptelchannels.setAttribute("device", impl.getDevice().toString());
        if (impl.getChannellist() != null)
            xZaptelchannels.setAttribute("channellist", impl.getChannellist()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xZaptelchannels);
        return xZaptelchannels;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZaptelconf(Document doc, Zaptelconf impl) {
        Element xZaptelconf = doc.createElement("Zaptelconf");

        // felder schreiben
        if (impl.getDefaultzone() != null)
            xZaptelconf.setAttribute("defaultzone", impl.getDefaultzone()
                    .toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getZaptelchannelsMap().iterator(); iter
                .hasNext();) {
            Zaptelchannels mobj = (Zaptelchannels) iter.next();

            Element xZaptelchannels = writeZaptelchannels(doc, mobj);
            xZaptelconf.appendChild(xZaptelchannels);

        }
        // maps schreiben

        for (Iterator iter = impl.getZapteldynamicspanMap().iterator(); iter
                .hasNext();) {
            Zapteldynamicspan mobj = (Zapteldynamicspan) iter.next();

            Element xZapteldynamicspan = writeZapteldynamicspan(doc, mobj);
            xZaptelconf.appendChild(xZapteldynamicspan);

        }
        // maps schreiben

        for (Iterator iter = impl.getZaptelspanMap().iterator(); iter.hasNext();) {
            Zaptelspan mobj = (Zaptelspan) iter.next();

            Element xZaptelspan = writeZaptelspan(doc, mobj);
            xZaptelconf.appendChild(xZaptelspan);

        }
        // maps schreiben

        for (Iterator iter = impl.getZapteltonezoneMap().iterator(); iter
                .hasNext();) {
            Zapteltonezone mobj = (Zapteltonezone) iter.next();

            Element xZapteltonezone = writeZapteltonezone(doc, mobj);
            xZaptelconf.appendChild(xZapteltonezone);

        }
        doc.appendChild(xZaptelconf);
        return xZaptelconf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZapteldynamicspan(Document doc,
            Zapteldynamicspan impl) {
        Element xZapteldynamicspan = doc.createElement("Zapteldynamicspan");

        // felder schreiben
        if (impl.getDriver() != null)
            xZapteldynamicspan.setAttribute("driver", impl.getDriver()
                    .toString());
        if (impl.getAddress() != null)
            xZapteldynamicspan.setAttribute("address", impl.getAddress()
                    .toString());
        if (impl.getNumchans() != null)
            xZapteldynamicspan.setAttribute("numchans", impl.getNumchans()
                    .toString());
        if (impl.getTiming() != null)
            xZapteldynamicspan.setAttribute("timing", impl.getTiming()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xZapteldynamicspan);
        return xZapteldynamicspan;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZaptelspan(Document doc, Zaptelspan impl) {
        Element xZaptelspan = doc.createElement("Zaptelspan");

        // felder schreiben
        if (impl.getSpan_num() != null)
            xZaptelspan.setAttribute("span_num", impl.getSpan_num().toString());
        if (impl.getTiming() != null)
            xZaptelspan.setAttribute("timing", impl.getTiming().toString());
        if (impl.getLbo() != null)
            xZaptelspan.setAttribute("lbo", impl.getLbo().toString());
        if (impl.getFraming() != null)
            xZaptelspan.setAttribute("framing", impl.getFraming().toString());
        if (impl.getCoding() != null)
            xZaptelspan.setAttribute("coding", impl.getCoding().toString());
        if (impl.getYellow() != null)
            xZaptelspan.setAttribute("yellow", impl.getYellow().toString());
        // aggregate schreiben

        doc.appendChild(xZaptelspan);
        return xZaptelspan;
    }
}
