package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SwitchDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Thu Dec 29 11:47:10 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SwitchDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:09 urs Exp $
 */
public class SwitchDataPanelImpl extends SwitchDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SwitchDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSwitchResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSwitchResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/SwitchResFile");
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
        this.add(getJPanelswitchdialstr(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
