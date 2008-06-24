/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdnconf;

import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;

// import com.beronet.App.CSS.model.dataModel.MisdnCryptkey;
// import com.beronet.App.CSS.model.dataModel.MisdnPorts;
// import com.beronet.App.CSS.model.dataModel.MisdnSections;
// import com.beronet.App.CSS.model.dataModel.Misdnconf;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.8 2006/01/05
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
     * gibt den string des Datenobjectes zurück für MisdnCryptkey
     */
    public abstract String displayString(MisdnCryptkey aMisdnCryptkey);// {

    // return aMisdnCryptkey == null ? "" : aMisdnCryptkey.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für MisdnPorts
     */
    public abstract String displayString(MisdnPorts aMisdnPorts);// {

    // return aMisdnPorts == null ? "" : aMisdnPorts.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für MisdnSections
     */
    public abstract String displayString(MisdnSections aMisdnSections);// {

    // return aMisdnSections == null ? "" : aMisdnSections.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Misdnconf
     */
    public abstract String displayString(Misdnconf aMisdnconf);// {

    // return aMisdnconf == null ? "" : aMisdnconf.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof MisdnCryptkey)
            return getInstance().displayString((MisdnCryptkey) obj);
        if (obj instanceof MisdnPorts)
            return getInstance().displayString((MisdnPorts) obj);
        if (obj instanceof MisdnSections)
            return getInstance().displayString((MisdnSections) obj);
        if (obj instanceof Misdnconf)
            return getInstance().displayString((Misdnconf) obj);
        return obj.toString();
    }
}
