/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.sipconf;

import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.Sipallow;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.Sipdisallow;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.Sipregister;

// import com.beronet.App.CSS.model.dataModel.Disallow;
// import com.beronet.App.CSS.model.dataModel.SipConf;
// import com.beronet.App.CSS.model.dataModel.Sipgeneral;
// import com.beronet.App.CSS.model.dataModel.Allow;
// import com.beronet.App.CSS.model.dataModel.Register;
// import com.beronet.App.CSS.model.dataModel.Sippeers;
/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.7 2006/01/29
 *          12:03:54 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Disallow
     */
    public String displayString(Sipdisallow aDisallow) {
        if (aDisallow == null)
            return "";
        return aDisallow.getValue() == null ? "" : aDisallow.getValue()
                .toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für SipConf
     */
    public String displayString(SipConf aSipConf) {
        return aSipConf == null ? "" : "sipconf"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Sipgeneral
     */
    public String displayString(Sipgeneral aSipgeneral) {
        return aSipgeneral == null ? "" : "general"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Allow
     */
    public String displayString(Sipallow aAllow) {
        if (aAllow == null)
            return "";
        return aAllow.getValue() == null ? "" : aAllow.getValue().toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Register
     */
    public String displayString(Sipregister aRegister) {
        return aRegister == null ? "" : aRegister.getUser() + "@"
                + aRegister.getHost(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Sippeers
     */
    public String displayString(Sippeers aSippeers) {
        return aSippeers == null ? "" : aSippeers.getSectionname(); // "DataObjectName";
    }

    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Disallow
    // */
    // public String displayString(SipdisallowMap aDisallowMap){
    // return aDisallowMap == null ? "" : "disallow"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für SipConf
    // */
    // public String displayString(SipConfMap aSipConfMap){
    // return aSipConfMap == null ? "" : "sipconfigs"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Sipgeneral
    // */
    // public String displayString(SipgeneralMap aSipgeneralMap){
    // return aSipgeneralMap == null ? "" : aSipgeneralMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Allow
    // */
    // public String displayString(SipallowMap aAllowMap){
    // return aAllowMap == null ? "" : "allow"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Register
    // */
    // public String displayString(SipregisterMap aRegisterMap){
    // return aRegisterMap == null ? "" : "register"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Sippeers
    // */
    // public String displayString(SippeersMap aSippeersMap){
    // return aSippeersMap == null ? "" : "peers"; //"DataObjectName";
    // }

    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.gui.sipconf.DataClassRendere#displayString(com.useit.jact.model.sipconf.Sipauth)
     */
    public String displayString(Sipauth aSipauth) {
        return aSipauth == null ? "" : aSipauth.getUser() + "@"
                + aSipauth.getRealm(); // "DataObjectName";
    }

    // /* (non-Javadoc)
    // * @see
    // com.useit.jact.gui.sipconf.DataClassRendere#displayString(com.useit.jact.model.sipconf.SipauthMap)
    // */
    // public String displayString(SipauthMap aSipauthMap) {
    // return aSipauthMap == null ? "" : "auths"; //"DataObjectName";
    // }
}
