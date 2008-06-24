/*
 * (c) urs zeidler
 */
package com.useit.jact.model.zapataconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFzapataconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFzapataconf.java,v 1.3 2006/01/09 10:17:33
 *          urs Exp $
 */
public class MMFzapataconf implements ModelManagerInterface {
    private static MMFzapataconf instance;

    public static final String MODELNAME = "zapataconf";

    public static final String OTHER = "OTHER";

    public static final String ANALOG_HANDSET_FEATURES = "ANALOG_HANDSET_FEATURES";

    public static final String TIMING_PARAMETERS = "TIMING_PARAMETERS";

    public static final String ANALOG_TRUNK_FEATURES = "ANALOG_TRUNK_FEATURES";

    public static final String ISDN_PRI_SWITCH = "ISDN_PRI_SWITCH";

    public static final String MULTILINK_PPP = "MULTILINK_PPP";

    public static final String AUDIO_QUALITY_TUNING_OPTIONS = "AUDIO_QUALITY_TUNING_OPTIONS";

    public static final String ZAPTELCHANNEL = "ZAPTELCHANNEL";

    public static final String CALL_LOGGING_OPTIONS = "CALL_LOGGING_OPTIONS";

    public static final String CALLER_ID_OPTIONS = "CALLER_ID_OPTIONS";

    public static final String ZAPATACONF = "ZAPATACONF";

    private MMFzapataconf() {
        super();
    }

    /**
     * schreibt die zapataconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.zapataconf.ConfWriterImpl wrt = new com.useit.jact.io.zapataconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die zapataconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.zapataconf.ConfWriterImpl wrt = new com.useit.jact.io.zapataconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die zapataconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.zapataconf.ConfReaderImpl wrt = new com.useit.jact.io.zapataconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die zapataconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.zapataconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das zapataconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.zapataconf.XmlHandlerImpl.readConf(filename);
    }

    /**
     * die statische model id
     * 
     * @return
     */
    public String getMODELNAME() {
        return MODELNAME;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see com.useit.app.framework.model.dataModel.ModelManagerInterface#newObject(java.lang.String)
     */
    public Object newObject(String mapkey) {
        if (OTHER.equals(mapkey)) {
            return new OtherImpl();
        }

        if (ANALOG_HANDSET_FEATURES.equals(mapkey)) {
            return new Analog_Handset_FeaturesImpl();
        }

        if (TIMING_PARAMETERS.equals(mapkey)) {
            return new Timing_ParametersImpl();
        }

        if (ANALOG_TRUNK_FEATURES.equals(mapkey)) {
            return new Analog_Trunk_FeaturesImpl();
        }

        if (ISDN_PRI_SWITCH.equals(mapkey)) {
            return new ISDN_PRI_SwitchImpl();
        }

        if (MULTILINK_PPP.equals(mapkey)) {
            return new Multilink_PPPImpl();
        }

        if (AUDIO_QUALITY_TUNING_OPTIONS.equals(mapkey)) {
            return new Audio_Quality_Tuning_OptionsImpl();
        }

        if (ZAPTELCHANNEL.equals(mapkey)) {
            return new ZaptelchannelImpl();
        }

        if (CALL_LOGGING_OPTIONS.equals(mapkey)) {
            return new Call_Logging_OptionsImpl();
        }

        if (CALLER_ID_OPTIONS.equals(mapkey)) {
            return new Caller_ID_OptionsImpl();
        }

        if (ZAPATACONF.equals(mapkey)) {
            return new ZapataconfImpl();
        }

        return null;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see com.useit.app.framework.model.dataModel.ModelManagerInterface#addObject(java.lang.String,
     *      java.util.Map, java.lang.Object)
     */
    public void addObject(String mapkey, Map map, Object object) {
    }

    /*
     * private Integer newInt(Set set) { Integer test = new Integer(set.size());
     * while (set.contains(test)) { test = new Integer(test.intValue()+1);
     *  } return test; }
     */

    public static MMFzapataconf getInstance() {
        if (instance == null)
            instance = new MMFzapataconf();

        return instance;
    }

}
