/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdnconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.10 2006/01/13 16:54:44
 *          urs Exp $
 */
public class XmlWriter {

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public static Element writeConf(Document doc, Object data) {
        if (data instanceof MisdnCryptkey) {
            return writeMisdnCryptkey(doc, (MisdnCryptkey) data);
        }
        if (data instanceof MisdnPorts) {
            return writeMisdnPorts(doc, (MisdnPorts) data);
        }
        if (data instanceof MisdnSections) {
            return writeMisdnSections(doc, (MisdnSections) data);
        }
        if (data instanceof Misdnconf) {
            return writeMisdnconf(doc, (Misdnconf) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdnCryptkey(Document doc, MisdnCryptkey impl) {
        Element xMisdnCryptkey = doc.createElement("MisdnCryptkey");

        // felder schreiben
        if (impl.getKeyname() != null)
            xMisdnCryptkey
                    .setAttribute("keyname", impl.getKeyname().toString());
        if (impl.getKeyvalue() != null)
            xMisdnCryptkey.setAttribute("keyvalue", impl.getKeyvalue()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xMisdnCryptkey);
        return xMisdnCryptkey;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdnPorts(Document doc, MisdnPorts impl) {
        Element xMisdnPorts = doc.createElement("MisdnPorts");

        // felder schreiben
        if (impl.getPortN() != null)
            xMisdnPorts.setAttribute("portN", impl.getPortN().toString());
        if (impl.getPortOption() != null)
            xMisdnPorts.setAttribute("portOption", impl.getPortOption()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xMisdnPorts);
        return xMisdnPorts;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdnSections(Document doc, MisdnSections impl) {
        Element xMisdnSections = doc.createElement("MisdnSections");

        // felder schreiben
        if (impl.getContext() != null)
            xMisdnSections
                    .setAttribute("context", impl.getContext().toString());
        if (impl.getLanguage() != null)
            xMisdnSections.setAttribute("language", impl.getLanguage()
                    .toString());
        if (impl.getNationalprefix() != null)
            xMisdnSections.setAttribute("nationalprefix", impl
                    .getNationalprefix().toString());
        if (impl.getInternationalprefix() != null)
            xMisdnSections.setAttribute("internationalprefix", impl
                    .getInternationalprefix().toString());
        if (impl.getRxgain() != null)
            xMisdnSections.setAttribute("rxgain", impl.getRxgain().toString());
        if (impl.getTxgain() != null)
            xMisdnSections.setAttribute("txgain", impl.getTxgain().toString());
        if (impl.getTe_choose_channel() != null)
            xMisdnSections.setAttribute("te_choose_channel", impl
                    .getTe_choose_channel().toString());
        if (impl.getEarly_bconnect() != null)
            xMisdnSections.setAttribute("early_bconnect", impl
                    .getEarly_bconnect().toString());
        if (impl.getDialplan() != null)
            xMisdnSections.setAttribute("dialplan", impl.getDialplan()
                    .toString());
        if (impl.getUse_callingpres() != null)
            xMisdnSections.setAttribute("use_callingpres", impl
                    .getUse_callingpres().toString());
        if (impl.getAlways_immediate() != null)
            xMisdnSections.setAttribute("always_immediate", impl
                    .getAlways_immediate().toString());
        if (impl.getImmediate() != null)
            xMisdnSections.setAttribute("immediate", impl.getImmediate()
                    .toString());
        if (impl.getHold_allowed() != null)
            xMisdnSections.setAttribute("hold_allowed", impl.getHold_allowed()
                    .toString());
        if (impl.getPickgroup() != null)
            xMisdnSections.setAttribute("pickgroup", impl.getPickgroup()
                    .toString());
        if (impl.getCallgroup() != null)
            xMisdnSections.setAttribute("callgroup", impl.getCallgroup()
                    .toString());
        if (impl.getPresentation() != null)
            xMisdnSections.setAttribute("presentation", impl.getPresentation()
                    .toString());
        if (impl.getEchocancel() != null)
            xMisdnSections.setAttribute("echocancel", impl.getEchocancel()
                    .toString());
        if (impl.getEchocancelwhenbridged() != null)
            xMisdnSections.setAttribute("echocancelwhenbridged", impl
                    .getEchocancelwhenbridged().toString());
        if (impl.getEchotraining() != null)
            xMisdnSections.setAttribute("echotraining", impl.getEchotraining()
                    .toString());
        if (impl.getSectionname() != null)
            xMisdnSections.setAttribute("sectionname", impl.getSectionname()
                    .toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getMisdnPortsMap().iterator(); iter.hasNext();) {
            MisdnPorts mobj = (MisdnPorts) iter.next();

            Element xMisdnPorts = writeMisdnPorts(doc, mobj);
            xMisdnSections.appendChild(xMisdnPorts);

        }
        doc.appendChild(xMisdnSections);
        return xMisdnSections;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMisdnconf(Document doc, Misdnconf impl) {
        Element xMisdnconf = doc.createElement("Misdnconf");

        // felder schreiben
        if (impl.getDebug() != null)
            xMisdnconf.setAttribute("debug", impl.getDebug().toString());
        if (impl.getTracefile() != null)
            xMisdnconf
                    .setAttribute("tracefile", impl.getTracefile().toString());
        if (impl.getTrace_calls() != null)
            xMisdnconf.setAttribute("trace_calls", impl.getTrace_calls()
                    .toString());
        if (impl.getTrace_dir() != null)
            xMisdnconf
                    .setAttribute("trace_dir", impl.getTrace_dir().toString());
        if (impl.getBridging() != null)
            xMisdnconf.setAttribute("bridging", impl.getBridging().toString());
        if (impl.getStop_tone_after_first_digit() != null)
            xMisdnconf.setAttribute("stop_tone_after_first_digit", impl
                    .getStop_tone_after_first_digit().toString());
        if (impl.getAppend_digits2exten() != null)
            xMisdnconf.setAttribute("append_digits2exten", impl
                    .getAppend_digits2exten().toString());
        if (impl.getL1_info_ok() != null)
            xMisdnconf.setAttribute("l1_info_ok", impl.getL1_info_ok()
                    .toString());
        if (impl.getClear_l3() != null)
            xMisdnconf.setAttribute("clear_l3", impl.getClear_l3().toString());
        if (impl.getDynamic_crypt() != null)
            xMisdnconf.setAttribute("dynamic_crypt", impl.getDynamic_crypt()
                    .toString());
        if (impl.getCrypt_prefix() != null)
            xMisdnconf.setAttribute("crypt_prefix", impl.getCrypt_prefix()
                    .toString());
        if (impl.getFileid() != null)
            xMisdnconf.setAttribute("fileid", impl.getFileid().toString());
        if (impl.getContext() != null)
            xMisdnconf.setAttribute("context", impl.getContext().toString());
        // aggregate schreiben

        Element xMisdnSectionsAgg = writeMisdnSections(doc, impl
                .getMisdnSections());
        xMisdnconf.appendChild(xMisdnSectionsAgg);

        // maps schreiben

        for (Iterator iter = impl.getMisdnCryptkeyMap().iterator(); iter
                .hasNext();) {
            MisdnCryptkey mobj = (MisdnCryptkey) iter.next();

            Element xMisdnCryptkey = writeMisdnCryptkey(doc, mobj);
            xMisdnconf.appendChild(xMisdnCryptkey);

        }
        // maps schreiben

        for (Iterator iter = impl.getMisdnSectionsMap().iterator(); iter
                .hasNext();) {
            MisdnSections mobj = (MisdnSections) iter.next();

            Element xMisdnSections = writeMisdnSections(doc, mobj);
            xMisdnconf.appendChild(xMisdnSections);

        }
        doc.appendChild(xMisdnconf);
        return xMisdnconf;
    }
}
