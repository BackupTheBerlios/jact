/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
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
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.9 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class ZapataconfwriteHelper {

    }; // end of ZapataconfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Analog_Handset_FeatureswriteHelper {

        public String adsi_StartToken;

        public String adsi_StopToken;

        public void writeadsi(StringBuffer strB, Analog_Handset_Features impl) {
            if (impl.getAdsi() != null && adsi_StartToken != null) {
                strB.append(adsi_StartToken).append(impl.getAdsi()).append(
                        adsi_StopToken);
            }
        }

        public String immediate_StartToken;

        public String immediate_StopToken;

        public void writeimmediate(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getImmediate() != null && immediate_StartToken != null) {
                strB.append(immediate_StartToken).append(impl.getImmediate())
                        .append(immediate_StopToken);
            }
        }

        public String callwaiting_StartToken;

        public String callwaiting_StopToken;

        public void writecallwaiting(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getCallwaiting() != null && callwaiting_StartToken != null) {
                strB.append(callwaiting_StartToken).append(
                        impl.getCallwaiting()).append(callwaiting_StopToken);
            }
        }

        public String callwaitingcallerid_StartToken;

        public String callwaitingcallerid_StopToken;

        public void writecallwaitingcallerid(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getCallwaitingcallerid() != null
                    && callwaitingcallerid_StartToken != null) {
                strB.append(callwaitingcallerid_StartToken).append(
                        impl.getCallwaitingcallerid()).append(
                        callwaitingcallerid_StopToken);
            }
        }

        public String threewaycalling_StartToken;

        public String threewaycalling_StopToken;

        public void writethreewaycalling(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getThreewaycalling() != null
                    && threewaycalling_StartToken != null) {
                strB.append(threewaycalling_StartToken).append(
                        impl.getThreewaycalling()).append(
                        threewaycalling_StopToken);
            }
        }

        public String transfer_StartToken;

        public String transfer_StopToken;

        public void writetransfer(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getTransfer() != null && transfer_StartToken != null) {
                strB.append(transfer_StartToken).append(impl.getTransfer())
                        .append(transfer_StopToken);
            }
        }

        public String cancallforward_StartToken;

        public String cancallforward_StopToken;

        public void writecancallforward(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getCancallforward() != null
                    && cancallforward_StartToken != null) {
                strB.append(cancallforward_StartToken).append(
                        impl.getCancallforward()).append(
                        cancallforward_StopToken);
            }
        }

        public String callreturn_StartToken;

        public String callreturn_StopToken;

        public void writecallreturn(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getCallreturn() != null && callreturn_StartToken != null) {
                strB.append(callreturn_StartToken).append(impl.getCallreturn())
                        .append(callreturn_StopToken);
            }
        }

        public String callgroup_StartToken;

        public String callgroup_StopToken;

        public void writecallgroup(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getCallgroup() != null && callgroup_StartToken != null) {
                strB.append(callgroup_StartToken).append(impl.getCallgroup())
                        .append(callgroup_StopToken);
            }
        }

        public String pickupgroup_StartToken;

        public String pickupgroup_StopToken;

        public void writepickupgroup(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getPickupgroup() != null && pickupgroup_StartToken != null) {
                strB.append(pickupgroup_StartToken).append(
                        impl.getPickupgroup()).append(pickupgroup_StopToken);
            }
        }

        public String useincomingcalleridonzaptransfer_StartToken;

        public String useincomingcalleridonzaptransfer_StopToken;

        public void writeuseincomingcalleridonzaptransfer(StringBuffer strB,
                Analog_Handset_Features impl) {
            if (impl.getUseincomingcalleridonzaptransfer() != null
                    && useincomingcalleridonzaptransfer_StartToken != null) {
                strB.append(useincomingcalleridonzaptransfer_StartToken)
                        .append(impl.getUseincomingcalleridonzaptransfer())
                        .append(useincomingcalleridonzaptransfer_StopToken);
            }
        }
    }; // end of Analog_Handset_FeatureswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Timing_ParameterswriteHelper {

        public String prewink_StartToken;

        public String prewink_StopToken;

        public void writeprewink(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getPrewink() != null && prewink_StartToken != null) {
                strB.append(prewink_StartToken).append(impl.getPrewink())
                        .append(prewink_StopToken);
            }
        }

        public String preflash_StartToken;

        public String preflash_StopToken;

        public void writepreflash(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getPreflash() != null && preflash_StartToken != null) {
                strB.append(preflash_StartToken).append(impl.getPreflash())
                        .append(preflash_StopToken);
            }
        }

        public String wink_StartToken;

        public String wink_StopToken;

        public void writewink(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getWink() != null && wink_StartToken != null) {
                strB.append(wink_StartToken).append(impl.getWink()).append(
                        wink_StopToken);
            }
        }

        public String rxwink_StartToken;

        public String rxwink_StopToken;

        public void writerxwink(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getRxwink() != null && rxwink_StartToken != null) {
                strB.append(rxwink_StartToken).append(impl.getRxwink()).append(
                        rxwink_StopToken);
            }
        }

        public String rxflash_StartToken;

        public String rxflash_StopToken;

        public void writerxflash(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getRxflash() != null && rxflash_StartToken != null) {
                strB.append(rxflash_StartToken).append(impl.getRxflash())
                        .append(rxflash_StopToken);
            }
        }

        public String flash_StartToken;

        public String flash_StopToken;

        public void writeflash(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getFlash() != null && flash_StartToken != null) {
                strB.append(flash_StartToken).append(impl.getFlash()).append(
                        flash_StopToken);
            }
        }

        public String start_StartToken;

        public String start_StopToken;

        public void writestart(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getStart() != null && start_StartToken != null) {
                strB.append(start_StartToken).append(impl.getStart()).append(
                        start_StopToken);
            }
        }

        public String debounce_StartToken;

        public String debounce_StopToken;

        public void writedebounce(StringBuffer strB, Timing_Parameters impl) {
            if (impl.getDebounce() != null && debounce_StartToken != null) {
                strB.append(debounce_StartToken).append(impl.getDebounce())
                        .append(debounce_StopToken);
            }
        }
    }; // end of Timing_ParameterswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ZaptelchannelwriteHelper {

        public String signalling_StartToken;

        public String signalling_StopToken;

        public void writesignalling(StringBuffer strB, Zaptelchannel impl) {
            if (impl.getSignalling() != null && signalling_StartToken != null) {
                strB.append(signalling_StartToken).append(impl.getSignalling())
                        .append(signalling_StopToken);
            }
        }

        public String context_StartToken;

        public String context_StopToken;

        public void writecontext(StringBuffer strB, Zaptelchannel impl) {
            if (impl.getContext() != null && context_StartToken != null) {
                strB.append(context_StartToken).append(impl.getContext())
                        .append(context_StopToken);
            }
        }

        public String channel_StartToken;

        public String channel_StopToken;

        public void writechannel(StringBuffer strB, Zaptelchannel impl) {
            if (impl.getChannel() != null && channel_StartToken != null) {
                strB.append(channel_StartToken).append(impl.getChannel())
                        .append(channel_StopToken);
            }
        }
    }; // end of ZaptelchannelwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Analog_Trunk_FeatureswriteHelper {

        public String usedistinctiveringdetection_StartToken;

        public String usedistinctiveringdetection_StopToken;

        public void writeusedistinctiveringdetection(StringBuffer strB,
                Analog_Trunk_Features impl) {
            if (impl.getUsedistinctiveringdetection() != null
                    && usedistinctiveringdetection_StartToken != null) {
                strB.append(usedistinctiveringdetection_StartToken).append(
                        impl.getUsedistinctiveringdetection()).append(
                        usedistinctiveringdetection_StopToken);
            }
        }

        public String dring1_StartToken;

        public String dring1_StopToken;

        public void writedring1(StringBuffer strB, Analog_Trunk_Features impl) {
            if (impl.getDring1() != null && dring1_StartToken != null) {
                strB.append(dring1_StartToken).append(impl.getDring1()).append(
                        dring1_StopToken);
            }
        }

        public String dring2_StartToken;

        public String dring2_StopToken;

        public void writedring2(StringBuffer strB, Analog_Trunk_Features impl) {
            if (impl.getDring2() != null && dring2_StartToken != null) {
                strB.append(dring2_StartToken).append(impl.getDring2()).append(
                        dring2_StopToken);
            }
        }

        public String dring3_StartToken;

        public String dring3_StopToken;

        public void writedring3(StringBuffer strB, Analog_Trunk_Features impl) {
            if (impl.getDring3() != null && dring3_StartToken != null) {
                strB.append(dring3_StartToken).append(impl.getDring3()).append(
                        dring3_StopToken);
            }
        }

        public String dring1context_StartToken;

        public String dring1context_StopToken;

        public void writedring1context(StringBuffer strB,
                Analog_Trunk_Features impl) {
            if (impl.getDring1context() != null
                    && dring1context_StartToken != null) {
                strB.append(dring1context_StartToken).append(
                        impl.getDring1context())
                        .append(dring1context_StopToken);
            }
        }

        public String dring2context_StartToken;

        public String dring2context_StopToken;

        public void writedring2context(StringBuffer strB,
                Analog_Trunk_Features impl) {
            if (impl.getDring2context() != null
                    && dring2context_StartToken != null) {
                strB.append(dring2context_StartToken).append(
                        impl.getDring2context())
                        .append(dring2context_StopToken);
            }
        }

        public String dring3context_StartToken;

        public String dring3context_StopToken;

        public void writedring3context(StringBuffer strB,
                Analog_Trunk_Features impl) {
            if (impl.getDring3context() != null
                    && dring3context_StartToken != null) {
                strB.append(dring3context_StartToken).append(
                        impl.getDring3context())
                        .append(dring3context_StopToken);
            }
        }

        public String busydetect_StartToken;

        public String busydetect_StopToken;

        public void writebusydetect(StringBuffer strB,
                Analog_Trunk_Features impl) {
            if (impl.getBusydetect() != null && busydetect_StartToken != null) {
                strB.append(busydetect_StartToken).append(impl.getBusydetect())
                        .append(busydetect_StopToken);
            }
        }

        public String busycount_StartToken;

        public String busycount_StopToken;

        public void writebusycount(StringBuffer strB, Analog_Trunk_Features impl) {
            if (impl.getBusycount() != null && busycount_StartToken != null) {
                strB.append(busycount_StartToken).append(impl.getBusycount())
                        .append(busycount_StopToken);
            }
        }

        public String callprogress_StartToken;

        public String callprogress_StopToken;

        public void writecallprogress(StringBuffer strB,
                Analog_Trunk_Features impl) {
            if (impl.getCallprogress() != null
                    && callprogress_StartToken != null) {
                strB.append(callprogress_StartToken).append(
                        impl.getCallprogress()).append(callprogress_StopToken);
            }
        }

        public String pulse_StartToken;

        public String pulse_StopToken;

        public void writepulse(StringBuffer strB, Analog_Trunk_Features impl) {
            if (impl.getPulse() != null && pulse_StartToken != null) {
                strB.append(pulse_StartToken).append(impl.getPulse()).append(
                        pulse_StopToken);
            }
        }
    }; // end of Analog_Trunk_FeatureswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class ISDN_PRI_SwitchwriteHelper {

        public String switchtype_StartToken;

        public String switchtype_StopToken;

        public void writeswitchtype(StringBuffer strB, ISDN_PRI_Switch impl) {
            if (impl.getSwitchtype() != null && switchtype_StartToken != null) {
                strB.append(switchtype_StartToken).append(impl.getSwitchtype())
                        .append(switchtype_StopToken);
            }
        }

        public String overlapdial_StartToken;

        public String overlapdial_StopToken;

        public void writeoverlapdial(StringBuffer strB, ISDN_PRI_Switch impl) {
            if (impl.getOverlapdial() != null && overlapdial_StartToken != null) {
                strB.append(overlapdial_StartToken).append(
                        impl.getOverlapdial()).append(overlapdial_StopToken);
            }
        }

        public String pridialplan_StartToken;

        public String pridialplan_StopToken;

        public void writepridialplan(StringBuffer strB, ISDN_PRI_Switch impl) {
            if (impl.getPridialplan() != null && pridialplan_StartToken != null) {
                strB.append(pridialplan_StartToken).append(
                        impl.getPridialplan()).append(pridialplan_StopToken);
            }
        }

        public String priindication_StartToken;

        public String priindication_StopToken;

        public void writepriindication(StringBuffer strB, ISDN_PRI_Switch impl) {
            if (impl.getPriindication() != null
                    && priindication_StartToken != null) {
                strB.append(priindication_StartToken).append(
                        impl.getPriindication())
                        .append(priindication_StopToken);
            }
        }
    }; // end of ISDN_PRI_SwitchwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Audio_Quality_Tuning_OptionswriteHelper {

        public String relaxdtmf_StartToken;

        public String relaxdtmf_StopToken;

        public void writerelaxdtmf(StringBuffer strB,
                Audio_Quality_Tuning_Options impl) {
            if (impl.getRelaxdtmf() != null && relaxdtmf_StartToken != null) {
                strB.append(relaxdtmf_StartToken).append(impl.getRelaxdtmf())
                        .append(relaxdtmf_StopToken);
            }
        }

        public String echocancel_StartToken;

        public String echocancel_StopToken;

        public void writeechocancel(StringBuffer strB,
                Audio_Quality_Tuning_Options impl) {
            if (impl.getEchocancel() != null && echocancel_StartToken != null) {
                strB.append(echocancel_StartToken).append(impl.getEchocancel())
                        .append(echocancel_StopToken);
            }
        }

        public String echocancelwhenbridged_StartToken;

        public String echocancelwhenbridged_StopToken;

        public void writeechocancelwhenbridged(StringBuffer strB,
                Audio_Quality_Tuning_Options impl) {
            if (impl.getEchocancelwhenbridged() != null
                    && echocancelwhenbridged_StartToken != null) {
                strB.append(echocancelwhenbridged_StartToken).append(
                        impl.getEchocancelwhenbridged()).append(
                        echocancelwhenbridged_StopToken);
            }
        }

        public String echotraining_StartToken;

        public String echotraining_StopToken;

        public void writeechotraining(StringBuffer strB,
                Audio_Quality_Tuning_Options impl) {
            if (impl.getEchotraining() != null
                    && echotraining_StartToken != null) {
                strB.append(echotraining_StartToken).append(
                        impl.getEchotraining()).append(echotraining_StopToken);
            }
        }

        public String rxgain_StartToken;

        public String rxgain_StopToken;

        public void writerxgain(StringBuffer strB,
                Audio_Quality_Tuning_Options impl) {
            if (impl.getRxgain() != null && rxgain_StartToken != null) {
                strB.append(rxgain_StartToken).append(impl.getRxgain()).append(
                        rxgain_StopToken);
            }
        }

        public String txgain_StartToken;

        public String txgain_StopToken;

        public void writetxgain(StringBuffer strB,
                Audio_Quality_Tuning_Options impl) {
            if (impl.getTxgain() != null && txgain_StartToken != null) {
                strB.append(txgain_StartToken).append(impl.getTxgain()).append(
                        txgain_StopToken);
            }
        }
    }; // end of Audio_Quality_Tuning_OptionswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Caller_ID_OptionswriteHelper {

        public String callerid_StartToken;

        public String callerid_StopToken;

        public void writecallerid(StringBuffer strB, Caller_ID_Options impl) {
            if (impl.getCallerid() != null && callerid_StartToken != null) {
                strB.append(callerid_StartToken).append(impl.getCallerid())
                        .append(callerid_StopToken);
            }
        }

        public String usecallerid_StartToken;

        public String usecallerid_StopToken;

        public void writeusecallerid(StringBuffer strB, Caller_ID_Options impl) {
            if (impl.getUsecallerid() != null && usecallerid_StartToken != null) {
                strB.append(usecallerid_StartToken).append(
                        impl.getUsecallerid()).append(usecallerid_StopToken);
            }
        }

        public String hidecallerid_StartToken;

        public String hidecallerid_StopToken;

        public void writehidecallerid(StringBuffer strB, Caller_ID_Options impl) {
            if (impl.getHidecallerid() != null
                    && hidecallerid_StartToken != null) {
                strB.append(hidecallerid_StartToken).append(
                        impl.getHidecallerid()).append(hidecallerid_StopToken);
            }
        }

        public String restrictcid_StartToken;

        public String restrictcid_StopToken;

        public void writerestrictcid(StringBuffer strB, Caller_ID_Options impl) {
            if (impl.getRestrictcid() != null && restrictcid_StartToken != null) {
                strB.append(restrictcid_StartToken).append(
                        impl.getRestrictcid()).append(restrictcid_StopToken);
            }
        }

        public String usecallingpres_StartToken;

        public String usecallingpres_StopToken;

        public void writeusecallingpres(StringBuffer strB,
                Caller_ID_Options impl) {
            if (impl.getUsecallingpres() != null
                    && usecallingpres_StartToken != null) {
                strB.append(usecallingpres_StartToken).append(
                        impl.getUsecallingpres()).append(
                        usecallingpres_StopToken);
            }
        }
    }; // end of Caller_ID_OptionswriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class OtherwriteHelper {

        public String mailbox_StartToken;

        public String mailbox_StopToken;

        public void writemailbox(StringBuffer strB, Other impl) {
            if (impl.getMailbox() != null && mailbox_StartToken != null) {
                strB.append(mailbox_StartToken).append(impl.getMailbox())
                        .append(mailbox_StopToken);
            }
        }

        public String group_StartToken;

        public String group_StopToken;

        public void writegroup(StringBuffer strB, Other impl) {
            if (impl.getGroup() != null && group_StartToken != null) {
                strB.append(group_StartToken).append(impl.getGroup()).append(
                        group_StopToken);
            }
        }

        public String language_StartToken;

        public String language_StopToken;

        public void writelanguage(StringBuffer strB, Other impl) {
            if (impl.getLanguage() != null && language_StartToken != null) {
                strB.append(language_StartToken).append(impl.getLanguage())
                        .append(language_StopToken);
            }
        }
    }; // end of OtherwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Multilink_PPPwriteHelper {

        public String minunused_StartToken;

        public String minunused_StopToken;

        public void writeminunused(StringBuffer strB, Multilink_PPP impl) {
            if (impl.getMinunused() != null && minunused_StartToken != null) {
                strB.append(minunused_StartToken).append(impl.getMinunused())
                        .append(minunused_StopToken);
            }
        }

        public String minidle_StartToken;

        public String minidle_StopToken;

        public void writeminidle(StringBuffer strB, Multilink_PPP impl) {
            if (impl.getMinidle() != null && minidle_StartToken != null) {
                strB.append(minidle_StartToken).append(impl.getMinidle())
                        .append(minidle_StopToken);
            }
        }

        public String idledial_StartToken;

        public String idledial_StopToken;

        public void writeidledial(StringBuffer strB, Multilink_PPP impl) {
            if (impl.getIdledial() != null && idledial_StartToken != null) {
                strB.append(idledial_StartToken).append(impl.getIdledial())
                        .append(idledial_StopToken);
            }
        }

        public String idleext_StartToken;

        public String idleext_StopToken;

        public void writeidleext(StringBuffer strB, Multilink_PPP impl) {
            if (impl.getIdleext() != null && idleext_StartToken != null) {
                strB.append(idleext_StartToken).append(impl.getIdleext())
                        .append(idleext_StopToken);
            }
        }
    }; // end of Multilink_PPPwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class Call_Logging_OptionswriteHelper {

        public String accountcode_StartToken;

        public String accountcode_StopToken;

        public void writeaccountcode(StringBuffer strB,
                Call_Logging_Options impl) {
            if (impl.getAccountcode() != null && accountcode_StartToken != null) {
                strB.append(accountcode_StartToken).append(
                        impl.getAccountcode()).append(accountcode_StopToken);
            }
        }

        public String amaflags_StartToken;

        public String amaflags_StopToken;

        public void writeamaflags(StringBuffer strB, Call_Logging_Options impl) {
            if (impl.getAmaflags() != null && amaflags_StartToken != null) {
                strB.append(amaflags_StartToken).append(impl.getAmaflags())
                        .append(amaflags_StopToken);
            }
        }
    }; // end of Call_Logging_OptionswriteHelper Declaration

    protected ZapataconfwriteHelper theZapataconfwriteHelper;

    protected Analog_Handset_FeatureswriteHelper theAnalog_Handset_FeatureswriteHelper;

    protected Timing_ParameterswriteHelper theTiming_ParameterswriteHelper;

    protected ZaptelchannelwriteHelper theZaptelchannelwriteHelper;

    protected Analog_Trunk_FeatureswriteHelper theAnalog_Trunk_FeatureswriteHelper;

    protected ISDN_PRI_SwitchwriteHelper theISDN_PRI_SwitchwriteHelper;

    protected Audio_Quality_Tuning_OptionswriteHelper theAudio_Quality_Tuning_OptionswriteHelper;

    protected Caller_ID_OptionswriteHelper theCaller_ID_OptionswriteHelper;

    protected OtherwriteHelper theOtherwriteHelper;

    protected Multilink_PPPwriteHelper theMultilink_PPPwriteHelper;

    protected Call_Logging_OptionswriteHelper theCall_Logging_OptionswriteHelper;

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
        if (data instanceof Zapataconf) {
            writeZapataconf(strB, (Zapataconf) data);
            return;
        }
        if (data instanceof Analog_Handset_Features) {
            writeAnalog_Handset_Features(strB, (Analog_Handset_Features) data);
            return;
        }
        if (data instanceof Timing_Parameters) {
            writeTiming_Parameters(strB, (Timing_Parameters) data);
            return;
        }
        if (data instanceof Zaptelchannel) {
            writeZaptelchannel(strB, (Zaptelchannel) data);
            return;
        }
        if (data instanceof Analog_Trunk_Features) {
            writeAnalog_Trunk_Features(strB, (Analog_Trunk_Features) data);
            return;
        }
        if (data instanceof ISDN_PRI_Switch) {
            writeISDN_PRI_Switch(strB, (ISDN_PRI_Switch) data);
            return;
        }
        if (data instanceof Audio_Quality_Tuning_Options) {
            writeAudio_Quality_Tuning_Options(strB,
                    (Audio_Quality_Tuning_Options) data);
            return;
        }
        if (data instanceof Caller_ID_Options) {
            writeCaller_ID_Options(strB, (Caller_ID_Options) data);
            return;
        }
        if (data instanceof Other) {
            writeOther(strB, (Other) data);
            return;
        }
        if (data instanceof Multilink_PPP) {
            writeMultilink_PPP(strB, (Multilink_PPP) data);
            return;
        }
        if (data instanceof Call_Logging_Options) {
            writeCall_Logging_Options(strB, (Call_Logging_Options) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Zapataconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapataconfFields(StringBuffer strB, Zapataconf impl) {

        // felder schreiben

    }

    /**
     * schreibt die Aggregierten Objekte von Zapataconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapataconfAggregates(StringBuffer strB, Zapataconf impl) {

        // aggregate schreiben
        // maps schreiben
        // ZaptelchannelMap
        for (Iterator iter = impl.getZaptelchannelMap().iterator(); iter
                .hasNext();) {
            Zaptelchannel mobj = (Zaptelchannel) iter.next();
            writeZaptelchannel(strB, mobj);
        }

    }

    /**
     * schreibt ein Zapataconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZapataconf(StringBuffer strB, Zapataconf impl) {
        writeZapataconfFields(strB, impl);
        writeZapataconfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Analog_Handset_Features
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Handset_FeaturesFields(StringBuffer strB,
            Analog_Handset_Features impl) {

        // felder schreiben
        theAnalog_Handset_FeatureswriteHelper.writeadsi(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writeimmediate(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writecallwaiting(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writecallwaitingcallerid(strB,
                impl);
        theAnalog_Handset_FeatureswriteHelper.writethreewaycalling(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writetransfer(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writecancallforward(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writecallreturn(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writecallgroup(strB, impl);
        theAnalog_Handset_FeatureswriteHelper.writepickupgroup(strB, impl);
        theAnalog_Handset_FeatureswriteHelper
                .writeuseincomingcalleridonzaptransfer(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Analog_Handset_Features
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Handset_FeaturesAggregates(StringBuffer strB,
            Analog_Handset_Features impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Analog_Handset_Features Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Handset_Features(StringBuffer strB,
            Analog_Handset_Features impl) {
        writeAnalog_Handset_FeaturesFields(strB, impl);
        writeAnalog_Handset_FeaturesAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Timing_Parameters
     * 
     * @param strB
     * @param msec
     */
    protected void writeTiming_ParametersFields(StringBuffer strB,
            Timing_Parameters impl) {

        // felder schreiben
        theTiming_ParameterswriteHelper.writeprewink(strB, impl);
        theTiming_ParameterswriteHelper.writepreflash(strB, impl);
        theTiming_ParameterswriteHelper.writewink(strB, impl);
        theTiming_ParameterswriteHelper.writerxwink(strB, impl);
        theTiming_ParameterswriteHelper.writerxflash(strB, impl);
        theTiming_ParameterswriteHelper.writeflash(strB, impl);
        theTiming_ParameterswriteHelper.writestart(strB, impl);
        theTiming_ParameterswriteHelper.writedebounce(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Timing_Parameters
     * 
     * @param strB
     * @param msec
     */
    protected void writeTiming_ParametersAggregates(StringBuffer strB,
            Timing_Parameters impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Timing_Parameters Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeTiming_Parameters(StringBuffer strB,
            Timing_Parameters impl) {
        writeTiming_ParametersFields(strB, impl);
        writeTiming_ParametersAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Zaptelchannel
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannelFields(StringBuffer strB,
            Zaptelchannel impl) {

        // felder schreiben
        theZaptelchannelwriteHelper.writesignalling(strB, impl);
        theZaptelchannelwriteHelper.writecontext(strB, impl);
        theZaptelchannelwriteHelper.writechannel(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Zaptelchannel
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannelAggregates(StringBuffer strB,
            Zaptelchannel impl) {

        // aggregate schreiben
        // Analog_Handset_Features
        writeAnalog_Handset_Features(strB, impl.getAnalog_Handset_Features());
        // Analog_Trunk_Features
        writeAnalog_Trunk_Features(strB, impl.getAnalog_Trunk_Features());
        // Audio_Quality_Tuning_Options
        writeAudio_Quality_Tuning_Options(strB, impl
                .getAudio_Quality_Tuning_Options());
        // Call_Logging_Options
        writeCall_Logging_Options(strB, impl.getCall_Logging_Options());
        // Caller_ID_Options
        writeCaller_ID_Options(strB, impl.getCaller_ID_Options());
        // ISDN_PRI_Switch
        writeISDN_PRI_Switch(strB, impl.getISDN_PRI_Switch());
        // Other
        writeOther(strB, impl.getOther());
        // Timing_Parameters
        writeTiming_Parameters(strB, impl.getTiming_Parameters());
        // maps schreiben

    }

    /**
     * schreibt ein Zaptelchannel Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeZaptelchannel(StringBuffer strB, Zaptelchannel impl) {
        writeZaptelchannelFields(strB, impl);
        writeZaptelchannelAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Analog_Trunk_Features
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Trunk_FeaturesFields(StringBuffer strB,
            Analog_Trunk_Features impl) {

        // felder schreiben
        theAnalog_Trunk_FeatureswriteHelper.writeusedistinctiveringdetection(
                strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writedring1(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writedring2(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writedring3(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writedring1context(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writedring2context(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writedring3context(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writebusydetect(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writebusycount(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writecallprogress(strB, impl);
        theAnalog_Trunk_FeatureswriteHelper.writepulse(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Analog_Trunk_Features
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Trunk_FeaturesAggregates(StringBuffer strB,
            Analog_Trunk_Features impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Analog_Trunk_Features Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAnalog_Trunk_Features(StringBuffer strB,
            Analog_Trunk_Features impl) {
        writeAnalog_Trunk_FeaturesFields(strB, impl);
        writeAnalog_Trunk_FeaturesAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von ISDN_PRI_Switch
     * 
     * @param strB
     * @param msec
     */
    protected void writeISDN_PRI_SwitchFields(StringBuffer strB,
            ISDN_PRI_Switch impl) {

        // felder schreiben
        theISDN_PRI_SwitchwriteHelper.writeswitchtype(strB, impl);
        theISDN_PRI_SwitchwriteHelper.writeoverlapdial(strB, impl);
        theISDN_PRI_SwitchwriteHelper.writepridialplan(strB, impl);
        theISDN_PRI_SwitchwriteHelper.writepriindication(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von ISDN_PRI_Switch
     * 
     * @param strB
     * @param msec
     */
    protected void writeISDN_PRI_SwitchAggregates(StringBuffer strB,
            ISDN_PRI_Switch impl) {

        // aggregate schreiben
        // Multilink_PPP
        writeMultilink_PPP(strB, impl.getMultilink_PPP());
        // maps schreiben

    }

    /**
     * schreibt ein ISDN_PRI_Switch Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeISDN_PRI_Switch(StringBuffer strB, ISDN_PRI_Switch impl) {
        writeISDN_PRI_SwitchFields(strB, impl);
        writeISDN_PRI_SwitchAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Audio_Quality_Tuning_Options
     * 
     * @param strB
     * @param msec
     */
    protected void writeAudio_Quality_Tuning_OptionsFields(StringBuffer strB,
            Audio_Quality_Tuning_Options impl) {

        // felder schreiben
        theAudio_Quality_Tuning_OptionswriteHelper.writerelaxdtmf(strB, impl);
        theAudio_Quality_Tuning_OptionswriteHelper.writeechocancel(strB, impl);
        theAudio_Quality_Tuning_OptionswriteHelper.writeechocancelwhenbridged(
                strB, impl);
        theAudio_Quality_Tuning_OptionswriteHelper
                .writeechotraining(strB, impl);
        theAudio_Quality_Tuning_OptionswriteHelper.writerxgain(strB, impl);
        theAudio_Quality_Tuning_OptionswriteHelper.writetxgain(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Audio_Quality_Tuning_Options
     * 
     * @param strB
     * @param msec
     */
    protected void writeAudio_Quality_Tuning_OptionsAggregates(
            StringBuffer strB, Audio_Quality_Tuning_Options impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Audio_Quality_Tuning_Options Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeAudio_Quality_Tuning_Options(StringBuffer strB,
            Audio_Quality_Tuning_Options impl) {
        writeAudio_Quality_Tuning_OptionsFields(strB, impl);
        writeAudio_Quality_Tuning_OptionsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Caller_ID_Options
     * 
     * @param strB
     * @param msec
     */
    protected void writeCaller_ID_OptionsFields(StringBuffer strB,
            Caller_ID_Options impl) {

        // felder schreiben
        theCaller_ID_OptionswriteHelper.writecallerid(strB, impl);
        theCaller_ID_OptionswriteHelper.writeusecallerid(strB, impl);
        theCaller_ID_OptionswriteHelper.writehidecallerid(strB, impl);
        theCaller_ID_OptionswriteHelper.writerestrictcid(strB, impl);
        theCaller_ID_OptionswriteHelper.writeusecallingpres(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Caller_ID_Options
     * 
     * @param strB
     * @param msec
     */
    protected void writeCaller_ID_OptionsAggregates(StringBuffer strB,
            Caller_ID_Options impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Caller_ID_Options Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeCaller_ID_Options(StringBuffer strB,
            Caller_ID_Options impl) {
        writeCaller_ID_OptionsFields(strB, impl);
        writeCaller_ID_OptionsAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Other
     * 
     * @param strB
     * @param msec
     */
    protected void writeOtherFields(StringBuffer strB, Other impl) {

        // felder schreiben
        theOtherwriteHelper.writemailbox(strB, impl);
        theOtherwriteHelper.writegroup(strB, impl);
        theOtherwriteHelper.writelanguage(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Other
     * 
     * @param strB
     * @param msec
     */
    protected void writeOtherAggregates(StringBuffer strB, Other impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Other Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeOther(StringBuffer strB, Other impl) {
        writeOtherFields(strB, impl);
        writeOtherAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Multilink_PPP
     * 
     * @param strB
     * @param msec
     */
    protected void writeMultilink_PPPFields(StringBuffer strB,
            Multilink_PPP impl) {

        // felder schreiben
        theMultilink_PPPwriteHelper.writeminunused(strB, impl);
        theMultilink_PPPwriteHelper.writeminidle(strB, impl);
        theMultilink_PPPwriteHelper.writeidledial(strB, impl);
        theMultilink_PPPwriteHelper.writeidleext(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Multilink_PPP
     * 
     * @param strB
     * @param msec
     */
    protected void writeMultilink_PPPAggregates(StringBuffer strB,
            Multilink_PPP impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Multilink_PPP Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeMultilink_PPP(StringBuffer strB, Multilink_PPP impl) {
        writeMultilink_PPPFields(strB, impl);
        writeMultilink_PPPAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Call_Logging_Options
     * 
     * @param strB
     * @param msec
     */
    protected void writeCall_Logging_OptionsFields(StringBuffer strB,
            Call_Logging_Options impl) {

        // felder schreiben
        theCall_Logging_OptionswriteHelper.writeaccountcode(strB, impl);
        theCall_Logging_OptionswriteHelper.writeamaflags(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Call_Logging_Options
     * 
     * @param strB
     * @param msec
     */
    protected void writeCall_Logging_OptionsAggregates(StringBuffer strB,
            Call_Logging_Options impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Call_Logging_Options Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeCall_Logging_Options(StringBuffer strB,
            Call_Logging_Options impl) {
        writeCall_Logging_OptionsFields(strB, impl);
        writeCall_Logging_OptionsAggregates(strB, impl);

    }

    protected void initHelper() {
        theZapataconfwriteHelper = new ZapataconfwriteHelper();

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
        theZaptelchannelwriteHelper.channel_StartToken = "channel=";
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

}
