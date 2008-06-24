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
     * gibt den string des Datenobjectes zurück für Iaxregister
     */
    public String displayString(Iaxregister aIaxregister) {
        return aIaxregister == null ? "" : aIaxregister.getUser() + "@"
                + aIaxregister.getHost(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Iaxdeny
     */
    public String displayString(Iaxdeny aIaxdeny) {
        return aIaxdeny == null ? "" : aIaxdeny.getValue(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Iaxpermit
     */
    public String displayString(Iaxpermit aIaxpermit) {
        return aIaxpermit == null ? "" : aIaxpermit.getValue(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Iaxgeneral
     */
    public String displayString(Iaxgeneral aIaxgeneral) {
        return aIaxgeneral == null ? "" : "IAX General"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Iaxpeer
     */
    public String displayString(Iaxpeer aIaxpeer) {
        return aIaxpeer == null ? "" : aIaxpeer.getIaxpeername(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Iaxjitter
     */
    public String displayString(Iaxjitter aIaxjitter) {
        return aIaxjitter == null ? "" : "IAXjitter"; // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Iaxregister
    // */
    // public String displayString(IaxregisterMap aIaxregisterMap){
    // return aIaxregisterMap == null ? "" : "register"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Iaxdeny
    // */
    // public String displayString(IaxdenyMap aIaxdenyMap){
    // return aIaxdenyMap == null ? "" : "deny"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Iaxpermit
    // */
    // public String displayString(IaxpermitMap aIaxpermitMap){
    // return aIaxpermitMap == null ? "" : "permit"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Iaxgeneral
    // */
    // public String displayString(IaxgeneralMap aIaxgeneralMap){
    // return aIaxgeneralMap == null ? "" : "generals"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Iaxpeer
    // */
    // public String displayString(IaxpeerMap aIaxpeerMap){
    // return aIaxpeerMap == null ? "" : "IAXpeers"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Iaxjitter
    // */
    // public String displayString(IaxjitterMap aIaxjitterMap){
    // return aIaxjitterMap == null ? "" : "jitters"; //"DataObjectName";
    // }
}
