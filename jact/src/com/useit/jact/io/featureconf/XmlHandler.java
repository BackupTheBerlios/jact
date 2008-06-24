/*
 * (c) urs zeidler
 */
package com.useit.jact.io.featureconf;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.FeaturemapImpl;
import com.useit.jact.model.featureconf.Featuresconf;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * XmlHandler, eine SAX Handler implementierung<br>
 * 
 * </br>
 * </p>
 * Created : 15.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: XmlHandler.java,v 1.7 2006/01/12 15:20:11 urs
 *          Exp $
 */
public class XmlHandler extends DefaultHandler {
    protected Featuresconf currentFeaturesconf = null;

    protected Featuremap currentFeaturemap = null;

    /**
     * 
     */
    public XmlHandler() {
        super();
    }

    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equals("Featuresconf")) {
            endFeaturesconf();
        }
        if (qName.equals("Featuremap")) {
            endFeaturemap();
        }

        super.endElement(uri, localName, qName);
    }

    /**
     * 
     */
    private void endFeaturesconf() {
        currentFeaturesconf = null;

    }

    /**
     * 
     */
    private void endFeaturemap() {
        currentFeaturemap = null;

    }

    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {

        if (qName.equals("Featuresconf")) {
            currentFeaturesconf = readFeaturesconf(attributes);
            linkFeaturesconf();
        }
        if (qName.equals("Featuremap")) {
            currentFeaturemap = readFeaturemap(attributes);
            linkFeaturemap();
        }

        super.startElement(uri, localName, qName, attributes);
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Featuremap
     */
    protected void linkFeaturemap() {

    }

    /**
     * lieﬂt die klasse Featuremap ein
     * 
     * @param attributes
     * @return Featuremap
     */
    protected Featuremap readFeaturemap(Attributes attributes) {
        FeaturemapImpl obj = new FeaturemapImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("blindxfer");
        if (val != null)
            obj.setBlindxfer(val);

        val = attributes.getValue("disconnect");
        if (val != null)
            obj.setDisconnect(val);

        val = attributes.getValue("automon");
        if (val != null)
            obj.setAutomon(val);

        val = attributes.getValue("atxfer");
        if (val != null)
            obj.setAtxfer(val);

        // finished reading attibutes of Featuremap
        return obj;
    }

    /**
     * gibt gelegenheit ein fertiges objekt vom Typen ${class.JavaClassName} in
     * den Objektbaum aufzunehmen.
     * 
     * @param attributes
     * @return Featuresconf
     */
    protected void linkFeaturesconf() {

    }

    /**
     * lieﬂt die klasse Featuresconf ein
     * 
     * @param attributes
     * @return Featuresconf
     */
    protected Featuresconf readFeaturesconf(Attributes attributes) {
        FeaturesconfImpl obj = new FeaturesconfImpl();
        // felder schreiben
        String val;
        val = attributes.getValue("parkext");
        if (val != null)
            obj.setParkext(val);

        val = attributes.getValue("parkpos");
        if (val != null)
            obj.setParkpos(val);

        val = attributes.getValue("context");
        if (val != null)
            obj.setContext(new PbxContext(val));

        val = attributes.getValue("parkingtime");
        if (val != null)
            obj.setParkingtime(new Integer(val));

        val = attributes.getValue("transferdigittimeout");
        if (val != null)
            obj.setTransferdigittimeout(new Integer(val));

        val = attributes.getValue("courtesytone");
        if (val != null)
            obj.setCourtesytone(val);

        val = attributes.getValue("xfersound");
        if (val != null)
            obj.setXfersound(val);

        val = attributes.getValue("xferfailsound");
        if (val != null)
            obj.setXferfailsound(val);

        val = attributes.getValue("adsipark");
        if (val != null)
            obj.setAdsipark(new Boolean(val));

        val = attributes.getValue("pickupexten");
        if (val != null)
            obj.setPickupexten(val);

        val = attributes.getValue("featuredigittimeout");
        if (val != null)
            obj.setFeaturedigittimeout(new Integer(val));

        // finished reading attibutes of Featuresconf
        return obj;
    }

}
