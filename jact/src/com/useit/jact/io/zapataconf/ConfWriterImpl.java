/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import org.apache.log4j.Logger;

import com.useit.jact.model.zapataconf.Analog_Handset_Features;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;
import com.useit.jact.model.zapataconf.Call_Logging_Options;
import com.useit.jact.model.zapataconf.Caller_ID_Options;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;
import com.useit.jact.model.zapataconf.Multilink_PPP;
import com.useit.jact.model.zapataconf.Other;
import com.useit.jact.model.zapataconf.Timing_Parameters;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.Zaptelchannel;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.5 2006/01/29 12:03:54
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
        COMMENTTOK = ";";
        SECHEADERTOK = "[";

        theAnalog_Handset_FeatureswriteHelper = new Analog_Handset_FeatureswriteHelper();
        theAnalog_Handset_FeatureswriteHelper.adsi_StartToken = "adsi=";
        theAnalog_Handset_FeatureswriteHelper.adsi_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.immediate_StartToken = "immediate=";
        theAnalog_Handset_FeatureswriteHelper.immediate_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.callwaiting_StartToken = "callwaiting=";
        theAnalog_Handset_FeatureswriteHelper.callwaiting_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.callwaitingcallerid_StartToken = "callwaitingcallerid=";
        theAnalog_Handset_FeatureswriteHelper.callwaitingcallerid_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.threewaycalling_StartToken = "threewaycalling=";
        theAnalog_Handset_FeatureswriteHelper.threewaycalling_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.transfer_StartToken = "transfer=";
        theAnalog_Handset_FeatureswriteHelper.transfer_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.cancallforward_StartToken = "cancallforward=";
        theAnalog_Handset_FeatureswriteHelper.cancallforward_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.callreturn_StartToken = "callreturn=";
        theAnalog_Handset_FeatureswriteHelper.callreturn_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.callgroup_StartToken = "callgroup=";
        theAnalog_Handset_FeatureswriteHelper.callgroup_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.pickupgroup_StartToken = "pickupgroup=";
        theAnalog_Handset_FeatureswriteHelper.pickupgroup_StopToken = "\n";
        theAnalog_Handset_FeatureswriteHelper.useincomingcalleridonzaptransfer_StartToken = "useincomingcalleridonzaptransfer=";
        theAnalog_Handset_FeatureswriteHelper.useincomingcalleridonzaptransfer_StopToken = "\n";

        theTiming_ParameterswriteHelper = new Timing_ParameterswriteHelper();
        theTiming_ParameterswriteHelper.prewink_StartToken = "prewink=";
        theTiming_ParameterswriteHelper.prewink_StopToken = "\n";
        theTiming_ParameterswriteHelper.preflash_StartToken = "preflash=";
        theTiming_ParameterswriteHelper.preflash_StopToken = "\n";
        theTiming_ParameterswriteHelper.wink_StartToken = "wink=";
        theTiming_ParameterswriteHelper.wink_StopToken = "\n";
        theTiming_ParameterswriteHelper.rxwink_StartToken = "rxwink=";
        theTiming_ParameterswriteHelper.rxwink_StopToken = "\n";
        theTiming_ParameterswriteHelper.rxflash_StartToken = "rxflash=";
        theTiming_ParameterswriteHelper.rxflash_StopToken = "\n";
        theTiming_ParameterswriteHelper.flash_StartToken = "flash=";
        theTiming_ParameterswriteHelper.flash_StopToken = "\n";
        theTiming_ParameterswriteHelper.start_StartToken = "start=";
        theTiming_ParameterswriteHelper.start_StopToken = "\n";
        theTiming_ParameterswriteHelper.debounce_StartToken = "debounce=";
        theTiming_ParameterswriteHelper.debounce_StopToken = "\n";

        theZaptelchannelwriteHelper = new ZaptelchannelwriteHelper();
        theZaptelchannelwriteHelper.signalling_StartToken = "signalling=";
        theZaptelchannelwriteHelper.signalling_StopToken = "\n";
        theZaptelchannelwriteHelper.context_StartToken = "context=";
        theZaptelchannelwriteHelper.context_StopToken = "\n";
        theZaptelchannelwriteHelper.channel_StartToken = "channel => ";
        theZaptelchannelwriteHelper.channel_StopToken = "\n";

        theAnalog_Trunk_FeatureswriteHelper = new Analog_Trunk_FeatureswriteHelper();
        theAnalog_Trunk_FeatureswriteHelper.usedistinctiveringdetection_StartToken = "usedistinctiveringdetection=";
        theAnalog_Trunk_FeatureswriteHelper.usedistinctiveringdetection_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.dring1_StartToken = "dring1=";
        theAnalog_Trunk_FeatureswriteHelper.dring1_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.dring2_StartToken = "dring2=";
        theAnalog_Trunk_FeatureswriteHelper.dring2_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.dring3_StartToken = "dring3=";
        theAnalog_Trunk_FeatureswriteHelper.dring3_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.dring1context_StartToken = "dring1context=";
        theAnalog_Trunk_FeatureswriteHelper.dring1context_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.dring2context_StartToken = "dring2context=";
        theAnalog_Trunk_FeatureswriteHelper.dring2context_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.dring3context_StartToken = "dring3context=";
        theAnalog_Trunk_FeatureswriteHelper.dring3context_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.busydetect_StartToken = "busydetect=";
        theAnalog_Trunk_FeatureswriteHelper.busydetect_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.busycount_StartToken = "busycount=";
        theAnalog_Trunk_FeatureswriteHelper.busycount_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.callprogress_StartToken = "callprogress=";
        theAnalog_Trunk_FeatureswriteHelper.callprogress_StopToken = "\n";
        theAnalog_Trunk_FeatureswriteHelper.pulse_StartToken = "pulse=";
        theAnalog_Trunk_FeatureswriteHelper.pulse_StopToken = "\n";

        theISDN_PRI_SwitchwriteHelper = new ISDN_PRI_SwitchwriteHelper();
        theISDN_PRI_SwitchwriteHelper.switchtype_StartToken = "switchtype=";
        theISDN_PRI_SwitchwriteHelper.switchtype_StopToken = "\n";
        theISDN_PRI_SwitchwriteHelper.overlapdial_StartToken = "overlapdial=";
        theISDN_PRI_SwitchwriteHelper.overlapdial_StopToken = "\n";
        theISDN_PRI_SwitchwriteHelper.pridialplan_StartToken = "pridialplan=";
        theISDN_PRI_SwitchwriteHelper.pridialplan_StopToken = "\n";
        theISDN_PRI_SwitchwriteHelper.priindication_StartToken = "priindication=";
        theISDN_PRI_SwitchwriteHelper.priindication_StopToken = "\n";

        theAudio_Quality_Tuning_OptionswriteHelper = new Audio_Quality_Tuning_OptionswriteHelper();
        theAudio_Quality_Tuning_OptionswriteHelper.relaxdtmf_StartToken = "relaxdtmf=";
        theAudio_Quality_Tuning_OptionswriteHelper.relaxdtmf_StopToken = "\n";
        theAudio_Quality_Tuning_OptionswriteHelper.echocancel_StartToken = "echocancel=";
        theAudio_Quality_Tuning_OptionswriteHelper.echocancel_StopToken = "\n";
        theAudio_Quality_Tuning_OptionswriteHelper.echocancelwhenbridged_StartToken = "echocancelwhenbridged=";
        theAudio_Quality_Tuning_OptionswriteHelper.echocancelwhenbridged_StopToken = "\n";
        theAudio_Quality_Tuning_OptionswriteHelper.echotraining_StartToken = "echotraining=";
        theAudio_Quality_Tuning_OptionswriteHelper.echotraining_StopToken = "\n";
        theAudio_Quality_Tuning_OptionswriteHelper.rxgain_StartToken = "rxgain=";
        theAudio_Quality_Tuning_OptionswriteHelper.rxgain_StopToken = "\n";
        theAudio_Quality_Tuning_OptionswriteHelper.txgain_StartToken = "txgain=";
        theAudio_Quality_Tuning_OptionswriteHelper.txgain_StopToken = "\n";

        theCaller_ID_OptionswriteHelper = new Caller_ID_OptionswriteHelper();
        theCaller_ID_OptionswriteHelper.callerid_StartToken = "callerid=";
        theCaller_ID_OptionswriteHelper.callerid_StopToken = "\n";
        theCaller_ID_OptionswriteHelper.usecallerid_StartToken = "usecallerid=";
        theCaller_ID_OptionswriteHelper.usecallerid_StopToken = "\n";
        theCaller_ID_OptionswriteHelper.hidecallerid_StartToken = "hidecallerid=";
        theCaller_ID_OptionswriteHelper.hidecallerid_StopToken = "\n";
        theCaller_ID_OptionswriteHelper.restrictcid_StartToken = "restrictcid=";
        theCaller_ID_OptionswriteHelper.restrictcid_StopToken = "\n";
        theCaller_ID_OptionswriteHelper.usecallingpres_StartToken = "usecallingpres=";
        theCaller_ID_OptionswriteHelper.usecallingpres_StopToken = "\n";

        theOtherwriteHelper = new OtherwriteHelper();
        theOtherwriteHelper.mailbox_StartToken = "mailbox=";
        theOtherwriteHelper.mailbox_StopToken = "\n";
        theOtherwriteHelper.group_StartToken = "group=";
        theOtherwriteHelper.group_StopToken = "\n";
        theOtherwriteHelper.language_StartToken = "language=";
        theOtherwriteHelper.language_StopToken = "\n";

        theMultilink_PPPwriteHelper = new Multilink_PPPwriteHelper();
        theMultilink_PPPwriteHelper.minunused_StartToken = "minunused=";
        theMultilink_PPPwriteHelper.minunused_StopToken = "\n";
        theMultilink_PPPwriteHelper.minidle_StartToken = "minidle=";
        theMultilink_PPPwriteHelper.minidle_StopToken = "\n";
        theMultilink_PPPwriteHelper.idledial_StartToken = "idledial=";
        theMultilink_PPPwriteHelper.idledial_StopToken = "\n";
        theMultilink_PPPwriteHelper.idleext_StartToken = "idleext=";
        theMultilink_PPPwriteHelper.idleext_StopToken = "\n";

        theCall_Logging_OptionswriteHelper = new Call_Logging_OptionswriteHelper();
        theCall_Logging_OptionswriteHelper.accountcode_StartToken = "accountcode=";
        theCall_Logging_OptionswriteHelper.accountcode_StopToken = "\n";
        theCall_Logging_OptionswriteHelper.amaflags_StartToken = "amaflags=";
        theCall_Logging_OptionswriteHelper.amaflags_StopToken = "\n";

    }

    /**
     * schreibt ein Zapataconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapataconf(StringBuffer strB, Zapataconf impl) {
        strB.append(";Zapata config config generated by jact\n");
        writeComment(strB, impl);
        writeSecHeader(strB, ConfReaderImpl.CHANNEL);

        super.writeZapataconf(strB, impl);

    }

    /**
     * schreibt ein Analog_Handset_Features Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Handset_Features(StringBuffer strB,
            Analog_Handset_Features impl) {
        super.writeAnalog_Handset_Features(strB, impl);

    }

    /**
     * schreibt ein Timing_Parameters Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeTiming_Parameters(StringBuffer strB,
            Timing_Parameters impl) {
        super.writeTiming_Parameters(strB, impl);

    }

    /**
     * schreibt ein Zaptelchannel Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannel(StringBuffer strB, Zaptelchannel impl) {
        writeZaptelchannelAggregates(strB, impl);
        writeZaptelchannelFields(strB, impl);
        writeEmtypLine(strB);
    }

    /**
     * schreibt ein Analog_Trunk_Features Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Trunk_Features(StringBuffer strB,
            Analog_Trunk_Features impl) {
        super.writeAnalog_Trunk_Features(strB, impl);

    }

    /**
     * schreibt ein ISDN_PRI_Switch Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeISDN_PRI_Switch(StringBuffer strB, ISDN_PRI_Switch impl) {
        super.writeISDN_PRI_Switch(strB, impl);

    }

    /**
     * schreibt ein Audio_Quality_Tuning_Options Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAudio_Quality_Tuning_Options(StringBuffer strB,
            Audio_Quality_Tuning_Options impl) {
        super.writeAudio_Quality_Tuning_Options(strB, impl);

    }

    /**
     * schreibt ein Caller_ID_Options Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeCaller_ID_Options(StringBuffer strB,
            Caller_ID_Options impl) {
        super.writeCaller_ID_Options(strB, impl);

    }

    /**
     * schreibt ein Other Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeOther(StringBuffer strB, Other impl) {
        super.writeOther(strB, impl);

    }

    /**
     * schreibt ein Multilink_PPP Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMultilink_PPP(StringBuffer strB, Multilink_PPP impl) {
        super.writeMultilink_PPP(strB, impl);

    }

    /**
     * schreibt ein Call_Logging_Options Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeCall_Logging_Options(StringBuffer strB,
            Call_Logging_Options impl) {
        super.writeCall_Logging_Options(strB, impl);

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
