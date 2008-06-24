/*
 * (c) urs zeidler
 */
package com.useit.jact.io.featureconf;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

/**
 * <p>
 * XmlWriter
 * </p>
 * Created : 07.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlWriter.java,v 1.6 2006/01/09 10:17:46 urs
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
        if (data instanceof Featuresconf) {
            return writeFeaturesconf(doc, (Featuresconf) data);
        }
        if (data instanceof Featuremap) {
            return writeFeaturemap(doc, (Featuremap) data);
        }
        return null;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeFeaturesconf(Document doc, Featuresconf impl) {
        Element xFeaturesconf = doc.createElement("Featuresconf");

        // felder schreiben
        if (impl.getParkext() != null)
            xFeaturesconf.setAttribute("parkext", impl.getParkext().toString());
        if (impl.getParkpos() != null)
            xFeaturesconf.setAttribute("parkpos", impl.getParkpos().toString());
        if (impl.getContext() != null)
            xFeaturesconf.setAttribute("context", impl.getContext().toString());
        if (impl.getParkingtime() != null)
            xFeaturesconf.setAttribute("parkingtime", impl.getParkingtime()
                    .toString());
        if (impl.getTransferdigittimeout() != null)
            xFeaturesconf.setAttribute("transferdigittimeout", impl
                    .getTransferdigittimeout().toString());
        if (impl.getCourtesytone() != null)
            xFeaturesconf.setAttribute("courtesytone", impl.getCourtesytone()
                    .toString());
        if (impl.getXfersound() != null)
            xFeaturesconf.setAttribute("xfersound", impl.getXfersound()
                    .toString());
        if (impl.getXferfailsound() != null)
            xFeaturesconf.setAttribute("xferfailsound", impl.getXferfailsound()
                    .toString());
        if (impl.getAdsipark() != null)
            xFeaturesconf.setAttribute("adsipark", impl.getAdsipark()
                    .toString());
        if (impl.getPickupexten() != null)
            xFeaturesconf.setAttribute("pickupexten", impl.getPickupexten()
                    .toString());
        if (impl.getFeaturedigittimeout() != null)
            xFeaturesconf.setAttribute("featuredigittimeout", impl
                    .getFeaturedigittimeout().toString());
        // aggregate schreiben
        Element xFeaturemapAgg = writeFeaturemap(doc, impl.getFeaturemap());
        xFeaturesconf.appendChild(xFeaturemapAgg);

        doc.appendChild(xFeaturesconf);
        return xFeaturesconf;
    }

    /**
     * @param strB
     * @param msec
     */
    public static Element writeFeaturemap(Document doc, Featuremap impl) {
        Element xFeaturemap = doc.createElement("Featuremap");

        // felder schreiben
        if (impl.getBlindxfer() != null)
            xFeaturemap.setAttribute("blindxfer", impl.getBlindxfer()
                    .toString());
        if (impl.getDisconnect() != null)
            xFeaturemap.setAttribute("disconnect", impl.getDisconnect()
                    .toString());
        if (impl.getAutomon() != null)
            xFeaturemap.setAttribute("automon", impl.getAutomon().toString());
        if (impl.getAtxfer() != null)
            xFeaturemap.setAttribute("atxfer", impl.getAtxfer().toString());
        // aggregate schreiben

        doc.appendChild(xFeaturemap);
        return xFeaturemap;
    }
}
