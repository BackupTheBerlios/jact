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
package com.useit.jact.gui.managerconf;

import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.Managerpermit;

// import com.beronet.App.CSS.model.dataModel.ManagerSection;
// import com.beronet.App.CSS.model.dataModel.GeneralSection;
// import com.beronet.App.CSS.model.dataModel.Managerconf;
// import com.beronet.App.CSS.model.dataModel.Deny;
// import com.beronet.App.CSS.model.dataModel.Permit;
/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.8 2006/03/17
 *          10:42:52 urs Exp $
 */
public class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für ManagerSection
     */
    public String displayString(ManagerSection aManagerSection) {
        return aManagerSection == null ? "" : aManagerSection.getUsername(); // "DataObjectName";
    }

    // /**
    // * gibt den string des Datenobjectes zurück
    // * für GeneralSection
    // */
    // public String displayString(GeneralSection aGeneralSection){
    // return aGeneralSection == null ? "" : "general"; //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Managerconf
    // */
    // public String displayString(Managerconf aManagerconf){
    // return aManagerconf == null ? "" : "Manager Conf"; //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Deny
     */
    // public String displayString(Deny aDeny){
    // return aDeny == null ? "" : aDeny.getValue(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Permit
     */
    // public String displayString(Permit aPermit){
    // return aPermit == null ? "" : aPermit.getValue(); //"DataObjectName";
    // }
    /*
     * (non-Javadoc)
     * 
     * @see com.useit.jact.gui.managerconf.DataClassRendere#displayString(com.useit.jact.model.managerconf.ManagerSectionMap)
     */
    // public String displayString(ManagerSectionMap aManagerSectionMap) {
    //        
    // return "Managers";
    // }
    // /* (non-Javadoc)
    // * @see
    // com.useit.jact.gui.managerconf.DataClassRendere#displayString(com.useit.jact.model.managerconf.GeneralSectionMap)
    // */
    // public String displayString(GeneralSectionMap aGeneralSectionMap) {
    //        
    // return "general Map";
    // }
    // /* (non-Javadoc)
    // * @see
    // com.useit.jact.gui.managerconf.DataClassRendere#displayString(com.useit.jact.model.managerconf.ManagerconfMap)
    // */
    // public String displayString(ManagerconfMap aManagerconfMap) {
    //       
    // return "Manager Conf map";
    // }
    // /* (non-Javadoc)
    // * @see
    // com.useit.jact.gui.managerconf.DataClassRendere#displayString(com.useit.jact.model.managerconf.DenyMap)
    // */
    // public String displayString(DenyMap aDenyMap) {
    //        
    // return "deny";
    // }
    // /* (non-Javadoc)
    // * @see
    // com.useit.jact.gui.managerconf.DataClassRendere#displayString(com.useit.jact.model.managerconf.PermitMap)
    // */
    // public String displayString(PermitMap aPermitMap) {
    //        
    // return "permit";
    // }
    @Override
    public String displayString(ManagergeneralSection aManagergeneralSection) {
        return aManagergeneralSection == null ? "" : "general"; // "DataObjectName";
    }

    @Override
    public String displayString(Managerdeny aManagerdeny) {
        return aManagerdeny == null ? "" : aManagerdeny.getValue(); // "DataObjectName";
    }

    @Override
    public String displayString(Managerpermit aManagerpermit) {
        return aManagerpermit == null ? "" : aManagerpermit.getValue(); // "DataObjectName";
    }
    // @Override
    // public String displayString(ManagergeneralSectionMap
    // aManagergeneralSectionMap) {
    // // TODO Automatisch erstellter Methoden-Stub
    // return null;
    // }
    // @Override
    // public String displayString(ManagerdenyMap aManagerdenyMap) {
    // // TODO Automatisch erstellter Methoden-Stub
    // return null;
    // }
    // @Override
    // public String displayString(ManagerpermitMap aManagerpermitMap) {
    // // TODO Automatisch erstellter Methoden-Stub
    // return null;
    // }
}
