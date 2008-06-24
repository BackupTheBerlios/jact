package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdnSectionsDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:55:18 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnSectionsDataPanelImpl.java,v 1.6
 *          2005/12/29 19:14:19 urs Exp $
 */
public class MisdnSectionsDataPanelImpl extends MisdnSectionsDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnSectionsDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnSectionsResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnSectionsResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnSectionsResFile");
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
        this.setSize(400, (20) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(20); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelcontext(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        this.add(getJPanelnationalprefix(), null); // Generated
        this.add(getJPanelinternationalprefix(), null); // Generated
        this.add(getJPanelrxgain(), null); // Generated
        this.add(getJPaneltxgain(), null); // Generated
        this.add(getJPanelte_choose_channel(), null); // Generated
        this.add(getJPanelearly_bconnect(), null); // Generated
        this.add(getJPaneldialplan(), null); // Generated
        this.add(getJPaneluse_callingpres(), null); // Generated
        this.add(getJPanelalways_immediate(), null); // Generated
        this.add(getJPanelimmediate(), null); // Generated
        this.add(getJPanelhold_allowed(), null); // Generated
        this.add(getJPanelpickgroup(), null); // Generated
        this.add(getJPanelcallgroup(), null); // Generated
        this.add(getJPanelpresentation(), null); // Generated
        this.add(getJPanelechocancel(), null); // Generated
        this.add(getJPanelechocancelwhenbridged(), null); // Generated
        this.add(getJPanelechotraining(), null); // Generated
        this.add(getJPanelsectionname(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
