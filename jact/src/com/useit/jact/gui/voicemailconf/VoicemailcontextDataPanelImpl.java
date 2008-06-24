package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

/**
 * <p>
 * VoicemailcontextDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:31 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextDataPanelImpl.java,v 1.5
 *          2005/12/29 19:14:05 urs Exp $
 */
public class VoicemailcontextDataPanelImpl extends VoicemailcontextDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailcontextDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailcontextResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailcontextResFile");
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
        layGridLayout.setRows(1); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcontextname(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
