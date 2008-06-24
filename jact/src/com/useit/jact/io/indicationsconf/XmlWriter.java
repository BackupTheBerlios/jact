/*
 * (c) urs zeidler
 */
package com.useit.jact.io.indicationsconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

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
        if (data instanceof ToneDefinitions) {
            return writeToneDefinitions(doc, (ToneDefinitions) data);
        }
        if (data instanceof Indicationsconf) {
            return writeIndicationsconf(doc, (Indicationsconf) data);
        }
        if (data instanceof CustomTone) {
            return writeCustomTone(doc, (CustomTone) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeToneDefinitions(Document doc,
            ToneDefinitions impl) {
        Element xToneDefinitions = doc.createElement("ToneDefinitions");

        // felder schreiben
        if (impl.getCountrycode() != null)
            xToneDefinitions.setAttribute("countrycode", impl.getCountrycode()
                    .toString());
        if (impl.getDescription() != null)
            xToneDefinitions.setAttribute("description", impl.getDescription()
                    .toString());
        if (impl.getAlias() != null)
            xToneDefinitions.setAttribute("alias", impl.getAlias().toString());
        if (impl.getRingcadence() != null)
            xToneDefinitions.setAttribute("ringcadence", impl.getRingcadence()
                    .toString());
        if (impl.getDial() != null)
            xToneDefinitions.setAttribute("dial", impl.getDial().toString());
        if (impl.getBusy() != null)
            xToneDefinitions.setAttribute("busy", impl.getBusy().toString());
        if (impl.getRing() != null)
            xToneDefinitions.setAttribute("ring", impl.getRing().toString());
        if (impl.getCongestion() != null)
            xToneDefinitions.setAttribute("congestion", impl.getCongestion()
                    .toString());
        if (impl.getCallwaiting() != null)
            xToneDefinitions.setAttribute("callwaiting", impl.getCallwaiting()
                    .toString());
        if (impl.getDialrecall() != null)
            xToneDefinitions.setAttribute("dialrecall", impl.getDialrecall()
                    .toString());
        if (impl.getRecord() != null)
            xToneDefinitions
                    .setAttribute("record", impl.getRecord().toString());
        if (impl.getInfo() != null)
            xToneDefinitions.setAttribute("info", impl.getInfo().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getCustomToneMap().iterator(); iter.hasNext();) {
            CustomTone mobj = (CustomTone) iter.next();

            Element xCustomTone = writeCustomTone(doc, mobj);
            xToneDefinitions.appendChild(xCustomTone);

        }
        doc.appendChild(xToneDefinitions);
        return xToneDefinitions;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIndicationsconf(Document doc,
            Indicationsconf impl) {
        Element xIndicationsconf = doc.createElement("Indicationsconf");

        // felder schreiben
        if (impl.getCountry() != null)
            xIndicationsconf.setAttribute("country", impl.getCountry()
                    .toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getToneDefinitionsMap().iterator(); iter
                .hasNext();) {
            ToneDefinitions mobj = (ToneDefinitions) iter.next();

            Element xToneDefinitions = writeToneDefinitions(doc, mobj);
            xIndicationsconf.appendChild(xToneDefinitions);

        }
        doc.appendChild(xIndicationsconf);
        return xIndicationsconf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeCustomTone(Document doc, CustomTone impl) {
        Element xCustomTone = doc.createElement("CustomTone");

        // felder schreiben
        if (impl.getTonecode() != null)
            xCustomTone.setAttribute("tonecode", impl.getTonecode().toString());
        if (impl.getName() != null)
            xCustomTone.setAttribute("name", impl.getName().toString());
        // aggregate schreiben

        doc.appendChild(xCustomTone);
        return xCustomTone;
    }
}
