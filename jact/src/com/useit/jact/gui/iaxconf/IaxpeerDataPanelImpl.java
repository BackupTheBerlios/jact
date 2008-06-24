package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IaxpeerDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Mon Dec 12 18:35:38 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpeerDataPanelImpl.java,v 1.2 2005/12/25
 *          18:09:58 urs Exp $
 */
public class IaxpeerDataPanelImpl extends IaxpeerDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxpeerDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxpeerResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxpeerResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/IaxpeerResFile");
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
        this.setSize(400, (25) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(25); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneliaxpeername(), null); // Generated
        this.add(getJPanelpeertype(), null); // Generated
        this.add(getJPanelcallerid(), null); // Generated
        this.add(getJPanelauth(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPanelinkeys(), null); // Generated
        this.add(getJPanelhost(), null); // Generated
        this.add(getJPaneldefaultip(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneldbsecret(), null); // Generated
        this.add(getJPanelsetvar(), null); // Generated
        this.add(getJPanelpeercontext(), null); // Generated
        this.add(getJPanelqualify(), null); // Generated
        this.add(getJPaneltrunk(), null); // Generated
        this.add(getJPaneltimezone(), null); // Generated
        this.add(getJPanelregexten(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPaneloutkey(), null); // Generated
        this.add(getJPanelnotransfer(), null); // Generated
        this.add(getJPanelqualifysmoothing(), null); // Generated
        this.add(getJPanelqualifyfreqok(), null); // Generated
        this.add(getJPanelqualifyfreqnotok(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
