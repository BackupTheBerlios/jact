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
package com.useit.jact.gui.zaptelconf;

import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.Zapteltonezone;

// import com.beronet.App.CSS.model.dataModel.Zaptelchannels;
// import com.beronet.App.CSS.model.dataModel.Zapteltonezone;
// import com.beronet.App.CSS.model.dataModel.Zaptelspan;
// import com.beronet.App.CSS.model.dataModel.Zapteldynamicspan;
// import com.beronet.App.CSS.model.dataModel.Zaptelconf;
/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.5 2006/03/17
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
     * gibt den string des Datenobjectes zurück für Zaptelchannels
     */
    public String displayString(Zaptelchannels aZaptelchannels) {
        return aZaptelchannels == null ? "" : aZaptelchannels.getDevice() + "-"
                + aZaptelchannels.getChannellist(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Zapteltonezone
     */
    public String displayString(Zapteltonezone aZapteltonezone) {
        return aZapteltonezone == null ? "" : "tz : "
                + aZapteltonezone.getZonename(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Zaptelspan
     */
    public String displayString(Zaptelspan aZaptelspan) {
        return aZaptelspan == null ? "" : aZaptelspan.getSpan_num().toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Zapteldynamicspan
     */
    public String displayString(Zapteldynamicspan aZapteldynamicspan) {
        return aZapteldynamicspan == null ? "" : aZapteldynamicspan.getDriver()
                + ":" + aZapteldynamicspan.getNumchans(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Zaptelconf
     */
    public String displayString(Zaptelconf aZaptelconf) {
        return aZaptelconf == null ? "" : "zaptel conf"; // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zaptelchannels
    // */
    // public String displayString(ZaptelchannelsMap aZaptelchannelsMap){
    // return aZaptelchannelsMap == null ? "" : "channels"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zapteltonezone
    // */
    // public String displayString(ZapteltonezoneMap aZapteltonezoneMap){
    // return aZapteltonezoneMap == null ? "" : "Tonezones"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zaptelspan
    // */
    // public String displayString(ZaptelspanMap aZaptelspanMap){
    // return aZaptelspanMap == null ? "" : "spans"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zapteldynamicspan
    // */
    // public String displayString(ZapteldynamicspanMap aZapteldynamicspanMap){
    // return aZapteldynamicspanMap == null ? "" : "dynamic spans";
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Zaptelconf
    // */
    // public String displayString(ZaptelconfMap aZaptelconfMap){
    // return aZaptelconfMap == null ? "" : "zaptel configs";
    // //"DataObjectName";
    // }
}
