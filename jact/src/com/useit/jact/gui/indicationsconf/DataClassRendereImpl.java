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
package com.useit.jact.gui.indicationsconf;

import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

// import com.beronet.App.CSS.model.dataModel.ToneDefinitions;
// import com.beronet.App.CSS.model.dataModel.Indicationsconf;
// import com.beronet.App.CSS.model.dataModel.CustomTone;
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
     * gibt den string des Datenobjectes zurück für ToneDefinitions
     */
    public String displayString(ToneDefinitions aToneDefinitions) {
        return aToneDefinitions == null ? "" : aToneDefinitions.toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Indicationsconf
     */
    public String displayString(Indicationsconf aIndicationsconf) {
        return aIndicationsconf == null ? "" : "indications conf"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für CustomTone
     */
    public String displayString(CustomTone aCustomTone) {
        return aCustomTone == null ? "" : aCustomTone.toString(); // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für ToneDefinitions
    // */
    // public String displayString(ToneDefinitionsMap aToneDefinitionsMap){
    // return aToneDefinitionsMap == null ? "" : "tonedefs"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Indicationsconf
    // */
    // public String displayString(IndicationsconfMap aIndicationsconfMap){
    // return aIndicationsconfMap == null ? "" : "indicatoion configs";
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für CustomTone
    // */
    // public String displayString(CustomToneMap aCustomToneMap){
    // return aCustomToneMap == null ? "" : "custome tones"; //"DataObjectName";
    // }
}
