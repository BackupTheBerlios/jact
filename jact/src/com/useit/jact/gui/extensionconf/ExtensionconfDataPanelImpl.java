package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ExtensionconfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 11:47:11 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionconfDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:08 urs Exp $
 */
public class ExtensionconfDataPanelImpl extends ExtensionconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ExtensionconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getExtensionconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getExtensionconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ExtensionconfResFile");
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
        this.setSize(400, (4) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelstatic_(), null); // Generated
        this.add(getJPanelwriteprotect(), null); // Generated
        this.add(getJPanelautofallthrough(), null); // Generated
        this.add(getJPanelclearglobalvars(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
