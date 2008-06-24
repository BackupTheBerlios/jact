/*
 * (c) urs zeidler
 */
package com.useit.jact.io.featureconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.io.AbstractConfWriter;
import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

/**
 * <p>
 * ConfWriter , schreibet einen Objektbaum als string
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfWriter.java,v 1.8 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class ConfWriter extends AbstractConfWriter {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(ConfWriter.class);

    /** der Token speicher um zu writen * */
    protected class FeaturesconfwriteHelper {

        public String parkext_StartToken;

        public String parkext_StopToken;

        public void writeparkext(StringBuffer strB, Featuresconf impl) {
            if (impl.getParkext() != null && parkext_StartToken != null) {
                strB.append(parkext_StartToken).append(impl.getParkext())
                        .append(parkext_StopToken);
            }
        }

        public String parkpos_StartToken;

        public String parkpos_StopToken;

        public void writeparkpos(StringBuffer strB, Featuresconf impl) {
            if (impl.getParkpos() != null && parkpos_StartToken != null) {
                strB.append(parkpos_StartToken).append(impl.getParkpos())
                        .append(parkpos_StopToken);
            }
        }

        public String context_StartToken;

        public String context_StopToken;

        public void writecontext(StringBuffer strB, Featuresconf impl) {
            if (impl.getContext() != null && context_StartToken != null) {
                strB.append(context_StartToken).append(impl.getContext())
                        .append(context_StopToken);
            }
        }

        public String parkingtime_StartToken;

        public String parkingtime_StopToken;

        public void writeparkingtime(StringBuffer strB, Featuresconf impl) {
            if (impl.getParkingtime() != null && parkingtime_StartToken != null) {
                strB.append(parkingtime_StartToken).append(
                        impl.getParkingtime()).append(parkingtime_StopToken);
            }
        }

        public String transferdigittimeout_StartToken;

        public String transferdigittimeout_StopToken;

        public void writetransferdigittimeout(StringBuffer strB,
                Featuresconf impl) {
            if (impl.getTransferdigittimeout() != null
                    && transferdigittimeout_StartToken != null) {
                strB.append(transferdigittimeout_StartToken).append(
                        impl.getTransferdigittimeout()).append(
                        transferdigittimeout_StopToken);
            }
        }

        public String courtesytone_StartToken;

        public String courtesytone_StopToken;

        public void writecourtesytone(StringBuffer strB, Featuresconf impl) {
            if (impl.getCourtesytone() != null
                    && courtesytone_StartToken != null) {
                strB.append(courtesytone_StartToken).append(
                        impl.getCourtesytone()).append(courtesytone_StopToken);
            }
        }

        public String xfersound_StartToken;

        public String xfersound_StopToken;

        public void writexfersound(StringBuffer strB, Featuresconf impl) {
            if (impl.getXfersound() != null && xfersound_StartToken != null) {
                strB.append(xfersound_StartToken).append(impl.getXfersound())
                        .append(xfersound_StopToken);
            }
        }

        public String xferfailsound_StartToken;

        public String xferfailsound_StopToken;

        public void writexferfailsound(StringBuffer strB, Featuresconf impl) {
            if (impl.getXferfailsound() != null
                    && xferfailsound_StartToken != null) {
                strB.append(xferfailsound_StartToken).append(
                        impl.getXferfailsound())
                        .append(xferfailsound_StopToken);
            }
        }

        public String adsipark_StartToken;

        public String adsipark_StopToken;

        public void writeadsipark(StringBuffer strB, Featuresconf impl) {
            if (impl.getAdsipark() != null && adsipark_StartToken != null) {
                strB.append(adsipark_StartToken).append(impl.getAdsipark())
                        .append(adsipark_StopToken);
            }
        }

        public String pickupexten_StartToken;

        public String pickupexten_StopToken;

        public void writepickupexten(StringBuffer strB, Featuresconf impl) {
            if (impl.getPickupexten() != null && pickupexten_StartToken != null) {
                strB.append(pickupexten_StartToken).append(
                        impl.getPickupexten()).append(pickupexten_StopToken);
            }
        }

        public String featuredigittimeout_StartToken;

        public String featuredigittimeout_StopToken;

        public void writefeaturedigittimeout(StringBuffer strB,
                Featuresconf impl) {
            if (impl.getFeaturedigittimeout() != null
                    && featuredigittimeout_StartToken != null) {
                strB.append(featuredigittimeout_StartToken).append(
                        impl.getFeaturedigittimeout()).append(
                        featuredigittimeout_StopToken);
            }
        }
    }; // end of FeaturesconfwriteHelper Declaration

    /** der Token speicher um zu writen * */
    protected class FeaturemapwriteHelper {

        public String blindxfer_StartToken;

        public String blindxfer_StopToken;

        public void writeblindxfer(StringBuffer strB, Featuremap impl) {
            if (impl.getBlindxfer() != null && blindxfer_StartToken != null) {
                strB.append(blindxfer_StartToken).append(impl.getBlindxfer())
                        .append(blindxfer_StopToken);
            }
        }

        public String disconnect_StartToken;

        public String disconnect_StopToken;

        public void writedisconnect(StringBuffer strB, Featuremap impl) {
            if (impl.getDisconnect() != null && disconnect_StartToken != null) {
                strB.append(disconnect_StartToken).append(impl.getDisconnect())
                        .append(disconnect_StopToken);
            }
        }

        public String automon_StartToken;

        public String automon_StopToken;

        public void writeautomon(StringBuffer strB, Featuremap impl) {
            if (impl.getAutomon() != null && automon_StartToken != null) {
                strB.append(automon_StartToken).append(impl.getAutomon())
                        .append(automon_StopToken);
            }
        }

        public String atxfer_StartToken;

        public String atxfer_StopToken;

        public void writeatxfer(StringBuffer strB, Featuremap impl) {
            if (impl.getAtxfer() != null && atxfer_StartToken != null) {
                strB.append(atxfer_StartToken).append(impl.getAtxfer()).append(
                        atxfer_StopToken);
            }
        }
    }; // end of FeaturemapwriteHelper Declaration

    protected FeaturesconfwriteHelper theFeaturesconfwriteHelper;

    protected FeaturemapwriteHelper theFeaturemapwriteHelper;

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
        if (data instanceof Featuresconf) {
            writeFeaturesconf(strB, (Featuresconf) data);
            return;
        }
        if (data instanceof Featuremap) {
            writeFeaturemap(strB, (Featuremap) data);
            return;
        }
    }

    /**
     * schreibt die Felder von Featuresconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturesconfFields(StringBuffer strB, Featuresconf impl) {

        // felder schreiben
        theFeaturesconfwriteHelper.writeparkext(strB, impl);
        theFeaturesconfwriteHelper.writeparkpos(strB, impl);
        theFeaturesconfwriteHelper.writecontext(strB, impl);
        theFeaturesconfwriteHelper.writeparkingtime(strB, impl);
        theFeaturesconfwriteHelper.writetransferdigittimeout(strB, impl);
        theFeaturesconfwriteHelper.writecourtesytone(strB, impl);
        theFeaturesconfwriteHelper.writexfersound(strB, impl);
        theFeaturesconfwriteHelper.writexferfailsound(strB, impl);
        theFeaturesconfwriteHelper.writeadsipark(strB, impl);
        theFeaturesconfwriteHelper.writepickupexten(strB, impl);
        theFeaturesconfwriteHelper.writefeaturedigittimeout(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Featuresconf
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturesconfAggregates(StringBuffer strB,
            Featuresconf impl) {

        // aggregate schreiben
        // Featuremap
        writeFeaturemap(strB, impl.getFeaturemap());
        // maps schreiben

    }

    /**
     * schreibt ein Featuresconf Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturesconf(StringBuffer strB, Featuresconf impl) {
        writeFeaturesconfFields(strB, impl);
        writeFeaturesconfAggregates(strB, impl);

    }

    /**
     * schreibt die Felder von Featuremap
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturemapFields(StringBuffer strB, Featuremap impl) {

        // felder schreiben
        theFeaturemapwriteHelper.writeblindxfer(strB, impl);
        theFeaturemapwriteHelper.writedisconnect(strB, impl);
        theFeaturemapwriteHelper.writeautomon(strB, impl);
        theFeaturemapwriteHelper.writeatxfer(strB, impl);

    }

    /**
     * schreibt die Aggregierten Objekte von Featuremap
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturemapAggregates(StringBuffer strB, Featuremap impl) {

        // aggregate schreiben
        // maps schreiben

    }

    /**
     * schreibt ein Featuremap Objekt
     * 
     * @param strB
     * @param msec
     */
    protected void writeFeaturemap(StringBuffer strB, Featuremap impl) {
        writeFeaturemapFields(strB, impl);
        writeFeaturemapAggregates(strB, impl);

    }

    protected void initHelper() {
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

}
