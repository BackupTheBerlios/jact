/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

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
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected Zapataconf currentZapataconf = null;

    protected Analog_Handset_Features currentAnalog_Handset_Features = null;

    protected Timing_Parameters currentTiming_Parameters = null;

    protected Zaptelchannel currentZaptelchannel = null;

    protected Analog_Trunk_Features currentAnalog_Trunk_Features = null;

    protected ISDN_PRI_Switch currentISDN_PRI_Switch = null;

    protected Audio_Quality_Tuning_Options currentAudio_Quality_Tuning_Options = null;

    protected Caller_ID_Options currentCaller_ID_Options = null;

    protected Other currentOther = null;

    protected Multilink_PPP currentMultilink_PPP = null;

    protected Call_Logging_Options currentCall_Logging_Options = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Zapataconf")) {
            endZapataconf();
        }
        if (qName.equals("Analog_Handset_Features")) {
            endAnalog_Handset_Features();
        }
        if (qName.equals("Timing_Parameters")) {
            endTiming_Parameters();
        }
        if (qName.equals("Zaptelchannel")) {
            endZaptelchannel();
        }
        if (qName.equals("Analog_Trunk_Features")) {
            endAnalog_Trunk_Features();
        }
        if (qName.equals("ISDN_PRI_Switch")) {
            endISDN_PRI_Switch();
        }
        if (qName.equals("Audio_Quality_Tuning_Options")) {
            endAudio_Quality_Tuning_Options();
        }
        if (qName.equals("Caller_ID_Options")) {
            endCaller_ID_Options();
        }
        if (qName.equals("Other")) {
            endOther();
        }
        if (qName.equals("Multilink_PPP")) {
            endMultilink_PPP();
        }
        if (qName.equals("Call_Logging_Options")) {
            endCall_Logging_Options();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endZapataconf() {
        currentZapataconf = null;

    }

    /**
     * 
     */
    private void endAnalog_Handset_Features() {
        currentAnalog_Handset_Features = null;

    }

    /**
     * 
     */
    private void endTiming_Parameters() {
        currentTiming_Parameters = null;

    }

    /**
     * 
     */
    private void endZaptelchannel() {
        currentZaptelchannel = null;

    }

    /**
     * 
     */
    private void endAnalog_Trunk_Features() {
        currentAnalog_Trunk_Features = null;

    }

    /**
     * 
     */
    private void endISDN_PRI_Switch() {
        currentISDN_PRI_Switch = null;

    }

    /**
     * 
     */
    private void endAudio_Quality_Tuning_Options() {
        currentAudio_Quality_Tuning_Options = null;

    }

    /**
     * 
     */
    private void endCaller_ID_Options() {
        currentCaller_ID_Options = null;

    }

    /**
     * 
     */
    private void endOther() {
        currentOther = null;

    }

    /**
     * 
     */
    private void endMultilink_PPP() {
        currentMultilink_PPP = null;

    }

    /**
     * 
     */
    private void endCall_Logging_Options() {
        currentCall_Logging_Options = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Zapataconf")) {
            currentZapataconf = readZapataconf(attributes);
            linkZapataconf();
        }
        if (qName.equals("Analog_Handset_Features")) {
            currentAnalog_Handset_Features = readAnalog_Handset_Features(attributes);
            linkAnalog_Handset_Features();
        }
        if (qName.equals("Timing_Parameters")) {
            currentTiming_Parameters = readTiming_Parameters(attributes);
            linkTiming_Parameters();
        }
        if (qName.equals("Zaptelchannel")) {
            currentZaptelchannel = readZaptelchannel(attributes);
            linkZaptelchannel();
        }
        if (qName.equals("Analog_Trunk_Features")) {
            currentAnalog_Trunk_Features = readAnalog_Trunk_Features(attributes);
            linkAnalog_Trunk_Features();
        }
        if (qName.equals("ISDN_PRI_Switch")) {
            currentISDN_PRI_Switch = readISDN_PRI_Switch(attributes);
            linkISDN_PRI_Switch();
        }
        if (qName.equals("Audio_Quality_Tuning_Options")) {
            currentAudio_Quality_Tuning_Options = readAudio_Quality_Tuning_Options(attributes);
            linkAudio_Quality_Tuning_Options();
        }
        if (qName.equals("Caller_ID_Options")) {
            currentCaller_ID_Options = readCaller_ID_Options(attributes);
            linkCaller_ID_Options();
        }
        if (qName.equals("Other")) {
            currentOther = readOther(attributes);
            linkOther();
        }
        if (qName.equals("Multilink_PPP")) {
            currentMultilink_PPP = readMultilink_PPP(attributes);
            linkMultilink_PPP();
        }
        if (qName.equals("Call_Logging_Options")) {
            currentCall_Logging_Options = readCall_Logging_Options(attributes);
            linkCall_Logging_Options();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Other
     */
    protected void linkOther() {

    }

    /**
     * lieﬂt die klasse Other ein
     * 
     * @param attributes
     * @return Other
     */
    protected Other readOther(Attributes attributes) {
        OtherImpl obj = new OtherImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("mailbox");
        if (val != null)
            obj.setMailbox(val);

        val = attributes.getValue("group");
        if (val != null)
            obj.setGroup(val);

        val = attributes.getValue("language");
        if (val != null)
            obj.setLanguage(val);

        // finished reading attibutes of Other
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Analog_Handset_Features
     */
    protected void linkAnalog_Handset_Features() {

    }

    /**
     * lieﬂt die klasse Analog_Handset_Features ein
     * 
     * @param attributes
     * @return Analog_Handset_Features
     */
    protected Analog_Handset_Features readAnalog_Handset_Features(
            Attributes attributes) {
        Analog_Handset_FeaturesImpl obj = new Analog_Handset_FeaturesImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("adsi");
        if (val != null)
            obj.setAdsi(val);

        val = attributes.getValue("immediate");
        if (val != null)
            obj.setImmediate(new Boolean(val));

        val = attributes.getValue("callwaiting");
        if (val != null)
            obj.setCallwaiting(new Boolean(val));

        val = attributes.getValue("callwaitingcallerid");
        if (val != null)
            obj.setCallwaitingcallerid(new Boolean(val));

        val = attributes.getValue("threewaycalling");
        if (val != null)
            obj.setThreewaycalling(new Boolean(val));

        val = attributes.getValue("transfer");
        if (val != null)
            obj.setTransfer(new Boolean(val));

        val = attributes.getValue("cancallforward");
        if (val != null)
            obj.setCancallforward(new Boolean(val));

        val = attributes.getValue("callreturn");
        if (val != null)
            obj.setCallreturn(new Boolean(val));

        val = attributes.getValue("callgroup");
        if (val != null)
            obj.setCallgroup(val);

        val = attributes.getValue("pickupgroup");
        if (val != null)
            obj.setPickupgroup(val);

        val = attributes.getValue("useincomingcalleridonzaptransfer");
        if (val != null)
            obj.setUseincomingcalleridonzaptransfer(val);

        // finished reading attibutes of Analog_Handset_Features
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Timing_Parameters
     */
    protected void linkTiming_Parameters() {

    }

    /**
     * lieﬂt die klasse Timing_Parameters ein
     * 
     * @param attributes
     * @return Timing_Parameters
     */
    protected Timing_Parameters readTiming_Parameters(Attributes attributes) {
        Timing_ParametersImpl obj = new Timing_ParametersImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("prewink");
        if (val != null)
            obj.setPrewink(new Integer(val));

        val = attributes.getValue("preflash");
        if (val != null)
            obj.setPreflash(new Integer(val));

        val = attributes.getValue("wink");
        if (val != null)
            obj.setWink(new Integer(val));

        val = attributes.getValue("rxwink");
        if (val != null)
            obj.setRxwink(new Integer(val));

        val = attributes.getValue("rxflash");
        if (val != null)
            obj.setRxflash(new Integer(val));

        val = attributes.getValue("flash");
        if (val != null)
            obj.setFlash(new Integer(val));

        val = attributes.getValue("start");
        if (val != null)
            obj.setStart(new Integer(val));

        val = attributes.getValue("debounce");
        if (val != null)
            obj.setDebounce(new Integer(val));

        // finished reading attibutes of Timing_Parameters
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Analog_Trunk_Features
     */
    protected void linkAnalog_Trunk_Features() {

    }

    /**
     * lieﬂt die klasse Analog_Trunk_Features ein
     * 
     * @param attributes
     * @return Analog_Trunk_Features
     */
    protected Analog_Trunk_Features readAnalog_Trunk_Features(
            Attributes attributes) {
        Analog_Trunk_FeaturesImpl obj = new Analog_Trunk_FeaturesImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("usedistinctiveringdetection");
        if (val != null)
            obj.setUsedistinctiveringdetection(new Boolean(val));

        val = attributes.getValue("dring1");
        if (val != null)
            obj.setDring1(val);

        val = attributes.getValue("dring2");
        if (val != null)
            obj.setDring2(val);

        val = attributes.getValue("dring3");
        if (val != null)
            obj.setDring3(val);

        val = attributes.getValue("dring1context");
        if (val != null)
            obj.setDring1context(val);

        val = attributes.getValue("dring2context");
        if (val != null)
            obj.setDring2context(val);

        val = attributes.getValue("dring3context");
        if (val != null)
            obj.setDring3context(val);

        val = attributes.getValue("busydetect");
        if (val != null)
            obj.setBusydetect(new Boolean(val));

        val = attributes.getValue("busycount");
        if (val != null)
            obj.setBusycount(new Integer(val));

        val = attributes.getValue("callprogress");
        if (val != null)
            obj.setCallprogress(new Boolean(val));

        val = attributes.getValue("pulse");
        if (val != null)
            obj.setPulse(new Boolean(val));

        // finished reading attibutes of Analog_Trunk_Features
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return ISDN_PRI_Switch
     */
    protected void linkISDN_PRI_Switch() {

    }

    /**
     * lieﬂt die klasse ISDN_PRI_Switch ein
     * 
     * @param attributes
     * @return ISDN_PRI_Switch
     */
    protected ISDN_PRI_Switch readISDN_PRI_Switch(Attributes attributes) {
        ISDN_PRI_SwitchImpl obj = new ISDN_PRI_SwitchImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("switchtype");
        if (val != null)
            obj.setSwitchtype(new Switchtype(val));

        val = attributes.getValue("overlapdial");
        if (val != null)
            obj.setOverlapdial(val);

        val = attributes.getValue("pridialplan");
        if (val != null)
            obj.setPridialplan(val);

        val = attributes.getValue("priindication");
        if (val != null)
            obj.setPriindication(val);

        // finished reading attibutes of ISDN_PRI_Switch
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Multilink_PPP
     */
    protected void linkMultilink_PPP() {

    }

    /**
     * lieﬂt die klasse Multilink_PPP ein
     * 
     * @param attributes
     * @return Multilink_PPP
     */
    protected Multilink_PPP readMultilink_PPP(Attributes attributes) {
        Multilink_PPPImpl obj = new Multilink_PPPImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("minunused");
        if (val != null)
            obj.setMinunused(val);

        val = attributes.getValue("minidle");
        if (val != null)
            obj.setMinidle(new Integer(val));

        val = attributes.getValue("idledial");
        if (val != null)
            obj.setIdledial(new Integer(val));

        val = attributes.getValue("idleext");
        if (val != null)
            obj.setIdleext(val);

        // finished reading attibutes of Multilink_PPP
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Audio_Quality_Tuning_Options
     */
    protected void linkAudio_Quality_Tuning_Options() {

    }

    /**
     * lieﬂt die klasse Audio_Quality_Tuning_Options ein
     * 
     * @param attributes
     * @return Audio_Quality_Tuning_Options
     */
    protected Audio_Quality_Tuning_Options readAudio_Quality_Tuning_Options(
            Attributes attributes) {
        Audio_Quality_Tuning_OptionsImpl obj = new Audio_Quality_Tuning_OptionsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("relaxdtmf");
        if (val != null)
            obj.setRelaxdtmf(new Boolean(val));

        val = attributes.getValue("echocancel");
        if (val != null)
            obj.setEchocancel(new Boolean(val));

        val = attributes.getValue("echocancelwhenbridged");
        if (val != null)
            obj.setEchocancelwhenbridged(new Boolean(val));

        val = attributes.getValue("echotraining");
        if (val != null)
            obj.setEchotraining(new Boolean(val));

        val = attributes.getValue("rxgain");
        if (val != null)
            obj.setRxgain(new Float(val));

        val = attributes.getValue("txgain");
        if (val != null)
            obj.setTxgain(new Float(val));

        // finished reading attibutes of Audio_Quality_Tuning_Options
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zaptelchannel
     */
    protected void linkZaptelchannel() {

    }

    /**
     * lieﬂt die klasse Zaptelchannel ein
     * 
     * @param attributes
     * @return Zaptelchannel
     */
    protected Zaptelchannel readZaptelchannel(Attributes attributes) {
        ZaptelchannelImpl obj = new ZaptelchannelImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("signalling");
        if (val != null)
            obj.setSignalling(new Signalling(val));

        val = attributes.getValue("context");
        if (val != null)
            obj.setContext(new PbxContext(val));

        val = attributes.getValue("channel");
        if (val != null)
            obj.setChannel(val);

        // finished reading attibutes of Zaptelchannel
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Call_Logging_Options
     */
    protected void linkCall_Logging_Options() {

    }

    /**
     * lieﬂt die klasse Call_Logging_Options ein
     * 
     * @param attributes
     * @return Call_Logging_Options
     */
    protected Call_Logging_Options readCall_Logging_Options(
            Attributes attributes) {
        Call_Logging_OptionsImpl obj = new Call_Logging_OptionsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("accountcode");
        if (val != null)
            obj.setAccountcode(val);

        val = attributes.getValue("amaflags");
        if (val != null)
            obj.setAmaflags(val);

        // finished reading attibutes of Call_Logging_Options
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Caller_ID_Options
     */
    protected void linkCaller_ID_Options() {

    }

    /**
     * lieﬂt die klasse Caller_ID_Options ein
     * 
     * @param attributes
     * @return Caller_ID_Options
     */
    protected Caller_ID_Options readCaller_ID_Options(Attributes attributes) {
        Caller_ID_OptionsImpl obj = new Caller_ID_OptionsImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("callerid");
        if (val != null)
            obj.setCallerid(val);

        val = attributes.getValue("usecallerid");
        if (val != null)
            obj.setUsecallerid(new Boolean(val));

        val = attributes.getValue("hidecallerid");
        if (val != null)
            obj.setHidecallerid(new Boolean(val));

        val = attributes.getValue("restrictcid");
        if (val != null)
            obj.setRestrictcid(new Boolean(val));

        val = attributes.getValue("usecallingpres");
        if (val != null)
            obj.setUsecallingpres(new Boolean(val));

        // finished reading attibutes of Caller_ID_Options
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Zapataconf
     */
    protected void linkZapataconf() {

    }

    /**
     * lieﬂt die klasse Zapataconf ein
     * 
     * @param attributes
     * @return Zapataconf
     */
    protected Zapataconf readZapataconf(Attributes attributes) {
        ZapataconfImpl obj = new ZapataconfImpl();
        // felder schreiben
        String val;
        // finished reading attibutes of Zapataconf
        return obj;
    }

}
