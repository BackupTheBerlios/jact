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
package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SipdisallowDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Mon Sep 05 18:20:37 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipdisallowDataPanelImpl.java,v 1.2
 *          2005/09/20 14:01:52 urs Exp $
 */
public class SipdisallowDataPanelImpl extends SipdisallowDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SipdisallowDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSipdisallowResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSipdisallowResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/SipdisallowResFile");
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
        this.setSize(400, (1) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelValue(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
