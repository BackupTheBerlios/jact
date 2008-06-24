/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.managerconf;

import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.Managerpermit;

// import com.beronet.App.CSS.model.dataModel.ManagergeneralSection;
// import com.beronet.App.CSS.model.dataModel.Managerdeny;
// import com.beronet.App.CSS.model.dataModel.ManagerSection;
// import com.beronet.App.CSS.model.dataModel.Managerpermit;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.7 2006/01/05
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
     * gibt den string des Datenobjectes zurück für ManagergeneralSection
     */
    public abstract String displayString(
            ManagergeneralSection aManagergeneralSection);// {

    // return aManagergeneralSection == null ? "" :
    // aManagergeneralSection.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Managerdeny
     */
    public abstract String displayString(Managerdeny aManagerdeny);// {

    // return aManagerdeny == null ? "" : aManagerdeny.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für ManagerSection
     */
    public abstract String displayString(ManagerSection aManagerSection);// {

    // return aManagerSection == null ? "" : aManagerSection.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Managerpermit
     */
    public abstract String displayString(Managerpermit aManagerpermit);// {

    // return aManagerpermit == null ? "" : aManagerpermit.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof ManagergeneralSection)
            return getInstance().displayString((ManagergeneralSection) obj);
        if (obj instanceof Managerdeny)
            return getInstance().displayString((Managerdeny) obj);
        if (obj instanceof ManagerSection)
            return getInstance().displayString((ManagerSection) obj);
        if (obj instanceof Managerpermit)
            return getInstance().displayString((Managerpermit) obj);
        return obj.toString();
    }
}
