package com.useit.jact.gui.agentconf;

import java.util.ResourceBundle;

/**
 * <p>
 * AgentsrecordingDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 16:22:37 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsrecordingDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:24 urs Exp $
 */
public class AgentsrecordingDataPanelImpl extends AgentsrecordingDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AgentsrecordingDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAgentsrecordingResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAgentsrecordingResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/AgentsrecordingResFile");
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
        this.setSize(400, (5) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(5); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelrecordagentcalls(), null); // Generated
        this.add(getJPanelrecordformat(), null); // Generated
        this.add(getJPanelcreatelink(), null); // Generated
        this.add(getJPanelurlprefix(), null); // Generated
        this.add(getJPanelsavecallsin(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
