/*
 * (c) urs zeidler
 */
package com.useit.jact.io.voicemailconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.10 2006/01/14 15:00:13
 *          urs Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class VoicemailConfwriteHelper {

    }; // end of VoicemailConfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ZonemessageswriteHelper {

        public String timezonename_StartToken;

        public String timezonename_StopToken;

        public void writetimezonename(StringBuffer strB, Zonemessages impl) {
            if (impl.getTimezonename() != null
                    && timezonename_StartToken != null) {
                strB.append(timezonename_StartToken).append(
                        impl.getTimezonename()).append(timezonename_StopToken);
            }
        }

        public String country_StartToken;

        public String country_StopToken;

        public void writecountry(StringBuffer strB, Zonemessages impl) {
            if (impl.getCountry() != null && country_StartToken != null) {
                strB.append(country_StartToken).append(impl.getCountry())
                        .append(country_StopToken);
            }
        }

        public String city_StartToken;

        public String city_StopToken;

        public void writecity(StringBuffer strB, Zonemessages impl) {
            if (impl.getCity() != null && city_StartToken != null) {
                strB.append(city_StartToken).append(impl.getCity()).append(
                        city_StopToken);
            }
        }

        public String options_StartToken;

        public String options_StopToken;

        public void writeoptions(StringBuffer strB, Zonemessages impl) {
            if (impl.getOptions() != null && options_StartToken != null) {
                strB.append(options_StartToken).append(impl.getOptions())
                        .append(options_StopToken);
            }
        }
    }; // end of ZonemessageswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class VoicemailcontextwriteHelper {

        public String contextname_StartToken;

        public String contextname_StopToken;

        public void writecontextname(StringBuffer strB, Voicemailcontext impl) {
            if (impl.getContextname() != null && contextname_StartToken != null) {
                strB.append(contextname_StartToken).append(
                        impl.getContextname()).append(contextname_StopToken);
            }
        }
    }; // end of VoicemailcontextwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class VoicemailcontextentrywriteHelper {

        public String mailbox_StartToken;

        public String mailbox_StopToken;

        public void writemailbox(StringBuffer strB, Voicemailcontextentry impl) {
            if (impl.getMailbox() != null && mailbox_StartToken != null) {
                strB.append(mailbox_StartToken).append(impl.getMailbox())
                        .append(mailbox_StopToken);
            }
        }

        public String voicemail_password_StartToken;

        public String voicemail_password_StopToken;

        public void writevoicemail_password(StringBuffer strB,
                Voicemailcontextentry impl) {
            if (impl.getVoicemail_password() != null
                    && voicemail_password_StartToken != null) {
                strB.append(voicemail_password_StartToken).append(
                        impl.getVoicemail_password()).append(
                        voicemail_password_StopToken);
            }
        }

        public String user_name_StartToken;

        public String user_name_StopToken;

        public void writeuser_name(StringBuffer strB, Voicemailcontextentry impl) {
            if (impl.getUser_name() != null && user_name_StartToken != null) {
                strB.append(user_name_StartToken).append(impl.getUser_name())
                        .append(user_name_StopToken);
            }
        }

        public String user_email_address_StartToken;

        public String user_email_address_StopToken;

        public void writeuser_email_address(StringBuffer strB,
                Voicemailcontextentry impl) {
            if (impl.getUser_email_address() != null
                    && user_email_address_StartToken != null) {
                strB.append(user_email_address_StartToken).append(
                        impl.getUser_email_address()).append(
                        user_email_address_StopToken);
            }
        }

        public String pager_email_address_StartToken;

        public String pager_email_address_StopToken;

        public void writepager_email_address(StringBuffer strB,
                Voicemailcontextentry impl) {
            if (impl.getPager_email_address() != null
                    && pager_email_address_StartToken != null) {
                strB.append(pager_email_address_StartToken).append(
                        impl.getPager_email_address()).append(
                        pager_email_address_StopToken);
            }
        }

        public String user_options_StartToken;

        public String user_options_StopToken;

        public void writeuser_options(StringBuffer strB,
                Voicemailcontextentry impl) {
            if (impl.getUser_options() != null
                    && user_options_StartToken != null) {
                strB.append(user_options_StartToken).append(
                        impl.getUser_options()).append(user_options_StopToken);
            }
        }
    }; // end of VoicemailcontextentrywriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class VoicemailgeneralwriteHelper {

        public String attach_StartToken;

        public String attach_StopToken;

        public void writeattach(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getAttach() != null && attach_StartToken != null) {
                strB.append(attach_StartToken).append(impl.getAttach()).append(
                        attach_StopToken);
            }
        }

        public String delete_StartToken;

        public String delete_StopToken;

        public void writedelete(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDelete() != null && delete_StartToken != null) {
                strB.append(delete_StartToken).append(impl.getDelete()).append(
                        delete_StopToken);
            }
        }

        public String mailcmd_StartToken;

        public String mailcmd_StopToken;

        public void writemailcmd(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getMailcmd() != null && mailcmd_StartToken != null) {
                strB.append(mailcmd_StartToken).append(impl.getMailcmd())
                        .append(mailcmd_StopToken);
            }
        }

        public String maxsilence_StartToken;

        public String maxsilence_StopToken;

        public void writemaxsilence(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getMaxsilence() != null && maxsilence_StartToken != null) {
                strB.append(maxsilence_StartToken).append(impl.getMaxsilence())
                        .append(maxsilence_StopToken);
            }
        }

        public String envelope_StartToken;

        public String envelope_StopToken;

        public void writeenvelope(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getEnvelope() != null && envelope_StartToken != null) {
                strB.append(envelope_StartToken).append(impl.getEnvelope())
                        .append(envelope_StopToken);
            }
        }

        public String externnotify_StartToken;

        public String externnotify_StopToken;

        public void writeexternnotify(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getExternnotify() != null
                    && externnotify_StartToken != null) {
                strB.append(externnotify_StartToken).append(
                        impl.getExternnotify()).append(externnotify_StopToken);
            }
        }

        public String silencethreshold_StartToken;

        public String silencethreshold_StopToken;

        public void writesilencethreshold(StringBuffer strB,
                Voicemailgeneral impl) {
            if (impl.getSilencethreshold() != null
                    && silencethreshold_StartToken != null) {
                strB.append(silencethreshold_StartToken).append(
                        impl.getSilencethreshold()).append(
                        silencethreshold_StopToken);
            }
        }

        public String serveremail_StartToken;

        public String serveremail_StopToken;

        public void writeserveremail(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getServeremail() != null && serveremail_StartToken != null) {
                strB.append(serveremail_StartToken).append(
                        impl.getServeremail()).append(serveremail_StopToken);
            }
        }

        public String maxmessage_StartToken;

        public String maxmessage_StopToken;

        public void writemaxmessage(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getMaxmessage() != null && maxmessage_StartToken != null) {
                strB.append(maxmessage_StartToken).append(impl.getMaxmessage())
                        .append(maxmessage_StopToken);
            }
        }

        public String minmessage_StartToken;

        public String minmessage_StopToken;

        public void writeminmessage(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getMinmessage() != null && minmessage_StartToken != null) {
                strB.append(minmessage_StartToken).append(impl.getMinmessage())
                        .append(minmessage_StopToken);
            }
        }

        public String format_StartToken;

        public String format_StopToken;

        public void writeformat(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getFormat() != null && format_StartToken != null) {
                strB.append(format_StartToken).append(impl.getFormat()).append(
                        format_StopToken);
            }
        }

        public String maxgreet_StartToken;

        public String maxgreet_StopToken;

        public void writemaxgreet(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getMaxgreet() != null && maxgreet_StartToken != null) {
                strB.append(maxgreet_StartToken).append(impl.getMaxgreet())
                        .append(maxgreet_StopToken);
            }
        }

        public String skipms_StartToken;

        public String skipms_StopToken;

        public void writeskipms(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getSkipms() != null && skipms_StartToken != null) {
                strB.append(skipms_StartToken).append(impl.getSkipms()).append(
                        skipms_StopToken);
            }
        }

        public String maxlogins_StartToken;

        public String maxlogins_StopToken;

        public void writemaxlogins(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getMaxlogins() != null && maxlogins_StartToken != null) {
                strB.append(maxlogins_StartToken).append(impl.getMaxlogins())
                        .append(maxlogins_StopToken);
            }
        }

        public String cidinternalcontexts_StartToken;

        public String cidinternalcontexts_StopToken;

        public void writecidinternalcontexts(StringBuffer strB,
                Voicemailgeneral impl) {
            if (impl.getCidinternalcontexts() != null
                    && cidinternalcontexts_StartToken != null) {
                strB.append(cidinternalcontexts_StartToken).append(
                        impl.getCidinternalcontexts()).append(
                        cidinternalcontexts_StopToken);
            }
        }

        public String review_StartToken;

        public String review_StopToken;

        public void writereview(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getReview() != null && review_StartToken != null) {
                strB.append(review_StartToken).append(impl.getReview()).append(
                        review_StopToken);
            }
        }

        public String operator_StartToken;

        public String operator_StopToken;

        public void writeoperator(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getOperator() != null && operator_StartToken != null) {
                strB.append(operator_StartToken).append(impl.getOperator())
                        .append(operator_StopToken);
            }
        }

        public String saycid_StartToken;

        public String saycid_StopToken;

        public void writesaycid(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getSaycid() != null && saycid_StartToken != null) {
                strB.append(saycid_StartToken).append(impl.getSaycid()).append(
                        saycid_StopToken);
            }
        }

        public String dialout_StartToken;

        public String dialout_StopToken;

        public void writedialout(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDialout() != null && dialout_StartToken != null) {
                strB.append(dialout_StartToken).append(impl.getDialout())
                        .append(dialout_StopToken);
            }
        }

        public String callback_StartToken;

        public String callback_StopToken;

        public void writecallback(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getCallback() != null && callback_StartToken != null) {
                strB.append(callback_StartToken).append(impl.getCallback())
                        .append(callback_StopToken);
            }
        }

        public String dbuser_StartToken;

        public String dbuser_StopToken;

        public void writedbuser(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDbuser() != null && dbuser_StartToken != null) {
                strB.append(dbuser_StartToken).append(impl.getDbuser()).append(
                        dbuser_StopToken);
            }
        }

        public String dbpass_StartToken;

        public String dbpass_StopToken;

        public void writedbpass(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDbpass() != null && dbpass_StartToken != null) {
                strB.append(dbpass_StartToken).append(impl.getDbpass()).append(
                        dbpass_StopToken);
            }
        }

        public String dbhost_StartToken;

        public String dbhost_StopToken;

        public void writedbhost(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDbhost() != null && dbhost_StartToken != null) {
                strB.append(dbhost_StartToken).append(impl.getDbhost()).append(
                        dbhost_StopToken);
            }
        }

        public String dbname_StartToken;

        public String dbname_StopToken;

        public void writedbname(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDbname() != null && dbname_StartToken != null) {
                strB.append(dbname_StartToken).append(impl.getDbname()).append(
                        dbname_StopToken);
            }
        }

        public String dboption_StartToken;

        public String dboption_StopToken;

        public void writedboption(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getDboption() != null && dboption_StartToken != null) {
                strB.append(dboption_StartToken).append(impl.getDboption())
                        .append(dboption_StopToken);
            }
        }

        public String pbxskip_StartToken;

        public String pbxskip_StopToken;

        public void writepbxskip(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getPbxskip() != null && pbxskip_StartToken != null) {
                strB.append(pbxskip_StartToken).append(impl.getPbxskip())
                        .append(pbxskip_StopToken);
            }
        }

        public String fromstring_StartToken;

        public String fromstring_StopToken;

        public void writefromstring(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getFromstring() != null && fromstring_StartToken != null) {
                strB.append(fromstring_StartToken).append(impl.getFromstring())
                        .append(fromstring_StopToken);
            }
        }

        public String emailsubject_StartToken;

        public String emailsubject_StopToken;

        public void writeemailsubject(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getEmailsubject() != null
                    && emailsubject_StartToken != null) {
                strB.append(emailsubject_StartToken).append(
                        impl.getEmailsubject()).append(emailsubject_StopToken);
            }
        }

        public String emailbody_StartToken;

        public String emailbody_StopToken;

        public void writeemailbody(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getEmailbody() != null && emailbody_StartToken != null) {
                strB.append(emailbody_StartToken).append(impl.getEmailbody())
                        .append(emailbody_StopToken);
            }
        }

        public String exitcontext_StartToken;

        public String exitcontext_StopToken;

        public void writeexitcontext(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getExitcontext() != null && exitcontext_StartToken != null) {
                strB.append(exitcontext_StartToken).append(
                        impl.getExitcontext()).append(exitcontext_StopToken);
            }
        }

        public String nextaftercmd_StartToken;

        public String nextaftercmd_StopToken;

        public void writenextaftercmd(StringBuffer strB, Voicemailgeneral impl) {
            if (impl.getNextaftercmd() != null
                    && nextaftercmd_StartToken != null) {
                strB.append(nextaftercmd_StartToken).append(
                        impl.getNextaftercmd()).append(nextaftercmd_StopToken);
            }
        }
    }; // end of VoicemailgeneralwriteHelper Declaration

    protected VoicemailConfwriteHelper theVoicemailConfwriteHelper;

    protected ZonemessageswriteHelper theZonemessageswriteHelper;

    protected VoicemailcontextwriteHelper theVoicemailcontextwriteHelper;

    protected VoicemailcontextentrywriteHelper theVoicemailcontextentrywriteHelper;

    protected VoicemailgeneralwriteHelper theVoicemailgeneralwriteHelper;

    /**
     * 
     */
    public ConfWriter() {
        super();

    }

    /**
     * schreibt die config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String string) {
        File file = new File(string);
        try {
            UseFileHelper.writeStringToFile(file, writetoString(data));
        } catch (FileNotFoundException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        } catch (IOException e) {
            LOGGER.error("writetoFile(Object data = " + data
                    + ", String string = " + string + ")", e);
        }

    }

    /**
     * gibt die config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        StringBuffer strb = new StringBuffer();
        writeConf(strb, data);
        return strb.toString();
    }

    /**
     * ruft die entsprechende write methode auf
     * 
     * @param strB
     * @param data
     */
    public void writeConf(StringBuffer strB, Object data) {
        if (data instanceof VoicemailConf) {
            writeVoicemailConf(strB, (VoicemailConf) data);
            return;
        }
        if (data instanceof Zonemessages) {
            writeZonemessages(strB, (Zonemessages) data);
            return;
        }
        if (data instanceof Voicemailcontext) {
            writeVoicemailcontext(strB, (Voicemailcontext) data);
            return;
        }
        if (data instanceof Voicemailcontextentry) {
            writeVoicemailcontextentry(strB, (Voicemailcontextentry) data);
            return;
        }
        if (data instanceof Voicemailgeneral) {
            writeVoicemailgeneral(strB, (Voicemailgeneral) data);
            return;
        }
    }

    /**
     * schreibt die Felder von VoicemailConf
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailConfFields(StringBuffer strB,
            VoicemailConf impl) {

        // felder schreiben

    }

    /**
     * schreibt die Aggregierten Objekte von VoicemailConf
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailConfAggregates(StringBuffer strB,
            VoicemailConf impl) {

        // aggregate schreiben
        // Voicemailgeneral
        writeVoicemailgeneral(strB, impl.getVoicemailgeneral());
        // maps schreiben
        // VoicemailcontextMap
        for (Iterator iter = impl.getVoicemailcontextMap().iterator(); iter
                .hasNext();) {
            Voicemailcontext mobj = (Voicemailcontext) iter.next();
            writeVoicemailcontext(strB, mobj);
        }
        // ZonemessagesMap
        for (Iterator iter = impl.getZonemessagesMap().iterator(); iter
                .hasNext();) {
            Zonemessages mobj = (Zonemessages) iter.next();
            writeZonemessages(strB, mobj);
        }

    }

    /**
     * schreibt ein VoicemailConf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailConf(StringBuffer strB, VoicemailConf impl) {
        writeVoicemailConfFields(strB, impl);
        writeVoicemailConfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Zonemessages
     * 
     * @param strB
     * @param msec
     */
    protected void writeZonemessagesFields(StringBuffer strB, Zonemessages impl) {

        // felder schreiben
        theZonemessageswriteHelper.writetimezonename(strB, impl);
        theZonemessageswriteHelper.writecountry(strB, impl);
        theZonemessageswriteHelper.writecity(strB, impl);
        theZonemessageswriteHelper.writeoptions(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zonemessages
     * 
     * @param strB
     * @param msec
     */
    protected void writeZonemessagesAggregates(StringBuffer strB,
            Zonemessages impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Zonemessages Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZonemessages(StringBuffer strB, Zonemessages impl) {
        writeZonemessagesFields(strB, impl);
        writeZonemessagesAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Voicemailcontext
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailcontextFields(StringBuffer strB,
            Voicemailcontext impl) {

        // felder schreiben
        theVoicemailcontextwriteHelper.writecontextname(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Voicemailcontext
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailcontextAggregates(StringBuffer strB,
            Voicemailcontext impl) {

        // aggregate schreiben
        // maps schreiben
        // VoicemailcontextentryMap
        for (Iterator iter = impl.getVoicemailcontextentryMap().iterator(); iter
                .hasNext();) {
            Voicemailcontextentry mobj = (Voicemailcontextentry) iter.next();
            writeVoicemailcontextentry(strB, mobj);
        }

    }

    /**
     * schreibt ein Voicemailcontext Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailcontext(StringBuffer strB,
            Voicemailcontext impl) {
        writeVoicemailcontextFields(strB, impl);
        writeVoicemailcontextAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Voicemailcontextentry
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailcontextentryFields(StringBuffer strB,
            Voicemailcontextentry impl) {

        // felder schreiben
        theVoicemailcontextentrywriteHelper.writemailbox(strB, impl);
        theVoicemailcontextentrywriteHelper.writevoicemail_password(strB, impl);
        theVoicemailcontextentrywriteHelper.writeuser_name(strB, impl);
        theVoicemailcontextentrywriteHelper.writeuser_email_address(strB, impl);
        theVoicemailcontextentrywriteHelper
                .writepager_email_address(strB, impl);
        theVoicemailcontextentrywriteHelper.writeuser_options(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Voicemailcontextentry
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailcontextentryAggregates(StringBuffer strB,
            Voicemailcontextentry impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Voicemailcontextentry Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailcontextentry(StringBuffer strB,
            Voicemailcontextentry impl) {
        writeVoicemailcontextentryFields(strB, impl);
        writeVoicemailcontextentryAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Voicemailgeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailgeneralFields(StringBuffer strB,
            Voicemailgeneral impl) {

        // felder schreiben
        theVoicemailgeneralwriteHelper.writeattach(strB, impl);
        theVoicemailgeneralwriteHelper.writedelete(strB, impl);
        theVoicemailgeneralwriteHelper.writemailcmd(strB, impl);
        theVoicemailgeneralwriteHelper.writemaxsilence(strB, impl);
        theVoicemailgeneralwriteHelper.writeenvelope(strB, impl);
        theVoicemailgeneralwriteHelper.writeexternnotify(strB, impl);
        theVoicemailgeneralwriteHelper.writesilencethreshold(strB, impl);
        theVoicemailgeneralwriteHelper.writeserveremail(strB, impl);
        theVoicemailgeneralwriteHelper.writemaxmessage(strB, impl);
        theVoicemailgeneralwriteHelper.writeminmessage(strB, impl);
        theVoicemailgeneralwriteHelper.writeformat(strB, impl);
        theVoicemailgeneralwriteHelper.writemaxgreet(strB, impl);
        theVoicemailgeneralwriteHelper.writeskipms(strB, impl);
        theVoicemailgeneralwriteHelper.writemaxlogins(strB, impl);
        theVoicemailgeneralwriteHelper.writecidinternalcontexts(strB, impl);
        theVoicemailgeneralwriteHelper.writereview(strB, impl);
        theVoicemailgeneralwriteHelper.writeoperator(strB, impl);
        theVoicemailgeneralwriteHelper.writesaycid(strB, impl);
        theVoicemailgeneralwriteHelper.writedialout(strB, impl);
        theVoicemailgeneralwriteHelper.writecallback(strB, impl);
        theVoicemailgeneralwriteHelper.writedbuser(strB, impl);
        theVoicemailgeneralwriteHelper.writedbpass(strB, impl);
        theVoicemailgeneralwriteHelper.writedbhost(strB, impl);
        theVoicemailgeneralwriteHelper.writedbname(strB, impl);
        theVoicemailgeneralwriteHelper.writedboption(strB, impl);
        theVoicemailgeneralwriteHelper.writepbxskip(strB, impl);
        theVoicemailgeneralwriteHelper.writefromstring(strB, impl);
        theVoicemailgeneralwriteHelper.writeemailsubject(strB, impl);
        theVoicemailgeneralwriteHelper.writeemailbody(strB, impl);
        theVoicemailgeneralwriteHelper.writeexitcontext(strB, impl);
        theVoicemailgeneralwriteHelper.writenextaftercmd(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Voicemailgeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailgeneralAggregates(StringBuffer strB,
            Voicemailgeneral impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Voicemailgeneral Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeVoicemailgeneral(StringBuffer strB,
            Voicemailgeneral impl) {
        writeVoicemailgeneralFields(strB, impl);
        writeVoicemailgeneralAggregates(strB, impl);

    }

    protected void initHelper() {
        theVoicemailConfwriteHelper = new VoicemailConfwriteHelper();

        theZonemessageswriteHelper = new ZonemessageswriteHelper();
        theZonemessageswriteHelper.timezonename_StartToken = "timezonename=";
        theZonemessageswriteHelper.timezonename_StopToken = "\n";
        theZonemessageswriteHelper.country_StartToken = "country=";
        theZonemessageswriteHelper.country_StopToken = "\n";
        theZonemessageswriteHelper.city_StartToken = "city=";
        theZonemessageswriteHelper.city_StopToken = "\n";
        theZonemessageswriteHelper.options_StartToken = "options=";
        theZonemessageswriteHelper.options_StopToken = "\n";

        theVoicemailcontextwriteHelper = new VoicemailcontextwriteHelper();
        theVoicemailcontextwriteHelper.contextname_StartToken = "contextname=";
        theVoicemailcontextwriteHelper.contextname_StopToken = "\n";

        theVoicemailcontextentrywriteHelper = new VoicemailcontextentrywriteHelper();
        theVoicemailcontextentrywriteHelper.mailbox_StartToken = "mailbox=";
        theVoicemailcontextentrywriteHelper.mailbox_StopToken = "\n";
        theVoicemailcontextentrywriteHelper.voicemail_password_StartToken = "voicemail_password=";
        theVoicemailcontextentrywriteHelper.voicemail_password_StopToken = "\n";
        theVoicemailcontextentrywriteHelper.user_name_StartToken = "user_name=";
        theVoicemailcontextentrywriteHelper.user_name_StopToken = "\n";
        theVoicemailcontextentrywriteHelper.user_email_address_StartToken = "user_email_address=";
        theVoicemailcontextentrywriteHelper.user_email_address_StopToken = "\n";
        theVoicemailcontextentrywriteHelper.pager_email_address_StartToken = "pager_email_address=";
        theVoicemailcontextentrywriteHelper.pager_email_address_StopToken = "\n";
        theVoicemailcontextentrywriteHelper.user_options_StartToken = "user_options=";
        theVoicemailcontextentrywriteHelper.user_options_StopToken = "\n";

        theVoicemailgeneralwriteHelper = new VoicemailgeneralwriteHelper();
        theVoicemailgeneralwriteHelper.attach_StartToken = "attach=";
        theVoicemailgeneralwriteHelper.attach_StopToken = "\n";
        theVoicemailgeneralwriteHelper.delete_StartToken = "delete=";
        theVoicemailgeneralwriteHelper.delete_StopToken = "\n";
        theVoicemailgeneralwriteHelper.mailcmd_StartToken = "mailcmd=";
        theVoicemailgeneralwriteHelper.mailcmd_StopToken = "\n";
        theVoicemailgeneralwriteHelper.maxsilence_StartToken = "maxsilence=";
        theVoicemailgeneralwriteHelper.maxsilence_StopToken = "\n";
        theVoicemailgeneralwriteHelper.envelope_StartToken = "envelope=";
        theVoicemailgeneralwriteHelper.envelope_StopToken = "\n";
        theVoicemailgeneralwriteHelper.externnotify_StartToken = "externnotify=";
        theVoicemailgeneralwriteHelper.externnotify_StopToken = "\n";
        theVoicemailgeneralwriteHelper.silencethreshold_StartToken = "silencethreshold=";
        theVoicemailgeneralwriteHelper.silencethreshold_StopToken = "\n";
        theVoicemailgeneralwriteHelper.serveremail_StartToken = "serveremail=";
        theVoicemailgeneralwriteHelper.serveremail_StopToken = "\n";
        theVoicemailgeneralwriteHelper.maxmessage_StartToken = "maxmessage=";
        theVoicemailgeneralwriteHelper.maxmessage_StopToken = "\n";
        theVoicemailgeneralwriteHelper.minmessage_StartToken = "minmessage=";
        theVoicemailgeneralwriteHelper.minmessage_StopToken = "\n";
        theVoicemailgeneralwriteHelper.format_StartToken = "format=";
        theVoicemailgeneralwriteHelper.format_StopToken = "\n";
        theVoicemailgeneralwriteHelper.maxgreet_StartToken = "maxgreet=";
        theVoicemailgeneralwriteHelper.maxgreet_StopToken = "\n";
        theVoicemailgeneralwriteHelper.skipms_StartToken = "skipms=";
        theVoicemailgeneralwriteHelper.skipms_StopToken = "\n";
        theVoicemailgeneralwriteHelper.maxlogins_StartToken = "maxlogins=";
        theVoicemailgeneralwriteHelper.maxlogins_StopToken = "\n";
        theVoicemailgeneralwriteHelper.cidinternalcontexts_StartToken = "cidinternalcontexts=";
        theVoicemailgeneralwriteHelper.cidinternalcontexts_StopToken = "\n";
        theVoicemailgeneralwriteHelper.review_StartToken = "review=";
        theVoicemailgeneralwriteHelper.review_StopToken = "\n";
        theVoicemailgeneralwriteHelper.operator_StartToken = "operator=";
        theVoicemailgeneralwriteHelper.operator_StopToken = "\n";
        theVoicemailgeneralwriteHelper.saycid_StartToken = "saycid=";
        theVoicemailgeneralwriteHelper.saycid_StopToken = "\n";
        theVoicemailgeneralwriteHelper.dialout_StartToken = "dialout=";
        theVoicemailgeneralwriteHelper.dialout_StopToken = "\n";
        theVoicemailgeneralwriteHelper.callback_StartToken = "callback=";
        theVoicemailgeneralwriteHelper.callback_StopToken = "\n";
        theVoicemailgeneralwriteHelper.dbuser_StartToken = "dbuser=";
        theVoicemailgeneralwriteHelper.dbuser_StopToken = "\n";
        theVoicemailgeneralwriteHelper.dbpass_StartToken = "dbpass=";
        theVoicemailgeneralwriteHelper.dbpass_StopToken = "\n";
        theVoicemailgeneralwriteHelper.dbhost_StartToken = "dbhost=";
        theVoicemailgeneralwriteHelper.dbhost_StopToken = "\n";
        theVoicemailgeneralwriteHelper.dbname_StartToken = "dbname=";
        theVoicemailgeneralwriteHelper.dbname_StopToken = "\n";
        theVoicemailgeneralwriteHelper.dboption_StartToken = "dboption=";
        theVoicemailgeneralwriteHelper.dboption_StopToken = "\n";
        theVoicemailgeneralwriteHelper.pbxskip_StartToken = "pbxskip=";
        theVoicemailgeneralwriteHelper.pbxskip_StopToken = "\n";
        theVoicemailgeneralwriteHelper.fromstring_StartToken = "fromstring=";
        theVoicemailgeneralwriteHelper.fromstring_StopToken = "\n";
        theVoicemailgeneralwriteHelper.emailsubject_StartToken = "emailsubject=";
        theVoicemailgeneralwriteHelper.emailsubject_StopToken = "\n";
        theVoicemailgeneralwriteHelper.emailbody_StartToken = "emailbody=";
        theVoicemailgeneralwriteHelper.emailbody_StopToken = "\n";
        theVoicemailgeneralwriteHelper.exitcontext_StartToken = "exitcontext=";
        theVoicemailgeneralwriteHelper.exitcontext_StopToken = "\n";
        theVoicemailgeneralwriteHelper.nextaftercmd_StartToken = "nextaftercmd=";
        theVoicemailgeneralwriteHelper.nextaftercmd_StopToken = "\n";

    }

}
