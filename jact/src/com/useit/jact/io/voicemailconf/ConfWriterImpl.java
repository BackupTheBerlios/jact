/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
/*
 * (c) urs zeidler
 */
package com.useit.jact.io.voicemailconf;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Zonemessages;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.9 2006/01/14 15:00:13
 *          urs Exp $
 */
public class ConfWriterImpl extends ConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriterImpl.class);

    /**
     * 
     */
    public ConfWriterImpl() {
        super();

        theVoicemailConfwriteHelper = new VoicemailConfwriteHelper();
        // theVoicemailConfwriteHelper.voicemconfid_StartToken="voicemconfid=";
        // theVoicemailConfwriteHelper.voicemconfid_StopToken="\n";

        theZonemessageswriteHelper = new ZonemessageswriteHelper();
        theZonemessageswriteHelper.timezonename_StartToken = "";
        theZonemessageswriteHelper.timezonename_StopToken = "=";
        theZonemessageswriteHelper.country_StartToken = "";
        theZonemessageswriteHelper.country_StopToken = "";
        theZonemessageswriteHelper.city_StartToken = "/";
        theZonemessageswriteHelper.city_StopToken = "";
        theZonemessageswriteHelper.options_StartToken = "|";
        theZonemessageswriteHelper.options_StopToken = "\n";

        theVoicemailcontextwriteHelper = new VoicemailcontextwriteHelper();
        theVoicemailcontextwriteHelper.contextname_StartToken = null;
        theVoicemailcontextwriteHelper.contextname_StopToken = "\n";

        theVoicemailcontextentrywriteHelper = new VoicemailcontextentrywriteHelper();
        theVoicemailcontextentrywriteHelper.mailbox_StartToken = "";
        theVoicemailcontextentrywriteHelper.mailbox_StopToken = "=";
        theVoicemailcontextentrywriteHelper.voicemail_password_StartToken = "";
        theVoicemailcontextentrywriteHelper.voicemail_password_StopToken = "";
        theVoicemailcontextentrywriteHelper.user_name_StartToken = ",";
        theVoicemailcontextentrywriteHelper.user_name_StopToken = "";
        theVoicemailcontextentrywriteHelper.user_email_address_StartToken = ",";
        theVoicemailcontextentrywriteHelper.user_email_address_StopToken = "";
        theVoicemailcontextentrywriteHelper.pager_email_address_StartToken = ",";
        theVoicemailcontextentrywriteHelper.pager_email_address_StopToken = "";
        theVoicemailcontextentrywriteHelper.user_options_StartToken = ",";
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

    @Override
    protected void writeVoicemailConf(StringBuffer strB, VoicemailConf impl) {
        strB.append(";voicemail config generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.GENERAL);

        super.writeVoicemailConf(strB, impl);
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
        // ZonemessagesMap
        for (Iterator iter = impl.getZonemessagesMap().iterator(); iter
                .hasNext();) {
            Zonemessages mobj = (Zonemessages) iter.next();
            writeZonemessages(strB, mobj);
        }

        // VoicemailcontextMap
        for (Iterator iter = impl.getVoicemailcontextMap().iterator(); iter
                .hasNext();) {
            Voicemailcontext mobj = (Voicemailcontext) iter.next();
            writeVoicemailcontext(strB, mobj);
        }

    }

    @Override
    protected void writeZonemessages(StringBuffer strB, Zonemessages impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.ZONEMESSAGES);
        super.writeZonemessages(strB, impl);
    }

    @Override
    protected void writeVoicemailcontext(StringBuffer strB,
            Voicemailcontext impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, impl.getContextname());
        super.writeVoicemailcontext(strB, impl);
    }

    // /**
    // * schreibt die config als datei
    // * @param data
    // * @param string
    // * @throws IOException
    // * @throws FileNotFoundException
    // */
    // public void writetoFile(Object data, String string){
    // File file = new File(string);
    // try {
    // UseFileHelper.writeStringToFile(file, writetoString(data));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("writetoFile(Object data = " + data
    // + ", String string = " + string + ")", e);
    // } catch (IOException e) {
    // LOGGER.error("writetoFile(Object data = " + data
    // + ", String string = " + string + ")", e);
    // }
    //        
    // }
    //
    // /**
    // * gibt die config als string zurück
    // * @param data
    // */
    // public String writetoString(Object data) {
    // StringBuffer strb= new StringBuffer();
    // // TODO writetoString(Object data) implementieren
    //        
    // return strb.toString();
    // }
    //

}
