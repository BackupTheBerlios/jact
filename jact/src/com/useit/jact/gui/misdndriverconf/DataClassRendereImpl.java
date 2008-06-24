/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.misdndriverconf;

import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;

/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.2 2006/01/05
 *          12:57:41 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für MisdnCards
     */
    public String displayString(MisdnCards aMisdnCards) {
        return aMisdnCards == null ? "" : aMisdnCards.toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für MisdnDriverConf
     */
    public String displayString(MisdnDriverConf aMisdnDriverConf) {
        return aMisdnDriverConf == null ? "" : aMisdnDriverConf.toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für MisdncardPorts
     */
    public String displayString(MisdncardPorts aMisdncardPorts) {
        return aMisdncardPorts == null ? "" : aMisdncardPorts.toString(); // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für MisdnCards
    // */
    // public String displayString(MisdnCardsMap aMisdnCardsMap){
    // return aMisdnCardsMap == null ? "" : aMisdnCardsMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für MisdnDriverConf
    // */
    // public String displayString(MisdnDriverConfMap aMisdnDriverConfMap){
    // return aMisdnDriverConfMap == null ? "" : aMisdnDriverConfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für MisdncardPorts
    // */
    // public String displayString(MisdncardPortsMap aMisdncardPortsMap){
    // return aMisdncardPortsMap == null ? "" : aMisdncardPortsMap.toString();
    // //"DataObjectName";
    // }
}
