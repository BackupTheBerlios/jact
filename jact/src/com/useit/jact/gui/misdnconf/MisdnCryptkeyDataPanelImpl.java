package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdnCryptkeyDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:55:17 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCryptkeyDataPanelImpl.java,v 1.5
 *          2005/12/29 19:14:19 urs Exp $
 */
public class MisdnCryptkeyDataPanelImpl extends MisdnCryptkeyDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnCryptkeyDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnCryptkeyResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnCryptkeyResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnCryptkeyResFile");
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
        this.setSize(400, (2) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelkeyname(), null); // Generated
        this.add(getJPanelkeyvalue(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
