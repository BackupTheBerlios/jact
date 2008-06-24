package com.useit.jact.gui.indicationsconf;

import java.util.ResourceBundle;

/**
 * <p>
 * CustomToneDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:55:59 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: CustomToneDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:12 urs Exp $
 */
public class CustomToneDataPanelImpl extends CustomToneDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public CustomToneDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getCustomToneResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getCustomToneResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/CustomToneResFile");
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
        this.add(getJPaneltonecode(), null); // Generated
        this.add(getJPanelname(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
