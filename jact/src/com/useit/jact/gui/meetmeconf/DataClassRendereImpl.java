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
package com.useit.jact.gui.meetmeconf;

import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;

// import com.beronet.App.CSS.model.dataModel.Meetmeconf;
// import com.beronet.App.CSS.model.dataModel.Meetmerooms;
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
     * gibt den string des Datenobjectes zurück für Meetmeconf
     */
    public String displayString(Meetmeconf aMeetmeconf) {
        return aMeetmeconf == null ? "" : "meetme config";// aMeetmeconf.toString();
                                                            // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Meetmerooms
     */
    public String displayString(Meetmerooms aMeetmerooms) {
        return aMeetmerooms == null ? "" : aMeetmerooms.getConfno(); // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Meetmeconf
    // */
    // public String displayString(MeetmeconfMap aMeetmeconfMap){
    // return aMeetmeconfMap == null ? "" : aMeetmeconfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Meetmerooms
    // */
    // public String displayString(MeetmeroomsMap aMeetmeroomsMap){
    // return aMeetmeroomsMap == null ? "" : "rooms"; //"DataObjectName";
    // }
}
