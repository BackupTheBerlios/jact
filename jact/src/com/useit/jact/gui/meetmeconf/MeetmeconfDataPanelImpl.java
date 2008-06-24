package com.useit.jact.gui.meetmeconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MeetmeconfDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:56:08 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeconfDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:08 urs Exp $
 */
public class MeetmeconfDataPanelImpl extends MeetmeconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MeetmeconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMeetmeconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMeetmeconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MeetmeconfResFile");
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
        this.add(getJPanelfileid(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
