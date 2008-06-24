package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdnPortsDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:55:19 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPortsDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:19 urs Exp $
 */
public class MisdnPortsDataPanelImpl extends MisdnPortsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnPortsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnPortsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnPortsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnPortsResFile");
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
        this.setSize(400, (2) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(2); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelportN(), null); // Generated
        this.add(getJPanelportOption(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
