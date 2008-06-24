package com.useit.jact.gui.musiconholdconf;

import java.util.ResourceBundle;

/**
 * <p>
 * MohClassesDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Tue Dec 27 14:54:52 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MohClassesDataPanelImpl.java,v 1.4 2005/12/29
 *          19:14:27 urs Exp $
 */
public class MohClassesDataPanelImpl extends MohClassesDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public MohClassesDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getMohClassesResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getMohClassesResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/MohClassesResFile");
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
        this.add(getJPanelname(), null); // Generated
        this.add(getJPanelplayer(), null); // Generated
        this.add(getJPanelmohdir(), null); // Generated
        this.add(getJPanelmohpara(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
