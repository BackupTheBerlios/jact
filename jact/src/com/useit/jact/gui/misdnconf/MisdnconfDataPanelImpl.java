package com.useit.jact.gui.misdnconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MisdnconfDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:55:16 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnconfDataPanelImpl.java,v 1.6 2005/12/29
 *          19:14:19 urs Exp $
 */
public class MisdnconfDataPanelImpl extends MisdnconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MisdnconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMisdnconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMisdnconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MisdnconfResFile");
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
        this.setSize(400, (13) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(13); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneldebug(), null); // Generated
        this.add(getJPaneltracefile(), null); // Generated
        this.add(getJPaneltrace_calls(), null); // Generated
        this.add(getJPaneltrace_dir(), null); // Generated
        this.add(getJPanelbridging(), null); // Generated
        this.add(getJPanelstop_tone_after_first_digit(), null); // Generated
        this.add(getJPanelappend_digits2exten(), null); // Generated
        this.add(getJPanell1_info_ok(), null); // Generated
        this.add(getJPanelclear_l3(), null); // Generated
        this.add(getJPaneldynamic_crypt(), null); // Generated
        this.add(getJPanelcrypt_prefix(), null); // Generated
        this.add(getJPanelfileid(), null); // Generated
        this.add(getJPanelcontext(), null); // Generated
        // this.add(getJPanelmisdnSections(),null);
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
