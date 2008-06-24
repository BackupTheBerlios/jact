package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SipregisterDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:56:17 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipregisterDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:16 urs Exp $
 */
public class SipregisterDataPanelImpl extends SipregisterDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SipregisterDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSipregisterResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSipregisterResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/SipregisterResFile");
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
        this.setSize(400, (6) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneluser(), null); // Generated
        this.add(getJPanelauthuser(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelhost(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelextension(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
