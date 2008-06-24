/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.alarmreciverconf;

import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;

/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.4 2006/03/17
 *          10:42:52 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Alarmreceiverconf
     */
    public String displayString(Alarmreceiverconf aAlarmreceiverconf) {
        return aAlarmreceiverconf == null ? "" : "Alarmreciver Config";// aAlarmreceiverconf.toString();
                                                                        // //"DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Alarmreceiverconf
    // */
    // public String displayString(AlarmreceiverconfMap aAlarmreceiverconfMap){
    // return aAlarmreceiverconfMap == null ? "" :
    // aAlarmreceiverconfMap.toString(); //"DataObjectName";
    // }
}
