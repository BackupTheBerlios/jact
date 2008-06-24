package com.useit.jact.gui.misdndriverconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdnCardsDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Sun Dec 25 16:49:56 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCardsDataPanelImpl.java,v 1.1 2005/12/25
 *          18:09:54 urs Exp $
 */
public class MisdnCardsDataPanelImpl extends MisdnCardsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnCardsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnCardsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnCardsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnCardsResFile");
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
        this.add(getJPanelcardName(), null); // Generated
        this.add(getJPanelcardType(), null); // Generated
        this.add(getJPanelcardOptions(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
