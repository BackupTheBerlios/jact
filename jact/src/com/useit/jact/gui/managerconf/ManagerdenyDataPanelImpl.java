package com.useit.jact.gui.managerconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ManagerdenyDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:31:32 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerdenyDataPanelImpl.java,v 1.2
 *          2005/12/29 19:14:20 urs Exp $
 */
public class ManagerdenyDataPanelImpl extends ManagerdenyDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ManagerdenyDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getManagerdenyResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getManagerdenyResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ManagerdenyResFile");
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
        this.add(getJPanelvalue(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
