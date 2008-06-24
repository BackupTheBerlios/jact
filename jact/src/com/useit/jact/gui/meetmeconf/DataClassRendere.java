/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.meetmeconf;

import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;

// import com.beronet.App.CSS.model.dataModel.Meetmerooms;
// import com.beronet.App.CSS.model.dataModel.Meetmeconf;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.5 2006/01/05
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
     * gibt den string des Datenobjectes zurück für Meetmerooms
     */
    public abstract String displayString(Meetmerooms aMeetmerooms);// {

    // return aMeetmerooms == null ? "" : aMeetmerooms.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Meetmeconf
     */
    public abstract String displayString(Meetmeconf aMeetmeconf);// {

    // return aMeetmeconf == null ? "" : aMeetmeconf.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Meetmerooms)
            return getInstance().displayString((Meetmerooms) obj);
        if (obj instanceof Meetmeconf)
            return getInstance().displayString((Meetmeconf) obj);
        return obj.toString();
    }
}
