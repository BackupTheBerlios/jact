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
package com.useit.jact.gui.misdnconf;

import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.Misdnconf;

// import com.beronet.App.CSS.model.dataModel.Misdnconf;
// import com.beronet.App.CSS.model.dataModel.MisdnCryptkey;
// import com.beronet.App.CSS.model.dataModel.MisdnSections;
/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.4 2006/01/05
 *          12:57:44 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Misdnconf
     */
    public String displayString(Misdnconf aMisdnconf) {
        return aMisdnconf == null ? "" : "Misdn conf"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für MisdnCryptkey
     */
    public String displayString(MisdnCryptkey aMisdnCryptkey) {
        return aMisdnCryptkey == null ? "" : "cryptkeys"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für MisdnSections
     */
    public String displayString(MisdnSections aMisdnSections) {
        return aMisdnSections == null ? "" : aMisdnSections.getSectionname(); // "DataObjectName";
    }

    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Misdnconf
    // */
    // public String displayString(MisdnconfMap aMisdnconfMap){
    // return aMisdnconfMap == null ? "" : "configs"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für MisdnCryptkey
    // */
    // public String displayString(MisdnCryptkeyMap aMisdnCryptkeyMap){
    // return aMisdnCryptkeyMap == null ? "" : "krypt Keys"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für MisdnSections
    // */
    // public String displayString(MisdnSectionsMap aMisdnSectionsMap){
    // return aMisdnSectionsMap == null ? "" : "sections"; //"DataObjectName";
    // }
    //
    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.gui.misdnconf.DataClassRendere#displayString(com.useit.jact.model.misdnconf.MisdnPorts)
     */
    public String displayString(MisdnPorts aMisdnPorts) {
        return aMisdnPorts == null ? "" : aMisdnPorts.toString(); // "DataObjectName";
    }
    //
    // /* (non-Javadoc)
    // * @see
    // com.useit.jact.gui.misdnconf.DataClassRendere#displayString(com.useit.jact.model.misdnconf.MisdnPortsMap)
    // */
    // public String displayString(MisdnPortsMap aMisdnPortsMap) {
    // return aMisdnPortsMap == null ? "" : "ports"; //"DataObjectName";
    // }
}
