package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZaptelchannelDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:22 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:06 urs Exp $
 */
public class ZaptelchannelDataPanelImpl extends ZaptelchannelDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelchannelDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelchannelResFile");
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
        this.add(getJPanelsignalling(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanelchannel(), null); // Generated
        // this.add(getJPanelanalog_Handset_Features(),null);
        // this.add(getJPanelanalog_Trunk_Features(),null);
        // this.add(getJPanelaudio_Quality_Tuning_Options(),null);
        // this.add(getJPanelcall_Logging_Options(),null);
        // this.add(getJPanelcaller_ID_Options(),null);
        // this.add(getJPaneliSDN_PRI_Switch(),null);
        // this.add(getJPanelother(),null);
        // this.add(getJPaneltiming_Parameters(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
