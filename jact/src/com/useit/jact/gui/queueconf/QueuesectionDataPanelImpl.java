package com.useit.jact.gui.queueconf;

import java.util.ResourceBundle;

/**
 * <p>
 * QueuesectionDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:22 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuesectionDataPanelImpl.java,v 1.5
 *          2006/01/29 12:03:54 urs Exp $
 */
public class QueuesectionDataPanelImpl extends QueuesectionDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public QueuesectionDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getQueuesectionResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getQueuesectionResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/QueuesectionResFile");
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
        this.setSize(400, (23) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setColumns(1);
        layGridLayout.setRows(23); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelsectionname(), null); // Generated
        this.add(getJPanelmusiconhold(), null); // Generated
        this.add(getJPanelannounce(), null); // Generated
        this.add(getJPanelstrategy(), null); // Generated
        this.add(getJPanelservicelevel(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPaneltimeout(), null); // Generated
        this.add(getJPanelretry(), null); // Generated
        this.add(getJPanelweight(), null); // Generated
        this.add(getJPanelwrapuptime(), null); // Generated
        this.add(getJPanelmaxlen(), null); // Generated
        this.add(getJPanelannouncefrequency(), null); // Generated
        this.add(getJPanelannounceholdtime(), null); // Generated
        this.add(getJPanelannounceroundseconds(), null); // Generated
        this.add(getJPanelmonitorformat(), null); // Generated
        this.add(getJPanelmonitorjoin(), null); // Generated
        this.add(getJPaneljoinempty(), null); // Generated
        this.add(getJPanelleavewhenempty(), null); // Generated
        this.add(getJPaneleventwhencalled(), null); // Generated
        this.add(getJPaneleventmemberstatusoff(), null); // Generated
        this.add(getJPanelreportholdtime(), null); // Generated
        this.add(getJPanelmemberdelay(), null); // Generated
        this.add(getJPaneltimeoutrestart(), null); // Generated
        initActions();
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
