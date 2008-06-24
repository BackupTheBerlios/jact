/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.featureconf;

import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.Featuresconf;

// import com.beronet.App.CSS.model.dataModel.Featuresconf;
// import com.beronet.App.CSS.model.dataModel.Featuremap;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.5 2006/01/05
 *          12:57:43 urs Exp $
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
     * gibt den string des Datenobjectes zurück für Featuresconf
     */
    public abstract String displayString(Featuresconf aFeaturesconf);// {

    // return aFeaturesconf == null ? "" : aFeaturesconf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Featuremap
     */
    public abstract String displayString(Featuremap aFeaturemap);// {

    // return aFeaturemap == null ? "" : aFeaturemap.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Featuresconf)
            return getInstance().displayString((Featuresconf) obj);
        if (obj instanceof Featuremap)
            return getInstance().displayString((Featuremap) obj);
        return obj.toString();
    }
}
