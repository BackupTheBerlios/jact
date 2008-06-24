package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Multilink_PPPDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:17 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Multilink_PPPDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Multilink_PPPDataPanelImpl extends Multilink_PPPDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Multilink_PPPDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMultilink_PPPResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMultilink_PPPResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Multilink_PPPResFile");
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
        this.setSize(400, (4) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(4); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelminunused(), null); // Generated
        this.add(getJPanelminidle(), null); // Generated
        this.add(getJPanelidledial(), null); // Generated
        this.add(getJPanelidleext(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
