/*
 * (c) urs zeidler
 */
package com.useit.jact.io.featureconf;

import org.apache.log4j.Logger;

import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

/**
 * <p>
 * ConfWriterImpl
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriterImpl.java,v 1.6 2006/01/13 16:54:45
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

        theFeaturesconfwriteHelper = new FeaturesconfwriteHelper();
        theFeaturesconfwriteHelper.parkext_StartToken = "parkext=";
        theFeaturesconfwriteHelper.parkext_StopToken = "\n";
        theFeaturesconfwriteHelper.parkpos_StartToken = "parkpos=";
        theFeaturesconfwriteHelper.parkpos_StopToken = "\n";
        theFeaturesconfwriteHelper.context_StartToken = "context=";
        theFeaturesconfwriteHelper.context_StopToken = "\n";
        theFeaturesconfwriteHelper.parkingtime_StartToken = "parkingtime=";
        theFeaturesconfwriteHelper.parkingtime_StopToken = "\n";
        theFeaturesconfwriteHelper.transferdigittimeout_StartToken = "transferdigittimeout=";
        theFeaturesconfwriteHelper.transferdigittimeout_StopToken = "\n";
        theFeaturesconfwriteHelper.courtesytone_StartToken = "courtesytone=";
        theFeaturesconfwriteHelper.courtesytone_StopToken = "\n";
        theFeaturesconfwriteHelper.xfersound_StartToken = "xfersound=";
        theFeaturesconfwriteHelper.xfersound_StopToken = "\n";
        theFeaturesconfwriteHelper.xferfailsound_StartToken = "xferfailsound=";
        theFeaturesconfwriteHelper.xferfailsound_StopToken = "\n";
        theFeaturesconfwriteHelper.adsipark_StartToken = "adsipark=";
        theFeaturesconfwriteHelper.adsipark_StopToken = "\n";
        theFeaturesconfwriteHelper.pickupexten_StartToken = "pickupexten=";
        theFeaturesconfwriteHelper.pickupexten_StopToken = "\n";
        theFeaturesconfwriteHelper.featuredigittimeout_StartToken = "featuredigittimeout=";
        theFeaturesconfwriteHelper.featuredigittimeout_StopToken = "\n";
        // theFeaturesconfwriteHelper.fileid_StartToken="fileid=";
        // theFeaturesconfwriteHelper.fileid_StopToken="\n";

        theFeaturemapwriteHelper = new FeaturemapwriteHelper();
        theFeaturemapwriteHelper.blindxfer_StartToken = "blindxfer=";
        theFeaturemapwriteHelper.blindxfer_StopToken = "\n";
        theFeaturemapwriteHelper.disconnect_StartToken = "disconnect=";
        theFeaturemapwriteHelper.disconnect_StopToken = "\n";
        theFeaturemapwriteHelper.automon_StartToken = "automon=";
        theFeaturemapwriteHelper.automon_StopToken = "\n";
        theFeaturemapwriteHelper.atxfer_StartToken = "atxfer=";
        theFeaturemapwriteHelper.atxfer_StopToken = "\n";

    }

    /**
     * schreibt ein Featuresconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturesconf(StringBuffer strB, Featuresconf impl) {
        writeComment(strB, impl);
        super.writeFeaturesconf(strB, impl);

    }

    /**
     * schreibt ein Featuremap Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturemap(StringBuffer strB, Featuremap impl) {
        writeEmtypLine(strB);
        writeComment(strB, impl);
        writeSecHeader(strB, "featuremap");
        super.writeFeaturemap(strB, impl);

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

}
