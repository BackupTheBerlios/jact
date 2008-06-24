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
package com.useit.jact.gui.queueconf;

import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.Queuesection;

// import com.beronet.App.CSS.model.dataModel.Queuegeneral;
// import com.beronet.App.CSS.model.dataModel.Queuesection;
// import com.beronet.App.CSS.model.dataModel.Queuemember;
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
     * gibt den string des Datenobjectes zurück für Queuegeneral
     */
    public String displayString(Queuegeneral aQueuegeneral) {
        return aQueuegeneral == null ? "" : "queue conf"; // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Queuesection
     */
    public String displayString(Queuesection aQueuesection) {
        return aQueuesection == null ? "" : aQueuesection.getSectionname(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Queuemember
     */
    public String displayString(Queuemember aQueuemember) {
        return aQueuemember == null ? "" : aQueuemember.getTech() + "/"
                + aQueuemember.getDialstring(); // "DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Queuegeneral
    // */
    // public String displayString(QueuegeneralMap aQueuegeneralMap){
    // return aQueuegeneralMap == null ? "" : "conf map"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Queuesection
    // */
    // public String displayString(QueuesectionMap aQueuesectionMap){
    // return aQueuesectionMap == null ? "" : "queue sections";
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Queuemember
    // */
    // public String displayString(QueuememberMap aQueuememberMap){
    // return aQueuememberMap == null ? "" : "menbers"; //"DataObjectName";
    // }
}
