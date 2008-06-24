package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZonemessagesDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:33 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZonemessagesDataPanelImpl.java,v 1.5
 *          2005/12/29 19:14:05 urs Exp $
 */
public class ZonemessagesDataPanelImpl extends ZonemessagesDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZonemessagesDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZonemessagesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZonemessagesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZonemessagesResFile");
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
        this.add(getJPaneltimezonename(), null); // Generated
        this.add(getJPanelcountry(), null); // Generated
        this.add(getJPanelcity(), null); // Generated
        this.add(getJPaneloptions(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
