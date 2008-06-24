package com.useit.jact.gui.queueconf;

import java.util.ResourceBundle;

/**
 * <p>
 * QueuegeneralDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:21 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuegeneralDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:07 urs Exp $
 */
public class QueuegeneralDataPanelImpl extends QueuegeneralDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public QueuegeneralDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getQueuegeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getQueuegeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/QueuegeneralResFile");
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
        this.add(getJPanelpersistentmembers(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
