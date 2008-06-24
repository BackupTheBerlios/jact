package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZaptelconfDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:55:08 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelconfDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:25 urs Exp $
 */
public class ZaptelconfDataPanelImpl extends ZaptelconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelconfResFile");
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
        this.add(getJPaneldefaultzone(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
