package com.useit.jact.gui.misdndriverconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdncardPortsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Sun Dec 25 16:49:55 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdncardPortsDataPanelImpl.java,v 1.1
 *          2005/12/25 18:09:54 urs Exp $
 */
public class MisdncardPortsDataPanelImpl extends MisdncardPortsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdncardPortsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdncardPortsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdncardPortsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdncardPortsResFile");
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
        this.add(getJPanelportN(), null); // Generated
        this.add(getJPanelportOption(), null); // Generated
        this.add(getJPanelmPortOption(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
