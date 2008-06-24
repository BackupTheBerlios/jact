package com.useit.jact.gui.zapataconf;

import java.util.ResourceBundle;

/**
 * <p>
 * Caller_ID_OptionsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Thu Dec 29 12:25:26 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Caller_ID_OptionsDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:06 urs Exp $
 */
public class Caller_ID_OptionsDataPanelImpl extends Caller_ID_OptionsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public Caller_ID_OptionsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getCaller_ID_OptionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getCaller_ID_OptionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/Caller_ID_OptionsResFile");
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
        this.add(getJPanelcallerid(), null); // Generated
        this.add(getJPanelusecallerid(), null); // Generated
        this.add(getJPanelhidecallerid(), null); // Generated
        this.add(getJPanelrestrictcid(), null); // Generated
        this.add(getJPanelusecallingpres(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
