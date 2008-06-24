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
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.6 2006/01/14
 *          15:44:47 urs Exp $
 */
public abstract class DataClassRendere {

    protected static DataClassRendere defaultInstance;

    /**
     * 
     */
    protected DataClassRendere() {
        super();
    }

    private static DataClassRendere getInstance() {
        if (defaultInstance == null) {

            defaultInstance = new DataClassRendereImpl();
        }
        return defaultInstance;
    }

    /**
     * gibt den string des Datenobjectes zurück für Queuegeneral
     */
    public abstract String displayString(Queuegeneral aQueuegeneral);// {

    // return aQueuegeneral == null ? "" : aQueuegeneral.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Queuesection
     */
    public abstract String displayString(Queuesection aQueuesection);// {

    // return aQueuesection == null ? "" : aQueuesection.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Queuemember
     */
    public abstract String displayString(Queuemember aQueuemember);// {

    // return aQueuemember == null ? "" : aQueuemember.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Queuegeneral)
            return getInstance().displayString((Queuegeneral) obj);
        if (obj instanceof Queuesection)
            return getInstance().displayString((Queuesection) obj);
        if (obj instanceof Queuemember)
            return getInstance().displayString((Queuemember) obj);
        return obj.toString();
    }
}
