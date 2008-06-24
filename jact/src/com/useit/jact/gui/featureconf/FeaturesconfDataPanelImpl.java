package com.useit.jact.gui.featureconf;

import java.util.ResourceBundle;

/**
 * <p>
 * FeaturesconfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 16:26:33 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturesconfDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:24 urs Exp $
 */
public class FeaturesconfDataPanelImpl extends FeaturesconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public FeaturesconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getFeaturesconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getFeaturesconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/FeaturesconfResFile");
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
        this.add(getJPanelparkext(), null); // Generated
        this.add(getJPanelparkpos(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelparkingtime(), null); // Generated
        this.add(getJPaneltransferdigittimeout(), null); // Generated
        this.add(getJPanelcourtesytone(), null); // Generated
        this.add(getJPanelxfersound(), null); // Generated
        this.add(getJPanelxferfailsound(), null); // Generated
        this.add(getJPaneladsipark(), null); // Generated
        this.add(getJPanelpickupexten(), null); // Generated
        this.add(getJPanelfeaturedigittimeout(), null); // Generated
        // this.add(getJPanelfeaturemap(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
