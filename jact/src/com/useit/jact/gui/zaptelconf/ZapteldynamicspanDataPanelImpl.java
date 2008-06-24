package com.useit.jact.gui.zaptelconf;

import java.util.ResourceBundle;

/**
 * <p>
 * ZapteldynamicspanDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:55:05 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteldynamicspanDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:25 urs Exp $
 */
public class ZapteldynamicspanDataPanelImpl extends ZapteldynamicspanDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public ZapteldynamicspanDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getZapteldynamicspanResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getZapteldynamicspanResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/ZapteldynamicspanResFile");
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
        this.add(getJPaneldriver(), null); // Generated
        this.add(getJPaneladdress(), null); // Generated
        this.add(getJPanelnumchans(), null); // Generated
        this.add(getJPaneltiming(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
