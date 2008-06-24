package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ContextDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Thu Dec 29 11:47:08 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ContextDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:09 urs Exp $
 */
public class ContextDataPanelImpl extends ContextDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ContextDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getContextResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getContextResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/ContextResFile");
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
        this.add(getJPanelcontextname(), null); // Generated
        this.add(getJPanelignorepat(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
