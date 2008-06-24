package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SipConfDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:56:23 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipConfDataPanelImpl.java,v 1.7 2005/12/29
 *          19:14:16 urs Exp $
 */
public class SipConfDataPanelImpl extends SipConfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SipConfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSipConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSipConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/SipConfResFile");
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
        this.setSize(400, (0) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(0); // Generated
        this.setLayout(layGridLayout); // Generated
        // this.add(getJPanelsipgeneral(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
