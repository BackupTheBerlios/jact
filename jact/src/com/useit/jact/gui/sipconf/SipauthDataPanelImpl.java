package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SipauthDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:56:21 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipauthDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:16 urs Exp $
 */
public class SipauthDataPanelImpl extends SipauthDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SipauthDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSipauthResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSipauthResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/SipauthResFile");
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
        this.add(getJPaneluser(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelmd5secret(), null); // Generated
        this.add(getJPanelrealm(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
