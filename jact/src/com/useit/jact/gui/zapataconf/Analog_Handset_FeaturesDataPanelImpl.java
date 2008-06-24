package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Analog_Handset_FeaturesDataPanelImpl, das wirkliche panel, kann überarbeitet
 * und angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:09 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Handset_FeaturesDataPanelImpl.java,v
 *          1.4 2005/12/29 19:14:06 urs Exp $
 */
public class Analog_Handset_FeaturesDataPanelImpl extends
        Analog_Handset_FeaturesDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Analog_Handset_FeaturesDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAnalog_Handset_FeaturesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAnalog_Handset_FeaturesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Analog_Handset_FeaturesResFile");
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
        this.setSize(400, (11) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(11); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneladsi(), null); // Generated
        this.add(getJPanelimmediate(), null); // Generated
        this.add(getJPanelcallwaiting(), null); // Generated
        this.add(getJPanelcallwaitingcallerid(), null); // Generated
        this.add(getJPanelthreewaycalling(), null); // Generated
        this.add(getJPaneltransfer(), null); // Generated
        this.add(getJPanelcancallforward(), null); // Generated
        this.add(getJPanelcallreturn(), null); // Generated
        this.add(getJPanelcallgroup(), null); // Generated
        this.add(getJPanelpickupgroup(), null); // Generated
        this.add(getJPaneluseincomingcalleridonzaptransfer(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
