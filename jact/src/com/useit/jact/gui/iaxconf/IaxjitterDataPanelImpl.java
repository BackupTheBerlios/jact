package com.useit.jact.gui.iaxconf;

import java.util.ResourceBundle;

/**
 * <p>
 * IaxjitterDataPanelImpl, das wirkliche panel, kann überarbeitet und angepasst
 * werden.
 * </p>
 * Created : Mon Dec 12 18:34:43 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxjitterDataPanelImpl.java,v 1.2 2005/12/25
 *          18:09:58 urs Exp $
 */
public class IaxjitterDataPanelImpl extends IaxjitterDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public IaxjitterDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getIaxjitterResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getIaxjitterResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/IaxjitterResFile");
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
        this.setSize(400, (9) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(9); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneljitterbuffer(), null); // Generated
        this.add(getJPanelforcejitterbuffer(), null); // Generated
        this.add(getJPaneldropcount(), null); // Generated
        this.add(getJPanelmaxjitterbuffer(), null); // Generated
        this.add(getJPanelresyncthreshold(), null); // Generated
        this.add(getJPanelmaxjitterinterps(), null); // Generated
        this.add(getJPanelmaxexcessbuffer(), null); // Generated
        this.add(getJPanelminexcessbuffer(), null); // Generated
        this.add(getJPaneljittershrinkrate(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
