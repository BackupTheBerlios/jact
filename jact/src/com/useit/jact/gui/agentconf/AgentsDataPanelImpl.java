package com.useit.jact.gui.agentconf;

import java.util.ResourceBundle;

/**
 * <p>
 * AgentsDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 16:22:34 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class AgentsDataPanelImpl extends AgentsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AgentsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAgentsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAgentsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle.getBundle("resourceBundels/AgentsResFile");
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
        this.add(getJPanelagentid(), null); // Generated
        this.add(getJPanelagentpassword(), null); // Generated
        this.add(getJPanelname(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
