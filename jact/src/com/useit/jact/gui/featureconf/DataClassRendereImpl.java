/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.featureconf;

import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.6 2006/01/29
 *          12:03:56 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Featuresconf
     */
    public String displayString(Featuresconf aFeaturesconf) {
        return aFeaturesconf == null ? "" : "Features Config";// aFeaturesconf.toString();
                                                                // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Featuremap
     */
    public String displayString(Featuremap aFeaturemap) {
        return aFeaturemap == null ? "" : "Feature Map"; // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Featuresconf
    // */
    // public String displayString(FeaturesconfMap aFeaturesconfMap){
    // return aFeaturesconfMap == null ? "" : aFeaturesconfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Featuremap
    // */
    // public String displayString(FeaturemapMap aFeaturemapMap){
    // return aFeaturemapMap == null ? "" : aFeaturemapMap.toString();
    // //"DataObjectName";
    // }
}
