package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

/**
 * <p>
 * VoicemailcontextentryDataPanelImpl, das wirkliche panel, kann überarbeitet
 * und angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:35 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextentryDataPanelImpl.java,v 1.5
 *          2005/12/29 19:14:05 urs Exp $
 */
public class VoicemailcontextentryDataPanelImpl extends
        VoicemailcontextentryDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailcontextentryDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextentryResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextentryResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailcontextentryResFile");
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
        this.setSize(400, (5) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelvoicemail_password(), null); // Generated
        this.add(getJPaneluser_name(), null); // Generated
        this.add(getJPaneluser_email_address(), null); // Generated
        this.add(getJPanelpager_email_address(), null); // Generated
        this.add(getJPaneluser_options(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
