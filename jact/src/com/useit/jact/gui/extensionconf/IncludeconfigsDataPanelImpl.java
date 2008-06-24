package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IncludeconfigsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 11:47:14 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludeconfigsDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:08 urs Exp $
 */
public class IncludeconfigsDataPanelImpl extends IncludeconfigsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IncludeconfigsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIncludeconfigsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIncludeconfigsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IncludeconfigsResFile");
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
        this.add(getJPanelconfigname(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
