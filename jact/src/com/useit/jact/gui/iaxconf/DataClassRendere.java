/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.iaxconf;

import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.Iaxregister;

// import com.beronet.App.CSS.model.dataModel.Iaxregister;
// import com.beronet.App.CSS.model.dataModel.Iaxdeny;
// import com.beronet.App.CSS.model.dataModel.Iaxpermit;
// import com.beronet.App.CSS.model.dataModel.Iaxgeneral;
// import com.beronet.App.CSS.model.dataModel.Iaxpeer;
// import com.beronet.App.CSS.model.dataModel.Iaxjitter;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.5 2006/01/05
 *          12:57:44 urs Exp $
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
     * gibt den string des Datenobjectes zurück für Iaxregister
     */
    public abstract String displayString(Iaxregister aIaxregister);// {

    // return aIaxregister == null ? "" : aIaxregister.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Iaxdeny
     */
    public abstract String displayString(Iaxdeny aIaxdeny);// {

    // return aIaxdeny == null ? "" : aIaxdeny.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Iaxpermit
     */
    public abstract String displayString(Iaxpermit aIaxpermit);// {

    // return aIaxpermit == null ? "" : aIaxpermit.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Iaxgeneral
     */
    public abstract String displayString(Iaxgeneral aIaxgeneral);// {

    // return aIaxgeneral == null ? "" : aIaxgeneral.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Iaxpeer
     */
    public abstract String displayString(Iaxpeer aIaxpeer);// {

    // return aIaxpeer == null ? "" : aIaxpeer.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Iaxjitter
     */
    public abstract String displayString(Iaxjitter aIaxjitter);// {

    // return aIaxjitter == null ? "" : aIaxjitter.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Iaxregister)
            return getInstance().displayString((Iaxregister) obj);
        if (obj instanceof Iaxdeny)
            return getInstance().displayString((Iaxdeny) obj);
        if (obj instanceof Iaxpermit)
            return getInstance().displayString((Iaxpermit) obj);
        if (obj instanceof Iaxgeneral)
            return getInstance().displayString((Iaxgeneral) obj);
        if (obj instanceof Iaxpeer)
            return getInstance().displayString((Iaxpeer) obj);
        if (obj instanceof Iaxjitter)
            return getInstance().displayString((Iaxjitter) obj);
        return obj.toString();
    }
}
