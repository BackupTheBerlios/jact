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
package com.useit.jact.gui.voicemailconf;

import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;

// import com.beronet.App.CSS.model.dataModel.Voicemailgeneral;
// import com.beronet.App.CSS.model.dataModel.VoicemailConf;
// import com.beronet.App.CSS.model.dataModel.ZoneMessageSection;
// import com.beronet.App.CSS.model.dataModel.Zonemessages;
// import com.beronet.App.CSS.model.dataModel.Voicemailcontext;
// import com.beronet.App.CSS.model.dataModel.Voicemailcontextentry;
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
 *          12:57:42 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Voicemailgeneral
     */
    public String displayString(Voicemailgeneral aVoicemailgeneral) {
        return aVoicemailgeneral == null ? "" : "general"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für VoicemailConf
     */
    public String displayString(VoicemailConf aVoicemailConf) {
        return aVoicemailConf == null ? "" : "voicemail conf"; // "DataObjectName";
    }

    // /**
    // * gibt den string des Datenobjectes zurück
    // * für ZoneMessageSection
    // */
    // public String displayString(ZoneMessageSection aZoneMessageSection){
    // return aZoneMessageSection == null ? "" : aZoneMessageSection.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zonemessages
     */
    public String displayString(Zonemessages aZonemessages) {
        return aZonemessages == null ? "" : "zonemessages"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Voicemailcontext
     */
    public String displayString(Voicemailcontext aVoicemailcontext) {
        return aVoicemailcontext == null ? "" : aVoicemailcontext
                .getContextname(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Voicemailcontextentry
     */
    public String displayString(Voicemailcontextentry aVoicemailcontextentry) {
        return aVoicemailcontextentry == null ? "" : aVoicemailcontextentry
                .getUser_name(); // "DataObjectName";
        // return aVoicemailcontextentry == null ? "" :
        // aVoicemailcontextentry.toString(); //"DataObjectName";
    }
    /**
     * // * gibt den string des Datenobjectes zurück // * für Voicemailgeneral //
     */
    // public String displayString(VoicemailgeneralMap aVoicemailgeneralMap){
    // return aVoicemailgeneralMap == null ? "" :
    // aVoicemailgeneralMap.toString(); //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für VoicemailConf
    // */
    // public String displayString(VoicemailConfMap aVoicemailConfMap){
    // return aVoicemailConfMap == null ? "" : aVoicemailConfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für ZoneMessageSection
    // */
    // public String displayString(ZoneMessageSectionMap
    // aZoneMessageSectionMap){
    // return aZoneMessageSectionMap == null ? "" : "ZoneMessageEntrys";
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zonemessages
    // */
    // public String displayString(ZonemessagesMap aZonemessagesMap){
    // return aZonemessagesMap == null ? "" : "ZoneMessages";
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Voicemailcontext
    // */
    // public String displayString(VoicemailcontextMap aVoicemailcontextMap){
    // return aVoicemailcontextMap == null ? "" : "context"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Voicemailcontextentry
    // */
    // public String displayString(VoicemailcontextentryMap
    // aVoicemailcontextentryMap){
    // return aVoicemailcontextentryMap == null ? "" : "context entrys";
    // //"DataObjectName";
    // }
}
