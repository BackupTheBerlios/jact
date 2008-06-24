package com.useit.jact.gui.alarmreciverconf;

import java.util.ResourceBundle;

/**
 * <p>
 * AlarmreceiverconfDataPanelImpl, das wirkliche panel, kann überarbeitet und
 * angepasst werden.
 * </p>
 * Created : Tue Dec 27 16:22:46 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AlarmreceiverconfDataPanelImpl.java,v 1.2
 *          2005/12/29 19:14:23 urs Exp $
 */
public class AlarmreceiverconfDataPanelImpl extends AlarmreceiverconfDataPanel {

    /**
     * initalisiert die Resourcen alleine This is the default constructor
     */
    public AlarmreceiverconfDataPanelImpl() {
        super();
        // super(ApplicationConfig.getInstance().getConfigResManager().getAlarmreceiverconfResFile(),
        // ApplicationConfig.getInstance().getDefaultRes());
        // resBundel =
        // ApplicationConfig.getInstance().getConfigResManager().getAlarmreceiverconfResFile();
        // defaultresBundel = ApplicationConfig.getInstance().getDefaultRes();
        resBundel = ResourceBundle
                .getBundle("resourceBundels/AlarmreceiverconfResFile");
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
        this.setSize(400, (8) * 30);
        java.awt.GridLayout layGridLayout = new java.awt.GridLayout(); // Generated
        layGridLayout.setRows(8); // Generated
        this.setLayout(layGridLayout); // Generated
        this.add(getJPaneltimestampformat(), null); // Generated
        this.add(getJPaneleventcmd(), null); // Generated
        this.add(getJPaneleventspooldir(), null); // Generated
        this.add(getJPanellogindividualevents(), null); // Generated
        this.add(getJPanelfdtimeout(), null); // Generated
        this.add(getJPanelsdtimeout(), null); // Generated
        this.add(getJPanelloudness(), null); // Generated
        this.add(getJPaneldbfamily(), null); // Generated
    }

    // --------------------------------defaultActions.vm
    // --------------------------------createWidgets.vm

}
