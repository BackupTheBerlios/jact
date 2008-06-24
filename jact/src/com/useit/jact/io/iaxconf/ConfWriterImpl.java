/*
 * (c) urs zeidler
 */
package com.useit.jact.io.iaxconf;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.Iaxregister;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.4 2006/01/12 15:20:11
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
        // TODO: die tokens anpassen

        theIaxregisterwriteHelper = new IaxregisterwriteHelper();
        theIaxregisterwriteHelper.user_StartToken = "register => ";
        theIaxregisterwriteHelper.user_StopToken = "";
        theIaxregisterwriteHelper.authuser_StartToken = "[";
        theIaxregisterwriteHelper.authuser_StopToken = "]";
        theIaxregisterwriteHelper.secret_StartToken = ":";
        theIaxregisterwriteHelper.secret_StopToken = "";
        theIaxregisterwriteHelper.host_StartToken = "@";
        theIaxregisterwriteHelper.host_StopToken = "";
        theIaxregisterwriteHelper.port_StartToken = ":";
        theIaxregisterwriteHelper.port_StopToken = "\\";
        theIaxregisterwriteHelper.extension_StartToken = "";
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
        theIaxpeerwriteHelper.iaxpeername_StartToken = "[";
        theIaxpeerwriteHelper.iaxpeername_StopToken = "]\n";
        theIaxpeerwriteHelper.peertype_StartToken = "type=";
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

    /**
     * schreibt ein Iaxregister Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxregister(StringBuffer strB, Iaxregister impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.REGISTER);
        // strB.append("[iaxregister]\n");

        super.writeIaxregister(strB, impl);

    }

    /**
     * schreibt ein Iaxdeny Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxdeny(StringBuffer strB, Iaxdeny impl) {
        super.writeIaxdeny(strB, impl);

    }

    /**
     * schreibt ein Iaxpermit Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpermit(StringBuffer strB, Iaxpermit impl) {
        super.writeIaxpermit(strB, impl);

    }

    /**
     * schreibt ein Iaxgeneral Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxgeneral(StringBuffer strB, Iaxgeneral impl) {
        strB.append(";iaxconfig config generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.GENERAL);
        // strB.append("[general]\n");
        super.writeIaxgeneral(strB, impl);

    }

    /**
     * schreibt ein Iaxpeer Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxpeer(StringBuffer strB, Iaxpeer impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        // strB.append("[")
        // .append(impl.getIaxpeername())
        // .append("]\n");
        super.writeIaxpeer(strB, impl);

    }

    /**
     * schreibt ein Iaxjitter Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeIaxjitter(StringBuffer strB, Iaxjitter impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.IAXJITTER);
        super.writeIaxjitter(strB, impl);

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
        if (!impl.getIaxdenyMap().isEmpty())
            strB.append("deny=");

        for (Iterator iter = impl.getIaxdenyMap().iterator(); iter.hasNext();) {
            Iaxdeny mobj = (Iaxdeny) iter.next();
            strB.append(mobj.getValue());
            if (iter.hasNext())
                strB.append(",");
        }
        if (!impl.getIaxdenyMap().isEmpty())
            writeEmtypLine(strB);

        if (!impl.getIaxdenyMap().isEmpty())
            strB.append("permit=");

        // IaxpermitMap
        for (Iterator iter = impl.getIaxpermitMap().iterator(); iter.hasNext();) {
            Iaxpermit mobj = (Iaxpermit) iter.next();
            strB.append(mobj.getValue());
            if (iter.hasNext())
                strB.append(",");
        }
        if (!impl.getIaxdenyMap().isEmpty())
            writeEmtypLine(strB);

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
    // writeConf(strb, data);
    // return strb.toString();
    // }

}
