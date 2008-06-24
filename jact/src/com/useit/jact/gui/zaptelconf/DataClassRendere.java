/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.zaptelconf;

import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

// import com.beronet.App.CSS.model.dataModel.Zapteltonezone;
// import com.beronet.App.CSS.model.dataModel.Zaptelchannels;
// import com.beronet.App.CSS.model.dataModel.Zaptelconf;
// import com.beronet.App.CSS.model.dataModel.Zapteldynamicspan;
// import com.beronet.App.CSS.model.dataModel.Zaptelspan;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.6 2006/01/05
 *          12:57:42 urs Exp $
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
     * gibt den string des Datenobjectes zurück für Zapteltonezone
     */
    public abstract String displayString(Zapteltonezone aZapteltonezone);// {

    // return aZapteltonezone == null ? "" : aZapteltonezone.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zaptelchannels
     */
    public abstract String displayString(Zaptelchannels aZaptelchannels);// {

    // return aZaptelchannels == null ? "" : aZaptelchannels.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zaptelconf
     */
    public abstract String displayString(Zaptelconf aZaptelconf);// {

    // return aZaptelconf == null ? "" : aZaptelconf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zapteldynamicspan
     */
    public abstract String displayString(Zapteldynamicspan aZapteldynamicspan);// {

    // return aZapteldynamicspan == null ? "" : aZapteldynamicspan.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zaptelspan
     */
    public abstract String displayString(Zaptelspan aZaptelspan);// {

    // return aZaptelspan == null ? "" : aZaptelspan.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Zapteltonezone)
            return getInstance().displayString((Zapteltonezone) obj);
        if (obj instanceof Zaptelchannels)
            return getInstance().displayString((Zaptelchannels) obj);
        if (obj instanceof Zaptelconf)
            return getInstance().displayString((Zaptelconf) obj);
        if (obj instanceof Zapteldynamicspan)
            return getInstance().displayString((Zapteldynamicspan) obj);
        if (obj instanceof Zaptelspan)
            return getInstance().displayString((Zaptelspan) obj);
        return obj.toString();
    }
}
