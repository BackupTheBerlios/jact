package com.useit.jact.gui.agentconf;

import java.util.ResourceBundle;

/**
 * <p>
 * AgentsconfDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 16:22:34 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsconfDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class AgentsconfDataPanelImpl extends AgentsconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AgentsconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAgentsconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAgentsconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/AgentsconfResFile");
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
        this.add(getJPanelautologoff(), null); // Generated
        this.add(getJPanelackcall(), null); // Generated
        this.add(getJPanelwrapuptime(), null); // Generated
        this.add(getJPanelmusic_class(), null); // Generated
        this.add(getJPanelcustom_beep(), null); // Generated
        this.add(getJPanelgroup(), null); // Generated
        // this.add(getJPanelagentsrecording(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
