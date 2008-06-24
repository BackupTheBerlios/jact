package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * OtherDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Thu Dec 29 12:25:07 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: OtherDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:06 urs Exp $
 */
public class OtherDataPanelImpl extends OtherDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public OtherDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getOtherResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getOtherResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/OtherResFile");
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
        this.setSize(400, (3) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(3); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelgroup(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
