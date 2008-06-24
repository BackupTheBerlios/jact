package com.useit.jact.gui.indicationsconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IndicationsconfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:56:02 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IndicationsconfDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:12 urs Exp $
 */
public class IndicationsconfDataPanelImpl extends IndicationsconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IndicationsconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIndicationsconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIndicationsconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IndicationsconfResFile");
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
        this.add(getJPanelcountry(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
