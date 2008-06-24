package com.useit.jact.gui.sipconf;

import java.util.ResourceBundle;

/**
 * <p>
 * SipgeneralDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:56:29 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipgeneralDataPanelImpl.java,v 1.6 2005/12/29
 *          19:14:17 urs Exp $
 */
public class SipgeneralDataPanelImpl extends SipgeneralDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public SipgeneralDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getSipgeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getSipgeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/SipgeneralResFile");
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
        this.setSize(400, (35) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(35); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelautocreatepeer(), null); // Generated
        this.add(getJPanelbindaddr(), null); // Generated
        this.add(getJPanelbindport(), null); // Generated
        this.add(getJPanelcanreinvite(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneldefaultexpirey(), null); // Generated
        this.add(getJPaneldtmfmode(), null); // Generated
        this.add(getJPanelexternip(), null); // Generated
        this.add(getJPanelexternhost(), null); // Generated
        this.add(getJPanelexternrefresh(), null); // Generated
        this.add(getJPanellocalnet(), null); // Generated
        this.add(getJPanelfromdomain(), null); // Generated
        this.add(getJPanelmaxexpirey(), null); // Generated
        this.add(getJPanelnat(), null); // Generated
        this.add(getJPanelnotifymimetype(), null); // Generated
        this.add(getJPanelpedantic(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelpromiscredir(), null); // Generated
        this.add(getJPanelsrvlookup(), null); // Generated
        this.add(getJPaneltos(), null); // Generated
        this.add(getJPanelvideosupport(), null); // Generated
        this.add(getJPaneluseragent(), null); // Generated
        this.add(getJPaneltrustrpid(), null); // Generated
        this.add(getJPanelrealm(), null); // Generated
        this.add(getJPanelrelaxdtmf(), null); // Generated
        this.add(getJPanelrtptimeout(), null); // Generated
        this.add(getJPanelrtpholdtimeout(), null); // Generated
        this.add(getJPanelprogressinband(), null); // Generated
        this.add(getJPanelusereqphone(), null); // Generated
        this.add(getJPanelcompactheaders(), null); // Generated
        this.add(getJPanelsipdebug(), null); // Generated
        this.add(getJPanelcheckmwi(), null); // Generated
        this.add(getJPanelrecordhistory(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
