package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ISDN_PRI_SwitchDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:15 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISDN_PRI_SwitchDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:06 urs Exp $
 */
public class ISDN_PRI_SwitchDataPanelImpl extends ISDN_PRI_SwitchDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ISDN_PRI_SwitchDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getISDN_PRI_SwitchResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getISDN_PRI_SwitchResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ISDN_PRI_SwitchResFile");
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
        this.add(getJPanelswitchtype(), null); // Generated
        this.add(getJPaneloverlapdial(), null); // Generated
        this.add(getJPanelpridialplan(), null); // Generated
        this.add(getJPanelpriindication(), null); // Generated
        // this.add(getJPanelmultilink_PPP(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
