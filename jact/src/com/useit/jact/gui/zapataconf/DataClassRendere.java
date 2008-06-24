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

// import com.beronet.App.CSS.model.dataModel.Zapataconf;
// import com.beronet.App.CSS.model.dataModel.Analog_Handset_Features;
// import com.beronet.App.CSS.model.dataModel.Timing_Parameters;
// import com.beronet.App.CSS.model.dataModel.Zaptelchannel;
// import com.beronet.App.CSS.model.dataModel.Analog_Trunk_Features;
// import com.beronet.App.CSS.model.dataModel.ISDN_PRI_Switch;
// import com.beronet.App.CSS.model.dataModel.Audio_Quality_Tuning_Options;
// import com.beronet.App.CSS.model.dataModel.Caller_ID_Options;
// import com.beronet.App.CSS.model.dataModel.Other;
// import com.beronet.App.CSS.model.dataModel.Multilink_PPP;
// import com.beronet.App.CSS.model.dataModel.Call_Logging_Options;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.6 2006/01/05
 *          12:57:42 urs Exp $
 */
public abstract class DataClassRendere {

    protected static DataClassRendere defaultInstance;

    /**
     * 
     */
    protected DataClassRendere() {
        super();
    }

    private static DataClassRendere getInstance() {
        if (defaultInstance == null) {

            defaultInstance = new DataClassRendereImpl();
        }
        return defaultInstance;
    }

    /**
     * gibt den string des Datenobjectes zurück für Zapataconf
     */
    public abstract String displayString(Zapataconf aZapataconf);// {

    // return aZapataconf == null ? "" : aZapataconf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Analog_Handset_Features
     */
    public abstract String displayString(
            Analog_Handset_Features aAnalog_Handset_Features);// {

    // return aAnalog_Handset_Features == null ? "" :
    // aAnalog_Handset_Features.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Timing_Parameters
     */
    public abstract String displayString(Timing_Parameters aTiming_Parameters);// {

    // return aTiming_Parameters == null ? "" : aTiming_Parameters.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zaptelchannel
     */
    public abstract String displayString(Zaptelchannel aZaptelchannel);// {

    // return aZaptelchannel == null ? "" : aZaptelchannel.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Analog_Trunk_Features
     */
    public abstract String displayString(
            Analog_Trunk_Features aAnalog_Trunk_Features);// {

    // return aAnalog_Trunk_Features == null ? "" :
    // aAnalog_Trunk_Features.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für ISDN_PRI_Switch
     */
    public abstract String displayString(ISDN_PRI_Switch aISDN_PRI_Switch);// {

    // return aISDN_PRI_Switch == null ? "" : aISDN_PRI_Switch.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Audio_Quality_Tuning_Options
     */
    public abstract String displayString(
            Audio_Quality_Tuning_Options aAudio_Quality_Tuning_Options);// {

    // return aAudio_Quality_Tuning_Options == null ? "" :
    // aAudio_Quality_Tuning_Options.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Caller_ID_Options
     */
    public abstract String displayString(Caller_ID_Options aCaller_ID_Options);// {

    // return aCaller_ID_Options == null ? "" : aCaller_ID_Options.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Other
     */
    public abstract String displayString(Other aOther);// {

    // return aOther == null ? "" : aOther.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Multilink_PPP
     */
    public abstract String displayString(Multilink_PPP aMultilink_PPP);// {

    // return aMultilink_PPP == null ? "" : aMultilink_PPP.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Call_Logging_Options
     */
    public abstract String displayString(
            Call_Logging_Options aCall_Logging_Options);// {

    // return aCall_Logging_Options == null ? "" :
    // aCall_Logging_Options.toString(); //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Zapataconf)
            return getInstance().displayString((Zapataconf) obj);
        if (obj instanceof Analog_Handset_Features)
            return getInstance().displayString((Analog_Handset_Features) obj);
        if (obj instanceof Timing_Parameters)
            return getInstance().displayString((Timing_Parameters) obj);
        if (obj instanceof Zaptelchannel)
            return getInstance().displayString((Zaptelchannel) obj);
        if (obj instanceof Analog_Trunk_Features)
            return getInstance().displayString((Analog_Trunk_Features) obj);
        if (obj instanceof ISDN_PRI_Switch)
            return getInstance().displayString((ISDN_PRI_Switch) obj);
        if (obj instanceof Audio_Quality_Tuning_Options)
            return getInstance().displayString(
                    (Audio_Quality_Tuning_Options) obj);
        if (obj instanceof Caller_ID_Options)
            return getInstance().displayString((Caller_ID_Options) obj);
        if (obj instanceof Other)
            return getInstance().displayString((Other) obj);
        if (obj instanceof Multilink_PPP)
            return getInstance().displayString((Multilink_PPP) obj);
        if (obj instanceof Call_Logging_Options)
            return getInstance().displayString((Call_Logging_Options) obj);
        return obj.toString();
    }
}
