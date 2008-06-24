/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.Iaxregister;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class IaxregisterwriteHelper {

        public String user_StartToken;

        public String user_StopToken;

        public void writeuser(StringBuffer strB, Iaxregister impl) {
            if (impl.getUser() != null && user_StartToken != null) {
                strB.append(user_StartToken).append(impl.getUser()).append(
                        user_StopToken);
            }
        }

        public String authuser_StartToken;

        public String authuser_StopToken;

        public void writeauthuser(StringBuffer strB, Iaxregister impl) {
            if (impl.getAuthuser() != null && authuser_StartToken != null) {
                strB.append(authuser_StartToken).append(impl.getAuthuser())
                        .append(authuser_StopToken);
            }
        }

        public String secret_StartToken;

        public String secret_StopToken;

        public void writesecret(StringBuffer strB, Iaxregister impl) {
            if (impl.getSecret() != null && secret_StartToken != null) {
                strB.append(secret_StartToken).append(impl.getSecret()).append(
                        secret_StopToken);
            }
        }

        public String host_StartToken;

        public String host_StopToken;

        public void writehost(StringBuffer strB, Iaxregister impl) {
            if (impl.getHost() != null && host_StartToken != null) {
                strB.append(host_StartToken).append(impl.getHost()).append(
                        host_StopToken);
            }
        }

        public String port_StartToken;

        public String port_StopToken;

        public void writeport(StringBuffer strB, Iaxregister impl) {
            if (impl.getPort() != null && port_StartToken != null) {
                strB.append(port_StartToken).append(impl.getPort()).append(
                        port_StopToken);
            }
        }

        public String extension_StartToken;

        public String extension_StopToken;

        public void writeextension(StringBuffer strB, Iaxregister impl) {
            if (impl.getExtension() != null && extension_StartToken != null) {
                strB.append(extension_StartToken).append(impl.getExtension())
                        .append(extension_StopToken);
            }
        }
    }; // end of IaxregisterwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class IaxdenywriteHelper {

        public String value_StartToken;

        public String value_StopToken;

        public void writevalue(StringBuffer strB, Iaxdeny impl) {
            if (impl.getValue() != null && value_StartToken != null) {
                strB.append(value_StartToken).append(impl.getValue()).append(
                        value_StopToken);
            }
        }
    }; // end of IaxdenywriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class IaxpermitwriteHelper {

        public String value_StartToken;

        public String value_StopToken;

        public void writevalue(StringBuffer strB, Iaxpermit impl) {
            if (impl.getValue() != null && value_StartToken != null) {
                strB.append(value_StartToken).append(impl.getValue()).append(
                        value_StopToken);
            }
        }
    }; // end of IaxpermitwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class IaxgeneralwriteHelper {

        public String bindport_StartToken;

        public String bindport_StopToken;

        public void writebindport(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getBindport() != null && bindport_StartToken != null) {
                strB.append(bindport_StartToken).append(impl.getBindport())
                        .append(bindport_StopToken);
            }
        }

        public String bindaddr_StartToken;

        public String bindaddr_StopToken;

        public void writebindaddr(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getBindaddr() != null && bindaddr_StartToken != null) {
                strB.append(bindaddr_StartToken).append(impl.getBindaddr())
                        .append(bindaddr_StopToken);
            }
        }

        public String iaxcompat_StartToken;

        public String iaxcompat_StopToken;

        public void writeiaxcompat(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getIaxcompat() != null && iaxcompat_StartToken != null) {
                strB.append(iaxcompat_StartToken).append(impl.getIaxcompat())
                        .append(iaxcompat_StopToken);
            }
        }

        public String nochecksums_StartToken;

        public String nochecksums_StopToken;

        public void writenochecksums(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getNochecksums() != null && nochecksums_StartToken != null) {
                strB.append(nochecksums_StartToken).append(
                        impl.getNochecksums()).append(nochecksums_StopToken);
            }
        }

        public String delayreject_StartToken;

        public String delayreject_StopToken;

        public void writedelayreject(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getDelayreject() != null && delayreject_StartToken != null) {
                strB.append(delayreject_StartToken).append(
                        impl.getDelayreject()).append(delayreject_StopToken);
            }
        }

        public String amaflags_StartToken;

        public String amaflags_StopToken;

        public void writeamaflags(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getAmaflags() != null && amaflags_StartToken != null) {
                strB.append(amaflags_StartToken).append(impl.getAmaflags())
                        .append(amaflags_StopToken);
            }
        }

        public String accountcode_StartToken;

        public String accountcode_StopToken;

        public void writeaccountcode(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getAccountcode() != null && accountcode_StartToken != null) {
                strB.append(accountcode_StartToken).append(
                        impl.getAccountcode()).append(accountcode_StopToken);
            }
        }

        public String language_StartToken;

        public String language_StopToken;

        public void writelanguage(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getLanguage() != null && language_StartToken != null) {
                strB.append(language_StartToken).append(impl.getLanguage())
                        .append(language_StopToken);
            }
        }

        public String bandwidth_StartToken;

        public String bandwidth_StopToken;

        public void writebandwidth(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getBandwidth() != null && bandwidth_StartToken != null) {
                strB.append(bandwidth_StartToken).append(impl.getBandwidth())
                        .append(bandwidth_StopToken);
            }
        }

        public String trunktimestamps_StartToken;

        public String trunktimestamps_StopToken;

        public void writetrunktimestamps(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getTrunktimestamps() != null
                    && trunktimestamps_StartToken != null) {
                strB.append(trunktimestamps_StartToken).append(
                        impl.getTrunktimestamps()).append(
                        trunktimestamps_StopToken);
            }
        }

        public String authdebug_StartToken;

        public String authdebug_StopToken;

        public void writeauthdebug(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getAuthdebug() != null && authdebug_StartToken != null) {
                strB.append(authdebug_StartToken).append(impl.getAuthdebug())
                        .append(authdebug_StopToken);
            }
        }

        public String tos_StartToken;

        public String tos_StopToken;

        public void writetos(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getTos() != null && tos_StartToken != null) {
                strB.append(tos_StartToken).append(impl.getTos()).append(
                        tos_StopToken);
            }
        }

        public String mailboxdetail_StartToken;

        public String mailboxdetail_StopToken;

        public void writemailboxdetail(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getMailboxdetail() != null
                    && mailboxdetail_StartToken != null) {
                strB.append(mailboxdetail_StartToken).append(
                        impl.getMailboxdetail())
                        .append(mailboxdetail_StopToken);
            }
        }

        public String regcontext_StartToken;

        public String regcontext_StopToken;

        public void writeregcontext(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getRegcontext() != null && regcontext_StartToken != null) {
                strB.append(regcontext_StartToken).append(impl.getRegcontext())
                        .append(regcontext_StopToken);
            }
        }

        public String autokill_StartToken;

        public String autokill_StopToken;

        public void writeautokill(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getAutokill() != null && autokill_StartToken != null) {
                strB.append(autokill_StartToken).append(impl.getAutokill())
                        .append(autokill_StopToken);
            }
        }

        public String codecpriority_StartToken;

        public String codecpriority_StopToken;

        public void writecodecpriority(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getCodecpriority() != null
                    && codecpriority_StartToken != null) {
                strB.append(codecpriority_StartToken).append(
                        impl.getCodecpriority())
                        .append(codecpriority_StopToken);
            }
        }

        public String rtcachefriends_StartToken;

        public String rtcachefriends_StopToken;

        public void writertcachefriends(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getRtcachefriends() != null
                    && rtcachefriends_StartToken != null) {
                strB.append(rtcachefriends_StartToken).append(
                        impl.getRtcachefriends()).append(
                        rtcachefriends_StopToken);
            }
        }

        public String rtupdate_StartToken;

        public String rtupdate_StopToken;

        public void writertupdate(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getRtupdate() != null && rtupdate_StartToken != null) {
                strB.append(rtupdate_StartToken).append(impl.getRtupdate())
                        .append(rtupdate_StopToken);
            }
        }

        public String rtautoclear_StartToken;

        public String rtautoclear_StopToken;

        public void writertautoclear(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getRtautoclear() != null && rtautoclear_StartToken != null) {
                strB.append(rtautoclear_StartToken).append(
                        impl.getRtautoclear()).append(rtautoclear_StopToken);
            }
        }

        public String rtignoreexpire_StartToken;

        public String rtignoreexpire_StopToken;

        public void writertignoreexpire(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getRtignoreexpire() != null
                    && rtignoreexpire_StartToken != null) {
                strB.append(rtignoreexpire_StartToken).append(
                        impl.getRtignoreexpire()).append(
                        rtignoreexpire_StopToken);
            }
        }

        public String trunkfreq_StartToken;

        public String trunkfreq_StopToken;

        public void writetrunkfreq(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getTrunkfreq() != null && trunkfreq_StartToken != null) {
                strB.append(trunkfreq_StartToken).append(impl.getTrunkfreq())
                        .append(trunkfreq_StopToken);
            }
        }

        public String disallow_StartToken;

        public String disallow_StopToken;

        public void writedisallow(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getDisallow() != null && disallow_StartToken != null) {
                strB.append(disallow_StartToken).append(impl.getDisallow())
                        .append(disallow_StopToken);
            }
        }

        public String allow_StartToken;

        public String allow_StopToken;

        public void writeallow(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getAllow() != null && allow_StartToken != null) {
                strB.append(allow_StartToken).append(impl.getAllow()).append(
                        allow_StopToken);
            }
        }

        public String minregexpire_StartToken;

        public String minregexpire_StopToken;

        public void writeminregexpire(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getMinregexpire() != null
                    && minregexpire_StartToken != null) {
                strB.append(minregexpire_StartToken).append(
                        impl.getMinregexpire()).append(minregexpire_StopToken);
            }
        }

        public String maxregexpire_StartToken;

        public String maxregexpire_StopToken;

        public void writemaxregexpire(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getMaxregexpire() != null
                    && maxregexpire_StartToken != null) {
                strB.append(maxregexpire_StartToken).append(
                        impl.getMaxregexpire()).append(maxregexpire_StopToken);
            }
        }

        public String notransfer_StartToken;

        public String notransfer_StopToken;

        public void writenotransfer(StringBuffer strB, Iaxgeneral impl) {
            if (impl.getNotransfer() != null && notransfer_StartToken != null) {
                strB.append(notransfer_StartToken).append(impl.getNotransfer())
                        .append(notransfer_StopToken);
            }
        }
    }; // end of IaxgeneralwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class IaxpeerwriteHelper {

        public String iaxpeername_StartToken;

        public String iaxpeername_StopToken;

        public void writeiaxpeername(StringBuffer strB, Iaxpeer impl) {
            if (impl.getIaxpeername() != null && iaxpeername_StartToken != null) {
                strB.append(iaxpeername_StartToken).append(
                        impl.getIaxpeername()).append(iaxpeername_StopToken);
            }
        }

        public String peertype_StartToken;

        public String peertype_StopToken;

        public void writepeertype(StringBuffer strB, Iaxpeer impl) {
            if (impl.getPeertype() != null && peertype_StartToken != null) {
                strB.append(peertype_StartToken).append(impl.getPeertype())
                        .append(peertype_StopToken);
            }
        }

        public String callerid_StartToken;

        public String callerid_StopToken;

        public void writecallerid(StringBuffer strB, Iaxpeer impl) {
            if (impl.getCallerid() != null && callerid_StartToken != null) {
                strB.append(callerid_StartToken).append(impl.getCallerid())
                        .append(callerid_StopToken);
            }
        }

        public String auth_StartToken;

        public String auth_StopToken;

        public void writeauth(StringBuffer strB, Iaxpeer impl) {
            if (impl.getAuth() != null && auth_StartToken != null) {
                strB.append(auth_StartToken).append(impl.getAuth()).append(
                        auth_StopToken);
            }
        }

        public String secret_StartToken;

        public String secret_StopToken;

        public void writesecret(StringBuffer strB, Iaxpeer impl) {
            if (impl.getSecret() != null && secret_StartToken != null) {
                strB.append(secret_StartToken).append(impl.getSecret()).append(
                        secret_StopToken);
            }
        }

        public String inkeys_StartToken;

        public String inkeys_StopToken;

        public void writeinkeys(StringBuffer strB, Iaxpeer impl) {
            if (impl.getInkeys() != null && inkeys_StartToken != null) {
                strB.append(inkeys_StartToken).append(impl.getInkeys()).append(
                        inkeys_StopToken);
            }
        }

        public String host_StartToken;

        public String host_StopToken;

        public void writehost(StringBuffer strB, Iaxpeer impl) {
            if (impl.getHost() != null && host_StartToken != null) {
                strB.append(host_StartToken).append(impl.getHost()).append(
                        host_StopToken);
            }
        }

        public String defaultip_StartToken;

        public String defaultip_StopToken;

        public void writedefaultip(StringBuffer strB, Iaxpeer impl) {
            if (impl.getDefaultip() != null && defaultip_StartToken != null) {
                strB.append(defaultip_StartToken).append(impl.getDefaultip())
                        .append(defaultip_StopToken);
            }
        }

        public String context_StartToken;

        public String context_StopToken;

        public void writecontext(StringBuffer strB, Iaxpeer impl) {
            if (impl.getContext() != null && context_StartToken != null) {
                strB.append(context_StartToken).append(impl.getContext())
                        .append(context_StopToken);
            }
        }

        public String dbsecret_StartToken;

        public String dbsecret_StopToken;

        public void writedbsecret(StringBuffer strB, Iaxpeer impl) {
            if (impl.getDbsecret() != null && dbsecret_StartToken != null) {
                strB.append(dbsecret_StartToken).append(impl.getDbsecret())
                        .append(dbsecret_StopToken);
            }
        }

        public String setvar_StartToken;

        public String setvar_StopToken;

        public void writesetvar(StringBuffer strB, Iaxpeer impl) {
            if (impl.getSetvar() != null && setvar_StartToken != null) {
                strB.append(setvar_StartToken).append(impl.getSetvar()).append(
                        setvar_StopToken);
            }
        }

        public String peercontext_StartToken;

        public String peercontext_StopToken;

        public void writepeercontext(StringBuffer strB, Iaxpeer impl) {
            if (impl.getPeercontext() != null && peercontext_StartToken != null) {
                strB.append(peercontext_StartToken).append(
                        impl.getPeercontext()).append(peercontext_StopToken);
            }
        }

        public String qualify_StartToken;

        public String qualify_StopToken;

        public void writequalify(StringBuffer strB, Iaxpeer impl) {
            if (impl.getQualify() != null && qualify_StartToken != null) {
                strB.append(qualify_StartToken).append(impl.getQualify())
                        .append(qualify_StopToken);
            }
        }

        public String trunk_StartToken;

        public String trunk_StopToken;

        public void writetrunk(StringBuffer strB, Iaxpeer impl) {
            if (impl.getTrunk() != null && trunk_StartToken != null) {
                strB.append(trunk_StartToken).append(impl.getTrunk()).append(
                        trunk_StopToken);
            }
        }

        public String timezone_StartToken;

        public String timezone_StopToken;

        public void writetimezone(StringBuffer strB, Iaxpeer impl) {
            if (impl.getTimezone() != null && timezone_StartToken != null) {
                strB.append(timezone_StartToken).append(impl.getTimezone())
                        .append(timezone_StopToken);
            }
        }

        public String regexten_StartToken;

        public String regexten_StopToken;

        public void writeregexten(StringBuffer strB, Iaxpeer impl) {
            if (impl.getRegexten() != null && regexten_StartToken != null) {
                strB.append(regexten_StartToken).append(impl.getRegexten())
                        .append(regexten_StopToken);
            }
        }

        public String disallow_StartToken;

        public String disallow_StopToken;

        public void writedisallow(StringBuffer strB, Iaxpeer impl) {
            if (impl.getDisallow() != null && disallow_StartToken != null) {
                strB.append(disallow_StartToken).append(impl.getDisallow())
                        .append(disallow_StopToken);
            }
        }

        public String allow_StartToken;

        public String allow_StopToken;

        public void writeallow(StringBuffer strB, Iaxpeer impl) {
            if (impl.getAllow() != null && allow_StartToken != null) {
                strB.append(allow_StartToken).append(impl.getAllow()).append(
                        allow_StopToken);
            }
        }

        public String mailbox_StartToken;

        public String mailbox_StopToken;

        public void writemailbox(StringBuffer strB, Iaxpeer impl) {
            if (impl.getMailbox() != null && mailbox_StartToken != null) {
                strB.append(mailbox_StartToken).append(impl.getMailbox())
                        .append(mailbox_StopToken);
            }
        }

        public String accountcode_StartToken;

        public String accountcode_StopToken;

        public void writeaccountcode(StringBuffer strB, Iaxpeer impl) {
            if (impl.getAccountcode() != null && accountcode_StartToken != null) {
                strB.append(accountcode_StartToken).append(
                        impl.getAccountcode()).append(accountcode_StopToken);
            }
        }

        public String outkey_StartToken;

        public String outkey_StopToken;

        public void writeoutkey(StringBuffer strB, Iaxpeer impl) {
            if (impl.getOutkey() != null && outkey_StartToken != null) {
                strB.append(outkey_StartToken).append(impl.getOutkey()).append(
                        outkey_StopToken);
            }
        }

        public String notransfer_StartToken;

        public String notransfer_StopToken;

        public void writenotransfer(StringBuffer strB, Iaxpeer impl) {
            if (impl.getNotransfer() != null && notransfer_StartToken != null) {
                strB.append(notransfer_StartToken).append(impl.getNotransfer())
                        .append(notransfer_StopToken);
            }
        }

        public String qualifysmoothing_StartToken;

        public String qualifysmoothing_StopToken;

        public void writequalifysmoothing(StringBuffer strB, Iaxpeer impl) {
            if (impl.getQualifysmoothing() != null
                    && qualifysmoothing_StartToken != null) {
                strB.append(qualifysmoothing_StartToken).append(
                        impl.getQualifysmoothing()).append(
                        qualifysmoothing_StopToken);
            }
        }

        public String qualifyfreqok_StartToken;

        public String qualifyfreqok_StopToken;

        public void writequalifyfreqok(StringBuffer strB, Iaxpeer impl) {
            if (impl.getQualifyfreqok() != null
                    && qualifyfreqok_StartToken != null) {
                strB.append(qualifyfreqok_StartToken).append(
                        impl.getQualifyfreqok())
                        .append(qualifyfreqok_StopToken);
            }
        }

        public String qualifyfreqnotok_StartToken;

        public String qualifyfreqnotok_StopToken;

        public void writequalifyfreqnotok(StringBuffer strB, Iaxpeer impl) {
            if (impl.getQualifyfreqnotok() != null
                    && qualifyfreqnotok_StartToken != null) {
                strB.append(qualifyfreqnotok_StartToken).append(
                        impl.getQualifyfreqnotok()).append(
                        qualifyfreqnotok_StopToken);
            }
        }
    }; // end of IaxpeerwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class IaxjitterwriteHelper {

        public String jitterbuffer_StartToken;

        public String jitterbuffer_StopToken;

        public void writejitterbuffer(StringBuffer strB, Iaxjitter impl) {
            if (impl.getJitterbuffer() != null
                    && jitterbuffer_StartToken != null) {
                strB.append(jitterbuffer_StartToken).append(
                        impl.getJitterbuffer()).append(jitterbuffer_StopToken);
            }
        }

        public String forcejitterbuffer_StartToken;

        public String forcejitterbuffer_StopToken;

        public void writeforcejitterbuffer(StringBuffer strB, Iaxjitter impl) {
            if (impl.getForcejitterbuffer() != null
                    && forcejitterbuffer_StartToken != null) {
                strB.append(forcejitterbuffer_StartToken).append(
                        impl.getForcejitterbuffer()).append(
                        forcejitterbuffer_StopToken);
            }
        }

        public String dropcount_StartToken;

        public String dropcount_StopToken;

        public void writedropcount(StringBuffer strB, Iaxjitter impl) {
            if (impl.getDropcount() != null && dropcount_StartToken != null) {
                strB.append(dropcount_StartToken).append(impl.getDropcount())
                        .append(dropcount_StopToken);
            }
        }

        public String maxjitterbuffer_StartToken;

        public String maxjitterbuffer_StopToken;

        public void writemaxjitterbuffer(StringBuffer strB, Iaxjitter impl) {
            if (impl.getMaxjitterbuffer() != null
                    && maxjitterbuffer_StartToken != null) {
                strB.append(maxjitterbuffer_StartToken).append(
                        impl.getMaxjitterbuffer()).append(
                        maxjitterbuffer_StopToken);
            }
        }

        public String resyncthreshold_StartToken;

        public String resyncthreshold_StopToken;

        public void writeresyncthreshold(StringBuffer strB, Iaxjitter impl) {
            if (impl.getResyncthreshold() != null
                    && resyncthreshold_StartToken != null) {
                strB.append(resyncthreshold_StartToken).append(
                        impl.getResyncthreshold()).append(
                        resyncthreshold_StopToken);
            }
        }

        public String maxjitterinterps_StartToken;

        public String maxjitterinterps_StopToken;

        public void writemaxjitterinterps(StringBuffer strB, Iaxjitter impl) {
            if (impl.getMaxjitterinterps() != null
                    && maxjitterinterps_StartToken != null) {
                strB.append(maxjitterinterps_StartToken).append(
                        impl.getMaxjitterinterps()).append(
                        maxjitterinterps_StopToken);
            }
        }

        public String maxexcessbuffer_StartToken;

        public String maxexcessbuffer_StopToken;

        public void writemaxexcessbuffer(StringBuffer strB, Iaxjitter impl) {
            if (impl.getMaxexcessbuffer() != null
                    && maxexcessbuffer_StartToken != null) {
                strB.append(maxexcessbuffer_StartToken).append(
                        impl.getMaxexcessbuffer()).append(
                        maxexcessbuffer_StopToken);
            }
        }

        public String minexcessbuffer_StartToken;

        public String minexcessbuffer_StopToken;

        public void writeminexcessbuffer(StringBuffer strB, Iaxjitter impl) {
            if (impl.getMinexcessbuffer() != null
                    && minexcessbuffer_StartToken != null) {
                strB.append(minexcessbuffer_StartToken).append(
                        impl.getMinexcessbuffer()).append(
                        minexcessbuffer_StopToken);
            }
        }

        public String jittershrinkrate_StartToken;

        public String jittershrinkrate_StopToken;

        public void writejittershrinkrate(StringBuffer strB, Iaxjitter impl) {
            if (impl.getJittershrinkrate() != null
                    && jittershrinkrate_StartToken != null) {
                strB.append(jittershrinkrate_StartToken).append(
                        impl.getJittershrinkrate()).append(
                        jittershrinkrate_StopToken);
            }
        }
    }; // end of IaxjitterwriteHelper Declaration

    protected IaxregisterwriteHelper theIaxregisterwriteHelper;

    protected IaxdenywriteHelper theIaxdenywriteHelper;

    protected IaxpermitwriteHelper theIaxpermitwriteHelper;

    protected IaxgeneralwriteHelper theIaxgeneralwriteHelper;

    protected IaxpeerwriteHelper theIaxpeerwriteHelper;

    protected IaxjitterwriteHelper theIaxjitterwriteHelper;

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
        if (data instanceof Iaxregister) {
            writeIaxregister(strB, (Iaxregister) data);
            return;
        }
        if (data instanceof Iaxdeny) {
            writeIaxdeny(strB, (Iaxdeny) data);
            return;
        }
        if (data instanceof Iaxpermit) {
            writeIaxpermit(strB, (Iaxpermit) data);
            return;
        }
        if (data instanceof Iaxgeneral) {
            writeIaxgeneral(strB, (Iaxgeneral) data);
            return;
        }
        if (data instanceof Iaxpeer) {
            writeIaxpeer(strB, (Iaxpeer) data);
            return;
        }
        if (data instanceof Iaxjitter) {
            writeIaxjitter(strB, (Iaxjitter) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Iaxregister
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxregisterFields(StringBuffer strB, Iaxregister impl) {

        // felder schreiben
        theIaxregisterwriteHelper.writeuser(strB, impl);
        theIaxregisterwriteHelper.writeauthuser(strB, impl);
        theIaxregisterwriteHelper.writesecret(strB, impl);
        theIaxregisterwriteHelper.writehost(strB, impl);
        theIaxregisterwriteHelper.writeport(strB, impl);
        theIaxregisterwriteHelper.writeextension(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Iaxregister
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxregisterAggregates(StringBuffer strB,
            Iaxregister impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Iaxregister Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxregister(StringBuffer strB, Iaxregister impl) {
        writeIaxregisterFields(strB, impl);
        writeIaxregisterAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Iaxdeny
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxdenyFields(StringBuffer strB, Iaxdeny impl) {

        // felder schreiben
        theIaxdenywriteHelper.writevalue(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Iaxdeny
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxdenyAggregates(StringBuffer strB, Iaxdeny impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Iaxdeny Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxdeny(StringBuffer strB, Iaxdeny impl) {
        writeIaxdenyFields(strB, impl);
        writeIaxdenyAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Iaxpermit
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpermitFields(StringBuffer strB, Iaxpermit impl) {

        // felder schreiben
        theIaxpermitwriteHelper.writevalue(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Iaxpermit
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpermitAggregates(StringBuffer strB, Iaxpermit impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Iaxpermit Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpermit(StringBuffer strB, Iaxpermit impl) {
        writeIaxpermitFields(strB, impl);
        writeIaxpermitAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Iaxgeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxgeneralFields(StringBuffer strB, Iaxgeneral impl) {

        // felder schreiben
        theIaxgeneralwriteHelper.writebindport(strB, impl);
        theIaxgeneralwriteHelper.writebindaddr(strB, impl);
        theIaxgeneralwriteHelper.writeiaxcompat(strB, impl);
        theIaxgeneralwriteHelper.writenochecksums(strB, impl);
        theIaxgeneralwriteHelper.writedelayreject(strB, impl);
        theIaxgeneralwriteHelper.writeamaflags(strB, impl);
        theIaxgeneralwriteHelper.writeaccountcode(strB, impl);
        theIaxgeneralwriteHelper.writelanguage(strB, impl);
        theIaxgeneralwriteHelper.writebandwidth(strB, impl);
        theIaxgeneralwriteHelper.writetrunktimestamps(strB, impl);
        theIaxgeneralwriteHelper.writeauthdebug(strB, impl);
        theIaxgeneralwriteHelper.writetos(strB, impl);
        theIaxgeneralwriteHelper.writemailboxdetail(strB, impl);
        theIaxgeneralwriteHelper.writeregcontext(strB, impl);
        theIaxgeneralwriteHelper.writeautokill(strB, impl);
        theIaxgeneralwriteHelper.writecodecpriority(strB, impl);
        theIaxgeneralwriteHelper.writertcachefriends(strB, impl);
        theIaxgeneralwriteHelper.writertupdate(strB, impl);
        theIaxgeneralwriteHelper.writertautoclear(strB, impl);
        theIaxgeneralwriteHelper.writertignoreexpire(strB, impl);
        theIaxgeneralwriteHelper.writetrunkfreq(strB, impl);
        theIaxgeneralwriteHelper.writedisallow(strB, impl);
        theIaxgeneralwriteHelper.writeallow(strB, impl);
        theIaxgeneralwriteHelper.writeminregexpire(strB, impl);
        theIaxgeneralwriteHelper.writemaxregexpire(strB, impl);
        theIaxgeneralwriteHelper.writenotransfer(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Iaxgeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxgeneralAggregates(StringBuffer strB, Iaxgeneral impl) {

        // aggregate schreiben
        // Iaxjitter
        writeIaxjitter(strB, impl.getIaxjitter());
        // maps schreiben
        // IaxpeerMap
        for (Iterator iter = impl.getIaxpeerMap().iterator(); iter.hasNext();) {
            Iaxpeer mobj = (Iaxpeer) iter.next();
            writeIaxpeer(strB, mobj);
        }
        // IaxregisterMap
        for (Iterator iter = impl.getIaxregisterMap().iterator(); iter
                .hasNext();) {
            Iaxregister mobj = (Iaxregister) iter.next();
            writeIaxregister(strB, mobj);
        }

    }

    /**
     * schreibt ein Iaxgeneral Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxgeneral(StringBuffer strB, Iaxgeneral impl) {
        writeIaxgeneralFields(strB, impl);
        writeIaxgeneralAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Iaxpeer
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpeerFields(StringBuffer strB, Iaxpeer impl) {

        // felder schreiben
        theIaxpeerwriteHelper.writeiaxpeername(strB, impl);
        theIaxpeerwriteHelper.writepeertype(strB, impl);
        theIaxpeerwriteHelper.writecallerid(strB, impl);
        theIaxpeerwriteHelper.writeauth(strB, impl);
        theIaxpeerwriteHelper.writesecret(strB, impl);
        theIaxpeerwriteHelper.writeinkeys(strB, impl);
        theIaxpeerwriteHelper.writehost(strB, impl);
        theIaxpeerwriteHelper.writedefaultip(strB, impl);
        theIaxpeerwriteHelper.writecontext(strB, impl);
        theIaxpeerwriteHelper.writedbsecret(strB, impl);
        theIaxpeerwriteHelper.writesetvar(strB, impl);
        theIaxpeerwriteHelper.writepeercontext(strB, impl);
        theIaxpeerwriteHelper.writequalify(strB, impl);
        theIaxpeerwriteHelper.writetrunk(strB, impl);
        theIaxpeerwriteHelper.writetimezone(strB, impl);
        theIaxpeerwriteHelper.writeregexten(strB, impl);
        theIaxpeerwriteHelper.writedisallow(strB, impl);
        theIaxpeerwriteHelper.writeallow(strB, impl);
        theIaxpeerwriteHelper.writemailbox(strB, impl);
        theIaxpeerwriteHelper.writeaccountcode(strB, impl);
        theIaxpeerwriteHelper.writeoutkey(strB, impl);
        theIaxpeerwriteHelper.writenotransfer(strB, impl);
        theIaxpeerwriteHelper.writequalifysmoothing(strB, impl);
        theIaxpeerwriteHelper.writequalifyfreqok(strB, impl);
        theIaxpeerwriteHelper.writequalifyfreqnotok(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Iaxpeer
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpeerAggregates(StringBuffer strB, Iaxpeer impl) {

        // aggregate schreiben
        // maps schreiben
        // IaxdenyMap
        for (Iterator iter = impl.getIaxdenyMap().iterator(); iter.hasNext();) {
            Iaxdeny mobj = (Iaxdeny) iter.next();
            writeIaxdeny(strB, mobj);
        }
        // IaxpermitMap
        for (Iterator iter = impl.getIaxpermitMap().iterator(); iter.hasNext();) {
            Iaxpermit mobj = (Iaxpermit) iter.next();
            writeIaxpermit(strB, mobj);
        }

    }

    /**
     * schreibt ein Iaxpeer Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpeer(StringBuffer strB, Iaxpeer impl) {
        writeIaxpeerFields(strB, impl);
        writeIaxpeerAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Iaxjitter
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxjitterFields(StringBuffer strB, Iaxjitter impl) {

        // felder schreiben
        theIaxjitterwriteHelper.writejitterbuffer(strB, impl);
        theIaxjitterwriteHelper.writeforcejitterbuffer(strB, impl);
        theIaxjitterwriteHelper.writedropcount(strB, impl);
        theIaxjitterwriteHelper.writemaxjitterbuffer(strB, impl);
        theIaxjitterwriteHelper.writeresyncthreshold(strB, impl);
        theIaxjitterwriteHelper.writemaxjitterinterps(strB, impl);
        theIaxjitterwriteHelper.writemaxexcessbuffer(strB, impl);
        theIaxjitterwriteHelper.writeminexcessbuffer(strB, impl);
        theIaxjitterwriteHelper.writejittershrinkrate(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Iaxjitter
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxjitterAggregates(StringBuffer strB, Iaxjitter impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Iaxjitter Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxjitter(StringBuffer strB, Iaxjitter impl) {
        writeIaxjitterFields(strB, impl);
        writeIaxjitterAggregates(strB, impl);

    }

    protected void initHelper() {
        theIaxregisterwriteHelper = new IaxregisterwriteHelper();
        theIaxregisterwriteHelper.user_StartToken = "user=";
        theIaxregisterwriteHelper.user_StopToken = "\n";
        theIaxregisterwriteHelper.authuser_StartToken = "authuser=";
        theIaxregisterwriteHelper.authuser_StopToken = "\n";
        theIaxregisterwriteHelper.secret_StartToken = "secret=";
        theIaxregisterwriteHelper.secret_StopToken = "\n";
        theIaxregisterwriteHelper.host_StartToken = "host=";
        theIaxregisterwriteHelper.host_StopToken = "\n";
        theIaxregisterwriteHelper.port_StartToken = "port=";
        theIaxregisterwriteHelper.port_StopToken = "\n";
        theIaxregisterwriteHelper.extension_StartToken = "extension=";
        theIaxregisterwriteHelper.extension_StopToken = "\n";

        theIaxdenywriteHelper = new IaxdenywriteHelper();
        theIaxdenywriteHelper.value_StartToken = "value=";
        theIaxdenywriteHelper.value_StopToken = "\n";

        theIaxpermitwriteHelper = new IaxpermitwriteHelper();
        theIaxpermitwriteHelper.value_StartToken = "value=";
        theIaxpermitwriteHelper.value_StopToken = "\n";

        theIaxgeneralwriteHelper = new IaxgeneralwriteHelper();
        theIaxgeneralwriteHelper.bindport_StartToken = "bindport=";
        theIaxgeneralwriteHelper.bindport_StopToken = "\n";
        theIaxgeneralwriteHelper.bindaddr_StartToken = "bindaddr=";
        theIaxgeneralwriteHelper.bindaddr_StopToken = "\n";
        theIaxgeneralwriteHelper.iaxcompat_StartToken = "iaxcompat=";
        theIaxgeneralwriteHelper.iaxcompat_StopToken = "\n";
        theIaxgeneralwriteHelper.nochecksums_StartToken = "nochecksums=";
        theIaxgeneralwriteHelper.nochecksums_StopToken = "\n";
        theIaxgeneralwriteHelper.delayreject_StartToken = "delayreject=";
        theIaxgeneralwriteHelper.delayreject_StopToken = "\n";
        theIaxgeneralwriteHelper.amaflags_StartToken = "amaflags=";
        theIaxgeneralwriteHelper.amaflags_StopToken = "\n";
        theIaxgeneralwriteHelper.accountcode_StartToken = "accountcode=";
        theIaxgeneralwriteHelper.accountcode_StopToken = "\n";
        theIaxgeneralwriteHelper.language_StartToken = "language=";
        theIaxgeneralwriteHelper.language_StopToken = "\n";
        theIaxgeneralwriteHelper.bandwidth_StartToken = "bandwidth=";
        theIaxgeneralwriteHelper.bandwidth_StopToken = "\n";
        theIaxgeneralwriteHelper.trunktimestamps_StartToken = "trunktimestamps=";
        theIaxgeneralwriteHelper.trunktimestamps_StopToken = "\n";
        theIaxgeneralwriteHelper.authdebug_StartToken = "authdebug=";
        theIaxgeneralwriteHelper.authdebug_StopToken = "\n";
        theIaxgeneralwriteHelper.tos_StartToken = "tos=";
        theIaxgeneralwriteHelper.tos_StopToken = "\n";
        theIaxgeneralwriteHelper.mailboxdetail_StartToken = "mailboxdetail=";
        theIaxgeneralwriteHelper.mailboxdetail_StopToken = "\n";
        theIaxgeneralwriteHelper.regcontext_StartToken = "regcontext=";
        theIaxgeneralwriteHelper.regcontext_StopToken = "\n";
        theIaxgeneralwriteHelper.autokill_StartToken = "autokill=";
        theIaxgeneralwriteHelper.autokill_StopToken = "\n";
        theIaxgeneralwriteHelper.codecpriority_StartToken = "codecpriority=";
        theIaxgeneralwriteHelper.codecpriority_StopToken = "\n";
        theIaxgeneralwriteHelper.rtcachefriends_StartToken = "rtcachefriends=";
        theIaxgeneralwriteHelper.rtcachefriends_StopToken = "\n";
        theIaxgeneralwriteHelper.rtupdate_StartToken = "rtupdate=";
        theIaxgeneralwriteHelper.rtupdate_StopToken = "\n";
        theIaxgeneralwriteHelper.rtautoclear_StartToken = "rtautoclear=";
        theIaxgeneralwriteHelper.rtautoclear_StopToken = "\n";
        theIaxgeneralwriteHelper.rtignoreexpire_StartToken = "rtignoreexpire=";
        theIaxgeneralwriteHelper.rtignoreexpire_StopToken = "\n";
        theIaxgeneralwriteHelper.trunkfreq_StartToken = "trunkfreq=";
        theIaxgeneralwriteHelper.trunkfreq_StopToken = "\n";
        theIaxgeneralwriteHelper.disallow_StartToken = "disallow=";
        theIaxgeneralwriteHelper.disallow_StopToken = "\n";
        theIaxgeneralwriteHelper.allow_StartToken = "allow=";
        theIaxgeneralwriteHelper.allow_StopToken = "\n";
        theIaxgeneralwriteHelper.minregexpire_StartToken = "minregexpire=";
        theIaxgeneralwriteHelper.minregexpire_StopToken = "\n";
        theIaxgeneralwriteHelper.maxregexpire_StartToken = "maxregexpire=";
        theIaxgeneralwriteHelper.maxregexpire_StopToken = "\n";
        theIaxgeneralwriteHelper.notransfer_StartToken = "notransfer=";
        theIaxgeneralwriteHelper.notransfer_StopToken = "\n";

        theIaxpeerwriteHelper = new IaxpeerwriteHelper();
        theIaxpeerwriteHelper.iaxpeername_StartToken = "iaxpeername=";
        theIaxpeerwriteHelper.iaxpeername_StopToken = "\n";
        theIaxpeerwriteHelper.peertype_StartToken = "peertype=";
        theIaxpeerwriteHelper.peertype_StopToken = "\n";
        theIaxpeerwriteHelper.callerid_StartToken = "callerid=";
        theIaxpeerwriteHelper.callerid_StopToken = "\n";
        theIaxpeerwriteHelper.auth_StartToken = "auth=";
        theIaxpeerwriteHelper.auth_StopToken = "\n";
        theIaxpeerwriteHelper.secret_StartToken = "secret=";
        theIaxpeerwriteHelper.secret_StopToken = "\n";
        theIaxpeerwriteHelper.inkeys_StartToken = "inkeys=";
        theIaxpeerwriteHelper.inkeys_StopToken = "\n";
        theIaxpeerwriteHelper.host_StartToken = "host=";
        theIaxpeerwriteHelper.host_StopToken = "\n";
        theIaxpeerwriteHelper.defaultip_StartToken = "defaultip=";
        theIaxpeerwriteHelper.defaultip_StopToken = "\n";
        theIaxpeerwriteHelper.context_StartToken = "context=";
        theIaxpeerwriteHelper.context_StopToken = "\n";
        theIaxpeerwriteHelper.dbsecret_StartToken = "dbsecret=";
        theIaxpeerwriteHelper.dbsecret_StopToken = "\n";
        theIaxpeerwriteHelper.setvar_StartToken = "setvar=";
        theIaxpeerwriteHelper.setvar_StopToken = "\n";
        theIaxpeerwriteHelper.peercontext_StartToken = "peercontext=";
        theIaxpeerwriteHelper.peercontext_StopToken = "\n";
        theIaxpeerwriteHelper.qualify_StartToken = "qualify=";
        theIaxpeerwriteHelper.qualify_StopToken = "\n";
        theIaxpeerwriteHelper.trunk_StartToken = "trunk=";
        theIaxpeerwriteHelper.trunk_StopToken = "\n";
        theIaxpeerwriteHelper.timezone_StartToken = "timezone=";
        theIaxpeerwriteHelper.timezone_StopToken = "\n";
        theIaxpeerwriteHelper.regexten_StartToken = "regexten=";
        theIaxpeerwriteHelper.regexten_StopToken = "\n";
        theIaxpeerwriteHelper.disallow_StartToken = "disallow=";
        theIaxpeerwriteHelper.disallow_StopToken = "\n";
        theIaxpeerwriteHelper.allow_StartToken = "allow=";
        theIaxpeerwriteHelper.allow_StopToken = "\n";
        theIaxpeerwriteHelper.mailbox_StartToken = "mailbox=";
        theIaxpeerwriteHelper.mailbox_StopToken = "\n";
        theIaxpeerwriteHelper.accountcode_StartToken = "accountcode=";
        theIaxpeerwriteHelper.accountcode_StopToken = "\n";
        theIaxpeerwriteHelper.outkey_StartToken = "outkey=";
        theIaxpeerwriteHelper.outkey_StopToken = "\n";
        theIaxpeerwriteHelper.notransfer_StartToken = "notransfer=";
        theIaxpeerwriteHelper.notransfer_StopToken = "\n";
        theIaxpeerwriteHelper.qualifysmoothing_StartToken = "qualifysmoothing=";
        theIaxpeerwriteHelper.qualifysmoothing_StopToken = "\n";
        theIaxpeerwriteHelper.qualifyfreqok_StartToken = "qualifyfreqok=";
        theIaxpeerwriteHelper.qualifyfreqok_StopToken = "\n";
        theIaxpeerwriteHelper.qualifyfreqnotok_StartToken = "qualifyfreqnotok=";
        theIaxpeerwriteHelper.qualifyfreqnotok_StopToken = "\n";

        theIaxjitterwriteHelper = new IaxjitterwriteHelper();
        theIaxjitterwriteHelper.jitterbuffer_StartToken = "jitterbuffer=";
        theIaxjitterwriteHelper.jitterbuffer_StopToken = "\n";
        theIaxjitterwriteHelper.forcejitterbuffer_StartToken = "forcejitterbuffer=";
        theIaxjitterwriteHelper.forcejitterbuffer_StopToken = "\n";
        theIaxjitterwriteHelper.dropcount_StartToken = "dropcount=";
        theIaxjitterwriteHelper.dropcount_StopToken = "\n";
        theIaxjitterwriteHelper.maxjitterbuffer_StartToken = "maxjitterbuffer=";
        theIaxjitterwriteHelper.maxjitterbuffer_StopToken = "\n";
        theIaxjitterwriteHelper.resyncthreshold_StartToken = "resyncthreshold=";
        theIaxjitterwriteHelper.resyncthreshold_StopToken = "\n";
        theIaxjitterwriteHelper.maxjitterinterps_StartToken = "maxjitterinterps=";
        theIaxjitterwriteHelper.maxjitterinterps_StopToken = "\n";
        theIaxjitterwriteHelper.maxexcessbuffer_StartToken = "maxexcessbuffer=";
        theIaxjitterwriteHelper.maxexcessbuffer_StopToken = "\n";
        theIaxjitterwriteHelper.minexcessbuffer_StartToken = "minexcessbuffer=";
        theIaxjitterwriteHelper.minexcessbuffer_StopToken = "\n";
        theIaxjitterwriteHelper.jittershrinkrate_StartToken = "jittershrinkrate=";
        theIaxjitterwriteHelper.jittershrinkrate_StopToken = "\n";

    }

}
