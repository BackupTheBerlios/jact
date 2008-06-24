package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

/**
 * <p>
 * VoicemailConfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:28 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailConfDataPanelImpl.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class VoicemailConfDataPanelImpl extends VoicemailConfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailConfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailConfResFile");
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
        this.setSize(400, (1) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1); // Generated
        this.setLayout(layGridLayout); // Generated
        // this.add(getJPanelvoicemailgeneral(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
