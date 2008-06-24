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
 * DenyDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Aug 09 22:17:09 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DenyDataPanelImpl.java,v 1.3 2005/09/20
 *          14:02:04 urs Exp $
 */
public class DenyDataPanelImpl extends DenyDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public DenyDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getDenyResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getDenyResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/DenyResFile");
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
        this.setSize(400, (2) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelValue(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
