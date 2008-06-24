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
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.5 2006/01/05
 *          12:57:43 urs Exp $
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
     * gibt den string des Datenobjectes zurück für MohClasses
     */
    public abstract String displayString(MohClasses aMohClasses);// {

    // return aMohClasses == null ? "" : aMohClasses.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Music_on_HoldConf
     */
    public abstract String displayString(Music_on_HoldConf aMusic_on_HoldConf);// {

    // return aMusic_on_HoldConf == null ? "" : aMusic_on_HoldConf.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof MohClasses)
            return getInstance().displayString((MohClasses) obj);
        if (obj instanceof Music_on_HoldConf)
            return getInstance().displayString((Music_on_HoldConf) obj);
        return obj.toString();
    }
}
