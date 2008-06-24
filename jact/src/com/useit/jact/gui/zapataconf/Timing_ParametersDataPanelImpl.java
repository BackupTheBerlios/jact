package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Timing_ParametersDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:11 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Timing_ParametersDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:07 urs Exp $
 */
public class Timing_ParametersDataPanelImpl extends Timing_ParametersDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Timing_ParametersDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getTiming_ParametersResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getTiming_ParametersResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Timing_ParametersResFile");
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
        this.setSize(400, (8) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(8); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelprewink(), null); // Generated
        this.add(getJPanelpreflash(), null); // Generated
        this.add(getJPanelwink(), null); // Generated
        this.add(getJPanelrxwink(), null); // Generated
        this.add(getJPanelrxflash(), null); // Generated
        this.add(getJPanelflash(), null); // Generated
        this.add(getJPanelstart(), null); // Generated
        this.add(getJPaneldebounce(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
