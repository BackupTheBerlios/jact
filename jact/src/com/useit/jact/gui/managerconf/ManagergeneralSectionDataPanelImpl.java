package com.useit.jact.gui.managerconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ManagergeneralSectionDataPanelImpl, das wirkliche panel, kann überarbeitet
 * und angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:31:33 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagergeneralSectionDataPanelImpl.java,v 1.2
 *          2005/12/29 19:14:20 urs Exp $
 */
public class ManagergeneralSectionDataPanelImpl extends
        ManagergeneralSectionDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ManagergeneralSectionDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getManagergeneralSectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getManagergeneralSectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ManagergeneralSectionResFile");
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
        this.setSize(400, (6) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(6); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelgeneralid(), null); // Generated
        this.add(getJPanelenabled(), null); // Generated
        this.add(getJPanelportno(), null); // Generated
        this.add(getJPanelbindaddr(), null); // Generated
        this.add(getJPanelport(), null); // Generated
        this.add(getJPanelfileid(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
