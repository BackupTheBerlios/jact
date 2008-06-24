package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IaxpermitDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Mon Dec 12 18:35:10 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpermitDataPanelImpl.java,v 1.2 2005/12/25
 *          18:09:57 urs Exp $
 */
public class IaxpermitDataPanelImpl extends IaxpermitDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxpermitDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxpermitResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxpermitResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxpermitResFile");
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
