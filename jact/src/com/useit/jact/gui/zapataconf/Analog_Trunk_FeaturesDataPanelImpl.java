package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Analog_Trunk_FeaturesDataPanelImpl, das wirkliche panel, kann überarbeitet
 * und angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:13 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Trunk_FeaturesDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Analog_Trunk_FeaturesDataPanelImpl extends
        Analog_Trunk_FeaturesDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Analog_Trunk_FeaturesDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAnalog_Trunk_FeaturesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAnalog_Trunk_FeaturesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Analog_Trunk_FeaturesResFile");
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
        this.add(getJPanelusedistinctiveringdetection(), null); // Generated
        this.add(getJPaneldring1(), null); // Generated
        this.add(getJPaneldring2(), null); // Generated
        this.add(getJPaneldring3(), null); // Generated
        this.add(getJPaneldring1context(), null); // Generated
        this.add(getJPaneldring2context(), null); // Generated
        this.add(getJPaneldring3context(), null); // Generated
        this.add(getJPanelbusydetect(), null); // Generated
        this.add(getJPanelbusycount(), null); // Generated
        this.add(getJPanelcallprogress(), null); // Generated
        this.add(getJPanelpulse(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
