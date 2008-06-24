package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Audio_Quality_Tuning_OptionsDataPanelImpl, das wirkliche panel, kann
 * überarbeitet und angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:20 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id:
 *          Audio_Quality_Tuning_OptionsDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:06 urs Exp $
 */
public class Audio_Quality_Tuning_OptionsDataPanelImpl extends
        Audio_Quality_Tuning_OptionsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Audio_Quality_Tuning_OptionsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAudio_Quality_Tuning_OptionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAudio_Quality_Tuning_OptionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Audio_Quality_Tuning_OptionsResFile");
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
        this.setSize(400, (6) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelrelaxdtmf(), null); // Generated
        this.add(getJPanelechocancel(), null); // Generated
        this.add(getJPanelechocancelwhenbridged(), null); // Generated
        this.add(getJPanelechotraining(), null); // Generated
        this.add(getJPanelrxgain(), null); // Generated
        this.add(getJPaneltxgain(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
