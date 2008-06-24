/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import java.util.Iterator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.7 2006/01/09 10:17:34 urs
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
        if (data instanceof Zapataconf) {
            return writeZapataconf(doc, (Zapataconf) data);
        }
        if (data instanceof Analog_Handset_Features) {
            return writeAnalog_Handset_Features(doc,
                    (Analog_Handset_Features) data);
        }
        if (data instanceof Timing_Parameters) {
            return writeTiming_Parameters(doc, (Timing_Parameters) data);
        }
        if (data instanceof Zaptelchannel) {
            return writeZaptelchannel(doc, (Zaptelchannel) data);
        }
        if (data instanceof Analog_Trunk_Features) {
            return writeAnalog_Trunk_Features(doc, (Analog_Trunk_Features) data);
        }
        if (data instanceof ISDN_PRI_Switch) {
            return writeISDN_PRI_Switch(doc, (ISDN_PRI_Switch) data);
        }
        if (data instanceof Audio_Quality_Tuning_Options) {
            return writeAudio_Quality_Tuning_Options(doc,
                    (Audio_Quality_Tuning_Options) data);
        }
        if (data instanceof Caller_ID_Options) {
            return writeCaller_ID_Options(doc, (Caller_ID_Options) data);
        }
        if (data instanceof Other) {
            return writeOther(doc, (Other) data);
        }
        if (data instanceof Multilink_PPP) {
            return writeMultilink_PPP(doc, (Multilink_PPP) data);
        }
        if (data instanceof Call_Logging_Options) {
            return writeCall_Logging_Options(doc, (Call_Logging_Options) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZapataconf(Document doc, Zapataconf impl) {
        Element xZapataconf = doc.createElement("Zapataconf");

        // felder schreiben
        // aggregate schreiben

        // maps schreiben

        for (Iterator iter = impl.getZaptelchannelMap().iterator(); iter
                .hasNext();) {
            Zaptelchannel mobj = (Zaptelchannel) iter.next();

            Element xZaptelchannel = writeZaptelchannel(doc, mobj);
            xZapataconf.appendChild(xZaptelchannel);

        }
        doc.appendChild(xZapataconf);
        return xZapataconf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAnalog_Handset_Features(Document doc,
            Analog_Handset_Features impl) {
        Element xAnalog_Handset_Features = doc
                .createElement("Analog_Handset_Features");

        // felder schreiben
        if (impl.getAdsi() != null)
            xAnalog_Handset_Features.setAttribute("adsi", impl.getAdsi()
                    .toString());
        if (impl.getImmediate() != null)
            xAnalog_Handset_Features.setAttribute("immediate", impl
                    .getImmediate().toString());
        if (impl.getCallwaiting() != null)
            xAnalog_Handset_Features.setAttribute("callwaiting", impl
                    .getCallwaiting().toString());
        if (impl.getCallwaitingcallerid() != null)
            xAnalog_Handset_Features.setAttribute("callwaitingcallerid", impl
                    .getCallwaitingcallerid().toString());
        if (impl.getThreewaycalling() != null)
            xAnalog_Handset_Features.setAttribute("threewaycalling", impl
                    .getThreewaycalling().toString());
        if (impl.getTransfer() != null)
            xAnalog_Handset_Features.setAttribute("transfer", impl
                    .getTransfer().toString());
        if (impl.getCancallforward() != null)
            xAnalog_Handset_Features.setAttribute("cancallforward", impl
                    .getCancallforward().toString());
        if (impl.getCallreturn() != null)
            xAnalog_Handset_Features.setAttribute("callreturn", impl
                    .getCallreturn().toString());
        if (impl.getCallgroup() != null)
            xAnalog_Handset_Features.setAttribute("callgroup", impl
                    .getCallgroup().toString());
        if (impl.getPickupgroup() != null)
            xAnalog_Handset_Features.setAttribute("pickupgroup", impl
                    .getPickupgroup().toString());
        if (impl.getUseincomingcalleridonzaptransfer() != null)
            xAnalog_Handset_Features.setAttribute(
                    "useincomingcalleridonzaptransfer", impl
                            .getUseincomingcalleridonzaptransfer().toString());
        // aggregate schreiben

        doc.appendChild(xAnalog_Handset_Features);
        return xAnalog_Handset_Features;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeTiming_Parameters(Document doc,
            Timing_Parameters impl) {
        Element xTiming_Parameters = doc.createElement("Timing_Parameters");

        // felder schreiben
        if (impl.getPrewink() != null)
            xTiming_Parameters.setAttribute("prewink", impl.getPrewink()
                    .toString());
        if (impl.getPreflash() != null)
            xTiming_Parameters.setAttribute("preflash", impl.getPreflash()
                    .toString());
        if (impl.getWink() != null)
            xTiming_Parameters.setAttribute("wink", impl.getWink().toString());
        if (impl.getRxwink() != null)
            xTiming_Parameters.setAttribute("rxwink", impl.getRxwink()
                    .toString());
        if (impl.getRxflash() != null)
            xTiming_Parameters.setAttribute("rxflash", impl.getRxflash()
                    .toString());
        if (impl.getFlash() != null)
            xTiming_Parameters
                    .setAttribute("flash", impl.getFlash().toString());
        if (impl.getStart() != null)
            xTiming_Parameters
                    .setAttribute("start", impl.getStart().toString());
        if (impl.getDebounce() != null)
            xTiming_Parameters.setAttribute("debounce", impl.getDebounce()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xTiming_Parameters);
        return xTiming_Parameters;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeZaptelchannel(Document doc, Zaptelchannel impl) {
        Element xZaptelchannel = doc.createElement("Zaptelchannel");

        // felder schreiben
        if (impl.getSignalling() != null)
            xZaptelchannel.setAttribute("signalling", impl.getSignalling()
                    .toString());
        if (impl.getContext() != null)
            xZaptelchannel
                    .setAttribute("context", impl.getContext().toString());
        if (impl.getChannel() != null)
            xZaptelchannel
                    .setAttribute("channel", impl.getChannel().toString());
        // aggregate schreiben
        Element xAnalog_Handset_FeaturesAgg = writeAnalog_Handset_Features(doc,
                impl.getAnalog_Handset_Features());
        xZaptelchannel.appendChild(xAnalog_Handset_FeaturesAgg);
        Element xAnalog_Trunk_FeaturesAgg = writeAnalog_Trunk_Features(doc,
                impl.getAnalog_Trunk_Features());
        xZaptelchannel.appendChild(xAnalog_Trunk_FeaturesAgg);
        Element xAudio_Quality_Tuning_OptionsAgg = writeAudio_Quality_Tuning_Options(
                doc, impl.getAudio_Quality_Tuning_Options());
        xZaptelchannel.appendChild(xAudio_Quality_Tuning_OptionsAgg);
        Element xCall_Logging_OptionsAgg = writeCall_Logging_Options(doc, impl
                .getCall_Logging_Options());
        xZaptelchannel.appendChild(xCall_Logging_OptionsAgg);
        Element xCaller_ID_OptionsAgg = writeCaller_ID_Options(doc, impl
                .getCaller_ID_Options());
        xZaptelchannel.appendChild(xCaller_ID_OptionsAgg);
        Element xISDN_PRI_SwitchAgg = writeISDN_PRI_Switch(doc, impl
                .getISDN_PRI_Switch());
        xZaptelchannel.appendChild(xISDN_PRI_SwitchAgg);
        Element xOtherAgg = writeOther(doc, impl.getOther());
        xZaptelchannel.appendChild(xOtherAgg);
        Element xTiming_ParametersAgg = writeTiming_Parameters(doc, impl
                .getTiming_Parameters());
        xZaptelchannel.appendChild(xTiming_ParametersAgg);

        doc.appendChild(xZaptelchannel);
        return xZaptelchannel;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAnalog_Trunk_Features(Document doc,
            Analog_Trunk_Features impl) {
        Element xAnalog_Trunk_Features = doc
                .createElement("Analog_Trunk_Features");

        // felder schreiben
        if (impl.getUsedistinctiveringdetection() != null)
            xAnalog_Trunk_Features.setAttribute("usedistinctiveringdetection",
                    impl.getUsedistinctiveringdetection().toString());
        if (impl.getDring1() != null)
            xAnalog_Trunk_Features.setAttribute("dring1", impl.getDring1()
                    .toString());
        if (impl.getDring2() != null)
            xAnalog_Trunk_Features.setAttribute("dring2", impl.getDring2()
                    .toString());
        if (impl.getDring3() != null)
            xAnalog_Trunk_Features.setAttribute("dring3", impl.getDring3()
                    .toString());
        if (impl.getDring1context() != null)
            xAnalog_Trunk_Features.setAttribute("dring1context", impl
                    .getDring1context().toString());
        if (impl.getDring2context() != null)
            xAnalog_Trunk_Features.setAttribute("dring2context", impl
                    .getDring2context().toString());
        if (impl.getDring3context() != null)
            xAnalog_Trunk_Features.setAttribute("dring3context", impl
                    .getDring3context().toString());
        if (impl.getBusydetect() != null)
            xAnalog_Trunk_Features.setAttribute("busydetect", impl
                    .getBusydetect().toString());
        if (impl.getBusycount() != null)
            xAnalog_Trunk_Features.setAttribute("busycount", impl
                    .getBusycount().toString());
        if (impl.getCallprogress() != null)
            xAnalog_Trunk_Features.setAttribute("callprogress", impl
                    .getCallprogress().toString());
        if (impl.getPulse() != null)
            xAnalog_Trunk_Features.setAttribute("pulse", impl.getPulse()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xAnalog_Trunk_Features);
        return xAnalog_Trunk_Features;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeISDN_PRI_Switch(Document doc,
            ISDN_PRI_Switch impl) {
        Element xISDN_PRI_Switch = doc.createElement("ISDN_PRI_Switch");

        // felder schreiben
        if (impl.getSwitchtype() != null)
            xISDN_PRI_Switch.setAttribute("switchtype", impl.getSwitchtype()
                    .toString());
        if (impl.getOverlapdial() != null)
            xISDN_PRI_Switch.setAttribute("overlapdial", impl.getOverlapdial()
                    .toString());
        if (impl.getPridialplan() != null)
            xISDN_PRI_Switch.setAttribute("pridialplan", impl.getPridialplan()
                    .toString());
        if (impl.getPriindication() != null)
            xISDN_PRI_Switch.setAttribute("priindication", impl
                    .getPriindication().toString());
        // aggregate schreiben
        Element xMultilink_PPPAgg = writeMultilink_PPP(doc, impl
                .getMultilink_PPP());
        xISDN_PRI_Switch.appendChild(xMultilink_PPPAgg);

        doc.appendChild(xISDN_PRI_Switch);
        return xISDN_PRI_Switch;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeAudio_Quality_Tuning_Options(Document doc,
            Audio_Quality_Tuning_Options impl) {
        Element xAudio_Quality_Tuning_Options = doc
                .createElement("Audio_Quality_Tuning_Options");

        // felder schreiben
        if (impl.getRelaxdtmf() != null)
            xAudio_Quality_Tuning_Options.setAttribute("relaxdtmf", impl
                    .getRelaxdtmf().toString());
        if (impl.getEchocancel() != null)
            xAudio_Quality_Tuning_Options.setAttribute("echocancel", impl
                    .getEchocancel().toString());
        if (impl.getEchocancelwhenbridged() != null)
            xAudio_Quality_Tuning_Options.setAttribute("echocancelwhenbridged",
                    impl.getEchocancelwhenbridged().toString());
        if (impl.getEchotraining() != null)
            xAudio_Quality_Tuning_Options.setAttribute("echotraining", impl
                    .getEchotraining().toString());
        if (impl.getRxgain() != null)
            xAudio_Quality_Tuning_Options.setAttribute("rxgain", impl
                    .getRxgain().toString());
        if (impl.getTxgain() != null)
            xAudio_Quality_Tuning_Options.setAttribute("txgain", impl
                    .getTxgain().toString());
        // aggregate schreiben

        doc.appendChild(xAudio_Quality_Tuning_Options);
        return xAudio_Quality_Tuning_Options;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeCaller_ID_Options(Document doc,
            Caller_ID_Options impl) {
        Element xCaller_ID_Options = doc.createElement("Caller_ID_Options");

        // felder schreiben
        if (impl.getCallerid() != null)
            xCaller_ID_Options.setAttribute("callerid", impl.getCallerid()
                    .toString());
        if (impl.getUsecallerid() != null)
            xCaller_ID_Options.setAttribute("usecallerid", impl
                    .getUsecallerid().toString());
        if (impl.getHidecallerid() != null)
            xCaller_ID_Options.setAttribute("hidecallerid", impl
                    .getHidecallerid().toString());
        if (impl.getRestrictcid() != null)
            xCaller_ID_Options.setAttribute("restrictcid", impl
                    .getRestrictcid().toString());
        if (impl.getUsecallingpres() != null)
            xCaller_ID_Options.setAttribute("usecallingpres", impl
                    .getUsecallingpres().toString());
        // aggregate schreiben

        doc.appendChild(xCaller_ID_Options);
        return xCaller_ID_Options;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeOther(Document doc, Other impl) {
        Element xOther = doc.createElement("Other");

        // felder schreiben
        if (impl.getMailbox() != null)
            xOther.setAttribute("mailbox", impl.getMailbox().toString());
        if (impl.getGroup() != null)
            xOther.setAttribute("group", impl.getGroup().toString());
        if (impl.getLanguage() != null)
            xOther.setAttribute("language", impl.getLanguage().toString());
        // aggregate schreiben

        doc.appendChild(xOther);
        return xOther;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeMultilink_PPP(Document doc, Multilink_PPP impl) {
        Element xMultilink_PPP = doc.createElement("Multilink_PPP");

        // felder schreiben
        if (impl.getMinunused() != null)
            xMultilink_PPP.setAttribute("minunused", impl.getMinunused()
                    .toString());
        if (impl.getMinidle() != null)
            xMultilink_PPP
                    .setAttribute("minidle", impl.getMinidle().toString());
        if (impl.getIdledial() != null)
            xMultilink_PPP.setAttribute("idledial", impl.getIdledial()
                    .toString());
        if (impl.getIdleext() != null)
            xMultilink_PPP
                    .setAttribute("idleext", impl.getIdleext().toString());
        // aggregate schreiben

        doc.appendChild(xMultilink_PPP);
        return xMultilink_PPP;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeCall_Logging_Options(Document doc,
            Call_Logging_Options impl) {
        Element xCall_Logging_Options = doc
                .createElement("Call_Logging_Options");

        // felder schreiben
        if (impl.getAccountcode() != null)
            xCall_Logging_Options.setAttribute("accountcode", impl
                    .getAccountcode().toString());
        if (impl.getAmaflags() != null)
            xCall_Logging_Options.setAttribute("amaflags", impl.getAmaflags()
                    .toString());
        // aggregate schreiben

        doc.appendChild(xCall_Logging_Options);
        return xCall_Logging_Options;
    }
}
