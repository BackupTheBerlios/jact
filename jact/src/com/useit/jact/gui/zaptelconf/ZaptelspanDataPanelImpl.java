package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZaptelspanDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:55:04 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelspanDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class ZaptelspanDataPanelImpl extends ZaptelspanDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZaptelspanDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZaptelspanResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZaptelspanResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZaptelspanResFile");
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
        this.add(getJPanelspan_num(), null); // Generated
        this.add(getJPaneltiming(), null); // Generated
        this.add(getJPanellbo(), null); // Generated
        this.add(getJPanelframing(), null); // Generated
        this.add(getJPanelcoding(), null); // Generated
        this.add(getJPanelyellow(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
