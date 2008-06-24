package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZaptelchannelsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:55:00 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelsDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:24 urs Exp $
 */
public class ZaptelchannelsDataPanelImpl extends ZaptelchannelsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelchannelsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelchannelsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelchannelsResFile");
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
        this.add(getJPaneldevice(), null); // Generated
        this.add(getJPanelchannellist(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
