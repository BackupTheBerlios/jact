package com.useit.jact.gui.voicemailconf;

import java.util.ResourceBundle;

/**
 * <p>
 * VoicemailgeneralDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 14:54:27 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailgeneralDataPanelImpl.java,v 1.5
 *          2005/12/29 19:14:06 urs Exp $
 */
public class VoicemailgeneralDataPanelImpl extends VoicemailgeneralDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public VoicemailgeneralDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getVoicemailgeneralResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getVoicemailgeneralResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/VoicemailgeneralResFile");
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
        this.setSize(400, (31) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(31); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPanelattach(), null); // Generated
        this.add(getJPaneldelete(), null); // Generated
        this.add(getJPanelmailcmd(), null); // Generated
        this.add(getJPanelmaxsilence(), null); // Generated
        this.add(getJPanelenvelope(), null); // Generated
        this.add(getJPanelexternnotify(), null); // Generated
        this.add(getJPanelsilencethreshold(), null); // Generated
        this.add(getJPanelserveremail(), null); // Generated
        this.add(getJPanelmaxmessage(), null); // Generated
        this.add(getJPanelminmessage(), null); // Generated
        this.add(getJPanelformat(), null); // Generated
        this.add(getJPanelmaxgreet(), null); // Generated
        this.add(getJPanelskipms(), null); // Generated
        this.add(getJPanelmaxlogins(), null); // Generated
        this.add(getJPanelcidinternalcontexts(), null); // Generated
        this.add(getJPanelreview(), null); // Generated
        this.add(getJPaneloperator(), null); // Generated
        this.add(getJPanelsaycid(), null); // Generated
        this.add(getJPaneldialout(), null); // Generated
        this.add(getJPanelcallback(), null); // Generated
        this.add(getJPaneldbuser(), null); // Generated
        this.add(getJPaneldbpass(), null); // Generated
        this.add(getJPaneldbhost(), null); // Generated
        this.add(getJPaneldbname(), null); // Generated
        this.add(getJPaneldboption(), null); // Generated
        this.add(getJPanelpbxskip(), null); // Generated
        this.add(getJPanelfromstring(), null); // Generated
        this.add(getJPanelemailsubject(), null); // Generated
        this.add(getJPanelemailbody(), null); // Generated
        this.add(getJPanelexitcontext(), null); // Generated
        this.add(getJPanelnextaftercmd(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
