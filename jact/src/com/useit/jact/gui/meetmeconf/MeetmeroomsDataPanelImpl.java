package com.useit.jact.gui.meetmeconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MeetmeroomsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:56:09 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeroomsDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:08 urs Exp $
 */
public class MeetmeroomsDataPanelImpl extends MeetmeroomsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MeetmeroomsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMeetmeroomsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMeetmeroomsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MeetmeroomsResFile");
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
        this.add(getJPanelconfno(), null); // Generated
        this.add(getJPanelpincode(), null); // Generated
        this.add(getJPaneladminpin(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
