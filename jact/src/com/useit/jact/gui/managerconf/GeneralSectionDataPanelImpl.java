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
package com.useit.jact.gui.managerconf;

import java.util.ResourceBundle;

/**
 * <p>
 * GeneralSectionDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Aug 09 10:28:34 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GeneralSectionDataPanelImpl.java,v 1.3
 *          2005/09/20 14:02:04 urs Exp $
 */
public class GeneralSectionDataPanelImpl extends GeneralSectionDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public GeneralSectionDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getGeneralSectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getGeneralSectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/GeneralSectionResFile");
        defaultresBundel = ResourceBundle
                .getBundle("resourceBundels/DefaultResBundel");

        initialize();
        initActions();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(400, (4) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        // this.add(getJPanelGeneralid(), null); // Generated
        this.add(getJPanelEnabled(), null); // Generated
        this.add(getJPanelPortno(), null); // Generated
        this.add(getJPanelBindaddr(), null); // Generated
        this.add(getJPanelPort(), null); // Generated

        getJPanelGeneralid();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
