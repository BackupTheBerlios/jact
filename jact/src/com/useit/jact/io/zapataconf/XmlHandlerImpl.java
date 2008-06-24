/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import org.w3c.dom.Document;

import com.useit.jact.io.BasicSax;

/**
 * <p>
 * XmlHandlerImpl
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandlerImpl.java,v 1.5 2006/01/29 12:03:54
 *          urs Exp $
 */
public class XmlHandlerImpl extends XmlHandler {

    private Object conf;

    /**
     * 
     */
    public XmlHandlerImpl() {
        super();
    }

    public Object getConf() {
        return conf;
    }

    /**
     * @param attributes
     * @return Zapataconf
     */
    protected void linkZapataconf() {
        if (currentZapataconf != null) {
            conf = currentZapataconf;
        }
    }

    /**
     * @param attributes
     * @return Analog_Handset_Features
     */
    protected void linkAnalog_Handset_Features() {
        if (currentZaptelchannel != null)
            if (currentAnalog_Handset_Features != null) {
                currentZaptelchannel
                        .setAnalog_Handset_Features(currentAnalog_Handset_Features);
            }
    }

    /**
     * @param attributes
     * @return Timing_Parameters
     */
    protected void linkTiming_Parameters() {
        if (currentZaptelchannel != null)
            if (currentTiming_Parameters != null) {
                currentZaptelchannel
                        .setTiming_Parameters(currentTiming_Parameters);
            }
    }

    /**
     * @param attributes
     * @return Zaptelchannel
     */
    protected void linkZaptelchannel() {
        if (currentZapataconf != null) {
            if (currentZaptelchannel != null) {
                currentZapataconf.addZaptelchannel(currentZaptelchannel);
            }

        }
    }

    /**
     * @param attributes
     * @return Analog_Trunk_Features
     */
    protected void linkAnalog_Trunk_Features() {
        if (currentZaptelchannel != null)
            if (currentAnalog_Trunk_Features != null) {
                currentZaptelchannel
                        .setAnalog_Trunk_Features(currentAnalog_Trunk_Features);
            }
    }

    /**
     * @param attributes
     * @return ISDN_PRI_Switch
     */
    protected void linkISDN_PRI_Switch() {
        if (currentZaptelchannel != null)
            if (currentISDN_PRI_Switch != null) {
                currentZaptelchannel.setISDN_PRI_Switch(currentISDN_PRI_Switch);
            }
    }

    /**
     * @param attributes
     * @return Audio_Quality_Tuning_Options
     */
    protected void linkAudio_Quality_Tuning_Options() {
        if (currentZaptelchannel != null) {
            if (currentAudio_Quality_Tuning_Options != null)
                currentZaptelchannel
                        .setAudio_Quality_Tuning_Options(currentAudio_Quality_Tuning_Options);// .addZaptelchannel(currentZaptelchannel);
        }
        // if(currentAudio_Quality_Tuning_Options!=null){
        //		
        // }
    }

    /**
     * @param attributes
     * @return Caller_ID_Options
     */
    protected void linkCaller_ID_Options() {
        if (currentZaptelchannel != null)
            if (currentCaller_ID_Options != null) {
                currentZaptelchannel
                        .setCaller_ID_Options(currentCaller_ID_Options);
            }
    }

    /**
     * @param attributes
     * @return Other
     */
    protected void linkOther() {
        if (currentZaptelchannel != null)
            if (currentOther != null) {
                currentZaptelchannel.setOther(currentOther);
            }
    }

    /**
     * @param attributes
     * @return Multilink_PPP
     */
    protected void linkMultilink_PPP() {
        if (currentISDN_PRI_Switch != null)
            if (currentMultilink_PPP != null) {
                currentISDN_PRI_Switch.setMultilink_PPP(currentMultilink_PPP);
            }
    }

    /**
     * @param attributes
     * @return Call_Logging_Options
     */
    protected void linkCall_Logging_Options() {
        if (currentZaptelchannel != null)
            if (currentCall_Logging_Options != null) {
                currentZaptelchannel
                        .setCall_Logging_Options(currentCall_Logging_Options);
            }
    }

    /**
     * @param filename
     * @param conf
     */
    public static void writeConf(String filename, Object conf) {
        Document doc = BasicSax.createDomDocument();
        XmlWriter.writeConf(doc, conf);
        BasicSax.writeXmlFile(doc, filename);

    }

    public static Object readConf(String filename) {
        XmlHandlerImpl hnd = new XmlHandlerImpl();
        BasicSax.parseXmlFile(filename, hnd, false);
        return hnd.getConf();
    }

}
