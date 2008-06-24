package com.useit.jact.gui.misdndriverconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdnDriverConfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Sun Dec 25 16:49:56 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnDriverConfDataPanelImpl.java,v 1.2
 *          2005/12/29 19:14:20 urs Exp $
 */
public class MisdnDriverConfDataPanelImpl extends MisdnDriverConfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnDriverConfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnDriverConfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnDriverConfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnDriverConfResFile");
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
        this.add(getJPanelpoll(), null); // Generated
        this.add(getJPanelpcm(), null); // Generated
        this.add(getJPaneldebug(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
