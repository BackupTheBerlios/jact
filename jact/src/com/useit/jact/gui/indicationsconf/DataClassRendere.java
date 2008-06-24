/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.indicationsconf;

import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

// import com.beronet.App.CSS.model.dataModel.ToneDefinitions;
// import com.beronet.App.CSS.model.dataModel.Indicationsconf;
// import com.beronet.App.CSS.model.dataModel.CustomTone;
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
     * gibt den string des Datenobjectes zurück für ToneDefinitions
     */
    public abstract String displayString(ToneDefinitions aToneDefinitions);// {

    // return aToneDefinitions == null ? "" : aToneDefinitions.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Indicationsconf
     */
    public abstract String displayString(Indicationsconf aIndicationsconf);// {

    // return aIndicationsconf == null ? "" : aIndicationsconf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für CustomTone
     */
    public abstract String displayString(CustomTone aCustomTone);// {

    // return aCustomTone == null ? "" : aCustomTone.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof ToneDefinitions)
            return getInstance().displayString((ToneDefinitions) obj);
        if (obj instanceof Indicationsconf)
            return getInstance().displayString((Indicationsconf) obj);
        if (obj instanceof CustomTone)
            return getInstance().displayString((CustomTone) obj);
        return obj.toString();
    }
}
