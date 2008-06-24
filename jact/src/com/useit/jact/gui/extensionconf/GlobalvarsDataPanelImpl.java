package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

/**
 * <p>
 * GlobalvarsDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Thu Dec 29 11:47:12 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GlobalvarsDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:08 urs Exp $
 */
public class GlobalvarsDataPanelImpl extends GlobalvarsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public GlobalvarsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getGlobalvarsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getGlobalvarsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/GlobalvarsResFile");
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
        this.add(getJPanelname(), null); // Generated
        this.add(getJPanelvalue(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
