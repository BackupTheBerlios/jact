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
package com.useit.jact.io.sipconf;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.16 2006/01/13
 *          16:54:45 urs Exp $
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
        COMMENTTOK = ";";

        // theSipauthwriteHelper = new SipauthwriteHelper();
        // /
        // theSipConfwriteHelper = new SipConfwriteHelper();
        // theSipConfwriteHelper.Sipconfid_StartToken=";sipconfid=";
        // theSipConfwriteHelper.Sipconfid_StopToken="\n";
        //
        // theSipgeneralwriteHelper = new SipgeneralwriteHelper();
        // theSipgeneralwriteHelper.Autocreatepeer_StartToken="autocreatepeer=";
        // theSipgeneralwriteHelper.Autocreatepeer_StopToken="\n";
        // theSipgeneralwriteHelper.Bindaddr_StartToken="bindaddr=";
        // theSipgeneralwriteHelper.Bindaddr_StopToken="\n";
        // theSipgeneralwriteHelper.Bindport_StartToken="bindport=";
        // theSipgeneralwriteHelper.Bindport_StopToken="\n";
        // theSipgeneralwriteHelper.Canreinvite_StartToken="canreinvite=";
        // theSipgeneralwriteHelper.Canreinvite_StopToken="\n";
        // theSipgeneralwriteHelper.Context_StartToken="context=";
        // theSipgeneralwriteHelper.Context_StopToken="\n";
        // theSipgeneralwriteHelper.Defaultexpirey_StartToken="defaultexpirey=";
        // theSipgeneralwriteHelper.Defaultexpirey_StopToken="\n";
        // theSipgeneralwriteHelper.Dtmfmode_StartToken="dtmfmode=";
        // theSipgeneralwriteHelper.Dtmfmode_StopToken="\n";
        // theSipgeneralwriteHelper.Externip_StartToken="externip=";
        // theSipgeneralwriteHelper.Externip_StopToken="\n";
        // theSipgeneralwriteHelper.Externhost_StartToken="externhost=";
        // theSipgeneralwriteHelper.Externhost_StopToken="\n";
        // theSipgeneralwriteHelper.Externrefresh_StartToken="externrefresh=";
        // theSipgeneralwriteHelper.Externrefresh_StopToken="\n";
        // theSipgeneralwriteHelper.Localnet_StartToken="localnet=";
        // theSipgeneralwriteHelper.Localnet_StopToken="\n";
        // theSipgeneralwriteHelper.Fromdomain_StartToken="fromdomain=";
        // theSipgeneralwriteHelper.Fromdomain_StopToken="\n";
        // theSipgeneralwriteHelper.Maxexpirey_StartToken="maxexpirey=";
        // theSipgeneralwriteHelper.Maxexpirey_StopToken="\n";
        // theSipgeneralwriteHelper.Nat_StartToken="nat=";
        // theSipgeneralwriteHelper.Nat_StopToken="\n";
        // theSipgeneralwriteHelper.Notifymimetype_StartToken="notifymimetype=";
        // theSipgeneralwriteHelper.Notifymimetype_StopToken="\n";
        // theSipgeneralwriteHelper.Pedantic_StartToken="pedantic=";
        // theSipgeneralwriteHelper.Pedantic_StopToken="\n";
        // theSipgeneralwriteHelper.Port_StartToken="port=";
        // theSipgeneralwriteHelper.Port_StopToken="\n";
        // theSipgeneralwriteHelper.Promiscredir_StartToken="promiscredir=";
        // theSipgeneralwriteHelper.Promiscredir_StopToken="\n";
        // theSipgeneralwriteHelper.Srvlookup_StartToken="srvlookup=";
        // theSipgeneralwriteHelper.Srvlookup_StopToken="\n";
        // theSipgeneralwriteHelper.Tos_StartToken="tos=";
        // theSipgeneralwriteHelper.Tos_StopToken="\n";
        // theSipgeneralwriteHelper.Videosupport_StartToken="videosupport=";
        // theSipgeneralwriteHelper.Videosupport_StopToken="\n";
        // theSipgeneralwriteHelper.Useragent_StartToken="useragent=";
        // theSipgeneralwriteHelper.Useragent_StopToken="\n";
        // theSipgeneralwriteHelper.Trustrpid_StartToken="trustrpid=";
        // theSipgeneralwriteHelper.Trustrpid_StopToken="\n";
        // theSipgeneralwriteHelper.Realm_StartToken="realm=";
        // theSipgeneralwriteHelper.Realm_StopToken="\n";
        //
        // theSippeerswriteHelper = new SippeerswriteHelper();
        // theSippeerswriteHelper.Sectionname_StartToken="\n\n[";
        // theSippeerswriteHelper.Sectionname_StopToken="]\n";
        // theSippeerswriteHelper.Accountcode_StartToken="accountcode=";
        // theSippeerswriteHelper.Accountcode_StopToken="\n";
        // theSippeerswriteHelper.Amaflags_StartToken="amaflags=";
        // theSippeerswriteHelper.Amaflags_StopToken="\n";
        // theSippeerswriteHelper.Callgroup_StartToken="callgroup=";
        // theSippeerswriteHelper.Callgroup_StopToken="\n";
        // theSippeerswriteHelper.Canreinvite_StartToken="canreinvite=";
        // theSippeerswriteHelper.Canreinvite_StopToken="\n";
        // theSippeerswriteHelper.Context_StartToken="context=";
        // theSippeerswriteHelper.Context_StopToken="\n";
        // theSippeerswriteHelper.Defaultip_StartToken="defaultip=";
        // theSippeerswriteHelper.Defaultip_StopToken="\n";
        // theSippeerswriteHelper.Dtmfmode_StartToken="dtmfmode=";
        // theSippeerswriteHelper.Dtmfmode_StopToken="\n";
        // theSippeerswriteHelper.Fromuser_StartToken="fromuser=";
        // theSippeerswriteHelper.Fromuser_StopToken="\n";
        // theSippeerswriteHelper.Fromdomain_StartToken="fromdomain=";
        // theSippeerswriteHelper.Fromdomain_StopToken="\n";
        // theSippeerswriteHelper.Host_StartToken="host=";
        // theSippeerswriteHelper.Host_StopToken="\n";
        // theSippeerswriteHelper.Incominglimit_StartToken="incominglimit=";
        // theSippeerswriteHelper.Incominglimit_StopToken="\n";
        // theSippeerswriteHelper.Outgoinglimit_StartToken="outgoinglimit=";
        // theSippeerswriteHelper.Outgoinglimit_StopToken="\n";
        // theSippeerswriteHelper.Insecure_StartToken="insecure=";
        // theSippeerswriteHelper.Insecure_StopToken="\n";
        // theSippeerswriteHelper.Language_StartToken="language=";
        // theSippeerswriteHelper.Language_StopToken="\n";
        // theSippeerswriteHelper.Mailbox_StartToken="mailbox=";
        // theSippeerswriteHelper.Mailbox_StopToken="\n";
        // theSippeerswriteHelper.Md5secret_StartToken="md5secret=";
        // theSippeerswriteHelper.Md5secret_StopToken="\n";
        // theSippeerswriteHelper.Nat_StartToken="nat=";
        // theSippeerswriteHelper.Nat_StopToken="\n";
        // theSippeerswriteHelper.Pickupgroup_StartToken="pickupgroup=";
        // theSippeerswriteHelper.Pickupgroup_StopToken="\n";
        // theSippeerswriteHelper.Port_StartToken="port=";
        // theSippeerswriteHelper.Port_StopToken="\n";
        // theSippeerswriteHelper.Qualify_StartToken="qualify=";
        // theSippeerswriteHelper.Qualify_StopToken="\n";
        // theSippeerswriteHelper.Restrictcid_StartToken="restrictcid=";
        // theSippeerswriteHelper.Restrictcid_StopToken="\n";
        // theSippeerswriteHelper.Rtptimeout_StartToken="rtptimeout=";
        // theSippeerswriteHelper.Rtptimeout_StopToken="\n";
        // theSippeerswriteHelper.Rtpholdtimeout_StartToken="rtpholdtimeout=";
        // theSippeerswriteHelper.Rtpholdtimeout_StopToken="\n";
        // theSippeerswriteHelper.Secret_StartToken="secret=";
        // theSippeerswriteHelper.Secret_StopToken="\n";
        // theSippeerswriteHelper.Type_StartToken="type=";
        // theSippeerswriteHelper.Type_StopToken="\n";
        // theSippeerswriteHelper.Username_StartToken="username=";
        // theSippeerswriteHelper.Username_StopToken="\n";
        // theSippeerswriteHelper.Musiconhold_StartToken="musiconhold=";
        // theSippeerswriteHelper.Musiconhold_StopToken="\n";
        // theSippeerswriteHelper.Callerid_StartToken="callerid=";
        // theSippeerswriteHelper.Callerid_StopToken="\n";
        //
        //	
        // theSipallowwriteHelper = new SipallowwriteHelper();
        // theSipallowwriteHelper.Value_StartToken = "allow=";
        // theSipallowwriteHelper.Value_StopToken = "\n";
        //	
        // theSipdisallowwriteHelper = new SipdisallowwriteHelper();
        // theSipdisallowwriteHelper.Value_StartToken = "disallow=";
        // theSipdisallowwriteHelper.Value_StopToken = "\n";
        //	
        // theSipregisterwriteHelper = new SipregisterwriteHelper();
        // theSipregisterwriteHelper.User_StartToken="register => ";
        // theSipregisterwriteHelper.User_StopToken="";
        // theSipregisterwriteHelper.Authuser_StartToken=":";
        // theSipregisterwriteHelper.Authuser_StopToken="";
        // theSipregisterwriteHelper.Host_StartToken="@";
        // theSipregisterwriteHelper.Host_StopToken="";
        // theSipregisterwriteHelper.Secret_StartToken=":";
        // theSipregisterwriteHelper.Secret_StopToken="";
        // theSipregisterwriteHelper.Port_StartToken=":";
        // theSipregisterwriteHelper.Port_StopToken="";
        // theSipregisterwriteHelper.Extension_StartToken="/";
        // theSipregisterwriteHelper.Extension_StopToken="";
        theSipregisterwriteHelper = new SipregisterwriteHelper();
        theSipregisterwriteHelper.user_StartToken = "register => ";
        theSipregisterwriteHelper.user_StopToken = "";
        theSipregisterwriteHelper.authuser_StartToken = ":";
        theSipregisterwriteHelper.authuser_StopToken = "";
        theSipregisterwriteHelper.secret_StartToken = ":";
        theSipregisterwriteHelper.secret_StopToken = "";
        theSipregisterwriteHelper.host_StartToken = "@";
        theSipregisterwriteHelper.host_StopToken = "";
        theSipregisterwriteHelper.port_StartToken = ":";
        theSipregisterwriteHelper.port_StopToken = "";
        theSipregisterwriteHelper.extension_StartToken = "/";
        theSipregisterwriteHelper.extension_StopToken = "";

        theSipauthwriteHelper = new SipauthwriteHelper();
        // theSipauthwriteHelper.User_StartToken="auth=";
        // theSipauthwriteHelper.User_StopToken="";
        // theSipauthwriteHelper.Secret_StartToken=":";
        // theSipauthwriteHelper.Secret_StopToken="";
        // theSipauthwriteHelper.Md5secret_StartToken="#";
        // theSipauthwriteHelper.Md5secret_StopToken="";
        // theSipauthwriteHelper.Realm_StartToken="@";
        // theSipauthwriteHelper.Realm_StopToken="\n";
        theSipauthwriteHelper.user_StartToken = "auth=";
        theSipauthwriteHelper.user_StopToken = "";
        theSipauthwriteHelper.secret_StartToken = ":";
        theSipauthwriteHelper.secret_StopToken = "";
        theSipauthwriteHelper.md5secret_StartToken = "#";
        theSipauthwriteHelper.md5secret_StopToken = "";
        theSipauthwriteHelper.realm_StartToken = "@";
        theSipauthwriteHelper.realm_StopToken = "\n";

        theSipgeneralwriteHelper = new SipgeneralwriteHelper() {
            @Override
            public void writeallow(StringBuffer strB, Sipgeneral impl) {
                writeEnumSet("allow=", "\n", impl.getAllow(), strB);
                writeEmtypLine(strB);
            }

            @Override
            public void writedisallow(StringBuffer strB, Sipgeneral impl) {
                writeEnumSet("disallow=", "\n", impl.getDisallow(), strB);
                writeEmtypLine(strB);
            }
        };
        theSipgeneralwriteHelper.autocreatepeer_StartToken = "autocreatepeer=";
        theSipgeneralwriteHelper.autocreatepeer_StopToken = "\n";
        theSipgeneralwriteHelper.bindaddr_StartToken = "bindaddr=";
        theSipgeneralwriteHelper.bindaddr_StopToken = "\n";
        theSipgeneralwriteHelper.bindport_StartToken = "bindport=";
        theSipgeneralwriteHelper.bindport_StopToken = "\n";
        theSipgeneralwriteHelper.canreinvite_StartToken = "canreinvite=";
        theSipgeneralwriteHelper.canreinvite_StopToken = "\n";
        theSipgeneralwriteHelper.context_StartToken = "context=";
        theSipgeneralwriteHelper.context_StopToken = "\n";
        theSipgeneralwriteHelper.defaultexpirey_StartToken = "defaultexpirey=";
        theSipgeneralwriteHelper.defaultexpirey_StopToken = "\n";
        theSipgeneralwriteHelper.dtmfmode_StartToken = "dtmfmode=";
        theSipgeneralwriteHelper.dtmfmode_StopToken = "\n";
        theSipgeneralwriteHelper.externip_StartToken = "externip=";
        theSipgeneralwriteHelper.externip_StopToken = "\n";
        theSipgeneralwriteHelper.externhost_StartToken = "externhost=";
        theSipgeneralwriteHelper.externhost_StopToken = "\n";
        theSipgeneralwriteHelper.externrefresh_StartToken = "externrefresh=";
        theSipgeneralwriteHelper.externrefresh_StopToken = "\n";
        theSipgeneralwriteHelper.localnet_StartToken = "localnet=";
        theSipgeneralwriteHelper.localnet_StopToken = "\n";
        theSipgeneralwriteHelper.fromdomain_StartToken = "fromdomain=";
        theSipgeneralwriteHelper.fromdomain_StopToken = "\n";
        theSipgeneralwriteHelper.maxexpirey_StartToken = "maxexpirey=";
        theSipgeneralwriteHelper.maxexpirey_StopToken = "\n";
        theSipgeneralwriteHelper.nat_StartToken = "nat=";
        theSipgeneralwriteHelper.nat_StopToken = "\n";
        theSipgeneralwriteHelper.notifymimetype_StartToken = "notifymimetype=";
        theSipgeneralwriteHelper.notifymimetype_StopToken = "\n";
        theSipgeneralwriteHelper.pedantic_StartToken = "pedantic=";
        theSipgeneralwriteHelper.pedantic_StopToken = "\n";
        theSipgeneralwriteHelper.port_StartToken = "port=";
        theSipgeneralwriteHelper.port_StopToken = "\n";
        theSipgeneralwriteHelper.promiscredir_StartToken = "promiscredir=";
        theSipgeneralwriteHelper.promiscredir_StopToken = "\n";
        theSipgeneralwriteHelper.srvlookup_StartToken = "srvlookup=";
        theSipgeneralwriteHelper.srvlookup_StopToken = "\n";
        theSipgeneralwriteHelper.tos_StartToken = "tos=";
        theSipgeneralwriteHelper.tos_StopToken = "\n";
        theSipgeneralwriteHelper.videosupport_StartToken = "videosupport=";
        theSipgeneralwriteHelper.videosupport_StopToken = "\n";
        theSipgeneralwriteHelper.useragent_StartToken = "useragent=";
        theSipgeneralwriteHelper.useragent_StopToken = "\n";
        theSipgeneralwriteHelper.trustrpid_StartToken = "trustrpid=";
        theSipgeneralwriteHelper.trustrpid_StopToken = "\n";
        theSipgeneralwriteHelper.realm_StartToken = "realm=";
        theSipgeneralwriteHelper.realm_StopToken = "\n";
        theSipgeneralwriteHelper.relaxdtmf_StartToken = "relaxdtmf=";
        theSipgeneralwriteHelper.relaxdtmf_StopToken = "\n";
        theSipgeneralwriteHelper.rtptimeout_StartToken = "rtptimeout=";
        theSipgeneralwriteHelper.rtptimeout_StopToken = "\n";
        theSipgeneralwriteHelper.rtpholdtimeout_StartToken = "rtpholdtimeout=";
        theSipgeneralwriteHelper.rtpholdtimeout_StopToken = "\n";
        theSipgeneralwriteHelper.progressinband_StartToken = "progressinband=";
        theSipgeneralwriteHelper.progressinband_StopToken = "\n";
        theSipgeneralwriteHelper.usereqphone_StartToken = "usereqphone=";
        theSipgeneralwriteHelper.usereqphone_StopToken = "\n";
        theSipgeneralwriteHelper.compactheaders_StartToken = "compactheaders=";
        theSipgeneralwriteHelper.compactheaders_StopToken = "\n";
        theSipgeneralwriteHelper.sipdebug_StartToken = "sipdebug=";
        theSipgeneralwriteHelper.sipdebug_StopToken = "\n";
        theSipgeneralwriteHelper.checkmwi_StartToken = "checkmwi=";
        theSipgeneralwriteHelper.checkmwi_StopToken = "\n";
        theSipgeneralwriteHelper.recordhistory_StartToken = "recordhistory=";
        theSipgeneralwriteHelper.recordhistory_StopToken = "\n";

        theSipConfwriteHelper = new SipConfwriteHelper();
        // theSipConfwriteHelper.sipconfid_StartToken="sipconfid=";
        // theSipConfwriteHelper.sipconfid_StopToken="\n";
        // //
        // theSipallowwriteHelper = new SipallowwriteHelper();
        // theSipallowwriteHelper.value_StartToken="value=";
        // theSipallowwriteHelper.value_StopToken="\n";
        //
        // theSipdisallowwriteHelper = new SipdisallowwriteHelper();
        // theSipdisallowwriteHelper.value_StartToken="value=";
        // theSipdisallowwriteHelper.value_StopToken="\n";
        //
        theSippeerswriteHelper = new SippeerswriteHelper() {
            @Override
            public void writeallow(StringBuffer strB, Sippeers impl) {
                writeEnumSet("allow=", "\n", impl.getAllow(), strB);
                writeEmtypLine(strB);
            }

            @Override
            public void writedisallow(StringBuffer strB, Sippeers impl) {
                writeEnumSet("disallow=", "\n", impl.getDisallow(), strB);
                writeEmtypLine(strB);
            }

        };
        // theSippeerswriteHelper.sectionname_StartToken="sectionname=";
        // theSippeerswriteHelper.sectionname_StopToken="\n";
        theSippeerswriteHelper.accountcode_StartToken = "accountcode=";
        theSippeerswriteHelper.accountcode_StopToken = "\n";
        theSippeerswriteHelper.amaflags_StartToken = "amaflags=";
        theSippeerswriteHelper.amaflags_StopToken = "\n";
        theSippeerswriteHelper.callgroup_StartToken = "callgroup=";
        theSippeerswriteHelper.callgroup_StopToken = "\n";
        theSippeerswriteHelper.canreinvite_StartToken = "canreinvite=";
        theSippeerswriteHelper.canreinvite_StopToken = "\n";
        theSippeerswriteHelper.context_StartToken = "context=";
        theSippeerswriteHelper.context_StopToken = "\n";
        theSippeerswriteHelper.defaultip_StartToken = "defaultip=";
        theSippeerswriteHelper.defaultip_StopToken = "\n";
        theSippeerswriteHelper.dtmfmode_StartToken = "dtmfmode=";
        theSippeerswriteHelper.dtmfmode_StopToken = "\n";
        theSippeerswriteHelper.fromuser_StartToken = "fromuser=";
        theSippeerswriteHelper.fromuser_StopToken = "\n";
        theSippeerswriteHelper.fromdomain_StartToken = "fromdomain=";
        theSippeerswriteHelper.fromdomain_StopToken = "\n";
        theSippeerswriteHelper.host_StartToken = "host=";
        theSippeerswriteHelper.host_StopToken = "\n";
        theSippeerswriteHelper.incominglimit_StartToken = "incominglimit=";
        theSippeerswriteHelper.incominglimit_StopToken = "\n";
        theSippeerswriteHelper.outgoinglimit_StartToken = "outgoinglimit=";
        theSippeerswriteHelper.outgoinglimit_StopToken = "\n";
        theSippeerswriteHelper.insecure_StartToken = "insecure=";
        theSippeerswriteHelper.insecure_StopToken = "\n";
        theSippeerswriteHelper.language_StartToken = "language=";
        theSippeerswriteHelper.language_StopToken = "\n";
        theSippeerswriteHelper.mailbox_StartToken = "mailbox=";
        theSippeerswriteHelper.mailbox_StopToken = "\n";
        theSippeerswriteHelper.md5secret_StartToken = "md5secret=";
        theSippeerswriteHelper.md5secret_StopToken = "\n";
        theSippeerswriteHelper.nat_StartToken = "nat=";
        theSippeerswriteHelper.nat_StopToken = "\n";
        theSippeerswriteHelper.pickupgroup_StartToken = "pickupgroup=";
        theSippeerswriteHelper.pickupgroup_StopToken = "\n";
        theSippeerswriteHelper.port_StartToken = "port=";
        theSippeerswriteHelper.port_StopToken = "\n";
        theSippeerswriteHelper.qualify_StartToken = "qualify=";
        theSippeerswriteHelper.qualify_StopToken = "\n";
        theSippeerswriteHelper.restrictcid_StartToken = "restrictcid=";
        theSippeerswriteHelper.restrictcid_StopToken = "\n";
        theSippeerswriteHelper.rtptimeout_StartToken = "rtptimeout=";
        theSippeerswriteHelper.rtptimeout_StopToken = "\n";
        theSippeerswriteHelper.rtpholdtimeout_StartToken = "rtpholdtimeout=";
        theSippeerswriteHelper.rtpholdtimeout_StopToken = "\n";
        theSippeerswriteHelper.secret_StartToken = "secret=";
        theSippeerswriteHelper.secret_StopToken = "\n";
        theSippeerswriteHelper.type_StartToken = "type=";
        theSippeerswriteHelper.type_StopToken = "\n";
        theSippeerswriteHelper.username_StartToken = "username=";
        theSippeerswriteHelper.username_StopToken = "\n";
        theSippeerswriteHelper.musiconhold_StartToken = "musiconhold=";
        theSippeerswriteHelper.musiconhold_StopToken = "\n";
        theSippeerswriteHelper.callerid_StartToken = "callerid=";
        theSippeerswriteHelper.callerid_StopToken = "\n";

        // theSipregisterwriteHelper.Extension_StopToken = "\n";
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.sipconf.ConfWriter#writeSipregister(java.lang.StringBuffer,
     *      com.useit.jact.model.sipconf.Sipregister)
     */
    protected void writeSipregister(StringBuffer strB, Sipregister impl) {
        super.writeSipregister(strB, impl);
        writeEmtypLine(strB);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.sipconf.ConfWriter#writeSipConf(java.lang.StringBuffer,
     *      com.useit.jact.model.sipconf.SipConf)
     */
    protected void writeSipConf(StringBuffer strB, SipConf impl) {
        strB.append(";Sip config generated by jact\n");
        writeComment(strB, impl);
        super.writeSipConf(strB, impl);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.sipconf.ConfWriter#writeSipgeneral(java.lang.StringBuffer,
     *      com.useit.jact.model.sipconf.Sipgeneral)
     */
    protected void writeSipgeneral(StringBuffer strB, Sipgeneral impl) {
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.GENERAL);
        super.writeSipgeneral(strB, impl);

    }

    /**
     * schreibt die Felder von Sipgeneral
     * 
     * @param strB
     * @param msec
     */
    protected void writeSipgeneralFields(StringBuffer strB, Sipgeneral impl) {

        // felder schreiben
        theSipgeneralwriteHelper.writeautocreatepeer(strB, impl);
        theSipgeneralwriteHelper.writebindaddr(strB, impl);
        theSipgeneralwriteHelper.writebindport(strB, impl);
        theSipgeneralwriteHelper.writecanreinvite(strB, impl);
        theSipgeneralwriteHelper.writecontext(strB, impl);
        theSipgeneralwriteHelper.writedefaultexpirey(strB, impl);
        theSipgeneralwriteHelper.writedtmfmode(strB, impl);
        theSipgeneralwriteHelper.writeexternip(strB, impl);
        theSipgeneralwriteHelper.writeexternhost(strB, impl);
        theSipgeneralwriteHelper.writeexternrefresh(strB, impl);
        theSipgeneralwriteHelper.writelocalnet(strB, impl);
        theSipgeneralwriteHelper.writefromdomain(strB, impl);
        theSipgeneralwriteHelper.writemaxexpirey(strB, impl);
        theSipgeneralwriteHelper.writenat(strB, impl);
        theSipgeneralwriteHelper.writenotifymimetype(strB, impl);
        theSipgeneralwriteHelper.writepedantic(strB, impl);
        theSipgeneralwriteHelper.writeport(strB, impl);
        theSipgeneralwriteHelper.writepromiscredir(strB, impl);
        theSipgeneralwriteHelper.writesrvlookup(strB, impl);
        theSipgeneralwriteHelper.writetos(strB, impl);
        theSipgeneralwriteHelper.writevideosupport(strB, impl);
        theSipgeneralwriteHelper.writeuseragent(strB, impl);
        theSipgeneralwriteHelper.writetrustrpid(strB, impl);
        theSipgeneralwriteHelper.writerealm(strB, impl);
        theSipgeneralwriteHelper.writerelaxdtmf(strB, impl);
        theSipgeneralwriteHelper.writertptimeout(strB, impl);
        theSipgeneralwriteHelper.writertpholdtimeout(strB, impl);
        theSipgeneralwriteHelper.writeprogressinband(strB, impl);
        theSipgeneralwriteHelper.writeusereqphone(strB, impl);
        theSipgeneralwriteHelper.writecompactheaders(strB, impl);
        theSipgeneralwriteHelper.writesipdebug(strB, impl);
        theSipgeneralwriteHelper.writecheckmwi(strB, impl);
        theSipgeneralwriteHelper.writerecordhistory(strB, impl);
        theSipgeneralwriteHelper.writedisallow(strB, impl);
        theSipgeneralwriteHelper.writeallow(strB, impl);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.sipconf.ConfWriter#writeSipgeneralAggregates(java.lang.StringBuffer,
     *      com.useit.jact.model.sipconf.Sipgeneral)
     */
    protected void writeSipgeneralAggregates(StringBuffer strB, Sipgeneral impl) {

        for (Iterator iter = impl.getSipregisterMap().iterator(); iter
                .hasNext();) {
            Sipregister mobj = (Sipregister) iter.next();

            writeSipregister(strB, mobj);

        }
        writeEmtypLine(strB);
        // writeSecHeader(strB, ConfReaderImpl.AUTHENTICATION);
        //
        // //maps schreiben
        //
        // for (Iterator iter = impl.getSipauthMap().iterator();
        // iter.hasNext();) {
        // Sipauth mobj = (Sipauth) iter.next();
        //                
        // writeSipauth(strB,mobj);
        //                
        // }

    }

    @Override
    protected void writeSippeers(StringBuffer strB, Sippeers impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, impl.getSectionname());

        super.writeSippeers(strB, impl);
    }

    /**
     * schreibt die Felder von Sippeers
     * 
     * @param strB
     * @param msec
     */
    protected void writeSippeersFields(StringBuffer strB, Sippeers impl) {

        // felder schreiben
        // theSippeerswriteHelper.writesectionname(strB,impl);
        theSippeerswriteHelper.writeaccountcode(strB, impl);
        theSippeerswriteHelper.writeamaflags(strB, impl);
        theSippeerswriteHelper.writecallgroup(strB, impl);
        theSippeerswriteHelper.writecanreinvite(strB, impl);
        theSippeerswriteHelper.writecontext(strB, impl);
        theSippeerswriteHelper.writedefaultip(strB, impl);
        theSippeerswriteHelper.writedtmfmode(strB, impl);
        theSippeerswriteHelper.writefromuser(strB, impl);
        theSippeerswriteHelper.writefromdomain(strB, impl);
        theSippeerswriteHelper.writehost(strB, impl);
        theSippeerswriteHelper.writeincominglimit(strB, impl);
        theSippeerswriteHelper.writeoutgoinglimit(strB, impl);
        theSippeerswriteHelper.writeinsecure(strB, impl);
        theSippeerswriteHelper.writelanguage(strB, impl);
        theSippeerswriteHelper.writemailbox(strB, impl);
        theSippeerswriteHelper.writemd5secret(strB, impl);
        theSippeerswriteHelper.writenat(strB, impl);
        theSippeerswriteHelper.writepickupgroup(strB, impl);
        theSippeerswriteHelper.writeport(strB, impl);
        theSippeerswriteHelper.writequalify(strB, impl);
        theSippeerswriteHelper.writerestrictcid(strB, impl);
        theSippeerswriteHelper.writertptimeout(strB, impl);
        theSippeerswriteHelper.writertpholdtimeout(strB, impl);
        theSippeerswriteHelper.writesecret(strB, impl);
        theSippeerswriteHelper.writetype(strB, impl);
        theSippeerswriteHelper.writeusername(strB, impl);
        theSippeerswriteHelper.writemusiconhold(strB, impl);
        theSippeerswriteHelper.writecallerid(strB, impl);
        theSippeerswriteHelper.writedisallow(strB, impl);
        theSippeerswriteHelper.writeallow(strB, impl);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.io.sipconf.ConfWriter#writeSipauth(java.lang.StringBuffer,
     *      com.useit.jact.model.sipconf.Sipauth)
     */
    protected void writeSipauth(StringBuffer strB, Sipauth impl) {
        super.writeSipauth(strB, impl);
        // strB.append("\n");
    }

    /**
     * @param strB
     * @param msec
     */
    protected void writeSippeersAggregates(StringBuffer strB, Sippeers impl) {
        // maps schreiben

        for (Iterator iter = impl.getSipauthMap().iterator(); iter.hasNext();) {
            Sipauth mobj = (Sipauth) iter.next();

            writeSipauth(strB, mobj);

        }
    }
}
