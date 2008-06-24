package com.useit.jact.gui.indicationsconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ToneDefinitionsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:55:58 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ToneDefinitionsDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:12 urs Exp $
 */
public class ToneDefinitionsDataPanelImpl extends ToneDefinitionsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ToneDefinitionsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getToneDefinitionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getToneDefinitionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ToneDefinitionsResFile");
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
        this.setSize(400, (12) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(12); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcountrycode(), null); // Generated
        this.add(getJPaneldescription(), null); // Generated
        this.add(getJPanelalias(), null); // Generated
        this.add(getJPanelringcadence(), null); // Generated
        this.add(getJPaneldial(), null); // Generated
        this.add(getJPanelbusy(), null); // Generated
        this.add(getJPanelring(), null); // Generated
        this.add(getJPanelcongestion(), null); // Generated
        this.add(getJPanelcallwaiting(), null); // Generated
        this.add(getJPaneldialrecall(), null); // Generated
        this.add(getJPanelrecord(), null); // Generated
        this.add(getJPanelinfo(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
