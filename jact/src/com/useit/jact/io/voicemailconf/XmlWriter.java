/*
 * (c) urs zeidler
 */
package com.useit.jact.io.voicemailconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.5 2006/01/14 15:00:13 urs
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
        if (data instanceof VoicemailConf) {
            return writeVoicemailConf(doc, (VoicemailConf) data);
        }
        if (data instanceof Zonemessages) {
            return writeZonemessages(doc, (Zonemessages) data);
        }
        if (data instanceof Voicemailcontext) {
            return writeVoicemailcontext(doc, (Voicemailcontext) data);
        }
        if (data instanceof Voicemailcontextentry) {
            return writeVoicemailcontextentry(doc, (Voicemailcontextentry) data);
        }
        if (data instanceof Voicemailgeneral) {
            return writeVoicemailgeneral(doc, (Voicemailgeneral) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeVoicemailConf(Document doc, VoicemailConf impl) {
        Element xVoicemailConf = doc.createElement("VoicemailConf");

        // felder schreiben
        // aggregate schreiben
        Element xVoicemailgeneralAgg = writeVoicemailgeneral(doc, impl
                .getVoicemailgeneral());
        xVoicemailConf.appendChild(xVoicemailgeneralAgg);

        // maps schreiben

        for (Iterator iter = impl.getVoicemailcontextMap().iterator(); iter
                .hasNext();) {
            Voicemailcontext mobj = (Voicemailcontext) iter.next();

            Element xVoicemailcontext = writeVoicemailcontext(doc, mobj);
            xVoicemailConf.appendChild(xVoicemailcontext);

        }
        // maps schreiben

        for (Iterator iter = impl.getZonemessagesMap().iterator(); iter
                .hasNext();) {
            Zonemessages mobj = (Zonemessages) iter.next();

            Element xZonemessages = writeZonemessages(doc, mobj);
            xVoicemailConf.appendChild(xZonemessages);

        }
        doc.appendChild(xVoicemailConf);
        return xVoicemailConf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZonemessages(Document doc, Zonemessages impl) {
        Element xZonemessages = doc.createElement("Zonemessages");

        // felder schreiben
        if (impl.getTimezonename() != null)
            xZonemessages.setAttribute("timezonename", impl.getTimezonename()
                    .toString());
        if (impl.getCountry() != null)
            xZonemessages.setAttribute("country", impl.getCountry().toString());
        if (impl.getCity() != null)
            xZonemessages.setAttribute("city", impl.getCity().toString());
        if (impl.getOptions() != null)
            xZonemessages.setAttribute("options", impl.getOptions().toString());
        // aggregate schreiben

        doc.appendChild(xZonemessages);
        return xZonemessages;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeVoicemailcontext(Document doc,
            Voicemailcontext impl) {
        Element xVoicemailcontext = doc.createElement("Voicemailcontext");

        // felder schreiben
        if (impl.getContextname() != null)
            xVoicemailcontext.setAttribute("contextname", impl.getContextname()
                    .toString());
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getVoicemailcontextentryMap().iterator(); iter
                .hasNext();) {
            Voicemailcontextentry mobj = (Voicemailcontextentry) iter.next();

            Element xVoicemailcontextentry = writeVoicemailcontextentry(doc,
                    mobj);
            xVoicemailcontext.appendChild(xVoicemailcontextentry);

        }
        doc.appendChild(xVoicemailcontext);
        return xVoicemailcontext;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeVoicemailcontextentry(Document doc,
            Voicemailcontextentry impl) {
        Element xVoicemailcontextentry = doc
                .createElement("Voicemailcontextentry");

        // felder schreiben
        if (impl.getMailbox() != null)
            xVoicemailcontextentry.setAttribute("mailbox", impl.getMailbox()
                    .toString());
        if (impl.getVoicemail_password() != null)
            xVoicemailcontextentry.setAttribute("voicemail_password", impl
                    .getVoicemail_password().toString());
        if (impl.getUser_name() != null)
            xVoicemailcontextentry.setAttribute("user_name", impl
                    .getUser_name().toString());
        if (impl.getUser_email_address() != null)
            xVoicemailcontextentry.setAttribute("user_email_address", impl
                    .getUser_email_address().toString());
        if (impl.getPager_email_address() != null)
            xVoicemailcontextentry.setAttribute("pager_email_address", impl
                    .getPager_email_address().toString());
        if (impl.getUser_options() != null)
            xVoicemailcontextentry.setAttribute("user_options", impl
                    .getUser_options().toString());
        // aggregate schreiben

        doc.appendChild(xVoicemailcontextentry);
        return xVoicemailcontextentry;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeVoicemailgeneral(Document doc,
            Voicemailgeneral impl) {
        Element xVoicemailgeneral = doc.createElement("Voicemailgeneral");

        // felder schreiben
        if (impl.getAttach() != null)
            xVoicemailgeneral.setAttribute("attach", impl.getAttach()
                    .toString());
        if (impl.getDelete() != null)
            xVoicemailgeneral.setAttribute("delete", impl.getDelete()
                    .toString());
        if (impl.getMailcmd() != null)
            xVoicemailgeneral.setAttribute("mailcmd", impl.getMailcmd()
                    .toString());
        if (impl.getMaxsilence() != null)
            xVoicemailgeneral.setAttribute("maxsilence", impl.getMaxsilence()
                    .toString());
        if (impl.getEnvelope() != null)
            xVoicemailgeneral.setAttribute("envelope", impl.getEnvelope()
                    .toString());
        if (impl.getExternnotify() != null)
            xVoicemailgeneral.setAttribute("externnotify", impl
                    .getExternnotify().toString());
        if (impl.getSilencethreshold() != null)
            xVoicemailgeneral.setAttribute("silencethreshold", impl
                    .getSilencethreshold().toString());
        if (impl.getServeremail() != null)
            xVoicemailgeneral.setAttribute("serveremail", impl.getServeremail()
                    .toString());
        if (impl.getMaxmessage() != null)
            xVoicemailgeneral.setAttribute("maxmessage", impl.getMaxmessage()
                    .toString());
        if (impl.getMinmessage() != null)
            xVoicemailgeneral.setAttribute("minmessage", impl.getMinmessage()
                    .toString());
        if (impl.getFormat() != null)
            xVoicemailgeneral.setAttribute("format", impl.getFormat()
                    .toString());
        if (impl.getMaxgreet() != null)
            xVoicemailgeneral.setAttribute("maxgreet", impl.getMaxgreet()
                    .toString());
        if (impl.getSkipms() != null)
            xVoicemailgeneral.setAttribute("skipms", impl.getSkipms()
                    .toString());
        if (impl.getMaxlogins() != null)
            xVoicemailgeneral.setAttribute("maxlogins", impl.getMaxlogins()
                    .toString());
        if (impl.getCidinternalcontexts() != null)
            xVoicemailgeneral.setAttribute("cidinternalcontexts", impl
                    .getCidinternalcontexts().toString());
        if (impl.getReview() != null)
            xVoicemailgeneral.setAttribute("review", impl.getReview()
                    .toString());
        if (impl.getOperator() != null)
            xVoicemailgeneral.setAttribute("operator", impl.getOperator()
                    .toString());
        if (impl.getSaycid() != null)
            xVoicemailgeneral.setAttribute("saycid", impl.getSaycid()
                    .toString());
        if (impl.getDialout() != null)
            xVoicemailgeneral.setAttribute("dialout", impl.getDialout()
                    .toString());
        if (impl.getCallback() != null)
            xVoicemailgeneral.setAttribute("callback", impl.getCallback()
                    .toString());
        if (impl.getDbuser() != null)
            xVoicemailgeneral.setAttribute("dbuser", impl.getDbuser()
                    .toString());
        if (impl.getDbpass() != null)
            xVoicemailgeneral.setAttribute("dbpass", impl.getDbpass()
                    .toString());
        if (impl.getDbhost() != null)
            xVoicemailgeneral.setAttribute("dbhost", impl.getDbhost()
                    .toString());
        if (impl.getDbname() != null)
            xVoicemailgeneral.setAttribute("dbname", impl.getDbname()
                    .toString());
        if (impl.getDboption() != null)
            xVoicemailgeneral.setAttribute("dboption", impl.getDboption()
                    .toString());
        if (impl.getPbxskip() != null)
            xVoicemailgeneral.setAttribute("pbxskip", impl.getPbxskip()
                    .toString());
        if (impl.getFromstring() != null)
            xVoicemailgeneral.setAttribute("fromstring", impl.getFromstring()
                    .toString());
        if (impl.getEmailsubject() != null)
            xVoicemailgeneral.setAttribute("emailsubject", impl
                    .getEmailsubject().toString());
        if (impl.getEmailbody() != null)
            xVoicemailgeneral.setAttribute("emailbody", impl.getEmailbody()
                    .toString());
        if (impl.getExitcontext() != null)
            xVoicemailgeneral.setAttribute("exitcontext", impl.getExitcontext()
                    .toString());
        if (impl.getNextaftercmd() != null)
            xVoicemailgeneral.setAttribute("nextaftercmd", impl
                    .getNextaftercmd().toString());
        // aggregate schreiben

        doc.appendChild(xVoicemailgeneral);
        return xVoicemailgeneral;
    }
}
