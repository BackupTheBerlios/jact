/*
 * (c) urs zeidler
 */
package com.useit.jact.io.featureconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.FeaturemapImpl;
import com.useit.jact.model.featureconf.Featuresconf;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.7 2006/03/17 10:42:52 urs
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
    protected List getWorkingFeaturesconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Featuresconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Featuresconf buildFeaturesconfModelElement(List aEntryList) {
        Featuresconf impl = new FeaturesconfImpl();
        buildFeaturesconfModelVaues(aEntryList, impl);
        buildFeaturesconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildFeaturesconfModelAgg(List entryList, Featuresconf impl) {

        // aggregate schreiben
        // Featuremap
        Featuremap aFeaturemap = buildFeaturemapModelElement(entryList);
        impl.setFeaturemap(aFeaturemap);
        // writeFeaturemap(strB, impl.getFeaturemap());
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildFeaturesconfModelVaues(List entryList, Featuresconf impl) {
        String val = null;
        val = findConfValue("parkext", entryList);
        if (val != null)
            impl.setParkext(val);

        val = findConfValue("parkpos", entryList);
        if (val != null)
            impl.setParkpos(val);

        val = findConfValue("context", entryList);
        if (val != null)
            impl.setContext(new PbxContext(val));

        val = findConfValue("parkingtime", entryList);
        if (val != null)
            impl.setParkingtime(new Integer(val));

        val = findConfValue("transferdigittimeout", entryList);
        if (val != null)
            impl.setTransferdigittimeout(new Integer(val));

        val = findConfValue("courtesytone", entryList);
        if (val != null)
            impl.setCourtesytone(val);

        val = findConfValue("xfersound", entryList);
        if (val != null)
            impl.setXfersound(val);

        val = findConfValue("xferfailsound", entryList);
        if (val != null)
            impl.setXferfailsound(val);

        val = findConfValue("adsipark", entryList);
        if (val != null)
            impl.setAdsipark(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("pickupexten", entryList);
        if (val != null)
            impl.setPickupexten(val);

        val = findConfValue("featuredigittimeout", entryList);
        if (val != null)
            impl.setFeaturedigittimeout(new Integer(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingFeaturemapEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Featuremap objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Featuremap buildFeaturemapModelElement(List aEntryList) {
        Featuremap impl = new FeaturemapImpl();
        buildFeaturemapModelVaues(aEntryList, impl);
        buildFeaturemapModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildFeaturemapModelAgg(List entryList, Featuremap impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildFeaturemapModelVaues(List entryList, Featuremap impl) {
        String val = null;
        val = findConfValue("blindxfer", entryList);
        if (val != null)
            impl.setBlindxfer(val);

        val = findConfValue("disconnect", entryList);
        if (val != null)
            impl.setDisconnect(val);

        val = findConfValue("automon", entryList);
        if (val != null)
            impl.setAutomon(val);

        val = findConfValue("atxfer", entryList);
        if (val != null)
            impl.setAtxfer(val);

    }

}
