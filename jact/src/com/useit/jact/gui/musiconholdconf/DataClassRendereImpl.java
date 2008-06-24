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
package com.useit.jact.gui.musiconholdconf;

import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;

// import com.beronet.App.CSS.model.dataModel.MohClasses;
// import com.beronet.App.CSS.model.dataModel.Music_on_HoldConf;
/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.4 2006/01/29
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
     * gibt den string des Datenobjectes zurück für MohClasses
     */
    public String displayString(MohClasses aMohClasses) {
        return aMohClasses == null ? "" : aMohClasses.getName(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Music_on_HoldConf
     */
    public String displayString(Music_on_HoldConf aMusic_on_HoldConf) {
        return aMusic_on_HoldConf == null ? "" : "Music on hold Config";// "" :
                                                                        // aMusic_on_HoldConf.toString();
                                                                        // //"DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für MohClasses
    // */
    // public String displayString(MohClassesMap aMohClassesMap){
    // return aMohClassesMap == null ? "" : "moh classes"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Music_on_HoldConf
    // */
    // public String displayString(Music_on_HoldConfMap aMusic_on_HoldConfMap){
    // return aMusic_on_HoldConfMap == null ? "" : "moh configs";
    // //"DataObjectName";
    // }
}
