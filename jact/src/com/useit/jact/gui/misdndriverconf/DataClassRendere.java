/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdndriverconf;

import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

// import com.beronet.App.CSS.model.dataModel.MisdnCards;
// import com.beronet.App.CSS.model.dataModel.MisdnDriverConf;
// import com.beronet.App.CSS.model.dataModel.MisdncardPorts;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.4 2006/01/05
 *          12:57:41 urs Exp $
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
     * gibt den string des Datenobjectes zurück für MisdnCards
     */
    public abstract String displayString(MisdnCards aMisdnCards);// {

    // return aMisdnCards == null ? "" : aMisdnCards.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für MisdnDriverConf
     */
    public abstract String displayString(MisdnDriverConf aMisdnDriverConf);// {

    // return aMisdnDriverConf == null ? "" : aMisdnDriverConf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für MisdncardPorts
     */
    public abstract String displayString(MisdncardPorts aMisdncardPorts);// {

    // return aMisdncardPorts == null ? "" : aMisdncardPorts.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof MisdnCards)
            return getInstance().displayString((MisdnCards) obj);
        if (obj instanceof MisdnDriverConf)
            return getInstance().displayString((MisdnDriverConf) obj);
        if (obj instanceof MisdncardPorts)
            return getInstance().displayString((MisdncardPorts) obj);
        return obj.toString();
    }
}
