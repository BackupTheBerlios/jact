package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IaxgeneralDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Mon Dec 12 18:35:39 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxgeneralDataPanelImpl.java,v 1.2 2005/12/25
 *          18:09:58 urs Exp $
 */
public class IaxgeneralDataPanelImpl extends IaxgeneralDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxgeneralDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxgeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxgeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxgeneralResFile");
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
        this.setSize(400, (26) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(26); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelbindport(), null); // Generated
        this.add(getJPanelbindaddr(), null); // Generated
        this.add(getJPaneliaxcompat(), null); // Generated
        this.add(getJPanelnochecksums(), null); // Generated
        this.add(getJPaneldelayreject(), null); // Generated
        this.add(getJPanelamaflags(), null); // Generated
        this.add(getJPanelaccountcode(), null); // Generated
        this.add(getJPanellanguage(), null); // Generated
        this.add(getJPanelbandwidth(), null); // Generated
        this.add(getJPaneltrunktimestamps(), null); // Generated
        this.add(getJPanelauthdebug(), null); // Generated
        this.add(getJPaneltos(), null); // Generated
        this.add(getJPanelmailboxdetail(), null); // Generated
        this.add(getJPanelregcontext(), null); // Generated
        this.add(getJPanelautokill(), null); // Generated
        this.add(getJPanelcodecpriority(), null); // Generated
        this.add(getJPanelrtcachefriends(), null); // Generated
        this.add(getJPanelrtupdate(), null); // Generated
        this.add(getJPanelrtautoclear(), null); // Generated
        this.add(getJPanelrtignoreexpire(), null); // Generated
        this.add(getJPaneltrunkfreq(), null); // Generated
        this.add(getJPaneldisallow(), null); // Generated
        this.add(getJPanelallow(), null); // Generated
        this.add(getJPanelminregexpire(), null); // Generated
        this.add(getJPanelmaxregexpire(), null); // Generated
        this.add(getJPanelnotransfer(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
