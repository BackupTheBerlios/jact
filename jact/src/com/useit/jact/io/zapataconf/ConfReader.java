/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Signalling;
import com.useit.jact.model.types.Switchtype;
import com.useit.jact.model.zapataconf.Analog_Handset_Features;
import com.useit.jact.model.zapataconf.Analog_Handset_FeaturesImpl;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;
import com.useit.jact.model.zapataconf.Analog_Trunk_FeaturesImpl;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_OptionsImpl;
import com.useit.jact.model.zapataconf.Call_Logging_Options;
import com.useit.jact.model.zapataconf.Call_Logging_OptionsImpl;
import com.useit.jact.model.zapataconf.Caller_ID_Options;
import com.useit.jact.model.zapataconf.Caller_ID_OptionsImpl;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;
import com.useit.jact.model.zapataconf.ISDN_PRI_SwitchImpl;
import com.useit.jact.model.zapataconf.Multilink_PPP;
import com.useit.jact.model.zapataconf.Multilink_PPPImpl;
import com.useit.jact.model.zapataconf.Other;
import com.useit.jact.model.zapataconf.OtherImpl;
import com.useit.jact.model.zapataconf.Timing_Parameters;
import com.useit.jact.model.zapataconf.Timing_ParametersImpl;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.ZapataconfImpl;
import com.useit.jact.model.zapataconf.Zaptelchannel;
import com.useit.jact.model.zapataconf.ZaptelchannelImpl;

/**
 * <p>
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.8 2006/03/17 10:42:52 urs
 *          Exp $
 */
public class ConfReader extends AbstractConfReader {

    /**
     * 
     */
    public ConfReader() {
        super();
    }

    /**
     * ließt den file und bildet die Entrylist
     * 
     * @param file
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readConfFile(String file) throws FileNotFoundException,
            IOException {
        String content = readStringFromFile(new File(file), 500);
        buildEntryList(content);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZapataconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zapataconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zapataconf buildZapataconfModelElement(List aEntryList) {
        Zapataconf impl = new ZapataconfImpl();
        buildZapataconfModelVaues(aEntryList, impl);
        buildZapataconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZapataconfModelAgg(List entryList, Zapataconf impl) {

        // aggregate schreiben
        // maps schreiben
        // ZaptelchannelMap
        for (Iterator iter = impl.getZaptelchannelMap().iterator(); iter
                .hasNext();) {
            Zaptelchannel aZaptelchannelM = buildZaptelchannelModelElement(entryList);
            impl.addZaptelchannel(aZaptelchannelM);
            // Zaptelchannel mobj = (Zaptelchannel) iter.next();
            // writeZaptelchannel(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZapataconfModelVaues(List entryList, Zapataconf impl) {
        String val = null;
    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingAnalog_Handset_FeaturesEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Analog_Handset_Features objekt und ließt die entry list dafür
     * ein
     * 
     * @param aEntryList
     * @return
     */
    protected Analog_Handset_Features buildAnalog_Handset_FeaturesModelElement(
            List aEntryList) {
        Analog_Handset_Features impl = new Analog_Handset_FeaturesImpl();
        buildAnalog_Handset_FeaturesModelVaues(aEntryList, impl);
        buildAnalog_Handset_FeaturesModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAnalog_Handset_FeaturesModelAgg(List entryList,
            Analog_Handset_Features impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAnalog_Handset_FeaturesModelVaues(List entryList,
            Analog_Handset_Features impl) {
        String val = null;
        val = findConfValue("adsi", entryList);
        if (val != null)
            impl.setAdsi(val);

        val = findConfValue("immediate", entryList);
        if (val != null)
            impl.setImmediate(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("callwaiting", entryList);
        if (val != null)
            impl.setCallwaiting(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("callwaitingcallerid", entryList);
        if (val != null)
            impl
                    .setCallwaitingcallerid(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("threewaycalling", entryList);
        if (val != null)
            impl
                    .setThreewaycalling(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("transfer", entryList);
        if (val != null)
            impl.setTransfer(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("cancallforward", entryList);
        if (val != null)
            impl
                    .setCancallforward(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("callreturn", entryList);
        if (val != null)
            impl.setCallreturn(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("callgroup", entryList);
        if (val != null)
            impl.setCallgroup(val);

        val = findConfValue("pickupgroup", entryList);
        if (val != null)
            impl.setPickupgroup(val);

        val = findConfValue("useincomingcalleridonzaptransfer", entryList);
        if (val != null)
            impl.setUseincomingcalleridonzaptransfer(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingTiming_ParametersEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Timing_Parameters objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Timing_Parameters buildTiming_ParametersModelElement(
            List aEntryList) {
        Timing_Parameters impl = new Timing_ParametersImpl();
        buildTiming_ParametersModelVaues(aEntryList, impl);
        buildTiming_ParametersModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildTiming_ParametersModelAgg(List entryList,
            Timing_Parameters impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildTiming_ParametersModelVaues(List entryList,
            Timing_Parameters impl) {
        String val = null;
        val = findConfValue("prewink", entryList);
        if (val != null)
            impl.setPrewink(new Integer(val));

        val = findConfValue("preflash", entryList);
        if (val != null)
            impl.setPreflash(new Integer(val));

        val = findConfValue("wink", entryList);
        if (val != null)
            impl.setWink(new Integer(val));

        val = findConfValue("rxwink", entryList);
        if (val != null)
            impl.setRxwink(new Integer(val));

        val = findConfValue("rxflash", entryList);
        if (val != null)
            impl.setRxflash(new Integer(val));

        val = findConfValue("flash", entryList);
        if (val != null)
            impl.setFlash(new Integer(val));

        val = findConfValue("start", entryList);
        if (val != null)
            impl.setStart(new Integer(val));

        val = findConfValue("debounce", entryList);
        if (val != null)
            impl.setDebounce(new Integer(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZaptelchannelEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zaptelchannel objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zaptelchannel buildZaptelchannelModelElement(List aEntryList) {
        Zaptelchannel impl = new ZaptelchannelImpl();
        buildZaptelchannelModelVaues(aEntryList, impl);
        buildZaptelchannelModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZaptelchannelModelAgg(List entryList, Zaptelchannel impl) {

        // aggregate schreiben
        // Analog_Handset_Features
        Analog_Handset_Features aAnalog_Handset_Features = buildAnalog_Handset_FeaturesModelElement(entryList);
        impl.setAnalog_Handset_Features(aAnalog_Handset_Features);
        // writeAnalog_Handset_Features(strB,
        // impl.getAnalog_Handset_Features());
        // Analog_Trunk_Features
        Analog_Trunk_Features aAnalog_Trunk_Features = buildAnalog_Trunk_FeaturesModelElement(entryList);
        impl.setAnalog_Trunk_Features(aAnalog_Trunk_Features);
        // writeAnalog_Trunk_Features(strB, impl.getAnalog_Trunk_Features());
        // Audio_Quality_Tuning_Options
        Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options = buildAudio_Quality_Tuning_OptionsModelElement(entryList);
        impl.setAudio_Quality_Tuning_Options(aAudio_Quality_Tuning_Options);
        // writeAudio_Quality_Tuning_Options(strB,
        // impl.getAudio_Quality_Tuning_Options());
        // Call_Logging_Options
        Call_Logging_Options aCall_Logging_Options = buildCall_Logging_OptionsModelElement(entryList);
        impl.setCall_Logging_Options(aCall_Logging_Options);
        // writeCall_Logging_Options(strB, impl.getCall_Logging_Options());
        // Caller_ID_Options
        Caller_ID_Options aCaller_ID_Options = buildCaller_ID_OptionsModelElement(entryList);
        impl.setCaller_ID_Options(aCaller_ID_Options);
        // writeCaller_ID_Options(strB, impl.getCaller_ID_Options());
        // ISDN_PRI_Switch
        ISDN_PRI_Switch aISDN_PRI_Switch = buildISDN_PRI_SwitchModelElement(entryList);
        impl.setISDN_PRI_Switch(aISDN_PRI_Switch);
        // writeISDN_PRI_Switch(strB, impl.getISDN_PRI_Switch());
        // Other
        Other aOther = buildOtherModelElement(entryList);
        impl.setOther(aOther);
        // writeOther(strB, impl.getOther());
        // Timing_Parameters
        Timing_Parameters aTiming_Parameters = buildTiming_ParametersModelElement(entryList);
        impl.setTiming_Parameters(aTiming_Parameters);
        // writeTiming_Parameters(strB, impl.getTiming_Parameters());
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZaptelchannelModelVaues(List entryList,
            Zaptelchannel impl) {
        String val = null;
        val = findConfValue("signalling", entryList);
        if (val != null)
            impl.setSignalling(new Signalling(val));

        val = findConfValue("context", entryList);
        if (val != null)
            impl.setContext(new PbxContext(val));

        val = findConfValue("channel", entryList);
        if (val != null)
            impl.setChannel(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingAnalog_Trunk_FeaturesEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Analog_Trunk_Features objekt und ließt die entry list dafür
     * ein
     * 
     * @param aEntryList
     * @return
     */
    protected Analog_Trunk_Features buildAnalog_Trunk_FeaturesModelElement(
            List aEntryList) {
        Analog_Trunk_Features impl = new Analog_Trunk_FeaturesImpl();
        buildAnalog_Trunk_FeaturesModelVaues(aEntryList, impl);
        buildAnalog_Trunk_FeaturesModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAnalog_Trunk_FeaturesModelAgg(List entryList,
            Analog_Trunk_Features impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAnalog_Trunk_FeaturesModelVaues(List entryList,
            Analog_Trunk_Features impl) {
        String val = null;
        val = findConfValue("usedistinctiveringdetection", entryList);
        if (val != null)
            impl
                    .setUsedistinctiveringdetection(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("dring1", entryList);
        if (val != null)
            impl.setDring1(val);

        val = findConfValue("dring2", entryList);
        if (val != null)
            impl.setDring2(val);

        val = findConfValue("dring3", entryList);
        if (val != null)
            impl.setDring3(val);

        val = findConfValue("dring1context", entryList);
        if (val != null)
            impl.setDring1context(val);

        val = findConfValue("dring2context", entryList);
        if (val != null)
            impl.setDring2context(val);

        val = findConfValue("dring3context", entryList);
        if (val != null)
            impl.setDring3context(val);

        val = findConfValue("busydetect", entryList);
        if (val != null)
            impl.setBusydetect(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("busycount", entryList);
        if (val != null)
            impl.setBusycount(new Integer(val));

        val = findConfValue("callprogress", entryList);
        if (val != null)
            impl.setCallprogress(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("pulse", entryList);
        if (val != null)
            impl.setPulse(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingISDN_PRI_SwitchEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein ISDN_PRI_Switch objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected ISDN_PRI_Switch buildISDN_PRI_SwitchModelElement(List aEntryList) {
        ISDN_PRI_Switch impl = new ISDN_PRI_SwitchImpl();
        buildISDN_PRI_SwitchModelVaues(aEntryList, impl);
        buildISDN_PRI_SwitchModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildISDN_PRI_SwitchModelAgg(List entryList,
            ISDN_PRI_Switch impl) {

        // aggregate schreiben
        // Multilink_PPP
        Multilink_PPP aMultilink_PPP = buildMultilink_PPPModelElement(entryList);
        impl.setMultilink_PPP(aMultilink_PPP);
        // writeMultilink_PPP(strB, impl.getMultilink_PPP());
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildISDN_PRI_SwitchModelVaues(List entryList,
            ISDN_PRI_Switch impl) {
        String val = null;
        val = findConfValue("switchtype", entryList);
        if (val != null)
            impl.setSwitchtype(new Switchtype(val));

        val = findConfValue("overlapdial", entryList);
        if (val != null)
            impl.setOverlapdial(val);

        val = findConfValue("pridialplan", entryList);
        if (val != null)
            impl.setPridialplan(val);

        val = findConfValue("priindication", entryList);
        if (val != null)
            impl.setPriindication(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingAudio_Quality_Tuning_OptionsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Audio_Quality_Tuning_Options objekt und ließt die entry list
     * dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Audio_Quality_Tuning_Options buildAudio_Quality_Tuning_OptionsModelElement(
            List aEntryList) {
        Audio_Quality_Tuning_Options impl = new Audio_Quality_Tuning_OptionsImpl();
        buildAudio_Quality_Tuning_OptionsModelVaues(aEntryList, impl);
        buildAudio_Quality_Tuning_OptionsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAudio_Quality_Tuning_OptionsModelAgg(List entryList,
            Audio_Quality_Tuning_Options impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAudio_Quality_Tuning_OptionsModelVaues(List entryList,
            Audio_Quality_Tuning_Options impl) {
        String val = null;
        val = findConfValue("relaxdtmf", entryList);
        if (val != null)
            impl.setRelaxdtmf(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("echocancel", entryList);
        if (val != null)
            impl.setEchocancel(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("echocancelwhenbridged", entryList);
        if (val != null)
            impl
                    .setEchocancelwhenbridged(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("echotraining", entryList);
        if (val != null)
            impl.setEchotraining(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("rxgain", entryList);
        if (val != null)
            impl.setRxgain(new Float(val));

        val = findConfValue("txgain", entryList);
        if (val != null)
            impl.setTxgain(new Float(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingCaller_ID_OptionsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Caller_ID_Options objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Caller_ID_Options buildCaller_ID_OptionsModelElement(
            List aEntryList) {
        Caller_ID_Options impl = new Caller_ID_OptionsImpl();
        buildCaller_ID_OptionsModelVaues(aEntryList, impl);
        buildCaller_ID_OptionsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildCaller_ID_OptionsModelAgg(List entryList,
            Caller_ID_Options impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildCaller_ID_OptionsModelVaues(List entryList,
            Caller_ID_Options impl) {
        String val = null;
        val = findConfValue("callerid", entryList);
        if (val != null)
            impl.setCallerid(val);

        val = findConfValue("usecallerid", entryList);
        if (val != null)
            impl.setUsecallerid(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("hidecallerid", entryList);
        if (val != null)
            impl.setHidecallerid(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("restrictcid", entryList);
        if (val != null)
            impl.setRestrictcid(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("usecallingpres", entryList);
        if (val != null)
            impl
                    .setUsecallingpres(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingOtherEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Other objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Other buildOtherModelElement(List aEntryList) {
        Other impl = new OtherImpl();
        buildOtherModelVaues(aEntryList, impl);
        buildOtherModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildOtherModelAgg(List entryList, Other impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildOtherModelVaues(List entryList, Other impl) {
        String val = null;
        val = findConfValue("mailbox", entryList);
        if (val != null)
            impl.setMailbox(val);

        val = findConfValue("group", entryList);
        if (val != null)
            impl.setGroup(val);

        val = findConfValue("language", entryList);
        if (val != null)
            impl.setLanguage(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMultilink_PPPEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Multilink_PPP objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Multilink_PPP buildMultilink_PPPModelElement(List aEntryList) {
        Multilink_PPP impl = new Multilink_PPPImpl();
        buildMultilink_PPPModelVaues(aEntryList, impl);
        buildMultilink_PPPModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMultilink_PPPModelAgg(List entryList, Multilink_PPP impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMultilink_PPPModelVaues(List entryList,
            Multilink_PPP impl) {
        String val = null;
        val = findConfValue("minunused", entryList);
        if (val != null)
            impl.setMinunused(val);

        val = findConfValue("minidle", entryList);
        if (val != null)
            impl.setMinidle(new Integer(val));

        val = findConfValue("idledial", entryList);
        if (val != null)
            impl.setIdledial(new Integer(val));

        val = findConfValue("idleext", entryList);
        if (val != null)
            impl.setIdleext(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingCall_Logging_OptionsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Call_Logging_Options objekt und ließt die entry list dafür
     * ein
     * 
     * @param aEntryList
     * @return
     */
    protected Call_Logging_Options buildCall_Logging_OptionsModelElement(
            List aEntryList) {
        Call_Logging_Options impl = new Call_Logging_OptionsImpl();
        buildCall_Logging_OptionsModelVaues(aEntryList, impl);
        buildCall_Logging_OptionsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildCall_Logging_OptionsModelAgg(List entryList,
            Call_Logging_Options impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildCall_Logging_OptionsModelVaues(List entryList,
            Call_Logging_Options impl) {
        String val = null;
        val = findConfValue("accountcode", entryList);
        if (val != null)
            impl.setAccountcode(val);

        val = findConfValue("amaflags", entryList);
        if (val != null)
            impl.setAmaflags(val);

    }

}
