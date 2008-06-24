package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZapteltonezoneDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:55:02 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteltonezoneDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:24 urs Exp $
 */
public class ZapteltonezoneDataPanelImpl extends ZapteltonezoneDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZapteltonezoneDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZapteltonezoneResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZapteltonezoneResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZapteltonezoneResFile");
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
        this.add(getJPanelzonename(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
