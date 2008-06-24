/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.voicemailconf;

import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;

// import com.beronet.App.CSS.model.dataModel.VoicemailConf;
// import com.beronet.App.CSS.model.dataModel.Zonemessages;
// import com.beronet.App.CSS.model.dataModel.Voicemailcontext;
// import com.beronet.App.CSS.model.dataModel.Voicemailcontextentry;
// import com.beronet.App.CSS.model.dataModel.Voicemailgeneral;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.7 2006/01/14
 *          15:00:13 urs Exp $
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
     * gibt den string des Datenobjectes zurück für VoicemailConf
     */
    public abstract String displayString(VoicemailConf aVoicemailConf);// {

    // return aVoicemailConf == null ? "" : aVoicemailConf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Zonemessages
     */
    public abstract String displayString(Zonemessages aZonemessages);// {

    // return aZonemessages == null ? "" : aZonemessages.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Voicemailcontext
     */
    public abstract String displayString(Voicemailcontext aVoicemailcontext);// {

    // return aVoicemailcontext == null ? "" : aVoicemailcontext.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Voicemailcontextentry
     */
    public abstract String displayString(
            Voicemailcontextentry aVoicemailcontextentry);// {

    // return aVoicemailcontextentry == null ? "" :
    // aVoicemailcontextentry.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Voicemailgeneral
     */
    public abstract String displayString(Voicemailgeneral aVoicemailgeneral);// {

    // return aVoicemailgeneral == null ? "" : aVoicemailgeneral.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof VoicemailConf)
            return getInstance().displayString((VoicemailConf) obj);
        if (obj instanceof Zonemessages)
            return getInstance().displayString((Zonemessages) obj);
        if (obj instanceof Voicemailcontext)
            return getInstance().displayString((Voicemailcontext) obj);
        if (obj instanceof Voicemailcontextentry)
            return getInstance().displayString((Voicemailcontextentry) obj);
        if (obj instanceof Voicemailgeneral)
            return getInstance().displayString((Voicemailgeneral) obj);
        return obj.toString();
    }
}
