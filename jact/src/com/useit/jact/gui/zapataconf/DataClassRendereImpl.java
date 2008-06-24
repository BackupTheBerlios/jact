/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.zapataconf;

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
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.5 2006/03/17
 *          10:42:52 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Zapataconf
     */
    public String displayString(Zapataconf aZapataconf) {
        return aZapataconf == null ? "" : "Zapata Config";// aZapataconf.toString();
                                                            // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Analog_Handset_Features
     */
    public String displayString(Analog_Handset_Features aAnalog_Handset_Features) {
        return aAnalog_Handset_Features == null ? ""
                : "Analog Handset Features";// aAnalog_Handset_Features.toString();
                                            // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Timing_Parameters
     */
    public String displayString(Timing_Parameters aTiming_Parameters) {
        return aTiming_Parameters == null ? "" : "Timing_Parameters";// aTiming_Parameters.toString();
                                                                        // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Zaptelchannel
     */
    public String displayString(Zaptelchannel aZaptelchannel) {
        return aZaptelchannel == null ? "" : "channel : "
                + aZaptelchannel.getChannel(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Analog_Trunk_Features
     */
    public String displayString(Analog_Trunk_Features aAnalog_Trunk_Features) {
        return aAnalog_Trunk_Features == null ? "" : "Analog_Trunk_Features";// aAnalog_Trunk_Features.toString();
                                                                                // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für ISDN_PRI_Switch
     */
    public String displayString(ISDN_PRI_Switch aISDN_PRI_Switch) {
        return aISDN_PRI_Switch == null ? "" : "ISDN_PRI_Switch";// .toString();
                                                                    // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Audio_Quality_Tuning_Options
     */
    public String displayString(
            Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options) {
        return aAudio_Quality_Tuning_Options == null ? ""
                : "Audio_Quality_Tuning_Options";// .toString();
                                                    // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Caller_ID_Options
     */
    public String displayString(Caller_ID_Options aCaller_ID_Options) {
        return aCaller_ID_Options == null ? "" : "Caller_ID_Options";// .toString();
                                                                        // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Other
     */
    public String displayString(Other aOther) {
        return aOther == null ? "" : "Other";// .toString();
                                                // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Multilink_PPP
     */
    public String displayString(Multilink_PPP aMultilink_PPP) {
        return aMultilink_PPP == null ? "" : "Multilink_PPP";// .toString();
                                                                // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Call_Logging_Options
     */
    public String displayString(Call_Logging_Options aCall_Logging_Options) {
        return aCall_Logging_Options == null ? "" : "Call_Logging_Options";// .toString();
                                                                            // //"DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zapataconf
    // */
    // public String displayString(ZapataconfMap aZapataconfMap){
    // return aZapataconfMap == null ? "" : aZapataconfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Analog_Handset_Features
    // */
    // public String displayString(Analog_Handset_FeaturesMap
    // aAnalog_Handset_FeaturesMap){
    // return aAnalog_Handset_FeaturesMap == null ? "" :
    // aAnalog_Handset_FeaturesMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Timing_Parameters
    // */
    // public String displayString(Timing_ParametersMap aTiming_ParametersMap){
    // return aTiming_ParametersMap == null ? "" :
    // aTiming_ParametersMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zaptelchannel
    // */
    // public String displayString(ZaptelchannelMap aZaptelchannelMap){
    // return aZaptelchannelMap == null ? "" : aZaptelchannelMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Analog_Trunk_Features
    // */
    // public String displayString(Analog_Trunk_FeaturesMap
    // aAnalog_Trunk_FeaturesMap){
    // return aAnalog_Trunk_FeaturesMap == null ? "" :
    // aAnalog_Trunk_FeaturesMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für ISDN_PRI_Switch
    // */
    // public String displayString(ISDN_PRI_SwitchMap aISDN_PRI_SwitchMap){
    // return aISDN_PRI_SwitchMap == null ? "" : aISDN_PRI_SwitchMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Audio_Quality_Tuning_Options
    // */
    // public String displayString(Audio_Quality_Tuning_OptionsMap
    // aAudio_Quality_Tuning_OptionsMap){
    // return aAudio_Quality_Tuning_OptionsMap == null ? "" :
    // aAudio_Quality_Tuning_OptionsMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Caller_ID_Options
    // */
    // public String displayString(Caller_ID_OptionsMap aCaller_ID_OptionsMap){
    // return aCaller_ID_OptionsMap == null ? "" :
    // aCaller_ID_OptionsMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Other
    // */
    // public String displayString(OtherMap aOtherMap){
    // return aOtherMap == null ? "" : aOtherMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Multilink_PPP
    // */
    // public String displayString(Multilink_PPPMap aMultilink_PPPMap){
    // return aMultilink_PPPMap == null ? "" : aMultilink_PPPMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Call_Logging_Options
    // */
    // public String displayString(Call_Logging_OptionsMap
    // aCall_Logging_OptionsMap){
    // return aCall_Logging_OptionsMap == null ? "" :
    // aCall_Logging_OptionsMap.toString(); //"DataObjectName";
    // }
}
