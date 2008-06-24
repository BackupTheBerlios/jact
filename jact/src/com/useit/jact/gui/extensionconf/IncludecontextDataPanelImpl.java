package com.useit.jact.gui.extensionconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IncludecontextDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 11:47:09 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludecontextDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:08 urs Exp $
 */
public class IncludecontextDataPanelImpl extends IncludecontextDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IncludecontextDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIncludecontextResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIncludecontextResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IncludecontextResFile");
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
        this.add(getJPanelcontexname(), null); // Generated
        this.add(getJPaneltimeing(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
