package com.useit.jact.gui.queueconf;

import java.util.ResourceBundle;

/**
 * <p>
 * QueuememberDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:24 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuememberDataPanelImpl.java,v 1.4
 *          2005/12/29 19:14:07 urs Exp $
 */
public class QueuememberDataPanelImpl extends QueuememberDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public QueuememberDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getQueuememberResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getQueuememberResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/QueuememberResFile");
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
        this.add(getJPaneltech(), null); // Generated
        this.add(getJPaneldialstring(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
