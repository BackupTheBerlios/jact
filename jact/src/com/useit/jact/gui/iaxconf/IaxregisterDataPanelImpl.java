package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IaxregisterDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Mon Dec 12 18:34:54 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxregisterDataPanelImpl.java,v 1.2
 *          2005/12/25 18:09:58 urs Exp $
 */
public class IaxregisterDataPanelImpl extends IaxregisterDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxregisterDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxregisterResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxregisterResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxregisterResFile");
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
