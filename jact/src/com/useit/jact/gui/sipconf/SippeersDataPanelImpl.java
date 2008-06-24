package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SippeersDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:56:25 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SippeersDataPanelImpl.java,v 1.6 2005/12/29
 *          19:14:16 urs Exp $
 */
public class SippeersDataPanelImpl extends SippeersDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SippeersDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSippeersResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSippeersResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/SippeersResFile");
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
        this.setSize(400, (31) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(31); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelsectionname(), null); // Generated
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPanelamaflags(), null); // Generated
        this.add(getJPanelcallgroup(), null); // Generated
        this.add(getJPanelcanreinvite(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneldefaultip(), null); // Generated
        this.add(getJPaneldtmfmode(), null); // Generated
        this.add(getJPanelfromuser(), null); // Generated
        this.add(getJPanelfromdomain(), null); // Generated
        this.add(getJPanelhost(), null); // Generated
        this.add(getJPanelincominglimit(), null); // Generated
        this.add(getJPaneloutgoinglimit(), null); // Generated
        this.add(getJPanelinsecure(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        this.add(getJPanelmailbox(), null); // Generated
        this.add(getJPanelmd5secret(), null); // Generated
        this.add(getJPanelnat(), null); // Generated
        this.add(getJPanelpickupgroup(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelqualify(), null); // Generated
        this.add(getJPanelrestrictcid(), null); // Generated
        this.add(getJPanelrtptimeout(), null); // Generated
        this.add(getJPanelrtpholdtimeout(), null); // Generated
        this.add(getJPanelsecret(), null); // Generated
        this.add(getJPaneltype(), null); // Generated
        this.add(getJPanelusername(), null); // Generated
        this.add(getJPanelmusiconhold(), null); // Generated
        this.add(getJPanelcallerid(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
