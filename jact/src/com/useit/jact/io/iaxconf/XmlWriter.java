/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.Iaxregister;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.6 2006/01/09 10:17:46 urs
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
        if (data instanceof Iaxregister) {
            return writeIaxregister(doc, (Iaxregister) data);
        }
        if (data instanceof Iaxdeny) {
            return writeIaxdeny(doc, (Iaxdeny) data);
        }
        if (data instanceof Iaxpermit) {
            return writeIaxpermit(doc, (Iaxpermit) data);
        }
        if (data instanceof Iaxgeneral) {
            return writeIaxgeneral(doc, (Iaxgeneral) data);
        }
        if (data instanceof Iaxpeer) {
            return writeIaxpeer(doc, (Iaxpeer) data);
        }
        if (data instanceof Iaxjitter) {
            return writeIaxjitter(doc, (Iaxjitter) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIaxregister(Document doc, Iaxregister impl) {
        Element xIaxregister = doc.createElement("Iaxregister");

        // felder schreiben
        if (impl.getUser() != null)
            xIaxregister.setAttribute("user", impl.getUser().toString());
        if (impl.getAuthuser() != null)
            xIaxregister
                    .setAttribute("authuser", impl.getAuthuser().toString());
        if (impl.getSecret() != null)
            xIaxregister.setAttribute("secret", impl.getSecret().toString());
        if (impl.getHost() != null)
            xIaxregister.setAttribute("host", impl.getHost().toString());
        if (impl.getPort() != null)
            xIaxregister.setAttribute("port", impl.getPort().toString());
        if (impl.getExtension() != null)
            xIaxregister.setAttribute("extension", impl.getExtension()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xIaxregister);
        return xIaxregister;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIaxdeny(Document doc, Iaxdeny impl) {
        Element xIaxdeny = doc.createElement("Iaxdeny");

        // felder schreiben
        if (impl.getValue() != null)
            xIaxdeny.setAttribute("value", impl.getValue().toString());
        // aggregate schreiben

        doc.appendChild(xIaxdeny);
        return xIaxdeny;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIaxpermit(Document doc, Iaxpermit impl) {
        Element xIaxpermit = doc.createElement("Iaxpermit");

        // felder schreiben
        if (impl.getValue() != null)
            xIaxpermit.setAttribute("value", impl.getValue().toString());
        // aggregate schreiben

        doc.appendChild(xIaxpermit);
        return xIaxpermit;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIaxgeneral(Document doc, Iaxgeneral impl) {
        Element xIaxgeneral = doc.createElement("Iaxgeneral");

        // felder schreiben
        if (impl.getBindport() != null)
            xIaxgeneral.setAttribute("bindport", impl.getBindport().toString());
        if (impl.getBindaddr() != null)
            xIaxgeneral.setAttribute("bindaddr", impl.getBindaddr().toString());
        if (impl.getIaxcompat() != null)
            xIaxgeneral.setAttribute("iaxcompat", impl.getIaxcompat()
                    .toString());
        if (impl.getNochecksums() != null)
            xIaxgeneral.setAttribute("nochecksums", impl.getNochecksums()
                    .toString());
        if (impl.getDelayreject() != null)
            xIaxgeneral.setAttribute("delayreject", impl.getDelayreject()
                    .toString());
        if (impl.getAmaflags() != null)
            xIaxgeneral.setAttribute("amaflags", impl.getAmaflags().toString());
        if (impl.getAccountcode() != null)
            xIaxgeneral.setAttribute("accountcode", impl.getAccountcode()
                    .toString());
        if (impl.getLanguage() != null)
            xIaxgeneral.setAttribute("language", impl.getLanguage().toString());
        if (impl.getBandwidth() != null)
            xIaxgeneral.setAttribute("bandwidth", impl.getBandwidth()
                    .toString());
        if (impl.getTrunktimestamps() != null)
            xIaxgeneral.setAttribute("trunktimestamps", impl
                    .getTrunktimestamps().toString());
        if (impl.getAuthdebug() != null)
            xIaxgeneral.setAttribute("authdebug", impl.getAuthdebug()
                    .toString());
        if (impl.getTos() != null)
            xIaxgeneral.setAttribute("tos", impl.getTos().toString());
        if (impl.getMailboxdetail() != null)
            xIaxgeneral.setAttribute("mailboxdetail", impl.getMailboxdetail()
                    .toString());
        if (impl.getRegcontext() != null)
            xIaxgeneral.setAttribute("regcontext", impl.getRegcontext()
                    .toString());
        if (impl.getAutokill() != null)
            xIaxgeneral.setAttribute("autokill", impl.getAutokill().toString());
        if (impl.getCodecpriority() != null)
            xIaxgeneral.setAttribute("codecpriority", impl.getCodecpriority()
                    .toString());
        if (impl.getRtcachefriends() != null)
            xIaxgeneral.setAttribute("rtcachefriends", impl.getRtcachefriends()
                    .toString());
        if (impl.getRtupdate() != null)
            xIaxgeneral.setAttribute("rtupdate", impl.getRtupdate().toString());
        if (impl.getRtautoclear() != null)
            xIaxgeneral.setAttribute("rtautoclear", impl.getRtautoclear()
                    .toString());
        if (impl.getRtignoreexpire() != null)
            xIaxgeneral.setAttribute("rtignoreexpire", impl.getRtignoreexpire()
                    .toString());
        if (impl.getTrunkfreq() != null)
            xIaxgeneral.setAttribute("trunkfreq", impl.getTrunkfreq()
                    .toString());
        if (impl.getDisallow() != null)
            xIaxgeneral.setAttribute("disallow", impl.getDisallow().toString());
        if (impl.getAllow() != null)
            xIaxgeneral.setAttribute("allow", impl.getAllow().toString());
        if (impl.getMinregexpire() != null)
            xIaxgeneral.setAttribute("minregexpire", impl.getMinregexpire()
                    .toString());
        if (impl.getMaxregexpire() != null)
            xIaxgeneral.setAttribute("maxregexpire", impl.getMaxregexpire()
                    .toString());
        if (impl.getNotransfer() != null)
            xIaxgeneral.setAttribute("notransfer", impl.getNotransfer()
                    .toString());
        // aggregate schreiben
        Element xIaxjitterAgg = writeIaxjitter(doc, impl.getIaxjitter());
        xIaxgeneral.appendChild(xIaxjitterAgg);

        // maps schreiben

        for (Iterator iter = impl.getIaxpeerMap().iterator(); iter.hasNext();) {
            Iaxpeer mobj = (Iaxpeer) iter.next();

            Element xIaxpeer = writeIaxpeer(doc, mobj);
            xIaxgeneral.appendChild(xIaxpeer);

        }
        // maps schreiben

        for (Iterator iter = impl.getIaxregisterMap().iterator(); iter
                .hasNext();) {
            Iaxregister mobj = (Iaxregister) iter.next();

            Element xIaxregister = writeIaxregister(doc, mobj);
            xIaxgeneral.appendChild(xIaxregister);

        }
        doc.appendChild(xIaxgeneral);
        return xIaxgeneral;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIaxpeer(Document doc, Iaxpeer impl) {
        Element xIaxpeer = doc.createElement("Iaxpeer");

        // felder schreiben
        if (impl.getIaxpeername() != null)
            xIaxpeer.setAttribute("iaxpeername", impl.getIaxpeername()
                    .toString());
        if (impl.getPeertype() != null)
            xIaxpeer.setAttribute("peertype", impl.getPeertype().toString());
        if (impl.getCallerid() != null)
            xIaxpeer.setAttribute("callerid", impl.getCallerid().toString());
        if (impl.getAuth() != null)
            xIaxpeer.setAttribute("auth", impl.getAuth().toString());
        if (impl.getSecret() != null)
            xIaxpeer.setAttribute("secret", impl.getSecret().toString());
        if (impl.getInkeys() != null)
            xIaxpeer.setAttribute("inkeys", impl.getInkeys().toString());
        if (impl.getHost() != null)
            xIaxpeer.setAttribute("host", impl.getHost().toString());
        if (impl.getDefaultip() != null)
            xIaxpeer.setAttribute("defaultip", impl.getDefaultip().toString());
        if (impl.getContext() != null)
            xIaxpeer.setAttribute("context", impl.getContext().toString());
        if (impl.getDbsecret() != null)
            xIaxpeer.setAttribute("dbsecret", impl.getDbsecret().toString());
        if (impl.getSetvar() != null)
            xIaxpeer.setAttribute("setvar", impl.getSetvar().toString());
        if (impl.getPeercontext() != null)
            xIaxpeer.setAttribute("peercontext", impl.getPeercontext()
                    .toString());
        if (impl.getQualify() != null)
            xIaxpeer.setAttribute("qualify", impl.getQualify().toString());
        if (impl.getTrunk() != null)
            xIaxpeer.setAttribute("trunk", impl.getTrunk().toString());
        if (impl.getTimezone() != null)
            xIaxpeer.setAttribute("timezone", impl.getTimezone().toString());
        if (impl.getRegexten() != null)
            xIaxpeer.setAttribute("regexten", impl.getRegexten().toString());
        if (impl.getDisallow() != null)
            xIaxpeer.setAttribute("disallow", impl.getDisallow().toString());
        if (impl.getAllow() != null)
            xIaxpeer.setAttribute("allow", impl.getAllow().toString());
        if (impl.getMailbox() != null)
            xIaxpeer.setAttribute("mailbox", impl.getMailbox().toString());
        if (impl.getAccountcode() != null)
            xIaxpeer.setAttribute("accountcode", impl.getAccountcode()
                    .toString());
        if (impl.getOutkey() != null)
            xIaxpeer.setAttribute("outkey", impl.getOutkey().toString());
        if (impl.getNotransfer() != null)
            xIaxpeer
                    .setAttribute("notransfer", impl.getNotransfer().toString());
        if (impl.getQualifysmoothing() != null)
            xIaxpeer.setAttribute("qualifysmoothing", impl
                    .getQualifysmoothing().toString());
        if (impl.getQualifyfreqok() != null)
            xIaxpeer.setAttribute("qualifyfreqok", impl.getQualifyfreqok()
                    .toString());
        if (impl.getQualifyfreqnotok() != null)
            xIaxpeer.setAttribute("qualifyfreqnotok", impl
                    .getQualifyfreqnotok().toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getIaxdenyMap().iterator(); iter.hasNext();) {
            Iaxdeny mobj = (Iaxdeny) iter.next();

            Element xIaxdeny = writeIaxdeny(doc, mobj);
            xIaxpeer.appendChild(xIaxdeny);

        }
        // maps schreiben

        for (Iterator iter = impl.getIaxpermitMap().iterator(); iter.hasNext();) {
            Iaxpermit mobj = (Iaxpermit) iter.next();

            Element xIaxpermit = writeIaxpermit(doc, mobj);
            xIaxpeer.appendChild(xIaxpermit);

        }
        doc.appendChild(xIaxpeer);
        return xIaxpeer;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeIaxjitter(Document doc, Iaxjitter impl) {
        Element xIaxjitter = doc.createElement("Iaxjitter");

        // felder schreiben
        if (impl.getJitterbuffer() != null)
            xIaxjitter.setAttribute("jitterbuffer", impl.getJitterbuffer()
                    .toString());
        if (impl.getForcejitterbuffer() != null)
            xIaxjitter.setAttribute("forcejitterbuffer", impl
                    .getForcejitterbuffer().toString());
        if (impl.getDropcount() != null)
            xIaxjitter
                    .setAttribute("dropcount", impl.getDropcount().toString());
        if (impl.getMaxjitterbuffer() != null)
            xIaxjitter.setAttribute("maxjitterbuffer", impl
                    .getMaxjitterbuffer().toString());
        if (impl.getResyncthreshold() != null)
            xIaxjitter.setAttribute("resyncthreshold", impl
                    .getResyncthreshold().toString());
        if (impl.getMaxjitterinterps() != null)
            xIaxjitter.setAttribute("maxjitterinterps", impl
                    .getMaxjitterinterps().toString());
        if (impl.getMaxexcessbuffer() != null)
            xIaxjitter.setAttribute("maxexcessbuffer", impl
                    .getMaxexcessbuffer().toString());
        if (impl.getMinexcessbuffer() != null)
            xIaxjitter.setAttribute("minexcessbuffer", impl
                    .getMinexcessbuffer().toString());
        if (impl.getJittershrinkrate() != null)
            xIaxjitter.setAttribute("jittershrinkrate", impl
                    .getJittershrinkrate().toString());
        // aggregate schreiben

        doc.appendChild(xIaxjitter);
        return xIaxjitter;
    }
}
