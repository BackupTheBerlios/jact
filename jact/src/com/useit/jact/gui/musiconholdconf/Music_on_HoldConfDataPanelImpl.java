package com.useit.jact.gui.musiconholdconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Music_on_HoldConfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:54 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Music_on_HoldConfDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:27 urs Exp $
 */
public class Music_on_HoldConfDataPanelImpl extends Music_on_HoldConfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Music_on_HoldConfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMusic_on_HoldConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMusic_on_HoldConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Music_on_HoldConfResFile");
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
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
