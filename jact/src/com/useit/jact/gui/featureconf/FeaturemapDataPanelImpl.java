package com.useit.jact.gui.featureconf;

import java.util.ResourceBundle;

/**
 * <p>
 * FeaturemapDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 16:26:31 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturemapDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class FeaturemapDataPanelImpl extends FeaturemapDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public FeaturemapDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getFeaturemapResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getFeaturemapResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/FeaturemapResFile");
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
        this.add(getJPanelblindxfer(), null); // Generated
        this.add(getJPaneldisconnect(), null); // Generated
        this.add(getJPanelautomon(), null); // Generated
        this.add(getJPanelatxfer(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
