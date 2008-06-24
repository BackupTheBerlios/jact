/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.alarmreciverconf;

import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;

// import com.beronet.App.CSS.model.dataModel.Alarmreceiverconf;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.3 2006/01/05
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
     * gibt den string des Datenobjectes zurück für Alarmreceiverconf
     */
    public abstract String displayString(Alarmreceiverconf aAlarmreceiverconf);// {

    // return aAlarmreceiverconf == null ? "" : aAlarmreceiverconf.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Alarmreceiverconf)
            return getInstance().displayString((Alarmreceiverconf) obj);
        return obj.toString();
    }
}
