package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZapataconfDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Thu Dec 29 12:25:30 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapataconfDataPanelImpl.java,v 1.5 2006/01/05
 *          12:57:42 urs Exp $
 */
public class ZapataconfDataPanelImpl extends ZapataconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZapataconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZapataconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZapataconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZapataconfResFile");
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
        this.setSize(400, (0) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1); // Generated
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
